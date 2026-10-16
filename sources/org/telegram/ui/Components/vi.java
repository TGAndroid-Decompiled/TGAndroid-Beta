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
import org.telegram.ui.uj1;
public class vi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, ne.d {
    public static final int R2 = 0;
    public final LongSparseArray A0;
    public final xh A1;
    public double[] A2;
    public ni B0;
    public final yh B1;
    public boolean B2;
    public ni C0;
    public final s4.b0 C1;
    public boolean C2;
    public final dh.d D0;
    public final si D1;
    public boolean D2;
    public final i0 E;
    public final dh.d E0;
    public boolean E1;
    public di.i E2;
    public boolean F;
    public final ig.j F0;
    public final RadialProgressView F1;
    public final bh.f F2;
    public boolean G;
    public final xh G0;
    public boolean G1;
    public final gh.d G2;
    public boolean H;
    public final ai H0;
    public final s6 H1;
    public final gh.d H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final gh.c I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final bh.b J2;
    public int K;
    public final xh K0;
    public MessageObject K1;
    public final bh.b K2;
    public int L;
    public final fi L0;
    public boolean L1;
    public final lh L2;
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
    public g50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ah.v R0;
    public boolean R1;
    public final re0 S;
    public final di S0;
    public boolean S1;
    public jo T;
    public int T0;
    public boolean T1;
    public i50 U;
    public du U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public gk X;
    public boolean X0;
    public boolean X1;
    public ej Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean f29655a0;
    public final b8 f29656a1;
    public ValueAnimator a2;
    public final ne.b f29657b;
    public final bh.c f29658b0;
    public AnimatorSet f29659b1;
    public int f29660b2;
    public final ne.b f29661c;
    public boolean f29662c0;
    public AnimatorSet f29663c1;
    public ti f29664c2;
    public final ne.b d;
    public float f29665d0;
    public final org.telegram.ui.ActionBar.u0 f29666d1;
    public sn f29667d2;
    public final ne.b e;
    public final ji f29668e0;
    public final di.u f29669e1;
    public final int[] f29670e2;
    public final ne.b f29671f;
    public final org.telegram.ui.ActionBar.m2 f29672f0;
    public final org.telegram.ui.ActionBar.u0 f29673f1;
    public int f29674f2;
    public final boolean f29675g0;
    public di.d4 f29676g1;
    public float f29677g2;
    public final ne.b h;
    public of f29678h0;
    public final org.telegram.ui.ActionBar.u0 f29679h1;
    public float f29680h2;
    public boolean f29681i0;
    public final ci.n f29682i1;
    public boolean f29683i2;
    public final ChatAttachAlertPhotoLayout f29684j0;
    public float f29685j1;
    public float f29686j2;
    public zj f29687k0;
    public float f29688k1;
    public final boolean f29689k2;
    public hj f29690l0;
    public final xh l1;
    public boolean f29691l2;
    public io m0;
    public final TextView f29692m1;
    public final ArrayList f29693m2;
    public final ne.l f29694n;
    public io f29695n0;
    public final org.telegram.ui.ActionBar.u0 f29696n1;
    public final Rect f29697n2;
    public tl f29698o0;
    public final LinearLayout f29699o1;
    public float f29700o2;
    public pk f29701p0;
    public final ImageView f29702p1;
    public boolean f29703p2;
    public en f29704q0;
    public final LinearLayout f29705q1;
    public int f29706q2;
    public org.telegram.ui.co f29707r;
    public kj f29708r0;
    public final TextView f29709r1;
    public final ji f29710r2;
    public final s6 f29711s;
    public ig.i0 f29712s0;
    public float f29713s1;
    public o1.k f29714s2;
    public qk f29715t0;
    public boolean f29716t1;
    public AnimatorSet f29717t2;
    public qk f29718u0;
    public final li f29719u1;
    public boolean f29720u2;
    public final s6 v;
    public ji.r f29721v0;
    public boolean f29722v1;
    public boolean f29723v2;
    public final ImageView f29724w;
    public cl f29725w0;
    public Object f29726w1;
    public ol f29727w2;
    public final i0 f29728x;
    public boolean f29729x0;
    public boolean f29730x1;
    public boolean f29731x2;
    public final ImageView f29732y;
    public float f29733y0;
    public final kh.f f29734y1;
    public boolean f29735y2;
    public final ni[] f29736z0;
    public final zh f29737z1;
    public File f29738z2;

    public vi(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        ci.n nVar;
        int i10;
        float f7;
        b8 b8Var;
        es esVar = es.h;
        this.f29657b = new ne.b(0, this, esVar, 380L, false);
        this.f29661c = new ne.b(1, this, esVar, 380L, false);
        this.d = new ne.b(2, this, esVar, 380L, false);
        this.e = new ne.b(3, this, esVar, 380L, false);
        this.f29671f = new ne.b(4, this, esVar, 380L, true);
        this.h = new ne.b(5, this, esVar, 320L, false);
        ne.l lVar = new ne.l(new eh(this, 2), esVar, 380L);
        this.f29694n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f29665d0 = 0.0f;
        this.f29668e0 = new ji(this, 0);
        this.f29681i0 = false;
        ni[] niVarArr = new ni[12];
        this.f29736z0 = niVarArr;
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
        this.f29660b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f29670e2 = new int[2];
        new Paint(1);
        this.f29691l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f29693m2 = arrayList;
        Rect rect = new Rect();
        this.f29697n2 = rect;
        this.f29710r2 = new ji(this, 1);
        this.f29720u2 = true;
        this.f29723v2 = false;
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
        gh.c cVar = new gh.c();
        this.I2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.H2 = dVar;
            dVar.k(new ji.w4(this, 12));
            gh.d dVar2 = new gh.d(null);
            this.G2 = dVar2;
            dVar2.k(new ji.h5(this, 12));
            bh.b bVar = new bh.b(dVar);
            this.J2 = bVar;
            bVar.f2751i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.K2 = bVar2;
            bVar2.f2751i = LiteMode.isEnabled(262144);
        } else {
            this.F2 = null;
            this.G2 = null;
            this.H2 = null;
            this.J2 = new bh.b(cVar);
            this.K2 = new bh.b(cVar);
        }
        bh.b bVar3 = new bh.b(cVar);
        this.L2 = new lh(this, 0);
        this.f29689k2 = z10;
        this.f29675g0 = (m2Var instanceof org.telegram.ui.fo) && m2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f29672f0 = m2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        li liVar = new li(this, context);
        this.f29719u1 = liVar;
        liVar.setDelegate(new mi(this));
        this.containerView = liVar;
        liVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        b8 b8Var2 = new b8(this, context, c6Var, 1);
        this.f29656a1 = b8Var2;
        b8Var2.S0 = true;
        b8Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        b8Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(false));
        int i13 = org.telegram.ui.ActionBar.g6.f19707j5;
        b8Var2.D(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.g6.I5;
        b8Var2.C(getThemedColor(i14), false);
        b8Var2.setTitleColor(getThemedColor(i13));
        b8Var2.setOccupyStatusBar(true);
        b8Var2.setAlpha(0.0f);
        b8Var2.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 10));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
        this.f29666d1 = u0Var2;
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
        u0Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i14), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
        this.f29673f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        di.u uVar = new di.u();
        this.f29669e1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        u0Var3.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i14), 6, -1));
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        ci.n nVar2 = new ci.n(this, context);
        nVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        nVar2.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        w7.b6.a(nVar2);
        this.f29682i1 = nVar2;
        a2();
        if (m2Var != null) {
            nVar = nVar2;
            u0Var = u0Var3;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
            this.f29679h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i10 = -1;
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i14), 6, -1));
            u0Var4.setOnClickListener(new bi.z2(5, this, z11));
        } else {
            u0Var = u0Var3;
            nVar = nVar2;
            i10 = -1;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
        this.f29696n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i14), 3, i10));
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final vi f26030b;

            {
                this.f26030b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.fo foVar;
                switch (r3) {
                    case 0:
                        final vi viVar = this.f26030b;
                        ai aiVar = viVar.H0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), c6Var);
                            e0Var.n0(aiVar.getText());
                            e0Var.f24225j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar = viVar.S0;
                                            diVar.setText(charSequence);
                                            diVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = viVar.Z;
                            if (viVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            nh nhVar = new nh(viVar, 0);
                            e0Var.f24227l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f24228n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final vi viVar2 = this.f26030b;
                        di diVar = viVar2.S0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), c6Var);
                            e0Var2.n0(diVar.getText());
                            e0Var2.f24225j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar2.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar2.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = viVar2.Z;
                            if (viVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nh nhVar2 = new nh(viVar2, 1);
                            e0Var2.f24227l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f24228n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        vi viVar3 = this.f26030b;
                        viVar3.f29696n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar3.f29672f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i15 = viVar3.V1;
                        boolean z15 = viVar3.W1;
                        t13.h = i15;
                        t13.f32005n = z15;
                        if (!viVar3.f29664c2.w()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w9 = di.k8.w(viVar3.M1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        wh whVar = new wh(viVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.fo) {
                            foVar = (org.telegram.ui.fo) m2Var2;
                        } else {
                            foVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, whVar, foVar);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        xh xhVar = new xh(this, context, 0);
        this.l1 = xhVar;
        xhVar.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        xhVar.setAlpha(0.0f);
        xhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29699o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f29692m1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f29702p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        xhVar.addView(linearLayout, w7.z5.d(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f29705q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f29709r1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        xhVar.addView(linearLayout2, w7.z5.d(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.f29684j0 = chatAttachAlertPhotoLayout;
        niVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.d(-1.0f, -1));
        ?? view = new View(context);
        this.f29734y1 = view;
        view.setup(bVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.z5.g());
        this.containerView.addView(xhVar, w7.z5.a(-2.0f, 23.0f, 0.0f, 21.0f, 0.0f, -1, 51));
        ah.v vVar = new ah.v(context, 10);
        this.R0 = vVar;
        this.containerView.addView(vVar, w7.z5.e(-1, -2, 55));
        this.containerView.addView(b8Var2, w7.z5.d(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.z5.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f29679h1;
        if (u0Var6 != null) {
            b8Var = b8Var2;
            this.containerView.addView(u0Var6, w7.z5.e(48, 48, 53));
        } else {
            b8Var = b8Var2;
        }
        xhVar.addView(u0Var5, w7.z5.a(32.0f, 0.0f, 0.0f, 0.0f, 8.0f, 32, 21));
        this.containerView.addView(nVar, w7.z5.e(-2, 48, 53));
        xh xhVar2 = new xh(this, context, 1);
        this.A1 = xhVar2;
        yh yhVar = new yh(context, 0);
        this.B1 = yhVar;
        yhVar.setClipChildren(true);
        yhVar.setClipToPadding(false);
        si siVar = new si(this, context);
        this.D1 = siVar;
        yhVar.setAdapter(siVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.C1 = b0Var;
        yhVar.setLayoutManager(b0Var);
        yhVar.setVerticalScrollBarEnabled(false);
        yhVar.setHorizontalScrollBarEnabled(false);
        yhVar.setItemAnimator(null);
        yhVar.setLayoutAnimation(null);
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        yhVar.f27168x2 = true;
        yhVar.setOverScrollMode(2);
        bh.b bVar4 = this.J2;
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f2749f = jVar;
        bVar4.f2750g = viewGroup2;
        bh.b bVar5 = this.K2;
        ih.j jVar2 = new ih.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f2749f = jVar2;
        bVar5.f2750g = viewGroup3;
        ih.j jVar3 = new ih.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        bVar3.f2749f = jVar3;
        bVar3.f2750g = viewGroup4;
        zh zhVar = new zh(this, context, 0);
        this.f29737z1 = zhVar;
        bh.c cVar2 = new bh.c(bVar3.c(zhVar, null, false));
        this.f29658b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(zhVar, w7.z5.g());
        dh.d c10 = this.J2.c(xhVar2, fh.b.f(c6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        xhVar2.setBackground(c10);
        yhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        yhVar.setClipToOutline(true);
        bi.a2 a2Var = zf.j0.f50192a;
        yhVar.setOutlineProvider(new zf.i0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        yhVar.setImportantForAccessibility(1);
        xhVar2.addView(yhVar, w7.z5.g());
        this.containerView.addView(xhVar2, w7.z5.e(-1, 70, 81));
        yhVar.setOnItemClickListener(new bi.z5(9, this, c6Var));
        yhVar.setOnItemLongClickListener(new eh(this, 3));
        s6 s6Var = new s6(context, true, false, true);
        this.H1 = s6Var;
        s6Var.setVisibility(8);
        s6Var.setAlpha(0.0f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        s6Var.setPadding(dp, 0, dp, 0);
        s6Var.setTextSize(AndroidUtilities.dp(f7));
        s6Var.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view2) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        this.containerView.addView(s6Var, w7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.z5.a(28.0f, 0.0f, 0.0f, 10.0f, 10.0f, 28, 85));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f20005z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view2) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        xh xhVar3 = new xh(this, context, 2);
        this.G0 = xhVar3;
        ig.j jVar4 = new ig.j(this, context);
        this.F0 = jVar4;
        xhVar3.addView(jVar4, w7.z5.e(-1, -1, 119));
        dh.d c11 = this.K2.c(liVar, fh.b.n(c6Var), false);
        this.D0 = c11;
        c11.f6564m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f6561j.f6547g = 0.4f;
        c11.k();
        dh.d c12 = this.J2.c(jVar4, fh.b.n(c6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar4.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        xhVar3.setWillNotDraw(false);
        xhVar3.setVisibility(4);
        xhVar3.setAlpha(0.0f);
        this.containerView.addView(xhVar3, w7.z5.e(-1, -2, 83));
        xhVar3.setOnTouchListener(new ci.d(13));
        s6 s6Var2 = new s6(context, false, false, false);
        this.f29711s = s6Var2;
        s6Var2.setAllowCancel(true);
        s6Var2.setScaleProperty(0.6f);
        s6Var2.setVisibility(8);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i15 = org.telegram.ui.ActionBar.g6.f19988y6;
        s6Var2.setTextColor(getThemedColor(i15));
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        jVar4.addView(s6Var2, w7.z5.a(20.0f, 3.0f, 0.0f, 3.0f, 50.0f, 56, 85));
        ImageView imageView4 = new ImageView(context);
        this.f29724w = imageView4;
        i0 i0Var = new i0(context);
        this.f29728x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.g6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        int i17 = org.telegram.ui.ActionBar.g6.f19690i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        jVar4.addView(imageView4, w7.z5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final vi f26030b;

            {
                this.f26030b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.fo foVar;
                switch (r3) {
                    case 0:
                        final vi viVar = this.f26030b;
                        ai aiVar = viVar.H0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), c6Var);
                            e0Var.n0(aiVar.getText());
                            e0Var.f24225j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = viVar.Z;
                            if (viVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            nh nhVar = new nh(viVar, 0);
                            e0Var.f24227l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f24228n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final vi viVar2 = this.f26030b;
                        di diVar = viVar2.S0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), c6Var);
                            e0Var2.n0(diVar.getText());
                            e0Var2.f24225j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar2 = viVar2.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar2.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = viVar2.Z;
                            if (viVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nh nhVar2 = new nh(viVar2, 1);
                            e0Var2.f24227l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f24228n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        vi viVar3 = this.f26030b;
                        viVar3.f29696n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar3.f29672f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = viVar3.V1;
                        boolean z15 = viVar3.W1;
                        t13.h = i152;
                        t13.f32005n = z15;
                        if (!viVar3.f29664c2.w()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w9 = di.k8.w(viVar3.M1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        wh whVar = new wh(viVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.fo) {
                            foVar = (org.telegram.ui.fo) m2Var2;
                        } else {
                            foVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, whVar, foVar);
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
        ai aiVar = new ai(this, context, liVar, c6Var);
        this.H0 = aiVar;
        aiVar.J = true;
        aiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        aiVar.s();
        aiVar.getEditText().setLayoutParams(w7.z5.a(-1.0f, 48.0f, 0.0f, 36.0f, 0.0f, -1, 19));
        aiVar.getEditText().addTextChangedListener(new ci(this, 0));
        jVar4.addView(aiVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 83));
        jVar4.setClipChildren(false);
        xhVar3.setClipChildren(false);
        aiVar.setClipChildren(false);
        vVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar.setWillNotDraw(false);
        di diVar = new di(this, context, liVar, c6Var);
        this.S0 = diVar;
        diVar.J = true;
        diVar.getEditText().addTextChangedListener(new ei(this, m2Var));
        diVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        diVar.getEditText().setLayoutParams(w7.z5.a(-1.0f, 48.0f, 0.0f, 96.0f, 0.0f, -1, 19));
        diVar.getEditText().setTextSize(1, 17.0f);
        diVar.getEmojiButton().setLayoutParams(w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar.addView(diVar, w7.z5.e(-1, -2, 119));
        vVar.setAlpha(0.0f);
        vVar.setVisibility(8);
        aiVar.addView(imageView3, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 4.0f, 40, 85));
        dh.d c13 = this.J2.c(vVar, fh.b.n(c6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        vVar.setBackground(c13);
        vVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        s6 s6Var3 = new s6(context, false, false, false);
        this.v = s6Var3;
        s6Var3.setScaleProperty(0.6f);
        s6Var3.setVisibility(8);
        s6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var3.setTextColor(getThemedColor(i15));
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setGravity(17);
        s6Var3.setAllowCancel(true);
        vVar.addView(s6Var3, w7.z5.a(20.0f, 3.0f, 45.0f, 3.0f, 0.0f, 56, 53));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Xd), mode2));
        diVar.addView(imageView5, w7.z5.a(40.0f, 0.0f, 0.0f, 60.0f, 0.0f, 40, 85));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view2) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f29732y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        vVar.addView(imageView6, w7.z5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 85));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final vi f26030b;

            {
                this.f26030b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.fo foVar;
                switch (r3) {
                    case 0:
                        final vi viVar = this.f26030b;
                        ai aiVar2 = viVar.H0;
                        if (aiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), c6Var);
                            e0Var.n0(aiVar2.getText());
                            e0Var.f24225j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar22 = viVar.H0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar2 = viVar.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = viVar.Z;
                            if (viVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            nh nhVar = new nh(viVar, 0);
                            e0Var.f24227l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f24228n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final vi viVar2 = this.f26030b;
                        di diVar2 = viVar2.S0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), c6Var);
                            e0Var2.n0(diVar2.getText());
                            e0Var2.f24225j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ai aiVar22 = viVar2.H0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            di diVar22 = viVar2.S0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = viVar2.Z;
                            if (viVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nh nhVar2 = new nh(viVar2, 1);
                            e0Var2.f24227l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f24228n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        vi viVar3 = this.f26030b;
                        viVar3.f29696n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar3.f29672f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = viVar3.V1;
                        boolean z15 = viVar3.W1;
                        t13.h = i152;
                        t13.f32005n = z15;
                        if (!viVar3.f29664c2.w()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w9 = di.k8.w(viVar3.M1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        wh whVar = new wh(viVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.fo) {
                            foVar = (org.telegram.ui.fo) m2Var2;
                        } else {
                            foVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, whVar, foVar);
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
        this.K0 = xhVar4;
        xhVar4.setFocusable(true);
        xhVar4.setFocusableInTouchMode(true);
        xhVar4.setVisibility(4);
        xhVar4.setScaleX(0.2f);
        xhVar4.setScaleY(0.2f);
        xhVar4.setAlpha(0.0f);
        xhVar4.setClipChildren(false);
        xhVar4.setClipToPadding(false);
        this.containerView.addView(xhVar4, w7.z5.e(110, 50, 85));
        fi fiVar = new fi(R.drawable.send_plane_24, context, c6Var, this);
        this.L0 = fiVar;
        fiVar.setImportantForAccessibility(2);
        xhVar4.addView(fiVar, w7.z5.e(-1, -1, 119));
        fiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        fiVar.I = dp2;
        fiVar.J = dp3;
        fiVar.M = AndroidUtilities.dp(7.0f);
        fiVar.N = AndroidUtilities.dp(6.0f);
        fiVar.f30557h0 = true;
        fiVar.setOnClickListener(new View.OnClickListener(this) {
            public final vi f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view2) {
                fi.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        vi viVar = this.f25640b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        vi viVar2 = this.f25640b;
                        boolean z14 = viVar2.f29662c0;
                        if (!z14) {
                            viVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        vi viVar3 = this.f25640b;
                        boolean z15 = viVar3.f29662c0;
                        if (z15) {
                            viVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25640b.C1();
                        return;
                    case 4:
                        this.f25640b.f29666d1.M(null, null);
                        return;
                    case 5:
                        vi.w(this.f25640b);
                        return;
                    case 6:
                        ni niVar = this.f25640b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25640b.f29696n1.M(null, null);
                        return;
                    default:
                        vi viVar4 = this.f25640b;
                        if (viVar4.B0 != viVar4.f29704q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        viVar4.d2(z13);
                        return;
                }
            }
        });
        fiVar.setOnLongClickListener(new org.telegram.ui.mg(this, context, c6Var, m2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        zh zhVar2 = new zh(this, context, 1);
        zhVar2.setAlpha(0.0f);
        zhVar2.setScaleX(0.2f);
        zhVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        tl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        bh.b bVar6 = this.J2;
        eh.e n10 = fh.b.n(c6Var);
        mm0 mm0Var = fastScroll.f29141o0;
        dh.d c14 = bVar6.c(mm0Var.f27128d1, n10, false);
        fastScroll.f29130e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f29130e0.q(AndroidUtilities.dp(24.0f));
        dh.d c15 = bVar6.c(mm0Var.f27128d1, n10, false);
        fastScroll.f29132f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f29132f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f29132f0.q(AndroidUtilities.dp(f7));
        re0 re0Var = new re0(context);
        this.S = re0Var;
        this.containerView.addView(re0Var, w7.z5.d(-1.0f, -1));
        eh.e eVar = new eh.e(c6Var);
        eVar.e = new eh(this, 4);
        eVar.f8781c = new eh(this, 5);
        eVar.d = new eh(this, 6);
        eVar.f8780b = new eh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        b8Var.M(this.J2, eVar, false);
        lVar.h(1L, false);
    }

    public static void O(vi viVar) {
        boolean z10;
        boolean q6;
        int i10;
        b8 b8Var = viVar.f29656a1;
        kh.f fVar = viVar.f29734y1;
        if (fVar != null && b8Var != null) {
            ni niVar = viVar.C0;
            if (niVar == null) {
                niVar = viVar.B0;
            }
            int i11 = 0;
            if (niVar != null && (niVar instanceof cl)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.c6 c6Var = viVar.resourcesProvider;
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            if (!z10 && b8Var.getVisibility() == 0) {
                if (q6) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i11 = (int) (b8Var.getAlpha() * i10);
            }
            fVar.setFadeTopAlpha(i11);
        }
    }

    public static void S(vi viVar) {
        di.i iVar = new di.i(viVar, viVar.getContext(), viVar.Z, LaunchActivity.R(), viVar.resourcesProvider, 1);
        viVar.E2 = iVar;
        iVar.p(new m.l(viVar));
        ViewGroup viewGroup = viVar.containerView;
        viewGroup.addView(viVar.E2, viewGroup.indexOfChild(viVar.G0), w7.z5.e(-1, -1, 83));
        di.i iVar2 = viVar.E2;
        iVar2.getAdapter().f10617c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        boolean z10 = true;
        if (m2Var instanceof org.telegram.ui.fo) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            hg.j1 adapter = iVar2.getAdapter();
            foVar.i();
            TLRPC.Chat chat = foVar.e;
            adapter.getClass();
            adapter.f10628l0 = chat;
            iVar2.getAdapter().W(foVar.Z7);
            hg.j1 adapter2 = iVar2.getAdapter();
            if (foVar.e == null) {
                z10 = false;
            }
            adapter2.f10620e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f10620e0 = false;
        }
        iVar2.getAdapter().f10622f0 = false;
        viVar.Y1();
    }

    public static void n(vi viVar, ValueAnimator valueAnimator) {
        viVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = viVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static void q(vi viVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        viVar.currentSheetAnimation = null;
        viVar.f29714s2 = null;
        animationNotificationsLocker.unlock();
        viVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
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

    public static boolean r(org.telegram.ui.Components.vi r46, android.content.Context r47, org.telegram.ui.ActionBar.c6 r48, org.telegram.ui.ActionBar.m2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.r(org.telegram.ui.Components.vi, android.content.Context, org.telegram.ui.ActionBar.c6, org.telegram.ui.ActionBar.m2, android.view.View):boolean");
    }

    public static void s(vi viVar) {
        o1.k kVar = viVar.f29714s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(viVar.containerView, o1.h.f16144n, 0.0f);
        viVar.f29714s2 = kVar2;
        kVar2.f16161u.a(1.5f);
        viVar.f29714s2.f16161u.b(1500.0f);
        viVar.f29714s2.h();
    }

    public static void t(vi viVar, org.telegram.messenger.video.f fVar) {
        AnimatorSet animatorSet = viVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            fVar.run();
        }
    }

    public static void u(vi viVar, int i10) {
        viVar.navBarColorKey = -1;
        viVar.navBarColor = i10;
        viVar.containerView.invalidate();
    }

    public static void v(vi viVar) {
        viVar.currentSheetAnimation = null;
        viVar.currentSheetAnimationType = 0;
        viVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f19063id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f19063id != 489000 && !MessagesController.isSupportUser(user)) {
            return true;
        }
        return false;
    }

    public static void w(vi viVar) {
        int i10;
        if (viVar.f29684j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29684j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22720s1;
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
        viVar.c2(true);
        org.telegram.ui.ActionBar.u0 u0Var = viVar.f29673f1;
        di.d4 d4Var = viVar.f29676g1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        di.d4 d4Var2 = new di.d4(viVar.getContext(), 1);
        viVar.f29676g1 = d4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        d4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        viVar.f29676g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        viVar.f29676g1.m(1.0f, -((viVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        viVar.f29676g1.setTranslationY(viVar.f29666d1.getTranslationY());
        di.d4 d4Var3 = viVar.f29676g1;
        d4Var3.f6804l0 = new org.telegram.ui.vp(14, viVar, d4Var2);
        viVar.containerView.addView(d4Var3, w7.z5.a(60.0f, 0.0f, 46.0f, 0.0f, 0.0f, -1, 48));
        viVar.f29676g1.u();
    }

    public static void x(vi viVar, boolean z10, hh hhVar) {
        Integer num;
        viVar.B0.v(1.0f);
        viVar.C0.v(1.0f);
        viVar.B0.l(viVar.f29700o2);
        viVar.C0.l(viVar.f29700o2);
        viVar.containerView.invalidate();
        b8 b8Var = viVar.f29656a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        b8Var.setTag(num);
        hhVar.run();
    }

    public static void y(vi viVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int i10;
        yh yhVar = viVar.B1;
        ni[] niVarArr = viVar.f29736z0;
        org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f29672f0;
        if (m2Var2 == null) {
            m2Var = LaunchActivity.R();
        } else {
            m2Var = m2Var2;
        }
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (view instanceof pi) {
                Activity parentActivity = m2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (viVar.O1 || viVar.P1 || !viVar.c1()) {
                        if (!viVar.O1 && !viVar.P1) {
                            jo joVar = new jo(1, viVar.getContext(), c6Var, viVar);
                            viVar.T = joVar;
                            viVar.U1(joVar);
                        }
                        viVar.U1(viVar.f29684j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (viVar.f29725w0 == null && (m2Var2 instanceof org.telegram.ui.fo)) {
                        TLRPC.User i11 = ((org.telegram.ui.fo) m2Var2).i();
                        if (v1(i11)) {
                            cl clVar = new cl(viVar, viVar.getContext(), viVar.M1, i11, c6Var);
                            viVar.f29725w0 = clVar;
                            niVarArr[11] = clVar;
                        }
                    }
                    ni niVar = viVar.f29725w0;
                    if (niVar != null) {
                        viVar.U1(niVar);
                    }
                } else if (i10 == 3) {
                    if (viVar.Q1 || !viVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(viVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        viVar.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (viVar.N1 || !viVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(viVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        viVar.H1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (viVar.T1 || !viVar.c1()) {
                        if (viVar.T1 && viVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(viVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        viVar.G1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((viVar.T1 || !viVar.c1()) && AndroidUtilities.isMapsInstalled(m2Var2)) {
                        if (!viVar.T1) {
                            jo joVar2 = new jo(6, viVar.getContext(), c6Var, viVar);
                            viVar.T = joVar2;
                            viVar.U1(joVar2);
                        } else {
                            if (viVar.f29698o0 == null) {
                                Context context = viVar.getContext();
                                if (viVar.H || viVar.U1) {
                                    z10 = false;
                                }
                                tl tlVar = new tl(viVar, context, c6Var, z10);
                                viVar.f29698o0 = tlVar;
                                niVarArr[5] = tlVar;
                                ol olVar = viVar.f29727w2;
                                if (olVar != null) {
                                    tlVar.setDelegate(olVar);
                                } else {
                                    tlVar.setDelegate(new eh(viVar, 9));
                                }
                            }
                            viVar.U1(viVar.f29698o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (viVar.R1 || !viVar.c1()) {
                        if (!viVar.R1) {
                            jo joVar3 = new jo(9, viVar.getContext(), c6Var, viVar);
                            viVar.T = joVar3;
                            viVar.U1(joVar3);
                        } else {
                            viVar.W1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (viVar.f29712s0 == null) {
                        ig.i0 i0Var = new ig.i0(viVar.getContext(), viVar.resourcesProvider, viVar);
                        viVar.f29712s0 = i0Var;
                        niVarArr[7] = i0Var;
                        i0Var.setupBlurredSearchField(viVar.J2);
                    }
                    viVar.U1(viVar.f29712s0);
                } else if (i10 == 12) {
                    if (viVar.S1 || !viVar.c1()) {
                        if (!viVar.S1) {
                            jo joVar4 = new jo(9, viVar.getContext(), c6Var, viVar);
                            viVar.T = joVar4;
                            viVar.U1(joVar4);
                        } else {
                            if (viVar.f29695n0 == null) {
                                io ioVar = new io(viVar, viVar.getContext(), true, c6Var, null);
                                viVar.f29695n0 = ioVar;
                                niVarArr[1] = ioVar;
                                ioVar.setDelegate(new eh(viVar, 10));
                            }
                            viVar.U1(viVar.f29695n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (viVar.f29718u0 == null) {
                        qk qkVar = new qk(viVar, viVar.getContext(), c6Var, true);
                        viVar.f29718u0 = qkVar;
                        niVarArr[8] = qkVar;
                        qkVar.setDelegate(viVar.f29667d2);
                    }
                    viVar.U1(viVar.f29718u0);
                } else if (i10 == 14) {
                    if (viVar.f29715t0 == null) {
                        qk qkVar2 = new qk(viVar, viVar.getContext(), c6Var, false);
                        viVar.f29715t0 = qkVar2;
                        niVarArr[9] = qkVar2;
                        qkVar2.setDelegate(viVar.f29667d2);
                    }
                    viVar.U1(viVar.f29715t0);
                } else if (i10 == 16) {
                    if (viVar.f29721v0 == null) {
                        ji.r rVar = new ji.r(viVar.M1, viVar.getContext(), c6Var, viVar);
                        viVar.f29721v0 = rVar;
                        niVarArr[10] = rVar;
                    }
                    viVar.U1(viVar.f29721v0);
                } else if (view.getTag() instanceof Integer) {
                    viVar.f29664c2.b0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, viVar.u1(), false, 0L);
                }
            } else if (view instanceof oi) {
                oi oiVar = (oi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = oiVar.f27652c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        uj1.a(viVar.getContext(), new org.telegram.ui.uc(16, viVar, oiVar), null);
                    } else {
                        viVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    viVar.f29664c2.U(oiVar.f27651b);
                    viVar.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                yhVar.v0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > yhVar.getMeasuredWidth()) {
                yhVar.v0(i13 - yhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void z(vi viVar) {
        ni niVar;
        en enVar;
        viVar.f29726w1 = null;
        ni niVar2 = viVar.B0;
        if (niVar2 != viVar.f29684j0 && (niVar = viVar.C0) != (enVar = viVar.f29704q0) && niVar2 != niVar && niVar2 != enVar) {
            viVar.containerView.removeView(niVar2);
        }
        viVar.B0.setVisibility(8);
        viVar.B0.t();
        viVar.C0.I();
        viVar.B0 = viVar.C0;
        viVar.C0 = null;
        int[] iArr = viVar.f29670e2;
        iArr[0] = iArr[1];
        viVar.K1(viVar.f29662c0, false);
        viVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f29736z0;
            if (i10 < niVarArr.length) {
                ni niVar = niVarArr[i10];
                if (niVar != null) {
                    niVar.B();
                }
                i10++;
            } else {
                this.f29683i2 = true;
                return;
            }
        }
    }

    public final void B1() {
        int i10 = 0;
        this.f29683i2 = false;
        while (true) {
            ni[] niVarArr = this.f29736z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.D();
            }
            i10++;
        }
        if (isShowing()) {
            this.f29664c2.w();
        }
        si siVar = this.D1;
        if (siVar != null) {
            siVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (m2Var instanceof org.telegram.ui.fo)) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            MessageSuggestionParams messageSuggestionParams = foVar.f35653g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!zh.n5.U(i10, messageSuggestionParams.amount)) {
                foVar.Xb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f29711s);
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
        if (this.K1 == null && (m2Var instanceof org.telegram.ui.fo)) {
            org.telegram.ui.fo foVar2 = (org.telegram.ui.fo) m2Var;
            if (foVar2.c()) {
                g5.L(getContext(), foVar2.a(), new eh(this, 12), this.resourcesProvider);
                return;
            }
        }
        ni niVar = this.B0;
        if (niVar != this.f29684j0 && niVar != this.f29704q0) {
            if (!niVar.K(0, true, 0, u1(), this.Q0)) {
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
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
            if (this.f29698o0 == null) {
                tl tlVar = new tl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f29698o0 = tlVar;
                this.f29736z0[5] = tlVar;
                ol olVar = this.f29727w2;
                if (olVar != null) {
                    tlVar.setDelegate(olVar);
                } else if (m2Var instanceof org.telegram.ui.fo) {
                    tlVar.setDelegate(new eh(this, 16));
                }
            }
            U1(this.f29698o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            jo joVar = new jo(3, getContext(), this.resourcesProvider, this);
            this.T = joVar;
            U1(joVar);
        }
        int i10 = 1;
        if (this.f29690l0 == null) {
            hj hjVar = new hj(getContext(), this.resourcesProvider, this);
            this.f29690l0 = hjVar;
            this.f29736z0[3] = hjVar;
            hjVar.setupBlurredSearchField(this.J2);
            this.f29690l0.setDelegate(new eh(this, 13));
            if (this.H) {
                this.f29690l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            TLRPC.Chat chat = ((org.telegram.ui.fo) m2Var).e;
            hj hjVar2 = this.f29690l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            hjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.f29690l0);
        }
    }

    public final void F1() {
        if (this.f29708r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            ?? niVar = new ni(context, c6Var, this);
            niVar.f26395r = AndroidUtilities.dp(80.0f);
            niVar.f26397w = 3;
            bi.o0 o0Var = new bi.o0(niVar, context, c6Var, 11);
            niVar.f26394n = o0Var;
            bb bbVar = new bb(niVar, context);
            niVar.v = bbVar;
            o0Var.setAdapter(bbVar);
            o0Var.setClipToPadding(false);
            o0Var.setItemAnimator(null);
            o0Var.setLayoutAnimation(null);
            o0Var.setVerticalScrollBarEnabled(false);
            o0Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A5, niVar.f27359a));
            niVar.addView(o0Var, w7.z5.d(-1.0f, -1));
            o0Var.setOnScrollListener(new ah.d0(niVar, 18));
            ci.k kVar = new ci.k(niVar, niVar.f26395r, 1);
            niVar.f26396s = kVar;
            kVar.O = new di.w1(niVar, 2);
            o0Var.setLayoutManager(kVar);
            this.f29708r0 = niVar;
            niVar.setDelegate(new ib(this, 1));
        }
        U1(this.f29708r0);
    }

    public final void G1() {
        boolean z10;
        if (!this.T1) {
            jo joVar = new jo(5, getContext(), this.resourcesProvider, this);
            this.T = joVar;
            U1(joVar);
        }
        if (this.f29687k0 == null) {
            zj zjVar = new zj(getContext(), this.resourcesProvider, this);
            this.f29687k0 = zjVar;
            this.f29736z0[2] = zjVar;
            zjVar.setupBlurredSearchField(this.J2);
            this.f29687k0.setDelegate(new hi(this));
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            TLRPC.Chat chat = ((org.telegram.ui.fo) m2Var).e;
            zj zjVar2 = this.f29687k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            zjVar2.setMultipleSelectionAllowed(z10);
        }
        U1(this.f29687k0);
    }

    public final void H1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            jo joVar = new jo(4, getContext(), this.resourcesProvider, this);
            this.T = joVar;
            U1(joVar);
        }
        boolean z11 = false;
        if (this.f29701p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            pk pkVar = new pk(i10, getContext(), this.resourcesProvider, this);
            this.f29701p0 = pkVar;
            this.f29736z0[4] = pkVar;
            pkVar.setDelegate(new ii(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f29701p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
            if (m2Var instanceof org.telegram.ui.fo) {
                TLRPC.Chat chat = ((org.telegram.ui.fo) m2Var).e;
                pk pkVar2 = this.f29701p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                pkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f29701p0.setMaxSelectedFiles(this.V1);
                pk pkVar3 = this.f29701p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                pkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        pk pkVar4 = this.f29701p0;
        pkVar4.f28038d0 = this.N;
        if (z10) {
            U1(pkVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        b8 b8Var = this.f29656a1;
        int i10 = 1;
        if (b8Var.f20142n0) {
            b8Var.h(true);
        }
        this.f29687k0 = null;
        this.f29712s0 = null;
        this.f29690l0 = null;
        this.m0 = null;
        this.f29695n0 = null;
        this.f29698o0 = null;
        this.f29701p0 = null;
        this.f29725w0 = null;
        while (true) {
            ni[] niVarArr = this.f29736z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.o();
                this.containerView.removeView(niVarArr[i10]);
                niVarArr[i10] = null;
            }
            i10++;
        }
        X1(false, false);
        super.dismissInternal();
        if (this.f29729x0) {
            this.f29729x0 = false;
            this.f29733y0 = 0.0f;
            org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
            if (m2Var != null && m2Var.getFragmentView() != null) {
                View fragmentView = m2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f43485a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            TLRPC.Chat chat = foVar.e;
            if (foVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.M1).edit();
                edit.putBoolean("silent_" + foVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (d1(o1().getText())) {
            return true;
        }
        a1();
        if (this.h.f16004f) {
            this.L1 = true;
            this.f29664c2.b0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long p12 = p1();
        ni niVar = this.B0;
        if (niVar != null) {
            i12 = niVar.getSelectedItemsCount();
        }
        return g5.a0(this.M1, p12, l1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                vi viVar = vi.this;
                viVar.L1 = true;
                viVar.f29664c2.b0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
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
        this.f29657b.a(z10, z11);
        vu o12 = o1();
        this.f29662c0 = z10;
        vu o13 = o1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ni niVar = this.B0;
        if (niVar != this.f29684j0 && niVar != this.f29704q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f29662c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            vVar.setVisibility(i12);
            ViewPropertyAnimator animate = vVar.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            es esVar = es.h;
            duration.setInterpolator(esVar).setUpdateListener(new fh(this, 0)).withEndAction(new Runnable(this) {
                public final vi f24965b;

                {
                    this.f24965b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            vi viVar = this.f24965b;
                            if (!z14 || !z12) {
                                viVar.R0.setVisibility(8);
                            }
                            viVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24965b.F0.setVisibility(8);
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
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            translationY.alpha(f11).setDuration(320L).setInterpolator(esVar).setUpdateListener(new fh(this, 1)).withEndAction(new Runnable(this) {
                public final vi f24965b;

                {
                    this.f24965b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            vi viVar = this.f24965b;
                            if (!z14 || !z12) {
                                viVar.R0.setVisibility(8);
                            }
                            viVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24965b.F0.setVisibility(8);
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
            vVar.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            vVar.setAlpha(f7);
            f2();
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            jVar.setAlpha(f11);
            if (z14 || !z12) {
                f12 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f12);
            if (z14 || !z12) {
                i11 = 8;
            }
            jVar.setVisibility(i11);
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
        AndroidUtilities.runOnUIThread(new hh(this, 0));
    }

    public final void L1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f29684j0) != null) {
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
        float translationY = this.containerView.getTranslationY() - this.f29733y0;
        this.f29733y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        cl clVar = this.f29725w0;
        if (clVar != null) {
            clVar.setSendTransitionProgress(f7);
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
        this.f29692m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
        if (chatAttachAlertPhotoLayout != null) {
            vi viVar = chatAttachAlertPhotoLayout.f27360b;
            if (viVar.T0 == 0 || viVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f22736g1 = z10;
        }
    }

    public final void Q1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.Q1(boolean):void");
    }

    public final void R1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.R1(long, java.lang.String, boolean, boolean):void");
    }

    public final void S1(org.telegram.ui.ActionBar.m2 m2Var) {
        if ((m2Var instanceof org.telegram.ui.fo) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.fo) m2Var).e)) {
            new zc(this.f29719u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new org.telegram.ui.vp(15, this, m2Var)).j();
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
        ni niVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        b8 b8Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float dp2;
        this.f29661c.a(z10, true);
        xh xhVar = this.G0;
        if (xhVar.getTag() != null) {
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
        xhVar.setTag(num);
        ai aiVar = this.H0;
        if (aiVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        aiVar.k(true);
        this.S0.k(true);
        xh xhVar2 = this.A1;
        xh xhVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                xhVar.setVisibility(0);
            }
            xhVar3.setVisibility(0);
        } else if (this.V0) {
            xhVar2.setVisibility(0);
        }
        ni niVar2 = this.B0;
        if ((niVar2 == this.f29684j0 || niVar2 == this.f29704q0) && this.f29662c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        b8 b8Var2 = this.f29656a1;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        fi fiVar = this.L0;
        float f28 = 1.0f;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z13) {
                vVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f20));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                b8Var = b8Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                b8Var = b8Var2;
            }
            if (z10 && z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vVar, property, f21));
            Property property2 = View.SCALE_X;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(fiVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(fiVar, property3, f26));
            if (b8Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(xhVar, property4, dp2));
            } else if (this.V0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = AndroidUtilities.dp(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fh(this, 5));
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
                f11 = 0.0f;
                jVar.setTranslationY(0.0f);
            } else {
                f11 = 0.0f;
                i10 = 0;
            }
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            xhVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            xhVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            xhVar3.setAlpha(f14);
            if (z10 && z13) {
                i11 = i10;
            } else {
                i11 = 8;
            }
            vVar.setVisibility(i11);
            if (z10 && z13) {
                f15 = 1.0f;
            } else {
                f15 = f11;
            }
            vVar.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            fiVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            fiVar.setScaleY(f17);
            if (b8Var2.getTag() != null) {
                if (z10) {
                    dp = f11;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                xhVar.setTranslationY(dp);
            } else if (this.V0 && ((niVar = this.B0) == null || niVar.L())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = f11;
                }
                xhVar2.setTranslationY(f18);
            }
            if (!z10) {
                xhVar.setVisibility(4);
                xhVar3.setVisibility(4);
            }
            if (z13) {
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        fiVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1());
        }
        fiVar.i(l1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aiVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), fiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            aiVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(ni niVar) {
        long j10 = this.Z0;
        jo joVar = this.T;
        if (niVar == joVar) {
            j10 = joVar.f26087s;
        } else if (niVar == this.f29684j0) {
            j10 = 1;
        } else if (niVar == this.f29690l0) {
            j10 = 3;
        } else if (niVar == this.f29701p0) {
            j10 = 4;
        } else if (niVar == this.f29687k0) {
            j10 = 5;
        } else if (niVar == this.f29698o0) {
            j10 = 6;
        } else if (niVar == this.m0) {
            j10 = 9;
        } else if (niVar == this.f29708r0) {
            j10 = 10;
        } else if (niVar == this.f29712s0) {
            j10 = 11;
        } else if (niVar == this.f29695n0) {
            j10 = 12;
        } else if (niVar == this.f29715t0) {
            j10 = 14;
        } else if (niVar == this.f29718u0) {
            j10 = 13;
        } else if (niVar == this.f29721v0) {
            j10 = 16;
        } else if (niVar == this.f29725w0) {
            j10 = 17;
        }
        V1(niVar, j10, true);
    }

    public final void V1(ni niVar, long j10, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        qm qmVar;
        boolean z12;
        Integer num;
        qm qmVar2;
        int i12;
        int dp;
        int i13;
        int dp2;
        Float f7;
        int i14;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f29726w1 == null && this.P0 == null) {
            ni niVar2 = this.B0;
            if (niVar2 == niVar) {
                niVar2.J();
            } else if (niVar == this.f29695n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new sg.y0(this.f29672f0, 39, false).show();
            } else {
                int i15 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29671f.a(z11, z10);
                this.f29694n.h(Long.valueOf(j10), z10);
                this.G1 = false;
                this.E1 = false;
                this.I1 = 0.0f;
                this.H1.setVisibility(8);
                RadialProgressView radialProgressView = this.F1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                xh xhVar = this.A1;
                xhVar.setAlpha(1.0f);
                xhVar.setTranslationY(this.I1);
                int i16 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.A0;
                    if (i16 >= longSparseArray.size()) {
                        break;
                    }
                    ((fi.q4) longSparseArray.valueAt(i16)).setMeasureOffsetY(0);
                    i16++;
                }
                this.Z0 = j10;
                yh yhVar = this.B1;
                int childCount = yhVar.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = yhVar.getChildAt(i17);
                    if (childAt instanceof pi) {
                        pi piVar = (pi) childAt;
                        i14 = childCount;
                        f7 = valueOf;
                        if (piVar.f28005b == piVar.f28006c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        piVar.f28295a.e(z13, true);
                    } else {
                        f7 = valueOf;
                        i14 = childCount;
                        if (childAt instanceof oi) {
                            ((oi) childAt).a(true);
                        }
                    }
                    i17++;
                    childCount = i14;
                    valueOf = f7;
                }
                Float f10 = valueOf;
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f29670e2[0];
                this.C0 = niVar;
                boolean e = niVar.e();
                kh.f fVar = this.f29734y1;
                if (fVar != null) {
                    if (e) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                zh zhVar = this.f29737z1;
                if (zhVar != null) {
                    if (e) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    zhVar.setVisibility(i13);
                }
                if (this.C0.i() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                b8 b8Var = this.f29656a1;
                b8Var.setVisibility(i10);
                if (b8Var.f20142n0) {
                    b8Var.h(true);
                }
                this.B0.u();
                ni niVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
                if (niVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.G(this.B0);
                this.C0.setVisibility(0);
                if (niVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                ViewParent parent = this.C0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    ni niVar4 = this.C0;
                    if (niVar4 != this.f29698o0) {
                        indexOfChild++;
                    }
                    i11 = 0;
                    viewGroup.addView(niVar4, indexOfChild, w7.z5.d(-1.0f, -1));
                } else {
                    i11 = 0;
                }
                hh hhVar = new hh(this, 4);
                ni niVar5 = this.B0;
                boolean z14 = niVar5 instanceof en;
                ji jiVar = this.f29668e0;
                if (!z14 && !(this.C0 instanceof en)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.C0.setAlpha(0.0f);
                        this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                        ni niVar6 = this.B0;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[i11] = AndroidUtilities.dp(78.0f) + firstOffset;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(niVar6, property, fArr);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, jiVar, 0.0f, 1.0f);
                        Property property2 = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i11] = b8Var.getAlpha();
                        fArr2[1] = 0.0f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b8Var, property2, fArr2);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i11] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[2] = ofFloat3;
                        animatorSet.playTogether(animatorArr);
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(es.f24465f);
                        animatorSet.addListener(new gi(this, firstOffset, hhVar, i11));
                        this.f29726w1 = animatorSet;
                        ni niVar7 = this.B0;
                        jiVar.getClass();
                        jiVar.a(niVar7, f10);
                        animatorSet.start();
                    } else {
                        niVar5.setAlpha(0.0f);
                        hhVar.run();
                        e2(i11);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                    ni niVar8 = this.C0;
                    if (niVar8 instanceof en) {
                        niVar8.setTranslationX(max);
                        ni niVar9 = this.B0;
                        if ((niVar9 instanceof ChatAttachAlertPhotoLayout) && (qmVar2 = ((ChatAttachAlertPhotoLayout) niVar9).P) != null) {
                            qmVar2.setVisibility(4);
                        }
                    } else {
                        this.B0.setTranslationX(-max);
                        ni niVar10 = this.C0;
                        if (niVar10 == chatAttachAlertPhotoLayout && (qmVar = ((ChatAttachAlertPhotoLayout) niVar10).P) != null) {
                            qmVar.setVisibility(0);
                        }
                    }
                    this.C0.setAlpha(1.0f);
                    this.B0.setAlpha(1.0f);
                    if (z10) {
                        ni niVar11 = this.B0;
                        jiVar.getClass();
                        jiVar.a(niVar11, f10);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, niVar, hhVar, 16));
                    } else {
                        if (this.C0.getCurrentItemTop() <= niVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B0.v(1.0f);
                        this.C0.v(1.0f);
                        this.B0.l(this.f29700o2);
                        this.C0.l(this.f29700o2);
                        this.containerView.invalidate();
                        ni niVar12 = this.B0;
                        Float valueOf2 = Float.valueOf(1.0f);
                        jiVar.getClass();
                        jiVar.a(niVar12, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        b8Var.setTag(num);
                        hhVar.run();
                    }
                }
                if (this.f29703p2 && !(niVar instanceof fi.q4)) {
                    i12 = 0;
                    this.f29703p2 = false;
                    b8Var.d();
                    b8Var.invalidate();
                    x1();
                } else {
                    i12 = 0;
                }
                if (i15 != 0 && j10 != 6 && j10 != 17 && !(niVar instanceof fi.q4)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = i12;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                b8Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void W1(boolean z10, Boolean bool) {
        vi viVar;
        if (this.m0 == null) {
            viVar = this;
            io ioVar = new io(viVar, getContext(), false, this.resourcesProvider, bool);
            viVar.m0 = ioVar;
            viVar.f29736z0[1] = ioVar;
            ioVar.setDelegate(new eh(this, 15));
        } else {
            viVar = this;
        }
        V1(viVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
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
        b8 b8Var = this.f29656a1;
        if ((z10 && b8Var.getTag() == null) || (!z10 && b8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            b8Var.setTag(num);
            AnimatorSet animatorSet = this.f29659b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29659b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f29716t1) && this.B0 == this.f29684j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            xh xhVar = this.A1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f29666d1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                xhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
            if (m2Var != null) {
                if (z10) {
                    if (this.f29689k2) {
                        i10 = org.telegram.ui.ActionBar.g6.f19907tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f19672h5;
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
                this.f29659b1 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - b8Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, property, f12);
                ofFloat.addUpdateListener(new fh(this, 4));
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
                this.f29659b1.playTogether(arrayList);
                this.f29659b1.addListener(new org.telegram.ui.vo(3, this, z10));
                this.f29659b1.setInterpolator(es.h);
                this.f29659b1.setDuration(380L);
                this.f29659b1.start();
                return;
            }
            if (z10 && this.V0 && ((niVar = this.B0) == null || niVar.L())) {
                xhVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            b8Var.setAlpha(f7);
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f29679h1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f29716t1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void Y1() {
        float alpha;
        int[] iArr = this.J0;
        ai aiVar = this.H0;
        aiVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            ni niVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
            if ((niVar == chatAttachAlertPhotoLayout || niVar == this.f29704q0) && this.f29662c0) {
                ah.v vVar = this.R0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.E2.getTop());
            } else {
                alpha = -aiVar.getHeight();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.Z1(int):void");
    }

    public final void a1() {
        if (o1().f30318a.length() <= 0) {
            return;
        }
        this.B0.a(o1().getText());
    }

    public final void a2() {
        boolean h;
        float f7;
        float f10;
        float f11;
        ni niVar = this.B0;
        int i10 = 0;
        if (niVar == null) {
            h = false;
        } else {
            h = niVar.h();
        }
        ci.n nVar = this.f29682i1;
        nVar.setEnabled(h);
        ni niVar2 = this.B0;
        float f12 = 0.5f;
        if (niVar2 != null) {
            if (niVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.C0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f29665d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        ni niVar3 = this.C0;
        if (niVar3 != null) {
            if (niVar3.h()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f29665d0, f12, f7);
        }
        this.f29685j1 = f7;
        if (nVar != null) {
            float f13 = f7 * this.f29688k1;
            nVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            nVar.setVisibility(i10);
        }
    }

    public final void b1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.b1():void");
    }

    public final void b2(ni niVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (niVar != null) {
            bh.f fVar = this.F2;
            if (fVar != null && Build.VERSION.SDK_INT >= 31) {
                fVar.f(0.0f, i10);
                b1();
            }
            int currentItemTop = niVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (niVar == this.B0 && currentItemTop <= niVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (niVar == this.B0) {
                    X1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) niVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.sk.D(11.0f, i11, currentItemTop);
                ni niVar2 = this.B0;
                if (niVar2 == niVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((niVar2 instanceof en) || (this.C0 instanceof en)) {
                    Object obj = this.f29726w1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f16154f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f29670e2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f29674f2 = i13;
                        return;
                    }
                    return;
                }
                this.f29674f2 = i13;
                iArr[i12] = D;
                e2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final boolean c1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).N6()) {
            return true;
        }
        return false;
    }

    public final void c2(boolean z10) {
        di.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f29669e1) != null) {
            int i10 = 0;
            if (this.f29716t1 && this.f29681i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f7877f = z12;
            if (!z10) {
                ((g6) uVar.f7878g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f29673f1;
            if (z10 && this.f29716t1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(es.h).withEndAction(new qh(this, z11, 0)).start();
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
            o1.k kVar = this.f29714s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f29717t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final boolean d1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ChatActivityEnterView.F(this.M1, ((org.telegram.ui.fo) m2Var).a(), m2Var, charSequence);
        }
        return false;
    }

    public final void d2(boolean z10) {
        boolean z11;
        float f7;
        ni niVar = this.f29684j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f29704q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f29707r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                ?? niVar2 = new ni(context, c6Var, this);
                niVar2.f24437y = 0.0f;
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
                niVar2.f24432n = c6Var;
                niVar2.f27362f = true;
                niVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y n10 = niVar2.f27360b.f29656a1.n();
                TextView textView = new TextView(context);
                niVar2.f24436x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = niVar2.f27359a;
                lm lmVar = new lm(niVar2, context, n10, c6Var2, 1);
                b8 b8Var = niVar2.f27360b.f29656a1;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                b8Var.addView(lmVar, 0, w7.z5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                lmVar.addView(textView, w7.z5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
                bi.o0 o0Var = new bi.o0(niVar2, context, c6Var2, 14);
                niVar2.f24433r = o0Var;
                o0Var.setAdapter(new org.telegram.ui.a8(niVar2, 3));
                s4.b0 b0Var = new s4.b0(1, false);
                niVar2.f24434s = b0Var;
                o0Var.setLayoutManager(b0Var);
                o0Var.setClipChildren(false);
                o0Var.setClipToPadding(false);
                o0Var.setOverScrollMode(2);
                o0Var.setVerticalScrollBarEnabled(false);
                dn dnVar = new dn(niVar2, context);
                niVar2.v = dnVar;
                dnVar.setClipToPadding(true);
                dnVar.setClipChildren(true);
                niVar2.addView(o0Var, w7.z5.d(-1.0f, -1));
                niVar2.P = niVar2.f27360b.f29684j0;
                dnVar.f24144c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar2.P;
                dnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                dnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                dnVar.c();
                UndoView undoView = new UndoView(context, null, false, niVar2.f27360b.f29707r);
                niVar2.f24435w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                niVar2.addView(undoView, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 52.0f, -1, 83));
                niVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f29704q0 = niVar2;
                niVar2.bringToFront();
            }
            ni niVar3 = this.B0;
            en enVar = this.f29704q0;
            if (niVar3 != enVar) {
                niVar = enVar;
            }
            U1(niVar);
            return;
        }
        U1(niVar);
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
        si siVar = this.D1;
        if (siVar != null) {
            siVar.l();
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
        ti tiVar = this.f29664c2;
        if (tiVar != null) {
            tiVar.v(new hh(this, 3));
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
        yh yhVar = this.B1;
        if (yhVar == null) {
            return;
        }
        int childCount = yhVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            yhVar.getChildAt(i20);
        }
        boolean z11 = this.f29689k2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.g6.f19680hg;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f19707j5;
        }
        this.f29692m1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.g6.f19680hg;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        }
        this.f29709r1.setTextColor(getThemedColor(i11));
        this.f29682i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.g6.f19680hg;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.f19707j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.u0 u0Var = this.f29666d1;
        u0Var.setIconColor(themedColor);
        Drawable background = u0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.g6.f19698ig;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.I5;
        }
        org.telegram.ui.ActionBar.g6.x1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.g6.E8;
        u0Var.G(getThemedColor(i21), false);
        u0Var.G(getThemedColor(i21), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29673f1;
        if (u0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.g6.f19680hg;
            } else {
                i19 = org.telegram.ui.ActionBar.g6.f19707j5;
            }
            u0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f29679h1;
        if (u0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.g6.f19680hg;
            } else {
                i17 = org.telegram.ui.ActionBar.g6.f19707j5;
            }
            u0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = u0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.g6.f19698ig;
            } else {
                i18 = org.telegram.ui.ActionBar.g6.I5;
            }
            org.telegram.ui.ActionBar.g6.x1(getThemedColor(i18), background2);
        }
        ai aiVar = this.H0;
        org.telegram.ui.ActionBar.c6 c6Var = aiVar.M;
        qu quVar = aiVar.f30318a;
        int i22 = aiVar.L;
        if (i22 == 0) {
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            int i23 = org.telegram.ui.ActionBar.g6.G6;
            quVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i23, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i23, c6Var));
        } else if (i22 != 2 && i22 != 3) {
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19896t5, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
        } else {
            quVar.setHintTextColor(-1929379841);
            quVar.setTextColor(-1);
            quVar.setCursorColor(-1);
            quVar.setHandlesColor(-1);
            quVar.setHighlightColor(822083583);
            quVar.quoteColor = -1;
        }
        aiVar.f30320c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        ru ruVar = aiVar.d;
        if (ruVar != null) {
            ruVar.S();
        }
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.g6.f19680hg;
        } else {
            i14 = org.telegram.ui.ActionBar.g6.f19707j5;
        }
        int themedColor2 = getThemedColor(i14);
        b8 b8Var = this.f29656a1;
        b8Var.D(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.g6.f19698ig;
        } else {
            i15 = org.telegram.ui.ActionBar.g6.I5;
        }
        b8Var.C(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.g6.f19680hg;
        } else {
            i16 = org.telegram.ui.ActionBar.g6.f19707j5;
        }
        b8Var.setTitleColor(getThemedColor(i16));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.g6.x1(s12, this.shadowDrawable);
        gh.c cVar = this.I2;
        if (cVar.f10152a.getColor() != s12) {
            cVar.a(s12);
            kh.f fVar = this.f29734y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            zh zhVar = this.f29737z1;
            if (zhVar != null) {
                zhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            ni[] niVarArr = this.f29736z0;
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
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19689i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
    }

    public final void e2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.e2(int):void");
    }

    public final void f1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.f1(boolean):void");
    }

    public final void f2() {
        int i10 = 0;
        e2(0);
        this.f29719u1.invalidate();
        ah.v vVar = this.R0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
        if (chatAttachAlertPhotoLayout != null) {
            gm gmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (gmVar != null && gmVar.getFastScroll() != null) {
                tl0 fastScroll = gmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f22753p1;
                if (this.f29662c0) {
                    i10 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.f29134h0 = currentActionBarHeight + i10;
                gmVar.getFastScroll().invalidate();
            }
        }
        Y1();
        i1();
    }

    public final void g1() {
        float f7 = this.f29661c.e;
        float f10 = (1.0f - this.f29657b.e) * f7;
        this.f29737z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f29736z0;
            if (i10 < niVarArr.length) {
                ni niVar = niVarArr[i10];
                if (niVar != null && (themeDescriptions = niVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19689i5));
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
        float f10 = this.e.e;
        float f11 = this.f29671f.e;
        float b10 = zf.f0.b(this.h.e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        l20.d(this.I0, com.google.android.gms.internal.play_billing.k3.C(f10, f11, b10, f7));
    }

    public final void i1() {
        fi fiVar = this.L0;
        xh xhVar = this.K0;
        ah.v vVar = this.R0;
        if (vVar != null && vVar.getVisibility() == 0 && vVar.getAlpha() != 0.0f) {
            float f7 = this.f29657b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            fiVar.setAlpha(abs * abs * abs * abs);
            xhVar.setTranslationY(AndroidUtilities.lerp(this.f29686j2, ((vVar.getTranslationY() + vVar.getTop()) - xhVar.getTop()) + AndroidUtilities.dp(8.0f), es.f24468j.getInterpolation(f7)));
            return;
        }
        xhVar.setTranslationY(this.f29686j2);
        fiVar.setAlpha(1.0f);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f29696n1;
        if (u0Var != null) {
            this.f29692m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void k1(ci.u uVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f29692m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f29681i0 = false;
        this.J = uVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f29696n1;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if ((m2Var instanceof org.telegram.ui.fo) && (messagePreviewParams = ((org.telegram.ui.fo) m2Var).f35642f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float n1() {
        xh xhVar = this.G0;
        float alpha = 1.0f - xhVar.getAlpha();
        return xhVar.getMeasuredHeight() - (alpha * (xhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final vu o1() {
        ni niVar;
        if (this.f29662c0 && ((niVar = this.B0) == this.f29684j0 || niVar == this.f29704q0)) {
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
        b8 b8Var = this.f29656a1;
        if (b8Var.f20142n0) {
            b8Var.h(true);
        } else if (this.B0.j()) {
        } else {
            if (o1() != null && o1().e) {
                o1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.B0.n(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final cl clVar = this.f29725w0;
        if (clVar != null && this.B0 == clVar) {
            final hh hhVar = new hh(this, 1);
            int i10 = clVar.f23782n;
            org.telegram.ui.Wallet.i8 i8Var = clVar.O;
            vi viVar = clVar.f27360b;
            AnimatorSet animatorSet = null;
            if (!clVar.H && (wallettransaction = clVar.M0) != null && clVar.N0 == null && clVar.O0 == null) {
                if (clVar.P0) {
                    org.telegram.ui.Wallet.a5 a5Var = new org.telegram.ui.Wallet.a5();
                    a5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
                    if (m2Var != null && m2Var.presentFragment(a5Var, false, true)) {
                        org.telegram.ui.Wallet.w8 w8Var = new org.telegram.ui.Wallet.w8(viVar.getContainer(), viVar.getSheetContainer(), i8Var.getDiamondView(), a5Var, clVar.M0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!clVar.H) {
                                            hhVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!clVar.H) {
                                            hhVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, viVar);
                        clVar.O0 = w8Var;
                        animatorSet = w8Var.f33568m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.c6 diamondView = i8Var.getDiamondView();
                    if (diamondView.f32749f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f29672f0;
                        if (m2Var2 instanceof org.telegram.ui.fo) {
                            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var2;
                            if (foVar.getCurrentAccount() == i10 && foVar.a() == clVar.f23787r.f19063id && foVar.R3 == 0 && foVar.getFragmentView() != null && foVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.v5 v5Var = new org.telegram.ui.Wallet.v5(viVar.getContainer(), viVar.getSheetContainer(), i8Var.getDiamondView(), foVar, clVar.M0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!clVar.H) {
                                                    hhVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!clVar.H) {
                                                    hhVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, viVar);
                                clVar.N0 = v5Var;
                                animatorSet = v5Var.f33515m;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
        fa1 fa1Var = chatAttachAlertPhotoLayout.f22745l0;
        ah.x xVar = chatAttachAlertPhotoLayout.f22741j0;
        TextView textView = chatAttachAlertPhotoLayout.f22752p0;
        gm gmVar = chatAttachAlertPhotoLayout.f22755r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == xVar) {
            if (z10) {
                if (gmVar.getVisibility() == 0) {
                    xVar.layout(0, org.telegram.messenger.g0.B(222.0f, i13, i16), i14, org.telegram.messenger.g0.B(96.0f, i13, i16));
                    return true;
                }
                xVar.layout(0, org.telegram.messenger.g0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (gmVar.getVisibility() == 0) {
                xVar.layout(org.telegram.messenger.g0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                xVar.layout(org.telegram.messenger.g0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == fa1Var) {
            if (z10) {
                if (gmVar.getVisibility() == 0) {
                    fa1Var.layout(0, org.telegram.messenger.g0.B(310.0f, i13, i16), i14, org.telegram.messenger.g0.B(260.0f, i13, i16));
                    return true;
                }
                fa1Var.layout(0, org.telegram.messenger.g0.B(176.0f, i13, i16), i14, org.telegram.messenger.g0.B(126.0f, i13, i16));
                return true;
            } else if (gmVar.getVisibility() == 0) {
                fa1Var.layout(org.telegram.messenger.g0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                fa1Var.layout(org.telegram.messenger.g0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (gmVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (gmVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != gmVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.g0.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
        um umVar = chatAttachAlertPhotoLayout.v;
        gm gmVar = chatAttachAlertPhotoLayout.f22755r;
        hg.a0 a0Var = chatAttachAlertPhotoLayout.f22757s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        qm qmVar = chatAttachAlertPhotoLayout.P;
        if (view == qmVar) {
            if (chatAttachAlertPhotoLayout.f22725b0 && !chatAttachAlertPhotoLayout.f22729d0) {
                qmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ah.x xVar = chatAttachAlertPhotoLayout.f22741j0;
            if (view == xVar) {
                if (z10) {
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                xVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            fa1 fa1Var = chatAttachAlertPhotoLayout.f22745l0;
            if (view == fa1Var) {
                if (z10) {
                    fa1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                fa1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == gmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    gmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f44826o != 0) {
                        gmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        umVar.l();
                    }
                } else {
                    gmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f44826o != 1) {
                        gmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        umVar.l();
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
        this.f29684j0.setTranslationX(0.0f);
        this.f29705q1.setAlpha(0.0f);
        this.f29699o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29717t2 = animatorSet;
        ji jiVar = this.f29710r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, jiVar, 0.0f, 400.0f));
        this.f29717t2.setDuration(400L);
        this.f29717t2.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        jiVar.getClass();
        jiVar.a(this, valueOf);
        this.f29717t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new fh(this, 2));
        o1.k kVar = this.f29714s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f16144n, 0.0f);
        this.f29714s2 = kVar2;
        if (this.K1 != null) {
            kVar2.f16161u.a(0.75f);
            this.f29714s2.f16161u.b(350.0f);
        } else {
            kVar2.f16161u.a(0.75f);
            this.f29714s2.f16161u.b(350.0f);
        }
        this.f29714s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.d3 d3Var = this.backDrawable;
        t6 t6Var = v6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(d3Var, t6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.f fVar = new org.telegram.messenger.video.f(this, animationNotificationsLocker, this.delegate, 17);
        this.f29714s2.a(new fi.m4(2, this, fVar));
        this.currentSheetAnimation.addListener(new bi.t(22, this, fVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new fh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(es.f24465f);
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
        if (this.f29672f0 instanceof org.telegram.ui.fo) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f29722v1 = true;
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

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        ni niVar;
        int i11;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            g1();
            io ioVar = this.m0;
            if (ioVar != null && ((niVar = this.C0) == ioVar || this.B0 == ioVar)) {
                if (niVar == ioVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                e2(i11);
            }
            io ioVar2 = this.f29695n0;
            if (ioVar2 != null) {
                ni niVar2 = this.C0;
                if (niVar2 == ioVar2 || this.B0 == ioVar2) {
                    if (niVar2 != ioVar2) {
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
            fi fiVar = this.L0;
            if (fiVar != null) {
                fiVar.setEphemeralFactor(f7);
                fiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final long p1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).a();
        }
        return this.Z;
    }

    public final int q1() {
        ni niVar = this.B0;
        io ioVar = this.m0;
        if (niVar == ioVar && ioVar.E != null) {
            return ioVar.getEmojiPadding();
        }
        io ioVar2 = this.f29695n0;
        if (niVar == ioVar2 && ioVar2.E != null) {
            return ioVar2.getEmojiPadding();
        }
        if (this.f29662c0) {
            return this.S0.getEmojiPadding();
        }
        return this.H0.getEmojiPadding();
    }

    public final int r1(int i10) {
        ni niVar = this.C0;
        int[] iArr = this.f29670e2;
        if (niVar != null && ((this.B0 instanceof en) || (niVar instanceof en))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f29665d0);
        }
        return iArr[i10];
    }

    public final int s1(boolean z10) {
        boolean q6;
        int i10;
        b8 b8Var;
        if (this.f29689k2) {
            return getThemedColor(org.telegram.ui.ActionBar.g6.f19907tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        Iterator it = this.f29694n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            long longValue = ((Long) gVar.f16013a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.r.a(f7, 0.0f, 1.0f);
        if (z10 && (b8Var = this.f29656a1) != null && b8Var.getVisibility() == 0) {
            a2 *= 1.0f - b8Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.g6.f19543a7;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f19689i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        ni niVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29684j0;
        if (niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f22740i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            this.calcMandatoryInsets = ((org.telegram.ui.fo) m2Var).C9();
        }
        a2();
        this.f29722v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f29703p2) {
            this.f29703p2 = false;
            b8 b8Var = this.f29656a1;
            b8Var.d();
            b8Var.invalidate();
            x1();
        }
    }

    public final void t1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.t1():void");
    }

    public final boolean u1() {
        if (this.f29662c0) {
            ni niVar = this.B0;
            if (niVar == this.f29684j0 || niVar == this.f29704q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        ti tiVar = this.f29664c2;
        if (tiVar != null && !this.f29730x1) {
            boolean w9 = tiVar.w();
            this.f29730x1 = true;
            di.x0 x0Var = new di.x0(this, editTextBoldCursor, z10, 17);
            if (w9) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(x0Var, j10);
        }
    }

    public final void x1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int s12 = s1(false);
            org.telegram.ui.ActionBar.g6.x1(s12, this.shadowDrawable);
            gh.c cVar = this.I2;
            if (cVar.f10152a.getColor() != s12) {
                cVar.a(s12);
                kh.f fVar = this.f29734y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                zh zhVar = this.f29737z1;
                if (zhVar != null) {
                    zhVar.invalidate();
                }
            }
            a2();
            this.containerView.invalidate();
        }
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f29736z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.o();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        ai aiVar = this.H0;
        if (aiVar != null) {
            aiVar.o();
        }
        di diVar = this.S0;
        if (diVar != null) {
            diVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f19063id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        a2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismiss() {
        di diVar;
        ai aiVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        ni niVar = this.B0;
        cl clVar = this.f29725w0;
        boolean z10 = (niVar != clVar || clVar == null || clVar.H || clVar.M0 == null) ? false : true;
        this.f29729x0 = z10;
        if (!z10 && (aiVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        if (!this.f29729x0 && (diVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.f29672f0;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        if (!this.D2 && m2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.C2) {
                return;
            }
            this.C2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new eh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19248a.setOnCancelListener(new kh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.N = b1Var;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.f29736z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar2 = niVarArr[i10];
            if (niVar2 != null && this.B0 != niVar2) {
                niVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7), 0), true, (AndroidUtilities.IntColorCallback) new eh(this, 11));
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
        this.f29691l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override
    public final void A(float f7, int i10) {
    }

    public vi(Activity activity, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11) {
        this(activity, m2Var, z10, z11, true, null);
    }
}
