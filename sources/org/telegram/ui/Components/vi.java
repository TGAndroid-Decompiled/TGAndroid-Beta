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
import org.telegram.ui.lj1;
public class vi extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a3, le.d {
    public static final int O2 = 0;
    public final ch.d A0;
    public final si A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.j C0;
    public final RadialProgressView C1;
    public final ah.i C2;
    public final xh D0;
    public boolean D1;
    public final fh.d D2;
    public final i0 E;
    public final ai E0;
    public final n6 E1;
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
    public final xh H0;
    public MessageObject H1;
    public final ah.c H2;
    public int I;
    public final fi I0;
    public boolean I1;
    public final jh I2;
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
    public final ci.n6 O0;
    public boolean O1;
    public boolean P;
    public final di P0;
    public boolean P1;
    public s40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public qt R0;
    public boolean R1;
    public final sd0 S;
    public boolean S0;
    public int S1;
    public vn T;
    public boolean T0;
    public boolean T1;
    public u40 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public fk X;
    public final w7 X0;
    public ValueAnimator X1;
    public dj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public ti Z1;
    public boolean f28725a0;
    public final org.telegram.ui.ActionBar.w0 f28726a1;
    public fn a2;
    public final le.b f28727b;
    public final ah.e f28728b0;
    public final ci.u f28729b1;
    public final int[] f28730b2;
    public final le.b f28731c;
    public boolean f28732c0;
    public final org.telegram.ui.ActionBar.w0 f28733c1;
    public int f28734c2;
    public final le.b d;
    public float f28735d0;
    public ci.f4 f28736d1;
    public float f28737d2;
    public final le.b e;
    public final ji f28738e0;
    public final org.telegram.ui.ActionBar.w0 f28739e1;
    public float f28740e2;
    public final le.b f28741f;
    public final org.telegram.ui.ActionBar.o2 f28742f0;
    public final bi.o f28743f1;
    public boolean f28744f2;
    public final boolean f28745g0;
    public float f28746g1;
    public float f28747g2;
    public final le.b h;
    public kf f28748h0;
    public float f28749h1;
    public final boolean f28750h2;
    public boolean f28751i0;
    public final xh f28752i1;
    public boolean f28753i2;
    public final ChatAttachAlertPhotoLayout f28754j0;
    public final TextView f28755j1;
    public final ArrayList f28756j2;
    public yj f28757k0;
    public final org.telegram.ui.ActionBar.w0 f28758k1;
    public final Rect f28759k2;
    public gj f28760l0;
    public final LinearLayout l1;
    public float f28761l2;
    public un m0;
    public final ImageView f28762m1;
    public boolean f28763m2;
    public final le.l f28764n;
    public un f28765n0;
    public final LinearLayout f28766n1;
    public int f28767n2;
    public gl f28768o0;
    public final TextView f28769o1;
    public final ji f28770o2;
    public ok f28771p0;
    public float f28772p1;
    public o1.k f28773p2;
    public qm f28774q0;
    public boolean f28775q1;
    public AnimatorSet f28776q2;
    public org.telegram.ui.zn f28777r;
    public jj f28778r0;
    public final li f28779r1;
    public boolean f28780r2;
    public final n6 f28781s;
    public hg.i0 f28782s0;
    public boolean f28783s1;
    public boolean f28784s2;
    public pk f28785t0;
    public Object f28786t1;
    public bl f28787t2;
    public pk f28788u0;
    public boolean f28789u1;
    public boolean f28790u2;
    public final n6 v;
    public ii.r f28791v0;
    public final jh.f f28792v1;
    public boolean f28793v2;
    public final ImageView f28794w;
    public final ni[] f28795w0;
    public final zh f28796w1;
    public File f28797w2;
    public final i0 f28798x;
    public final LongSparseArray f28799x0;
    public final xh f28800x1;
    public double[] f28801x2;
    public final ImageView f28802y;
    public ni f28803y0;
    public final yh f28804y1;
    public boolean f28805y2;
    public ni f28806z0;
    public final s4.c0 f28807z1;
    public boolean f28808z2;

    public vi(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        TextPaint textPaint;
        le.l lVar;
        float f7;
        bi.o oVar;
        qr qrVar = qr.h;
        this.f28727b = new le.b(0, this, qrVar, 380L, false);
        this.f28731c = new le.b(1, this, qrVar, 380L, false);
        this.d = new le.b(2, this, qrVar, 380L, false);
        this.e = new le.b(3, this, qrVar, 380L, false);
        this.f28741f = new le.b(4, this, qrVar, 380L, true);
        this.h = new le.b(5, this, qrVar, 320L, false);
        le.l lVar2 = new le.l(new ch(this, 1), qrVar, 380L);
        this.f28764n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f28735d0 = 0.0f;
        this.f28738e0 = new ji(this, 0);
        this.f28751i0 = false;
        ni[] niVarArr = new ni[11];
        this.f28795w0 = niVarArr;
        this.f28799x0 = new LongSparseArray();
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
        this.f28730b2 = new int[2];
        new Paint(1);
        this.f28753i2 = false;
        ArrayList arrayList = new ArrayList();
        this.f28756j2 = arrayList;
        Rect rect = new Rect();
        this.f28759k2 = rect;
        this.f28770o2 = new ji(this, 1);
        this.f28780r2 = true;
        this.f28784s2 = false;
        this.f28808z2 = false;
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
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C2 = new ah.i(false);
            fh.d dVar = new fh.d(null);
            this.E2 = dVar;
            dVar.j(new org.telegram.ui.Cells.ia(this, 1));
            fh.d dVar2 = new fh.d(null);
            this.D2 = dVar2;
            dVar2.j(new ka.c(this, 7));
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
        this.I2 = new jh(this, 0);
        this.f28750h2 = z10;
        this.f28745g0 = (o2Var instanceof org.telegram.ui.bo) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f28742f0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        li liVar = new li(this, context);
        this.f28779r1 = liVar;
        liVar.setDelegate(new mi(this));
        this.containerView = liVar;
        liVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        w7 w7Var = new w7(this, context, f6Var, 1);
        this.X0 = w7Var;
        w7Var.T0 = true;
        w7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        w7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i12 = org.telegram.ui.ActionBar.j6.f18969j5;
        w7Var.B(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.j6.I5;
        w7Var.A(getThemedColor(i13), false);
        w7Var.setTitleColor(getThemedColor(i12));
        w7Var.setOccupyStatusBar(true);
        w7Var.setAlpha(0.0f);
        w7Var.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 8));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
        this.f28726a1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new ch(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
        this.f28733c1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f28729b1 = uVar;
        w0Var3.setIcon(uVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        bi.o oVar2 = new bi.o(this, context);
        oVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        oVar2.setText(LocaleController.getString(R.string.Create));
        oVar2.setTypeface(AndroidUtilities.bold());
        oVar2.setTextSize(1, 14.0f);
        oVar2.setVisibility(4);
        oVar2.setAlpha(0.0f);
        oVar2.setGravity(17);
        oVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        oVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        oVar2.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        w7.z5.a(oVar2);
        this.f28743f1 = oVar2;
        W1();
        if (o2Var != null) {
            textPaint = textPaint2;
            lVar = lVar2;
            w0Var = w0Var3;
            oVar = oVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
            this.f28739e1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 6, -1));
            w0Var4.setOnClickListener(new ai.j3(5, this, z11));
        } else {
            w0Var = w0Var3;
            textPaint = textPaint2;
            lVar = lVar2;
            f7 = 14.0f;
            oVar = oVar2;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
        this.f28758k1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 3, -1));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final vi f24668b;

            {
                this.f24668b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.bo boVar;
                switch (r3) {
                    case 0:
                        final vi viVar = this.f24668b;
                        ai aiVar = viVar.E0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), f6Var);
                            e0Var.m0(aiVar.getText());
                            e0Var.f23424j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar = viVar.P0;
                                            diVar.setText(charSequence);
                                            diVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = viVar.Z;
                            if (viVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            lh lhVar = new lh(viVar, 0);
                            e0Var.f23426l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23427n0 = lhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final vi viVar2 = this.f24668b;
                        di diVar = viVar2.P0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), f6Var);
                            e0Var2.m0(diVar.getText());
                            e0Var2.f23424j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar2.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar2.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = viVar2.Z;
                            if (viVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            lh lhVar2 = new lh(viVar2, 1);
                            e0Var2.f23426l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23427n0 = lhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        vi viVar3 = this.f24668b;
                        viVar3.f28758k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = viVar3.f28742f0;
                        t12.K2(null, o2Var2, f6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i14 = viVar3.S1;
                        boolean z15 = viVar3.T1;
                        t13.h = i14;
                        t13.f31026n = z15;
                        if (!viVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w10 = ci.o8.w(viVar3.J1, "webp");
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
                        wh whVar = new wh(viVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.bo) {
                            boVar = (org.telegram.ui.bo) o2Var2;
                        } else {
                            boVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, whVar, boVar);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        xh xhVar = new xh(this, context, 0);
        this.f28752i1 = xhVar;
        xhVar.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        xhVar.setAlpha(0.0f);
        xhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f28755j1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f28762m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        xhVar.addView(linearLayout, w7.x5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f28766n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f28769o1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.x5.q(-2, -2, 16));
        xhVar.addView(linearLayout2, w7.x5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, f6Var);
        this.f28754j0 = chatAttachAlertPhotoLayout;
        niVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f28803y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.x5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f28792v1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.x5.g());
        this.containerView.addView(xhVar, w7.x5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.n6 n6Var = new ci.n6(context, 8);
        this.O0 = n6Var;
        this.containerView.addView(n6Var, w7.x5.e(-1, -2, 55));
        this.containerView.addView(w7Var, w7.x5.c(-2.0f, -1));
        this.containerView.addView(w0Var2, w7.x5.e(48, 48, 53));
        this.containerView.addView(w0Var, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f28739e1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, w7.x5.e(48, 48, 53));
        }
        xhVar.addView(w0Var5, w7.x5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.x5.e(-2, 48, 53));
        xh xhVar2 = new xh(this, context, 1);
        this.f28800x1 = xhVar2;
        yh yhVar = new yh(context, 0);
        this.f28804y1 = yhVar;
        yhVar.setClipChildren(true);
        yhVar.setClipToPadding(false);
        si siVar = new si(this, context);
        this.A1 = siVar;
        yhVar.setAdapter(siVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f28807z1 = c0Var;
        yhVar.setLayoutManager(c0Var);
        yhVar.setVerticalScrollBarEnabled(false);
        yhVar.setHorizontalScrollBarEnabled(false);
        yhVar.setItemAnimator(null);
        yhVar.setLayoutAnimation(null);
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        yhVar.f26211z2 = true;
        yhVar.setOverScrollMode(2);
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
        zh zhVar = new zh(this, context, 0);
        this.f28796w1 = zhVar;
        ah.e eVar = new ah.e(cVar4.c(zhVar, null, false));
        this.f28728b0 = eVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        eVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(zhVar, w7.x5.g());
        ch.d c10 = this.G2.c(xhVar2, eh.b.f(f6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        xhVar2.setBackground(c10);
        yhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        yhVar.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f46861a;
        yhVar.setOutlineProvider(new yf.h0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        yhVar.setImportantForAccessibility(1);
        xhVar2.addView(yhVar, w7.x5.g());
        this.containerView.addView(xhVar2, w7.x5.e(-1, 70, 81));
        yhVar.setOnItemClickListener(new ai.o6(9, this, f6Var));
        yhVar.setOnItemLongClickListener(new ch(this, 3));
        n6 n6Var2 = new n6(context, true, false, true);
        this.E1 = n6Var2;
        n6Var2.setVisibility(8);
        n6Var2.setAlpha(0.0f);
        n6Var2.setGravity(17);
        n6Var2.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        n6Var2.setPadding(dp, 0, dp, 0);
        n6Var2.setTextSize(AndroidUtilities.dp(f7));
        n6Var2.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        this.containerView.addView(n6Var2, w7.x5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.x5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.F0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f19263z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        xh xhVar3 = new xh(this, context, 2);
        this.D0 = xhVar3;
        hg.j jVar = new hg.j(this, context);
        this.C0 = jVar;
        xhVar3.addView(jVar, w7.x5.e(-1, -1, 119));
        ch.d c11 = this.H2.c(liVar, eh.b.o(f6Var), false);
        this.A0 = c11;
        c11.f4291m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f4288j.f4274g = 0.4f;
        c11.k();
        ch.d c12 = this.G2.c(jVar, eh.b.o(f6Var), false);
        this.B0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        xhVar3.setWillNotDraw(false);
        xhVar3.setVisibility(4);
        xhVar3.setAlpha(0.0f);
        this.containerView.addView(xhVar3, w7.x5.e(-1, -2, 83));
        xhVar3.setOnTouchListener(new bi.d(13));
        n6 n6Var3 = new n6(context, false, false, false);
        this.f28781s = n6Var3;
        n6Var3.setAllowCancel(true);
        n6Var3.setScaleProperty(0.6f);
        n6Var3.setVisibility(8);
        n6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        int i14 = org.telegram.ui.ActionBar.j6.f19244y6;
        n6Var3.setTextColor(getThemedColor(i14));
        n6Var3.setTypeface(AndroidUtilities.bold());
        n6Var3.setGravity(17);
        jVar.addView(n6Var3, w7.x5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f28794w = imageView4;
        i0 i0Var = new i0(context);
        this.f28798x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.j6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        int i16 = org.telegram.ui.ActionBar.j6.f18952i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        jVar.addView(imageView4, w7.x5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24668b;

            {
                this.f24668b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.bo boVar;
                switch (r3) {
                    case 0:
                        final vi viVar = this.f24668b;
                        ai aiVar = viVar.E0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), f6Var);
                            e0Var.m0(aiVar.getText());
                            e0Var.f23424j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = viVar.Z;
                            if (viVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            lh lhVar = new lh(viVar, 0);
                            e0Var.f23426l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23427n0 = lhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final vi viVar2 = this.f24668b;
                        di diVar = viVar2.P0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), f6Var);
                            e0Var2.m0(diVar.getText());
                            e0Var2.f23424j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar2.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar2.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = viVar2.Z;
                            if (viVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            lh lhVar2 = new lh(viVar2, 1);
                            e0Var2.f23426l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23427n0 = lhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        vi viVar3 = this.f24668b;
                        viVar3.f28758k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = viVar3.f28742f0;
                        t12.K2(null, o2Var2, f6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = viVar3.S1;
                        boolean z15 = viVar3.T1;
                        t13.h = i142;
                        t13.f31026n = z15;
                        if (!viVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w10 = ci.o8.w(viVar3.J1, "webp");
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
                        wh whVar = new wh(viVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.bo) {
                            boVar = (org.telegram.ui.bo) o2Var2;
                        } else {
                            boVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, whVar, boVar);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
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
        ai aiVar = new ai(this, context, liVar, f6Var);
        this.E0 = aiVar;
        aiVar.J = true;
        aiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        aiVar.s();
        aiVar.getEditText().setLayoutParams(w7.x5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        aiVar.getEditText().addTextChangedListener(new ci(this));
        jVar.addView(aiVar, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        xhVar3.setClipChildren(false);
        aiVar.setClipChildren(false);
        n6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        n6Var.setWillNotDraw(false);
        di diVar = new di(this, context, liVar, f6Var);
        this.P0 = diVar;
        diVar.J = true;
        diVar.getEditText().addTextChangedListener(new ei(this, o2Var));
        diVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        diVar.getEditText().setLayoutParams(w7.x5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        diVar.getEditText().setTextSize(1, 17.0f);
        diVar.getEmojiButton().setLayoutParams(w7.x5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        n6Var.addView(diVar, w7.x5.e(-1, -2, 119));
        n6Var.setAlpha(0.0f);
        n6Var.setVisibility(8);
        aiVar.addView(imageView3, w7.x5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ch.d c13 = this.G2.c(n6Var, eh.b.o(f6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        n6Var.setBackground(c13);
        n6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        n6 n6Var4 = new n6(context, false, false, false);
        this.v = n6Var4;
        n6Var4.setScaleProperty(0.6f);
        n6Var4.setVisibility(8);
        n6Var4.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var4.setTextColor(getThemedColor(i14));
        n6Var4.setTypeface(AndroidUtilities.bold());
        n6Var4.setGravity(17);
        n6Var4.setAllowCancel(true);
        n6Var.addView(n6Var4, w7.x5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Xd), mode2));
        diVar.addView(imageView5, w7.x5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f28802y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        n6Var.addView(imageView6, w7.x5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24668b;

            {
                this.f24668b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.bo boVar;
                switch (r3) {
                    case 0:
                        final vi viVar = this.f24668b;
                        ai aiVar2 = viVar.E0;
                        if (aiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), f6Var);
                            e0Var.m0(aiVar2.getText());
                            e0Var.f23424j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar22 = viVar.E0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = viVar.Z;
                            if (viVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            lh lhVar = new lh(viVar, 0);
                            e0Var.f23426l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23427n0 = lhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final vi viVar2 = this.f24668b;
                        di diVar2 = viVar2.P0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), f6Var);
                            e0Var2.m0(diVar2.getText());
                            e0Var2.f23424j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar22 = viVar2.E0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar22 = viVar2.P0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = viVar2.Z;
                            if (viVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            lh lhVar2 = new lh(viVar2, 1);
                            e0Var2.f23426l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23427n0 = lhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        vi viVar3 = this.f24668b;
                        viVar3.f28758k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = viVar3.f28742f0;
                        t12.K2(null, o2Var2, f6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = viVar3.S1;
                        boolean z15 = viVar3.T1;
                        t13.h = i142;
                        t13.f31026n = z15;
                        if (!viVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w10 = ci.o8.w(viVar3.J1, "webp");
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
                        wh whVar = new wh(viVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.bo) {
                            boVar = (org.telegram.ui.bo) o2Var2;
                        } else {
                            boVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, whVar, boVar);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
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
        xh xhVar4 = new xh(this, context, 3);
        this.H0 = xhVar4;
        xhVar4.setFocusable(true);
        xhVar4.setFocusableInTouchMode(true);
        xhVar4.setVisibility(4);
        xhVar4.setScaleX(0.2f);
        xhVar4.setScaleY(0.2f);
        xhVar4.setAlpha(0.0f);
        xhVar4.setClipChildren(false);
        xhVar4.setClipToPadding(false);
        this.containerView.addView(xhVar4, w7.x5.e(110, 50, 85));
        fi fiVar = new fi(R.drawable.send_plane_24, context, f6Var, this);
        this.I0 = fiVar;
        fiVar.setImportantForAccessibility(2);
        xhVar4.addView(fiVar, w7.x5.e(-1, -1, 119));
        fiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        fiVar.I = dp2;
        fiVar.J = dp3;
        fiVar.M = AndroidUtilities.dp(7.0f);
        fiVar.N = AndroidUtilities.dp(6.0f);
        fiVar.f28086h0 = true;
        fiVar.setOnClickListener(new View.OnClickListener(this) {
            public final vi f24215b;

            {
                this.f24215b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f24215b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.f28799x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f24215b;
                        boolean z14 = viVar2.f28732c0;
                        if (!z14) {
                            viVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f24215b;
                        boolean z15 = viVar3.f28732c0;
                        if (z15) {
                            viVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24215b.z1();
                        return;
                    case 4:
                        this.f24215b.f28726a1.M(null, null);
                        return;
                    case 5:
                        vi.s(this.f24215b);
                        return;
                    case 6:
                        ni niVar = this.f24215b.f28803y0;
                        if (niVar != null) {
                            niVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24215b.f28758k1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f24215b;
                        if (viVar4.f28803y0 != viVar4.f28774q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.Z1(z13);
                        return;
                }
            }
        });
        fiVar.setOnLongClickListener(new org.telegram.ui.ig(this, context, f6Var, o2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        zh zhVar2 = new zh(this, context, 1);
        zhVar2.setAlpha(0.0f);
        zhVar2.setScaleX(0.2f);
        zhVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        tk0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.G2;
        dh.e o9 = eh.b.o(f6Var);
        ml0 ml0Var = fastScroll.f28140o0;
        ch.d c14 = cVar7.c(ml0Var.f26171f1, o9, false);
        fastScroll.f28129e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f28129e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(ml0Var.f26171f1, o9, false);
        fastScroll.f28131f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f28131f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f28131f0.q(AndroidUtilities.dp(f7));
        sd0 sd0Var = new sd0(context);
        this.S = sd0Var;
        this.containerView.addView(sd0Var, w7.x5.c(-1.0f, -1));
        dh.e eVar2 = new dh.e(f6Var);
        eVar2.e = new ch(this, 4);
        eVar2.f7741c = new ch(this, 5);
        eVar2.d = new ch(this, 6);
        eVar2.f7740b = new ch(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f7743n = dpf2;
        eVar2.f7744r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f7742f = dpf23;
        eVar2.h = dpf24;
        w7Var.M(this.G2, eVar2, false);
        lVar.i(1L, false);
    }

    public static void M(vi viVar) {
        boolean q6;
        int i10;
        int i11;
        w7 w7Var = viVar.X0;
        jh.f fVar = viVar.f28792v1;
        if (fVar != null && w7Var != null) {
            org.telegram.ui.ActionBar.f6 f6Var = viVar.resourcesProvider;
            if (f6Var != null) {
                q6 = f6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (w7Var.getVisibility() == 0) {
                if (q6) {
                    i11 = 255;
                } else {
                    i11 = 160;
                }
                i10 = (int) (w7Var.getAlpha() * i11);
            } else {
                i10 = 0;
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void Q(vi viVar) {
        ci.i iVar = new ci.i(viVar, viVar.getContext(), viVar.Z, LaunchActivity.R(), viVar.resourcesProvider, 1);
        viVar.B2 = iVar;
        iVar.p(new k2.c0(viVar, 12));
        ViewGroup viewGroup = viVar.containerView;
        viewGroup.addView(viVar.B2, viewGroup.indexOfChild(viVar.D0), w7.x5.e(-1, -1, 83));
        ci.i iVar2 = viVar.B2;
        iVar2.getAdapter().f9817c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.o2 o2Var = viVar.f28742f0;
        boolean z10 = true;
        if (o2Var instanceof org.telegram.ui.bo) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var;
            gg.k1 adapter = iVar2.getAdapter();
            boVar.i();
            TLRPC.Chat chat = boVar.e;
            adapter.getClass();
            adapter.f9828l0 = chat;
            iVar2.getAdapter().W(boVar.Z7);
            gg.k1 adapter2 = iVar2.getAdapter();
            if (boVar.e == null) {
                z10 = false;
            }
            adapter2.f9820e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f9820e0 = false;
        }
        iVar2.getAdapter().f9822f0 = false;
        viVar.U1();
    }

    public static void m(vi viVar, ValueAnimator valueAnimator) {
        viVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.e3 e3Var = viVar.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public static void n(vi viVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.a3 a3Var) {
        viVar.currentSheetAnimation = null;
        viVar.f28773p2 = null;
        animationNotificationsLocker.unlock();
        viVar.currentSheetAnimationType = 0;
        if (a3Var != null) {
            a3Var.onOpenAnimationEnd();
        }
        if (viVar.useHardwareLayer) {
            viVar.container.setLayerType(0, null);
        }
        if (viVar.isFullscreen) {
            WindowManager.LayoutParams attributes = viVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            viVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(vi viVar, int i10) {
        viVar.navBarColorKey = -1;
        viVar.navBarColor = i10;
        viVar.containerView.invalidate();
    }

    public static void p(vi viVar) {
        o1.k kVar = viVar.f28773p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(viVar.containerView, o1.h.f15344n, 0.0f);
        viVar.f28773p2 = kVar2;
        kVar2.f15361u.a(1.5f);
        viVar.f28773p2.f15361u.b(1500.0f);
        viVar.f28773p2.f();
    }

    public static boolean q(org.telegram.ui.Components.vi r46, android.content.Context r47, org.telegram.ui.ActionBar.f6 r48, org.telegram.ui.ActionBar.o2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.q(org.telegram.ui.Components.vi, android.content.Context, org.telegram.ui.ActionBar.f6, org.telegram.ui.ActionBar.o2, android.view.View):boolean");
    }

    public static void r(vi viVar, org.telegram.ui.ActionBar.q qVar) {
        AnimatorSet animatorSet = viVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            qVar.run();
        }
    }

    public static void s(vi viVar) {
        int i10;
        if (viVar.f28754j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28754j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f21910s1;
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
        viVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = viVar.f28733c1;
        ci.f4 f4Var = viVar.f28736d1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        ci.f4 f4Var2 = new ci.f4(viVar.getContext(), 1);
        viVar.f28736d1 = f4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        f4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        viVar.f28736d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        viVar.f28736d1.m(1.0f, -((viVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        viVar.f28736d1.setTranslationY(viVar.f28726a1.getTranslationY());
        ci.f4 f4Var3 = viVar.f28736d1;
        f4Var3.f4638l0 = new oh(0, viVar, f4Var2);
        viVar.containerView.addView(f4Var3, w7.x5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        viVar.f28736d1.u();
    }

    public static void t(vi viVar, boolean z10, fh fhVar) {
        Integer num;
        viVar.f28803y0.s(1.0f);
        viVar.f28806z0.s(1.0f);
        viVar.f28803y0.k(viVar.f28761l2);
        viVar.f28806z0.k(viVar.f28761l2);
        viVar.containerView.invalidate();
        w7 w7Var = viVar.X0;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        w7Var.setTag(num);
        fhVar.run();
    }

    public static void u(vi viVar, ci.f4 f4Var) {
        viVar.containerView.removeView(f4Var);
    }

    public static void v(vi viVar, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        vi viVar2 = viVar;
        yh yhVar = viVar2.f28804y1;
        ni[] niVarArr = viVar2.f28795w0;
        org.telegram.ui.ActionBar.o2 o2Var2 = viVar2.f28742f0;
        if (o2Var2 == null) {
            o2Var = LaunchActivity.R();
        } else {
            o2Var = o2Var2;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (view instanceof pi) {
                Activity parentActivity = o2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (viVar2.L1 || viVar2.M1 || !viVar2.a1()) {
                        if (!viVar2.L1 && !viVar2.M1) {
                            vn vnVar = new vn(1, viVar2.getContext(), f6Var, viVar2);
                            viVar2.T = vnVar;
                            viVar2.Q1(vnVar);
                        }
                        viVar2.Q1(viVar2.f28754j0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (viVar2.N1 || !viVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(viVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        viVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (viVar2.K1 || !viVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(viVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        viVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (viVar2.Q1 || !viVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && viVar2.Q1 && viVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(viVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        viVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((viVar2.Q1 || !viVar2.a1()) && AndroidUtilities.isMapsInstalled(o2Var2)) {
                        if (!viVar2.Q1) {
                            vn vnVar2 = new vn(6, viVar2.getContext(), f6Var, viVar2);
                            viVar2.T = vnVar2;
                            viVar2.Q1(vnVar2);
                        } else {
                            if (viVar2.f28768o0 == null) {
                                gl glVar = new gl(viVar2, viVar2.getContext(), f6Var, (viVar2.H || viVar2.R1) ? false : false);
                                viVar2.f28768o0 = glVar;
                                niVarArr[5] = glVar;
                                bl blVar = viVar2.f28787t2;
                                if (blVar != null) {
                                    glVar.setDelegate(blVar);
                                } else {
                                    glVar.setDelegate(new ch(viVar2, 9));
                                }
                            }
                            viVar2.Q1(viVar2.f28768o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (viVar2.O1 || !viVar2.a1()) {
                        if (!viVar2.O1) {
                            vn vnVar3 = new vn(9, viVar2.getContext(), f6Var, viVar2);
                            viVar2.T = vnVar3;
                            viVar2.Q1(vnVar3);
                        } else {
                            viVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (viVar2.f28782s0 == null) {
                        hg.i0 i0Var = new hg.i0(viVar2.getContext(), viVar2.resourcesProvider, viVar2);
                        viVar2.f28782s0 = i0Var;
                        niVarArr[7] = i0Var;
                        i0Var.setupBlurredSearchField(viVar2.G2);
                    }
                    viVar2.Q1(viVar2.f28782s0);
                } else if (i10 == 12) {
                    if (viVar2.P1 || !viVar2.a1()) {
                        if (!viVar2.P1) {
                            vn vnVar4 = new vn(9, viVar2.getContext(), f6Var, viVar2);
                            viVar2.T = vnVar4;
                            viVar2.Q1(vnVar4);
                        } else {
                            if (viVar2.f28765n0 == null) {
                                un unVar = new un(viVar, viVar.getContext(), true, f6Var, null);
                                viVar2 = viVar;
                                viVar2.f28765n0 = unVar;
                                niVarArr[1] = unVar;
                                unVar.setDelegate(new ch(viVar2, 10));
                            }
                            viVar2.Q1(viVar2.f28765n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (viVar2.f28788u0 == null) {
                        pk pkVar = new pk(viVar2, viVar2.getContext(), f6Var, true);
                        viVar2.f28788u0 = pkVar;
                        niVarArr[8] = pkVar;
                        pkVar.setDelegate(viVar2.a2);
                    }
                    viVar2.Q1(viVar2.f28788u0);
                } else if (i10 == 14) {
                    if (viVar2.f28785t0 == null) {
                        pk pkVar2 = new pk(viVar2, viVar2.getContext(), f6Var, false);
                        viVar2.f28785t0 = pkVar2;
                        niVarArr[9] = pkVar2;
                        pkVar2.setDelegate(viVar2.a2);
                    }
                    viVar2.Q1(viVar2.f28785t0);
                } else if (i10 == 16) {
                    if (viVar2.f28791v0 == null) {
                        ii.r rVar = new ii.r(viVar2.J1, viVar2.getContext(), f6Var, viVar2);
                        viVar2.f28791v0 = rVar;
                        niVarArr[10] = rVar;
                    }
                    viVar2.Q1(viVar2.f28791v0);
                } else if (view.getTag() instanceof Integer) {
                    viVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, viVar2.s1(), false, 0L);
                }
            } else if (view instanceof oi) {
                oi oiVar = (oi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = oiVar.f26738c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        lj1.a(viVar2.getContext(), new ai.g3(7, viVar2, oiVar), null);
                    } else {
                        viVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    viVar2.Z1.j1(oiVar.f26737b);
                    viVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                yhVar.w0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > yhVar.getMeasuredWidth()) {
                yhVar.w0(i14 - yhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(vi viVar) {
        ni niVar;
        qm qmVar;
        viVar.f28786t1 = null;
        ni niVar2 = viVar.f28803y0;
        if (niVar2 != viVar.f28754j0 && (niVar = viVar.f28806z0) != (qmVar = viVar.f28774q0) && niVar2 != niVar && niVar2 != qmVar) {
            viVar.containerView.removeView(niVar2);
        }
        viVar.f28803y0.setVisibility(8);
        viVar.f28803y0.q();
        viVar.f28806z0.F();
        viVar.f28803y0 = viVar.f28806z0;
        viVar.f28806z0 = null;
        int[] iArr = viVar.f28730b2;
        iArr[0] = iArr[1];
        viVar.H1(viVar.f28732c0, false);
        viVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (i10 == 3) {
            if (this.N1 || !a1()) {
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
            if (this.f28768o0 == null) {
                gl glVar = new gl(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : false);
                this.f28768o0 = glVar;
                this.f28795w0[5] = glVar;
                bl blVar = this.f28787t2;
                if (blVar != null) {
                    glVar.setDelegate(blVar);
                } else if (o2Var instanceof org.telegram.ui.bo) {
                    glVar.setDelegate(new ch(this, 16));
                }
            }
            Q1(this.f28768o0);
        }
    }

    public final void B1(boolean z10) {
        if (!this.N1 && z10) {
            vn vnVar = new vn(3, getContext(), this.resourcesProvider, this);
            this.T = vnVar;
            Q1(vnVar);
        }
        int i10 = 1;
        if (this.f28760l0 == null) {
            gj gjVar = new gj(getContext(), this.resourcesProvider, this);
            this.f28760l0 = gjVar;
            this.f28795w0[3] = gjVar;
            gjVar.setupBlurredSearchField(this.G2);
            this.f28760l0.setDelegate(new ch(this, 13));
            if (this.H) {
                this.f28760l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            TLRPC.Chat chat = ((org.telegram.ui.bo) o2Var).e;
            gj gjVar2 = this.f28760l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            gjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.f28760l0);
        }
    }

    public final void C1() {
        if (this.f28778r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            ?? niVar = new ni(context, f6Var, this);
            niVar.f25304r = AndroidUtilities.dp(80.0f);
            niVar.f25306w = 3;
            ai.w0 w0Var = new ai.w0(niVar, context, f6Var, 11);
            niVar.f25303n = w0Var;
            xa xaVar = new xa(niVar, context);
            niVar.v = xaVar;
            w0Var.setAdapter(xaVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, niVar.f26459a));
            niVar.addView(w0Var, w7.x5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(niVar, 18));
            bi.l lVar = new bi.l(niVar, niVar.f25304r, 1);
            niVar.f25305s = lVar;
            lVar.O = new ci.x1(niVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f28778r0 = niVar;
            niVar.setDelegate(new eb(this, 1));
        }
        Q1(this.f28778r0);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        ni niVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            un unVar = this.m0;
            if (unVar != null && ((niVar = this.f28806z0) == unVar || this.f28803y0 == unVar)) {
                if (niVar == unVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            un unVar2 = this.f28765n0;
            if (unVar2 != null) {
                ni niVar2 = this.f28806z0;
                if (niVar2 == unVar2 || this.f28803y0 == unVar2) {
                    if (niVar2 != unVar2) {
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
            fi fiVar = this.I0;
            if (fiVar != null) {
                fiVar.setEphemeralFactor(f7);
                fiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void D1() {
        boolean z10;
        if (!this.Q1) {
            vn vnVar = new vn(5, getContext(), this.resourcesProvider, this);
            this.T = vnVar;
            Q1(vnVar);
        }
        if (this.f28757k0 == null) {
            yj yjVar = new yj(getContext(), this.resourcesProvider, this);
            this.f28757k0 = yjVar;
            this.f28795w0[2] = yjVar;
            yjVar.setupBlurredSearchField(this.G2);
            this.f28757k0.setDelegate(new hi(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            TLRPC.Chat chat = ((org.telegram.ui.bo) o2Var).e;
            yj yjVar2 = this.f28757k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            yjVar2.setMultipleSelectionAllowed(z10);
        }
        Q1(this.f28757k0);
    }

    public final void E1(boolean z10) {
        int i10;
        if (!this.K1 && z10) {
            vn vnVar = new vn(4, getContext(), this.resourcesProvider, this);
            this.T = vnVar;
            Q1(vnVar);
        }
        boolean z11 = false;
        if (this.f28771p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            ok okVar = new ok(i10, getContext(), this.resourcesProvider, this);
            this.f28771p0 = okVar;
            this.f28795w0[4] = okVar;
            okVar.setDelegate(new ii(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f28771p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
            if (o2Var instanceof org.telegram.ui.bo) {
                TLRPC.Chat chat = ((org.telegram.ui.bo) o2Var).e;
                ok okVar2 = this.f28771p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i11 = -1;
                }
                okVar2.setMaxSelectedFiles(i11);
            } else {
                this.f28771p0.setMaxSelectedFiles(this.S1);
                ok okVar3 = this.f28771p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                okVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        ok okVar4 = this.f28771p0;
        okVar4.f26759d0 = this.N;
        if (z10) {
            Q1(okVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        w7 w7Var = this.X0;
        int i10 = 1;
        if (w7Var.f19304n0) {
            w7Var.h(true);
        }
        this.f28757k0 = null;
        this.f28782s0 = null;
        this.f28760l0 = null;
        this.m0 = null;
        this.f28765n0 = null;
        this.f28768o0 = null;
        this.f28771p0 = null;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i10 < niVarArr.length) {
                ni niVar = niVarArr[i10];
                if (niVar != null) {
                    niVar.m();
                    this.containerView.removeView(niVarArr[i10]);
                    niVarArr[i10] = null;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var;
            TLRPC.Chat chat = boVar.e;
            if (boVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.J1).edit();
                edit.putBoolean("silent_" + boVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f13985f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        ni niVar = this.f28803y0;
        if (niVar != null) {
            i12 = niVar.getSelectedItemsCount();
        }
        return c5.b0(this.J1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                vi viVar = vi.this;
                viVar.I1 = true;
                viVar.Z1.B1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
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
        this.f28727b.a(z10, z11);
        ju m12 = m1();
        this.f28732c0 = z10;
        ju m13 = m1();
        int i11 = 0;
        if (this.D0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ni niVar = this.f28803y0;
        if (niVar != this.f28754j0 && niVar != this.f28774q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f28732c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        ci.n6 n6Var = this.O0;
        hg.j jVar = this.C0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            n6Var.setVisibility(i12);
            ViewPropertyAnimator animate = n6Var.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).setUpdateListener(new dh(this, 0)).withEndAction(new Runnable(this) {
                public final vi f23553b;

                {
                    this.f23553b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            vi viVar = this.f23553b;
                            if (!z14 || !z12) {
                                viVar.O0.setVisibility(8);
                            }
                            viVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f23553b.C0.setVisibility(8);
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
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(qrVar).setUpdateListener(new dh(this, 1)).withEndAction(new Runnable(this) {
                public final vi f23553b;

                {
                    this.f23553b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            vi viVar = this.f23553b;
                            if (!z14 || !z12) {
                                viVar.O0.setVisibility(8);
                            }
                            viVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f23553b.C0.setVisibility(8);
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
            n6Var.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            n6Var.setAlpha(f7);
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
            m13.setText(x5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new fh(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f28754j0) != null) {
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
        this.f28800x1.setVisibility(8);
        this.f28755j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
        if (chatAttachAlertPhotoLayout != null) {
            vi viVar = chatAttachAlertPhotoLayout.f26460b;
            chatAttachAlertPhotoLayout.f21926g1 = (viVar.Q0 == 0 || viVar.F) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.M1(boolean):void");
    }

    public final void N1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.bo) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.bo) o2Var).e)) {
            new vc(this.f28779r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new oh(1, this, o2Var)).j();
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
        ni niVar;
        float f17;
        float dp;
        long sendPaidMessagesStars;
        float f18;
        float f19;
        w7 w7Var;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        this.f28731c.a(z10, true);
        xh xhVar = this.D0;
        if (xhVar.getTag() != null) {
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
        xhVar.setTag(num);
        ai aiVar = this.E0;
        if (aiVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        aiVar.k(true);
        this.P0.k(true);
        xh xhVar2 = this.f28800x1;
        xh xhVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                xhVar.setVisibility(0);
            }
            xhVar3.setVisibility(0);
        } else if (this.S0) {
            xhVar2.setVisibility(0);
        }
        ni niVar2 = this.f28803y0;
        if ((niVar2 == this.f28754j0 || niVar2 == this.f28774q0) && this.f28732c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        w7 w7Var2 = this.X0;
        ci.n6 n6Var = this.O0;
        hg.j jVar = this.C0;
        fi fiVar = this.I0;
        float f26 = 0.2f;
        float f27 = 1.0f;
        if (z11) {
            float f28 = 0.0f;
            this.M0 = new AnimatorSet();
            if (z13) {
                n6Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar, property, f18));
            if (z10 && !z13) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f19));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                w7Var = w7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                w7Var = w7Var2;
            }
            if (z10 && z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(n6Var, property, f20));
            Property property2 = View.SCALE_X;
            if (z10) {
                f21 = 1.0f;
            } else {
                f21 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(fiVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(fiVar, property3, f26));
            if (w7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(xhVar, property4, f28));
            } else if (this.S0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, property, f27));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dh(this, 4));
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
            xhVar.setAlpha(f7);
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
            xhVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            xhVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            xhVar3.setAlpha(f13);
            if (z10 && z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            n6Var.setVisibility(i11);
            if (z10 && z13) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            n6Var.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            fiVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            fiVar.setScaleY(f16);
            if (w7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                xhVar.setTranslationY(dp);
            } else if (this.S0 && ((niVar = this.f28803y0) == null || niVar.J())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                xhVar2.setTranslationY(f17);
            }
            if (!z10) {
                xhVar.setVisibility(4);
                xhVar3.setVisibility(4);
            }
            if (z13) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f28803y0.getSelectedItemsCount());
        }
        fiVar.g(i10, z11);
        if (this.H1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1());
        }
        fiVar.i(j1() + this.f28803y0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aiVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), fiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            aiVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(ni niVar) {
        long j3 = this.W0;
        vn vnVar = this.T;
        if (niVar == vnVar) {
            j3 = vnVar.f28831s;
        } else if (niVar == this.f28754j0) {
            j3 = 1;
        } else if (niVar == this.f28760l0) {
            j3 = 3;
        } else if (niVar == this.f28771p0) {
            j3 = 4;
        } else if (niVar == this.f28757k0) {
            j3 = 5;
        } else if (niVar == this.f28768o0) {
            j3 = 6;
        } else if (niVar == this.m0) {
            j3 = 9;
        } else if (niVar == this.f28778r0) {
            j3 = 10;
        } else if (niVar == this.f28782s0) {
            j3 = 11;
        } else if (niVar == this.f28765n0) {
            j3 = 12;
        } else if (niVar == this.f28785t0) {
            j3 = 14;
        } else if (niVar == this.f28788u0) {
            j3 = 13;
        } else if (niVar == this.f28791v0) {
            j3 = 16;
        }
        R1(niVar, j3, true);
    }

    public final void R1(ni niVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        dm dmVar;
        boolean z12;
        Integer num;
        dm dmVar2;
        int i11;
        int dp;
        Float f7;
        int i12;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f28786t1 == null && this.M0 == null) {
            ni niVar2 = this.f28803y0;
            if (niVar2 == niVar) {
                niVar2.G();
                return;
            }
            int i13 = 0;
            if (niVar == this.f28765n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.x0(this.f28742f0, 39, false).show();
                return;
            }
            int i14 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
            if (i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f28741f.a(z11, z10);
            this.f28764n.i(Long.valueOf(j3), z10);
            this.D1 = false;
            this.B1 = false;
            this.F1 = 0.0f;
            this.E1.setVisibility(8);
            RadialProgressView radialProgressView = this.C1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            xh xhVar = this.f28800x1;
            xhVar.setAlpha(1.0f);
            xhVar.setTranslationY(this.F1);
            int i15 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.f28799x0;
                if (i15 >= longSparseArray.size()) {
                    break;
                }
                ((ei.q4) longSparseArray.valueAt(i15)).setMeasureOffsetY(0);
                i15++;
            }
            this.W0 = j3;
            yh yhVar = this.f28804y1;
            int childCount = yhVar.getChildCount();
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = yhVar.getChildAt(i16);
                if (childAt instanceof pi) {
                    pi piVar = (pi) childAt;
                    i12 = i14;
                    f7 = valueOf;
                    if (piVar.f27049b == piVar.f27050c.W0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    piVar.f27317a.e(z13, true);
                } else {
                    f7 = valueOf;
                    i12 = i14;
                    if (childAt instanceof oi) {
                        ((oi) childAt).a(true);
                    }
                }
                i16++;
                i14 = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int i17 = i14;
            int firstOffset = (this.f28803y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f28730b2[0];
            this.f28806z0 = niVar;
            niVar.getClass();
            boolean z14 = niVar instanceof ii.r;
            jh.f fVar = this.f28792v1;
            if (fVar != null) {
                if (z14) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                fVar.setFadeHeightBottom(dp);
            }
            zh zhVar = this.f28796w1;
            if (zhVar != null) {
                if (z14) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                zhVar.setVisibility(i11);
            }
            if (this.f28806z0.h() != 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            w7 w7Var = this.X0;
            w7Var.setVisibility(i10);
            if (w7Var.f19304n0) {
                w7Var.h(true);
            }
            this.f28803y0.r();
            ni niVar3 = this.f28806z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
            if (niVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.f28806z0.E(this.f28803y0);
            this.f28806z0.setVisibility(0);
            if (niVar.getParent() != null) {
                this.containerView.removeView(this.f28806z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.f28803y0);
            ViewParent parent = this.f28806z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                ni niVar4 = this.f28806z0;
                if (niVar4 != this.f28768o0) {
                    indexOfChild++;
                }
                viewGroup.addView(niVar4, indexOfChild, w7.x5.c(-1.0f, -1));
            }
            fh fhVar = new fh(this, 3);
            ni niVar5 = this.f28803y0;
            boolean z15 = niVar5 instanceof qm;
            ji jiVar = this.f28738e0;
            if (!z15 && !(this.f28806z0 instanceof qm)) {
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f28806z0.setAlpha(0.0f);
                    this.f28806z0.setTranslationY(AndroidUtilities.dp(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.f28803y0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f28803y0, jiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(w7Var, View.ALPHA, w7Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(qr.f27380f);
                    animatorSet.addListener(new gi(this, firstOffset, fhVar, 0));
                    this.f28786t1 = animatorSet;
                    jiVar.set(this.f28803y0, f10);
                    animatorSet.start();
                } else {
                    niVar5.setAlpha(0.0f);
                    fhVar.run();
                    a2(0);
                    this.containerView.invalidate();
                }
            } else {
                int max = Math.max(this.f28806z0.getWidth(), this.f28803y0.getWidth());
                ni niVar6 = this.f28806z0;
                if (niVar6 instanceof qm) {
                    niVar6.setTranslationX(max);
                    ni niVar7 = this.f28803y0;
                    if ((niVar7 instanceof ChatAttachAlertPhotoLayout) && (dmVar2 = ((ChatAttachAlertPhotoLayout) niVar7).P) != null) {
                        dmVar2.setVisibility(4);
                    }
                } else {
                    this.f28803y0.setTranslationX(-max);
                    ni niVar8 = this.f28806z0;
                    if (niVar8 == chatAttachAlertPhotoLayout && (dmVar = ((ChatAttachAlertPhotoLayout) niVar8).P) != null) {
                        dmVar.setVisibility(0);
                    }
                }
                this.f28806z0.setAlpha(1.0f);
                this.f28803y0.setAlpha(1.0f);
                if (z10) {
                    jiVar.set(this.f28803y0, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(this, niVar, fhVar, 12));
                } else {
                    if (this.f28806z0.getCurrentItemTop() <= niVar.getButtonsHideOffset()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f28803y0.s(1.0f);
                    this.f28806z0.s(1.0f);
                    this.f28803y0.k(this.f28761l2);
                    this.f28806z0.k(this.f28761l2);
                    this.containerView.invalidate();
                    jiVar.set(this.f28803y0, Float.valueOf(1.0f));
                    if (z12) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    w7Var.setTag(num);
                    fhVar.run();
                }
            }
            if (this.f28763m2 && !(niVar instanceof ei.q4)) {
                this.f28763m2 = false;
                w7Var.e();
                w7Var.invalidate();
                u1();
            }
            if (i17 != 0 && j3 != 6 && !(niVar instanceof ei.q4)) {
                if (j3 == 4) {
                    i13 = AndroidUtilities.dp(84.0f);
                }
            } else {
                i13 = AndroidUtilities.dp(46.0f);
            }
            w7Var.setForcedMenuWidth(i13);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        vi viVar;
        if (this.m0 == null) {
            viVar = this;
            un unVar = new un(viVar, getContext(), false, this.resourcesProvider, bool);
            viVar.m0 = unVar;
            viVar.f28795w0[1] = unVar;
            unVar.setDelegate(new ch(this, 15));
        } else {
            viVar = this;
        }
        R1(viVar.m0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        ni niVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        w7 w7Var = this.X0;
        if ((z10 && w7Var.getTag() == null) || (!z10 && w7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            w7Var.setTag(num);
            AnimatorSet animatorSet = this.Y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Y0 = null;
            }
            if (!this.F && !this.T0 && ((this.Q0 != 0 || !this.f28775q1) && this.f28803y0 == this.f28754j0 && (this.L1 || this.M1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f28803y0 == this.T) {
                z12 = false;
            }
            xh xhVar = this.f28800x1;
            org.telegram.ui.ActionBar.w0 w0Var = this.f28726a1;
            if (z10) {
                if (z12) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.S0 && this.D0.getTag() == null) {
                xhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
            if (o2Var != null) {
                if (z10) {
                    if (this.f28750h2) {
                        i10 = org.telegram.ui.ActionBar.j6.f19165tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f18933h5;
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
                this.Y0 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - w7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w7Var, property, f12));
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
                this.Y0.addListener(new aa(2, this, z10));
                this.Y0.setInterpolator(qr.h);
                this.Y0.setDuration(380L);
                this.Y0.start();
                return;
            }
            if (z10 && this.S0 && ((niVar = this.f28803y0) == null || niVar.J())) {
                xhVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            w7Var.setAlpha(f7);
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
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f28739e1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.Q0 != 0 || !this.f28775q1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.G0;
        ai aiVar = this.E0;
        aiVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            ni niVar = this.f28803y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
            if ((niVar == chatAttachAlertPhotoLayout || niVar == this.f28774q0) && this.f28732c0) {
                ci.n6 n6Var = this.O0;
                alpha = (n6Var.getAlpha() * n6Var.getMeasuredHeight()) + (n6Var.getY() - this.B2.getTop());
            } else {
                alpha = -aiVar.getHeight();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f7;
        float f10;
        float f11;
        ni niVar = this.f28803y0;
        int i10 = 0;
        if (niVar == null) {
            g10 = false;
        } else {
            g10 = niVar.g();
        }
        bi.o oVar = this.f28743f1;
        oVar.setEnabled(g10);
        ni niVar2 = this.f28803y0;
        float f12 = 0.5f;
        if (niVar2 != null) {
            if (niVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f28806z0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f28735d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        ni niVar3 = this.f28806z0;
        if (niVar3 != null) {
            if (niVar3.g()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f28735d0, f12, f7);
        }
        this.f28746g1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f28749h1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void X1(ni niVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (niVar != null) {
            ah.i iVar = this.C2;
            if (iVar != null && Build.VERSION.SDK_INT >= 31) {
                iVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = niVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (niVar == this.f28803y0 && currentItemTop <= niVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (niVar == this.f28803y0) {
                    T1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) niVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.wl.D(11.0f, i11, currentItemTop);
                ni niVar2 = this.f28803y0;
                if (niVar2 == niVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((niVar2 instanceof qm) || (this.f28806z0 instanceof qm)) {
                    Object obj = this.f28786t1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f15354f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f28730b2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f28734c2 = i13;
                        return;
                    }
                    return;
                }
                this.f28734c2 = i13;
                iArr[i12] = D;
                a2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f25430a.length() <= 0) {
            return;
        }
        this.f28803y0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f28729b1) != null) {
            int i10 = 0;
            if (this.f28775q1 && this.f28751i0 && this.f28803y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f5589f = z12;
            if (!z10) {
                ((c6) uVar.f5590g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.f28733c1;
            if (z10 && this.f28775q1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(qr.h).withEndAction(new ph(this, z11, 0)).start();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.Z0():void");
    }

    public final void Z1(boolean z10) {
        boolean z11;
        float f7;
        ni niVar = this.f28754j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f28774q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f28777r;
                if (f6Var == null) {
                    f6Var = this.resourcesProvider;
                }
                ?? niVar2 = new ni(context, f6Var, this);
                niVar2.f27352y = 0.0f;
                niVar2.E = 0.0f;
                niVar2.F = 0.0f;
                niVar2.G = 0.0f;
                niVar2.H = 0.0f;
                niVar2.I = 0.0f;
                niVar2.J = null;
                niVar2.K = false;
                niVar2.M = 0.0f;
                niVar2.Q = false;
                niVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                niVar2.T = z11;
                niVar2.f27347n = f6Var;
                niVar2.f26462f = true;
                niVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.a0 n10 = niVar2.f26460b.X0.n();
                TextView textView = new TextView(context);
                niVar2.f27351x = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = niVar2.f26459a;
                yl ylVar = new yl(niVar2, context, n10, f6Var2, 1);
                w7 w7Var = niVar2.f26460b.X0;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                w7Var.addView(ylVar, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18969j5, f6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                ylVar.addView(textView, w7.x5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(niVar2, context, f6Var2, 14);
                niVar2.f27348r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.y7(niVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                niVar2.f27349s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                pm pmVar = new pm(niVar2, context);
                niVar2.v = pmVar;
                pmVar.setClipToPadding(true);
                pmVar.setClipChildren(true);
                niVar2.addView(w0Var, w7.x5.c(-1.0f, -1));
                niVar2.P = niVar2.f26460b.f28754j0;
                pmVar.f27074c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar2.P;
                pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                pmVar.c();
                UndoView undoView = new UndoView(context, null, false, niVar2.f26460b.f28777r);
                niVar2.f27350w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                niVar2.addView(undoView, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                niVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f28774q0 = niVar2;
                niVar2.bringToFront();
            }
            ni niVar3 = this.f28803y0;
            qm qmVar = this.f28774q0;
            if (niVar3 != qmVar) {
                niVar = qmVar;
            }
            Q1(niVar);
            return;
        }
        Q1(niVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if ((o2Var instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) o2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.bo) o2Var).a(), o2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f28779r1.invalidate();
        ci.n6 n6Var = this.O0;
        n6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
        if (chatAttachAlertPhotoLayout != null) {
            tl tlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (tlVar != null && tlVar.getFastScroll() != null) {
                tk0 fastScroll = tlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f21943p1;
                if (this.f28732c0) {
                    i10 = (int) (n6Var.getAlpha() * n6Var.getMeasuredHeight());
                }
                fastScroll.f28133h0 = currentActionBarHeight + i10;
                tlVar.getFastScroll().invalidate();
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
        yh yhVar = this.f28804y1;
        if (yhVar == null) {
            return;
        }
        int childCount = yhVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            yhVar.getChildAt(i20);
        }
        boolean z11 = this.f28750h2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.j6.f18942hg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18969j5;
        }
        this.f28755j1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.j6.f18942hg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f18969j5;
        }
        this.f28769o1.setTextColor(getThemedColor(i11));
        this.f28743f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.j6.f18942hg;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f18969j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.w0 w0Var = this.f28726a1;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.j6.f18961ig;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.I5;
        }
        org.telegram.ui.ActionBar.j6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.j6.E8;
        w0Var.G(getThemedColor(i21), false);
        w0Var.G(getThemedColor(i21), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f28733c1;
        if (w0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.j6.f18942hg;
            } else {
                i19 = org.telegram.ui.ActionBar.j6.f18969j5;
            }
            w0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f28739e1;
        if (w0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.j6.f18942hg;
            } else {
                i17 = org.telegram.ui.ActionBar.j6.f18969j5;
            }
            w0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = w0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.j6.f18961ig;
            } else {
                i18 = org.telegram.ui.ActionBar.j6.I5;
            }
            org.telegram.ui.ActionBar.j6.w1(getThemedColor(i18), background2);
        }
        ai aiVar = this.E0;
        org.telegram.ui.ActionBar.f6 f6Var = aiVar.M;
        eu euVar = aiVar.f25430a;
        int i22 = aiVar.L;
        if (i22 == 0) {
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            int i23 = org.telegram.ui.ActionBar.j6.G6;
            euVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var));
        } else if (i22 != 2 && i22 != 3) {
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19155t5, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18969j5, f6Var));
        } else {
            euVar.setHintTextColor(-1929379841);
            euVar.setTextColor(-1);
            euVar.setCursorColor(-1);
            euVar.setHandlesColor(-1);
            euVar.setHighlightColor(822083583);
            euVar.quoteColor = -1;
        }
        aiVar.f25432c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
        fu fuVar = aiVar.d;
        if (fuVar != null) {
            fuVar.T();
        }
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.j6.f18942hg;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.f18969j5;
        }
        int themedColor2 = getThemedColor(i14);
        w7 w7Var = this.X0;
        w7Var.B(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.j6.f18961ig;
        } else {
            i15 = org.telegram.ui.ActionBar.j6.I5;
        }
        w7Var.A(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.j6.f18942hg;
        } else {
            i16 = org.telegram.ui.ActionBar.j6.f18969j5;
        }
        w7Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        fh.c cVar = this.F2;
        if (cVar.f9073a.getColor() != q12) {
            cVar.a(q12);
            jh.f fVar = this.f28792v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            zh zhVar = this.f28796w1;
            if (zhVar != null) {
                zhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i24 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i24];
            if (niVar != null) {
                niVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18951i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f28803y0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f28773p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f28776q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.d1(boolean):void");
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
        si siVar = this.A1;
        if (siVar != null) {
            siVar.l();
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
        ti tiVar = this.Z1;
        if (tiVar != null) {
            tiVar.x0(new fh(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f28803y0.o(i10);
    }

    public final void e1() {
        float f7 = this.f28731c.e;
        float f10 = (1.0f - this.f28727b.e) * f7;
        this.f28796w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void f1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f28741f.e;
        float b10 = yf.e0.b(this.h.e);
        if (this.R1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        y10.d(this.F0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        fi fiVar = this.I0;
        xh xhVar = this.H0;
        ci.n6 n6Var = this.O0;
        if (n6Var != null && n6Var.getVisibility() == 0 && n6Var.getAlpha() != 0.0f) {
            float f7 = this.f28727b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            fiVar.setAlpha(abs * abs * abs * abs);
            xhVar.setTranslationY(AndroidUtilities.lerp(this.f28747g2, ((n6Var.getTranslationY() + n6Var.getTop()) - xhVar.getTop()) + AndroidUtilities.dp(8.0f), qr.f27383j.getInterpolation(f7)));
            return;
        }
        xhVar.setTranslationY(this.f28747g2);
        fiVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i10 < niVarArr.length) {
                ni niVar = niVarArr[i10];
                if (niVar != null && (themeDescriptions = niVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18951i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.S0 = true;
        this.f28800x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f28758k1;
        if (w0Var != null) {
            this.f28755j1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f28755j1;
        textView.setText(string);
        this.S0 = false;
        this.f28800x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.f28751i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.w0 w0Var = this.f28758k1;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if ((o2Var instanceof org.telegram.ui.bo) && (messagePreviewParams = ((org.telegram.ui.bo) o2Var).f32283f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            return ((org.telegram.ui.bo) o2Var).e;
        }
        return MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        xh xhVar = this.D0;
        float alpha = 1.0f - xhVar.getAlpha();
        return xhVar.getMeasuredHeight() - (alpha * (xhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ju m1() {
        ni niVar;
        if (this.f28732c0 && ((niVar = this.f28803y0) == this.f28754j0 || niVar == this.f28774q0)) {
            return this.P0;
        }
        return this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            return ((org.telegram.ui.bo) o2Var).a();
        }
        return this.Z;
    }

    public final int o1() {
        ni niVar = this.f28803y0;
        un unVar = this.m0;
        if (niVar == unVar && unVar.E != null) {
            return unVar.getEmojiPadding();
        }
        un unVar2 = this.f28765n0;
        if (niVar == unVar2 && unVar2.E != null) {
            return unVar2.getEmojiPadding();
        }
        if (this.f28732c0) {
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
        w7 w7Var = this.X0;
        if (w7Var.f19304n0) {
            w7Var.h(true);
        } else if (this.f28803y0.i()) {
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
        return this.f28803y0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
        f91 f91Var = chatAttachAlertPhotoLayout.f21935l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f21931j0;
        TextView textView = chatAttachAlertPhotoLayout.f21942p0;
        tl tlVar = chatAttachAlertPhotoLayout.f21945r;
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
                if (tlVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.w1.B(222.0f, i13, i16), i14, org.telegram.messenger.w1.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.w1.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (tlVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.w1.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.w1.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == f91Var) {
            if (z10) {
                if (tlVar.getVisibility() == 0) {
                    f91Var.layout(0, org.telegram.messenger.w1.B(310.0f, i13, i16), i14, org.telegram.messenger.w1.B(260.0f, i13, i16));
                    return true;
                }
                f91Var.layout(0, org.telegram.messenger.w1.B(176.0f, i13, i16), i14, org.telegram.messenger.w1.B(126.0f, i13, i16));
                return true;
            } else if (tlVar.getVisibility() == 0) {
                f91Var.layout(org.telegram.messenger.w1.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                f91Var.layout(org.telegram.messenger.w1.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (tlVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (tlVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != tlVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.w1.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
        hm hmVar = chatAttachAlertPhotoLayout.v;
        tl tlVar = chatAttachAlertPhotoLayout.f21945r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.f21947s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (view == dmVar) {
            if (chatAttachAlertPhotoLayout.f21915b0 && !chatAttachAlertPhotoLayout.f21919d0) {
                dmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f21931j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            f91 f91Var = chatAttachAlertPhotoLayout.f21935l0;
            if (view == f91Var) {
                if (z10) {
                    f91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                f91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == tlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    tlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (b0Var.f42685o != 0) {
                        tlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        hmVar.l();
                    }
                } else {
                    tlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (b0Var.f42685o != 1) {
                        tlVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        b0Var.j1(1);
                        hmVar.l();
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
        this.f28754j0.setTranslationX(0.0f);
        this.f28766n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28776q2 = animatorSet;
        ji jiVar = this.f28770o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, jiVar, 0.0f, 400.0f));
        this.f28776q2.setDuration(400L);
        this.f28776q2.setStartDelay(20L);
        jiVar.set(this, Float.valueOf(0.0f));
        this.f28776q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new dh(this, 2));
        o1.k kVar = this.f28773p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f15344n, 0.0f);
        this.f28773p2 = kVar2;
        if (this.H1 != null) {
            kVar2.f15361u.a(0.75f);
            this.f28773p2.f15361u.b(350.0f);
        } else {
            kVar2.f15361u.a(0.75f);
            this.f28773p2.f15361u.b(350.0f);
        }
        this.f28773p2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.f3 f3Var = this.backDrawable;
        o6 o6Var = q6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(f3Var, o6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.ui.ActionBar.q qVar = new org.telegram.ui.ActionBar.q(this, animationNotificationsLocker, this.delegate, 11);
        this.f28773p2.a(new ei.m4(2, this, qVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, qVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new dh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(qr.f27380f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f28803y0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f28803y0.B(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f28742f0 instanceof org.telegram.ui.bo) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f28803y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f28783s1 = true;
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
        ni niVar = this.f28806z0;
        int[] iArr = this.f28730b2;
        if (niVar != null && ((this.f28803y0 instanceof qm) || (niVar instanceof qm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f28735d0);
        }
        return iArr[i10];
    }

    public final int q1(boolean z10) {
        boolean q6;
        int i10;
        w7 w7Var;
        if (this.f28750h2) {
            return getThemedColor(org.telegram.ui.ActionBar.j6.f19165tg);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Iterator it = this.f28764n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            long longValue = ((Long) gVar.f13994a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.p.a(f7, 0.0f, 1.0f);
        if (z10 && (w7Var = this.X0) != null && w7Var.getVisibility() == 0) {
            a2 *= 1.0f - w7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.j6.f18806a7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18951i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.r1():void");
    }

    public final boolean s1() {
        if (this.f28732c0) {
            ni niVar = this.f28803y0;
            if (niVar == this.f28754j0 || niVar == this.f28774q0) {
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
        ni niVar = this.f28803y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28754j0;
        if (niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f21930i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            this.calcMandatoryInsets = ((org.telegram.ui.bo) o2Var).x9();
        }
        W1();
        this.f28783s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f28763m2) {
            this.f28763m2 = false;
            w7 w7Var = this.X0;
            w7Var.e();
            w7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        ti tiVar = this.Z1;
        if (tiVar != null && !this.f28789u1) {
            boolean c02 = tiVar.c0();
            this.f28789u1 = true;
            ci.y0 y0Var = new ci.y0(this, editTextBoldCursor, z10, 17);
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
            org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
            fh.c cVar = this.F2;
            if (cVar.f9073a.getColor() != q12) {
                cVar.a(q12);
                jh.f fVar = this.f28792v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                zh zhVar = this.f28796w1;
                if (zhVar != null) {
                    zhVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        ai aiVar = this.E0;
        if (aiVar != null) {
            aiVar.o();
        }
        di diVar = this.P0;
        if (diVar != null) {
            diVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f18268id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
        c2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        c2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i10 < niVarArr.length) {
                ni niVar = niVarArr[i10];
                if (niVar != null) {
                    niVar.x();
                }
                i10++;
            } else {
                this.f28744f2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f28744f2 = false;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.c0();
        }
        si siVar = this.A1;
        if (siVar != null) {
            siVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (o2Var instanceof org.telegram.ui.bo)) {
            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var;
            MessageSuggestionParams messageSuggestionParams = boVar.f32295g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.v5.U(i10, messageSuggestionParams.amount)) {
                boVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f28781s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.I0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                O1(o2Var);
                return;
            }
            return;
        }
        if (this.H1 == null && (o2Var instanceof org.telegram.ui.bo)) {
            org.telegram.ui.bo boVar2 = (org.telegram.ui.bo) o2Var;
            if (boVar2.c()) {
                c5.M(getContext(), boVar2.a(), new ch(this, 12), this.resourcesProvider);
                return;
            }
        }
        ni niVar = this.f28803y0;
        if (niVar != this.f28754j0 && niVar != this.f28774q0) {
            if (!niVar.I(0, true, 0, s1(), this.N0)) {
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
        if (this.f28803y0.n() || isDismissed()) {
            return;
        }
        ai aiVar = this.E0;
        if (aiVar != null) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        di diVar = this.P0;
        if (diVar != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        this.f28799x0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.f28742f0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.A2 && o2Var != null && this.f28803y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.f28808z2) {
                return;
            }
            this.f28808z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new ch(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18446a.setOnCancelListener(new ih(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
            c2Var.N = b1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19100q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f28795w0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null && this.f28803y0 != niVar) {
                niVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7), 0), true, (AndroidUtilities.IntColorCallback) new ch(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.f28753i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public vi(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}
