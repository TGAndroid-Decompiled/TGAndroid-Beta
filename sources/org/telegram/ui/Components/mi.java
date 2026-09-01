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
import org.telegram.ui.vi1;
public class mi extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b3, xd.b {
    public static final int L2 = 0;
    public final mh A0;
    public boolean A1;
    public final tg.d A2;
    public final j0 B;
    public final qh B0;
    public final k6 B1;
    public final tg.d B2;
    public boolean C;
    public final ImageView C0;
    public float C1;
    public final tg.c C2;
    public boolean D;
    public final int[] D0;
    public int D1;
    public final og.a D2;
    public boolean E;
    public final mh E0;
    public MessageObject E1;
    public final og.a E2;
    public int F;
    public final vh F0;
    public boolean F1;
    public final ah F2;
    public Utilities.Callback2 G;
    public final TextPaint G0;
    public final int G1;
    public final ArrayList G2;
    public int H;
    public final RectF H0;
    public boolean H1;
    public final RectF H2;
    public int I;
    public final Paint I0;
    public boolean I1;
    public final RectF I2;
    public boolean J;
    public AnimatorSet J0;
    public boolean J1;
    public final RectF J2;
    public boolean K;
    public long K0;
    public boolean K1;
    public final ArrayList K2;
    public boolean L;
    public final ag.l L0;
    public boolean L1;
    public boolean M;
    public final th M0;
    public boolean M1;
    public w40 N;
    public int N0;
    public boolean N1;
    public boolean O;
    public ot O0;
    public boolean O1;
    public final xd0 P;
    public boolean P0;
    public int P1;
    public tn Q;
    public boolean Q0;
    public boolean Q1;
    public y40 R;
    public boolean R0;
    public boolean R1;
    public boolean S;
    public final float S0;
    public float S1;
    public boolean T;
    public long T0;
    public float T1;
    public zj U;
    public final fg.k1 U0;
    public ValueAnimator U1;
    public ui V;
    public AnimatorSet V0;
    public int V1;
    public long W;
    public AnimatorSet W0;
    public ki W1;
    public boolean X;
    public final org.telegram.ui.ActionBar.w0 X0;
    public en X1;
    public final og.b Y;
    public final lc0 Y0;
    public final int[] Y1;
    public boolean Z;
    public final org.telegram.ui.ActionBar.w0 Z0;
    public int Z1;
    public float f29033a0;
    public qh.f3 f29034a1;
    public float a2;
    public final xd.a f29035b;
    public final yh f29036b0;
    public final org.telegram.ui.ActionBar.w0 f29037b1;
    public float f29038b2;
    public final xd.a f29039c;
    public final org.telegram.ui.ActionBar.p2 f29040c0;
    public final fg.s0 f29041c1;
    public boolean f29042c2;
    public final xd.a d;
    public final boolean f29043d0;
    public float f29044d1;
    public float f29045d2;
    public final xd.a f29046e;
    public cf f29047e0;
    public float f29048e1;
    public final boolean f29049e2;
    public final xd.a f29050f;
    public boolean f29051f0;
    public final mh f29052f1;
    public boolean f29053f2;
    public final ChatAttachAlertPhotoLayout f29054g0;
    public final TextView f29055g1;
    public final ArrayList f29056g2;
    public final xd.a h;
    public sj f29057h0;
    public final org.telegram.ui.ActionBar.w0 f29058h1;
    public final Rect f29059h2;
    public xi f29060i0;
    public final LinearLayout f29061i1;
    public float f29062i2;
    public sn f29063j0;
    public final ImageView f29064j1;
    public boolean f29065j2;
    public sn f29066k0;
    public final LinearLayout f29067k1;
    public int f29068k2;
    public cl f29069l0;
    public final TextView l1;
    public final yh f29070l2;
    public jk m0;
    public float f29071m1;
    public o1.j f29072m2;
    public final xd.j f29073n;
    public qm f29074n0;
    public boolean f29075n1;
    public AnimatorSet f29076n2;
    public bj f29077o0;
    public final ci f29078o1;
    public boolean f29079o2;
    public vf.c0 f29080p0;
    public boolean f29081p1;
    public boolean f29082p2;
    public kk f29083q0;
    public Object f29084q1;
    public wk f29085q2;
    public org.telegram.ui.vn f29086r;
    public kk f29087r0;
    public boolean f29088r1;
    public boolean f29089r2;
    public final k6 f29090s;
    public wh.q f29091s0;
    public final xg.f f29092s1;
    public boolean f29093s2;
    public final ei[] f29094t0;
    public final oh f29095t1;
    public File f29096t2;
    public final LongSparseArray f29097u0;
    public final mh f29098u1;
    public double[] f29099u2;
    public final k6 v;
    public ei f29100v0;
    public final nh f29101v1;
    public boolean f29102v2;
    public final ImageView f29103w;
    public ei f29104w0;
    public final f2.j0 f29105w1;
    public boolean f29106w2;
    public final j0 f29107x;
    public final qg.b f29108x0;
    public final ji f29109x1;
    public boolean f29110x2;
    public final ImageView f29111y;
    public final qg.b f29112y0;
    public boolean f29113y1;
    public zh f29114y2;
    public final ph f29115z0;
    public final RadialProgressView f29116z1;
    public final og.e f29117z2;

    public mi(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        fg.s0 s0Var;
        float f10;
        fg.k1 k1Var;
        pr prVar = pr.h;
        this.f29035b = new xd.a(0, this, prVar, 380L, false);
        this.f29039c = new xd.a(1, this, prVar, 380L, false);
        this.d = new xd.a(2, this, prVar, 380L, false);
        this.f29046e = new xd.a(3, this, prVar, 380L, false);
        this.f29050f = new xd.a(4, this, prVar, 380L, true);
        this.h = new xd.a(5, this, prVar, 320L, false);
        xd.j jVar = new xd.j(new tg(this, 1), prVar, 380L);
        this.f29073n = jVar;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.f29033a0 = 0.0f;
        this.f29036b0 = new yh(this, 0);
        this.f29051f0 = false;
        ei[] eiVarArr = new ei[11];
        this.f29094t0 = eiVarArr;
        this.f29097u0 = new LongSparseArray();
        this.D0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G0 = textPaint;
        this.H0 = new RectF();
        this.I0 = new Paint(1);
        this.R0 = true;
        this.S0 = 1.0f;
        this.f29113y1 = false;
        this.A1 = false;
        int i10 = UserConfig.selectedAccount;
        this.G1 = i10;
        this.H1 = true;
        this.I1 = true;
        this.J1 = true;
        this.K1 = true;
        this.L1 = true;
        this.M1 = true;
        this.N1 = true;
        this.P1 = -1;
        this.Q1 = true;
        this.V1 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.Y1 = new int[2];
        new Paint(1);
        this.f29053f2 = false;
        ArrayList arrayList = new ArrayList();
        this.f29056g2 = arrayList;
        Rect rect = new Rect();
        this.f29059h2 = rect;
        this.f29070l2 = new yh(this, 1);
        this.f29079o2 = true;
        this.f29082p2 = false;
        this.f29106w2 = false;
        this.f29110x2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.G2 = arrayList2;
        RectF rectF = new RectF();
        this.H2 = rectF;
        RectF rectF2 = new RectF();
        this.I2 = rectF2;
        RectF rectF3 = new RectF();
        this.J2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.K2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        tg.c cVar = new tg.c();
        this.C2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f29117z2 = new og.e(false);
            tg.d dVar = new tg.d(null);
            this.B2 = dVar;
            dVar.j(new ai(this, 0));
            tg.d dVar2 = new tg.d(null);
            this.A2 = dVar2;
            dVar2.j(new oh.h4(this, 2));
            og.a aVar = new og.a(dVar);
            this.D2 = aVar;
            aVar.f16755f = LiteMode.isEnabled(262144);
            og.a aVar2 = new og.a(dVar2);
            this.E2 = aVar2;
            aVar2.f16755f = LiteMode.isEnabled(262144);
        } else {
            this.f29117z2 = null;
            this.A2 = null;
            this.B2 = null;
            this.D2 = new og.a(cVar);
            this.E2 = new og.a(cVar);
        }
        og.a aVar3 = new og.a(cVar);
        this.F2 = new ah(this, 0);
        this.f29049e2 = z4;
        this.f29043d0 = (p2Var instanceof org.telegram.ui.xn) && p2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f29040c0 = p2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ci ciVar = new ci(this, context);
        this.f29078o1 = ciVar;
        ciVar.setDelegate(new di(this));
        this.containerView = ciVar;
        ciVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        fg.k1 k1Var2 = new fg.k1(this, context, g6Var, 2);
        this.U0 = k1Var2;
        k1Var2.P0 = true;
        k1Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        k1Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        int i12 = org.telegram.ui.ActionBar.k6.f21766j5;
        k1Var2.C(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.k6.I5;
        k1Var2.B(getThemedColor(i13), false);
        k1Var2.setTitleColor(getThemedColor(i12));
        k1Var2.setOccupyStatusBar(true);
        k1Var2.setAlpha(0.0f);
        k1Var2.setActionBarMenuOnItemClick(new fg.l1(this, 25));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, g6Var);
        this.X0 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new tg(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, g6Var);
        this.Z0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        lc0 lc0Var = new lc0();
        this.Y0 = lc0Var;
        w0Var3.setIcon(lc0Var);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        fg.s0 s0Var2 = new fg.s0(this, context);
        s0Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
        s0Var2.setText(LocaleController.getString(R.string.Create));
        s0Var2.setTypeface(AndroidUtilities.bold());
        s0Var2.setTextSize(1, 14.0f);
        s0Var2.setVisibility(4);
        s0Var2.setAlpha(0.0f);
        s0Var2.setGravity(17);
        s0Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s0Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        s0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        k7.e6.a(s0Var2);
        this.f29041c1 = s0Var2;
        W1();
        if (p2Var != null) {
            w0Var = w0Var3;
            s0Var = s0Var2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, g6Var);
            this.f29037b1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13), 6, -1));
            w0Var4.setOnClickListener(new oh.b2(5, this, z10));
        } else {
            w0Var = w0Var3;
            s0Var = s0Var2;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, g6Var);
        this.f29058h1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13), 3, -1));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final mi f33505b;

            {
                this.f33505b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z12;
                boolean z13;
                org.telegram.ui.xn xnVar;
                switch (r3) {
                    case 0:
                        final mi miVar = this.f33505b;
                        qh qhVar = miVar.B0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(miVar.getContext(), g6Var);
                            f0Var.m0(qhVar.getText());
                            f0Var.f26694g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = miVar.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar = miVar.M0;
                                            thVar.setText(charSequence);
                                            thVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = miVar.W;
                            if (miVar.E1 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ch chVar = new ch(miVar, 0);
                            f0Var.f26696i0 = j10;
                            f0Var.f26697j0 = z12;
                            f0Var.f26698k0 = chVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final mi miVar2 = this.f33505b;
                        th thVar = miVar2.M0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(miVar2.getContext(), g6Var);
                            f0Var2.m0(thVar.getText());
                            f0Var2.f26694g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = miVar2.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = miVar2.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = miVar2.W;
                            if (miVar2.E1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar2 = new ch(miVar2, 1);
                            f0Var2.f26696i0 = j11;
                            f0Var2.f26697j0 = z13;
                            f0Var2.f26698k0 = chVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        mi miVar3 = this.f33505b;
                        miVar3.f29058h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = miVar3.f29040c0;
                        t12.K2(null, p2Var2, g6Var);
                        PhotoViewer.t1().L2(miVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i14 = miVar3.P1;
                        boolean z14 = miVar3.Q1;
                        t13.h = i14;
                        t13.f34337n = z14;
                        if (!miVar3.W1.h0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(miVar3.getContainer().findFocus());
                        }
                        File w10 = qh.s6.w(miVar3.G1, "webp");
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
                        lh lhVar = new lh(miVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.xn) {
                            xnVar = (org.telegram.ui.xn) p2Var2;
                        } else {
                            xnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, xnVar);
                        if (miVar3.D) {
                            PhotoViewer.t1().Y0(null, null, true, miVar3.G);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        mh mhVar = new mh(this, context, 0);
        this.f29052f1 = mhVar;
        mhVar.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        mhVar.setAlpha(0.0f);
        mhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29061i1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f29055g1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, k7.c6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f29064j1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, k7.c6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        mhVar.addView(linearLayout, k7.c6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f29067k1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, k7.c6.q(-2, -2, 16));
        mhVar.addView(linearLayout2, k7.c6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z4, z11, g6Var);
        this.f29054g0 = chatAttachAlertPhotoLayout;
        eiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f29100v0 = chatAttachAlertPhotoLayout;
        this.T0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, k7.c6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f29092s1 = view;
        view.setup(aVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, k7.c6.g());
        this.containerView.addView(mhVar, k7.c6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ag.l lVar = new ag.l(context);
        this.L0 = lVar;
        this.containerView.addView(lVar, k7.c6.e(-1, -2, 55));
        this.containerView.addView(k1Var2, k7.c6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, k7.c6.e(48, 48, 53));
        this.containerView.addView(w0Var, k7.c6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f29037b1;
        if (w0Var6 != null) {
            k1Var = k1Var2;
            this.containerView.addView(w0Var6, k7.c6.e(48, 48, 53));
        } else {
            k1Var = k1Var2;
        }
        mhVar.addView(w0Var5, k7.c6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(s0Var, k7.c6.e(-2, 48, 53));
        mh mhVar2 = new mh(this, context, 1);
        this.f29098u1 = mhVar2;
        nh nhVar = new nh(context, 0);
        this.f29101v1 = nhVar;
        nhVar.setClipChildren(true);
        nhVar.setClipToPadding(false);
        ji jiVar = new ji(this, context);
        this.f29109x1 = jiVar;
        nhVar.setAdapter(jiVar);
        f2.j0 j0Var = new f2.j0(0, false);
        this.f29105w1 = j0Var;
        nhVar.setLayoutManager(j0Var);
        nhVar.setVerticalScrollBarEnabled(false);
        nhVar.setHorizontalScrollBarEnabled(false);
        nhVar.setItemAnimator(null);
        nhVar.setLayoutAnimation(null);
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.A5));
        nhVar.f31403w2 = true;
        nhVar.setOverScrollMode(2);
        og.a aVar4 = this.D2;
        vg.i iVar = new vg.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.f16754e = viewGroup2;
        og.a aVar5 = this.E2;
        vg.i iVar2 = new vg.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.f16754e = viewGroup3;
        vg.i iVar3 = new vg.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.f16754e = viewGroup4;
        oh ohVar = new oh(this, context, 0);
        this.f29095t1 = ohVar;
        og.b bVar = new og.b(aVar3.c(ohVar, null, false));
        this.Y = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ohVar, k7.c6.g());
        qg.b c3 = this.D2.c(mhVar2, sg.b.f(g6Var), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        mhVar2.setBackground(c3);
        nhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        nhVar.setClipToOutline(true);
        hg.j1 j1Var = lf.q0.f12504a;
        nhVar.setOutlineProvider(new lf.p0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        nhVar.setImportantForAccessibility(1);
        mhVar2.addView(nhVar, k7.c6.g());
        this.containerView.addView(mhVar2, k7.c6.e(-1, 70, 81));
        nhVar.setOnItemClickListener(new hg.v0(9, this, g6Var));
        nhVar.setOnItemLongClickListener(new tg(this, 3));
        k6 k6Var = new k6(context, true, false, true);
        this.B1 = k6Var;
        k6Var.setVisibility(8);
        k6Var.setAlpha(0.0f);
        k6Var.setGravity(17);
        k6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        k6Var.setPadding(dp, 0, dp, 0);
        k6Var.setTextSize(AndroidUtilities.dp(f10));
        k6Var.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view2) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        this.containerView.addView(k6Var, k7.c6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f29116z1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, k7.c6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f22053z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view2) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        mh mhVar3 = new mh(this, context, 2);
        this.A0 = mhVar3;
        ph phVar = new ph(this, context);
        this.f29115z0 = phVar;
        mhVar3.addView(phVar, k7.c6.e(-1, -1, 119));
        qg.b c10 = this.E2.c(ciVar, sg.b.m(g6Var), false);
        this.f29108x0 = c10;
        c10.f44857k = true;
        c10.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.t(AndroidUtilities.dp(32.0f));
        c10.h.f44841g = 0.4f;
        c10.j();
        qg.b c11 = this.D2.c(phVar, sg.b.m(g6Var), false);
        this.f29112y0 = c11;
        c11.p(AndroidUtilities.dp(22.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        phVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        mhVar3.setWillNotDraw(false);
        mhVar3.setVisibility(4);
        mhVar3.setAlpha(0.0f);
        this.containerView.addView(mhVar3, k7.c6.e(-1, -2, 83));
        mhVar3.setOnTouchListener(new org.telegram.ui.ActionBar.s2(12));
        k6 k6Var2 = new k6(context, false, false, false);
        this.f29090s = k6Var2;
        k6Var2.setAllowCancel(true);
        k6Var2.setScaleProperty(0.6f);
        k6Var2.setVisibility(8);
        k6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i14 = org.telegram.ui.ActionBar.k6.f22036y6;
        k6Var2.setTextColor(getThemedColor(i14));
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setGravity(17);
        phVar.addView(k6Var2, k7.c6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f29103w = imageView4;
        j0 j0Var2 = new j0(context);
        this.f29107x = j0Var2;
        imageView4.setImageDrawable(j0Var2);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.k6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        int i16 = org.telegram.ui.ActionBar.k6.f21750i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        phVar.addView(imageView4, k7.c6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.e6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33505b;

            {
                this.f33505b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                boolean z13;
                org.telegram.ui.xn xnVar;
                switch (r3) {
                    case 0:
                        final mi miVar = this.f33505b;
                        qh qhVar = miVar.B0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(miVar.getContext(), g6Var);
                            f0Var.m0(qhVar.getText());
                            f0Var.f26694g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = miVar.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = miVar.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = miVar.W;
                            if (miVar.E1 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ch chVar = new ch(miVar, 0);
                            f0Var.f26696i0 = j10;
                            f0Var.f26697j0 = z12;
                            f0Var.f26698k0 = chVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final mi miVar2 = this.f33505b;
                        th thVar = miVar2.M0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(miVar2.getContext(), g6Var);
                            f0Var2.m0(thVar.getText());
                            f0Var2.f26694g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = miVar2.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = miVar2.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = miVar2.W;
                            if (miVar2.E1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar2 = new ch(miVar2, 1);
                            f0Var2.f26696i0 = j11;
                            f0Var2.f26697j0 = z13;
                            f0Var2.f26698k0 = chVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        mi miVar3 = this.f33505b;
                        miVar3.f29058h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = miVar3.f29040c0;
                        t12.K2(null, p2Var2, g6Var);
                        PhotoViewer.t1().L2(miVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = miVar3.P1;
                        boolean z14 = miVar3.Q1;
                        t13.h = i142;
                        t13.f34337n = z14;
                        if (!miVar3.W1.h0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(miVar3.getContainer().findFocus());
                        }
                        File w10 = qh.s6.w(miVar3.G1, "webp");
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
                        lh lhVar = new lh(miVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.xn) {
                            xnVar = (org.telegram.ui.xn) p2Var2;
                        } else {
                            xnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, xnVar);
                        if (miVar3.D) {
                            PhotoViewer.t1().Y0(null, null, true, miVar3.G);
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
        this.H = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        qh qhVar = new qh(this, context, ciVar, g6Var);
        this.B0 = qhVar;
        qhVar.G = true;
        qhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        qhVar.s();
        qhVar.getEditText().setLayoutParams(k7.c6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        qhVar.getEditText().addTextChangedListener(new sh(this));
        phVar.addView(qhVar, k7.c6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        phVar.setClipChildren(false);
        mhVar3.setClipChildren(false);
        qhVar.setClipChildren(false);
        lVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        lVar.setWillNotDraw(false);
        th thVar = new th(this, context, ciVar, g6Var);
        this.M0 = thVar;
        thVar.G = true;
        thVar.getEditText().addTextChangedListener(new uh(this, p2Var));
        thVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        thVar.getEditText().setLayoutParams(k7.c6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        thVar.getEditText().setTextSize(1, 17.0f);
        thVar.getEmojiButton().setLayoutParams(k7.c6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        lVar.addView(thVar, k7.c6.e(-1, -2, 119));
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        qhVar.addView(imageView3, k7.c6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        qg.b c12 = this.D2.c(lVar, sg.b.m(g6Var), false);
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        lVar.setBackground(c12);
        lVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        k6 k6Var3 = new k6(context, false, false, false);
        this.v = k6Var3;
        k6Var3.setScaleProperty(0.6f);
        k6Var3.setVisibility(8);
        k6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var3.setTextColor(getThemedColor(i14));
        k6Var3.setTypeface(AndroidUtilities.bold());
        k6Var3.setGravity(17);
        k6Var3.setAllowCancel(true);
        lVar.addView(k6Var3, k7.c6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.Xd), mode2));
        thVar.addView(imageView5, k7.c6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view2) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f29111y = imageView6;
        j0 j0Var3 = new j0(context);
        this.B = j0Var3;
        imageView6.setImageDrawable(j0Var3);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        lVar.addView(imageView6, k7.c6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.e6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33505b;

            {
                this.f33505b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                boolean z13;
                org.telegram.ui.xn xnVar;
                switch (r3) {
                    case 0:
                        final mi miVar = this.f33505b;
                        qh qhVar2 = miVar.B0;
                        if (qhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(miVar.getContext(), g6Var);
                            f0Var.m0(qhVar2.getText());
                            f0Var.f26694g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar22 = miVar.B0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = miVar.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = miVar.W;
                            if (miVar.E1 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ch chVar = new ch(miVar, 0);
                            f0Var.f26696i0 = j10;
                            f0Var.f26697j0 = z12;
                            f0Var.f26698k0 = chVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final mi miVar2 = this.f33505b;
                        th thVar2 = miVar2.M0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(miVar2.getContext(), g6Var);
                            f0Var2.m0(thVar2.getText());
                            f0Var2.f26694g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar22 = miVar2.B0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar22 = miVar2.M0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = miVar2.W;
                            if (miVar2.E1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar2 = new ch(miVar2, 1);
                            f0Var2.f26696i0 = j11;
                            f0Var2.f26697j0 = z13;
                            f0Var2.f26698k0 = chVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        mi miVar3 = this.f33505b;
                        miVar3.f29058h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = miVar3.f29040c0;
                        t12.K2(null, p2Var2, g6Var);
                        PhotoViewer.t1().L2(miVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = miVar3.P1;
                        boolean z14 = miVar3.Q1;
                        t13.h = i142;
                        t13.f34337n = z14;
                        if (!miVar3.W1.h0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(miVar3.getContainer().findFocus());
                        }
                        File w10 = qh.s6.w(miVar3.G1, "webp");
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
                        lh lhVar = new lh(miVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.xn) {
                            xnVar = (org.telegram.ui.xn) p2Var2;
                        } else {
                            xnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, xnVar);
                        if (miVar3.D) {
                            PhotoViewer.t1().Y0(null, null, true, miVar3.G);
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
        mh mhVar4 = new mh(this, context, 3);
        this.E0 = mhVar4;
        mhVar4.setFocusable(true);
        mhVar4.setFocusableInTouchMode(true);
        mhVar4.setVisibility(4);
        mhVar4.setScaleX(0.2f);
        mhVar4.setScaleY(0.2f);
        mhVar4.setAlpha(0.0f);
        mhVar4.setClipChildren(false);
        mhVar4.setClipToPadding(false);
        this.containerView.addView(mhVar4, k7.c6.e(110, 50, 85));
        vh vhVar = new vh(R.drawable.send_plane_24, context, g6Var, this);
        this.F0 = vhVar;
        vhVar.setImportantForAccessibility(2);
        mhVar4.addView(vhVar, k7.c6.e(-1, -1, 119));
        vhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        vhVar.F = dp2;
        vhVar.G = dp3;
        vhVar.J = AndroidUtilities.dp(7.0f);
        vhVar.K = AndroidUtilities.dp(6.0f);
        vhVar.f28719e0 = true;
        vhVar.setOnClickListener(new View.OnClickListener(this) {
            public final mi f33071b;

            {
                this.f33071b = this;
            }

            @Override
            public final void onClick(View view2) {
                sh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        mi miVar = this.f33071b;
                        long j10 = miVar.T0;
                        if (j10 < 0 && (n3Var = (sh.n3) miVar.f29097u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        mi miVar2 = this.f33071b;
                        boolean z13 = miVar2.Z;
                        if (!z13) {
                            miVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        mi miVar3 = this.f33071b;
                        boolean z14 = miVar3.Z;
                        if (z14) {
                            miVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f33071b.z1();
                        return;
                    case 4:
                        this.f33071b.X0.M(null, null);
                        return;
                    case 5:
                        mi.s(this.f33071b);
                        return;
                    case 6:
                        ei eiVar = this.f33071b.f29100v0;
                        if (eiVar != null) {
                            eiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f33071b.f29058h1.M(null, null);
                        return;
                    default:
                        mi miVar4 = this.f33071b;
                        if (miVar4.f29100v0 != miVar4.f29074n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        miVar4.Z1(z12);
                        return;
                }
            }
        });
        vhVar.setOnLongClickListener(new org.telegram.ui.ag(this, context, g6Var, p2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        oh ohVar2 = new oh(this, context, 1);
        ohVar2.setAlpha(0.0f);
        ohVar2.setScaleX(0.2f);
        ohVar2.setScaleY(0.2f);
        if (z4) {
            c1();
            this.navBarColorKey = -1;
        }
        cl0 fastScroll = chatAttachAlertPhotoLayout.B.getFastScroll();
        og.a aVar6 = this.D2;
        rg.d m9 = sg.b.m(g6Var);
        tl0 tl0Var = fastScroll.f26043l0;
        qg.b c13 = aVar6.c(tl0Var.f31363c1, m9, false);
        fastScroll.f26030b0 = c13;
        c13.o(AndroidUtilities.dp(4.0f));
        fastScroll.f26030b0.p(AndroidUtilities.dp(24.0f));
        qg.b c14 = aVar6.c(tl0Var.f31363c1, m9, false);
        fastScroll.f26032c0 = c14;
        c14.o(AndroidUtilities.dp(6.0f));
        fastScroll.f26032c0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f26032c0.p(AndroidUtilities.dp(f10));
        xd0 xd0Var = new xd0(context);
        this.P = xd0Var;
        this.containerView.addView(xd0Var, k7.c6.c(-1.0f, -1));
        rg.d dVar3 = new rg.d(g6Var);
        dVar3.f46811e = new tg(this, 4);
        dVar3.f46810c = new tg(this, 5);
        dVar3.d = new tg(this, 6);
        dVar3.f46809b = new tg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f46813n = dpf2;
        dVar3.f46814r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f46812f = dpf23;
        dVar3.h = dpf24;
        k1Var.M(this.D2, dVar3, false);
        jVar.i(1L, false);
    }

    public static void M(mi miVar) {
        boolean q10;
        int i10;
        int i11;
        fg.k1 k1Var = miVar.U0;
        xg.f fVar = miVar.f29092s1;
        if (fVar != null && k1Var != null) {
            org.telegram.ui.ActionBar.g6 g6Var = miVar.resourcesProvider;
            if (g6Var != null) {
                q10 = g6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (k1Var.getVisibility() == 0) {
                if (q10) {
                    i11 = 255;
                } else {
                    i11 = 160;
                }
                i10 = (int) (k1Var.getAlpha() * i11);
            } else {
                i10 = 0;
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void Q(mi miVar) {
        zh zhVar = new zh(miVar, miVar.getContext(), miVar.W, LaunchActivity.R(), miVar.resourcesProvider, 0);
        miVar.f29114y2 = zhVar;
        zhVar.p(new org.telegram.ui.Cells.f1(miVar, 3));
        ViewGroup viewGroup = miVar.containerView;
        viewGroup.addView(miVar.f29114y2, viewGroup.indexOfChild(miVar.A0), k7.c6.e(-1, -1, 83));
        zh zhVar2 = miVar.f29114y2;
        zhVar2.getAdapter().f48695c = false;
        zhVar2.getAdapter().d = false;
        zhVar2.getAdapter().f48698e = false;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
        boolean z4 = true;
        if (p2Var instanceof org.telegram.ui.xn) {
            zhVar2.getAdapter().f48705j0 = false;
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            uf.u0 adapter = zhVar2.getAdapter();
            xnVar.i();
            TLRPC.Chat chat = xnVar.f43165e;
            adapter.getClass();
            adapter.f48704i0 = chat;
            zhVar2.getAdapter().W(xnVar.W7);
            uf.u0 adapter2 = zhVar2.getAdapter();
            if (xnVar.f43165e == null) {
                z4 = false;
            }
            adapter2.f48694b0 = z4;
        } else {
            zhVar2.getAdapter().f48705j0 = true;
            zhVar2.getAdapter().W(null);
            zhVar2.getAdapter().f48694b0 = false;
        }
        zhVar2.getAdapter().f48696c0 = false;
        miVar.U1();
    }

    public static void m(mi miVar, ValueAnimator valueAnimator) {
        miVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.f3 f3Var = miVar.container;
        if (f3Var != null) {
            f3Var.invalidate();
        }
    }

    public static void n(mi miVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.b3 b3Var) {
        miVar.currentSheetAnimation = null;
        miVar.f29072m2 = null;
        animationNotificationsLocker.unlock();
        miVar.currentSheetAnimationType = 0;
        if (b3Var != null) {
            b3Var.onOpenAnimationEnd();
        }
        if (miVar.useHardwareLayer) {
            miVar.container.setLayerType(0, null);
        }
        if (miVar.isFullscreen) {
            WindowManager.LayoutParams attributes = miVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            miVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(mi miVar, int i10) {
        miVar.navBarColorKey = -1;
        miVar.navBarColor = i10;
        miVar.containerView.invalidate();
    }

    public static void p(mi miVar) {
        o1.j jVar = miVar.f29072m2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(miVar.containerView, o1.h.f16319n, 0.0f);
        miVar.f29072m2 = jVar2;
        jVar2.f16336u.a(1.5f);
        miVar.f29072m2.f16336u.b(1500.0f);
        miVar.f29072m2.f();
    }

    public static boolean q(org.telegram.ui.Components.mi r45, android.content.Context r46, org.telegram.ui.ActionBar.g6 r47, org.telegram.ui.ActionBar.p2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.q(org.telegram.ui.Components.mi, android.content.Context, org.telegram.ui.ActionBar.g6, org.telegram.ui.ActionBar.p2, android.view.View):boolean");
    }

    public static void r(mi miVar, mh.p6 p6Var) {
        AnimatorSet animatorSet = miVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            p6Var.run();
        }
    }

    public static void s(mi miVar) {
        int i10;
        if (miVar.f29054g0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z4 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24738p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i11 = 0; i11 < chatAttachAlertPhotoLayout.B.getChildCount(); i11++) {
                            View childAt = chatAttachAlertPhotoLayout.B.getChildAt(i11);
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
            SharedConfig.photoLiveDefault = z4;
            edit.putBoolean("photoLiveDefault", z4).apply();
            chatAttachAlertPhotoLayout.v0();
        }
        miVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = miVar.Z0;
        qh.f3 f3Var = miVar.f29034a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        qh.f3 f3Var2 = new qh.f3(miVar.getContext(), 1);
        miVar.f29034a1 = f3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        f3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        miVar.f29034a1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        miVar.f29034a1.n(1.0f, -((miVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        miVar.f29034a1.setTranslationY(miVar.X0.getTranslationY());
        qh.f3 f3Var3 = miVar.f29034a1;
        f3Var3.f45298i0 = new org.telegram.ui.mp(17, miVar, f3Var2);
        miVar.containerView.addView(f3Var3, k7.c6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        miVar.f29034a1.v();
    }

    public static void t(mi miVar, boolean z4, wg wgVar) {
        Integer num;
        miVar.f29100v0.s(1.0f);
        miVar.f29104w0.s(1.0f);
        miVar.f29100v0.k(miVar.f29062i2);
        miVar.f29104w0.k(miVar.f29062i2);
        miVar.containerView.invalidate();
        fg.k1 k1Var = miVar.U0;
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        k1Var.setTag(num);
        wgVar.run();
    }

    public static void v(mi miVar, org.telegram.ui.ActionBar.g6 g6Var, View view) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int i10;
        mi miVar2 = miVar;
        nh nhVar = miVar2.f29101v1;
        ei[] eiVarArr = miVar2.f29094t0;
        org.telegram.ui.ActionBar.p2 p2Var2 = miVar2.f29040c0;
        if (p2Var2 == null) {
            p2Var = LaunchActivity.R();
        } else {
            p2Var = p2Var2;
        }
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (view instanceof gi) {
                Activity parentActivity = p2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z4 = true;
                if (i10 == 1) {
                    if (miVar2.I1 || miVar2.J1 || !miVar2.a1()) {
                        if (!miVar2.I1 && !miVar2.J1) {
                            tn tnVar = new tn(1, miVar2.getContext(), g6Var, miVar2);
                            miVar2.Q = tnVar;
                            miVar2.Q1(tnVar);
                        }
                        miVar2.Q1(miVar2.f29054g0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (miVar2.K1 || !miVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(miVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        miVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (miVar2.H1 || !miVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(miVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        miVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (miVar2.N1 || !miVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && miVar2.N1 && miVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(miVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        miVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((miVar2.N1 || !miVar2.a1()) && AndroidUtilities.isMapsInstalled(p2Var2)) {
                        if (!miVar2.N1) {
                            tn tnVar2 = new tn(6, miVar2.getContext(), g6Var, miVar2);
                            miVar2.Q = tnVar2;
                            miVar2.Q1(tnVar2);
                        } else {
                            if (miVar2.f29069l0 == null) {
                                cl clVar = new cl(miVar2, miVar2.getContext(), g6Var, (miVar2.E || miVar2.O1) ? false : false);
                                miVar2.f29069l0 = clVar;
                                eiVarArr[5] = clVar;
                                wk wkVar = miVar2.f29085q2;
                                if (wkVar != null) {
                                    clVar.setDelegate(wkVar);
                                } else {
                                    clVar.setDelegate(new tg(miVar2, 9));
                                }
                            }
                            miVar2.Q1(miVar2.f29069l0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (miVar2.L1 || !miVar2.a1()) {
                        if (!miVar2.L1) {
                            tn tnVar3 = new tn(9, miVar2.getContext(), g6Var, miVar2);
                            miVar2.Q = tnVar3;
                            miVar2.Q1(tnVar3);
                        } else {
                            miVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (miVar2.f29080p0 == null) {
                        vf.c0 c0Var = new vf.c0(miVar2.getContext(), miVar2.resourcesProvider, miVar2);
                        miVar2.f29080p0 = c0Var;
                        eiVarArr[7] = c0Var;
                        c0Var.setupBlurredSearchField(miVar2.D2);
                    }
                    miVar2.Q1(miVar2.f29080p0);
                } else if (i10 == 12) {
                    if (miVar2.M1 || !miVar2.a1()) {
                        if (!miVar2.M1) {
                            tn tnVar4 = new tn(9, miVar2.getContext(), g6Var, miVar2);
                            miVar2.Q = tnVar4;
                            miVar2.Q1(tnVar4);
                        } else {
                            if (miVar2.f29066k0 == null) {
                                sn snVar = new sn(miVar, miVar.getContext(), true, g6Var, null);
                                miVar2 = miVar;
                                miVar2.f29066k0 = snVar;
                                eiVarArr[1] = snVar;
                                snVar.setDelegate(new tg(miVar2, 10));
                            }
                            miVar2.Q1(miVar2.f29066k0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (miVar2.f29087r0 == null) {
                        kk kkVar = new kk(miVar2, miVar2.getContext(), g6Var, true);
                        miVar2.f29087r0 = kkVar;
                        eiVarArr[8] = kkVar;
                        kkVar.setDelegate(miVar2.X1);
                    }
                    miVar2.Q1(miVar2.f29087r0);
                } else if (i10 == 14) {
                    if (miVar2.f29083q0 == null) {
                        kk kkVar2 = new kk(miVar2, miVar2.getContext(), g6Var, false);
                        miVar2.f29083q0 = kkVar2;
                        eiVarArr[9] = kkVar2;
                        kkVar2.setDelegate(miVar2.X1);
                    }
                    miVar2.Q1(miVar2.f29083q0);
                } else if (i10 == 16) {
                    if (miVar2.f29091s0 == null) {
                        wh.q qVar = new wh.q(miVar2.G1, miVar2.getContext(), g6Var, miVar2);
                        miVar2.f29091s0 = qVar;
                        eiVarArr[10] = qVar;
                    }
                    miVar2.Q1(miVar2.f29091s0);
                } else if (view.getTag() instanceof Integer) {
                    miVar2.W1.I1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, miVar2.s1(), false, 0L);
                }
            } else if (view instanceof fi) {
                fi fiVar = (fi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = fiVar.f26924c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        vi1.a(miVar2.getContext(), new oh.a2(5, miVar2, fiVar), null);
                    } else {
                        miVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    miVar2.W1.o1(fiVar.f26923b);
                    miVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                nhVar.v0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > nhVar.getMeasuredWidth()) {
                nhVar.v0(i14 - nhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(mi miVar) {
        ei eiVar;
        qm qmVar;
        miVar.f29084q1 = null;
        ei eiVar2 = miVar.f29100v0;
        if (eiVar2 != miVar.f29054g0 && (eiVar = miVar.f29104w0) != (qmVar = miVar.f29074n0) && eiVar2 != eiVar && eiVar2 != qmVar) {
            miVar.containerView.removeView(eiVar2);
        }
        miVar.f29100v0.setVisibility(8);
        miVar.f29100v0.q();
        miVar.f29104w0.E();
        miVar.f29100v0 = miVar.f29104w0;
        miVar.f29104w0 = null;
        int[] iArr = miVar.Y1;
        iArr[0] = iArr[1];
        miVar.H1(miVar.Z, false);
        miVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z4 = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (i10 == 3) {
            if (this.K1 || !a1()) {
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
            if (this.f29069l0 == null) {
                cl clVar = new cl(this, getContext(), this.resourcesProvider, (this.E || this.O1) ? false : false);
                this.f29069l0 = clVar;
                this.f29094t0[5] = clVar;
                wk wkVar = this.f29085q2;
                if (wkVar != null) {
                    clVar.setDelegate(wkVar);
                } else if (p2Var instanceof org.telegram.ui.xn) {
                    clVar.setDelegate(new tg(this, 16));
                }
            }
            Q1(this.f29069l0);
        }
    }

    public final void B1(boolean z4) {
        if (!this.K1 && z4) {
            tn tnVar = new tn(3, getContext(), this.resourcesProvider, this);
            this.Q = tnVar;
            Q1(tnVar);
        }
        int i10 = 1;
        if (this.f29060i0 == null) {
            xi xiVar = new xi(getContext(), this.resourcesProvider, this);
            this.f29060i0 = xiVar;
            this.f29094t0[3] = xiVar;
            xiVar.setupBlurredSearchField(this.D2);
            this.f29060i0.setDelegate(new tg(this, 13));
            if (this.E) {
                this.f29060i0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            TLRPC.Chat chat = ((org.telegram.ui.xn) p2Var).f43165e;
            xi xiVar2 = this.f29060i0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.E1 == null) {
                i10 = -1;
            }
            xiVar2.setMaxSelectedFiles(i10);
        }
        if (z4) {
            Q1(this.f29060i0);
        }
    }

    public final void C1() {
        if (this.f29077o0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
            ?? eiVar = new ei(context, g6Var, this);
            eiVar.f25602r = AndroidUtilities.dp(80.0f);
            eiVar.f25604w = 3;
            mh.d1 d1Var = new mh.d1(eiVar, context, g6Var, 9);
            eiVar.f25601n = d1Var;
            ra raVar = new ra(eiVar, context);
            eiVar.v = raVar;
            d1Var.setAdapter(raVar);
            d1Var.setClipToPadding(false);
            d1Var.setItemAnimator(null);
            d1Var.setLayoutAnimation(null);
            d1Var.setVerticalScrollBarEnabled(false);
            d1Var.setGlowColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A5, eiVar.f26545a));
            eiVar.addView(d1Var, k7.c6.c(-1.0f, -1));
            d1Var.setOnScrollListener(new fg.e2(eiVar, 18));
            zi ziVar = new zi(eiVar, eiVar.f25602r, 0);
            eiVar.f25603s = ziVar;
            ziVar.O = new lh.n5(eiVar, 2);
            d1Var.setLayoutManager(ziVar);
            this.f29077o0 = eiVar;
            eiVar.setDelegate(new xa(this, 1));
        }
        Q1(this.f29077o0);
    }

    public final void D1() {
        boolean z4;
        if (!this.N1) {
            tn tnVar = new tn(5, getContext(), this.resourcesProvider, this);
            this.Q = tnVar;
            Q1(tnVar);
        }
        if (this.f29057h0 == null) {
            sj sjVar = new sj(getContext(), this.resourcesProvider, this);
            this.f29057h0 = sjVar;
            this.f29094t0[2] = sjVar;
            sjVar.setupBlurredSearchField(this.D2);
            this.f29057h0.setDelegate(new wh(this));
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            TLRPC.Chat chat = ((org.telegram.ui.xn) p2Var).f43165e;
            sj sjVar2 = this.f29057h0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z4 = false;
            } else {
                z4 = true;
            }
            sjVar2.setMultipleSelectionAllowed(z4);
        }
        Q1(this.f29057h0);
    }

    public final void E1(boolean z4) {
        int i10;
        if (!this.H1 && z4) {
            tn tnVar = new tn(4, getContext(), this.resourcesProvider, this);
            this.Q = tnVar;
            Q1(tnVar);
        }
        boolean z10 = false;
        if (this.m0 == null) {
            if (this.K) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            jk jkVar = new jk(i10, getContext(), this.resourcesProvider, this);
            this.m0 = jkVar;
            this.f29094t0[4] = jkVar;
            jkVar.setDelegate(new xh(this));
        }
        int i11 = 1;
        if (this.E) {
            this.m0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
            if (p2Var instanceof org.telegram.ui.xn) {
                TLRPC.Chat chat = ((org.telegram.ui.xn) p2Var).f43165e;
                jk jkVar2 = this.m0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.E1 == null) {
                    i11 = -1;
                }
                jkVar2.setMaxSelectedFiles(i11);
            } else {
                this.m0.setMaxSelectedFiles(this.P1);
                jk jkVar3 = this.m0;
                if (!this.K && !this.T) {
                    z10 = true;
                }
                jkVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        jk jkVar4 = this.m0;
        jkVar4.f28139a0 = this.K;
        if (z4) {
            Q1(jkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        fg.k1 k1Var = this.U0;
        int i10 = 1;
        if (k1Var.f21546k0) {
            k1Var.h(true);
        }
        this.f29057h0 = null;
        this.f29080p0 = null;
        this.f29060i0 = null;
        this.f29063j0 = null;
        this.f29066k0 = null;
        this.f29069l0 = null;
        this.m0 = null;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i10 < eiVarArr.length) {
                ei eiVar = eiVarArr[i10];
                if (eiVar != null) {
                    eiVar.m();
                    this.containerView.removeView(eiVarArr[i10]);
                    eiVarArr[i10] = null;
                }
                i10++;
            } else {
                T1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    public final boolean G1(final int i10, final boolean z4, final int i11, final boolean z10, final long j10) {
        if (this.F1) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            TLRPC.Chat chat = xnVar.f43165e;
            if (xnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.G1).edit();
                edit.putBoolean("silent_" + xnVar.a(), !z4).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f50506f) {
            this.F1 = true;
            this.W1.I1(7, true, z4, i10, i11, j10, z10, false, 0L);
            return true;
        }
        long n12 = n1();
        ei eiVar = this.f29100v0;
        if (eiVar != null) {
            i12 = eiVar.getSelectedItemsCount();
        }
        return z4.b0(this.G1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                mi miVar = mi.this;
                miVar.F1 = true;
                miVar.W1.I1(7, true, z4, i10, i11, j10, z10, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z4, boolean z10) {
        final boolean z11;
        boolean z12;
        final boolean z13;
        int i10;
        float f10;
        float f11;
        float measuredHeight;
        this.f29035b.a(z4, z10);
        fu m12 = m1();
        this.Z = z4;
        fu m13 = m1();
        int i11 = 0;
        if (this.A0.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ei eiVar = this.f29100v0;
        if (eiVar != this.f29054g0 && eiVar != this.f29074n0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.Z && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i12 = 8;
        float f12 = 1.0f;
        ag.l lVar = this.L0;
        ph phVar = this.f29115z0;
        float f13 = 0.0f;
        if (z10) {
            if (z11) {
                i12 = 0;
            }
            lVar.setVisibility(i12);
            ViewPropertyAnimator animate = lVar.animate();
            if (z13 && z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).setUpdateListener(new ug(this, 0)).withEndAction(new Runnable(this) {
                public final mi f31904b;

                {
                    this.f31904b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            mi miVar = this.f31904b;
                            if (!z13 || !z11) {
                                miVar.L0.setVisibility(8);
                            }
                            miVar.b2();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f31904b.f29115z0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            phVar.setVisibility(0);
            ViewPropertyAnimator animate2 = phVar.animate();
            if (!z13 && z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = phVar.getMeasuredHeight();
            }
            animate2.translationY(measuredHeight).alpha((z13 || !z11) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(prVar).setUpdateListener(new ug(this, 1)).withEndAction(new Runnable(this) {
                public final mi f31904b;

                {
                    this.f31904b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            mi miVar = this.f31904b;
                            if (!z13 || !z11) {
                                miVar.L0.setVisibility(8);
                            }
                            miVar.b2();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f31904b.f29115z0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z13 && z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            lVar.setVisibility(i10);
            if (z13 && z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            lVar.setAlpha(f10);
            b2();
            phVar.setAlpha((z13 || !z11) ? 0.0f : 0.0f);
            if (z13 || !z11) {
                f13 = phVar.getMeasuredHeight();
            }
            phVar.setTranslationY(f13);
            phVar.setVisibility((z13 || !z11) ? 8 : 8);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(u5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new wg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f29054g0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.E1 == messageObject && this.D1 == i10) {
            return;
        }
        this.E1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.E1.isMusic()) {
                i10 = 2;
            } else if (this.E1.isDocument()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        this.D1 = i10;
        if (this.E1 != null) {
            this.P1 = 1;
            this.Q1 = false;
        } else {
            this.P1 = -1;
            this.Q1 = true;
        }
        this.f29109x1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z4) {
        if (this.E1 != null) {
            return;
        }
        this.P1 = i10;
        this.Q1 = z4;
    }

    public final void K1(float f10) {
        boolean z4 = false;
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z4);
        getContainer().invalidate();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        ei eiVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            sn snVar = this.f29063j0;
            if (snVar != null && ((eiVar = this.f29104w0) == snVar || this.f29100v0 == snVar)) {
                if (eiVar == snVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            sn snVar2 = this.f29066k0;
            if (snVar2 != null) {
                ei eiVar2 = this.f29104w0;
                if (eiVar2 == snVar2 || this.f29100v0 == snVar2) {
                    if (eiVar2 != snVar2) {
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
            vh vhVar = this.F0;
            if (vhVar != null) {
                vhVar.setEphemeralFactor(f10);
                vhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void L1(String str) {
        boolean z4 = true;
        this.N0 = 1;
        this.C = true;
        this.P0 = false;
        this.J1 = false;
        this.f29098u1.setVisibility(8);
        this.f29055g1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
        if (chatAttachAlertPhotoLayout != null) {
            mi miVar = chatAttachAlertPhotoLayout.f26546b;
            chatAttachAlertPhotoLayout.f24748d1 = (miVar.N0 == 0 || miVar.C) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.M1(boolean):void");
    }

    public final void N1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.p2 p2Var) {
        if ((p2Var instanceof org.telegram.ui.xn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.xn) p2Var).f43165e)) {
            new qc(this.f29078o1, this.resourcesProvider).f(MessagesController.getInstance(this.G1).captionLengthLimitPremium, new org.telegram.ui.mp(18, this, p2Var)).j();
        }
    }

    public final boolean P1(boolean z4, boolean z10) {
        boolean z11;
        Integer num;
        boolean z12;
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
        ei eiVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        fg.k1 k1Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        this.f29039c.a(z4, true);
        mh mhVar = this.A0;
        if (mhVar.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 == z11) {
            return false;
        }
        AnimatorSet animatorSet = this.J0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        mhVar.setTag(num);
        qh qhVar = this.B0;
        if (qhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        qhVar.k(true);
        this.M0.k(true);
        mh mhVar2 = this.f29098u1;
        mh mhVar3 = this.E0;
        if (z4) {
            if (!this.K) {
                mhVar.setVisibility(0);
            }
            mhVar3.setVisibility(0);
        } else if (this.P0) {
            mhVar2.setVisibility(0);
        }
        ei eiVar2 = this.f29100v0;
        if ((eiVar2 == this.f29054g0 || eiVar2 == this.f29074n0) && this.Z) {
            z12 = true;
        } else {
            z12 = false;
        }
        fg.k1 k1Var2 = this.U0;
        ag.l lVar = this.L0;
        ph phVar = this.f29115z0;
        vh vhVar = this.F0;
        float f27 = 0.2f;
        float f28 = 1.0f;
        if (z10) {
            float f29 = 0.0f;
            this.J0 = new AnimatorSet();
            if (z12) {
                lVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z4) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mhVar, property, f19));
            if (z4 && !z12) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(phVar, property, f20));
            if (z4 && !z12) {
                phVar.setVisibility(0);
                k1Var = k1Var2;
                arrayList.add(ObjectAnimator.ofFloat(phVar, View.TRANSLATION_Y, 0.0f));
            } else {
                k1Var = k1Var2;
            }
            if (z4 && z12) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(lVar, property, f21));
            Property property2 = View.SCALE_X;
            if (z4) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z4) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, property3, f23));
            if (z4) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, property, f24));
            if (z4) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar, property2, f25));
            if (z4) {
                f27 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar, property3, f27));
            if (k1Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z4) {
                    f29 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(mhVar, property4, f29));
            } else if (this.P0) {
                Property property5 = View.TRANSLATION_Y;
                if (z4) {
                    f26 = AndroidUtilities.dp(36.0f);
                } else {
                    f26 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, property5, f26));
                if (z4) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, property, f28));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ug(this, 4));
                arrayList.add(ofFloat);
            }
            this.J0.playTogether(arrayList);
            this.J0.setInterpolator(new DecelerateInterpolator());
            this.J0.setDuration(180L);
            this.J0.addListener(new org.telegram.ui.ActionBar.g(this, z4, z12, 3));
            this.J0.start();
            i10 = 0;
        } else {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mhVar.setAlpha(f10);
            if (z4 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            phVar.setAlpha(f11);
            if (z4 && !z12) {
                i10 = 0;
                phVar.setVisibility(0);
                phVar.setTranslationY(0.0f);
            } else {
                i10 = 0;
            }
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            mhVar3.setScaleX(f12);
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            mhVar3.setScaleY(f13);
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            mhVar3.setAlpha(f14);
            if (z4 && z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lVar.setVisibility(i11);
            if (z4 && z12) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            lVar.setAlpha(f15);
            if (z4) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            vhVar.setScaleX(f16);
            if (z4) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            vhVar.setScaleY(f17);
            if (k1Var2.getTag() != null) {
                if (z4) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                mhVar.setTranslationY(dp);
            } else if (this.P0 && ((eiVar = this.f29100v0) == null || eiVar.I())) {
                if (z4) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = 0.0f;
                }
                mhVar2.setTranslationY(f18);
            }
            if (!z4) {
                mhVar.setVisibility(4);
                mhVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z4) {
            i10 = Math.max(1, this.f29100v0.getSelectedItemsCount());
        }
        vhVar.g(i10, z10);
        if (this.E1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.G1).getSendPaidMessagesStars(n1());
        }
        vhVar.i(j1() + this.f29100v0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), vhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            qhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(ei eiVar) {
        long j10 = this.T0;
        tn tnVar = this.Q;
        if (eiVar == tnVar) {
            j10 = tnVar.f31415s;
        } else if (eiVar == this.f29054g0) {
            j10 = 1;
        } else if (eiVar == this.f29060i0) {
            j10 = 3;
        } else if (eiVar == this.m0) {
            j10 = 4;
        } else if (eiVar == this.f29057h0) {
            j10 = 5;
        } else if (eiVar == this.f29069l0) {
            j10 = 6;
        } else if (eiVar == this.f29063j0) {
            j10 = 9;
        } else if (eiVar == this.f29077o0) {
            j10 = 10;
        } else if (eiVar == this.f29080p0) {
            j10 = 11;
        } else if (eiVar == this.f29066k0) {
            j10 = 12;
        } else if (eiVar == this.f29083q0) {
            j10 = 14;
        } else if (eiVar == this.f29087r0) {
            j10 = 13;
        } else if (eiVar == this.f29091s0) {
            j10 = 16;
        }
        R1(eiVar, j10, true);
    }

    public final void R1(ei eiVar, long j10, boolean z4) {
        boolean z10;
        int i10;
        bm bmVar;
        boolean z11;
        Integer num;
        bm bmVar2;
        int dp;
        int i11;
        int dp2;
        nh nhVar;
        boolean z12;
        if (this.f29084q1 == null && this.J0 == null) {
            ei eiVar2 = this.f29100v0;
            if (eiVar2 == eiVar) {
                eiVar2.F();
            } else if (eiVar == this.f29066k0 && !UserConfig.getInstance(this.G1).isPremium()) {
                new fg.n1(this.f29040c0, 39, false).show();
            } else {
                int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f29050f.a(z10, z4);
                this.f29073n.i(Long.valueOf(j10), z4);
                this.A1 = false;
                this.f29113y1 = false;
                this.C1 = 0.0f;
                this.B1.setVisibility(8);
                RadialProgressView radialProgressView = this.f29116z1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                mh mhVar = this.f29098u1;
                mhVar.setAlpha(1.0f);
                mhVar.setTranslationY(this.C1);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f29097u0;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((sh.n3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.T0 = j10;
                nh nhVar2 = this.f29101v1;
                int childCount = nhVar2.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = nhVar2.getChildAt(i14);
                    if (childAt instanceof gi) {
                        gi giVar = (gi) childAt;
                        nhVar = nhVar2;
                        if (giVar.f27203b == giVar.f27204c.T0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        giVar.f27492a.e(z12, true);
                    } else {
                        nhVar = nhVar2;
                        if (childAt instanceof fi) {
                            ((fi) childAt).a(true);
                        }
                    }
                    i14++;
                    nhVar2 = nhVar;
                }
                int firstOffset = (this.f29100v0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.Y1[0];
                this.f29104w0 = eiVar;
                eiVar.getClass();
                boolean z13 = eiVar instanceof wh.q;
                xg.f fVar = this.f29092s1;
                if (fVar != null) {
                    if (z13) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                oh ohVar = this.f29095t1;
                if (ohVar != null) {
                    if (z13) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    ohVar.setVisibility(i11);
                }
                if (this.f29104w0.h() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                fg.k1 k1Var = this.U0;
                k1Var.setVisibility(i10);
                if (k1Var.f21546k0) {
                    k1Var.h(true);
                }
                this.f29100v0.r();
                ei eiVar3 = this.f29104w0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
                if (eiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f29104w0.D(this.f29100v0);
                this.f29104w0.setVisibility(0);
                if (eiVar.getParent() != null) {
                    this.containerView.removeView(this.f29104w0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.f29100v0);
                ViewParent parent = this.f29104w0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    ei eiVar4 = this.f29104w0;
                    if (eiVar4 != this.f29069l0) {
                        indexOfChild++;
                    }
                    viewGroup.addView(eiVar4, indexOfChild, k7.c6.c(-1.0f, -1));
                }
                wg wgVar = new wg(this, 3);
                ei eiVar5 = this.f29100v0;
                boolean z14 = eiVar5 instanceof qm;
                yh yhVar = this.f29036b0;
                if (!z14 && !(this.f29104w0 instanceof qm)) {
                    if (z4) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f29104w0.setAlpha(0.0f);
                        this.f29104w0.setTranslationY(AndroidUtilities.dp(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f29100v0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f29100v0, yhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(k1Var, View.ALPHA, k1Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(pr.f30183f);
                        animatorSet.addListener(new mh.k3(this, firstOffset, wgVar, 1));
                        this.f29084q1 = animatorSet;
                        ei eiVar6 = this.f29100v0;
                        yhVar.getClass();
                        yhVar.b(eiVar6, 0.0f);
                        animatorSet.start();
                    } else {
                        eiVar5.setAlpha(0.0f);
                        wgVar.run();
                        a2(0);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.f29104w0.getWidth(), this.f29100v0.getWidth());
                    ei eiVar7 = this.f29104w0;
                    if (eiVar7 instanceof qm) {
                        eiVar7.setTranslationX(max);
                        ei eiVar8 = this.f29100v0;
                        if ((eiVar8 instanceof ChatAttachAlertPhotoLayout) && (bmVar2 = ((ChatAttachAlertPhotoLayout) eiVar8).M) != null) {
                            bmVar2.setVisibility(4);
                        }
                    } else {
                        this.f29100v0.setTranslationX(-max);
                        ei eiVar9 = this.f29104w0;
                        if (eiVar9 == chatAttachAlertPhotoLayout && (bmVar = ((ChatAttachAlertPhotoLayout) eiVar9).M) != null) {
                            bmVar.setVisibility(0);
                        }
                    }
                    this.f29104w0.setAlpha(1.0f);
                    this.f29100v0.setAlpha(1.0f);
                    if (z4) {
                        ei eiVar10 = this.f29100v0;
                        yhVar.getClass();
                        yhVar.b(eiVar10, 0.0f);
                        AndroidUtilities.runOnUIThread(new mh.p6(this, eiVar, wgVar, 29));
                    } else {
                        if (this.f29104w0.getCurrentItemTop() <= eiVar.getButtonsHideOffset()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f29100v0.s(1.0f);
                        this.f29104w0.s(1.0f);
                        this.f29100v0.k(this.f29062i2);
                        this.f29104w0.k(this.f29062i2);
                        this.containerView.invalidate();
                        ei eiVar11 = this.f29100v0;
                        yhVar.getClass();
                        yhVar.b(eiVar11, 1.0f);
                        if (z11) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        k1Var.setTag(num);
                        wgVar.run();
                    }
                }
                if (this.f29065j2 && !(eiVar instanceof sh.n3)) {
                    this.f29065j2 = false;
                    k1Var.e();
                    k1Var.invalidate();
                    u1();
                }
                if (i12 != 0 && j10 != 6 && !(eiVar instanceof sh.n3)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = 0;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                k1Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void S1(boolean z4, Boolean bool) {
        mi miVar;
        if (this.f29063j0 == null) {
            miVar = this;
            sn snVar = new sn(miVar, getContext(), false, this.resourcesProvider, bool);
            miVar.f29063j0 = snVar;
            miVar.f29094t0[1] = snVar;
            snVar.setDelegate(new tg(this, 15));
        } else {
            miVar = this;
        }
        R1(miVar.f29063j0, 9L, z4);
    }

    public final void T1(boolean z4, boolean z10) {
        Integer num;
        boolean z11;
        float f10;
        float f11;
        ei eiVar;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z12;
        this.d.a(z4, z10);
        fg.k1 k1Var = this.U0;
        if ((z4 && k1Var.getTag() == null) || (!z4 && k1Var.getTag() != null)) {
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            k1Var.setTag(num);
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            if (!this.C && !this.Q0 && ((this.N0 != 0 || !this.f29075n1) && this.f29100v0 == this.f29054g0 && (this.I1 || this.J1))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f29100v0 == this.Q) {
                z11 = false;
            }
            mh mhVar = this.f29098u1;
            org.telegram.ui.ActionBar.w0 w0Var = this.X0;
            if (z4) {
                if (z11) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.P0 && this.A0.getTag() == null) {
                mhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
            if (p2Var != null) {
                if (z4) {
                    if (this.f29049e2) {
                        i10 = org.telegram.ui.ActionBar.k6.f21952tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21731h5;
                    }
                    if (i0.a.f(getThemedColor(i10)) > 0.699999988079071d) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z12);
                } else {
                    AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
                }
            }
            float f15 = 0.6f;
            float f16 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V0 = animatorSet2;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f12 - k1Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(k1Var, property, f13));
                if (z11) {
                    if (z4) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z4) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z4) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property3, f15));
                }
                this.V0.playTogether(arrayList);
                this.V0.addListener(new eg.u2(22, this, z4));
                this.V0.setInterpolator(pr.h);
                this.V0.setDuration(380L);
                this.V0.start();
                return;
            }
            if (z4 && this.P0 && ((eiVar = this.f29100v0) == null || eiVar.I())) {
                mhVar.setVisibility(4);
            }
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            k1Var.setAlpha(f10);
            if (z11) {
                if (z4) {
                    f16 = 1.0f;
                }
                w0Var.setAlpha(f16);
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                w0Var.setScaleX(f11);
                if (z4) {
                    f15 = 1.0f;
                }
                w0Var.setScaleY(f15);
            }
            if (!z4) {
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f29037b1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.N0 != 0 || !this.f29075n1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.D0;
        qh qhVar = this.B0;
        qhVar.getLocationOnScreen(iArr);
        if (this.f29114y2 != null) {
            ei eiVar = this.f29100v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
            if ((eiVar == chatAttachAlertPhotoLayout || eiVar == this.f29074n0) && this.Z) {
                ag.l lVar = this.L0;
                alpha = (lVar.getAlpha() * lVar.getMeasuredHeight()) + (lVar.getY() - this.f29114y2.getTop());
            } else {
                alpha = -qhVar.getHeight();
            }
            if (Math.abs(this.f29114y2.getTranslationY() - alpha) > 0.5f) {
                this.f29114y2.setTranslationY(alpha);
                this.f29114y2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        g1();
    }

    public final void V1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f10;
        float f11;
        float f12;
        ei eiVar = this.f29100v0;
        int i10 = 0;
        if (eiVar == null) {
            g10 = false;
        } else {
            g10 = eiVar.g();
        }
        fg.s0 s0Var = this.f29041c1;
        s0Var.setEnabled(g10);
        ei eiVar2 = this.f29100v0;
        float f13 = 0.5f;
        if (eiVar2 != null) {
            if (eiVar2.g()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f29104w0 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.f29033a0;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ei eiVar3 = this.f29104w0;
        if (eiVar3 != null) {
            if (eiVar3.g()) {
                f13 = 1.0f;
            }
            f10 = e2.c.w(1.0f, this.f29033a0, f13, f10);
        }
        this.f29044d1 = f10;
        if (s0Var != null) {
            float f14 = f10 * this.f29048e1;
            s0Var.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            s0Var.setVisibility(i10);
        }
    }

    public final void X1(ei eiVar, int i10) {
        boolean z4;
        int i11;
        int i12;
        if (eiVar != null) {
            og.e eVar = this.f29117z2;
            if (eVar != null && Build.VERSION.SDK_INT >= 31) {
                eVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = eiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z10 = false;
                if (eiVar == this.f29100v0 && currentItemTop <= eiVar.getButtonsHideOffset()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.O = z4;
                if (eiVar == this.f29100v0) {
                    T1(z4, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int C = org.telegram.ui.b.C(11.0f, i11, currentItemTop);
                ei eiVar2 = this.f29100v0;
                if (eiVar2 == eiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((eiVar2 instanceof qm) || (this.f29104w0 instanceof qm)) {
                    Object obj = this.f29084q1;
                    if ((obj instanceof o1.j) && ((o1.j) obj).f16330f) {
                        z10 = true;
                    }
                }
                int[] iArr = this.Y1;
                int i13 = iArr[i12];
                if (i13 == C && !z10) {
                    if (i10 != 0) {
                        this.Z1 = i13;
                        return;
                    }
                    return;
                }
                this.Z1 = i13;
                iArr[i12] = C;
                a2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f27001a.length() <= 0) {
            return;
        }
        this.f29100v0.a(m1().getText());
    }

    public final void Y1(boolean z4) {
        lc0 lc0Var;
        boolean z10;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
        if (chatAttachAlertPhotoLayout != null && (lc0Var = this.Y0) != null) {
            int i10 = 0;
            if (this.f29075n1 && this.f29051f0 && this.f29100v0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !ChatAttachAlertPhotoLayout.S();
            lc0Var.f28694f = z11;
            if (!z4) {
                ((z5) lc0Var.f28695g).a(z11);
            }
            lc0Var.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.Z0;
            if (z4 && this.f29075n1) {
                w0Var.setVisibility(0);
                ViewPropertyAnimator animate = w0Var.animate();
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(pr.h).withEndAction(new fh(this, z10, 0)).start();
                return;
            }
            if (!z10) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
            if (z10) {
                f12 = 1.0f;
            }
            w0Var.setAlpha(f12);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            w0Var.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            w0Var.setScaleY(f13);
        }
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.Z0():void");
    }

    public final void Z1(boolean z4) {
        boolean z10;
        float f10;
        ei eiVar = this.f29054g0;
        if (z4) {
            if (!this.J) {
                return;
            }
            if (this.f29074n0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f29086r;
                if (g6Var == null) {
                    g6Var = this.resourcesProvider;
                }
                ?? eiVar2 = new ei(context, g6Var, this);
                eiVar2.f30420y = 0.0f;
                eiVar2.B = 0.0f;
                eiVar2.C = 0.0f;
                eiVar2.D = 0.0f;
                eiVar2.E = 0.0f;
                eiVar2.F = 0.0f;
                eiVar2.G = null;
                eiVar2.H = false;
                eiVar2.J = 0.0f;
                eiVar2.N = false;
                eiVar2.P = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eiVar2.Q = z10;
                eiVar2.f30415n = g6Var;
                eiVar2.f26549f = true;
                eiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = eiVar2.f26546b.U0.n();
                TextView textView = new TextView(context);
                eiVar2.f30419x = textView;
                org.telegram.ui.ActionBar.g6 g6Var2 = eiVar2.f26545a;
                wl wlVar = new wl(eiVar2, context, n10, g6Var2, 1);
                fg.k1 k1Var = eiVar2.f26546b.U0;
                if (AndroidUtilities.isTablet()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                k1Var.addView(wlVar, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                wlVar.addView(textView, k7.c6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                mh.d1 d1Var = new mh.d1(eiVar2, context, g6Var2, 12);
                eiVar2.f30416r = d1Var;
                d1Var.setAdapter(new org.telegram.ui.y7(eiVar2, 3));
                f2.j0 j0Var = new f2.j0(1, false);
                eiVar2.f30417s = j0Var;
                d1Var.setLayoutManager(j0Var);
                d1Var.setClipChildren(false);
                d1Var.setClipToPadding(false);
                d1Var.setOverScrollMode(2);
                d1Var.setVerticalScrollBarEnabled(false);
                pm pmVar = new pm(eiVar2, context);
                eiVar2.v = pmVar;
                pmVar.setClipToPadding(true);
                pmVar.setClipChildren(true);
                eiVar2.addView(d1Var, k7.c6.c(-1.0f, -1));
                eiVar2.M = eiVar2.f26546b.f29054g0;
                pmVar.f30116c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = eiVar2.M;
                pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                pmVar.c();
                UndoView undoView = new UndoView(context, null, false, eiVar2.f26546b.f29086r);
                eiVar2.f30418w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                eiVar2.addView(undoView, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                eiVar2.K = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f29074n0 = eiVar2;
                eiVar2.bringToFront();
            }
            ei eiVar3 = this.f29100v0;
            qm qmVar = this.f29074n0;
            if (eiVar3 != qmVar) {
                eiVar = qmVar;
            }
            Q1(eiVar);
            return;
        }
        Q1(eiVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ChatActivityEnterView.H(this.G1, ((org.telegram.ui.xn) p2Var).a(), p2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f29078o1.invalidate();
        ag.l lVar = this.L0;
        lVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
        if (chatAttachAlertPhotoLayout != null) {
            ql qlVar = chatAttachAlertPhotoLayout.B;
            chatAttachAlertPhotoLayout.V();
            if (qlVar != null && qlVar.getFastScroll() != null) {
                cl0 fastScroll = qlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f24764m1;
                if (this.Z) {
                    i10 = (int) (lVar.getAlpha() * lVar.getMeasuredHeight());
                }
                fastScroll.f26035e0 = currentActionBarHeight + i10;
                qlVar.getFastScroll().invalidate();
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
        nh nhVar = this.f29101v1;
        if (nhVar == null) {
            return;
        }
        int childCount = nhVar.getChildCount();
        boolean z4 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            nhVar.getChildAt(i20);
        }
        boolean z10 = this.f29049e2;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.f21741hg;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21766j5;
        }
        this.f29055g1.setTextColor(getThemedColor(i10));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.k6.f21741hg;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        }
        this.l1.setTextColor(getThemedColor(i11));
        this.f29041c1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
        if (z10) {
            i12 = org.telegram.ui.ActionBar.k6.f21741hg;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21766j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.w0 w0Var = this.X0;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z10) {
            i13 = org.telegram.ui.ActionBar.k6.f21758ig;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.k6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.k6.E8;
        w0Var.G(getThemedColor(i21), false);
        w0Var.G(getThemedColor(i21), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Z0;
        if (w0Var2 != null) {
            if (z10) {
                i19 = org.telegram.ui.ActionBar.k6.f21741hg;
            } else {
                i19 = org.telegram.ui.ActionBar.k6.f21766j5;
            }
            w0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f29037b1;
        if (w0Var3 != null) {
            if (z10) {
                i17 = org.telegram.ui.ActionBar.k6.f21741hg;
            } else {
                i17 = org.telegram.ui.ActionBar.k6.f21766j5;
            }
            w0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = w0Var3.getBackground();
            if (z10) {
                i18 = org.telegram.ui.ActionBar.k6.f21758ig;
            } else {
                i18 = org.telegram.ui.ActionBar.k6.I5;
            }
            org.telegram.ui.ActionBar.k6.w1(getThemedColor(i18), background2);
        }
        qh qhVar = this.B0;
        org.telegram.ui.ActionBar.g6 g6Var = qhVar.J;
        au auVar = qhVar.f27001a;
        int i22 = qhVar.I;
        if (i22 == 0) {
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, g6Var));
            int i23 = org.telegram.ui.ActionBar.k6.G6;
            auVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i23, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i23, g6Var));
        } else if (i22 != 2 && i22 != 3) {
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21944t5, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
        } else {
            auVar.setHintTextColor(-1929379841);
            auVar.setTextColor(-1);
            auVar.setCursorColor(-1);
            auVar.setHandlesColor(-1);
            auVar.setHighlightColor(822083583);
            auVar.quoteColor = -1;
        }
        qhVar.f27003c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
        bu buVar = qhVar.d;
        if (buVar != null) {
            buVar.U();
        }
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.A5));
        if (z10) {
            i14 = org.telegram.ui.ActionBar.k6.f21741hg;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.f21766j5;
        }
        int themedColor2 = getThemedColor(i14);
        fg.k1 k1Var = this.U0;
        k1Var.C(themedColor2, false);
        if (z10) {
            i15 = org.telegram.ui.ActionBar.k6.f21758ig;
        } else {
            i15 = org.telegram.ui.ActionBar.k6.I5;
        }
        k1Var.B(getThemedColor(i15), false);
        if (z10) {
            i16 = org.telegram.ui.ActionBar.k6.f21741hg;
        } else {
            i16 = org.telegram.ui.ActionBar.k6.f21766j5;
        }
        k1Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.k6.w1(q12, this.shadowDrawable);
        tg.c cVar = this.C2;
        if (cVar.f48086a.getColor() != q12) {
            cVar.a(q12);
            xg.f fVar = this.f29092s1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.f29095t1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i24 >= eiVarArr.length) {
                break;
            }
            ei eiVar = eiVarArr[i24];
            if (eiVar != null) {
                eiVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21749i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f29100v0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.f29072m2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.f29076n2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.H = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
                return;
            }
            return;
        }
        ji jiVar = this.f29109x1;
        if (jiVar != null) {
            jiVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z4) {
        if (z4) {
            this.f29110x2 = z4;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ki kiVar = this.W1;
        if (kiVar != null) {
            kiVar.B0(new wg(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f29100v0.o(i10);
    }

    public final void e1() {
        float f10 = this.f29039c.f50505e;
        float f11 = (1.0f - this.f29035b.f50505e) * f10;
        this.f29095t1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.f50505e))), 1.0f - f11));
    }

    public final void f1() {
        float f10;
        float f11 = this.f29046e.f50505e;
        float f12 = this.f29050f.f50505e;
        float b10 = lf.l0.b(this.h.f50505e);
        if (this.O1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        a20.d(this.C0, e2.c.z(f11, f12, b10, f10));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        vh vhVar = this.F0;
        mh mhVar = this.E0;
        ag.l lVar = this.L0;
        if (lVar != null && lVar.getVisibility() == 0 && lVar.getAlpha() != 0.0f) {
            float f10 = this.f29035b.f50505e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
            vhVar.setAlpha(abs * abs * abs * abs);
            mhVar.setTranslationY(AndroidUtilities.lerp(this.f29045d2, ((lVar.getTranslationY() + lVar.getTop()) - mhVar.getTop()) + AndroidUtilities.dp(8.0f), pr.f30186j.getInterpolation(f10)));
            return;
        }
        mhVar.setTranslationY(this.f29045d2);
        vhVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i10 < eiVarArr.length) {
                ei eiVar = eiVarArr[i10];
                if (eiVar != null && (themeDescriptions = eiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21749i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.P0 = true;
        this.f29098u1.setVisibility(0);
        this.E = true;
        this.F = i10;
        this.N0 = 0;
        this.C = false;
        this.D = false;
        this.G = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f29058h1;
        if (w0Var != null) {
            this.f29055g1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(qh.d4 d4Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f29055g1;
        textView.setText(string);
        this.P0 = false;
        this.f29098u1.setVisibility(8);
        this.N0 = 1;
        this.C = true;
        this.D = true;
        this.f29051f0 = false;
        this.G = d4Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.f29058h1;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if ((p2Var instanceof org.telegram.ui.xn) && (messagePreviewParams = ((org.telegram.ui.xn) p2Var).f43144c5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).f43165e;
        }
        return MessagesController.getInstance(this.G1).getChat(Long.valueOf(-this.W));
    }

    public final float l1() {
        mh mhVar = this.A0;
        float alpha = 1.0f - mhVar.getAlpha();
        return mhVar.getMeasuredHeight() - (alpha * (mhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final fu m1() {
        ei eiVar;
        if (this.Z && ((eiVar = this.f29100v0) == this.f29054g0 || eiVar == this.f29074n0)) {
            return this.M0;
        }
        return this.B0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return this.W;
    }

    public final int o1() {
        ei eiVar = this.f29100v0;
        sn snVar = this.f29063j0;
        if (eiVar == snVar && snVar.B != null) {
            return snVar.getEmojiPadding();
        }
        sn snVar2 = this.f29066k0;
        if (eiVar == snVar2 && snVar2.B != null) {
            return snVar2.getEmojiPadding();
        }
        if (this.Z) {
            return this.M0.getEmojiPadding();
        }
        return this.B0.getEmojiPadding();
    }

    @Override
    public final void onBackPressed() {
        if (this.P.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        fg.k1 k1Var = this.U0;
        if (k1Var.f21546k0) {
            k1Var.h(true);
        } else if (this.f29100v0.i()) {
        } else {
            if (m1() != null && m1().f27004e) {
                m1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f29100v0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z4;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
        i91 i91Var = chatAttachAlertPhotoLayout.f24757i0;
        eg.s2 s2Var = chatAttachAlertPhotoLayout.f24753g0;
        TextView textView = chatAttachAlertPhotoLayout.m0;
        ql qlVar = chatAttachAlertPhotoLayout.f24770r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == s2Var) {
            if (z4) {
                if (qlVar.getVisibility() == 0) {
                    s2Var.layout(0, org.telegram.messenger.y3.B(222.0f, i13, i16), i14, org.telegram.messenger.y3.B(96.0f, i13, i16));
                    return true;
                }
                s2Var.layout(0, org.telegram.messenger.y3.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (qlVar.getVisibility() == 0) {
                s2Var.layout(org.telegram.messenger.y3.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                s2Var.layout(org.telegram.messenger.y3.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == i91Var) {
            if (z4) {
                if (qlVar.getVisibility() == 0) {
                    i91Var.layout(0, org.telegram.messenger.y3.B(310.0f, i13, i16), i14, org.telegram.messenger.y3.B(260.0f, i13, i16));
                    return true;
                }
                i91Var.layout(0, org.telegram.messenger.y3.B(176.0f, i13, i16), i14, org.telegram.messenger.y3.B(126.0f, i13, i16));
                return true;
            } else if (qlVar.getVisibility() == 0) {
                i91Var.layout(org.telegram.messenger.y3.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                i91Var.layout(org.telegram.messenger.y3.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z4) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (qlVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (qlVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != qlVar) {
            return false;
        } else {
            if (z4) {
                int B = org.telegram.messenger.y3.B(88.0f, i15, i16);
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
        boolean z4;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
        fm fmVar = chatAttachAlertPhotoLayout.v;
        ql qlVar = chatAttachAlertPhotoLayout.f24770r;
        org.telegram.ui.k kVar = chatAttachAlertPhotoLayout.f24772s;
        if (i10 < i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        bm bmVar = chatAttachAlertPhotoLayout.M;
        if (view == bmVar) {
            if (chatAttachAlertPhotoLayout.V && !chatAttachAlertPhotoLayout.f24741a0) {
                bmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            eg.s2 s2Var = chatAttachAlertPhotoLayout.f24753g0;
            if (view == s2Var) {
                if (z4) {
                    s2Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                s2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            i91 i91Var = chatAttachAlertPhotoLayout.f24757i0;
            if (view == i91Var) {
                if (z4) {
                    i91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                i91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == qlVar) {
                chatAttachAlertPhotoLayout.G0 = true;
                if (z4) {
                    qlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (kVar.f5816o != 0) {
                        qlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        kVar.j1(0);
                        fmVar.l();
                    }
                } else {
                    qlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (kVar.f5816o != 1) {
                        qlVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        kVar.j1(1);
                        fmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.G0 = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        int i10;
        this.f29054g0.setTranslationX(0.0f);
        this.f29067k1.setAlpha(0.0f);
        this.f29061i1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29076n2 = animatorSet;
        yh yhVar = this.f29070l2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, yhVar, 0.0f, 400.0f));
        this.f29076n2.setDuration(400L);
        this.f29076n2.setStartDelay(20L);
        yhVar.set(this, Float.valueOf(0.0f));
        this.f29076n2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ug(this, 2));
        o1.j jVar = this.f29072m2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.f16319n, 0.0f);
        this.f29072m2 = jVar2;
        if (this.E1 != null) {
            jVar2.f16336u.a(0.75f);
            this.f29072m2.f16336u.b(350.0f);
        } else {
            jVar2.f16336u.a(0.75f);
            this.f29072m2.f16336u.b(350.0f);
        }
        this.f29072m2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.g3 g3Var = this.backDrawable;
        l6 l6Var = n6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(g3Var, l6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        mh.p6 p6Var = new mh.p6(this, animationNotificationsLocker, this.delegate, 28);
        this.f29072m2.a(new lb(1, this, p6Var));
        this.currentSheetAnimation.addListener(new eg.w2(19, this, p6Var));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new ug(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(pr.f30183f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f29100v0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f29100v0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f29040c0 instanceof org.telegram.ui.xn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f29100v0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f29081p1 = true;
        if (!this.J1 && !this.I1) {
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
            ((LaunchActivity) context).f34182y0.add(this.P);
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
            ((LaunchActivity) context).f34182y0.remove(this.P);
        }
    }

    public final int p1(int i10) {
        ei eiVar = this.f29104w0;
        int[] iArr = this.Y1;
        if (eiVar != null && ((this.f29100v0 instanceof qm) || (eiVar instanceof qm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f29033a0);
        }
        return iArr[i10];
    }

    public final int q1(boolean z4) {
        boolean q10;
        int i10;
        fg.k1 k1Var;
        if (this.f29049e2) {
            return getThemedColor(org.telegram.ui.ActionBar.k6.f21952tg);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Iterator it = this.f29073n.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            long longValue = ((Long) eVar.f50513a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a2 = k7.o.a(f10, 0.0f, 1.0f);
        if (z4 && (k1Var = this.U0) != null && k1Var.getVisibility() == 0) {
            a2 *= 1.0f - k1Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5);
        if (q10) {
            i10 = org.telegram.ui.ActionBar.k6.f21605a7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21749i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.r1():void");
    }

    public final boolean s1() {
        if (this.Z) {
            ei eiVar = this.f29100v0;
            if (eiVar == this.f29054g0 || eiVar == this.f29074n0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAllowNestedScroll(boolean z4) {
        this.allowNestedScroll = z4;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        ei eiVar = this.f29100v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29054g0;
        if (eiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f24752f1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z4;
        super.show();
        this.F1 = false;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            this.calcMandatoryInsets = ((org.telegram.ui.xn) p2Var).x9();
        }
        W1();
        this.f29081p1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        }
        if (this.f29065j2) {
            this.f29065j2 = false;
            fg.k1 k1Var = this.U0;
            k1Var.e();
            k1Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z4) {
        long j10;
        ki kiVar = this.W1;
        if (kiVar != null && !this.f29088r1) {
            boolean h02 = kiVar.h0();
            this.f29088r1 = true;
            mh.r5 r5Var = new mh.r5(this, editTextBoldCursor, z4, 13);
            if (h02) {
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
            org.telegram.ui.ActionBar.k6.w1(q12, this.shadowDrawable);
            tg.c cVar = this.C2;
            if (cVar.f48086a.getColor() != q12) {
                cVar.a(q12);
                xg.f fVar = this.f29092s1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                oh ohVar = this.f29095t1;
                if (ohVar != null) {
                    ohVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i10 >= eiVarArr.length) {
                break;
            }
            ei eiVar = eiVarArr[i10];
            if (eiVar != null) {
                eiVar.m();
            }
            i10++;
        }
        int i11 = this.G1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.S = true;
        qh qhVar = this.B0;
        if (qhVar != null) {
            qhVar.o();
        }
        th thVar = this.M0;
        if (thVar != null) {
            thVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName;
        if (tL_attachMenuBot != null) {
            userName = tL_attachMenuBot.short_name;
        } else {
            userName = UserObject.getUserName(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.G1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.f20990id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        d2Var.Q = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 18));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i10 < eiVarArr.length) {
                ei eiVar = eiVarArr[i10];
                if (eiVar != null) {
                    eiVar.x();
                }
                i10++;
            } else {
                this.f29042c2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f29042c2 = false;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i10 >= eiVarArr.length) {
                break;
            }
            ei eiVar = eiVarArr[i10];
            if (eiVar != null) {
                eiVar.A();
            }
            i10++;
        }
        if (isShowing()) {
            this.W1.h0();
        }
        ji jiVar = this.f29109x1;
        if (jiVar != null) {
            jiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.E1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        int i10 = this.G1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.E1.getDialogId()) && (p2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            MessageSuggestionParams messageSuggestionParams = xnVar.f43157d5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.E1.messageOwner.suggested_post);
            }
            if (!mh.t7.U(i10, messageSuggestionParams.amount)) {
                xnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.H - this.I < 0) {
            AndroidUtilities.shakeView(this.f29090s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.F0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.I) {
                O1(p2Var);
                return;
            }
            return;
        }
        if (this.E1 == null && (p2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) p2Var;
            if (xnVar2.c()) {
                z4.M(getContext(), xnVar2.a(), new tg(this, 12), this.resourcesProvider);
                return;
            }
        }
        ei eiVar = this.f29100v0;
        if (eiVar != this.f29054g0 && eiVar != this.f29074n0) {
            if (!eiVar.H(0, true, 0, s1(), this.K0)) {
                this.f29110x2 = true;
                dismiss();
                return;
            }
            return;
        }
        G1(0, true, 0, s1(), this.K0);
    }

    @Override
    public final void dismiss() {
        if (this.f29100v0.n() || isDismissed()) {
            return;
        }
        qh qhVar = this.B0;
        if (qhVar != null) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        th thVar = this.M0;
        if (thVar != null) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        this.f29097u0.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.f29040c0;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        if (!this.f29110x2 && p2Var != null && this.f29100v0.getSelectedItemsCount() > 0 && !this.C) {
            if (this.f29106w2) {
                return;
            }
            this.f29106w2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new tg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f21166a.setOnCancelListener(new zg(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.K = b1Var;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            ei[] eiVarArr = this.f29094t0;
            if (i10 >= eiVarArr.length) {
                break;
            }
            ei eiVar = eiVarArr[i10];
            if (eiVar != null && this.f29100v0 != eiVar) {
                eiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7), 0), true, (AndroidUtilities.IntColorCallback) new tg(this, 11));
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
        this.f29053f2 = false;
        super.dismiss();
        this.f29110x2 = false;
    }

    @Override
    public final void z(float f10, int i10) {
    }

    public mi(Activity activity, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10) {
        this(activity, p2Var, z4, z10, true, null);
    }
}
