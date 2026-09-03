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
import org.telegram.ui.aj1;
public class li extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a3, xd.b {
    public static final int L2 = 0;
    public final mh A0;
    public boolean A1;
    public final sg.d A2;
    public final j0 B;
    public final qh B0;
    public final k6 B1;
    public final sg.d B2;
    public boolean C;
    public final ImageView C0;
    public float C1;
    public final sg.c C2;
    public boolean D;
    public final int[] D0;
    public int D1;
    public final ng.a D2;
    public boolean E;
    public final mh E0;
    public MessageObject E1;
    public final ng.a E2;
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
    public final ah.e L0;
    public boolean L1;
    public boolean M;
    public final th M0;
    public boolean M1;
    public v40 N;
    public int N0;
    public boolean N1;
    public boolean O;
    public lt O0;
    public boolean O1;
    public final wd0 P;
    public boolean P0;
    public int P1;
    public qn Q;
    public boolean Q0;
    public boolean Q1;
    public x40 R;
    public boolean R0;
    public boolean R1;
    public boolean S;
    public final float S0;
    public float S1;
    public boolean T;
    public long T0;
    public float T1;
    public xj U;
    public final eg.l1 U0;
    public ValueAnimator U1;
    public ti V;
    public AnimatorSet V0;
    public int V1;
    public long W;
    public AnimatorSet W0;
    public ji W1;
    public boolean X;
    public final org.telegram.ui.ActionBar.w0 X0;
    public bn X1;
    public final ng.b Y;
    public final kc0 Y0;
    public final int[] Y1;
    public boolean Z;
    public final org.telegram.ui.ActionBar.w0 Z0;
    public int Z1;
    public float f26678a0;
    public ph.f3 f26679a1;
    public float a2;
    public final xd.a f26680b;
    public final yh f26681b0;
    public final org.telegram.ui.ActionBar.w0 f26682b1;
    public float f26683b2;
    public final xd.a f26684c;
    public final org.telegram.ui.ActionBar.p2 f26685c0;
    public final eg.s0 f26686c1;
    public boolean f26687c2;
    public final xd.a d;
    public final boolean f26688d0;
    public float f26689d1;
    public float f26690d2;
    public final xd.a e;
    public cf f26691e0;
    public float f26692e1;
    public final boolean f26693e2;
    public final xd.a f26694f;
    public boolean f26695f0;
    public final mh f26696f1;
    public boolean f26697f2;
    public final ChatAttachAlertPhotoLayout f26698g0;
    public final TextView f26699g1;
    public final ArrayList f26700g2;
    public final xd.a h;
    public qj f26701h0;
    public final org.telegram.ui.ActionBar.w0 f26702h1;
    public final Rect f26703h2;
    public wi f26704i0;
    public final LinearLayout f26705i1;
    public float f26706i2;
    public pn f26707j0;
    public final ImageView f26708j1;
    public boolean f26709j2;
    public pn f26710k0;
    public final LinearLayout f26711k1;
    public int f26712k2;
    public al f26713l0;
    public final TextView l1;
    public final yh f26714l2;
    public hk m0;
    public float f26715m1;
    public o1.j f26716m2;
    public final xd.j f26717n;
    public nm f26718n0;
    public boolean f26719n1;
    public AnimatorSet f26720n2;
    public zi f26721o0;
    public final bi f26722o1;
    public boolean f26723o2;
    public uf.c0 f26724p0;
    public boolean f26725p1;
    public boolean f26726p2;
    public ik f26727q0;
    public Object f26728q1;
    public uk f26729q2;
    public org.telegram.ui.xn f26730r;
    public ik f26731r0;
    public boolean f26732r1;
    public boolean f26733r2;
    public final k6 f26734s;
    public vh.q f26735s0;
    public final wg.f f26736s1;
    public boolean f26737s2;
    public final di[] f26738t0;
    public final oh f26739t1;
    public File f26740t2;
    public final LongSparseArray f26741u0;
    public final mh f26742u1;
    public double[] f26743u2;
    public final k6 v;
    public di f26744v0;
    public final nh f26745v1;
    public boolean f26746v2;
    public final ImageView f26747w;
    public di f26748w0;
    public final f2.i0 f26749w1;
    public boolean f26750w2;
    public final j0 f26751x;
    public final pg.b f26752x0;
    public final ii f26753x1;
    public boolean f26754x2;
    public final ImageView f26755y;
    public final pg.b f26756y0;
    public boolean f26757y1;
    public zh f26758y2;
    public final ph f26759z0;
    public final RadialProgressView f26760z1;
    public final ng.e f26761z2;

    public li(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        eg.s0 s0Var;
        int i10;
        float f10;
        eg.l1 l1Var;
        mr mrVar = mr.h;
        this.f26680b = new xd.a(0, this, mrVar, 380L, false);
        this.f26684c = new xd.a(1, this, mrVar, 380L, false);
        this.d = new xd.a(2, this, mrVar, 380L, false);
        this.e = new xd.a(3, this, mrVar, 380L, false);
        this.f26694f = new xd.a(4, this, mrVar, 380L, true);
        this.h = new xd.a(5, this, mrVar, 320L, false);
        xd.j jVar = new xd.j(new tg(this, 1), mrVar, 380L);
        this.f26717n = jVar;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.f26678a0 = 0.0f;
        this.f26681b0 = new yh(this, 0);
        this.f26695f0 = false;
        di[] diVarArr = new di[11];
        this.f26738t0 = diVarArr;
        this.f26741u0 = new LongSparseArray();
        this.D0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G0 = textPaint;
        this.H0 = new RectF();
        this.I0 = new Paint(1);
        this.R0 = true;
        this.S0 = 1.0f;
        this.f26757y1 = false;
        this.A1 = false;
        int i11 = UserConfig.selectedAccount;
        this.G1 = i11;
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
        this.f26697f2 = false;
        ArrayList arrayList = new ArrayList();
        this.f26700g2 = arrayList;
        Rect rect = new Rect();
        this.f26703h2 = rect;
        this.f26714l2 = new yh(this, 1);
        this.f26723o2 = true;
        this.f26726p2 = false;
        this.f26750w2 = false;
        this.f26754x2 = false;
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
        sg.c cVar = new sg.c();
        this.C2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f26761z2 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.B2 = dVar;
            dVar.j(new o2.i(this, 4));
            sg.d dVar2 = new sg.d(null);
            this.A2 = dVar2;
            dVar2.j(new androidx.biometric.e0(this, 27));
            ng.a aVar = new ng.a(dVar);
            this.D2 = aVar;
            aVar.f14952f = LiteMode.isEnabled(262144);
            ng.a aVar2 = new ng.a(dVar2);
            this.E2 = aVar2;
            aVar2.f14952f = LiteMode.isEnabled(262144);
        } else {
            this.f26761z2 = null;
            this.A2 = null;
            this.B2 = null;
            this.D2 = new ng.a(cVar);
            this.E2 = new ng.a(cVar);
        }
        ng.a aVar3 = new ng.a(cVar);
        this.F2 = new ah(this, 0);
        this.f26693e2 = z4;
        this.f26688d0 = (p2Var instanceof org.telegram.ui.zn) && p2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f26685c0 = p2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        bi biVar = new bi(this, context);
        this.f26722o1 = biVar;
        biVar.setDelegate(new ci(this));
        this.containerView = biVar;
        biVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        eg.l1 l1Var2 = new eg.l1(this, context, f6Var, 2);
        this.U0 = l1Var2;
        l1Var2.P0 = true;
        l1Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        l1Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        int i13 = org.telegram.ui.ActionBar.j6.f19987j5;
        l1Var2.C(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        l1Var2.B(getThemedColor(i14), false);
        l1Var2.setTitleColor(getThemedColor(i13));
        l1Var2.setOccupyStatusBar(true);
        l1Var2.setAlpha(0.0f);
        l1Var2.setActionBarMenuOnItemClick(new eg.m1(this, 25));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
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
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
        this.Z0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        kc0 kc0Var = new kc0();
        this.Y0 = kc0Var;
        w0Var3.setIcon(kc0Var);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        eg.s0 s0Var2 = new eg.s0(this, context);
        s0Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        s0Var2.setText(LocaleController.getString(R.string.Create));
        s0Var2.setTypeface(AndroidUtilities.bold());
        s0Var2.setTextSize(1, 14.0f);
        s0Var2.setVisibility(4);
        s0Var2.setAlpha(0.0f);
        s0Var2.setGravity(17);
        s0Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s0Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        s0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        k7.d6.a(s0Var2);
        this.f26686c1 = s0Var2;
        W1();
        if (p2Var != null) {
            w0Var = w0Var3;
            s0Var = s0Var2;
            i10 = -1;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
            this.f26682b1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
            w0Var4.setOnClickListener(new nh.a2(5, this, z10));
        } else {
            w0Var = w0Var3;
            s0Var = s0Var2;
            i10 = -1;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
        this.f26702h1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 3, i10));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final li f31014b;

            {
                this.f31014b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z12;
                boolean z13;
                org.telegram.ui.zn znVar;
                switch (r3) {
                    case 0:
                        final li liVar = this.f31014b;
                        qh qhVar = liVar.B0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(liVar.getContext(), f6Var);
                            f0Var.m0(qhVar.getText());
                            f0Var.f24735g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = liVar.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar = liVar.M0;
                                            thVar.setText(charSequence);
                                            thVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = liVar.W;
                            if (liVar.E1 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ch chVar = new ch(liVar, 0);
                            f0Var.f24737i0 = j10;
                            f0Var.f24738j0 = z12;
                            f0Var.f24739k0 = chVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final li liVar2 = this.f31014b;
                        th thVar = liVar2.M0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(liVar2.getContext(), f6Var);
                            f0Var2.m0(thVar.getText());
                            f0Var2.f24735g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = liVar2.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = liVar2.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = liVar2.W;
                            if (liVar2.E1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar2 = new ch(liVar2, 1);
                            f0Var2.f24737i0 = j11;
                            f0Var2.f24738j0 = z13;
                            f0Var2.f24739k0 = chVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        li liVar3 = this.f31014b;
                        liVar3.f26702h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar3.f26685c0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(liVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i15 = liVar3.P1;
                        boolean z14 = liVar3.Q1;
                        t13.h = i15;
                        t13.f31785n = z14;
                        if (!liVar3.W1.h0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(liVar3.getContainer().findFocus());
                        }
                        File w10 = ph.t6.w(liVar3.G1, "webp");
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
                        lh lhVar = new lh(liVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.zn) {
                            znVar = (org.telegram.ui.zn) p2Var2;
                        } else {
                            znVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, znVar);
                        if (liVar3.D) {
                            PhotoViewer.t1().Y0(null, null, true, liVar3.G);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        mh mhVar = new mh(this, context, 0);
        this.f26696f1 = mhVar;
        mhVar.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        mhVar.setAlpha(0.0f);
        mhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26705i1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f26699g1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, k7.b6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f26708j1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, k7.b6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        mhVar.addView(linearLayout, k7.b6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f26711k1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, k7.b6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, k7.b6.q(-2, -2, 16));
        mhVar.addView(linearLayout2, k7.b6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z4, z11, f6Var);
        this.f26698g0 = chatAttachAlertPhotoLayout;
        diVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f26744v0 = chatAttachAlertPhotoLayout;
        this.T0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, k7.b6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f26736s1 = view;
        view.setup(aVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, k7.b6.g());
        this.containerView.addView(mhVar, k7.b6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ah.e eVar = new ah.e(context);
        this.L0 = eVar;
        this.containerView.addView(eVar, k7.b6.e(-1, -2, 55));
        this.containerView.addView(l1Var2, k7.b6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, k7.b6.e(48, 48, 53));
        this.containerView.addView(w0Var, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f26682b1;
        if (w0Var6 != null) {
            l1Var = l1Var2;
            this.containerView.addView(w0Var6, k7.b6.e(48, 48, 53));
        } else {
            l1Var = l1Var2;
        }
        mhVar.addView(w0Var5, k7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(s0Var, k7.b6.e(-2, 48, 53));
        mh mhVar2 = new mh(this, context, 1);
        this.f26742u1 = mhVar2;
        nh nhVar = new nh(context, 0);
        this.f26745v1 = nhVar;
        nhVar.setClipChildren(true);
        nhVar.setClipToPadding(false);
        ii iiVar = new ii(this, context);
        this.f26753x1 = iiVar;
        nhVar.setAdapter(iiVar);
        f2.i0 i0Var = new f2.i0(0, false);
        this.f26749w1 = i0Var;
        nhVar.setLayoutManager(i0Var);
        nhVar.setVerticalScrollBarEnabled(false);
        nhVar.setHorizontalScrollBarEnabled(false);
        nhVar.setItemAnimator(null);
        nhVar.setLayoutAnimation(null);
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        nhVar.f28531w2 = true;
        nhVar.setOverScrollMode(2);
        ng.a aVar4 = this.D2;
        ug.i iVar = new ug.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.e = viewGroup2;
        ng.a aVar5 = this.E2;
        ug.i iVar2 = new ug.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.e = viewGroup3;
        ug.i iVar3 = new ug.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.e = viewGroup4;
        oh ohVar = new oh(this, context, 0);
        this.f26739t1 = ohVar;
        ng.b bVar = new ng.b(aVar3.c(ohVar, null, false));
        this.Y = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ohVar, k7.b6.g());
        pg.b c3 = this.D2.c(mhVar2, rg.b.f(f6Var), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        mhVar2.setBackground(c3);
        nhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        nhVar.setClipToOutline(true);
        gg.j1 j1Var = kf.r0.f10496a;
        nhVar.setOutlineProvider(new kf.q0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        nhVar.setImportantForAccessibility(1);
        mhVar2.addView(nhVar, k7.b6.g());
        this.containerView.addView(mhVar2, k7.b6.e(-1, 70, 81));
        nhVar.setOnItemClickListener(new gg.v0(10, this, f6Var));
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
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view2) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        this.containerView.addView(k6Var, k7.b6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f26760z1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, k7.b6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f20273z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view2) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        mh mhVar3 = new mh(this, context, 2);
        this.A0 = mhVar3;
        ph phVar = new ph(this, context);
        this.f26759z0 = phVar;
        mhVar3.addView(phVar, k7.b6.e(-1, -1, 119));
        pg.b c10 = this.E2.c(biVar, rg.b.n(f6Var), false);
        this.f26752x0 = c10;
        c10.f41249k = true;
        c10.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.t(AndroidUtilities.dp(32.0f));
        c10.h.f41234g = 0.4f;
        c10.j();
        pg.b c11 = this.D2.c(phVar, rg.b.n(f6Var), false);
        this.f26756y0 = c11;
        c11.p(AndroidUtilities.dp(22.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        phVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        mhVar3.setWillNotDraw(false);
        mhVar3.setVisibility(4);
        mhVar3.setAlpha(0.0f);
        this.containerView.addView(mhVar3, k7.b6.e(-1, -2, 83));
        mhVar3.setOnTouchListener(new oh.d(13));
        k6 k6Var2 = new k6(context, false, false, false);
        this.f26734s = k6Var2;
        k6Var2.setAllowCancel(true);
        k6Var2.setScaleProperty(0.6f);
        k6Var2.setVisibility(8);
        k6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i15 = org.telegram.ui.ActionBar.j6.f20256y6;
        k6Var2.setTextColor(getThemedColor(i15));
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setGravity(17);
        phVar.addView(k6Var2, k7.b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f26747w = imageView4;
        j0 j0Var = new j0(context);
        this.f26751x = j0Var;
        imageView4.setImageDrawable(j0Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.j6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        int i17 = org.telegram.ui.ActionBar.j6.f19971i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        phVar.addView(imageView4, k7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.d6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final li f31014b;

            {
                this.f31014b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                boolean z13;
                org.telegram.ui.zn znVar;
                switch (r3) {
                    case 0:
                        final li liVar = this.f31014b;
                        qh qhVar = liVar.B0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(liVar.getContext(), f6Var);
                            f0Var.m0(qhVar.getText());
                            f0Var.f24735g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = liVar.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = liVar.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = liVar.W;
                            if (liVar.E1 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ch chVar = new ch(liVar, 0);
                            f0Var.f24737i0 = j10;
                            f0Var.f24738j0 = z12;
                            f0Var.f24739k0 = chVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final li liVar2 = this.f31014b;
                        th thVar = liVar2.M0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(liVar2.getContext(), f6Var);
                            f0Var2.m0(thVar.getText());
                            f0Var2.f24735g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = liVar2.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = liVar2.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = liVar2.W;
                            if (liVar2.E1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar2 = new ch(liVar2, 1);
                            f0Var2.f24737i0 = j11;
                            f0Var2.f24738j0 = z13;
                            f0Var2.f24739k0 = chVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        li liVar3 = this.f31014b;
                        liVar3.f26702h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar3.f26685c0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(liVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = liVar3.P1;
                        boolean z14 = liVar3.Q1;
                        t13.h = i152;
                        t13.f31785n = z14;
                        if (!liVar3.W1.h0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(liVar3.getContainer().findFocus());
                        }
                        File w10 = ph.t6.w(liVar3.G1, "webp");
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
                        lh lhVar = new lh(liVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.zn) {
                            znVar = (org.telegram.ui.zn) p2Var2;
                        } else {
                            znVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, znVar);
                        if (liVar3.D) {
                            PhotoViewer.t1().Y0(null, null, true, liVar3.G);
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
        qh qhVar = new qh(this, context, biVar, f6Var);
        this.B0 = qhVar;
        qhVar.G = true;
        qhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        qhVar.s();
        qhVar.getEditText().setLayoutParams(k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        qhVar.getEditText().addTextChangedListener(new sh(this));
        phVar.addView(qhVar, k7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        phVar.setClipChildren(false);
        mhVar3.setClipChildren(false);
        qhVar.setClipChildren(false);
        eVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        eVar.setWillNotDraw(false);
        th thVar = new th(this, context, biVar, f6Var);
        this.M0 = thVar;
        thVar.G = true;
        thVar.getEditText().addTextChangedListener(new uh(this, p2Var));
        thVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        thVar.getEditText().setLayoutParams(k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        thVar.getEditText().setTextSize(1, 17.0f);
        thVar.getEmojiButton().setLayoutParams(k7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        eVar.addView(thVar, k7.b6.e(-1, -2, 119));
        eVar.setAlpha(0.0f);
        eVar.setVisibility(8);
        qhVar.addView(imageView3, k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        pg.b c12 = this.D2.c(eVar, rg.b.n(f6Var), false);
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        eVar.setBackground(c12);
        eVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        k6 k6Var3 = new k6(context, false, false, false);
        this.v = k6Var3;
        k6Var3.setScaleProperty(0.6f);
        k6Var3.setVisibility(8);
        k6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var3.setTextColor(getThemedColor(i15));
        k6Var3.setTypeface(AndroidUtilities.bold());
        k6Var3.setGravity(17);
        k6Var3.setAllowCancel(true);
        eVar.addView(k6Var3, k7.b6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Xd), mode2));
        thVar.addView(imageView5, k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view2) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f26755y = imageView6;
        j0 j0Var2 = new j0(context);
        this.B = j0Var2;
        imageView6.setImageDrawable(j0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        eVar.addView(imageView6, k7.b6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.d6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final li f31014b;

            {
                this.f31014b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                boolean z13;
                org.telegram.ui.zn znVar;
                switch (r3) {
                    case 0:
                        final li liVar = this.f31014b;
                        qh qhVar2 = liVar.B0;
                        if (qhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(liVar.getContext(), f6Var);
                            f0Var.m0(qhVar2.getText());
                            f0Var.f24735g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar22 = liVar.B0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = liVar.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = liVar.W;
                            if (liVar.E1 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ch chVar = new ch(liVar, 0);
                            f0Var.f24737i0 = j10;
                            f0Var.f24738j0 = z12;
                            f0Var.f24739k0 = chVar;
                            f0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final li liVar2 = this.f31014b;
                        th thVar2 = liVar2.M0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(liVar2.getContext(), f6Var);
                            f0Var2.m0(thVar2.getText());
                            f0Var2.f24735g0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar22 = liVar2.B0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar22 = liVar2.M0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = liVar2.W;
                            if (liVar2.E1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar2 = new ch(liVar2, 1);
                            f0Var2.f24737i0 = j11;
                            f0Var2.f24738j0 = z13;
                            f0Var2.f24739k0 = chVar2;
                            f0Var2.show();
                            return;
                        }
                        return;
                    default:
                        li liVar3 = this.f31014b;
                        liVar3.f26702h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar3.f26685c0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(liVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = liVar3.P1;
                        boolean z14 = liVar3.Q1;
                        t13.h = i152;
                        t13.f31785n = z14;
                        if (!liVar3.W1.h0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(liVar3.getContainer().findFocus());
                        }
                        File w10 = ph.t6.w(liVar3.G1, "webp");
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
                        lh lhVar = new lh(liVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.zn) {
                            znVar = (org.telegram.ui.zn) p2Var2;
                        } else {
                            znVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, znVar);
                        if (liVar3.D) {
                            PhotoViewer.t1().Y0(null, null, true, liVar3.G);
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
        this.containerView.addView(mhVar4, k7.b6.e(110, 50, 85));
        vh vhVar = new vh(R.drawable.send_plane_24, context, f6Var, this);
        this.F0 = vhVar;
        vhVar.setImportantForAccessibility(2);
        mhVar4.addView(vhVar, k7.b6.e(-1, -1, 119));
        vhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        vhVar.F = dp2;
        vhVar.G = dp3;
        vhVar.J = AndroidUtilities.dp(7.0f);
        vhVar.K = AndroidUtilities.dp(6.0f);
        vhVar.f26662e0 = true;
        vhVar.setOnClickListener(new View.OnClickListener(this) {
            public final li f30634b;

            {
                this.f30634b = this;
            }

            @Override
            public final void onClick(View view2) {
                rh.n3 n3Var;
                boolean z12;
                switch (r2) {
                    case 0:
                        li liVar = this.f30634b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (n3Var = (rh.n3) liVar.f26741u0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        li liVar2 = this.f30634b;
                        boolean z13 = liVar2.Z;
                        if (!z13) {
                            liVar2.H1(!z13, true);
                            return;
                        }
                        return;
                    case 2:
                        li liVar3 = this.f30634b;
                        boolean z14 = liVar3.Z;
                        if (z14) {
                            liVar3.H1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f30634b.z1();
                        return;
                    case 4:
                        this.f30634b.X0.M(null, null);
                        return;
                    case 5:
                        li.s(this.f30634b);
                        return;
                    case 6:
                        di diVar = this.f30634b.f26744v0;
                        if (diVar != null) {
                            diVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f30634b.f26702h1.M(null, null);
                        return;
                    default:
                        li liVar4 = this.f30634b;
                        if (liVar4.f26744v0 != liVar4.f26718n0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        liVar4.Z1(z12);
                        return;
                }
            }
        });
        vhVar.setOnLongClickListener(new org.telegram.ui.cg(this, context, f6Var, p2Var, 1));
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
        al0 fastScroll = chatAttachAlertPhotoLayout.B.getFastScroll();
        ng.a aVar6 = this.D2;
        qg.d n10 = rg.b.n(f6Var);
        rl0 rl0Var = fastScroll.f23445l0;
        pg.b c13 = aVar6.c(rl0Var.f28491c1, n10, false);
        fastScroll.f23433b0 = c13;
        c13.o(AndroidUtilities.dp(4.0f));
        fastScroll.f23433b0.p(AndroidUtilities.dp(24.0f));
        pg.b c14 = aVar6.c(rl0Var.f28491c1, n10, false);
        fastScroll.f23435c0 = c14;
        c14.o(AndroidUtilities.dp(6.0f));
        fastScroll.f23435c0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f23435c0.p(AndroidUtilities.dp(f10));
        wd0 wd0Var = new wd0(context);
        this.P = wd0Var;
        this.containerView.addView(wd0Var, k7.b6.c(-1.0f, -1));
        qg.d dVar3 = new qg.d(f6Var);
        dVar3.e = new tg(this, 4);
        dVar3.f43086c = new tg(this, 5);
        dVar3.d = new tg(this, 6);
        dVar3.f43085b = new tg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f43088n = dpf2;
        dVar3.f43089r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f43087f = dpf23;
        dVar3.h = dpf24;
        l1Var.M(this.D2, dVar3, false);
        jVar.i(1L, false);
    }

    public static void M(li liVar) {
        boolean q10;
        int i10;
        int i11;
        eg.l1 l1Var = liVar.U0;
        wg.f fVar = liVar.f26736s1;
        if (fVar != null && l1Var != null) {
            org.telegram.ui.ActionBar.f6 f6Var = liVar.resourcesProvider;
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (l1Var.getVisibility() == 0) {
                if (q10) {
                    i11 = 255;
                } else {
                    i11 = 160;
                }
                i10 = (int) (l1Var.getAlpha() * i11);
            } else {
                i10 = 0;
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void Q(li liVar) {
        zh zhVar = new zh(liVar, liVar.getContext(), liVar.W, LaunchActivity.R(), liVar.resourcesProvider, 0);
        liVar.f26758y2 = zhVar;
        zhVar.p(new ja.c(liVar, 29));
        ViewGroup viewGroup = liVar.containerView;
        viewGroup.addView(liVar.f26758y2, viewGroup.indexOfChild(liVar.A0), k7.b6.e(-1, -1, 83));
        zh zhVar2 = liVar.f26758y2;
        zhVar2.getAdapter().f44901c = false;
        zhVar2.getAdapter().d = false;
        zhVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
        boolean z4 = true;
        if (p2Var instanceof org.telegram.ui.zn) {
            zhVar2.getAdapter().f44910j0 = false;
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var;
            tf.u0 adapter = zhVar2.getAdapter();
            znVar.i();
            TLRPC.Chat chat = znVar.e;
            adapter.getClass();
            adapter.f44909i0 = chat;
            zhVar2.getAdapter().W(znVar.W7);
            tf.u0 adapter2 = zhVar2.getAdapter();
            if (znVar.e == null) {
                z4 = false;
            }
            adapter2.f44900b0 = z4;
        } else {
            zhVar2.getAdapter().f44910j0 = true;
            zhVar2.getAdapter().W(null);
            zhVar2.getAdapter().f44900b0 = false;
        }
        zhVar2.getAdapter().f44902c0 = false;
        liVar.U1();
    }

    public static void m(li liVar, ValueAnimator valueAnimator) {
        liVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.e3 e3Var = liVar.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public static void n(li liVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.a3 a3Var) {
        liVar.currentSheetAnimation = null;
        liVar.f26716m2 = null;
        animationNotificationsLocker.unlock();
        liVar.currentSheetAnimationType = 0;
        if (a3Var != null) {
            a3Var.onOpenAnimationEnd();
        }
        if (liVar.useHardwareLayer) {
            liVar.container.setLayerType(0, null);
        }
        if (liVar.isFullscreen) {
            WindowManager.LayoutParams attributes = liVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            liVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(li liVar, int i10) {
        liVar.navBarColorKey = -1;
        liVar.navBarColor = i10;
        liVar.containerView.invalidate();
    }

    public static void p(li liVar) {
        o1.j jVar = liVar.f26716m2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(liVar.containerView, o1.h.f16162n, 0.0f);
        liVar.f26716m2 = jVar2;
        jVar2.f16178u.a(1.5f);
        liVar.f26716m2.f16178u.b(1500.0f);
        liVar.f26716m2.f();
    }

    public static boolean q(org.telegram.ui.Components.li r45, android.content.Context r46, org.telegram.ui.ActionBar.f6 r47, org.telegram.ui.ActionBar.p2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.q(org.telegram.ui.Components.li, android.content.Context, org.telegram.ui.ActionBar.f6, org.telegram.ui.ActionBar.p2, android.view.View):boolean");
    }

    public static void r(li liVar, lh.p6 p6Var) {
        AnimatorSet animatorSet = liVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            p6Var.run();
        }
    }

    public static void s(li liVar) {
        int i10;
        if (liVar.f26698g0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z4 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i11 = 0; i11 < chatAttachAlertPhotoLayout.B.getChildCount(); i11++) {
                            View childAt = chatAttachAlertPhotoLayout.B.getChildAt(i11);
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
            SharedConfig.photoLiveDefault = z4;
            edit.putBoolean("photoLiveDefault", z4).apply();
            chatAttachAlertPhotoLayout.v0();
        }
        liVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = liVar.Z0;
        ph.f3 f3Var = liVar.f26679a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        ph.f3 f3Var2 = new ph.f3(liVar.getContext(), 1);
        liVar.f26679a1 = f3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        f3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        liVar.f26679a1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        liVar.f26679a1.m(1.0f, -((liVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        liVar.f26679a1.setTranslationY(liVar.X0.getTranslationY());
        ph.f3 f3Var3 = liVar.f26679a1;
        f3Var3.f41662i0 = new org.telegram.ui.np(17, liVar, f3Var2);
        liVar.containerView.addView(f3Var3, k7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        liVar.f26679a1.u();
    }

    public static void t(li liVar, boolean z4, wg wgVar) {
        Integer num;
        liVar.f26744v0.s(1.0f);
        liVar.f26748w0.s(1.0f);
        liVar.f26744v0.k(liVar.f26706i2);
        liVar.f26748w0.k(liVar.f26706i2);
        liVar.containerView.invalidate();
        eg.l1 l1Var = liVar.U0;
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        l1Var.setTag(num);
        wgVar.run();
    }

    public static void v(li liVar, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int i10;
        li liVar2 = liVar;
        nh nhVar = liVar2.f26745v1;
        di[] diVarArr = liVar2.f26738t0;
        org.telegram.ui.ActionBar.p2 p2Var2 = liVar2.f26685c0;
        if (p2Var2 == null) {
            p2Var = LaunchActivity.R();
        } else {
            p2Var = p2Var2;
        }
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (view instanceof fi) {
                Activity parentActivity = p2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z4 = true;
                if (i10 == 1) {
                    if (liVar2.I1 || liVar2.J1 || !liVar2.a1()) {
                        if (!liVar2.I1 && !liVar2.J1) {
                            qn qnVar = new qn(1, liVar2.getContext(), f6Var, liVar2);
                            liVar2.Q = qnVar;
                            liVar2.Q1(qnVar);
                        }
                        liVar2.Q1(liVar2.f26698g0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (liVar2.K1 || !liVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(liVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        liVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (liVar2.H1 || !liVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(liVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        liVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (liVar2.N1 || !liVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && liVar2.N1 && liVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(liVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        liVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((liVar2.N1 || !liVar2.a1()) && AndroidUtilities.isMapsInstalled(p2Var2)) {
                        if (!liVar2.N1) {
                            qn qnVar2 = new qn(6, liVar2.getContext(), f6Var, liVar2);
                            liVar2.Q = qnVar2;
                            liVar2.Q1(qnVar2);
                        } else {
                            if (liVar2.f26713l0 == null) {
                                al alVar = new al(liVar2, liVar2.getContext(), f6Var, (liVar2.E || liVar2.O1) ? false : false);
                                liVar2.f26713l0 = alVar;
                                diVarArr[5] = alVar;
                                uk ukVar = liVar2.f26729q2;
                                if (ukVar != null) {
                                    alVar.setDelegate(ukVar);
                                } else {
                                    alVar.setDelegate(new tg(liVar2, 9));
                                }
                            }
                            liVar2.Q1(liVar2.f26713l0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (liVar2.L1 || !liVar2.a1()) {
                        if (!liVar2.L1) {
                            qn qnVar3 = new qn(9, liVar2.getContext(), f6Var, liVar2);
                            liVar2.Q = qnVar3;
                            liVar2.Q1(qnVar3);
                        } else {
                            liVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (liVar2.f26724p0 == null) {
                        uf.c0 c0Var = new uf.c0(liVar2.getContext(), liVar2.resourcesProvider, liVar2);
                        liVar2.f26724p0 = c0Var;
                        diVarArr[7] = c0Var;
                        c0Var.setupBlurredSearchField(liVar2.D2);
                    }
                    liVar2.Q1(liVar2.f26724p0);
                } else if (i10 == 12) {
                    if (liVar2.M1 || !liVar2.a1()) {
                        if (!liVar2.M1) {
                            qn qnVar4 = new qn(9, liVar2.getContext(), f6Var, liVar2);
                            liVar2.Q = qnVar4;
                            liVar2.Q1(qnVar4);
                        } else {
                            if (liVar2.f26710k0 == null) {
                                pn pnVar = new pn(liVar, liVar.getContext(), true, f6Var, null);
                                liVar2 = liVar;
                                liVar2.f26710k0 = pnVar;
                                diVarArr[1] = pnVar;
                                pnVar.setDelegate(new tg(liVar2, 10));
                            }
                            liVar2.Q1(liVar2.f26710k0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (liVar2.f26731r0 == null) {
                        ik ikVar = new ik(liVar2, liVar2.getContext(), f6Var, true);
                        liVar2.f26731r0 = ikVar;
                        diVarArr[8] = ikVar;
                        ikVar.setDelegate(liVar2.X1);
                    }
                    liVar2.Q1(liVar2.f26731r0);
                } else if (i10 == 14) {
                    if (liVar2.f26727q0 == null) {
                        ik ikVar2 = new ik(liVar2, liVar2.getContext(), f6Var, false);
                        liVar2.f26727q0 = ikVar2;
                        diVarArr[9] = ikVar2;
                        ikVar2.setDelegate(liVar2.X1);
                    }
                    liVar2.Q1(liVar2.f26727q0);
                } else if (i10 == 16) {
                    if (liVar2.f26735s0 == null) {
                        vh.q qVar = new vh.q(liVar2.G1, liVar2.getContext(), f6Var, liVar2);
                        liVar2.f26735s0 = qVar;
                        diVarArr[10] = qVar;
                    }
                    liVar2.Q1(liVar2.f26735s0);
                } else if (view.getTag() instanceof Integer) {
                    liVar2.W1.G1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, liVar2.s1(), false, 0L);
                }
            } else if (view instanceof ei) {
                ei eiVar = (ei) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = eiVar.f24620c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        aj1.a(liVar2.getContext(), new nh.z1(5, liVar2, eiVar), null);
                    } else {
                        liVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    liVar2.W1.o1(eiVar.f24619b);
                    liVar2.dismiss();
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

    public static void w(li liVar) {
        di diVar;
        nm nmVar;
        liVar.f26728q1 = null;
        di diVar2 = liVar.f26744v0;
        if (diVar2 != liVar.f26698g0 && (diVar = liVar.f26748w0) != (nmVar = liVar.f26718n0) && diVar2 != diVar && diVar2 != nmVar) {
            liVar.containerView.removeView(diVar2);
        }
        liVar.f26744v0.setVisibility(8);
        liVar.f26744v0.q();
        liVar.f26748w0.E();
        liVar.f26744v0 = liVar.f26748w0;
        liVar.f26748w0 = null;
        int[] iArr = liVar.Y1;
        iArr[0] = iArr[1];
        liVar.H1(liVar.Z, false);
        liVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z4 = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
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
            if (this.f26713l0 == null) {
                al alVar = new al(this, getContext(), this.resourcesProvider, (this.E || this.O1) ? false : false);
                this.f26713l0 = alVar;
                this.f26738t0[5] = alVar;
                uk ukVar = this.f26729q2;
                if (ukVar != null) {
                    alVar.setDelegate(ukVar);
                } else if (p2Var instanceof org.telegram.ui.zn) {
                    alVar.setDelegate(new tg(this, 16));
                }
            }
            Q1(this.f26713l0);
        }
    }

    public final void B1(boolean z4) {
        if (!this.K1 && z4) {
            qn qnVar = new qn(3, getContext(), this.resourcesProvider, this);
            this.Q = qnVar;
            Q1(qnVar);
        }
        int i10 = 1;
        if (this.f26704i0 == null) {
            wi wiVar = new wi(getContext(), this.resourcesProvider, this);
            this.f26704i0 = wiVar;
            this.f26738t0[3] = wiVar;
            wiVar.setupBlurredSearchField(this.D2);
            this.f26704i0.setDelegate(new tg(this, 13));
            if (this.E) {
                this.f26704i0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) p2Var).e;
            wi wiVar2 = this.f26704i0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.E1 == null) {
                i10 = -1;
            }
            wiVar2.setMaxSelectedFiles(i10);
        }
        if (z4) {
            Q1(this.f26704i0);
        }
    }

    public final void C1() {
        if (this.f26721o0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            ?? diVar = new di(context, f6Var, this);
            diVar.f31387r = AndroidUtilities.dp(80.0f);
            diVar.f31389w = 3;
            lh.e1 e1Var = new lh.e1(diVar, context, f6Var, 9);
            diVar.f31386n = e1Var;
            ra raVar = new ra(diVar, context);
            diVar.v = raVar;
            e1Var.setAdapter(raVar);
            e1Var.setClipToPadding(false);
            e1Var.setItemAnimator(null);
            e1Var.setLayoutAnimation(null);
            e1Var.setVerticalScrollBarEnabled(false);
            e1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, diVar.f24281a));
            diVar.addView(e1Var, k7.b6.c(-1.0f, -1));
            e1Var.setOnScrollListener(new eg.f2(diVar, 18));
            oh.k kVar = new oh.k(diVar, diVar.f31387r, 1);
            diVar.f31388s = kVar;
            kVar.O = new kh.m5(diVar, 2);
            e1Var.setLayoutManager(kVar);
            this.f26721o0 = diVar;
            diVar.setDelegate(new xa(this, 1));
        }
        Q1(this.f26721o0);
    }

    public final void D1() {
        boolean z4;
        if (!this.N1) {
            qn qnVar = new qn(5, getContext(), this.resourcesProvider, this);
            this.Q = qnVar;
            Q1(qnVar);
        }
        if (this.f26701h0 == null) {
            qj qjVar = new qj(getContext(), this.resourcesProvider, this);
            this.f26701h0 = qjVar;
            this.f26738t0[2] = qjVar;
            qjVar.setupBlurredSearchField(this.D2);
            this.f26701h0.setDelegate(new wh(this));
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) p2Var).e;
            qj qjVar2 = this.f26701h0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z4 = false;
            } else {
                z4 = true;
            }
            qjVar2.setMultipleSelectionAllowed(z4);
        }
        Q1(this.f26701h0);
    }

    public final void E1(boolean z4) {
        int i10;
        if (!this.H1 && z4) {
            qn qnVar = new qn(4, getContext(), this.resourcesProvider, this);
            this.Q = qnVar;
            Q1(qnVar);
        }
        boolean z10 = false;
        if (this.m0 == null) {
            if (this.K) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            hk hkVar = new hk(i10, getContext(), this.resourcesProvider, this);
            this.m0 = hkVar;
            this.f26738t0[4] = hkVar;
            hkVar.setDelegate(new xh(this));
        }
        int i11 = 1;
        if (this.E) {
            this.m0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
            if (p2Var instanceof org.telegram.ui.zn) {
                TLRPC.Chat chat = ((org.telegram.ui.zn) p2Var).e;
                hk hkVar2 = this.m0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.E1 == null) {
                    i11 = -1;
                }
                hkVar2.setMaxSelectedFiles(i11);
            } else {
                this.m0.setMaxSelectedFiles(this.P1);
                hk hkVar3 = this.m0;
                if (!this.K && !this.T) {
                    z10 = true;
                }
                hkVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        hk hkVar4 = this.m0;
        hkVar4.f25432a0 = this.K;
        if (z4) {
            Q1(hkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        eg.l1 l1Var = this.U0;
        int i10 = 1;
        if (l1Var.f20305k0) {
            l1Var.h(true);
        }
        this.f26701h0 = null;
        this.f26724p0 = null;
        this.f26704i0 = null;
        this.f26707j0 = null;
        this.f26710k0 = null;
        this.f26713l0 = null;
        this.m0 = null;
        while (true) {
            di[] diVarArr = this.f26738t0;
            if (i10 < diVarArr.length) {
                di diVar = diVarArr[i10];
                if (diVar != null) {
                    diVar.m();
                    this.containerView.removeView(diVarArr[i10]);
                    diVarArr[i10] = null;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var;
            TLRPC.Chat chat = znVar.e;
            if (znVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.G1).edit();
                edit.putBoolean("silent_" + znVar.a(), !z4).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f46961f) {
            this.F1 = true;
            this.W1.G1(7, true, z4, i10, i11, j10, z10, false, 0L);
            return true;
        }
        long n12 = n1();
        di diVar = this.f26744v0;
        if (diVar != null) {
            i12 = diVar.getSelectedItemsCount();
        }
        return z4.b0(this.G1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                li liVar = li.this;
                liVar.F1 = true;
                liVar.W1.G1(7, true, z4, i10, i11, j10, z10, false, ((Long) obj).longValue());
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
        this.f26680b.a(z4, z10);
        cu m12 = m1();
        this.Z = z4;
        cu m13 = m1();
        int i11 = 0;
        if (this.A0.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        di diVar = this.f26744v0;
        if (diVar != this.f26698g0 && diVar != this.f26718n0) {
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
        ah.e eVar = this.L0;
        ph phVar = this.f26759z0;
        float f13 = 0.0f;
        if (z10) {
            if (z11) {
                i12 = 0;
            }
            eVar.setVisibility(i12);
            ViewPropertyAnimator animate = eVar.animate();
            if (z13 && z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).setUpdateListener(new ug(this, 0)).withEndAction(new Runnable(this) {
                public final li f29471b;

                {
                    this.f29471b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            li liVar = this.f29471b;
                            if (!z13 || !z11) {
                                liVar.L0.setVisibility(8);
                            }
                            liVar.b2();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f29471b.f26759z0.setVisibility(8);
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
            animate2.translationY(measuredHeight).alpha((z13 || !z11) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(mrVar).setUpdateListener(new ug(this, 1)).withEndAction(new Runnable(this) {
                public final li f29471b;

                {
                    this.f29471b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            li liVar = this.f29471b;
                            if (!z13 || !z11) {
                                liVar.L0.setVisibility(8);
                            }
                            liVar.b2();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f29471b.f26759z0.setVisibility(8);
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
            eVar.setVisibility(i10);
            if (z13 && z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            eVar.setAlpha(f10);
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
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f26698g0) != null) {
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
        this.f26753x1.l();
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
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
        di diVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            pn pnVar = this.f26707j0;
            if (pnVar != null && ((diVar = this.f26748w0) == pnVar || this.f26744v0 == pnVar)) {
                if (diVar == pnVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            pn pnVar2 = this.f26710k0;
            if (pnVar2 != null) {
                di diVar2 = this.f26748w0;
                if (diVar2 == pnVar2 || this.f26744v0 == pnVar2) {
                    if (diVar2 != pnVar2) {
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
        this.f26742u1.setVisibility(8);
        this.f26699g1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
        if (chatAttachAlertPhotoLayout != null) {
            li liVar = chatAttachAlertPhotoLayout.f24282b;
            chatAttachAlertPhotoLayout.f22879d1 = (liVar.N0 == 0 || liVar.C) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.M1(boolean):void");
    }

    public final void N1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.p2 p2Var) {
        if ((p2Var instanceof org.telegram.ui.zn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.zn) p2Var).e)) {
            new qc(this.f26722o1, this.resourcesProvider).f(MessagesController.getInstance(this.G1).captionLengthLimitPremium, new org.telegram.ui.np(18, this, p2Var)).j();
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
        di diVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        eg.l1 l1Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        this.f26684c.a(z4, true);
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
        mh mhVar2 = this.f26742u1;
        mh mhVar3 = this.E0;
        if (z4) {
            if (!this.K) {
                mhVar.setVisibility(0);
            }
            mhVar3.setVisibility(0);
        } else if (this.P0) {
            mhVar2.setVisibility(0);
        }
        di diVar2 = this.f26744v0;
        if ((diVar2 == this.f26698g0 || diVar2 == this.f26718n0) && this.Z) {
            z12 = true;
        } else {
            z12 = false;
        }
        eg.l1 l1Var2 = this.U0;
        ah.e eVar = this.L0;
        ph phVar = this.f26759z0;
        vh vhVar = this.F0;
        float f27 = 0.2f;
        float f28 = 1.0f;
        if (z10) {
            float f29 = 0.0f;
            this.J0 = new AnimatorSet();
            if (z12) {
                eVar.setVisibility(0);
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
                l1Var = l1Var2;
                arrayList.add(ObjectAnimator.ofFloat(phVar, View.TRANSLATION_Y, 0.0f));
            } else {
                l1Var = l1Var2;
            }
            if (z4 && z12) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(eVar, property, f21));
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
            if (l1Var.getTag() != null) {
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
            eVar.setVisibility(i11);
            if (z4 && z12) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            eVar.setAlpha(f15);
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
            if (l1Var2.getTag() != null) {
                if (z4) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                mhVar.setTranslationY(dp);
            } else if (this.P0 && ((diVar = this.f26744v0) == null || diVar.I())) {
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
            i10 = Math.max(1, this.f26744v0.getSelectedItemsCount());
        }
        vhVar.g(i10, z10);
        if (this.E1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.G1).getSendPaidMessagesStars(n1());
        }
        vhVar.i(j1() + this.f26744v0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), vhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            qhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(di diVar) {
        long j10 = this.T0;
        qn qnVar = this.Q;
        if (diVar == qnVar) {
            j10 = qnVar.f28217s;
        } else if (diVar == this.f26698g0) {
            j10 = 1;
        } else if (diVar == this.f26704i0) {
            j10 = 3;
        } else if (diVar == this.m0) {
            j10 = 4;
        } else if (diVar == this.f26701h0) {
            j10 = 5;
        } else if (diVar == this.f26713l0) {
            j10 = 6;
        } else if (diVar == this.f26707j0) {
            j10 = 9;
        } else if (diVar == this.f26721o0) {
            j10 = 10;
        } else if (diVar == this.f26724p0) {
            j10 = 11;
        } else if (diVar == this.f26710k0) {
            j10 = 12;
        } else if (diVar == this.f26727q0) {
            j10 = 14;
        } else if (diVar == this.f26731r0) {
            j10 = 13;
        } else if (diVar == this.f26735s0) {
            j10 = 16;
        }
        R1(diVar, j10, true);
    }

    public final void R1(di diVar, long j10, boolean z4) {
        boolean z10;
        int i10;
        zl zlVar;
        boolean z11;
        Integer num;
        zl zlVar2;
        int dp;
        int i11;
        int dp2;
        nh nhVar;
        boolean z12;
        if (this.f26728q1 == null && this.J0 == null) {
            di diVar2 = this.f26744v0;
            if (diVar2 == diVar) {
                diVar2.F();
            } else if (diVar == this.f26710k0 && !UserConfig.getInstance(this.G1).isPremium()) {
                new eg.o1(this.f26685c0, 39, false).show();
            } else {
                int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26694f.a(z10, z4);
                this.f26717n.i(Long.valueOf(j10), z4);
                this.A1 = false;
                this.f26757y1 = false;
                this.C1 = 0.0f;
                this.B1.setVisibility(8);
                RadialProgressView radialProgressView = this.f26760z1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                mh mhVar = this.f26742u1;
                mhVar.setAlpha(1.0f);
                mhVar.setTranslationY(this.C1);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f26741u0;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((rh.n3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.T0 = j10;
                nh nhVar2 = this.f26745v1;
                int childCount = nhVar2.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = nhVar2.getChildAt(i14);
                    if (childAt instanceof fi) {
                        fi fiVar = (fi) childAt;
                        nhVar = nhVar2;
                        if (fiVar.f24897b == fiVar.f24898c.T0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fiVar.f25147a.e(z12, true);
                    } else {
                        nhVar = nhVar2;
                        if (childAt instanceof ei) {
                            ((ei) childAt).a(true);
                        }
                    }
                    i14++;
                    nhVar2 = nhVar;
                }
                int firstOffset = (this.f26744v0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.Y1[0];
                this.f26748w0 = diVar;
                diVar.getClass();
                boolean z13 = diVar instanceof vh.q;
                wg.f fVar = this.f26736s1;
                if (fVar != null) {
                    if (z13) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                oh ohVar = this.f26739t1;
                if (ohVar != null) {
                    if (z13) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    ohVar.setVisibility(i11);
                }
                if (this.f26748w0.h() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                eg.l1 l1Var = this.U0;
                l1Var.setVisibility(i10);
                if (l1Var.f20305k0) {
                    l1Var.h(true);
                }
                this.f26744v0.r();
                di diVar3 = this.f26748w0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
                if (diVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f26748w0.D(this.f26744v0);
                this.f26748w0.setVisibility(0);
                if (diVar.getParent() != null) {
                    this.containerView.removeView(this.f26748w0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.f26744v0);
                ViewParent parent = this.f26748w0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    di diVar4 = this.f26748w0;
                    if (diVar4 != this.f26713l0) {
                        indexOfChild++;
                    }
                    viewGroup.addView(diVar4, indexOfChild, k7.b6.c(-1.0f, -1));
                }
                wg wgVar = new wg(this, 3);
                di diVar5 = this.f26744v0;
                boolean z14 = diVar5 instanceof nm;
                yh yhVar = this.f26681b0;
                if (!z14 && !(this.f26748w0 instanceof nm)) {
                    if (z4) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f26748w0.setAlpha(0.0f);
                        this.f26748w0.setTranslationY(AndroidUtilities.dp(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26744v0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f26744v0, yhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(l1Var, View.ALPHA, l1Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(mr.f27122f);
                        animatorSet.addListener(new lh.k3(this, firstOffset, wgVar, 1));
                        this.f26728q1 = animatorSet;
                        di diVar6 = this.f26744v0;
                        yhVar.getClass();
                        yhVar.b(diVar6, 0.0f);
                        animatorSet.start();
                    } else {
                        diVar5.setAlpha(0.0f);
                        wgVar.run();
                        a2(0);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.f26748w0.getWidth(), this.f26744v0.getWidth());
                    di diVar7 = this.f26748w0;
                    if (diVar7 instanceof nm) {
                        diVar7.setTranslationX(max);
                        di diVar8 = this.f26744v0;
                        if ((diVar8 instanceof ChatAttachAlertPhotoLayout) && (zlVar2 = ((ChatAttachAlertPhotoLayout) diVar8).M) != null) {
                            zlVar2.setVisibility(4);
                        }
                    } else {
                        this.f26744v0.setTranslationX(-max);
                        di diVar9 = this.f26748w0;
                        if (diVar9 == chatAttachAlertPhotoLayout && (zlVar = ((ChatAttachAlertPhotoLayout) diVar9).M) != null) {
                            zlVar.setVisibility(0);
                        }
                    }
                    this.f26748w0.setAlpha(1.0f);
                    this.f26744v0.setAlpha(1.0f);
                    if (z4) {
                        di diVar10 = this.f26744v0;
                        yhVar.getClass();
                        yhVar.b(diVar10, 0.0f);
                        AndroidUtilities.runOnUIThread(new lh.p6(this, diVar, wgVar, 29));
                    } else {
                        if (this.f26748w0.getCurrentItemTop() <= diVar.getButtonsHideOffset()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f26744v0.s(1.0f);
                        this.f26748w0.s(1.0f);
                        this.f26744v0.k(this.f26706i2);
                        this.f26748w0.k(this.f26706i2);
                        this.containerView.invalidate();
                        di diVar11 = this.f26744v0;
                        yhVar.getClass();
                        yhVar.b(diVar11, 1.0f);
                        if (z11) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        l1Var.setTag(num);
                        wgVar.run();
                    }
                }
                if (this.f26709j2 && !(diVar instanceof rh.n3)) {
                    this.f26709j2 = false;
                    l1Var.e();
                    l1Var.invalidate();
                    u1();
                }
                if (i12 != 0 && j10 != 6 && !(diVar instanceof rh.n3)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = 0;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                l1Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void S1(boolean z4, Boolean bool) {
        li liVar;
        if (this.f26707j0 == null) {
            liVar = this;
            pn pnVar = new pn(liVar, getContext(), false, this.resourcesProvider, bool);
            liVar.f26707j0 = pnVar;
            liVar.f26738t0[1] = pnVar;
            pnVar.setDelegate(new tg(this, 15));
        } else {
            liVar = this;
        }
        R1(liVar.f26707j0, 9L, z4);
    }

    public final void T1(boolean z4, boolean z10) {
        Integer num;
        boolean z11;
        float f10;
        float f11;
        di diVar;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z12;
        this.d.a(z4, z10);
        eg.l1 l1Var = this.U0;
        if ((z4 && l1Var.getTag() == null) || (!z4 && l1Var.getTag() != null)) {
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            l1Var.setTag(num);
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            if (!this.C && !this.Q0 && ((this.N0 != 0 || !this.f26719n1) && this.f26744v0 == this.f26698g0 && (this.I1 || this.J1))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f26744v0 == this.Q) {
                z11 = false;
            }
            mh mhVar = this.f26742u1;
            org.telegram.ui.ActionBar.w0 w0Var = this.X0;
            if (z4) {
                if (z11) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.P0 && this.A0.getTag() == null) {
                mhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
            if (p2Var != null) {
                if (z4) {
                    if (this.f26693e2) {
                        i10 = org.telegram.ui.ActionBar.j6.f20173tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19952h5;
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
                animatorSet2.setDuration(Math.abs(f12 - l1Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(l1Var, property, f13));
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
                this.V0.addListener(new dg.w2(24, this, z4));
                this.V0.setInterpolator(mr.h);
                this.V0.setDuration(380L);
                this.V0.start();
                return;
            }
            if (z4 && this.P0 && ((diVar = this.f26744v0) == null || diVar.I())) {
                mhVar.setVisibility(4);
            }
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            l1Var.setAlpha(f10);
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
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f26682b1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.N0 != 0 || !this.f26719n1) {
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
        if (this.f26758y2 != null) {
            di diVar = this.f26744v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
            if ((diVar == chatAttachAlertPhotoLayout || diVar == this.f26718n0) && this.Z) {
                ah.e eVar = this.L0;
                alpha = (eVar.getAlpha() * eVar.getMeasuredHeight()) + (eVar.getY() - this.f26758y2.getTop());
            } else {
                alpha = -qhVar.getHeight();
            }
            if (Math.abs(this.f26758y2.getTranslationY() - alpha) > 0.5f) {
                this.f26758y2.setTranslationY(alpha);
                this.f26758y2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        g1();
    }

    public final void V1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f10;
        float f11;
        float f12;
        di diVar = this.f26744v0;
        int i10 = 0;
        if (diVar == null) {
            g10 = false;
        } else {
            g10 = diVar.g();
        }
        eg.s0 s0Var = this.f26686c1;
        s0Var.setEnabled(g10);
        di diVar2 = this.f26744v0;
        float f13 = 0.5f;
        if (diVar2 != null) {
            if (diVar2.g()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f26748w0 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.f26678a0;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        di diVar3 = this.f26748w0;
        if (diVar3 != null) {
            if (diVar3.g()) {
                f13 = 1.0f;
            }
            f10 = e2.c.w(1.0f, this.f26678a0, f13, f10);
        }
        this.f26689d1 = f10;
        if (s0Var != null) {
            float f14 = f10 * this.f26692e1;
            s0Var.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            s0Var.setVisibility(i10);
        }
    }

    public final void X1(di diVar, int i10) {
        boolean z4;
        int i11;
        int i12;
        if (diVar != null) {
            ng.e eVar = this.f26761z2;
            if (eVar != null && Build.VERSION.SDK_INT >= 31) {
                eVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = diVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z10 = false;
                if (diVar == this.f26744v0 && currentItemTop <= diVar.getButtonsHideOffset()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.O = z4;
                if (diVar == this.f26744v0) {
                    T1(z4, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) diVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int C = org.telegram.ui.b.C(11.0f, i11, currentItemTop);
                di diVar2 = this.f26744v0;
                if (diVar2 == diVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((diVar2 instanceof nm) || (this.f26748w0 instanceof nm)) {
                    Object obj = this.f26728q1;
                    if ((obj instanceof o1.j) && ((o1.j) obj).f16172f) {
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
        if (m1().f24030a.length() <= 0) {
            return;
        }
        this.f26744v0.a(m1().getText());
    }

    public final void Y1(boolean z4) {
        kc0 kc0Var;
        boolean z10;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
        if (chatAttachAlertPhotoLayout != null && (kc0Var = this.Y0) != null) {
            int i10 = 0;
            if (this.f26719n1 && this.f26695f0 && this.f26744v0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !ChatAttachAlertPhotoLayout.S();
            kc0Var.f26258f = z11;
            if (!z4) {
                ((z5) kc0Var.f26259g).a(z11);
            }
            kc0Var.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.Z0;
            if (z4 && this.f26719n1) {
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
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(mr.h).withEndAction(new fh(this, z10, 0)).start();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.Z0():void");
    }

    public final void Z1(boolean z4) {
        boolean z10;
        float f10;
        di diVar = this.f26698g0;
        if (z4) {
            if (!this.J) {
                return;
            }
            if (this.f26718n0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f26730r;
                if (f6Var == null) {
                    f6Var = this.resourcesProvider;
                }
                ?? diVar2 = new di(context, f6Var, this);
                diVar2.f27303y = 0.0f;
                diVar2.B = 0.0f;
                diVar2.C = 0.0f;
                diVar2.D = 0.0f;
                diVar2.E = 0.0f;
                diVar2.F = 0.0f;
                diVar2.G = null;
                diVar2.H = false;
                diVar2.J = 0.0f;
                diVar2.N = false;
                diVar2.P = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                diVar2.Q = z10;
                diVar2.f27298n = f6Var;
                diVar2.f24284f = true;
                diVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = diVar2.f24282b.U0.n();
                TextView textView = new TextView(context);
                diVar2.f27302x = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = diVar2.f24281a;
                ul ulVar = new ul(diVar2, context, n10, f6Var2, 1);
                eg.l1 l1Var = diVar2.f24282b.U0;
                if (AndroidUtilities.isTablet()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                l1Var.addView(ulVar, 0, k7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                ulVar.addView(textView, k7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                lh.e1 e1Var = new lh.e1(diVar2, context, f6Var2, 12);
                diVar2.f27299r = e1Var;
                e1Var.setAdapter(new org.telegram.ui.a8(diVar2, 3));
                f2.i0 i0Var = new f2.i0(1, false);
                diVar2.f27300s = i0Var;
                e1Var.setLayoutManager(i0Var);
                e1Var.setClipChildren(false);
                e1Var.setClipToPadding(false);
                e1Var.setOverScrollMode(2);
                e1Var.setVerticalScrollBarEnabled(false);
                mm mmVar = new mm(diVar2, context);
                diVar2.v = mmVar;
                mmVar.setClipToPadding(true);
                mmVar.setClipChildren(true);
                diVar2.addView(e1Var, k7.b6.c(-1.0f, -1));
                diVar2.M = diVar2.f24282b.f26698g0;
                mmVar.f27090c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar2.M;
                mmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                mmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                mmVar.c();
                UndoView undoView = new UndoView(context, null, false, diVar2.f24282b.f26730r);
                diVar2.f27301w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                diVar2.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                diVar2.K = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f26718n0 = diVar2;
                diVar2.bringToFront();
            }
            di diVar3 = this.f26744v0;
            nm nmVar = this.f26718n0;
            if (diVar3 != nmVar) {
                diVar = nmVar;
            }
            Q1(diVar);
            return;
        }
        Q1(diVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if ((p2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            return ChatActivityEnterView.H(this.G1, ((org.telegram.ui.zn) p2Var).a(), p2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f26722o1.invalidate();
        ah.e eVar = this.L0;
        eVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
        if (chatAttachAlertPhotoLayout != null) {
            ol olVar = chatAttachAlertPhotoLayout.B;
            chatAttachAlertPhotoLayout.V();
            if (olVar != null && olVar.getFastScroll() != null) {
                al0 fastScroll = olVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f22895m1;
                if (this.Z) {
                    i10 = (int) (eVar.getAlpha() * eVar.getMeasuredHeight());
                }
                fastScroll.f23437e0 = currentActionBarHeight + i10;
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
        nh nhVar = this.f26745v1;
        if (nhVar == null) {
            return;
        }
        int childCount = nhVar.getChildCount();
        boolean z4 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            nhVar.getChildAt(i20);
        }
        boolean z10 = this.f26693e2;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.f19962hg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19987j5;
        }
        this.f26699g1.setTextColor(getThemedColor(i10));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f19962hg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        }
        this.l1.setTextColor(getThemedColor(i11));
        this.f26686c1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        if (z10) {
            i12 = org.telegram.ui.ActionBar.j6.f19962hg;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f19987j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.w0 w0Var = this.X0;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z10) {
            i13 = org.telegram.ui.ActionBar.j6.f19979ig;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.I5;
        }
        org.telegram.ui.ActionBar.j6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.j6.E8;
        w0Var.G(getThemedColor(i21), false);
        w0Var.G(getThemedColor(i21), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Z0;
        if (w0Var2 != null) {
            if (z10) {
                i19 = org.telegram.ui.ActionBar.j6.f19962hg;
            } else {
                i19 = org.telegram.ui.ActionBar.j6.f19987j5;
            }
            w0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f26682b1;
        if (w0Var3 != null) {
            if (z10) {
                i17 = org.telegram.ui.ActionBar.j6.f19962hg;
            } else {
                i17 = org.telegram.ui.ActionBar.j6.f19987j5;
            }
            w0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = w0Var3.getBackground();
            if (z10) {
                i18 = org.telegram.ui.ActionBar.j6.f19979ig;
            } else {
                i18 = org.telegram.ui.ActionBar.j6.I5;
            }
            org.telegram.ui.ActionBar.j6.w1(getThemedColor(i18), background2);
        }
        qh qhVar = this.B0;
        org.telegram.ui.ActionBar.f6 f6Var = qhVar.J;
        xt xtVar = qhVar.f24030a;
        int i22 = qhVar.I;
        if (i22 == 0) {
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            int i23 = org.telegram.ui.ActionBar.j6.G6;
            xtVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var));
        } else if (i22 != 2 && i22 != 3) {
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20165t5, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
        } else {
            xtVar.setHintTextColor(-1929379841);
            xtVar.setTextColor(-1);
            xtVar.setCursorColor(-1);
            xtVar.setHandlesColor(-1);
            xtVar.setHighlightColor(822083583);
            xtVar.quoteColor = -1;
        }
        qhVar.f24032c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
        yt ytVar = qhVar.d;
        if (ytVar != null) {
            ytVar.U();
        }
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        if (z10) {
            i14 = org.telegram.ui.ActionBar.j6.f19962hg;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.f19987j5;
        }
        int themedColor2 = getThemedColor(i14);
        eg.l1 l1Var = this.U0;
        l1Var.C(themedColor2, false);
        if (z10) {
            i15 = org.telegram.ui.ActionBar.j6.f19979ig;
        } else {
            i15 = org.telegram.ui.ActionBar.j6.I5;
        }
        l1Var.B(getThemedColor(i15), false);
        if (z10) {
            i16 = org.telegram.ui.ActionBar.j6.f19962hg;
        } else {
            i16 = org.telegram.ui.ActionBar.j6.f19987j5;
        }
        l1Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        sg.c cVar = this.C2;
        if (cVar.f44374a.getColor() != q12) {
            cVar.a(q12);
            wg.f fVar = this.f26736s1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.f26739t1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            di[] diVarArr = this.f26738t0;
            if (i24 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i24];
            if (diVar != null) {
                diVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19970i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f26744v0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.f26716m2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.f26720n2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.d1(boolean):void");
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
        ii iiVar = this.f26753x1;
        if (iiVar != null) {
            iiVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z4) {
        if (z4) {
            this.f26754x2 = z4;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ji jiVar = this.W1;
        if (jiVar != null) {
            jiVar.C0(new wg(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f26744v0.o(i10);
    }

    public final void e1() {
        float f10 = this.f26684c.e;
        float f11 = (1.0f - this.f26680b.e) * f10;
        this.f26739t1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.e))), 1.0f - f11));
    }

    public final void f1() {
        float f10;
        float f11 = this.e.e;
        float f12 = this.f26694f.e;
        float b10 = kf.m0.b(this.h.e);
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
        ah.e eVar = this.L0;
        if (eVar != null && eVar.getVisibility() == 0 && eVar.getAlpha() != 0.0f) {
            float f10 = this.f26680b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
            vhVar.setAlpha(abs * abs * abs * abs);
            mhVar.setTranslationY(AndroidUtilities.lerp(this.f26690d2, ((eVar.getTranslationY() + eVar.getTop()) - mhVar.getTop()) + AndroidUtilities.dp(8.0f), mr.f27125j.getInterpolation(f10)));
            return;
        }
        mhVar.setTranslationY(this.f26690d2);
        vhVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            di[] diVarArr = this.f26738t0;
            if (i10 < diVarArr.length) {
                di diVar = diVarArr[i10];
                if (diVar != null && (themeDescriptions = diVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19970i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.P0 = true;
        this.f26742u1.setVisibility(0);
        this.E = true;
        this.F = i10;
        this.N0 = 0;
        this.C = false;
        this.D = false;
        this.G = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f26702h1;
        if (w0Var != null) {
            this.f26699g1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(ph.d4 d4Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f26699g1;
        textView.setText(string);
        this.P0 = false;
        this.f26742u1.setVisibility(8);
        this.N0 = 1;
        this.C = true;
        this.D = true;
        this.f26695f0 = false;
        this.G = d4Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.f26702h1;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if ((p2Var instanceof org.telegram.ui.zn) && (messagePreviewParams = ((org.telegram.ui.zn) p2Var).f40542c5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) p2Var).e;
        }
        return MessagesController.getInstance(this.G1).getChat(Long.valueOf(-this.W));
    }

    public final float l1() {
        mh mhVar = this.A0;
        float alpha = 1.0f - mhVar.getAlpha();
        return mhVar.getMeasuredHeight() - (alpha * (mhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final cu m1() {
        di diVar;
        if (this.Z && ((diVar = this.f26744v0) == this.f26698g0 || diVar == this.f26718n0)) {
            return this.M0;
        }
        return this.B0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) p2Var).a();
        }
        return this.W;
    }

    public final int o1() {
        di diVar = this.f26744v0;
        pn pnVar = this.f26707j0;
        if (diVar == pnVar && pnVar.B != null) {
            return pnVar.getEmojiPadding();
        }
        pn pnVar2 = this.f26710k0;
        if (diVar == pnVar2 && pnVar2.B != null) {
            return pnVar2.getEmojiPadding();
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
        eg.l1 l1Var = this.U0;
        if (l1Var.f20305k0) {
            l1Var.h(true);
        } else if (this.f26744v0.i()) {
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
        return this.f26744v0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z4;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
        h91 h91Var = chatAttachAlertPhotoLayout.f22888i0;
        dg.u2 u2Var = chatAttachAlertPhotoLayout.f22884g0;
        TextView textView = chatAttachAlertPhotoLayout.m0;
        ol olVar = chatAttachAlertPhotoLayout.f22901r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == u2Var) {
            if (z4) {
                if (olVar.getVisibility() == 0) {
                    u2Var.layout(0, org.telegram.messenger.y3.B(222.0f, i13, i16), i14, org.telegram.messenger.y3.B(96.0f, i13, i16));
                    return true;
                }
                u2Var.layout(0, org.telegram.messenger.y3.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (olVar.getVisibility() == 0) {
                u2Var.layout(org.telegram.messenger.y3.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                u2Var.layout(org.telegram.messenger.y3.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == h91Var) {
            if (z4) {
                if (olVar.getVisibility() == 0) {
                    h91Var.layout(0, org.telegram.messenger.y3.B(310.0f, i13, i16), i14, org.telegram.messenger.y3.B(260.0f, i13, i16));
                    return true;
                }
                h91Var.layout(0, org.telegram.messenger.y3.B(176.0f, i13, i16), i14, org.telegram.messenger.y3.B(126.0f, i13, i16));
                return true;
            } else if (olVar.getVisibility() == 0) {
                h91Var.layout(org.telegram.messenger.y3.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                h91Var.layout(org.telegram.messenger.y3.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z4) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
        dm dmVar = chatAttachAlertPhotoLayout.v;
        ol olVar = chatAttachAlertPhotoLayout.f22901r;
        org.telegram.ui.k kVar = chatAttachAlertPhotoLayout.f22903s;
        if (i10 < i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        zl zlVar = chatAttachAlertPhotoLayout.M;
        if (view == zlVar) {
            if (chatAttachAlertPhotoLayout.V && !chatAttachAlertPhotoLayout.f22872a0) {
                zlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            dg.u2 u2Var = chatAttachAlertPhotoLayout.f22884g0;
            if (view == u2Var) {
                if (z4) {
                    u2Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                u2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            h91 h91Var = chatAttachAlertPhotoLayout.f22888i0;
            if (view == h91Var) {
                if (z4) {
                    h91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                h91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == olVar) {
                chatAttachAlertPhotoLayout.G0 = true;
                if (z4) {
                    olVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (kVar.f5720o != 0) {
                        olVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        kVar.j1(0);
                        dmVar.l();
                    }
                } else {
                    olVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (kVar.f5720o != 1) {
                        olVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        kVar.j1(1);
                        dmVar.l();
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
        this.f26698g0.setTranslationX(0.0f);
        this.f26711k1.setAlpha(0.0f);
        this.f26705i1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f26720n2 = animatorSet;
        yh yhVar = this.f26714l2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, yhVar, 0.0f, 400.0f));
        this.f26720n2.setDuration(400L);
        this.f26720n2.setStartDelay(20L);
        yhVar.set(this, Float.valueOf(0.0f));
        this.f26720n2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ug(this, 2));
        o1.j jVar = this.f26716m2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.f16162n, 0.0f);
        this.f26716m2 = jVar2;
        if (this.E1 != null) {
            jVar2.f16178u.a(0.75f);
            this.f26716m2.f16178u.b(350.0f);
        } else {
            jVar2.f16178u.a(0.75f);
            this.f26716m2.f16178u.b(350.0f);
        }
        this.f26716m2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.f3 f3Var = this.backDrawable;
        l6 l6Var = n6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(f3Var, l6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        lh.p6 p6Var = new lh.p6(this, animationNotificationsLocker, this.delegate, 28);
        this.f26716m2.a(new lb(1, this, p6Var));
        this.currentSheetAnimation.addListener(new dg.y2(19, this, p6Var));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new ug(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(mr.f27122f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f26744v0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f26744v0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f26685c0 instanceof org.telegram.ui.zn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f26744v0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f26725p1 = true;
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
            ((LaunchActivity) context).f31634y0.add(this.P);
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
            ((LaunchActivity) context).f31634y0.remove(this.P);
        }
    }

    public final int p1(int i10) {
        di diVar = this.f26748w0;
        int[] iArr = this.Y1;
        if (diVar != null && ((this.f26744v0 instanceof nm) || (diVar instanceof nm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f26678a0);
        }
        return iArr[i10];
    }

    public final int q1(boolean z4) {
        boolean q10;
        int i10;
        eg.l1 l1Var;
        if (this.f26693e2) {
            return getThemedColor(org.telegram.ui.ActionBar.j6.f20173tg);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Iterator it = this.f26717n.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            long longValue = ((Long) eVar.f46967a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a2 = k7.n.a(f10, 0.0f, 1.0f);
        if (z4 && (l1Var = this.U0) != null && l1Var.getVisibility() == 0) {
            a2 *= 1.0f - l1Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5);
        if (q10) {
            i10 = org.telegram.ui.ActionBar.j6.f19827a7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19970i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.r1():void");
    }

    public final boolean s1() {
        if (this.Z) {
            di diVar = this.f26744v0;
            if (diVar == this.f26698g0 || diVar == this.f26718n0) {
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
        di diVar = this.f26744v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26698g0;
        if (diVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f22883f1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z4;
        super.show();
        this.F1 = false;
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            this.calcMandatoryInsets = ((org.telegram.ui.zn) p2Var).x9();
        }
        W1();
        this.f26725p1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        }
        if (this.f26709j2) {
            this.f26709j2 = false;
            eg.l1 l1Var = this.U0;
            l1Var.e();
            l1Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z4) {
        long j10;
        ji jiVar = this.W1;
        if (jiVar != null && !this.f26732r1) {
            boolean h02 = jiVar.h0();
            this.f26732r1 = true;
            lh.r5 r5Var = new lh.r5(this, editTextBoldCursor, z4, 13);
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
            org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
            sg.c cVar = this.C2;
            if (cVar.f44374a.getColor() != q12) {
                cVar.a(q12);
                wg.f fVar = this.f26736s1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                oh ohVar = this.f26739t1;
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
            di[] diVarArr = this.f26738t0;
            if (i10 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i10];
            if (diVar != null) {
                diVar.m();
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
            if (tL_attachMenuBot2.bot_id == user.f19306id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
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
            di[] diVarArr = this.f26738t0;
            if (i10 < diVarArr.length) {
                di diVar = diVarArr[i10];
                if (diVar != null) {
                    diVar.x();
                }
                i10++;
            } else {
                this.f26687c2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f26687c2 = false;
        while (true) {
            di[] diVarArr = this.f26738t0;
            if (i10 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i10];
            if (diVar != null) {
                diVar.A();
            }
            i10++;
        }
        if (isShowing()) {
            this.W1.h0();
        }
        ii iiVar = this.f26753x1;
        if (iiVar != null) {
            iiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.E1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        int i10 = this.G1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.E1.getDialogId()) && (p2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var;
            MessageSuggestionParams messageSuggestionParams = znVar.f40555d5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.E1.messageOwner.suggested_post);
            }
            if (!lh.t7.U(i10, messageSuggestionParams.amount)) {
                znVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.H - this.I < 0) {
            AndroidUtilities.shakeView(this.f26734s);
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
        if (this.E1 == null && (p2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) p2Var;
            if (znVar2.c()) {
                z4.M(getContext(), znVar2.a(), new tg(this, 12), this.resourcesProvider);
                return;
            }
        }
        di diVar = this.f26744v0;
        if (diVar != this.f26698g0 && diVar != this.f26718n0) {
            if (!diVar.H(0, true, 0, s1(), this.K0)) {
                this.f26754x2 = true;
                dismiss();
                return;
            }
            return;
        }
        G1(0, true, 0, s1(), this.K0);
    }

    @Override
    public final void dismiss() {
        if (this.f26744v0.n() || isDismissed()) {
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
        this.f26741u0.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.f26685c0;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        if (!this.f26754x2 && p2Var != null && this.f26744v0.getSelectedItemsCount() > 0 && !this.C) {
            if (this.f26750w2) {
                return;
            }
            this.f26750w2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new tg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19478a.setOnCancelListener(new zg(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            d2Var.K = b1Var;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            di[] diVarArr = this.f26738t0;
            if (i10 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i10];
            if (diVar != null && this.f26744v0 != diVar) {
                diVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7), 0), true, (AndroidUtilities.IntColorCallback) new tg(this, 11));
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
        this.f26697f2 = false;
        super.dismiss();
        this.f26754x2 = false;
    }

    @Override
    public final void z(float f10, int i10) {
    }

    public li(Activity activity, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10) {
        this(activity, p2Var, z4, z10, true, null);
    }
}
