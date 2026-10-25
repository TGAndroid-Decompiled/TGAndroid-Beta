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
import org.telegram.ui.ki1;
public class ti extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.d3, oe.d {
    public static final int N2 = 0;
    public final LongSparseArray A0;
    public final th A1;
    public boolean A2;
    public li B0;
    public final uh B1;
    public boolean B2;
    public li C0;
    public final s4.c0 C1;
    public File C2;
    public final eh.d D0;
    public final qi D1;
    public double[] D2;
    public final i0 E;
    public final eh.d E0;
    public boolean E1;
    public boolean E2;
    public boolean F;
    public final jg.k F0;
    public final RadialProgressView F1;
    public boolean F2;
    public boolean G;
    public final th G0;
    public boolean G1;
    public boolean G2;
    public boolean H;
    public final wh H0;
    public final s6 H1;
    public fi.i H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final ch.f I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final hh.c J2;
    public int K;
    public final th K0;
    public MessageObject K1;
    public final ch.b K2;
    public int L;
    public final bi L0;
    public boolean L1;
    public final ch.b L2;
    public boolean M;
    public final TextPaint M0;
    public final int M1;
    public final kh M2;
    public boolean N;
    public final RectF N0;
    public boolean N1;
    public boolean O;
    public final Paint O0;
    public boolean O1;
    public boolean P;
    public AnimatorSet P0;
    public boolean P1;
    public e50 Q;
    public long Q0;
    public boolean Q1;
    public boolean R;
    public final bh.p R0;
    public boolean R1;
    public final le0 S;
    public final yh S0;
    public boolean S1;
    public ho T;
    public int T0;
    public boolean T1;
    public g50 U;
    public au U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public ek X;
    public boolean X0;
    public boolean X1;
    public cj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean f33001a0;
    public final b8 f33002a1;
    public ValueAnimator a2;
    public final oe.b f33003b;
    public final ch.c f33004b0;
    public AnimatorSet f33005b1;
    public int f33006b2;
    public final oe.b f33007c;
    public boolean f33008c0;
    public AnimatorSet f33009c1;
    public ri f33010c2;
    public final oe.b d;
    public float f33011d0;
    public final org.telegram.ui.ActionBar.w0 f33012d1;
    public qn f33013d2;
    public final oe.b e;
    public final ei f33014e0;
    public final fi.u f33015e1;
    public final int[] f33016e2;
    public final oe.b f33017f;
    public final org.telegram.ui.ActionBar.r2 f33018f0;
    public final org.telegram.ui.ActionBar.w0 f33019f1;
    public int f33020f2;
    public final boolean f33021g0;
    public fi.v3 f33022g1;
    public float f33023g2;
    public final oe.b h;
    public mf f33024h0;
    public final org.telegram.ui.ActionBar.w0 f33025h1;
    public float f33026h2;
    public boolean f33027i0;
    public final ei.n f33028i1;
    public boolean f33029i2;
    public final ChatAttachAlertPhotoLayout f33030j0;
    public float f33031j1;
    public float f33032j2;
    public xj f33033k0;
    public float f33034k1;
    public final boolean f33035k2;
    public fj f33036l0;
    public final th l1;
    public boolean f33037l2;
    public go m0;
    public final TextView f33038m1;
    public final ArrayList f33039m2;
    public final oe.l f33040n;
    public go f33041n0;
    public final org.telegram.ui.ActionBar.w0 f33042n1;
    public final Rect f33043n2;
    public sl f33044o0;
    public final LinearLayout f33045o1;
    public float f33046o2;
    public nk f33047p0;
    public final ImageView f33048p1;
    public boolean f33049p2;
    public cn f33050q0;
    public final LinearLayout f33051q1;
    public int f33052q2;
    public org.telegram.ui.sn f33053r;
    public ij f33054r0;
    public final TextView f33055r1;
    public final ei f33056r2;
    public final s6 f33057s;
    public jg.i0 f33058s0;
    public float f33059s1;
    public o1.j f33060s2;
    public ok f33061t0;
    public boolean f33062t1;
    public AnimatorSet f33063t2;
    public ok f33064u0;
    public final gi f33065u1;
    public int f33066u2;
    public final s6 v;
    public li.q f33067v0;
    public boolean f33068v1;
    public int f33069v2;
    public final ImageView f33070w;
    public al f33071w0;
    public Object f33072w1;
    public boolean f33073w2;
    public final i0 f33074x;
    public boolean f33075x0;
    public boolean f33076x1;
    public boolean f33077x2;
    public final ImageView f33078y;
    public float f33079y0;
    public final lh.f f33080y1;
    public boolean f33081y2;
    public final li[] f33082z0;
    public final vh f33083z1;
    public nl f33084z2;

    public ti(Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        ei.n nVar;
        int i10;
        int i11;
        float f7;
        oe.l lVar;
        ds dsVar = ds.h;
        this.f33003b = new oe.b(0, this, dsVar, 380L, false);
        this.f33007c = new oe.b(1, this, dsVar, 380L, false);
        this.d = new oe.b(2, this, dsVar, 380L, false);
        this.e = new oe.b(3, this, dsVar, 380L, false);
        this.f33017f = new oe.b(4, this, dsVar, 380L, true);
        this.h = new oe.b(5, this, dsVar, 320L, false);
        oe.l lVar2 = new oe.l(new dh(this, 2), dsVar, 380L);
        this.f33040n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f33011d0 = 0.0f;
        this.f33014e0 = new ei(this, 0);
        this.f33027i0 = false;
        li[] liVarArr = new li[12];
        this.f33082z0 = liVarArr;
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
        int i12 = UserConfig.selectedAccount;
        this.M1 = i12;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.R1 = true;
        this.S1 = true;
        this.T1 = true;
        this.V1 = -1;
        this.W1 = true;
        this.f33006b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f33016e2 = new int[2];
        new Paint(1);
        this.f33037l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f33039m2 = arrayList;
        Rect rect = new Rect();
        this.f33043n2 = rect;
        this.f33056r2 = new ei(this, 1);
        this.f33077x2 = true;
        this.f33081y2 = false;
        this.F2 = false;
        this.G2 = false;
        this.occupyNavigationBarWithoutKeyboard = true;
        hh.c cVar = new hh.c();
        this.J2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
        this.glassEngine.A.add(new oi.o(cVar, new dh(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f();
            this.I2 = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(cVar);
            dVar.f12841f = cVar;
            dVar.d = fVar;
            dVar.e = -2;
            hh.d dVar2 = new hh.d(null);
            dVar2.f12841f = cVar;
            dVar2.d = fVar;
            dVar2.e = -3;
            ch.b bVar = new ch.b(dVar);
            this.K2 = bVar;
            bVar.f6303i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            bVar.f6299b = dp;
            bVar.f6300c = dp;
            ch.b bVar2 = new ch.b(dVar2);
            this.L2 = bVar2;
            bVar2.f6303i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            bVar2.f6299b = dp2;
            bVar2.f6300c = dp2;
        } else {
            this.I2 = null;
            this.K2 = new ch.b(cVar);
            this.L2 = new ch.b(cVar);
        }
        ch.b bVar3 = new ch.b(cVar);
        this.M2 = new kh(this, 0);
        this.f33035k2 = z10;
        this.f33021g0 = (r2Var instanceof org.telegram.ui.un) && r2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f33018f0 = r2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        gi giVar = new gi(this, context);
        this.f33065u1 = giVar;
        giVar.setDelegate(new hi(this));
        this.containerView = giVar;
        giVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        b8 b8Var = new b8(this, context, u6Var, 1);
        this.f33002a1 = b8Var;
        b8Var.U0 = true;
        b8Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        b8Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        int i14 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i14, u6Var);
        int i15 = org.telegram.ui.ActionBar.y6.I5;
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, i15, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i14, u6Var);
        b8Var.setOccupyStatusBar(true);
        b8Var.setAlpha(0.0f);
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 11));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, u6Var);
        this.f33012d1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new dh(this, 10));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 6, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
        w0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(w0Var2, g02, null, N, u6Var);
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, u6Var);
        this.f33019f1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        fi.u uVar = new fi.u();
        this.f33015e1 = uVar;
        w0Var3.setIcon(uVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 6, -1);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i15);
        w0Var3.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(w0Var3, g03, null, N3, u6Var);
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        ei.n nVar2 = new ei.n(this, context);
        org.telegram.ui.ActionBar.f7.V(nVar2, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        nVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        gb1.b(nVar2);
        this.f33028i1 = nVar2;
        d2();
        if (r2Var != null) {
            w0Var = w0Var3;
            i10 = i14;
            nVar = nVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, u6Var);
            this.f33025h1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i11 = -1;
            org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 6, -1);
            org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i15);
            w0Var4.setBackground(g04);
            org.telegram.ui.ActionBar.f7.k(w0Var4, g04, null, N4, u6Var);
            w0Var4.setOnClickListener(new di.g2(5, this, z11));
        } else {
            w0Var = w0Var3;
            nVar = nVar2;
            i10 = i14;
            i11 = -1;
            f7 = 14.0f;
        }
        int i16 = i10;
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i16), false, u6Var);
        this.f33042n1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 3, i11);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i15);
        w0Var5.setBackground(g05);
        org.telegram.ui.ActionBar.f7.k(w0Var5, g05, null, N5, u6Var);
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ti f29290b;

            {
                this.f29290b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.un unVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f29290b;
                        wh whVar = tiVar.H0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), u6Var);
                            e0Var.m0(whVar.getText());
                            e0Var.f27649j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar = tiVar.S0;
                                            yhVar.setText(charSequence);
                                            yhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            if (tiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.f27651l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f27652n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f29290b;
                        yh yhVar = tiVar2.S0;
                        if (yhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), u6Var);
                            e0Var2.m0(yhVar.getText());
                            e0Var2.f27649j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar2.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar2.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            if (tiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.f27651l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f27652n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f29290b;
                        tiVar3.f33042n1.U(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar3.f33018f0;
                        u12.M2(null, r2Var2, u6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i17 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i17;
                        u13.f35720n = z15;
                        if (!tiVar3.f33010c2.E()) {
                            AndroidUtilities.hideKeyboard(r2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w10 = fi.w7.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i18 = point.x;
                        int i19 = point.y;
                        if (i18 > 1080 || i19 > 1080) {
                            float min = Math.min(i18, i19) / 1080.0f;
                            i18 = (int) (i18 * min);
                            i19 = (int) (i19 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer u14 = PhotoViewer.u1();
                        ki kiVar = new ki(tiVar3, photoEntry);
                        if (r2Var2 instanceof org.telegram.ui.un) {
                            unVar = (org.telegram.ui.un) r2Var2;
                        } else {
                            unVar = null;
                        }
                        u14.i2(arrayList2, 0, 11, false, kiVar, unVar);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Y0(null, null, true, tiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        th thVar = new th(this, context, 0);
        this.l1 = thVar;
        thVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        thVar.setAlpha(0.0f);
        thVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33045o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f33038m1 = textView;
        org.telegram.messenger.t.r(textView, i16, u6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, gb1.u(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f33048p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(imageView, mutate, i16, u6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, gb1.x(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        thVar.addView(linearLayout, gb1.g(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33051q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.f7.y(imageView2, mutate2, i16, u6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, gb1.x(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f33055r1 = textView2;
        org.telegram.messenger.t.r(textView2, i16, u6Var, 1, 16.0f);
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, gb1.u(-2, -2, 16));
        thVar.addView(linearLayout2, gb1.g(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, u6Var);
        this.f33030j0 = chatAttachAlertPhotoLayout;
        liVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, gb1.g(-1.0f, -1));
        ?? view = new View(context);
        this.f33080y1 = view;
        view.setup(bVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, gb1.k());
        this.containerView.addView(thVar, gb1.h(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bh.p pVar = new bh.p(context, 10);
        this.R0 = pVar;
        this.containerView.addView(pVar, gb1.i(-1, -2, 55));
        this.containerView.addView(b8Var, gb1.g(-2.0f, -1));
        this.containerView.addView(w0Var2, gb1.i(48, 48, 53));
        this.containerView.addView(w0Var, gb1.h(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f33025h1;
        if (w0Var6 != null) {
            lVar = lVar2;
            this.containerView.addView(w0Var6, gb1.i(48, 48, 53));
        } else {
            lVar = lVar2;
        }
        thVar.addView(w0Var5, gb1.h(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(nVar, gb1.i(-2, 48, 53));
        th thVar2 = new th(this, context, 1);
        this.A1 = thVar2;
        uh uhVar = new uh(context, 0);
        this.B1 = uhVar;
        uhVar.setClipChildren(true);
        uhVar.setClipToPadding(false);
        qi qiVar = new qi(this, context);
        this.D1 = qiVar;
        uhVar.setAdapter(qiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.C1 = c0Var;
        uhVar.setLayoutManager(c0Var);
        uhVar.setVerticalScrollBarEnabled(false);
        uhVar.setHorizontalScrollBarEnabled(false);
        uhVar.setItemAnimator(null);
        uhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.f7.m(uhVar, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        uhVar.f30666y2 = true;
        uhVar.setOverScrollMode(2);
        ch.b bVar4 = this.K2;
        oi.q qVar = this.glassEngine;
        bVar4.h = qVar;
        this.L2.h = qVar;
        bVar3.h = qVar;
        vh vhVar = new vh(this, context, 0);
        this.f33083z1 = vhVar;
        ch.c cVar2 = new ch.c(bVar3.c(vhVar, null, false));
        this.f33004b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(vhVar, gb1.k());
        eh.d c10 = this.K2.c(thVar2, gh.c.f(u6Var), false);
        c10.x(AndroidUtilities.dp(28.0f));
        c10.w(AndroidUtilities.dp(7.0f));
        thVar2.setBackground(c10);
        uhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        uhVar.setClipToOutline(true);
        ag.v0 v0Var = ag.z0.f1400a;
        uhVar.setOutlineProvider(new ag.x0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        uhVar.setImportantForAccessibility(1);
        thVar2.addView(uhVar, gb1.k());
        this.containerView.addView(thVar2, gb1.i(-1, 70, 81));
        uhVar.setOnItemClickListener(new di.x4(9, this, u6Var));
        uhVar.setOnItemLongClickListener(new dh(this, 3));
        s6 s6Var = new s6(context, true, false, true);
        this.H1 = s6Var;
        s6Var.setVisibility(8);
        s6Var.setAlpha(0.0f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        s6Var.setPadding(dp3, 0, dp3, 0);
        s6Var.setTextSize(AndroidUtilities.dp(f7));
        s6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        this.containerView.addView(s6Var, gb1.i(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, gb1.h(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i17 = org.telegram.ui.ActionBar.y6.f23765z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView3, i17, u6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        th thVar3 = new th(this, context, 2);
        this.G0 = thVar3;
        jg.k kVar = new jg.k(this, context);
        this.F0 = kVar;
        thVar3.addView(kVar, gb1.i(-1, -1, 119));
        eh.d c11 = this.L2.c(giVar, gh.c.o(u6Var), false);
        this.D0 = c11;
        c11.E = true;
        c11.y(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.A(AndroidUtilities.dp(32.0f));
        c11.f9966x.f9953g = 0.4f;
        c11.t();
        eh.d c12 = this.K2.c(kVar, gh.c.o(u6Var), false);
        this.E0 = c12;
        c12.x(AndroidUtilities.dp(22.0f));
        c12.w(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        thVar3.setWillNotDraw(false);
        thVar3.setVisibility(4);
        thVar3.setAlpha(0.0f);
        this.containerView.addView(thVar3, gb1.i(-1, -2, 83));
        thVar3.setOnTouchListener(new ei.d(13));
        s6 s6Var2 = new s6(context, false, false, false);
        this.f33057s = s6Var2;
        s6Var2.setAllowCancel(true);
        s6Var2.setScaleProperty(0.6f);
        s6Var2.setVisibility(8);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i18 = org.telegram.ui.ActionBar.y6.f23746y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i18, u6Var);
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        kVar.addView(s6Var2, gb1.h(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f33070w = imageView4;
        i0 i0Var = new i0(context);
        this.f33074x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i19 = org.telegram.ui.ActionBar.y6.Wk;
        org.telegram.ui.ActionBar.f7.t(imageView4, i19, u6Var, mode);
        int i20 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i20), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i20);
        imageView4.setBackground(g06);
        org.telegram.ui.ActionBar.f7.k(imageView4, g06, null, N6, u6Var);
        kVar.addView(imageView4, gb1.h(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        gb1.b(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ti f29290b;

            {
                this.f29290b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.un unVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f29290b;
                        wh whVar = tiVar.H0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), u6Var);
                            e0Var.m0(whVar.getText());
                            e0Var.f27649j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            if (tiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.f27651l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f27652n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f29290b;
                        yh yhVar = tiVar2.S0;
                        if (yhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), u6Var);
                            e0Var2.m0(yhVar.getText());
                            e0Var2.f27649j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar2 = tiVar2.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar2.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            if (tiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.f27651l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f27652n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f29290b;
                        tiVar3.f33042n1.U(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar3.f33018f0;
                        u12.M2(null, r2Var2, u6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i172 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i172;
                        u13.f35720n = z15;
                        if (!tiVar3.f33010c2.E()) {
                            AndroidUtilities.hideKeyboard(r2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w10 = fi.w7.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i182 = point.x;
                        int i192 = point.y;
                        if (i182 > 1080 || i192 > 1080) {
                            float min = Math.min(i182, i192) / 1080.0f;
                            i182 = (int) (i182 * min);
                            i192 = (int) (i192 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i182, i192, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer u14 = PhotoViewer.u1();
                        ki kiVar = new ki(tiVar3, photoEntry);
                        if (r2Var2 instanceof org.telegram.ui.un) {
                            unVar = (org.telegram.ui.un) r2Var2;
                        } else {
                            unVar = null;
                        }
                        u14.i2(arrayList2, 0, 11, false, kiVar, unVar);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Y0(null, null, true, tiVar3.J);
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
        wh whVar = new wh(this, context, giVar, u6Var);
        this.H0 = whVar;
        whVar.J = true;
        whVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        whVar.s();
        whVar.getEditText().setLayoutParams(gb1.h(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        whVar.getEditText().addTextChangedListener(new xh(this, 0));
        kVar.addView(whVar, gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        kVar.setClipChildren(false);
        thVar3.setClipChildren(false);
        whVar.setClipChildren(false);
        pVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        pVar.setWillNotDraw(false);
        yh yhVar = new yh(this, context, giVar, u6Var);
        this.S0 = yhVar;
        yhVar.J = true;
        yhVar.getEditText().addTextChangedListener(new ai(this, r2Var));
        yhVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        yhVar.getEditText().setLayoutParams(gb1.h(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        yhVar.getEditText().setTextSize(1, 17.0f);
        yhVar.getEmojiButton().setLayoutParams(gb1.h(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        yhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        pVar.addView(yhVar, gb1.i(-1, -2, 119));
        pVar.setAlpha(0.0f);
        pVar.setVisibility(8);
        whVar.addView(imageView3, gb1.h(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        eh.d c13 = this.K2.c(pVar, gh.c.o(u6Var), false);
        c13.x(AndroidUtilities.dp(22.0f));
        c13.w(AndroidUtilities.dp(7.0f));
        pVar.setBackground(c13);
        pVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        s6 s6Var3 = new s6(context, false, false, false);
        this.v = s6Var3;
        s6Var3.setScaleProperty(0.6f);
        s6Var3.setVisibility(8);
        s6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var3, i18, u6Var);
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setGravity(17);
        s6Var3.setAllowCancel(true);
        pVar.addView(s6Var3, gb1.h(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.f7.t(imageView5, org.telegram.ui.ActionBar.y6.Xd, u6Var, mode2);
        yhVar.addView(imageView5, gb1.h(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f33078y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(imageView6, i19, u6Var, mode);
        org.telegram.ui.Cells.y g07 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i20), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.b7 N7 = org.telegram.ui.ActionBar.f7.N(i20);
        imageView6.setBackground(g07);
        org.telegram.ui.ActionBar.f7.k(imageView6, g07, null, N7, u6Var);
        pVar.addView(imageView6, gb1.h(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        gb1.b(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ti f29290b;

            {
                this.f29290b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.un unVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f29290b;
                        wh whVar2 = tiVar.H0;
                        if (whVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), u6Var);
                            e0Var.m0(whVar2.getText());
                            e0Var.f27649j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar22 = tiVar.H0;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar2 = tiVar.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            if (tiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.f27651l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f27652n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f29290b;
                        yh yhVar2 = tiVar2.S0;
                        if (yhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), u6Var);
                            e0Var2.m0(yhVar2.getText());
                            e0Var2.f27649j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            wh whVar22 = tiVar2.H0;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            yh yhVar22 = tiVar2.S0;
                                            yhVar22.setText(charSequence);
                                            yhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            if (tiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.f27651l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f27652n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f29290b;
                        tiVar3.f33042n1.U(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar3.f33018f0;
                        u12.M2(null, r2Var2, u6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i172 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i172;
                        u13.f35720n = z15;
                        if (!tiVar3.f33010c2.E()) {
                            AndroidUtilities.hideKeyboard(r2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w10 = fi.w7.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i182 = point.x;
                        int i192 = point.y;
                        if (i182 > 1080 || i192 > 1080) {
                            float min = Math.min(i182, i192) / 1080.0f;
                            i182 = (int) (i182 * min);
                            i192 = (int) (i192 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i182, i192, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer u14 = PhotoViewer.u1();
                        ki kiVar = new ki(tiVar3, photoEntry);
                        if (r2Var2 instanceof org.telegram.ui.un) {
                            unVar = (org.telegram.ui.un) r2Var2;
                        } else {
                            unVar = null;
                        }
                        u14.i2(arrayList2, 0, 11, false, kiVar, unVar);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Y0(null, null, true, tiVar3.J);
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
        th thVar4 = new th(this, context, 3);
        this.K0 = thVar4;
        thVar4.setFocusable(true);
        thVar4.setFocusableInTouchMode(true);
        thVar4.setVisibility(4);
        thVar4.setScaleX(0.2f);
        thVar4.setScaleY(0.2f);
        thVar4.setAlpha(0.0f);
        thVar4.setClipChildren(false);
        thVar4.setClipToPadding(false);
        this.containerView.addView(thVar4, gb1.i(110, 50, 85));
        bi biVar = new bi(R.drawable.send_plane_24, context, u6Var, this);
        this.L0 = biVar;
        biVar.setImportantForAccessibility(2);
        thVar4.addView(biVar, gb1.i(-1, -1, 119));
        biVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        biVar.I = dp4;
        biVar.J = dp5;
        biVar.M = AndroidUtilities.dp(7.0f);
        biVar.N = AndroidUtilities.dp(6.0f);
        biVar.f33654h0 = true;
        biVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f28966b;

            {
                this.f28966b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                hi.o4 o4Var;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f28966b;
                        if (tiVar.B0 != tiVar.f33050q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar.g2(z13);
                        return;
                    case 1:
                        ti tiVar2 = this.f28966b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f28966b;
                        boolean z14 = tiVar3.f33008c0;
                        if (!z14) {
                            tiVar3.N1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        ti tiVar4 = this.f28966b;
                        boolean z15 = tiVar4.f33008c0;
                        if (z15) {
                            tiVar4.N1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28966b.E1();
                        return;
                    case 5:
                        this.f28966b.f33012d1.U(null, null);
                        return;
                    case 6:
                        ti.p(this.f28966b);
                        return;
                    case 7:
                        li liVar = this.f28966b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            return;
                        }
                        return;
                    default:
                        this.f28966b.f33042n1.U(null, null);
                        return;
                }
            }
        });
        biVar.setOnLongClickListener(new org.telegram.ui.zf(this, context, u6Var, r2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        vh vhVar2 = new vh(this, context, 1);
        vhVar2.setAlpha(0.0f);
        vhVar2.setScaleX(0.2f);
        vhVar2.setScaleY(0.2f);
        if (z10) {
            h1();
            this.navBarColorKey = -1;
        }
        sl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ch.b bVar5 = this.K2;
        fh.e o10 = gh.c.o(u6Var);
        mm0 mm0Var = fastScroll.f32641p0;
        eh.d c14 = bVar5.c(mm0Var.f30624d1, o10, false);
        fastScroll.f32629e0 = c14;
        c14.w(AndroidUtilities.dp(4.0f));
        fastScroll.f32629e0.x(AndroidUtilities.dp(24.0f));
        eh.d c15 = bVar5.c(mm0Var.f30624d1, o10, false);
        fastScroll.f32631f0 = c15;
        c15.w(AndroidUtilities.dp(6.0f));
        fastScroll.f32631f0.A(AndroidUtilities.dp(4.0f));
        fastScroll.f32631f0.x(AndroidUtilities.dp(f7));
        le0 le0Var = new le0(context);
        this.S = le0Var;
        this.containerView.addView(le0Var, gb1.g(-1.0f, -1));
        fh.e eVar = new fh.e(u6Var);
        eVar.e = new dh(this, 5);
        eVar.f10483c = new dh(this, 6);
        eVar.d = new dh(this, 7);
        eVar.f10482b = new dh(this, 8);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        b8Var.I(this.K2, eVar, false);
        lVar.h(1L, false);
        this.glassEngine.i(this.containerView);
        oi.q qVar2 = this.glassEngine;
        qVar2.f19482a = new dh(this, 9);
        qVar2.d = new qi.b(AndroidUtilities.dp(48.0f));
    }

    public static void I(ti tiVar) {
        boolean z10;
        boolean q5;
        int i10;
        b8 b8Var = tiVar.f33002a1;
        lh.f fVar = tiVar.f33080y1;
        if (fVar != null && b8Var != null) {
            li liVar = tiVar.C0;
            if (liVar == null) {
                liVar = tiVar.B0;
            }
            int i11 = 0;
            if (liVar != null && (liVar instanceof al)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.u6 u6Var = tiVar.resourcesProvider;
            if (u6Var != null) {
                q5 = u6Var.a();
            } else {
                q5 = org.telegram.ui.ActionBar.y6.I.q();
            }
            if (!z10 && b8Var.getVisibility() == 0) {
                if (q5) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i11 = (int) (b8Var.getAlpha() * i10);
            }
            fVar.setFadeTopAlpha(i11);
        }
    }

    public static void K1(li liVar) {
        if (liVar != null) {
            int i10 = org.telegram.ui.ActionBar.f7.f22626b;
            Object tag = liVar.getTag(R.id.theme_generation);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
                return;
            }
            liVar.setTag(R.id.theme_generation, Integer.valueOf(i10));
            try {
                org.telegram.ui.ActionBar.f7.e0(liVar, true);
                liVar.d();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void M(ti tiVar) {
        fi.i iVar = new fi.i(tiVar, tiVar.getContext(), tiVar.Z, LaunchActivity.R(), tiVar.resourcesProvider, 1);
        tiVar.H2 = iVar;
        iVar.p(new jg.s0(tiVar, 18));
        ViewGroup viewGroup = tiVar.containerView;
        viewGroup.addView(tiVar.H2, viewGroup.indexOfChild(tiVar.G0), gb1.i(-1, -1, 83));
        fi.i iVar2 = tiVar.H2;
        iVar2.getAdapter().f14112c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
        boolean z10 = true;
        if (r2Var instanceof org.telegram.ui.un) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            ig.j1 adapter = iVar2.getAdapter();
            unVar.i();
            TLRPC.Chat chat = unVar.e;
            adapter.getClass();
            adapter.f14123l0 = chat;
            iVar2.getAdapter().W(unVar.f44322l8);
            ig.j1 adapter2 = iVar2.getAdapter();
            if (unVar.e == null) {
                z10 = false;
            }
            adapter2.f14115e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f14115e0 = false;
        }
        iVar2.getAdapter().f14117f0 = false;
        tiVar.b2();
    }

    public static void m(ti tiVar) {
        li liVar;
        cn cnVar;
        tiVar.f33072w1 = null;
        li liVar2 = tiVar.B0;
        if (liVar2 != tiVar.f33030j0 && (liVar = tiVar.C0) != (cnVar = tiVar.f33050q0) && liVar2 != liVar && liVar2 != cnVar) {
            tiVar.containerView.removeView(liVar2);
        }
        tiVar.B0.setVisibility(8);
        tiVar.B0.s();
        tiVar.C0.H();
        tiVar.B0 = tiVar.C0;
        tiVar.C0 = null;
        int[] iArr = tiVar.f33016e2;
        iArr[0] = iArr[1];
        tiVar.N1(tiVar.f33008c0, false);
        tiVar.d2();
    }

    public static void n(ti tiVar) {
        tiVar.currentSheetAnimation = null;
        tiVar.currentSheetAnimationType = 0;
        tiVar.dismissInternal();
    }

    public static int n0(ti tiVar) {
        li liVar = tiVar.B0;
        go goVar = tiVar.m0;
        if (liVar == goVar && goVar.E != null) {
            return goVar.getEmojiPadding();
        }
        go goVar2 = tiVar.f33041n0;
        if (liVar == goVar2 && goVar2.E != null) {
            return goVar2.getEmojiPadding();
        }
        if (tiVar.f33008c0) {
            return tiVar.S0.getEmojiPadding();
        }
        return tiVar.H0.getEmojiPadding();
    }

    public static void o(ti tiVar, boolean z10, gh ghVar) {
        Integer num;
        tiVar.B0.u(1.0f);
        tiVar.C0.u(1.0f);
        tiVar.B0.l(tiVar.f33046o2);
        tiVar.C0.l(tiVar.f33046o2);
        tiVar.glassEngine.g();
        tiVar.containerView.invalidate();
        b8 b8Var = tiVar.f33002a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        b8Var.setTag(num);
        ghVar.run();
    }

    public static void p(ti tiVar) {
        int i10;
        if (tiVar.f33030j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33030j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26015s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i11 = 0; i11 < chatAttachAlertPhotoLayout.E.getChildCount(); i11++) {
                            View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.x5) {
                                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                                if (x5Var.getPhotoEntry() == photoEntry) {
                                    x5Var.getImageView().invalidate();
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
        tiVar.f2(true);
        org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33019f1;
        fi.v3 v3Var = tiVar.f33022g1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = new fi.v3(tiVar.getContext(), 1);
        tiVar.f33022g1 = v3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        v3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        tiVar.f33022g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tiVar.f33022g1.m(1.0f, -((tiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        tiVar.f33022g1.setTranslationY(tiVar.f33012d1.getTranslationY());
        fi.v3 v3Var3 = tiVar.f33022g1;
        v3Var3.f11798l0 = new org.telegram.ui.ip(14, tiVar, v3Var2);
        tiVar.containerView.addView(v3Var3, gb1.h(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        tiVar.f33022g1.u();
    }

    public static void q(ti tiVar, int i10) {
        tiVar.navBarColorKey = -1;
        tiVar.navBarColor = i10;
        tiVar.containerView.invalidate();
    }

    public static void r(ti tiVar, ValueAnimator valueAnimator) {
        tiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.h3 h3Var = tiVar.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
    }

    public static void t(ti tiVar, org.telegram.ui.ActionBar.u6 u6Var, View view) {
        org.telegram.ui.ActionBar.r2 r2Var;
        int i10;
        uh uhVar = tiVar.B1;
        li[] liVarArr = tiVar.f33082z0;
        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f33018f0;
        if (r2Var2 == null) {
            r2Var = LaunchActivity.R();
        } else {
            r2Var = r2Var2;
        }
        if (r2Var != null && r2Var.getParentActivity() != null) {
            if (view instanceof ni) {
                Activity parentActivity = r2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (tiVar.O1 || tiVar.P1 || !tiVar.f1()) {
                        if (!tiVar.O1 && !tiVar.P1) {
                            ho hoVar = new ho(1, tiVar.getContext(), u6Var, tiVar);
                            tiVar.T = hoVar;
                            tiVar.X1(hoVar);
                        }
                        tiVar.X1(tiVar.f33030j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (tiVar.f33071w0 == null && (r2Var2 instanceof org.telegram.ui.un)) {
                        TLRPC.User i11 = ((org.telegram.ui.un) r2Var2).i();
                        if (x1(i11)) {
                            al alVar = new al(tiVar, tiVar.getContext(), tiVar.M1, i11, u6Var);
                            tiVar.f33071w0 = alVar;
                            liVarArr[11] = alVar;
                        }
                    }
                    li liVar = tiVar.f33071w0;
                    if (liVar != null) {
                        tiVar.X1(liVar);
                    }
                } else if (i10 == 3) {
                    if (tiVar.Q1 || !tiVar.f1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        tiVar.G1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (tiVar.N1 || !tiVar.f1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        tiVar.J1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (tiVar.T1 || !tiVar.f1()) {
                        if (tiVar.T1 && tiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        tiVar.I1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((tiVar.T1 || !tiVar.f1()) && AndroidUtilities.isMapsInstalled(r2Var2)) {
                        if (!tiVar.T1) {
                            ho hoVar2 = new ho(6, tiVar.getContext(), u6Var, tiVar);
                            tiVar.T = hoVar2;
                            tiVar.X1(hoVar2);
                        } else {
                            if (tiVar.f33044o0 == null) {
                                Context context = tiVar.getContext();
                                if (tiVar.H || tiVar.U1) {
                                    z10 = false;
                                }
                                sl slVar = new sl(tiVar, context, u6Var, z10);
                                tiVar.f33044o0 = slVar;
                                liVarArr[5] = slVar;
                                nl nlVar = tiVar.f33084z2;
                                if (nlVar != null) {
                                    slVar.setDelegate(nlVar);
                                } else {
                                    slVar.setDelegate(new dh(tiVar, 12));
                                }
                            }
                            tiVar.X1(tiVar.f33044o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (tiVar.R1 || !tiVar.f1()) {
                        if (!tiVar.R1) {
                            ho hoVar3 = new ho(9, tiVar.getContext(), u6Var, tiVar);
                            tiVar.T = hoVar3;
                            tiVar.X1(hoVar3);
                        } else {
                            tiVar.Z1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (tiVar.f33058s0 == null) {
                        jg.i0 i0Var = new jg.i0(tiVar.getContext(), tiVar.resourcesProvider, tiVar);
                        tiVar.f33058s0 = i0Var;
                        liVarArr[7] = i0Var;
                        i0Var.setupBlurredSearchField(tiVar.K2);
                    }
                    tiVar.X1(tiVar.f33058s0);
                } else if (i10 == 12) {
                    if (tiVar.S1 || !tiVar.f1()) {
                        if (!tiVar.S1) {
                            ho hoVar4 = new ho(9, tiVar.getContext(), u6Var, tiVar);
                            tiVar.T = hoVar4;
                            tiVar.X1(hoVar4);
                        } else {
                            if (tiVar.f33041n0 == null) {
                                go goVar = new go(tiVar, tiVar.getContext(), true, u6Var, null);
                                tiVar.f33041n0 = goVar;
                                liVarArr[1] = goVar;
                                goVar.setDelegate(new dh(tiVar, 13));
                            }
                            tiVar.X1(tiVar.f33041n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (tiVar.f33064u0 == null) {
                        ok okVar = new ok(tiVar, tiVar.getContext(), u6Var, true);
                        tiVar.f33064u0 = okVar;
                        liVarArr[8] = okVar;
                        okVar.setDelegate(tiVar.f33013d2);
                    }
                    tiVar.X1(tiVar.f33064u0);
                } else if (i10 == 14) {
                    if (tiVar.f33061t0 == null) {
                        ok okVar2 = new ok(tiVar, tiVar.getContext(), u6Var, false);
                        tiVar.f33061t0 = okVar2;
                        liVarArr[9] = okVar2;
                        okVar2.setDelegate(tiVar.f33013d2);
                    }
                    tiVar.X1(tiVar.f33061t0);
                } else if (i10 == 16) {
                    if (tiVar.f33067v0 == null) {
                        li.q qVar = new li.q(tiVar.M1, tiVar.getContext(), u6Var, tiVar);
                        tiVar.f33067v0 = qVar;
                        liVarArr[10] = qVar;
                    }
                    tiVar.X1(tiVar.f33067v0);
                } else if (view.getTag() instanceof Integer) {
                    tiVar.f33010c2.p0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, tiVar.w1(), false, 0L);
                }
            } else if (view instanceof mi) {
                mi miVar = (mi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = miVar.f30589c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        ki1.a(tiVar.getContext(), new li.s2(24, tiVar, miVar), null);
                    } else {
                        tiVar.U1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    tiVar.f33010c2.Y(miVar.f30588b);
                    tiVar.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                uhVar.w0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > uhVar.getMeasuredWidth()) {
                uhVar.w0(i13 - uhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void u(ti tiVar, int i10) {
        ch.f fVar = tiVar.I2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (a8.pf.a(i10, 4)) {
                qi.a e = tiVar.glassEngine.e();
                e.b(tiVar.containerView.getY(), tiVar.containerView.getWidth(), tiVar.containerView.getY() + tiVar.containerView.getHeight());
                fVar.h(e);
            }
            fVar.e(tiVar.M2, tiVar.containerView.getWidth(), tiVar.containerView.getHeight());
        }
    }

    public static void v(ti tiVar) {
        o1.j jVar = tiVar.f33060s2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(tiVar.containerView, o1.h.f18953n, 0.0f);
        tiVar.f33060s2 = jVar2;
        jVar2.f18969u.a(1.5f);
        tiVar.f33060s2.f18969u.b(1500.0f);
        tiVar.f33060s2.h();
    }

    public static void w(ti tiVar, kg kgVar) {
        AnimatorSet animatorSet = tiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            kgVar.run();
        }
    }

    public static void x(ti tiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.d3 d3Var) {
        tiVar.currentSheetAnimation = null;
        tiVar.f33060s2 = null;
        animationNotificationsLocker.unlock();
        tiVar.currentSheetAnimationType = 0;
        if (d3Var != null) {
            d3Var.onOpenAnimationEnd();
        }
        if (tiVar.useHardwareLayer) {
            tiVar.container.setLayerType(0, null);
        }
        if (tiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = tiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            tiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static boolean x1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f22174id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f22174id != 489000 && !MessagesController.isSupportUser(user)) {
            return true;
        }
        return false;
    }

    public static boolean y(org.telegram.ui.Components.ti r45, android.content.Context r46, org.telegram.ui.ActionBar.u6 r47, org.telegram.ui.ActionBar.r2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.y(org.telegram.ui.Components.ti, android.content.Context, org.telegram.ui.ActionBar.u6, org.telegram.ui.ActionBar.r2, android.view.View):boolean");
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.o();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        wh whVar = this.H0;
        if (whVar != null) {
            whVar.o();
        }
        yh yhVar = this.S0;
        if (yhVar != null) {
            yhVar.o();
        }
    }

    public final void B1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
            if (tL_attachMenuBot2.bot_id == user.f22174id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        e2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 24));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.p();
    }

    public final void C1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (liVar != null) {
                    liVar.A();
                }
                i10++;
            } else {
                this.f33029i2 = true;
                return;
            }
        }
    }

    public final void D1() {
        int i10 = 0;
        this.f33029i2 = false;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.C();
            }
            i10++;
        }
        if (isShowing()) {
            this.f33010c2.E();
        }
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        li liVar;
        int i11;
        if (i10 == 0) {
            l1();
            j1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            j1();
            go goVar = this.m0;
            if (goVar != null && ((liVar = this.C0) == goVar || this.B0 == goVar)) {
                if (liVar == goVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                h2(i11);
            }
            go goVar2 = this.f33041n0;
            if (goVar2 != null) {
                li liVar2 = this.C0;
                if (liVar2 == goVar2 || this.B0 == goVar2) {
                    if (liVar2 != goVar2) {
                        i12 = 0;
                    }
                    h2(i12);
                }
            }
        } else if (i10 == 1) {
            j1();
        } else if (i10 == 3) {
            k1();
        } else if (i10 == 4) {
            k1();
        } else if (i10 == 5) {
            k1();
            bi biVar = this.L0;
            if (biVar != null) {
                biVar.setEphemeralFactor(f7);
                biVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void E1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (r2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            MessageSuggestionParams messageSuggestionParams = unVar.f44407s5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!bi.ca.U(i10, messageSuggestionParams.amount)) {
                unVar.fc(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f33057s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.L0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                V1(r2Var);
                return;
            }
            return;
        }
        if (this.K1 == null && (r2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar2 = (org.telegram.ui.un) r2Var;
            if (unVar2.c()) {
                g5.L(getContext(), unVar2.a(), new dh(this, 14), this.resourcesProvider);
                return;
            }
        }
        li liVar = this.B0;
        if (liVar != this.f33030j0 && liVar != this.f33050q0) {
            if (!liVar.K(0, true, 0, w1(), this.Q0)) {
                this.G2 = true;
                dismiss();
                return;
            }
            return;
        }
        M1(0, true, 0, w1(), this.Q0);
    }

    public final void F1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (i10 == 3) {
            if (this.Q1 || !f1()) {
                if (r2Var != null) {
                    activity = r2Var.getParentActivity();
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
                G1(true);
            }
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(r2Var)) {
            if (this.f33044o0 == null) {
                sl slVar = new sl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f33044o0 = slVar;
                this.f33082z0[5] = slVar;
                nl nlVar = this.f33084z2;
                if (nlVar != null) {
                    slVar.setDelegate(nlVar);
                } else if (r2Var instanceof org.telegram.ui.un) {
                    slVar.setDelegate(new dh(this, 18));
                }
            }
            X1(this.f33044o0);
        }
    }

    public final void G1(boolean z10) {
        if (!this.Q1 && z10) {
            ho hoVar = new ho(3, getContext(), this.resourcesProvider, this);
            this.T = hoVar;
            X1(hoVar);
        }
        int i10 = 1;
        if (this.f33036l0 == null) {
            fj fjVar = new fj(getContext(), this.resourcesProvider, this);
            this.f33036l0 = fjVar;
            this.f33082z0[3] = fjVar;
            fjVar.setupBlurredSearchField(this.K2);
            this.f33036l0.setDelegate(new dh(this, 15));
            if (this.H) {
                this.f33036l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) r2Var).e;
            fj fjVar2 = this.f33036l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            fjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            X1(this.f33036l0);
        }
    }

    public final void H1() {
        if (this.f33054r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
            ?? liVar = new li(context, u6Var, this);
            liVar.f29296r = AndroidUtilities.dp(80.0f);
            liVar.f29298w = 3;
            bi.r1 r1Var = new bi.r1(liVar, context, u6Var, 12);
            liVar.f29295n = r1Var;
            za zaVar = new za(liVar, context);
            liVar.v = zaVar;
            r1Var.setAdapter(zaVar);
            r1Var.setClipToPadding(false);
            r1Var.setItemAnimator(null);
            r1Var.setLayoutAnimation(null);
            r1Var.setVerticalScrollBarEnabled(false);
            org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
            liVar.addView(r1Var, gb1.g(-1.0f, -1));
            r1Var.setOnScrollListener(new ai.b(liVar, 26));
            ei.k kVar = new ei.k(liVar, liVar.f29296r, 1);
            liVar.f29297s = kVar;
            kVar.O = new ai.l(liVar, 4);
            r1Var.setLayoutManager(kVar);
            this.f33054r0 = liVar;
            liVar.setDelegate(new gb(this, 1));
        }
        X1(this.f33054r0);
    }

    public final void I1() {
        boolean z10;
        if (!this.T1) {
            ho hoVar = new ho(5, getContext(), this.resourcesProvider, this);
            this.T = hoVar;
            X1(hoVar);
        }
        if (this.f33033k0 == null) {
            xj xjVar = new xj(getContext(), this.resourcesProvider, this);
            this.f33033k0 = xjVar;
            this.f33082z0[2] = xjVar;
            xjVar.setupBlurredSearchField(this.K2);
            this.f33033k0.setDelegate(new ci(this));
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) r2Var).e;
            xj xjVar2 = this.f33033k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            xjVar2.setMultipleSelectionAllowed(z10);
        }
        X1(this.f33033k0);
    }

    public final void J1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            ho hoVar = new ho(4, getContext(), this.resourcesProvider, this);
            this.T = hoVar;
            X1(hoVar);
        }
        boolean z11 = false;
        if (this.f33047p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            nk nkVar = new nk(i10, getContext(), this.resourcesProvider, this);
            this.f33047p0 = nkVar;
            this.f33082z0[4] = nkVar;
            nkVar.setDelegate(new di(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f33047p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
            if (r2Var instanceof org.telegram.ui.un) {
                TLRPC.Chat chat = ((org.telegram.ui.un) r2Var).e;
                nk nkVar2 = this.f33047p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                nkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f33047p0.setMaxSelectedFiles(this.V1);
                nk nkVar3 = this.f33047p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                nkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        nk nkVar4 = this.f33047p0;
        nkVar4.f31028d0 = this.N;
        if (z10) {
            X1(nkVar4);
        }
    }

    public final void L1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        b8 b8Var = this.f33002a1;
        int i10 = 1;
        if (b8Var.f22772n0) {
            b8Var.g(true);
        }
        this.f33033k0 = null;
        this.f33058s0 = null;
        this.f33036l0 = null;
        this.m0 = null;
        this.f33041n0 = null;
        this.f33044o0 = null;
        this.f33047p0 = null;
        this.f33071w0 = null;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.o();
                this.containerView.removeView(liVarArr[i10]);
                liVarArr[i10] = null;
            }
            i10++;
        }
        a2(false, false);
        super.dismissInternal();
        if (this.f33075x0) {
            this.f33075x0 = false;
            this.f33079y0 = 0.0f;
            org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
            if (r2Var != null && r2Var.getFragmentView() != null) {
                View fragmentView = r2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f47105a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean M1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            TLRPC.Chat chat = unVar.e;
            if (unVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.M1).edit();
                edit.putBoolean("silent_" + unVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (g1(r1().getText())) {
            return true;
        }
        e1();
        if (this.h.f19327f) {
            this.L1 = true;
            this.f33010c2.p0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long s12 = s1();
        li liVar = this.B0;
        if (liVar != null) {
            i12 = liVar.getSelectedItemsCount();
        }
        return g5.a0(this.M1, s12, o1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ti tiVar = ti.this;
                tiVar.L1 = true;
                tiVar.f33010c2.p0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void N1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f33003b.a(z10, z11);
        ru r12 = r1();
        this.f33008c0 = z10;
        ru r13 = r1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        li liVar = this.B0;
        if (liVar != this.f33030j0 && liVar != this.f33050q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f33008c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        bh.p pVar = this.R0;
        jg.k kVar = this.F0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            pVar.setVisibility(i12);
            ViewPropertyAnimator animate = pVar.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).setUpdateListener(new eh(this, 0)).withEndAction(new Runnable(this) {
                public final ti f28188b;

                {
                    this.f28188b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f28188b;
                            if (!z14 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.i2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f28188b.F0.setVisibility(8);
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
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            translationY.alpha(f11).setDuration(320L).setInterpolator(dsVar).setUpdateListener(new eh(this, 1)).withEndAction(new Runnable(this) {
                public final ti f28188b;

                {
                    this.f28188b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f28188b;
                            if (!z14 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.i2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f28188b.F0.setVisibility(8);
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
            pVar.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            pVar.setAlpha(f7);
            i2();
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            kVar.setAlpha(f11);
            if (z14 || !z12) {
                f12 = kVar.getMeasuredHeight();
            }
            kVar.setTranslationY(f12);
            if (z14 || !z12) {
                i11 = 8;
            }
            kVar.setVisibility(i11);
        }
        if (r12 != r13) {
            r12.k(true);
            r13.setText(c6.cloneSpans(r12.getText()));
            r13.getEditText().setAllowTextEntitiesIntersection(r12.getEditText().getAllowTextEntitiesIntersection());
            if (r12.getEditText().isFocused()) {
                r13.getEditText().requestFocus();
                r13.getEditText().setSelection(r12.getEditText().getSelectionStart(), r12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new gh(this, 0));
    }

    public final void O1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f33030j0) != null) {
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
        c2(0);
    }

    public final void P1(float f7) {
        int i10;
        float translationY = this.containerView.getTranslationY() - this.f33079y0;
        this.f33079y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        al alVar = this.f33071w0;
        if (alVar != null) {
            alVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        j3Var.setAlpha(i10);
        this.navigationBarAlpha = 1.0f - f7;
        getContainer().invalidate();
    }

    public final void Q1(int i10, boolean z10) {
        if (this.K1 != null) {
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
    }

    public final void R1(float f7) {
        boolean z10 = false;
        int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = o10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void S1(String str) {
        boolean z10 = true;
        this.T0 = 1;
        this.F = true;
        this.V0 = false;
        this.P1 = false;
        this.A1.setVisibility(8);
        this.f33038m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
        if (chatAttachAlertPhotoLayout != null) {
            ti tiVar = chatAttachAlertPhotoLayout.f30213b;
            if (tiVar.T0 == 0 || tiVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f26031g1 = z10;
        }
    }

    public final void T1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.T1(boolean):void");
    }

    public final void U1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.U1(long, java.lang.String, boolean, boolean):void");
    }

    public final void V1(org.telegram.ui.ActionBar.r2 r2Var) {
        if ((r2Var instanceof org.telegram.ui.un) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.un) r2Var).e)) {
            new wc(this.f33065u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new org.telegram.ui.ip(15, this, r2Var)).j();
        }
    }

    public final boolean W1(boolean z10, boolean z11) {
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
        li liVar;
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
        this.f33007c.a(z10, true);
        th thVar = this.G0;
        if (thVar.getTag() != null) {
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
        thVar.setTag(num);
        wh whVar = this.H0;
        if (whVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(whVar.getEditText());
        }
        whVar.k(true);
        this.S0.k(true);
        th thVar2 = this.A1;
        th thVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                thVar.setVisibility(0);
            }
            thVar3.setVisibility(0);
        } else if (this.V0) {
            thVar2.setVisibility(0);
        }
        li liVar2 = this.B0;
        if ((liVar2 == this.f33030j0 || liVar2 == this.f33050q0) && this.f33008c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        b8 b8Var2 = this.f33002a1;
        bh.p pVar = this.R0;
        jg.k kVar = this.F0;
        bi biVar = this.L0;
        float f28 = 1.0f;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z13) {
                pVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(kVar, property, f20));
            if (z10 && !z13) {
                kVar.setVisibility(0);
                b8Var = b8Var2;
                arrayList.add(ObjectAnimator.ofFloat(kVar, View.TRANSLATION_Y, 0.0f));
            } else {
                b8Var = b8Var2;
            }
            if (z10 && z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(pVar, property, f21));
            Property property2 = View.SCALE_X;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(thVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(biVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(biVar, property3, f26));
            if (b8Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(thVar, property4, dp2));
            } else if (this.V0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = AndroidUtilities.dp(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(thVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(thVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eh(this, 5));
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
            thVar.setAlpha(f7);
            if (z10 && z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                kVar.setVisibility(0);
                f11 = 0.0f;
                kVar.setTranslationY(0.0f);
            } else {
                f11 = 0.0f;
                i10 = 0;
            }
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            thVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            thVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            thVar3.setAlpha(f14);
            if (z10 && z13) {
                i11 = i10;
            } else {
                i11 = 8;
            }
            pVar.setVisibility(i11);
            if (z10 && z13) {
                f15 = 1.0f;
            } else {
                f15 = f11;
            }
            pVar.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            biVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            biVar.setScaleY(f17);
            if (b8Var2.getTag() != null) {
                if (z10) {
                    dp = f11;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                thVar.setTranslationY(dp);
            } else if (this.V0 && ((liVar = this.B0) == null || liVar.L())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = f11;
                }
                thVar2.setTranslationY(f18);
            }
            if (!z10) {
                thVar.setVisibility(4);
                thVar3.setVisibility(4);
            }
            if (z13) {
                i2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        biVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(s1());
        }
        biVar.i(o1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) whVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), biVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            whVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void X1(li liVar) {
        long j10 = this.Z0;
        ho hoVar = this.T;
        if (liVar == hoVar) {
            j10 = hoVar.f29030s;
        } else if (liVar == this.f33030j0) {
            j10 = 1;
        } else if (liVar == this.f33036l0) {
            j10 = 3;
        } else if (liVar == this.f33047p0) {
            j10 = 4;
        } else if (liVar == this.f33033k0) {
            j10 = 5;
        } else if (liVar == this.f33044o0) {
            j10 = 6;
        } else if (liVar == this.m0) {
            j10 = 9;
        } else if (liVar == this.f33054r0) {
            j10 = 10;
        } else if (liVar == this.f33058s0) {
            j10 = 11;
        } else if (liVar == this.f33041n0) {
            j10 = 12;
        } else if (liVar == this.f33061t0) {
            j10 = 14;
        } else if (liVar == this.f33064u0) {
            j10 = 13;
        } else if (liVar == this.f33067v0) {
            j10 = 16;
        } else if (liVar == this.f33071w0) {
            j10 = 17;
        }
        Y1(liVar, j10, true);
    }

    public final void Y1(li liVar, long j10, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        pm pmVar;
        boolean z12;
        Integer num;
        pm pmVar2;
        int i12;
        int dp;
        int i13;
        int dp2;
        Float f7;
        int i14;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f33072w1 == null && this.P0 == null) {
            li liVar2 = this.B0;
            if (liVar2 == liVar) {
                liVar2.J();
            } else if (liVar == this.f33041n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new tg.y0(this.f33018f0, 39, false).show();
            } else {
                int i15 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f33017f.a(z11, z10);
                this.f33040n.h(Long.valueOf(j10), z10);
                this.G1 = false;
                this.E1 = false;
                this.I1 = 0.0f;
                this.H1.setVisibility(8);
                RadialProgressView radialProgressView = this.F1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                th thVar = this.A1;
                thVar.setAlpha(1.0f);
                thVar.setTranslationY(this.I1);
                int i16 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.A0;
                    if (i16 >= longSparseArray.size()) {
                        break;
                    }
                    ((hi.o4) longSparseArray.valueAt(i16)).setMeasureOffsetY(0);
                    i16++;
                }
                this.Z0 = j10;
                uh uhVar = this.B1;
                int childCount = uhVar.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = uhVar.getChildAt(i17);
                    if (childAt instanceof ni) {
                        ni niVar = (ni) childAt;
                        i14 = childCount;
                        f7 = valueOf;
                        if (niVar.f30982b == niVar.f30983c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar.f31305a.f(z13, true);
                    } else {
                        f7 = valueOf;
                        i14 = childCount;
                        if (childAt instanceof mi) {
                            ((mi) childAt).a(true);
                        }
                    }
                    i17++;
                    childCount = i14;
                    valueOf = f7;
                }
                Float f10 = valueOf;
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f33016e2[0];
                this.C0 = liVar;
                boolean e = liVar.e();
                lh.f fVar = this.f33080y1;
                if (fVar != null) {
                    if (e) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                vh vhVar = this.f33083z1;
                if (vhVar != null) {
                    if (e) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    vhVar.setVisibility(i13);
                }
                if (this.C0.i() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                b8 b8Var = this.f33002a1;
                b8Var.setVisibility(i10);
                if (b8Var.f22772n0) {
                    b8Var.g(true);
                }
                this.B0.t();
                li liVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
                if (liVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.G(this.B0);
                this.C0.setVisibility(0);
                if (liVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                if (this.C0.getParent() != this.containerView) {
                    K1(this.C0);
                    ViewGroup viewGroup = this.containerView;
                    li liVar4 = this.C0;
                    if (liVar4 != this.f33044o0) {
                        indexOfChild++;
                    }
                    i11 = 0;
                    viewGroup.addView(liVar4, indexOfChild, gb1.g(-1.0f, -1));
                } else {
                    i11 = 0;
                }
                gh ghVar = new gh(this, 4);
                li liVar5 = this.B0;
                boolean z14 = liVar5 instanceof cn;
                ei eiVar = this.f33014e0;
                if (!z14 && !(this.C0 instanceof cn)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.C0.setAlpha(0.0f);
                        this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                        li liVar6 = this.B0;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[i11] = AndroidUtilities.dp(78.0f) + firstOffset;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liVar6, property, fArr);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, eiVar, 0.0f, 1.0f);
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
                        animatorSet.setInterpolator(ds.f27584f);
                        animatorSet.addListener(new bi.x4(this, firstOffset, ghVar, 1));
                        this.f33072w1 = animatorSet;
                        eiVar.set(this.B0, f10);
                        animatorSet.start();
                    } else {
                        liVar5.setAlpha(0.0f);
                        ghVar.run();
                        h2(i11);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                    li liVar7 = this.C0;
                    if (liVar7 instanceof cn) {
                        liVar7.setTranslationX(max);
                        li liVar8 = this.B0;
                        if ((liVar8 instanceof ChatAttachAlertPhotoLayout) && (pmVar2 = ((ChatAttachAlertPhotoLayout) liVar8).P) != null) {
                            pmVar2.setVisibility(4);
                        }
                    } else {
                        this.B0.setTranslationX(-max);
                        li liVar9 = this.C0;
                        if (liVar9 == chatAttachAlertPhotoLayout && (pmVar = ((ChatAttachAlertPhotoLayout) liVar9).P) != null) {
                            pmVar.setVisibility(0);
                        }
                    }
                    this.C0.setAlpha(1.0f);
                    this.B0.setAlpha(1.0f);
                    if (z10) {
                        eiVar.set(this.B0, f10);
                        AndroidUtilities.runOnUIThread(new kg(this, liVar, ghVar, 2));
                    } else {
                        if (this.C0.getCurrentItemTop() <= liVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B0.u(1.0f);
                        this.C0.u(1.0f);
                        this.B0.l(this.f33046o2);
                        this.C0.l(this.f33046o2);
                        this.containerView.invalidate();
                        this.glassEngine.g();
                        eiVar.set(this.B0, Float.valueOf(1.0f));
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        b8Var.setTag(num);
                        ghVar.run();
                    }
                }
                if (this.f33049p2 && !(liVar instanceof hi.o4)) {
                    i12 = 0;
                    this.f33049p2 = false;
                    b8Var.updateColors();
                    b8Var.invalidate();
                    z1();
                } else {
                    i12 = 0;
                }
                if (i15 != 0 && j10 != 6 && j10 != 17 && !(liVar instanceof hi.o4)) {
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

    public final void Z1(boolean z10, Boolean bool) {
        ti tiVar;
        if (this.m0 == null) {
            tiVar = this;
            go goVar = new go(tiVar, getContext(), false, this.resourcesProvider, bool);
            tiVar.m0 = goVar;
            tiVar.f33082z0[1] = goVar;
            goVar.setDelegate(new dh(this, 17));
        } else {
            tiVar = this;
        }
        Y1(tiVar.m0, 9L, z10);
    }

    public final void a2(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        li liVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        b8 b8Var = this.f33002a1;
        if ((z10 && b8Var.getTag() == null) || (!z10 && b8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            b8Var.setTag(num);
            AnimatorSet animatorSet = this.f33005b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f33005b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f33062t1) && this.B0 == this.f33030j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            th thVar = this.A1;
            org.telegram.ui.ActionBar.w0 w0Var = this.f33012d1;
            if (z10) {
                if (z12) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                thVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
            if (r2Var != null) {
                if (z10) {
                    if (this.f33035k2) {
                        i10 = org.telegram.ui.ActionBar.y6.f23661tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23425h5;
                    }
                    if (i0.a.h(getThemedColor(i10)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z13);
                } else {
                    AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
                }
            }
            float f14 = 0.6f;
            float f15 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33005b1 = animatorSet2;
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
                ofFloat.addUpdateListener(new eh(this, 4));
                arrayList.add(ofFloat);
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
                this.f33005b1.playTogether(arrayList);
                this.f33005b1.addListener(new org.telegram.ui.jo(3, this, z10));
                this.f33005b1.setInterpolator(ds.h);
                this.f33005b1.setDuration(380L);
                this.f33005b1.start();
                return;
            }
            if (z10 && this.V0 && ((liVar = this.B0) == null || liVar.L())) {
                thVar.setVisibility(4);
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
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f33025h1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f33062t1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void b2() {
        float alpha;
        int[] iArr = this.J0;
        wh whVar = this.H0;
        whVar.getLocationOnScreen(iArr);
        if (this.H2 != null) {
            li liVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
            if ((liVar == chatAttachAlertPhotoLayout || liVar == this.f33050q0) && this.f33008c0) {
                bh.p pVar = this.R0;
                alpha = (pVar.getAlpha() * pVar.getMeasuredHeight()) + (pVar.getY() - this.H2.getTop());
            } else {
                alpha = -whVar.getHeight();
            }
            if (Math.abs(this.H2.getTranslationY() - alpha) > 0.5f) {
                this.H2.setTranslationY(alpha);
                this.H2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        l1();
    }

    public final void c2(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.c2(int):void");
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
            o1.j jVar = this.f33060s2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.f33063t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d2() {
        boolean h;
        float f7;
        float f10;
        float f11;
        li liVar = this.B0;
        int i10 = 0;
        if (liVar == null) {
            h = false;
        } else {
            h = liVar.h();
        }
        ei.n nVar = this.f33028i1;
        nVar.setEnabled(h);
        li liVar2 = this.B0;
        float f12 = 0.5f;
        if (liVar2 != null) {
            if (liVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.C0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f33011d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        li liVar3 = this.C0;
        if (liVar3 != null) {
            if (liVar3.h()) {
                f12 = 1.0f;
            }
            f7 = c3.h0.z(1.0f, this.f33011d0, f12, f7);
        }
        this.f33031j1 = f7;
        if (nVar != null) {
            float f13 = f7 * this.f33034k1;
            nVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            nVar.setVisibility(i10);
        }
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
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        if (z10) {
            this.G2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ri riVar = this.f33010c2;
        if (riVar != null) {
            riVar.A(new gh(this, 3));
        } else {
            L1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.q(i10);
    }

    public final void e1() {
        if (r1().f32323a.length() <= 0) {
            return;
        }
        this.B0.a(r1().getText());
    }

    public final void e2(li liVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (liVar != null) {
            ch.f fVar = this.I2;
            if (fVar != null && Build.VERSION.SDK_INT >= 31) {
                fVar.f(0.0f, i10);
            }
            int currentItemTop = liVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (liVar == this.B0 && currentItemTop <= liVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (liVar == this.B0) {
                    a2(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int w10 = org.telegram.ui.d3.w(11.0f, i11, currentItemTop);
                li liVar2 = this.B0;
                if (liVar2 == liVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((liVar2 instanceof cn) || (this.C0 instanceof cn)) {
                    Object obj = this.f33072w1;
                    if ((obj instanceof o1.j) && ((o1.j) obj).f18963f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f33016e2;
                int i13 = iArr[i12];
                if (i13 == w10 && !z11) {
                    if (i10 != 0) {
                        this.f33020f2 = i13;
                        return;
                    }
                    return;
                }
                this.f33020f2 = i13;
                iArr[i12] = w10;
                h2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final boolean f1() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).R6()) {
            return true;
        }
        return false;
    }

    public final void f2(boolean z10) {
        fi.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f33015e1) != null) {
            int i10 = 0;
            if (this.f33062t1 && this.f33027i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f11731f = z12;
            if (!z10) {
                ((h6) uVar.f11732g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.f33019f1;
            if (z10 && this.f33062t1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(ds.h).withEndAction(new nh(this, z11, 0)).start();
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

    @Override
    public final boolean g() {
        return true;
    }

    public final boolean g1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            return ChatActivityEnterView.D(this.M1, ((org.telegram.ui.un) r2Var).a(), r2Var, charSequence);
        }
        return false;
    }

    public final void g2(boolean z10) {
        boolean z11;
        float f7;
        li liVar = this.f33030j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f33050q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.u6 u6Var = this.f33053r;
                if (u6Var == null) {
                    u6Var = this.resourcesProvider;
                }
                ?? liVar2 = new li(context, u6Var, this);
                liVar2.f27203y = 0.0f;
                liVar2.E = 0.0f;
                liVar2.F = 0.0f;
                liVar2.G = 0.0f;
                liVar2.H = 0.0f;
                liVar2.I = 0.0f;
                liVar2.J = null;
                liVar2.K = false;
                liVar2.M = 0.0f;
                liVar2.Q = false;
                liVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                liVar2.T = z11;
                liVar2.f27198n = u6Var;
                liVar2.f30215f = true;
                liVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z l4 = liVar2.f30213b.f33002a1.l();
                TextView textView = new TextView(context);
                liVar2.f27202x = textView;
                org.telegram.ui.ActionBar.u6 u6Var2 = liVar2.f30212a;
                km kmVar = new km(liVar2, context, l4, u6Var2, 1);
                b8 b8Var = liVar2.f30213b.f33002a1;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                b8Var.addView(kmVar, 0, gb1.h(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var2);
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                kmVar.addView(textView, gb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.r1 r1Var = new bi.r1(liVar2, context, u6Var2, 15);
                liVar2.f27199r = r1Var;
                r1Var.setAdapter(new org.telegram.ui.c8(liVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                liVar2.f27200s = c0Var;
                r1Var.setLayoutManager(c0Var);
                r1Var.setClipChildren(false);
                r1Var.setClipToPadding(false);
                r1Var.setOverScrollMode(2);
                r1Var.setVerticalScrollBarEnabled(false);
                bn bnVar = new bn(liVar2, context);
                liVar2.v = bnVar;
                bnVar.setClipToPadding(true);
                bnVar.setClipChildren(true);
                liVar2.addView(r1Var, gb1.g(-1.0f, -1));
                liVar2.P = liVar2.f30213b.f33030j0;
                bnVar.f26906c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.P;
                bnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                bnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                bnVar.c();
                UndoView undoView = new UndoView(context, null, false, liVar2.f30213b.f33053r);
                liVar2.f27201w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                liVar2.addView(undoView, gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                liVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f33050q0 = liVar2;
                liVar2.bringToFront();
            }
            li liVar3 = this.B0;
            cn cnVar = this.f33050q0;
            if (liVar3 != cnVar) {
                liVar = cnVar;
            }
            X1(liVar);
            return;
        }
        X1(liVar);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (liVar != null && (themeDescriptions = liVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.container, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23445i5));
                return arrayList;
            }
        }
    }

    public final void h1() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        uh uhVar = this.B1;
        if (uhVar == null) {
            return;
        }
        int childCount = uhVar.getChildCount();
        boolean z11 = false;
        for (int i18 = 0; i18 < childCount; i18++) {
            uhVar.getChildAt(i18);
        }
        boolean z12 = this.f33035k2;
        if (z12) {
            i10 = org.telegram.ui.ActionBar.y6.f23436hg;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23462j5;
        }
        org.telegram.ui.ActionBar.f7.V(this.f33038m1, i10, this.resourcesProvider);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.y6.f23436hg;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23462j5;
        }
        org.telegram.ui.ActionBar.f7.V(this.f33055r1, i11, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.V(this.f33028i1, org.telegram.ui.ActionBar.y6.Sh, this.resourcesProvider);
        if (z12) {
            i12 = org.telegram.ui.ActionBar.y6.f23436hg;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.f23462j5;
        }
        int themedColor = getThemedColor(i12);
        if (this.f33073w2 && themedColor == this.f33069v2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f33073w2 = true;
        this.f33069v2 = themedColor;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33012d1;
        if (z10) {
            w0Var.setIconColor(themedColor);
        }
        Drawable background = w0Var.getBackground();
        if (z12) {
            i13 = org.telegram.ui.ActionBar.y6.f23453ig;
        } else {
            i13 = org.telegram.ui.ActionBar.y6.I5;
        }
        org.telegram.ui.ActionBar.y6.z1(getThemedColor(i13), background);
        int i19 = org.telegram.ui.ActionBar.y6.E8;
        w0Var.O(getThemedColor(i19), false);
        w0Var.O(getThemedColor(i19), true);
        w0Var.H(getThemedColor(org.telegram.ui.ActionBar.y6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33019f1;
        if (w0Var2 != null && z10) {
            w0Var2.setIconColor(themedColor);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f33025h1;
        if (w0Var3 != null) {
            if (z10) {
                w0Var3.setIconColor(themedColor);
            }
            Drawable background2 = w0Var3.getBackground();
            if (z12) {
                i17 = org.telegram.ui.ActionBar.y6.f23453ig;
            } else {
                i17 = org.telegram.ui.ActionBar.y6.I5;
            }
            org.telegram.ui.ActionBar.y6.z1(getThemedColor(i17), background2);
        }
        wh whVar = this.H0;
        org.telegram.ui.ActionBar.u6 u6Var = whVar.M;
        mu muVar = whVar.f32323a;
        int i20 = whVar.L;
        if (i20 == 0) {
            muVar.setHintTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.H6, u6Var));
            int i21 = org.telegram.ui.ActionBar.y6.G6;
            muVar.setCursorColor(org.telegram.ui.ActionBar.y6.w0(i21, u6Var));
            muVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(i21, u6Var));
        } else if (i20 != 2 && i20 != 3) {
            muVar.setHintTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23651t5, u6Var));
            muVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23462j5, u6Var));
        } else {
            muVar.setHintTextColor(-1929379841);
            muVar.setTextColor(-1);
            muVar.setCursorColor(-1);
            muVar.setHandlesColor(-1);
            muVar.setHighlightColor(822083583);
            muVar.quoteColor = -1;
        }
        whVar.f32325c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Xd, u6Var), PorterDuff.Mode.MULTIPLY));
        nu nuVar = whVar.d;
        if (nuVar != null) {
            nuVar.updateColors();
        }
        org.telegram.ui.ActionBar.f7.m(uhVar, 21, org.telegram.ui.ActionBar.y6.A5, this.resourcesProvider);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.y6.f23436hg;
        } else {
            i14 = org.telegram.ui.ActionBar.y6.f23462j5;
        }
        org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
        b8 b8Var = this.f33002a1;
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i14, u6Var2);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.y6.f23453ig;
        } else {
            i15 = org.telegram.ui.ActionBar.y6.I5;
        }
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, i15, this.resourcesProvider);
        if (z12) {
            i16 = org.telegram.ui.ActionBar.y6.f23436hg;
        } else {
            i16 = org.telegram.ui.ActionBar.y6.f23462j5;
        }
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i16, this.resourcesProvider);
        int u12 = u1(false);
        org.telegram.ui.ActionBar.y6.z1(u12, this.shadowDrawable);
        hh.c cVar = this.J2;
        if (cVar.f12837b != u12) {
            cVar.a(u12);
            lh.f fVar = this.f33080y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            vh vhVar = this.f33083z1;
            if (vhVar != null) {
                vhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i22 = 0;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i22 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i22];
            if (liVar != null) {
                liVar.d();
            }
            i22++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23445i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z11 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z11);
            return;
        }
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23425h5);
    }

    public final void h2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.h2(int):void");
    }

    public final void i1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.i1(boolean):void");
    }

    public final void i2() {
        int i10 = 0;
        h2(0);
        this.f33065u1.invalidate();
        bh.p pVar = this.R0;
        pVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
        if (chatAttachAlertPhotoLayout != null) {
            fm fmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (fmVar != null && fmVar.getFastScroll() != null) {
                sl0 fastScroll = fmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f26048p1;
                if (this.f33008c0) {
                    i10 = (int) (pVar.getAlpha() * pVar.getMeasuredHeight());
                }
                fastScroll.f32633h0 = currentActionBarHeight + i10;
                fmVar.getFastScroll().invalidate();
            }
        }
        b2();
        l1();
    }

    public final void j1() {
        float f7 = this.f33007c.e;
        float f10 = (1.0f - this.f33003b.e) * f7;
        this.f33083z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void k1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f33017f.e;
        float a2 = a8.v0.a(this.h.e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        j20.d(this.I0, c3.h0.E(f10, f11, a2, f7));
    }

    public final void l1() {
        bi biVar = this.L0;
        th thVar = this.K0;
        bh.p pVar = this.R0;
        if (pVar != null && pVar.getVisibility() == 0 && pVar.getAlpha() != 0.0f) {
            float f7 = this.f33003b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            biVar.setAlpha(abs * abs * abs * abs);
            thVar.setTranslationY(AndroidUtilities.lerp(this.f33032j2, ((pVar.getTranslationY() + pVar.getTop()) - thVar.getTop()) + AndroidUtilities.dp(8.0f), ds.f27587j.getInterpolation(f7)));
            return;
        }
        thVar.setTranslationY(this.f33032j2);
        biVar.setAlpha(1.0f);
    }

    public final void m1(int i10) {
        this.V0 = true;
        this.A1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.T0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33042n1;
        if (w0Var != null) {
            this.f33038m1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void n1(hi.e2 e2Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f33038m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f33027i0 = false;
        this.J = e2Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33042n1;
        if (w0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            w0Var.setVisibility(0);
            w0Var.setClickable(true);
            w0Var.setAlpha(1.0f);
            w0Var.setScaleX(1.0f);
            w0Var.setScaleY(1.0f);
        }
    }

    public final int o1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if ((r2Var instanceof org.telegram.ui.un) && (messagePreviewParams = ((org.telegram.ui.un) r2Var).f44394r5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
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
        b8 b8Var = this.f33002a1;
        if (b8Var.f22772n0) {
            b8Var.g(true);
        } else if (this.B0.j()) {
        } else {
            if (r1() != null && r1().e) {
                r1().k(true);
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var != null) {
            AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final al alVar = this.f33071w0;
        if (alVar != null && this.B0 == alVar) {
            final gh ghVar = new gh(this, 1);
            int i10 = alVar.f26531n;
            org.telegram.ui.Wallet.h9 h9Var = alVar.R;
            ti tiVar = alVar.f30213b;
            AnimatorSet animatorSet = null;
            if (!alVar.K && (wallettransaction = alVar.P0) != null && alVar.Q0 == null && alVar.R0 == null) {
                if (alVar.S0) {
                    org.telegram.ui.Wallet.m5 m5Var = new org.telegram.ui.Wallet.m5();
                    m5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
                    if (r2Var != null && r2Var.presentFragment(m5Var, false, true)) {
                        org.telegram.ui.Wallet.v9 v9Var = new org.telegram.ui.Wallet.v9(tiVar.getContainer(), tiVar.getSheetContainer(), h9Var.getDiamondView(), m5Var, alVar.P0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!alVar.K) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!alVar.K) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, tiVar);
                        alVar.R0 = v9Var;
                        animatorSet = v9Var.f37393m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.l6 diamondView = h9Var.getDiamondView();
                    if (diamondView.f36851f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f33018f0;
                        if (r2Var2 instanceof org.telegram.ui.un) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                            if (unVar.getCurrentAccount() == i10 && unVar.a() == alVar.f26536r.f22174id && unVar.f44221d4 == 0 && unVar.getFragmentView() != null && unVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.d6 d6Var = new org.telegram.ui.Wallet.d6(tiVar.getContainer(), tiVar.getSheetContainer(), h9Var.getDiamondView(), unVar, alVar.P0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!alVar.K) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!alVar.K) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, tiVar);
                                alVar.Q0 = d6Var;
                                animatorSet = d6Var.f36470m;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
        fc1 fc1Var = chatAttachAlertPhotoLayout.f26040l0;
        bh.r rVar = chatAttachAlertPhotoLayout.f26036j0;
        TextView textView = chatAttachAlertPhotoLayout.f26047p0;
        fm fmVar = chatAttachAlertPhotoLayout.f26050r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == rVar) {
            if (z10) {
                if (fmVar.getVisibility() == 0) {
                    rVar.layout(0, org.telegram.messenger.t.C(222.0f, i13, i16), i14, org.telegram.messenger.t.C(96.0f, i13, i16));
                    return true;
                }
                rVar.layout(0, org.telegram.messenger.t.C(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (fmVar.getVisibility() == 0) {
                rVar.layout(org.telegram.messenger.t.C(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                rVar.layout(org.telegram.messenger.t.C(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == fc1Var) {
            if (z10) {
                if (fmVar.getVisibility() == 0) {
                    fc1Var.layout(0, org.telegram.messenger.t.C(310.0f, i13, i16), i14, org.telegram.messenger.t.C(260.0f, i13, i16));
                    return true;
                }
                fc1Var.layout(0, org.telegram.messenger.t.C(176.0f, i13, i16), i14, org.telegram.messenger.t.C(126.0f, i13, i16));
                return true;
            } else if (fmVar.getVisibility() == 0) {
                fc1Var.layout(org.telegram.messenger.t.C(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                fc1Var.layout(org.telegram.messenger.t.C(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (fmVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (fmVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != fmVar) {
            return false;
        } else {
            if (z10) {
                int C = org.telegram.messenger.t.C(88.0f, i15, i16);
                view.layout(0, C, view.getMeasuredWidth(), view.getMeasuredHeight() + C);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
        tm tmVar = chatAttachAlertPhotoLayout.v;
        fm fmVar = chatAttachAlertPhotoLayout.f26050r;
        ig.a0 a0Var = chatAttachAlertPhotoLayout.f26052s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        pm pmVar = chatAttachAlertPhotoLayout.P;
        if (view == pmVar) {
            if (chatAttachAlertPhotoLayout.f26020b0 && !chatAttachAlertPhotoLayout.f26024d0) {
                pmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            bh.r rVar = chatAttachAlertPhotoLayout.f26036j0;
            if (view == rVar) {
                if (z10) {
                    rVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                rVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            fc1 fc1Var = chatAttachAlertPhotoLayout.f26040l0;
            if (view == fc1Var) {
                if (z10) {
                    fc1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                fc1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == fmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    fmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f47705o != 0) {
                        fmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.k1(0);
                        tmVar.l();
                    }
                } else {
                    fmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f47705o != 1) {
                        fmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.k1(1);
                        tmVar.l();
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
        this.f33030j0.setTranslationX(0.0f);
        this.f33051q1.setAlpha(0.0f);
        this.f33045o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33063t2 = animatorSet;
        ei eiVar = this.f33056r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, eiVar, 0.0f, 400.0f));
        this.f33063t2.setDuration(400L);
        this.f33063t2.setStartDelay(20L);
        eiVar.set(this, Float.valueOf(0.0f));
        this.f33063t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new eh(this, 2));
        o1.j jVar = this.f33060s2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.f18953n, 0.0f);
        this.f33060s2 = jVar2;
        if (this.K1 != null) {
            jVar2.f18969u.a(0.75f);
            this.f33060s2.f18969u.b(350.0f);
        } else {
            jVar2.f18969u.a(0.75f);
            this.f33060s2.f18969u.b(350.0f);
        }
        this.f33060s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.j3 j3Var = this.backDrawable;
        t6 t6Var = v6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(j3Var, t6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        kg kgVar = new kg(this, animationNotificationsLocker, this.delegate, 3);
        this.f33060s2.a(new hi.k4(2, this, kgVar));
        this.currentSheetAnimation.addListener(new bi.ce(23, this, kgVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        R1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(ds.f27584f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.B0.r()) {
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
        if (this.f33018f0 instanceof org.telegram.ui.un) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.w();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f33068v1 = true;
        if (!this.P1 && !this.O1) {
            f1();
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
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            h1();
            ch.c cVar = this.f33004b0;
            if (cVar != null) {
                cVar.updateColors();
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23462j5);
            org.telegram.ui.ActionBar.w0 w0Var = this.f33042n1;
            if (w0Var != null && themedColor != this.f33066u2) {
                this.f33066u2 = themedColor;
                w0Var.setIconColor(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final TLRPC.Chat p1() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) r2Var).e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float q1() {
        th thVar = this.G0;
        float alpha = 1.0f - thVar.getAlpha();
        return thVar.getMeasuredHeight() - (alpha * (thVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ru r1() {
        li liVar;
        if (this.f33008c0 && ((liVar = this.B0) == this.f33030j0 || liVar == this.f33050q0)) {
            return this.S0;
        }
        return this.H0;
    }

    public final long s1() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) r2Var).a();
        }
        return this.Z;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        li liVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33030j0;
        if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f26035i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var instanceof org.telegram.ui.un) {
            this.calcMandatoryInsets = ((org.telegram.ui.un) r2Var).F9();
        }
        d2();
        this.f33068v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7), 0);
            this.navBarColor = o10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f33049p2) {
            this.f33049p2 = false;
            b8 b8Var = this.f33002a1;
            b8Var.updateColors();
            b8Var.invalidate();
            z1();
        }
    }

    public final int t1(int i10) {
        li liVar = this.C0;
        int[] iArr = this.f33016e2;
        if (liVar != null && ((this.B0 instanceof cn) || (liVar instanceof cn))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f33011d0);
        }
        return iArr[i10];
    }

    public final int u1(boolean z10) {
        boolean q5;
        int i10;
        b8 b8Var;
        if (this.f33035k2) {
            return getThemedColor(org.telegram.ui.ActionBar.y6.f23661tg);
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        Iterator it = this.f33040n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            long longValue = ((Long) gVar.f19337a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = a8.ee.a(f7, 0.0f, 1.0f);
        if (z10 && (b8Var = this.f33002a1) != null && b8Var.getVisibility() == 0) {
            a2 *= 1.0f - b8Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
        if (q5) {
            i10 = org.telegram.ui.ActionBar.y6.f23297a7;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23445i5;
        }
        return i0.a.f(a2, themedColor, getThemedColor(i10));
    }

    public final void v1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.v1():void");
    }

    public final boolean w1() {
        if (this.f33008c0) {
            li liVar = this.B0;
            if (liVar == this.f33030j0 || liVar == this.f33050q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        ri riVar = this.f33010c2;
        if (riVar != null && !this.f33076x1) {
            boolean E = riVar.E();
            this.f33076x1 = true;
            bi.u7 u7Var = new bi.u7(this, editTextBoldCursor, z10, 19);
            if (E) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(u7Var, j10);
        }
    }

    public final void z1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int u12 = u1(false);
            org.telegram.ui.ActionBar.y6.z1(u12, this.shadowDrawable);
            hh.c cVar = this.J2;
            if (cVar.f12837b != u12) {
                cVar.a(u12);
                lh.f fVar = this.f33080y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                vh vhVar = this.f33083z1;
                if (vhVar != null) {
                    vhVar.invalidate();
                }
            }
            d2();
            this.containerView.invalidate();
        }
    }

    @Override
    public final void dismiss() {
        yh yhVar;
        wh whVar;
        if (this.B0.p() || isDismissed()) {
            return;
        }
        li liVar = this.B0;
        al alVar = this.f33071w0;
        boolean z10 = (liVar != alVar || alVar == null || alVar.K || alVar.P0 == null) ? false : true;
        this.f33075x0 = z10;
        if (!z10 && (whVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(whVar.getEditText());
        }
        if (!this.f33075x0 && (yhVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(yhVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.r2 r2Var = this.f33018f0;
        if (r2Var == null) {
            r2Var = LaunchActivity.R();
        }
        if (!this.G2 && r2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.F2) {
                return;
            }
            this.F2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new dh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22366a.setOnCancelListener(new jh(this, 0));
            z0 z0Var = new z0(this, 4);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.N = z0Var;
            e2Var.show();
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, this.resourcesProvider);
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f33082z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar2 = liVarArr[i10];
            if (liVar2 != null && this.B0 != liVar2) {
                liVar2.p();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7), 0), true, (AndroidUtilities.IntColorCallback) new dh(this, 11));
        if (r2Var != null) {
            AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
        }
        this.f33037l2 = false;
        super.dismiss();
        this.G2 = false;
    }

    @Override
    public final void z(float f7, int i10) {
    }

    public ti(Activity activity, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11) {
        this(activity, r2Var, z10, z11, true, null);
    }
}
