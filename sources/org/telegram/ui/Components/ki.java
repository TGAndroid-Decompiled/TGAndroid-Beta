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
import org.telegram.ui.fi1;
public class ki extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, td.b {
    public static final int K2 = 0;
    public final i0 A;
    public final qh A0;
    public final j6 A1;
    public final ng.d A2;
    public boolean B;
    public final ImageView B0;
    public float B1;
    public final ng.c B2;
    public boolean C;
    public final int[] C0;
    public int C1;
    public final ig.a C2;
    public boolean D;
    public final mh D0;
    public MessageObject D1;
    public final ig.a D2;
    public int E;
    public final vh E0;
    public boolean E1;
    public final ah E2;
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
    public final fh.v K0;
    public boolean K1;
    public boolean L;
    public final th L0;
    public boolean L1;
    public c40 M;
    public int M0;
    public boolean M1;
    public boolean N;
    public ct N0;
    public boolean N1;
    public final yc0 O;
    public boolean O0;
    public int O1;
    public ln P;
    public boolean P0;
    public boolean P1;
    public e40 Q;
    public boolean Q0;
    public boolean Q1;
    public boolean R;
    public final float R0;
    public float R1;
    public boolean S;
    public long S0;
    public float S1;
    public wj T;
    public final r7 T0;
    public ValueAnimator T1;
    public si U;
    public AnimatorSet U0;
    public int U1;
    public long V;
    public AnimatorSet V0;
    public ii V1;
    public boolean W;
    public final org.telegram.ui.ActionBar.w0 W0;
    public vm W1;
    public final ig.b X;
    public final kh.v X0;
    public final int[] X1;
    public boolean Y;
    public final org.telegram.ui.ActionBar.w0 Y0;
    public int Y1;
    public float Z;
    public kh.x3 Z0;
    public float Z1;
    public final yh f30096a0;
    public final org.telegram.ui.ActionBar.w0 f30097a1;
    public float a2;
    public final td.a f30098b;
    public final org.telegram.ui.ActionBar.o2 f30099b0;
    public final bh.e f30100b1;
    public boolean f30101b2;
    public final td.a f30102c;
    public final boolean f30103c0;
    public float f30104c1;
    public float f30105c2;
    public final td.a d;
    public cf f30106d0;
    public float f30107d1;
    public final boolean f30108d2;
    public final td.a f30109e;
    public boolean f30110e0;
    public final mh f30111e1;
    public boolean f30112e2;
    public final td.a f30113f;
    public final ChatAttachAlertPhotoLayout f30114f0;
    public final TextView f30115f1;
    public final ArrayList f30116f2;
    public pj f30117g0;
    public final org.telegram.ui.ActionBar.w0 f30118g1;
    public final Rect f30119g2;
    public final td.a h;
    public vi f30120h0;
    public final LinearLayout f30121h1;
    public float f30122h2;
    public jn f30123i0;
    public final ImageView f30124i1;
    public boolean f30125i2;
    public jn f30126j0;
    public final LinearLayout f30127j1;
    public int f30128j2;
    public xk f30129k0;
    public final TextView f30130k1;
    public final yh f30131k2;
    public fk f30132l0;
    public float l1;
    public o1.j f30133l2;
    public hm m0;
    public boolean f30134m1;
    public AnimatorSet f30135m2;
    public final td.j f30136n;
    public yi f30137n0;
    public final ai f30138n1;
    public boolean f30139n2;
    public pf.e0 f30140o0;
    public boolean f30141o1;
    public boolean f30142o2;
    public gk f30143p0;
    public Object f30144p1;
    public sk f30145p2;
    public gk f30146q0;
    public boolean f30147q1;
    public boolean f30148q2;
    public org.telegram.ui.on f30149r;
    public qh.p f30150r0;
    public final rg.f f30151r1;
    public boolean f30152r2;
    public final j6 f30153s;
    public final ci[] f30154s0;
    public final oh f30155s1;
    public File f30156s2;
    public final LongSparseArray f30157t0;
    public final mh f30158t1;
    public double[] f30159t2;
    public ci f30160u0;
    public final nh f30161u1;
    public boolean f30162u2;
    public final j6 v;
    public ci f30163v0;
    public final f2.m0 f30164v1;
    public boolean f30165v2;
    public final ImageView f30166w;
    public final kg.d f30167w0;
    public final hi f30168w1;
    public boolean f30169w2;
    public final i0 f30170x;
    public final kg.d f30171x0;
    public boolean f30172x1;
    public kh.i f30173x2;
    public final ImageView f30174y;
    public final ph f30175y0;
    public final RadialProgressView f30176y1;
    public final ig.e f30177y2;
    public final mh f30178z0;
    public boolean f30179z1;
    public final ng.d f30180z2;

    public ki(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        TextPaint textPaint;
        float f10;
        bh.e eVar;
        gr grVar = gr.h;
        this.f30098b = new td.a(0, this, grVar, 380L, false);
        this.f30102c = new td.a(1, this, grVar, 380L, false);
        this.d = new td.a(2, this, grVar, 380L, false);
        this.f30109e = new td.a(3, this, grVar, 380L, false);
        this.f30113f = new td.a(4, this, grVar, 380L, true);
        this.h = new td.a(5, this, grVar, 320L, false);
        td.j jVar = new td.j(new tg(this, 1), grVar, 380L);
        this.f30136n = jVar;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.Z = 0.0f;
        this.f30096a0 = new yh(this, 0);
        this.f30110e0 = false;
        ci[] ciVarArr = new ci[11];
        this.f30154s0 = ciVarArr;
        this.f30157t0 = new LongSparseArray();
        this.C0 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.F0 = textPaint2;
        this.G0 = new RectF();
        this.H0 = new Paint(1);
        this.Q0 = true;
        this.R0 = 1.0f;
        this.f30172x1 = false;
        this.f30179z1 = false;
        int i9 = UserConfig.selectedAccount;
        this.F1 = i9;
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
        this.f30112e2 = false;
        ArrayList arrayList = new ArrayList();
        this.f30116f2 = arrayList;
        Rect rect = new Rect();
        this.f30119g2 = rect;
        this.f30131k2 = new yh(this, 1);
        this.f30139n2 = true;
        this.f30142o2 = false;
        this.f30165v2 = false;
        this.f30169w2 = false;
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
        ng.c cVar = new ng.c();
        this.B2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f30177y2 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.A2 = dVar;
            dVar.i(new n5.e0(this, 8));
            ng.d dVar2 = new ng.d(null);
            this.f30180z2 = dVar2;
            dVar2.i(new n2.p(this, 8));
            ig.a aVar = new ig.a(dVar);
            this.C2 = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            ig.a aVar2 = new ig.a(dVar2);
            this.D2 = aVar2;
            aVar2.f11132f = LiteMode.isEnabled(262144);
        } else {
            this.f30177y2 = null;
            this.f30180z2 = null;
            this.A2 = null;
            this.C2 = new ig.a(cVar);
            this.D2 = new ig.a(cVar);
        }
        ig.a aVar3 = new ig.a(cVar);
        this.E2 = new ah(this, 0);
        this.f30108d2 = z10;
        this.f30103c0 = (o2Var instanceof org.telegram.ui.qn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30099b0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ai aiVar = new ai(this, context);
        this.f30138n1 = aiVar;
        aiVar.setDelegate(new bi(this));
        this.containerView = aiVar;
        aiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        r7 r7Var = new r7(this, context, b6Var, 1);
        this.T0 = r7Var;
        r7Var.O0 = true;
        r7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        r7Var.C(getThemedColor(i11), false);
        int i12 = org.telegram.ui.ActionBar.f6.I5;
        r7Var.A(getThemedColor(i12), false);
        r7Var.setTitleColor(getThemedColor(i11));
        r7Var.setOccupyStatusBar(true);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 3));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i11), false, b6Var);
        this.W0 = w0Var2;
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
        w0Var2.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i12), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i11), false, b6Var);
        this.Y0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        kh.v vVar = new kh.v();
        this.X0 = vVar;
        w0Var3.setIcon(vVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i12), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        bh.e eVar2 = new bh.e(this, context);
        eVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        eVar2.setText(LocaleController.getString(R.string.Create));
        eVar2.setTypeface(AndroidUtilities.bold());
        eVar2.setTextSize(1, 14.0f);
        eVar2.setVisibility(4);
        eVar2.setAlpha(0.0f);
        eVar2.setGravity(17);
        eVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        eVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        eVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        g7.g6.a(eVar2);
        this.f30100b1 = eVar2;
        W1();
        if (o2Var != null) {
            textPaint = textPaint2;
            w0Var = w0Var3;
            eVar = eVar2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i11), false, b6Var);
            this.f30097a1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i12), 6, -1));
            w0Var4.setOnClickListener(new ih.b2(5, this, z11));
        } else {
            w0Var = w0Var3;
            textPaint = textPaint2;
            f10 = 14.0f;
            eVar = eVar2;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i11), false, b6Var);
        this.f30118g1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i12), 3, -1));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ki f34966b;

            {
                this.f34966b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.qn qnVar;
                switch (r3) {
                    case 0:
                        final ki kiVar = this.f34966b;
                        qh qhVar = kiVar.A0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(kiVar.getContext(), b6Var);
                            e0Var.l0(qhVar.getText());
                            e0Var.f27857f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = kiVar.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar = kiVar.L0;
                                            thVar.setText(charSequence);
                                            thVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = kiVar.V;
                            if (kiVar.D1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar = new ch(kiVar, 0);
                            e0Var.f27859h0 = j10;
                            e0Var.f27860i0 = z13;
                            e0Var.f27861j0 = chVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ki kiVar2 = this.f34966b;
                        th thVar = kiVar2.L0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(kiVar2.getContext(), b6Var);
                            e0Var2.l0(thVar.getText());
                            e0Var2.f27857f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = kiVar2.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = kiVar2.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = kiVar2.V;
                            if (kiVar2.D1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ch chVar2 = new ch(kiVar2, 1);
                            e0Var2.f27859h0 = j11;
                            e0Var2.f27860i0 = z14;
                            e0Var2.f27861j0 = chVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ki kiVar3 = this.f34966b;
                        kiVar3.f30118g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar3.f30099b0;
                        t12.K2(null, o2Var2, b6Var);
                        PhotoViewer.t1().L2(kiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i13 = kiVar3.O1;
                        boolean z15 = kiVar3.P1;
                        t13.h = i13;
                        t13.f35697n = z15;
                        if (!kiVar3.V1.j()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(kiVar3.getContainer().findFocus());
                        }
                        File w8 = kh.a8.w(kiVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i14 = point.x;
                        int i15 = point.y;
                        if (i14 > 1080 || i15 > 1080) {
                            float min = Math.min(i14, i15) / 1080.0f;
                            i14 = (int) (i14 * min);
                            i15 = (int) (i15 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        lh lhVar = new lh(kiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.qn) {
                            qnVar = (org.telegram.ui.qn) o2Var2;
                        } else {
                            qnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, qnVar);
                        if (kiVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, kiVar3.F);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        mh mhVar = new mh(this, context, 0);
        this.f30111e1 = mhVar;
        mhVar.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        mhVar.setAlpha(0.0f);
        mhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30121h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f30115f1 = textView;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, g7.e6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f30124i1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, g7.e6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        mhVar.addView(linearLayout, g7.e6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30127j1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, g7.e6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f30130k1 = textView2;
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, g7.e6.q(-2, -2, 16));
        mhVar.addView(linearLayout2, g7.e6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, b6Var);
        this.f30114f0 = chatAttachAlertPhotoLayout;
        ciVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f30160u0 = chatAttachAlertPhotoLayout;
        this.S0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, g7.e6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30151r1 = view;
        view.setup(aVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, g7.e6.g());
        this.containerView.addView(mhVar, g7.e6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        fh.v vVar2 = new fh.v(context);
        this.K0 = vVar2;
        this.containerView.addView(vVar2, g7.e6.e(-1, -2, 55));
        this.containerView.addView(r7Var, g7.e6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, g7.e6.e(48, 48, 53));
        this.containerView.addView(w0Var, g7.e6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f30097a1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, g7.e6.e(48, 48, 53));
        }
        mhVar.addView(w0Var5, g7.e6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(eVar, g7.e6.e(-2, 48, 53));
        mh mhVar2 = new mh(this, context, 1);
        this.f30158t1 = mhVar2;
        nh nhVar = new nh(context, 0);
        this.f30161u1 = nhVar;
        nhVar.setClipChildren(true);
        nhVar.setClipToPadding(false);
        hi hiVar = new hi(this, context);
        this.f30168w1 = hiVar;
        nhVar.setAdapter(hiVar);
        f2.m0 m0Var = new f2.m0(0, false);
        this.f30164v1 = m0Var;
        nhVar.setLayoutManager(m0Var);
        nhVar.setVerticalScrollBarEnabled(false);
        nhVar.setHorizontalScrollBarEnabled(false);
        nhVar.setItemAnimator(null);
        nhVar.setLayoutAnimation(null);
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        nhVar.f34280v2 = true;
        nhVar.setOverScrollMode(2);
        ig.a aVar4 = this.C2;
        pg.i iVar = new pg.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.f11131e = viewGroup2;
        ig.a aVar5 = this.D2;
        pg.i iVar2 = new pg.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.f11131e = viewGroup3;
        pg.i iVar3 = new pg.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.f11131e = viewGroup4;
        oh ohVar = new oh(this, context, 0);
        this.f30155s1 = ohVar;
        ig.b bVar = new ig.b(aVar3.c(ohVar, null, false));
        this.X = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ohVar, g7.e6.g());
        kg.d c10 = this.C2.c(mhVar2, mg.c.f(b6Var), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        mhVar2.setBackground(c10);
        nhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        nhVar.setClipToOutline(true);
        bg.q1 q1Var = ff.r0.f6254a;
        nhVar.setOutlineProvider(new ff.q0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        nhVar.setImportantForAccessibility(1);
        mhVar2.addView(nhVar, g7.e6.g());
        this.containerView.addView(mhVar2, g7.e6.e(-1, 70, 81));
        nhVar.setOnItemClickListener(new bg.b1(11, this, b6Var));
        nhVar.setOnItemLongClickListener(new tg(this, 3));
        j6 j6Var = new j6(context, true, false, true);
        this.A1 = j6Var;
        j6Var.setVisibility(8);
        j6Var.setAlpha(0.0f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        j6Var.setPadding(dp, 0, dp, 0);
        j6Var.setTextSize(AndroidUtilities.dp(f10));
        j6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view2) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        this.containerView.addView(j6Var, g7.e6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f30176y1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, g7.e6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.f23386z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view2) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        mh mhVar3 = new mh(this, context, 2);
        this.f30178z0 = mhVar3;
        ph phVar = new ph(this, context);
        this.f30175y0 = phVar;
        mhVar3.addView(phVar, g7.e6.e(-1, -1, 119));
        kg.d c11 = this.D2.c(aiVar, mg.c.m(b6Var), false);
        this.f30167w0 = c11;
        c11.f14823k = true;
        c11.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.t(AndroidUtilities.dp(32.0f));
        c11.h.f14807g = 0.4f;
        c11.j();
        kg.d c12 = this.C2.c(phVar, mg.c.m(b6Var), false);
        this.f30171x0 = c12;
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        phVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        mhVar3.setWillNotDraw(false);
        mhVar3.setVisibility(4);
        mhVar3.setAlpha(0.0f);
        this.containerView.addView(mhVar3, g7.e6.e(-1, -2, 83));
        mhVar3.setOnTouchListener(new jh.d(13));
        j6 j6Var2 = new j6(context, false, false, false);
        this.f30153s = j6Var2;
        j6Var2.setAllowCancel(true);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setVisibility(8);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i13 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var2.setTextColor(getThemedColor(i13));
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        phVar.addView(j6Var2, g7.e6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30166w = imageView4;
        i0 i0Var = new i0(context);
        this.f30170x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i14 = org.telegram.ui.ActionBar.f6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        int i15 = org.telegram.ui.ActionBar.f6.f23092i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(16.0f)));
        phVar.addView(imageView4, g7.e6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34966b;

            {
                this.f34966b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.qn qnVar;
                switch (r3) {
                    case 0:
                        final ki kiVar = this.f34966b;
                        qh qhVar = kiVar.A0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(kiVar.getContext(), b6Var);
                            e0Var.l0(qhVar.getText());
                            e0Var.f27857f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = kiVar.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = kiVar.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = kiVar.V;
                            if (kiVar.D1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar = new ch(kiVar, 0);
                            e0Var.f27859h0 = j10;
                            e0Var.f27860i0 = z13;
                            e0Var.f27861j0 = chVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ki kiVar2 = this.f34966b;
                        th thVar = kiVar2.L0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(kiVar2.getContext(), b6Var);
                            e0Var2.l0(thVar.getText());
                            e0Var2.f27857f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar2 = kiVar2.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = kiVar2.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = kiVar2.V;
                            if (kiVar2.D1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ch chVar2 = new ch(kiVar2, 1);
                            e0Var2.f27859h0 = j11;
                            e0Var2.f27860i0 = z14;
                            e0Var2.f27861j0 = chVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ki kiVar3 = this.f34966b;
                        kiVar3.f30118g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar3.f30099b0;
                        t12.K2(null, o2Var2, b6Var);
                        PhotoViewer.t1().L2(kiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i132 = kiVar3.O1;
                        boolean z15 = kiVar3.P1;
                        t13.h = i132;
                        t13.f35697n = z15;
                        if (!kiVar3.V1.j()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(kiVar3.getContainer().findFocus());
                        }
                        File w8 = kh.a8.w(kiVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i142 = point.x;
                        int i152 = point.y;
                        if (i142 > 1080 || i152 > 1080) {
                            float min = Math.min(i142, i152) / 1080.0f;
                            i142 = (int) (i142 * min);
                            i152 = (int) (i152 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i142, i152, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        lh lhVar = new lh(kiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.qn) {
                            qnVar = (org.telegram.ui.qn) o2Var2;
                        } else {
                            qnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, qnVar);
                        if (kiVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, kiVar3.F);
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
        qh qhVar = new qh(this, context, aiVar, b6Var);
        this.A0 = qhVar;
        qhVar.F = true;
        qhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        qhVar.s();
        qhVar.getEditText().setLayoutParams(g7.e6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        qhVar.getEditText().addTextChangedListener(new sh(this));
        phVar.addView(qhVar, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        phVar.setClipChildren(false);
        mhVar3.setClipChildren(false);
        qhVar.setClipChildren(false);
        vVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar2.setWillNotDraw(false);
        th thVar = new th(this, context, aiVar, b6Var);
        this.L0 = thVar;
        thVar.F = true;
        thVar.getEditText().addTextChangedListener(new uh(this, o2Var));
        thVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        thVar.getEditText().setLayoutParams(g7.e6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        thVar.getEditText().setTextSize(1, 17.0f);
        thVar.getEmojiButton().setLayoutParams(g7.e6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar2.addView(thVar, g7.e6.e(-1, -2, 119));
        vVar2.setAlpha(0.0f);
        vVar2.setVisibility(8);
        qhVar.addView(imageView3, g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        kg.d c13 = this.C2.c(vVar2, mg.c.m(b6Var), false);
        c13.p(AndroidUtilities.dp(22.0f));
        c13.o(AndroidUtilities.dp(7.0f));
        vVar2.setBackground(c13);
        vVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        j6 j6Var3 = new j6(context, false, false, false);
        this.v = j6Var3;
        j6Var3.setScaleProperty(0.6f);
        j6Var3.setVisibility(8);
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setTextColor(getThemedColor(i13));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        j6Var3.setAllowCancel(true);
        vVar2.addView(j6Var3, g7.e6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Xd), mode2));
        thVar.addView(imageView5, g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view2) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30174y = imageView6;
        i0 i0Var2 = new i0(context);
        this.A = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(16.0f)));
        vVar2.addView(imageView6, g7.e6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34966b;

            {
                this.f34966b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.qn qnVar;
                switch (r3) {
                    case 0:
                        final ki kiVar = this.f34966b;
                        qh qhVar2 = kiVar.A0;
                        if (qhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(kiVar.getContext(), b6Var);
                            e0Var.l0(qhVar2.getText());
                            e0Var.f27857f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar22 = kiVar.A0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar2 = kiVar.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = kiVar.V;
                            if (kiVar.D1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ch chVar = new ch(kiVar, 0);
                            e0Var.f27859h0 = j10;
                            e0Var.f27860i0 = z13;
                            e0Var.f27861j0 = chVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ki kiVar2 = this.f34966b;
                        th thVar2 = kiVar2.L0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(kiVar2.getContext(), b6Var);
                            e0Var2.l0(thVar2.getText());
                            e0Var2.f27857f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            qh qhVar22 = kiVar2.A0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            th thVar22 = kiVar2.L0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = kiVar2.V;
                            if (kiVar2.D1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ch chVar2 = new ch(kiVar2, 1);
                            e0Var2.f27859h0 = j11;
                            e0Var2.f27860i0 = z14;
                            e0Var2.f27861j0 = chVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ki kiVar3 = this.f34966b;
                        kiVar3.f30118g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar3.f30099b0;
                        t12.K2(null, o2Var2, b6Var);
                        PhotoViewer.t1().L2(kiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i132 = kiVar3.O1;
                        boolean z15 = kiVar3.P1;
                        t13.h = i132;
                        t13.f35697n = z15;
                        if (!kiVar3.V1.j()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(kiVar3.getContainer().findFocus());
                        }
                        File w8 = kh.a8.w(kiVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i142 = point.x;
                        int i152 = point.y;
                        if (i142 > 1080 || i152 > 1080) {
                            float min = Math.min(i142, i152) / 1080.0f;
                            i142 = (int) (i142 * min);
                            i152 = (int) (i152 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i142, i152, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        lh lhVar = new lh(kiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.qn) {
                            qnVar = (org.telegram.ui.qn) o2Var2;
                        } else {
                            qnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, lhVar, qnVar);
                        if (kiVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, kiVar3.F);
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
        this.D0 = mhVar4;
        mhVar4.setFocusable(true);
        mhVar4.setFocusableInTouchMode(true);
        mhVar4.setVisibility(4);
        mhVar4.setScaleX(0.2f);
        mhVar4.setScaleY(0.2f);
        mhVar4.setAlpha(0.0f);
        mhVar4.setClipChildren(false);
        mhVar4.setClipToPadding(false);
        this.containerView.addView(mhVar4, g7.e6.e(110, 50, 85));
        vh vhVar = new vh(R.drawable.send_plane_24, context, b6Var, this);
        this.E0 = vhVar;
        vhVar.setImportantForAccessibility(2);
        mhVar4.addView(vhVar, g7.e6.e(-1, -1, 119));
        vhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        vhVar.E = dp2;
        vhVar.F = dp3;
        vhVar.I = AndroidUtilities.dp(7.0f);
        vhVar.J = AndroidUtilities.dp(6.0f);
        vhVar.f30437d0 = true;
        vhVar.setOnClickListener(new View.OnClickListener(this) {
            public final ki f34673b;

            {
                this.f34673b = this;
            }

            @Override
            public final void onClick(View view2) {
                mh.g4 g4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ki kiVar = this.f34673b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.f30157t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ki kiVar2 = this.f34673b;
                        boolean z14 = kiVar2.Y;
                        if (!z14) {
                            kiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ki kiVar3 = this.f34673b;
                        boolean z15 = kiVar3.Y;
                        if (z15) {
                            kiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f34673b.z1();
                        return;
                    case 4:
                        this.f34673b.W0.M(null, null);
                        return;
                    case 5:
                        ki.s(this.f34673b);
                        return;
                    case 6:
                        ci ciVar = this.f34673b.f30160u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f34673b.f30118g1.M(null, null);
                        return;
                    default:
                        ki kiVar4 = this.f34673b;
                        if (kiVar4.f30160u0 != kiVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kiVar4.Z1(z13);
                        return;
                }
            }
        });
        vhVar.setOnLongClickListener(new org.telegram.ui.wf(this, context, b6Var, o2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        oh ohVar2 = new oh(this, context, 1);
        ohVar2.setAlpha(0.0f);
        ohVar2.setScaleX(0.2f);
        ohVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        fk0 fastScroll = chatAttachAlertPhotoLayout.A.getFastScroll();
        ig.a aVar6 = this.C2;
        lg.d m10 = mg.c.m(b6Var);
        wk0 wk0Var = fastScroll.f28479k0;
        kg.d c14 = aVar6.c(wk0Var.f34240b1, m10, false);
        fastScroll.f28465a0 = c14;
        c14.o(AndroidUtilities.dp(4.0f));
        fastScroll.f28465a0.p(AndroidUtilities.dp(24.0f));
        kg.d c15 = aVar6.c(wk0Var.f34240b1, m10, false);
        fastScroll.f28467b0 = c15;
        c15.o(AndroidUtilities.dp(6.0f));
        fastScroll.f28467b0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f28467b0.p(AndroidUtilities.dp(f10));
        yc0 yc0Var = new yc0(context);
        this.O = yc0Var;
        this.containerView.addView(yc0Var, g7.e6.c(-1.0f, -1));
        lg.d dVar3 = new lg.d(b6Var);
        dVar3.f16866e = new tg(this, 4);
        dVar3.f16865c = new tg(this, 5);
        dVar3.d = new tg(this, 6);
        dVar3.f16864b = new tg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f16868n = dpf2;
        dVar3.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f16867f = dpf23;
        dVar3.h = dpf24;
        r7Var.L(this.C2, dVar3, false);
        jVar.i(1L, false);
    }

    public static void L(ki kiVar) {
        boolean q10;
        int i9;
        int i10;
        r7 r7Var = kiVar.T0;
        rg.f fVar = kiVar.f30151r1;
        if (fVar != null && r7Var != null) {
            org.telegram.ui.ActionBar.b6 b6Var = kiVar.resourcesProvider;
            if (b6Var != null) {
                q10 = b6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.f6.I.q();
            }
            if (r7Var.getVisibility() == 0) {
                if (q10) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i9 = (int) (r7Var.getAlpha() * i10);
            } else {
                i9 = 0;
            }
            fVar.setFadeTopAlpha(i9);
        }
    }

    public static void P(ki kiVar) {
        kh.i iVar = new kh.i(kiVar, kiVar.getContext(), kiVar.V, LaunchActivity.R(), kiVar.resourcesProvider, 1);
        kiVar.f30173x2 = iVar;
        iVar.p(new m5.c0(kiVar, 13));
        ViewGroup viewGroup = kiVar.containerView;
        viewGroup.addView(kiVar.f30173x2, viewGroup.indexOfChild(kiVar.f30178z0), g7.e6.e(-1, -1, 83));
        kh.i iVar2 = kiVar.f30173x2;
        iVar2.getAdapter().f19322c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f19325e = false;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        boolean z10 = true;
        if (o2Var instanceof org.telegram.ui.qn) {
            iVar2.getAdapter().f19331i0 = false;
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            of.f1 adapter = iVar2.getAdapter();
            qnVar.i();
            TLRPC.Chat chat = qnVar.f41890e;
            adapter.getClass();
            adapter.f19330h0 = chat;
            iVar2.getAdapter().W(qnVar.V7);
            of.f1 adapter2 = iVar2.getAdapter();
            if (qnVar.f41890e == null) {
                z10 = false;
            }
            adapter2.f19320a0 = z10;
        } else {
            iVar2.getAdapter().f19331i0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f19320a0 = false;
        }
        iVar2.getAdapter().f19321b0 = false;
        kiVar.U1();
    }

    public static void m(ki kiVar, ValueAnimator valueAnimator) {
        kiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = kiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static void n(ki kiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        kiVar.currentSheetAnimation = null;
        kiVar.f30133l2 = null;
        animationNotificationsLocker.unlock();
        kiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (kiVar.useHardwareLayer) {
            kiVar.container.setLayerType(0, null);
        }
        if (kiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = kiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            kiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(ki kiVar, int i9) {
        kiVar.navBarColorKey = -1;
        kiVar.navBarColor = i9;
        kiVar.containerView.invalidate();
    }

    public static void p(ki kiVar) {
        o1.j jVar = kiVar.f30133l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(kiVar.containerView, o1.h.f18783n, 0.0f);
        kiVar.f30133l2 = jVar2;
        jVar2.f18800u.a(1.5f);
        kiVar.f30133l2.f18800u.b(1500.0f);
        kiVar.f30133l2.f();
    }

    public static boolean q(org.telegram.ui.Components.ki r45, android.content.Context r46, org.telegram.ui.ActionBar.b6 r47, org.telegram.ui.ActionBar.o2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.q(org.telegram.ui.Components.ki, android.content.Context, org.telegram.ui.ActionBar.b6, org.telegram.ui.ActionBar.o2, android.view.View):boolean");
    }

    public static void r(ki kiVar, org.telegram.messenger.video.e eVar) {
        AnimatorSet animatorSet = kiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            eVar.run();
        }
    }

    public static void s(ki kiVar) {
        int i9;
        if (kiVar.f30114f0 == null) {
            return;
        }
        boolean R = ChatAttachAlertPhotoLayout.R();
        boolean z10 = !R;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(R);
                        for (int i10 = 0; i10 < chatAttachAlertPhotoLayout.A.getChildCount(); i10++) {
                            View childAt = chatAttachAlertPhotoLayout.A.getChildAt(i10);
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
            chatAttachAlertPhotoLayout.u0();
        }
        kiVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = kiVar.Y0;
        kh.x3 x3Var = kiVar.Z0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = new kh.x3(kiVar.getContext(), 1);
        kiVar.Z0 = x3Var2;
        if (!R) {
            i9 = R.string.LivePhotosOn;
        } else {
            i9 = R.string.LivePhotosOff;
        }
        x3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(i9)));
        kiVar.Z0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        kiVar.Z0.n(1.0f, -((kiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        kiVar.Z0.setTranslationY(kiVar.W0.getTranslationY());
        kh.x3 x3Var3 = kiVar.Z0;
        x3Var3.f16352h0 = new org.telegram.ui.wq(12, kiVar, x3Var2);
        kiVar.containerView.addView(x3Var3, g7.e6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        kiVar.Z0.v();
    }

    public static void t(ki kiVar, boolean z10, wg wgVar) {
        Integer num;
        kiVar.f30160u0.s(1.0f);
        kiVar.f30163v0.s(1.0f);
        kiVar.f30160u0.k(kiVar.f30122h2);
        kiVar.f30163v0.k(kiVar.f30122h2);
        kiVar.containerView.invalidate();
        r7 r7Var = kiVar.T0;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        r7Var.setTag(num);
        wgVar.run();
    }

    public static void v(ki kiVar, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int i9;
        ki kiVar2 = kiVar;
        nh nhVar = kiVar2.f30161u1;
        ci[] ciVarArr = kiVar2.f30154s0;
        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar2.f30099b0;
        if (o2Var2 == null) {
            o2Var = LaunchActivity.R();
        } else {
            o2Var = o2Var2;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (view instanceof ei) {
                Activity parentActivity = o2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i9 = ((Integer) view.getTag()).intValue();
                } else {
                    i9 = -1;
                }
                boolean z10 = true;
                if (i9 == 1) {
                    if (kiVar2.H1 || kiVar2.I1 || !kiVar2.a1()) {
                        if (!kiVar2.H1 && !kiVar2.I1) {
                            ln lnVar = new ln(1, kiVar2.getContext(), b6Var, kiVar2);
                            kiVar2.P = lnVar;
                            kiVar2.Q1(lnVar);
                        }
                        kiVar2.Q1(kiVar2.f30114f0);
                    } else {
                        return;
                    }
                } else if (i9 == 3) {
                    if (kiVar2.J1 || !kiVar2.a1()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(kiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        kiVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i9 == 4) {
                    if (kiVar2.G1 || !kiVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(kiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        kiVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i9 == 5) {
                    if (kiVar2.M1 || !kiVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && kiVar2.M1 && kiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(kiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        kiVar2.D1();
                    } else {
                        return;
                    }
                } else if (i9 == 6) {
                    if ((kiVar2.M1 || !kiVar2.a1()) && AndroidUtilities.isMapsInstalled(o2Var2)) {
                        if (!kiVar2.M1) {
                            ln lnVar2 = new ln(6, kiVar2.getContext(), b6Var, kiVar2);
                            kiVar2.P = lnVar2;
                            kiVar2.Q1(lnVar2);
                        } else {
                            if (kiVar2.f30129k0 == null) {
                                xk xkVar = new xk(kiVar2, kiVar2.getContext(), b6Var, (kiVar2.D || kiVar2.N1) ? false : false);
                                kiVar2.f30129k0 = xkVar;
                                ciVarArr[5] = xkVar;
                                sk skVar = kiVar2.f30145p2;
                                if (skVar != null) {
                                    xkVar.setDelegate(skVar);
                                } else {
                                    xkVar.setDelegate(new tg(kiVar2, 9));
                                }
                            }
                            kiVar2.Q1(kiVar2.f30129k0);
                        }
                    } else {
                        return;
                    }
                } else if (i9 == 9) {
                    if (kiVar2.K1 || !kiVar2.a1()) {
                        if (!kiVar2.K1) {
                            ln lnVar3 = new ln(9, kiVar2.getContext(), b6Var, kiVar2);
                            kiVar2.P = lnVar3;
                            kiVar2.Q1(lnVar3);
                        } else {
                            kiVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i9 == 11) {
                    if (kiVar2.f30140o0 == null) {
                        pf.e0 e0Var = new pf.e0(kiVar2.getContext(), kiVar2.resourcesProvider, kiVar2);
                        kiVar2.f30140o0 = e0Var;
                        ciVarArr[7] = e0Var;
                        e0Var.setupBlurredSearchField(kiVar2.C2);
                    }
                    kiVar2.Q1(kiVar2.f30140o0);
                } else if (i9 == 12) {
                    if (kiVar2.L1 || !kiVar2.a1()) {
                        if (!kiVar2.L1) {
                            ln lnVar4 = new ln(9, kiVar2.getContext(), b6Var, kiVar2);
                            kiVar2.P = lnVar4;
                            kiVar2.Q1(lnVar4);
                        } else {
                            if (kiVar2.f30126j0 == null) {
                                jn jnVar = new jn(kiVar, kiVar.getContext(), true, b6Var, null);
                                kiVar2 = kiVar;
                                kiVar2.f30126j0 = jnVar;
                                ciVarArr[1] = jnVar;
                                jnVar.setDelegate(new tg(kiVar2, 10));
                            }
                            kiVar2.Q1(kiVar2.f30126j0);
                        }
                    } else {
                        return;
                    }
                } else if (i9 == 13) {
                    if (kiVar2.f30146q0 == null) {
                        gk gkVar = new gk(kiVar2, kiVar2.getContext(), b6Var, true);
                        kiVar2.f30146q0 = gkVar;
                        ciVarArr[8] = gkVar;
                        gkVar.setDelegate(kiVar2.W1);
                    }
                    kiVar2.Q1(kiVar2.f30146q0);
                } else if (i9 == 14) {
                    if (kiVar2.f30143p0 == null) {
                        gk gkVar2 = new gk(kiVar2, kiVar2.getContext(), b6Var, false);
                        kiVar2.f30143p0 = gkVar2;
                        ciVarArr[9] = gkVar2;
                        gkVar2.setDelegate(kiVar2.W1);
                    }
                    kiVar2.Q1(kiVar2.f30143p0);
                } else if (i9 == 16) {
                    if (kiVar2.f30150r0 == null) {
                        qh.p pVar = new qh.p(kiVar2.F1, kiVar2.getContext(), b6Var, kiVar2);
                        kiVar2.f30150r0 = pVar;
                        ciVarArr[10] = pVar;
                    }
                    kiVar2.Q1(kiVar2.f30150r0);
                } else if (view.getTag() instanceof Integer) {
                    kiVar2.V1.L(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, kiVar2.s1(), false, 0L);
                }
            } else if (view instanceof di) {
                di diVar = (di) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = diVar.f27740c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        fi1.a(kiVar2.getContext(), new ih.a2(5, kiVar2, diVar), null);
                    } else {
                        kiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    kiVar2.V1.E(diVar.f27739b);
                    kiVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                nhVar.v0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > nhVar.getMeasuredWidth()) {
                nhVar.v0(i13 - nhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(ki kiVar) {
        ci ciVar;
        hm hmVar;
        kiVar.f30144p1 = null;
        ci ciVar2 = kiVar.f30160u0;
        if (ciVar2 != kiVar.f30114f0 && (ciVar = kiVar.f30163v0) != (hmVar = kiVar.m0) && ciVar2 != ciVar && ciVar2 != hmVar) {
            kiVar.containerView.removeView(ciVar2);
        }
        kiVar.f30160u0.setVisibility(8);
        kiVar.f30160u0.q();
        kiVar.f30163v0.E();
        kiVar.f30160u0 = kiVar.f30163v0;
        kiVar.f30163v0 = null;
        int[] iArr = kiVar.X1;
        iArr[0] = iArr[1];
        kiVar.H1(kiVar.Y, false);
        kiVar.W1();
    }

    public final void A1(int i9) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (i9 == 3) {
            if (this.J1 || !a1()) {
                if (o2Var != null) {
                    activity = o2Var.getParentActivity();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 33) {
                        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                B1(true);
            }
        } else if (i9 == 6 && AndroidUtilities.isMapsInstalled(o2Var)) {
            if (this.f30129k0 == null) {
                xk xkVar = new xk(this, getContext(), this.resourcesProvider, (this.D || this.N1) ? false : false);
                this.f30129k0 = xkVar;
                this.f30154s0[5] = xkVar;
                sk skVar = this.f30145p2;
                if (skVar != null) {
                    xkVar.setDelegate(skVar);
                } else if (o2Var instanceof org.telegram.ui.qn) {
                    xkVar.setDelegate(new tg(this, 16));
                }
            }
            Q1(this.f30129k0);
        }
    }

    public final void B1(boolean z10) {
        if (!this.J1 && z10) {
            ln lnVar = new ln(3, getContext(), this.resourcesProvider, this);
            this.P = lnVar;
            Q1(lnVar);
        }
        int i9 = 1;
        if (this.f30120h0 == null) {
            vi viVar = new vi(getContext(), this.resourcesProvider, this);
            this.f30120h0 = viVar;
            this.f30154s0[3] = viVar;
            viVar.setupBlurredSearchField(this.C2);
            this.f30120h0.setDelegate(new tg(this, 13));
            if (this.D) {
                this.f30120h0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            TLRPC.Chat chat = ((org.telegram.ui.qn) o2Var).f41890e;
            vi viVar2 = this.f30120h0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                i9 = -1;
            }
            viVar2.setMaxSelectedFiles(i9);
        }
        if (z10) {
            Q1(this.f30120h0);
        }
    }

    public final void C1() {
        if (this.f30137n0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
            ?? ciVar = new ci(context, b6Var, this);
            ciVar.f34974r = AndroidUtilities.dp(80.0f);
            ciVar.f34976w = 3;
            gh.f1 f1Var = new gh.f1(ciVar, context, b6Var, 11);
            ciVar.f34973n = f1Var;
            ra raVar = new ra(ciVar, context);
            ciVar.v = raVar;
            f1Var.setAdapter(raVar);
            f1Var.setClipToPadding(false);
            f1Var.setItemAnimator(null);
            f1Var.setLayoutAnimation(null);
            f1Var.setVerticalScrollBarEnabled(false);
            f1Var.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, ciVar.f27492a));
            ciVar.addView(f1Var, g7.e6.c(-1.0f, -1));
            f1Var.setOnScrollListener(new bg.o2(ciVar, 24));
            jh.k kVar = new jh.k(ciVar, ciVar.f34974r, 1);
            ciVar.f34975s = kVar;
            kVar.O = new fh.c6(ciVar, 4);
            f1Var.setLayoutManager(kVar);
            this.f30137n0 = ciVar;
            ciVar.setDelegate(new xa(this, 1));
        }
        Q1(this.f30137n0);
    }

    public final void D1() {
        boolean z10;
        if (!this.M1) {
            ln lnVar = new ln(5, getContext(), this.resourcesProvider, this);
            this.P = lnVar;
            Q1(lnVar);
        }
        if (this.f30117g0 == null) {
            pj pjVar = new pj(getContext(), this.resourcesProvider, this);
            this.f30117g0 = pjVar;
            this.f30154s0[2] = pjVar;
            pjVar.setupBlurredSearchField(this.C2);
            this.f30117g0.setDelegate(new wh(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            TLRPC.Chat chat = ((org.telegram.ui.qn) o2Var).f41890e;
            pj pjVar2 = this.f30117g0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            pjVar2.setMultipleSelectionAllowed(z10);
        }
        Q1(this.f30117g0);
    }

    public final void E1(boolean z10) {
        int i9;
        if (!this.G1 && z10) {
            ln lnVar = new ln(4, getContext(), this.resourcesProvider, this);
            this.P = lnVar;
            Q1(lnVar);
        }
        boolean z11 = false;
        if (this.f30132l0 == null) {
            if (this.J) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            fk fkVar = new fk(i9, getContext(), this.resourcesProvider, this);
            this.f30132l0 = fkVar;
            this.f30154s0[4] = fkVar;
            fkVar.setDelegate(new xh(this));
        }
        int i10 = 1;
        if (this.D) {
            this.f30132l0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
            if (o2Var instanceof org.telegram.ui.qn) {
                TLRPC.Chat chat = ((org.telegram.ui.qn) o2Var).f41890e;
                fk fkVar2 = this.f30132l0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                    i10 = -1;
                }
                fkVar2.setMaxSelectedFiles(i10);
            } else {
                this.f30132l0.setMaxSelectedFiles(this.O1);
                fk fkVar3 = this.f30132l0;
                if (!this.J && !this.S) {
                    z11 = true;
                }
                fkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        fk fkVar4 = this.f30132l0;
        fkVar4.W = this.J;
        if (z10) {
            Q1(fkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        r7 r7Var = this.T0;
        int i9 = 1;
        if (r7Var.f23577j0) {
            r7Var.h(true);
        }
        this.f30117g0 = null;
        this.f30140o0 = null;
        this.f30120h0 = null;
        this.f30123i0 = null;
        this.f30126j0 = null;
        this.f30129k0 = null;
        this.f30132l0 = null;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i9 < ciVarArr.length) {
                ci ciVar = ciVarArr[i9];
                if (ciVar != null) {
                    ciVar.m();
                    this.containerView.removeView(ciVarArr[i9]);
                    ciVarArr[i9] = null;
                }
                i9++;
            } else {
                T1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    public final boolean G1(final int i9, final boolean z10, final int i10, final boolean z11, final long j10) {
        if (this.E1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            TLRPC.Chat chat = qnVar.f41890e;
            if (qnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.F1).edit();
                edit.putBoolean("silent_" + qnVar.a(), !z10).commit();
            }
        }
        int i11 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f47776f) {
            this.E1 = true;
            this.V1.L(7, true, z10, i9, i10, j10, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        ci ciVar = this.f30160u0;
        if (ciVar != null) {
            i11 = ciVar.getSelectedItemsCount();
        }
        return y4.b0(this.F1, n12, j1() + i11, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ki kiVar = ki.this;
                kiVar.E1 = true;
                kiVar.V1.L(7, true, z10, i9, i10, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i9;
        float f10;
        float f11;
        float measuredHeight;
        this.f30098b.a(z10, z11);
        ut m12 = m1();
        this.Y = z10;
        ut m13 = m1();
        int i10 = 0;
        if (this.f30178z0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ci ciVar = this.f30160u0;
        if (ciVar != this.f30114f0 && ciVar != this.m0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.Y && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i11 = 8;
        float f12 = 1.0f;
        fh.v vVar = this.K0;
        ph phVar = this.f30175y0;
        float f13 = 0.0f;
        if (z11) {
            if (z12) {
                i11 = 0;
            }
            vVar.setVisibility(i11);
            ViewPropertyAnimator animate = vVar.animate();
            if (z14 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).setUpdateListener(new ug(this, 0)).withEndAction(new Runnable(this) {
                public final ki f33363b;

                {
                    this.f33363b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ki kiVar = this.f33363b;
                            if (!z14 || !z12) {
                                kiVar.K0.setVisibility(8);
                            }
                            kiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f33363b.f30175y0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            phVar.setVisibility(0);
            ViewPropertyAnimator animate2 = phVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = phVar.getMeasuredHeight();
            }
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(grVar).setUpdateListener(new ug(this, 1)).withEndAction(new Runnable(this) {
                public final ki f33363b;

                {
                    this.f33363b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ki kiVar = this.f33363b;
                            if (!z14 || !z12) {
                                kiVar.K0.setVisibility(8);
                            }
                            kiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f33363b.f30175y0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z14 && z12) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            vVar.setVisibility(i9);
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            vVar.setAlpha(f10);
            b2();
            phVar.setAlpha((z14 || !z12) ? 0.0f : 0.0f);
            if (z14 || !z12) {
                f13 = phVar.getMeasuredHeight();
            }
            phVar.setTranslationY(f13);
            phVar.setVisibility((z14 || !z12) ? 8 : 8);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(t5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new wg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f30114f0) != null) {
            chatAttachAlertPhotoLayout.Y();
        }
        if (this.D1 == messageObject && this.C1 == i9) {
            return;
        }
        this.D1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.D1.isMusic()) {
                i9 = 2;
            } else if (this.D1.isDocument()) {
                i9 = 1;
            } else {
                i9 = 0;
            }
        }
        this.C1 = i9;
        if (this.D1 != null) {
            this.O1 = 1;
            this.P1 = false;
        } else {
            this.O1 = -1;
            this.P1 = true;
        }
        this.f30168w1.l();
        V1(0);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        ci ciVar;
        int i10;
        if (i9 == 0) {
            g1();
            e1();
            return;
        }
        int i11 = 1;
        if (i9 == 2) {
            e1();
            jn jnVar = this.f30123i0;
            if (jnVar != null && ((ciVar = this.f30163v0) == jnVar || this.f30160u0 == jnVar)) {
                if (ciVar == jnVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                a2(i10);
            }
            jn jnVar2 = this.f30126j0;
            if (jnVar2 != null) {
                ci ciVar2 = this.f30163v0;
                if (ciVar2 == jnVar2 || this.f30160u0 == jnVar2) {
                    if (ciVar2 != jnVar2) {
                        i11 = 0;
                    }
                    a2(i11);
                }
            }
        } else if (i9 == 1) {
            e1();
        } else if (i9 == 3) {
            f1();
        } else if (i9 == 4) {
            f1();
        } else if (i9 == 5) {
            f1();
            vh vhVar = this.E0;
            if (vhVar != null) {
                vhVar.setEphemeralFactor(f10);
                vhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void J1(int i9, boolean z10) {
        if (this.D1 != null) {
            return;
        }
        this.O1 = i9;
        this.P1 = z10;
    }

    public final void K1(float f10) {
        boolean z10 = false;
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
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
        this.M0 = 1;
        this.B = true;
        this.O0 = false;
        this.I1 = false;
        this.f30158t1.setVisibility(8);
        this.f30115f1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
        if (chatAttachAlertPhotoLayout != null) {
            ki kiVar = chatAttachAlertPhotoLayout.f27493b;
            chatAttachAlertPhotoLayout.f26251c1 = (kiVar.M0 == 0 || kiVar.B) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.M1(boolean):void");
    }

    public final void N1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.qn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.qn) o2Var).f41890e)) {
            new oc(this.f30138n1, this.resourcesProvider).f(MessagesController.getInstance(this.F1).captionLengthLimitPremium, new org.telegram.ui.wq(13, this, o2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f10;
        float f11;
        int i9;
        float f12;
        float f13;
        float f14;
        int i10;
        float f15;
        float f16;
        float f17;
        ci ciVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        r7 r7Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        this.f30102c.a(z10, true);
        mh mhVar = this.f30178z0;
        if (mhVar.getTag() != null) {
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
        mhVar.setTag(num);
        qh qhVar = this.A0;
        if (qhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        qhVar.k(true);
        this.L0.k(true);
        mh mhVar2 = this.f30158t1;
        mh mhVar3 = this.D0;
        if (z10) {
            if (!this.J) {
                mhVar.setVisibility(0);
            }
            mhVar3.setVisibility(0);
        } else if (this.O0) {
            mhVar2.setVisibility(0);
        }
        ci ciVar2 = this.f30160u0;
        if ((ciVar2 == this.f30114f0 || ciVar2 == this.m0) && this.Y) {
            z13 = true;
        } else {
            z13 = false;
        }
        r7 r7Var2 = this.T0;
        fh.v vVar = this.K0;
        ph phVar = this.f30175y0;
        vh vhVar = this.E0;
        float f27 = 0.2f;
        float f28 = 1.0f;
        if (z11) {
            float f29 = 0.0f;
            this.I0 = new AnimatorSet();
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
            arrayList.add(ObjectAnimator.ofFloat(mhVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(phVar, property, f20));
            if (z10 && !z13) {
                phVar.setVisibility(0);
                r7Var = r7Var2;
                arrayList.add(ObjectAnimator.ofFloat(phVar, View.TRANSLATION_Y, 0.0f));
            } else {
                r7Var = r7Var2;
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
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar, property2, f25));
            if (z10) {
                f27 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar, property3, f27));
            if (r7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f29 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(mhVar, property4, f29));
            } else if (this.O0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f26 = AndroidUtilities.dp(36.0f);
                } else {
                    f26 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, property5, f26));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ug(this, 4));
                arrayList.add(ofFloat);
            }
            this.I0.playTogether(arrayList);
            this.I0.setInterpolator(new DecelerateInterpolator());
            this.I0.setDuration(180L);
            this.I0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z13, 3));
            this.I0.start();
            i9 = 0;
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mhVar.setAlpha(f10);
            if (z10 && z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            phVar.setAlpha(f11);
            if (z10 && !z13) {
                i9 = 0;
                phVar.setVisibility(0);
                phVar.setTranslationY(0.0f);
            } else {
                i9 = 0;
            }
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            mhVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            mhVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            mhVar3.setAlpha(f14);
            if (z10 && z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            vVar.setVisibility(i10);
            if (z10 && z13) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            vVar.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            vhVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            vhVar.setScaleY(f17);
            if (r7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                mhVar.setTranslationY(dp);
            } else if (this.O0 && ((ciVar = this.f30160u0) == null || ciVar.I())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = 0.0f;
                }
                mhVar2.setTranslationY(f18);
            }
            if (!z10) {
                mhVar.setVisibility(4);
                mhVar3.setVisibility(4);
            }
            if (z13) {
                b2();
            }
        }
        if (z10) {
            i9 = Math.max(1, this.f30160u0.getSelectedItemsCount());
        }
        vhVar.g(i9, z11);
        if (this.D1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1());
        }
        vhVar.i(j1() + this.f30160u0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), vhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            qhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(ci ciVar) {
        long j10 = this.S0;
        ln lnVar = this.P;
        if (ciVar == lnVar) {
            j10 = lnVar.f30485s;
        } else if (ciVar == this.f30114f0) {
            j10 = 1;
        } else if (ciVar == this.f30120h0) {
            j10 = 3;
        } else if (ciVar == this.f30132l0) {
            j10 = 4;
        } else if (ciVar == this.f30117g0) {
            j10 = 5;
        } else if (ciVar == this.f30129k0) {
            j10 = 6;
        } else if (ciVar == this.f30123i0) {
            j10 = 9;
        } else if (ciVar == this.f30137n0) {
            j10 = 10;
        } else if (ciVar == this.f30140o0) {
            j10 = 11;
        } else if (ciVar == this.f30126j0) {
            j10 = 12;
        } else if (ciVar == this.f30143p0) {
            j10 = 14;
        } else if (ciVar == this.f30146q0) {
            j10 = 13;
        } else if (ciVar == this.f30150r0) {
            j10 = 16;
        }
        R1(ciVar, j10, true);
    }

    public final void R1(ci ciVar, long j10, boolean z10) {
        boolean z11;
        int i9;
        ul ulVar;
        boolean z12;
        Integer num;
        ul ulVar2;
        int dp;
        int i10;
        int dp2;
        nh nhVar;
        boolean z13;
        if (this.f30144p1 == null && this.I0 == null) {
            ci ciVar2 = this.f30160u0;
            if (ciVar2 == ciVar) {
                ciVar2.F();
            } else if (ciVar == this.f30126j0 && !UserConfig.getInstance(this.F1).isPremium()) {
                new zf.x0(this.f30099b0, 39, false).show();
            } else {
                int i11 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30113f.a(z11, z10);
                this.f30136n.i(Long.valueOf(j10), z10);
                this.f30179z1 = false;
                this.f30172x1 = false;
                this.B1 = 0.0f;
                this.A1.setVisibility(8);
                RadialProgressView radialProgressView = this.f30176y1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                mh mhVar = this.f30158t1;
                mhVar.setAlpha(1.0f);
                mhVar.setTranslationY(this.B1);
                int i12 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f30157t0;
                    if (i12 >= longSparseArray.size()) {
                        break;
                    }
                    ((mh.g4) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                    i12++;
                }
                this.S0 = j10;
                nh nhVar2 = this.f30161u1;
                int childCount = nhVar2.getChildCount();
                int i13 = 0;
                while (i13 < childCount) {
                    View childAt = nhVar2.getChildAt(i13);
                    if (childAt instanceof ei) {
                        ei eiVar = (ei) childAt;
                        nhVar = nhVar2;
                        if (eiVar.f28032b == eiVar.f28033c.S0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        eiVar.f28435a.e(z13, true);
                    } else {
                        nhVar = nhVar2;
                        if (childAt instanceof di) {
                            ((di) childAt).a(true);
                        }
                    }
                    i13++;
                    nhVar2 = nhVar;
                }
                int firstOffset = (this.f30160u0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.X1[0];
                this.f30163v0 = ciVar;
                ciVar.getClass();
                boolean z14 = ciVar instanceof qh.p;
                rg.f fVar = this.f30151r1;
                if (fVar != null) {
                    if (z14) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                oh ohVar = this.f30155s1;
                if (ohVar != null) {
                    if (z14) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    ohVar.setVisibility(i10);
                }
                if (this.f30163v0.h() != 0) {
                    i9 = 0;
                } else {
                    i9 = 4;
                }
                r7 r7Var = this.T0;
                r7Var.setVisibility(i9);
                if (r7Var.f23577j0) {
                    r7Var.h(true);
                }
                this.f30160u0.r();
                ci ciVar3 = this.f30163v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
                if (ciVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f30163v0.D(this.f30160u0);
                this.f30163v0.setVisibility(0);
                if (ciVar.getParent() != null) {
                    this.containerView.removeView(this.f30163v0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.f30160u0);
                ViewParent parent = this.f30163v0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    ci ciVar4 = this.f30163v0;
                    if (ciVar4 != this.f30129k0) {
                        indexOfChild++;
                    }
                    viewGroup.addView(ciVar4, indexOfChild, g7.e6.c(-1.0f, -1));
                }
                wg wgVar = new wg(this, 3);
                ci ciVar5 = this.f30160u0;
                boolean z15 = ciVar5 instanceof hm;
                yh yhVar = this.f30096a0;
                if (!z15 && !(this.f30163v0 instanceof hm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f30163v0.setAlpha(0.0f);
                        this.f30163v0.setTranslationY(AndroidUtilities.dp(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f30160u0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f30160u0, yhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, View.ALPHA, r7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(gr.f28844f);
                        animatorSet.addListener(new gh.m3(this, firstOffset, wgVar, 1));
                        this.f30144p1 = animatorSet;
                        ci ciVar6 = this.f30160u0;
                        yhVar.getClass();
                        yhVar.b(ciVar6, 0.0f);
                        animatorSet.start();
                    } else {
                        ciVar5.setAlpha(0.0f);
                        wgVar.run();
                        a2(0);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.f30163v0.getWidth(), this.f30160u0.getWidth());
                    ci ciVar7 = this.f30163v0;
                    if (ciVar7 instanceof hm) {
                        ciVar7.setTranslationX(max);
                        ci ciVar8 = this.f30160u0;
                        if ((ciVar8 instanceof ChatAttachAlertPhotoLayout) && (ulVar2 = ((ChatAttachAlertPhotoLayout) ciVar8).L) != null) {
                            ulVar2.setVisibility(4);
                        }
                    } else {
                        this.f30160u0.setTranslationX(-max);
                        ci ciVar9 = this.f30163v0;
                        if (ciVar9 == chatAttachAlertPhotoLayout && (ulVar = ((ChatAttachAlertPhotoLayout) ciVar9).L) != null) {
                            ulVar.setVisibility(0);
                        }
                    }
                    this.f30163v0.setAlpha(1.0f);
                    this.f30160u0.setAlpha(1.0f);
                    if (z10) {
                        ci ciVar10 = this.f30160u0;
                        yhVar.getClass();
                        yhVar.b(ciVar10, 0.0f);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, ciVar, wgVar, 17));
                    } else {
                        if (this.f30163v0.getCurrentItemTop() <= ciVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f30160u0.s(1.0f);
                        this.f30163v0.s(1.0f);
                        this.f30160u0.k(this.f30122h2);
                        this.f30163v0.k(this.f30122h2);
                        this.containerView.invalidate();
                        ci ciVar11 = this.f30160u0;
                        yhVar.getClass();
                        yhVar.b(ciVar11, 1.0f);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        r7Var.setTag(num);
                        wgVar.run();
                    }
                }
                if (this.f30125i2 && !(ciVar instanceof mh.g4)) {
                    this.f30125i2 = false;
                    r7Var.d();
                    r7Var.invalidate();
                    u1();
                }
                if (i11 != 0 && j10 != 6 && !(ciVar instanceof mh.g4)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = 0;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                r7Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        ki kiVar;
        if (this.f30123i0 == null) {
            kiVar = this;
            jn jnVar = new jn(kiVar, getContext(), false, this.resourcesProvider, bool);
            kiVar.f30123i0 = jnVar;
            kiVar.f30154s0[1] = jnVar;
            jnVar.setDelegate(new tg(this, 15));
        } else {
            kiVar = this;
        }
        R1(kiVar.f30123i0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f10;
        float f11;
        ci ciVar;
        float f12;
        float f13;
        float f14;
        int i9;
        boolean z13;
        this.d.a(z10, z11);
        r7 r7Var = this.T0;
        if ((z10 && r7Var.getTag() == null) || (!z10 && r7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            r7Var.setTag(num);
            AnimatorSet animatorSet = this.U0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.U0 = null;
            }
            if (!this.B && !this.P0 && ((this.M0 != 0 || !this.f30134m1) && this.f30160u0 == this.f30114f0 && (this.H1 || this.I1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f30160u0 == this.P) {
                z12 = false;
            }
            mh mhVar = this.f30158t1;
            org.telegram.ui.ActionBar.w0 w0Var = this.W0;
            if (z10) {
                if (z12) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.O0 && this.f30178z0.getTag() == null) {
                mhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
            if (o2Var != null) {
                if (z10) {
                    if (this.f30108d2) {
                        i9 = org.telegram.ui.ActionBar.f6.f23295tg;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.f23072h5;
                    }
                    if (i0.a.f(getThemedColor(i9)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z13);
                } else {
                    AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
                }
            }
            float f15 = 0.6f;
            float f16 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.U0 = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f12 - r7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(r7Var, property, f13));
                if (z12) {
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property3, f15));
                }
                this.U0.playTogether(arrayList);
                this.U0.addListener(new u9(2, this, z10));
                this.U0.setInterpolator(gr.h);
                this.U0.setDuration(380L);
                this.U0.start();
                return;
            }
            if (z10 && this.O0 && ((ciVar = this.f30160u0) == null || ciVar.I())) {
                mhVar.setVisibility(4);
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            r7Var.setAlpha(f10);
            if (z12) {
                if (z10) {
                    f16 = 1.0f;
                }
                w0Var.setAlpha(f16);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                w0Var.setScaleX(f11);
                if (z10) {
                    f15 = 1.0f;
                }
                w0Var.setScaleY(f15);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f30097a1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.M0 != 0 || !this.f30134m1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.C0;
        qh qhVar = this.A0;
        qhVar.getLocationOnScreen(iArr);
        if (this.f30173x2 != null) {
            ci ciVar = this.f30160u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
            if ((ciVar == chatAttachAlertPhotoLayout || ciVar == this.m0) && this.Y) {
                fh.v vVar = this.K0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.f30173x2.getTop());
            } else {
                alpha = -qhVar.getHeight();
            }
            if (Math.abs(this.f30173x2.getTranslationY() - alpha) > 0.5f) {
                this.f30173x2.setTranslationY(alpha);
                this.f30173x2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.U();
                }
            }
        }
        g1();
    }

    public final void V1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f10;
        float f11;
        float f12;
        ci ciVar = this.f30160u0;
        int i9 = 0;
        if (ciVar == null) {
            g10 = false;
        } else {
            g10 = ciVar.g();
        }
        bh.e eVar = this.f30100b1;
        eVar.setEnabled(g10);
        ci ciVar2 = this.f30160u0;
        float f13 = 0.5f;
        if (ciVar2 != null) {
            if (ciVar2.g()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f30163v0 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.Z;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ci ciVar3 = this.f30163v0;
        if (ciVar3 != null) {
            if (ciVar3.g()) {
                f13 = 1.0f;
            }
            f10 = e2.c.z(1.0f, this.Z, f13, f10);
        }
        this.f30104c1 = f10;
        if (eVar != null) {
            float f14 = f10 * this.f30107d1;
            eVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i9 = 4;
            }
            eVar.setVisibility(i9);
        }
    }

    public final void X1(ci ciVar, int i9) {
        boolean z10;
        int i10;
        int i11;
        if (ciVar != null) {
            ig.e eVar = this.f30177y2;
            if (eVar != null && Build.VERSION.SDK_INT >= 31) {
                eVar.f(0.0f, i9);
                Z0();
            }
            int currentItemTop = ciVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (ciVar == this.f30160u0 && currentItemTop <= ciVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N = z10;
                if (ciVar == this.f30160u0) {
                    T1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ciVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.ll.D(11.0f, i10, currentItemTop);
                ci ciVar2 = this.f30160u0;
                if (ciVar2 == ciVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((ciVar2 instanceof hm) || (this.f30163v0 instanceof hm)) {
                    Object obj = this.f30144p1;
                    if ((obj instanceof o1.j) && ((o1.j) obj).f18794f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.X1;
                int i12 = iArr[i11];
                if (i12 == D && !z11) {
                    if (i9 != 0) {
                        this.Y1 = i12;
                        return;
                    }
                    return;
                }
                this.Y1 = i12;
                iArr[i11] = D;
                a2(i11);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f33121a.length() <= 0) {
            return;
        }
        this.f30160u0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        kh.v vVar;
        boolean z11;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
        if (chatAttachAlertPhotoLayout != null && (vVar = this.X0) != null) {
            int i9 = 0;
            if (this.f30134m1 && this.f30110e0 && this.f30160u0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.b0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.R();
            vVar.f16180f = z12;
            if (!z10) {
                ((y5) vVar.f16181g).a(z12);
            }
            vVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.Y0;
            if (z10 && this.f30134m1) {
                w0Var.setVisibility(0);
                ViewPropertyAnimator animate = w0Var.animate();
                if (z11) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z11) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(gr.h).withEndAction(new fh(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i9 = 8;
            }
            w0Var.setVisibility(i9);
            if (z11) {
                f12 = 1.0f;
            }
            w0Var.setAlpha(f12);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            w0Var.setScaleX(f10);
            if (z11) {
                f13 = 1.0f;
            }
            w0Var.setScaleY(f13);
        }
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.Z0():void");
    }

    public final void Z1(boolean z10) {
        boolean z11;
        float f10;
        ci ciVar = this.f30114f0;
        if (z10) {
            if (!this.I) {
                return;
            }
            if (this.m0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.b6 b6Var = this.f30149r;
                if (b6Var == null) {
                    b6Var = this.resourcesProvider;
                }
                ?? ciVar2 = new ci(context, b6Var, this);
                ciVar2.f29128y = 0.0f;
                ciVar2.A = 0.0f;
                ciVar2.B = 0.0f;
                ciVar2.C = 0.0f;
                ciVar2.D = 0.0f;
                ciVar2.E = 0.0f;
                ciVar2.F = null;
                ciVar2.G = false;
                ciVar2.I = 0.0f;
                ciVar2.M = false;
                ciVar2.O = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ciVar2.P = z11;
                ciVar2.f29123n = b6Var;
                ciVar2.f27496f = true;
                ciVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = ciVar2.f27493b.T0.n();
                TextView textView = new TextView(context);
                ciVar2.f29127x = textView;
                org.telegram.ui.ActionBar.b6 b6Var2 = ciVar2.f27492a;
                pl plVar = new pl(ciVar2, context, n10, b6Var2, 1);
                r7 r7Var = ciVar2.f27493b.T0;
                if (AndroidUtilities.isTablet()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                r7Var.addView(plVar, 0, g7.e6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                plVar.addView(textView, g7.e6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                gh.f1 f1Var = new gh.f1(ciVar2, context, b6Var2, 14);
                ciVar2.f29124r = f1Var;
                f1Var.setAdapter(new org.telegram.ui.v7(ciVar2, 3));
                f2.m0 m0Var = new f2.m0(1, false);
                ciVar2.f29125s = m0Var;
                f1Var.setLayoutManager(m0Var);
                f1Var.setClipChildren(false);
                f1Var.setClipToPadding(false);
                f1Var.setOverScrollMode(2);
                f1Var.setVerticalScrollBarEnabled(false);
                gm gmVar = new gm(ciVar2, context);
                ciVar2.v = gmVar;
                gmVar.setClipToPadding(true);
                gmVar.setClipChildren(true);
                ciVar2.addView(f1Var, g7.e6.c(-1.0f, -1));
                ciVar2.L = ciVar2.f27493b.f30114f0;
                gmVar.f28799c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar2.L;
                gmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                gmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                gmVar.c();
                UndoView undoView = new UndoView(context, null, false, ciVar2.f27493b.f30149r);
                ciVar2.f29126w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                ciVar2.addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                ciVar2.J = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.m0 = ciVar2;
                ciVar2.bringToFront();
            }
            ci ciVar3 = this.f30160u0;
            hm hmVar = this.m0;
            if (ciVar3 != hmVar) {
                ciVar = hmVar;
            }
            Q1(ciVar);
            return;
        }
        Q1(ciVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ChatActivityEnterView.H(this.F1, ((org.telegram.ui.qn) o2Var).a(), o2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i9 = 0;
        a2(0);
        this.f30138n1.invalidate();
        fh.v vVar = this.K0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
        if (chatAttachAlertPhotoLayout != null) {
            kl klVar = chatAttachAlertPhotoLayout.A;
            chatAttachAlertPhotoLayout.U();
            if (klVar != null && klVar.getFastScroll() != null) {
                fk0 fastScroll = klVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1;
                if (this.Y) {
                    i9 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.f28470d0 = currentActionBarHeight + i9;
                klVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        nh nhVar = this.f30161u1;
        if (nhVar == null) {
            return;
        }
        int childCount = nhVar.getChildCount();
        boolean z10 = false;
        for (int i19 = 0; i19 < childCount; i19++) {
            nhVar.getChildAt(i19);
        }
        boolean z11 = this.f30108d2;
        if (z11) {
            i9 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        this.f30115f1.setTextColor(getThemedColor(i9));
        if (z11) {
            i10 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        this.f30130k1.setTextColor(getThemedColor(i10));
        this.f30100b1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.w0 w0Var = this.W0;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z11) {
            i12 = org.telegram.ui.ActionBar.f6.f23100ig;
        } else {
            i12 = org.telegram.ui.ActionBar.f6.I5;
        }
        org.telegram.ui.ActionBar.f6.w1(getThemedColor(i12), background);
        int i20 = org.telegram.ui.ActionBar.f6.E8;
        w0Var.G(getThemedColor(i20), false);
        w0Var.G(getThemedColor(i20), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.f6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Y0;
        if (w0Var2 != null) {
            if (z11) {
                i18 = org.telegram.ui.ActionBar.f6.f23083hg;
            } else {
                i18 = org.telegram.ui.ActionBar.f6.f23108j5;
            }
            w0Var2.setIconColor(getThemedColor(i18));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f30097a1;
        if (w0Var3 != null) {
            if (z11) {
                i16 = org.telegram.ui.ActionBar.f6.f23083hg;
            } else {
                i16 = org.telegram.ui.ActionBar.f6.f23108j5;
            }
            w0Var3.setIconColor(getThemedColor(i16));
            Drawable background2 = w0Var3.getBackground();
            if (z11) {
                i17 = org.telegram.ui.ActionBar.f6.f23100ig;
            } else {
                i17 = org.telegram.ui.ActionBar.f6.I5;
            }
            org.telegram.ui.ActionBar.f6.w1(getThemedColor(i17), background2);
        }
        qh qhVar = this.A0;
        org.telegram.ui.ActionBar.b6 b6Var = qhVar.I;
        pt ptVar = qhVar.f33121a;
        int i21 = qhVar.H;
        if (i21 == 0) {
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
            int i22 = org.telegram.ui.ActionBar.f6.G6;
            ptVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i22, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i22, b6Var));
        } else if (i21 != 2 && i21 != 3) {
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23284t5, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        } else {
            ptVar.setHintTextColor(-1929379841);
            ptVar.setTextColor(-1);
            ptVar.setCursorColor(-1);
            ptVar.setHandlesColor(-1);
            ptVar.setHighlightColor(822083583);
            ptVar.quoteColor = -1;
        }
        qhVar.f33123c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
        qt qtVar = qhVar.d;
        if (qtVar != null) {
            qtVar.T();
        }
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        if (z11) {
            i13 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i13 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        int themedColor2 = getThemedColor(i13);
        r7 r7Var = this.T0;
        r7Var.C(themedColor2, false);
        if (z11) {
            i14 = org.telegram.ui.ActionBar.f6.f23100ig;
        } else {
            i14 = org.telegram.ui.ActionBar.f6.I5;
        }
        r7Var.A(getThemedColor(i14), false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i15 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        r7Var.setTitleColor(getThemedColor(i15));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.f6.w1(q12, this.shadowDrawable);
        ng.c cVar = this.B2;
        if (cVar.f18600a.getColor() != q12) {
            cVar.a(q12);
            rg.f fVar = this.f30151r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.f30155s1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i23 = 0;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i23 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i23];
            if (ciVar != null) {
                ciVar.d();
            }
            i23++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23091i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f30160u0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.f30133l2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.f30135m2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.reloadInlineHints && i9 != NotificationCenter.attachMenuBotsDidLoad && i9 != NotificationCenter.quickRepliesUpdated) {
            if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
                return;
            }
            return;
        }
        hi hiVar = this.f30168w1;
        if (hiVar != null) {
            hiVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        if (z10) {
            this.f30169w2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ii iiVar = this.V1;
        if (iiVar != null) {
            iiVar.t(new wg(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i9) {
        super.dismissWithButtonClick(i9);
        this.f30160u0.o(i9);
    }

    public final void e1() {
        float f10 = this.f30102c.f47775e;
        float f11 = (1.0f - this.f30098b.f47775e) * f10;
        this.f30155s1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.f47775e))), 1.0f - f11));
    }

    public final void f1() {
        float f10;
        float f11 = this.f30109e.f47775e;
        float f12 = this.f30113f.f47775e;
        float b10 = ff.m0.b(this.h.f47775e);
        if (this.N1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        j10.d(this.B0, e2.c.C(f11, f12, b10, f10));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        vh vhVar = this.E0;
        mh mhVar = this.D0;
        fh.v vVar = this.K0;
        if (vVar != null && vVar.getVisibility() == 0 && vVar.getAlpha() != 0.0f) {
            float f10 = this.f30098b.f47775e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
            vhVar.setAlpha(abs * abs * abs * abs);
            mhVar.setTranslationY(AndroidUtilities.lerp(this.f30105c2, ((vVar.getTranslationY() + vVar.getTop()) - mhVar.getTop()) + AndroidUtilities.dp(8.0f), gr.f28847j.getInterpolation(f10)));
            return;
        }
        mhVar.setTranslationY(this.f30105c2);
        vhVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i9 < ciVarArr.length) {
                ci ciVar = ciVarArr[i9];
                if (ciVar != null && (themeDescriptions = ciVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i9++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23091i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i9) {
        this.O0 = true;
        this.f30158t1.setVisibility(0);
        this.D = true;
        this.E = i9;
        this.M0 = 0;
        this.B = false;
        this.C = false;
        this.F = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f30118g1;
        if (w0Var != null) {
            this.f30115f1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(kh.b8 b8Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f30115f1;
        textView.setText(string);
        this.O0 = false;
        this.f30158t1.setVisibility(8);
        this.M0 = 1;
        this.B = true;
        this.C = true;
        this.f30110e0 = false;
        this.F = b8Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.f30118g1;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if ((o2Var instanceof org.telegram.ui.qn) && (messagePreviewParams = ((org.telegram.ui.qn) o2Var).f41857b5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).f41890e;
        }
        return MessagesController.getInstance(this.F1).getChat(Long.valueOf(-this.V));
    }

    public final float l1() {
        mh mhVar = this.f30178z0;
        float alpha = 1.0f - mhVar.getAlpha();
        return mhVar.getMeasuredHeight() - (alpha * (mhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ut m1() {
        ci ciVar;
        if (this.Y && ((ciVar = this.f30160u0) == this.f30114f0 || ciVar == this.m0)) {
            return this.L0;
        }
        return this.A0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).a();
        }
        return this.V;
    }

    public final int o1() {
        ci ciVar = this.f30160u0;
        jn jnVar = this.f30123i0;
        if (ciVar == jnVar && jnVar.A != null) {
            return jnVar.getEmojiPadding();
        }
        jn jnVar2 = this.f30126j0;
        if (ciVar == jnVar2 && jnVar2.A != null) {
            return jnVar2.getEmojiPadding();
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
        r7 r7Var = this.T0;
        if (r7Var.f23577j0) {
            r7Var.h(true);
        } else if (this.f30160u0.i()) {
        } else {
            if (m1() != null && m1().f33124e) {
                m1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f30160u0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
        i81 i81Var = chatAttachAlertPhotoLayout.f26260h0;
        fh.d2 d2Var = chatAttachAlertPhotoLayout.f26256f0;
        TextView textView = chatAttachAlertPhotoLayout.f26268l0;
        kl klVar = chatAttachAlertPhotoLayout.f26274r;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = AndroidUtilities.navigationBarHeight;
        if (view == d2Var) {
            if (z10) {
                if (klVar.getVisibility() == 0) {
                    d2Var.layout(0, org.telegram.messenger.l0.B(222.0f, i12, i15), i13, org.telegram.messenger.l0.B(96.0f, i12, i15));
                    return true;
                }
                d2Var.layout(0, org.telegram.messenger.l0.B(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (klVar.getVisibility() == 0) {
                d2Var.layout(org.telegram.messenger.l0.B(222.0f, i11, i15), 0, i11 - AndroidUtilities.dp(96.0f), i14 - i15);
                return true;
            } else {
                d2Var.layout(org.telegram.messenger.l0.B(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == i81Var) {
            if (z10) {
                if (klVar.getVisibility() == 0) {
                    i81Var.layout(0, org.telegram.messenger.l0.B(310.0f, i12, i15), i13, org.telegram.messenger.l0.B(260.0f, i12, i15));
                    return true;
                }
                i81Var.layout(0, org.telegram.messenger.l0.B(176.0f, i12, i15), i13, org.telegram.messenger.l0.B(126.0f, i12, i15));
                return true;
            } else if (klVar.getVisibility() == 0) {
                i81Var.layout(org.telegram.messenger.l0.B(310.0f, i11, i15), 0, i11 - AndroidUtilities.dp(260.0f), i14 - i15);
                return true;
            } else {
                i81Var.layout(org.telegram.messenger.l0.B(176.0f, i11, i15), 0, i11 - AndroidUtilities.dp(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i13 - textView.getMeasuredWidth()) / 2;
                int dp2 = i12 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (klVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i15;
            } else {
                dp = i11 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (klVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != klVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.l0.B(88.0f, i14, i15);
                view.layout(0, B, view.getMeasuredWidth(), view.getMeasuredHeight() + B);
                return true;
            }
            int dp3 = (i9 + i13) - AndroidUtilities.dp(88.0f);
            view.layout(dp3, 0, view.getMeasuredWidth() + dp3, view.getMeasuredHeight());
            return true;
        }
    }

    @Override
    public final boolean onCustomMeasure(View view, int i9, int i10) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
        yl ylVar = chatAttachAlertPhotoLayout.v;
        kl klVar = chatAttachAlertPhotoLayout.f26274r;
        of.y yVar = chatAttachAlertPhotoLayout.f26276s;
        if (i9 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ul ulVar = chatAttachAlertPhotoLayout.L;
        if (view == ulVar) {
            if (chatAttachAlertPhotoLayout.U && !chatAttachAlertPhotoLayout.W) {
                ulVar.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            fh.d2 d2Var = chatAttachAlertPhotoLayout.f26256f0;
            if (view == d2Var) {
                if (z10) {
                    d2Var.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                d2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            i81 i81Var = chatAttachAlertPhotoLayout.f26260h0;
            if (view == i81Var) {
                if (z10) {
                    i81Var.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                i81Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == klVar) {
                chatAttachAlertPhotoLayout.F0 = true;
                if (z10) {
                    klVar.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (yVar.f5432o != 0) {
                        klVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        yVar.j1(0);
                        ylVar.l();
                    }
                } else {
                    klVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (yVar.f5432o != 1) {
                        klVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        yVar.j1(1);
                        ylVar.l();
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
        int i9;
        this.f30114f0.setTranslationX(0.0f);
        this.f30127j1.setAlpha(0.0f);
        this.f30121h1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30135m2 = animatorSet;
        yh yhVar = this.f30131k2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, yhVar, 0.0f, 400.0f));
        this.f30135m2.setDuration(400L);
        this.f30135m2.setStartDelay(20L);
        yhVar.set(this, Float.valueOf(0.0f));
        this.f30135m2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ug(this, 2));
        o1.j jVar = this.f30133l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.f18783n, 0.0f);
        this.f30133l2 = jVar2;
        if (this.D1 != null) {
            jVar2.f18800u.a(0.75f);
            this.f30133l2.f18800u.b(350.0f);
        } else {
            jVar2.f18800u.a(0.75f);
            this.f30133l2.f18800u.b(350.0f);
        }
        this.f30133l2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.e3 e3Var = this.backDrawable;
        k6 k6Var = m6.d;
        if (this.dimBehind) {
            i9 = this.dimBehindAlpha;
        } else {
            i9 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(e3Var, k6Var, i9));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.e eVar = new org.telegram.messenger.video.e(this, animationNotificationsLocker, this.delegate, 16);
        this.f30133l2.a(new mh.c4(2, this, eVar));
        this.currentSheetAnimation.addListener(new fg.j(20, this, eVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new ug(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(gr.f28844f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f30160u0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (this.f30160u0.C(i9)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f30099b0 instanceof org.telegram.ui.qn) {
            int i9 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f30160u0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30141o1 = true;
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
            ((LaunchActivity) context).f35540x0.add(this.O);
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
            ((LaunchActivity) context).f35540x0.remove(this.O);
        }
    }

    public final int p1(int i9) {
        ci ciVar = this.f30163v0;
        int[] iArr = this.X1;
        if (ciVar != null && ((this.f30160u0 instanceof hm) || (ciVar instanceof hm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.Z);
        }
        return iArr[i9];
    }

    public final int q1(boolean z10) {
        boolean q10;
        int i9;
        r7 r7Var;
        if (this.f30108d2) {
            return getThemedColor(org.telegram.ui.ActionBar.f6.f23295tg);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        Iterator it = this.f30136n.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            long longValue = ((Long) eVar.f47783a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a2 = g7.n.a(f10, 0.0f, 1.0f);
        if (z10 && (r7Var = this.T0) != null && r7Var.getVisibility() == 0) {
            a2 *= 1.0f - r7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5);
        if (q10) {
            i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23091i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i9));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.r1():void");
    }

    public final boolean s1() {
        if (this.Y) {
            ci ciVar = this.f30160u0;
            if (ciVar == this.f30114f0 || ciVar == this.m0) {
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
        ci ciVar = this.f30160u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30114f0;
        if (ciVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f26255e1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.E1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            this.calcMandatoryInsets = ((org.telegram.ui.qn) o2Var).x9();
        }
        W1();
        this.f30141o1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f30125i2) {
            this.f30125i2 = false;
            r7 r7Var = this.T0;
            r7Var.d();
            r7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        ii iiVar = this.V1;
        if (iiVar != null && !this.f30147q1) {
            boolean j11 = iiVar.j();
            this.f30147q1 = true;
            gh.u5 u5Var = new gh.u5(this, editTextBoldCursor, z10, 15);
            if (j11) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(u5Var, j10);
        }
    }

    public final void u1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int q12 = q1(false);
            org.telegram.ui.ActionBar.f6.w1(q12, this.shadowDrawable);
            ng.c cVar = this.B2;
            if (cVar.f18600a.getColor() != q12) {
                cVar.a(q12);
                rg.f fVar = this.f30151r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                oh ohVar = this.f30155s1;
                if (ohVar != null) {
                    ohVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i9 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null) {
                ciVar.m();
            }
            i9++;
        }
        int i10 = this.F1;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.R = true;
        qh qhVar = this.A0;
        if (qhVar != null) {
            qhVar.o();
        }
        th thVar = this.L0;
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
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i9);
            i9++;
            if (tL_attachMenuBot2.bot_id == user.f22527id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        c2Var.P = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 22));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i9 < ciVarArr.length) {
                ci ciVar = ciVarArr[i9];
                if (ciVar != null) {
                    ciVar.x();
                }
                i9++;
            } else {
                this.f30101b2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i9 = 0;
        this.f30101b2 = false;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i9 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null) {
                ciVar.z();
            }
            i9++;
        }
        if (isShowing()) {
            this.V1.j();
        }
        hi hiVar = this.f30168w1;
        if (hiVar != null) {
            hiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.D1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        int i9 = this.F1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i9, this.D1.getDialogId()) && (o2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            MessageSuggestionParams messageSuggestionParams = qnVar.f41870c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.D1.messageOwner.suggested_post);
            }
            if (!gh.v7.U(i9, messageSuggestionParams.amount)) {
                qnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.G - this.H < 0) {
            AndroidUtilities.shakeView(this.f30153s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.E0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i9).premiumFeaturesBlocked() && MessagesController.getInstance(i9).captionLengthLimitPremium > this.H) {
                O1(o2Var);
                return;
            }
            return;
        }
        if (this.D1 == null && (o2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) o2Var;
            if (qnVar2.c()) {
                y4.M(getContext(), qnVar2.a(), new tg(this, 12), this.resourcesProvider);
                return;
            }
        }
        ci ciVar = this.f30160u0;
        if (ciVar != this.f30114f0 && ciVar != this.m0) {
            if (!ciVar.H(0, true, 0, s1(), this.J0)) {
                this.f30169w2 = true;
                dismiss();
                return;
            }
            return;
        }
        G1(0, true, 0, s1(), this.J0);
    }

    @Override
    public final void dismiss() {
        if (this.f30160u0.n() || isDismissed()) {
            return;
        }
        qh qhVar = this.A0;
        if (qhVar != null) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        th thVar = this.L0;
        if (thVar != null) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        this.f30157t0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.f30099b0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.f30169w2 && o2Var != null && this.f30160u0.getSelectedItemsCount() > 0 && !this.B) {
            if (this.f30165v2) {
                return;
            }
            this.f30165v2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new tg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.setOnCancelListener(new zg(this, 0));
            a1 a1Var = new a1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.J = a1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.f30154s0;
            if (i9 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null && this.f30160u0 != ciVar) {
                ciVar.n();
            }
            i9++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7), 0), true, (AndroidUtilities.IntColorCallback) new tg(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.f30112e2 = false;
        super.dismiss();
        this.f30169w2 = false;
    }

    @Override
    public final void B(float f10, int i9) {
    }

    public ki(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}
