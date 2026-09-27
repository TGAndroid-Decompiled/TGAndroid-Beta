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
public class wi extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a3, le.e {
    public static final int H2 = 0;
    public final ch.d A0;
    public final ti A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.j C0;
    public final RadialProgressView C1;
    public final ah.i C2;
    public final vh D0;
    public boolean D1;
    public final fh.c D2;
    public final i0 E;
    public final yh E0;
    public final p6 E1;
    public final ah.c E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final ah.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final lh G2;
    public boolean H;
    public final vh H0;
    public MessageObject H1;
    public int I;
    public final di I0;
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
    public final ai P0;
    public boolean P1;
    public v40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public st R0;
    public boolean R1;
    public final ce0 S;
    public boolean S0;
    public int S1;
    public xn T;
    public boolean T0;
    public boolean T1;
    public x40 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public hk X;
    public final y7 X0;
    public ValueAnimator X1;
    public fj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public ui Z1;
    public boolean f29945a0;
    public final org.telegram.ui.ActionBar.w0 f29946a1;
    public hn a2;
    public final le.c f29947b;
    public final ah.e f29948b0;
    public final ci.u f29949b1;
    public final int[] f29950b2;
    public final le.c f29951c;
    public boolean f29952c0;
    public final org.telegram.ui.ActionBar.w0 f29953c1;
    public int f29954c2;
    public final le.c d;
    public float f29955d0;
    public ci.e4 f29956d1;
    public float f29957d2;
    public final le.c e;
    public final hi f29958e0;
    public final org.telegram.ui.ActionBar.w0 f29959e1;
    public float f29960e2;
    public final le.c f29961f;
    public final org.telegram.ui.ActionBar.o2 f29962f0;
    public final bi.o f29963f1;
    public boolean f29964f2;
    public final boolean f29965g0;
    public float f29966g1;
    public float f29967g2;
    public final le.c h;
    public nf f29968h0;
    public float f29969h1;
    public final boolean f29970h2;
    public boolean f29971i0;
    public final vh f29972i1;
    public boolean f29973i2;
    public final ChatAttachAlertPhotoLayout f29974j0;
    public final TextView f29975j1;
    public final ArrayList f29976j2;
    public ak f29977k0;
    public final org.telegram.ui.ActionBar.w0 f29978k1;
    public final Rect f29979k2;
    public ij f29980l0;
    public final LinearLayout l1;
    public float f29981l2;
    public wn m0;
    public final ImageView f29982m1;
    public boolean f29983m2;
    public final le.m f29984n;
    public wn f29985n0;
    public final LinearLayout f29986n1;
    public int f29987n2;
    public il f29988o0;
    public final TextView f29989o1;
    public final hi f29990o2;
    public qk f29991p0;
    public float f29992p1;
    public o1.k f29993p2;
    public sm f29994q0;
    public boolean f29995q1;
    public AnimatorSet f29996q2;
    public org.telegram.ui.vn f29997r;
    public lj f29998r0;
    public final ji f29999r1;
    public boolean f30000r2;
    public final p6 f30001s;
    public hg.i0 f30002s0;
    public boolean f30003s1;
    public boolean f30004s2;
    public rk f30005t0;
    public Object f30006t1;
    public dl f30007t2;
    public rk f30008u0;
    public boolean f30009u1;
    public boolean f30010u2;
    public final p6 v;
    public ii.r f30011v0;
    public final jh.f f30012v1;
    public boolean f30013v2;
    public final ImageView f30014w;
    public final oi[] f30015w0;
    public final xh f30016w1;
    public File f30017w2;
    public final i0 f30018x;
    public final LongSparseArray f30019x0;
    public final vh f30020x1;
    public double[] f30021x2;
    public final ImageView f30022y;
    public oi f30023y0;
    public final wh f30024y1;
    public boolean f30025y2;
    public oi f30026z0;
    public final s4.c0 f30027z1;
    public boolean f30028z2;

    public wi(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        bi.o oVar;
        ji jiVar;
        int i10;
        float f7;
        sr srVar = sr.h;
        this.f29947b = new le.c(0, this, srVar, 380L, false);
        this.f29951c = new le.c(1, this, srVar, 380L, false);
        this.d = new le.c(2, this, srVar, 380L, false);
        this.e = new le.c(3, this, srVar, 380L, false);
        this.f29961f = new le.c(4, this, srVar, 380L, true);
        this.h = new le.c(5, this, srVar, 320L, false);
        le.m mVar = new le.m(new eh(this, 1), srVar, 380L);
        this.f29984n = mVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f29955d0 = 0.0f;
        this.f29958e0 = new hi(this, 0);
        this.f29971i0 = false;
        oi[] oiVarArr = new oi[11];
        this.f30015w0 = oiVarArr;
        this.f30019x0 = new LongSparseArray();
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
        this.f29950b2 = new int[2];
        new Paint(1);
        this.f29973i2 = false;
        ArrayList arrayList = new ArrayList();
        this.f29976j2 = arrayList;
        Rect rect = new Rect();
        this.f29979k2 = rect;
        this.f29990o2 = new hi(this, 1);
        this.f30000r2 = true;
        this.f30004s2 = false;
        this.f30028z2 = false;
        this.A2 = false;
        this.occupyNavigationBarWithoutKeyboard = true;
        fh.c cVar = new fh.c();
        this.D2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        this.glassEngine.v.add(new li.j(cVar, new eh(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i();
            this.C2 = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(cVar);
            dVar.f9062f = cVar;
            dVar.d = iVar;
            dVar.e = -2;
            fh.d dVar2 = new fh.d(null);
            dVar2.f9062f = cVar;
            dVar2.d = iVar;
            dVar2.e = -3;
            ah.c cVar2 = new ah.c(dVar);
            this.E2 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            cVar2.f423b = dp;
            cVar2.f424c = dp;
            ah.c cVar3 = new ah.c(dVar2);
            this.F2 = cVar3;
            cVar3.f427i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar3.f423b = dp2;
            cVar3.f424c = dp2;
        } else {
            this.C2 = null;
            this.E2 = new ah.c(cVar);
            this.F2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.G2 = new lh(this, 0);
        this.f29970h2 = z10;
        this.f29965g0 = (o2Var instanceof org.telegram.ui.xn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f29962f0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ji jiVar2 = new ji(this, context);
        this.f29999r1 = jiVar2;
        jiVar2.setDelegate(new ki(this));
        this.containerView = jiVar2;
        jiVar2.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        y7 y7Var = new y7(this, context, e6Var, 1);
        this.X0 = y7Var;
        y7Var.V0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i13 = org.telegram.ui.ActionBar.i6.f19164j5;
        y7Var.E(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.i6.I5;
        y7Var.B(getThemedColor(i14), false);
        y7Var.setTitleColor(getThemedColor(i13));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.po(this, 8));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, e6Var);
        this.f29946a1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new eh(this, 10));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, e6Var);
        this.f29953c1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f29949b1 = uVar;
        w0Var3.setIcon(uVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
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
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        w7.a6.a(oVar2);
        this.f29963f1 = oVar2;
        T1();
        if (o2Var != null) {
            jiVar = jiVar2;
            oVar = oVar2;
            w0Var = w0Var3;
            i10 = 4;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, e6Var);
            this.f29959e1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 6, -1));
            w0Var4.setOnClickListener(new ai.j3(5, this, z11));
        } else {
            w0Var = w0Var3;
            oVar = oVar2;
            jiVar = jiVar2;
            i10 = 4;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, e6Var);
        this.f29978k1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 3, -1));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final wi f25481b;

            {
                this.f25481b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.xn xnVar;
                switch (r3) {
                    case 0:
                        final wi wiVar = this.f25481b;
                        yh yhVar = wiVar.E0;
                        if (yhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(wiVar.getContext(), e6Var);
                            e0Var.m0(yhVar.getText());
                            e0Var.f23789j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            yh yhVar2 = wiVar.E0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar = wiVar.P0;
                                            aiVar.setText(charSequence);
                                            aiVar.w(charSequence.length(), charSequence.length());
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
                            e0Var.f23791l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23792n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final wi wiVar2 = this.f25481b;
                        ai aiVar = wiVar2.P0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(wiVar2.getContext(), e6Var);
                            e0Var2.m0(aiVar.getText());
                            e0Var2.f23789j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            yh yhVar2 = wiVar2.E0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = wiVar2.P0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var2.f23791l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23792n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        wi wiVar3 = this.f25481b;
                        wiVar3.f29978k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = wiVar3.f29962f0;
                        t12.J2(null, o2Var2, e6Var);
                        PhotoViewer.t1().K2(wiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i15 = wiVar3.S1;
                        boolean z15 = wiVar3.T1;
                        t13.h = i15;
                        t13.f31301n = z15;
                        if (!wiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(wiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(wiVar3.J1, "webp");
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
                        ni niVar = new ni(wiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.xn) {
                            xnVar = (org.telegram.ui.xn) o2Var2;
                        } else {
                            xnVar = null;
                        }
                        t14.f2(arrayList2, 0, 11, false, niVar, xnVar);
                        if (wiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, wiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        vh vhVar = new vh(this, context, 0);
        this.f29972i1 = vhVar;
        vhVar.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        vhVar.setAlpha(0.0f);
        vhVar.setVisibility(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f29975j1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.y5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f29982m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.y5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        vhVar.addView(linearLayout, w7.y5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f29986n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f29989o1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.y5.q(-2, -2, 16));
        vhVar.addView(linearLayout2, w7.y5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.f29974j0 = chatAttachAlertPhotoLayout;
        oiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f30023y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30012v1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.y5.g());
        this.containerView.addView(vhVar, w7.y5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.O0 = m6Var;
        this.containerView.addView(m6Var, w7.y5.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.y5.c(-2.0f, -1));
        this.containerView.addView(w0Var2, w7.y5.e(48, 48, 53));
        this.containerView.addView(w0Var, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f29959e1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, w7.y5.e(48, 48, 53));
        }
        vhVar.addView(w0Var5, w7.y5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.y5.e(-2, 48, 53));
        vh vhVar2 = new vh(this, context, 1);
        this.f30020x1 = vhVar2;
        wh whVar = new wh(context, 0);
        this.f30024y1 = whVar;
        whVar.setClipChildren(true);
        whVar.setClipToPadding(false);
        ti tiVar = new ti(this, context);
        this.A1 = tiVar;
        whVar.setAdapter(tiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f30027z1 = c0Var;
        whVar.setLayoutManager(c0Var);
        whVar.setVerticalScrollBarEnabled(false);
        whVar.setHorizontalScrollBarEnabled(false);
        whVar.setItemAnimator(null);
        whVar.setLayoutAnimation(null);
        whVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        whVar.f30729z2 = true;
        whVar.setOverScrollMode(2);
        ah.c cVar5 = this.E2;
        li.l lVar = this.glassEngine;
        cVar5.h = lVar;
        this.F2.h = lVar;
        cVar4.h = lVar;
        xh xhVar = new xh(this, context, 0);
        this.f30016w1 = xhVar;
        ah.e eVar = new ah.e(cVar4.c(xhVar, null, false));
        this.f29948b0 = eVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        eVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(xhVar, w7.y5.g());
        ch.d c10 = this.E2.c(vhVar2, eh.b.f(e6Var), false);
        c10.w(AndroidUtilities.dp(28.0f));
        c10.v(AndroidUtilities.dp(7.0f));
        vhVar2.setBackground(c10);
        whVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        whVar.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f47162a;
        whVar.setOutlineProvider(new yf.h0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        whVar.setImportantForAccessibility(1);
        vhVar2.addView(whVar, w7.y5.g());
        this.containerView.addView(vhVar2, w7.y5.e(-1, 70, 81));
        whVar.setOnItemClickListener(new ai.n6(9, this, e6Var));
        whVar.setOnItemLongClickListener(new eh(this, 3));
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
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
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
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.f19461z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        vh vhVar3 = new vh(this, context, 2);
        this.D0 = vhVar3;
        hg.j jVar = new hg.j(this, context);
        this.C0 = jVar;
        vhVar3.addView(jVar, w7.y5.e(-1, -1, 119));
        ji jiVar3 = jiVar;
        ch.d c11 = this.F2.c(jiVar3, eh.b.o(e6Var), false);
        this.A0 = c11;
        c11.f4285m = true;
        c11.x(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.z(AndroidUtilities.dp(32.0f));
        c11.f4282j.f4268g = 0.4f;
        c11.q();
        ch.d c12 = this.E2.c(jVar, eh.b.o(e6Var), false);
        this.B0 = c12;
        c12.w(AndroidUtilities.dp(22.0f));
        c12.v(AndroidUtilities.dp(7.0f));
        jVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        vhVar3.setWillNotDraw(false);
        vhVar3.setVisibility(4);
        vhVar3.setAlpha(0.0f);
        this.containerView.addView(vhVar3, w7.y5.e(-1, -2, 83));
        vhVar3.setOnTouchListener(new bi.d(13));
        p6 p6Var2 = new p6(context, false, false, false);
        this.f30001s = p6Var2;
        p6Var2.setAllowCancel(true);
        p6Var2.setScaleProperty(0.6f);
        p6Var2.setVisibility(8);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i15 = org.telegram.ui.ActionBar.i6.f19442y6;
        p6Var2.setTextColor(getThemedColor(i15));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        jVar.addView(p6Var2, w7.y5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30014w = imageView4;
        i0 i0Var = new i0(context);
        this.f30018x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.i6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        int i17 = org.telegram.ui.ActionBar.i6.f19147i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        jVar.addView(imageView4, w7.y5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25481b;

            {
                this.f25481b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.xn xnVar;
                switch (r3) {
                    case 0:
                        final wi wiVar = this.f25481b;
                        yh yhVar = wiVar.E0;
                        if (yhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(wiVar.getContext(), e6Var);
                            e0Var.m0(yhVar.getText());
                            e0Var.f23789j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            yh yhVar2 = wiVar.E0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = wiVar.P0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var.f23791l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23792n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final wi wiVar2 = this.f25481b;
                        ai aiVar = wiVar2.P0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(wiVar2.getContext(), e6Var);
                            e0Var2.m0(aiVar.getText());
                            e0Var2.f23789j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            yh yhVar2 = wiVar2.E0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = wiVar2.P0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var2.f23791l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23792n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        wi wiVar3 = this.f25481b;
                        wiVar3.f29978k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = wiVar3.f29962f0;
                        t12.J2(null, o2Var2, e6Var);
                        PhotoViewer.t1().K2(wiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = wiVar3.S1;
                        boolean z15 = wiVar3.T1;
                        t13.h = i152;
                        t13.f31301n = z15;
                        if (!wiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(wiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(wiVar3.J1, "webp");
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
                        ni niVar = new ni(wiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.xn) {
                            xnVar = (org.telegram.ui.xn) o2Var2;
                        } else {
                            xnVar = null;
                        }
                        t14.f2(arrayList2, 0, 11, false, niVar, xnVar);
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
        yh yhVar = new yh(this, context, jiVar3, e6Var);
        this.E0 = yhVar;
        yhVar.J = true;
        yhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        yhVar.s();
        yhVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        yhVar.getEditText().addTextChangedListener(new zh(this));
        jVar.addView(yhVar, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        vhVar3.setClipChildren(false);
        yhVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        ai aiVar = new ai(this, context, jiVar3, e6Var);
        this.P0 = aiVar;
        aiVar.J = true;
        aiVar.getEditText().addTextChangedListener(new ci(this, o2Var));
        aiVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        aiVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        aiVar.getEditText().setTextSize(1, 17.0f);
        aiVar.getEmojiButton().setLayoutParams(w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        aiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(aiVar, w7.y5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        yhVar.addView(imageView3, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ch.d c13 = this.E2.c(m6Var, eh.b.o(e6Var), false);
        c13.w(AndroidUtilities.dp(22.0f));
        c13.v(AndroidUtilities.dp(7.0f));
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
        m6Var.addView(p6Var3, w7.y5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Xd), mode2));
        aiVar.addView(imageView5, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30022y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.y5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25481b;

            {
                this.f25481b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.xn xnVar;
                switch (r3) {
                    case 0:
                        final wi wiVar = this.f25481b;
                        yh yhVar2 = wiVar.E0;
                        if (yhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(wiVar.getContext(), e6Var);
                            e0Var.m0(yhVar2.getText());
                            e0Var.f23789j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            yh yhVar22 = wiVar.E0;
                                            yhVar22.setText(charSequence);
                                            yhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = wiVar.P0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var.f23791l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23792n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final wi wiVar2 = this.f25481b;
                        ai aiVar2 = wiVar2.P0;
                        if (aiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(wiVar2.getContext(), e6Var);
                            e0Var2.m0(aiVar2.getText());
                            e0Var2.f23789j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            yh yhVar22 = wiVar2.E0;
                                            yhVar22.setText(charSequence);
                                            yhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar22 = wiVar2.P0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
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
                            e0Var2.f23791l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23792n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        wi wiVar3 = this.f25481b;
                        wiVar3.f29978k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = wiVar3.f29962f0;
                        t12.J2(null, o2Var2, e6Var);
                        PhotoViewer.t1().K2(wiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = wiVar3.S1;
                        boolean z15 = wiVar3.T1;
                        t13.h = i152;
                        t13.f31301n = z15;
                        if (!wiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(wiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(wiVar3.J1, "webp");
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
                        ni niVar = new ni(wiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.xn) {
                            xnVar = (org.telegram.ui.xn) o2Var2;
                        } else {
                            xnVar = null;
                        }
                        t14.f2(arrayList2, 0, 11, false, niVar, xnVar);
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
        vh vhVar4 = new vh(this, context, 3);
        this.H0 = vhVar4;
        vhVar4.setFocusable(true);
        vhVar4.setFocusableInTouchMode(true);
        vhVar4.setVisibility(4);
        vhVar4.setScaleX(0.2f);
        vhVar4.setScaleY(0.2f);
        vhVar4.setAlpha(0.0f);
        vhVar4.setClipChildren(false);
        vhVar4.setClipToPadding(false);
        this.containerView.addView(vhVar4, w7.y5.e(110, 50, 85));
        di diVar = new di(R.drawable.send_plane_24, context, e6Var, this);
        this.I0 = diVar;
        diVar.setImportantForAccessibility(2);
        vhVar4.addView(diVar, w7.y5.e(-1, -1, 119));
        diVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        diVar.I = dp4;
        diVar.J = dp5;
        diVar.M = AndroidUtilities.dp(7.0f);
        diVar.N = AndroidUtilities.dp(6.0f);
        diVar.f29121h0 = true;
        diVar.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25133b;

            {
                this.f25133b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.q4 q4Var;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25133b;
                        if (wiVar.f30023y0 != wiVar.f29994q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar.W1(z13);
                        return;
                    case 1:
                        wi wiVar2 = this.f25133b;
                        long j3 = wiVar2.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar2.f30019x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25133b;
                        boolean z14 = wiVar3.f29952c0;
                        if (!z14) {
                            wiVar3.E1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        wi wiVar4 = this.f25133b;
                        boolean z15 = wiVar4.f29952c0;
                        if (z15) {
                            wiVar4.E1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f25133b.w1();
                        return;
                    case 5:
                        this.f25133b.f29946a1.M(null, null);
                        return;
                    case 6:
                        wi.p(this.f25133b);
                        return;
                    case 7:
                        oi oiVar = this.f25133b.f30023y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f25133b.f29978k1.M(null, null);
                        return;
                }
            }
        });
        diVar.setOnLongClickListener(new org.telegram.ui.hg(this, context, e6Var, o2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        xh xhVar2 = new xh(this, context, 1);
        xhVar2.setAlpha(0.0f);
        xhVar2.setScaleX(0.2f);
        xhVar2.setScaleY(0.2f);
        if (z10) {
            a1();
            this.navBarColorKey = -1;
        }
        fl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar6 = this.E2;
        dh.e o9 = eh.b.o(e6Var);
        yl0 yl0Var = fastScroll.f24326o0;
        ch.d c14 = cVar6.c(yl0Var.f30689f1, o9, false);
        fastScroll.f24315e0 = c14;
        c14.v(AndroidUtilities.dp(4.0f));
        fastScroll.f24315e0.w(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar6.c(yl0Var.f30689f1, o9, false);
        fastScroll.f24317f0 = c15;
        c15.v(AndroidUtilities.dp(6.0f));
        fastScroll.f24317f0.z(AndroidUtilities.dp(4.0f));
        fastScroll.f24317f0.w(AndroidUtilities.dp(f7));
        ce0 ce0Var = new ce0(context);
        this.S = ce0Var;
        this.containerView.addView(ce0Var, w7.y5.c(-1.0f, -1));
        dh.e eVar2 = new dh.e(e6Var);
        eVar2.e = new eh(this, 5);
        eVar2.f7725c = new eh(this, 6);
        eVar2.d = new eh(this, 7);
        eVar2.f7724b = new eh(this, 8);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f7727n = dpf2;
        eVar2.f7728r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f7726f = dpf23;
        eVar2.h = dpf24;
        y7Var.N(this.E2, eVar2, false);
        mVar.i(1L, false);
        this.glassEngine.g(this.containerView);
        li.l lVar2 = this.glassEngine;
        lVar2.f14381a = new eh(this, 9);
        lVar2.d = new ni.b(AndroidUtilities.dp(48.0f));
    }

    public static void F(wi wiVar) {
        boolean q6;
        int i10;
        int i11;
        y7 y7Var = wiVar.X0;
        jh.f fVar = wiVar.f30012v1;
        if (fVar != null && y7Var != null) {
            org.telegram.ui.ActionBar.e6 e6Var = wiVar.resourcesProvider;
            if (e6Var != null) {
                q6 = e6Var.a();
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

    public static void J(wi wiVar) {
        ci.i iVar = new ci.i(wiVar, wiVar.getContext(), wiVar.Z, LaunchActivity.R(), wiVar.resourcesProvider, 1);
        wiVar.B2 = iVar;
        iVar.p(new o0.c(wiVar, 5));
        ViewGroup viewGroup = wiVar.containerView;
        viewGroup.addView(wiVar.B2, viewGroup.indexOfChild(wiVar.D0), w7.y5.e(-1, -1, 83));
        ci.i iVar2 = wiVar.B2;
        iVar2.getAdapter().f9804c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        boolean z10 = true;
        if (o2Var instanceof org.telegram.ui.xn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) o2Var;
            gg.k1 adapter = iVar2.getAdapter();
            xnVar.i();
            TLRPC.Chat chat = xnVar.e;
            adapter.getClass();
            adapter.f9815l0 = chat;
            iVar2.getAdapter().W(xnVar.Z7);
            gg.k1 adapter2 = iVar2.getAdapter();
            if (xnVar.e == null) {
                z10 = false;
            }
            adapter2.f9807e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f9807e0 = false;
        }
        iVar2.getAdapter().f9809f0 = false;
        wiVar.R1();
    }

    public static int e0(wi wiVar) {
        oi oiVar = wiVar.f30023y0;
        wn wnVar = wiVar.m0;
        if (oiVar == wnVar && wnVar.E != null) {
            return wnVar.getEmojiPadding();
        }
        wn wnVar2 = wiVar.f29985n0;
        if (oiVar == wnVar2 && wnVar2.E != null) {
            return wnVar2.getEmojiPadding();
        }
        if (wiVar.f29952c0) {
            return wiVar.P0.getEmojiPadding();
        }
        return wiVar.E0.getEmojiPadding();
    }

    public static void m(wi wiVar, ci.e4 e4Var) {
        wiVar.containerView.removeView(e4Var);
    }

    public static void n(wi wiVar) {
        oi oiVar;
        sm smVar;
        wiVar.f30006t1 = null;
        oi oiVar2 = wiVar.f30023y0;
        if (oiVar2 != wiVar.f29974j0 && (oiVar = wiVar.f30026z0) != (smVar = wiVar.f29994q0) && oiVar2 != oiVar && oiVar2 != smVar) {
            wiVar.containerView.removeView(oiVar2);
        }
        wiVar.f30023y0.setVisibility(8);
        wiVar.f30023y0.q();
        wiVar.f30026z0.F();
        wiVar.f30023y0 = wiVar.f30026z0;
        wiVar.f30026z0 = null;
        int[] iArr = wiVar.f29950b2;
        iArr[0] = iArr[1];
        wiVar.E1(wiVar.f29952c0, false);
        wiVar.T1();
    }

    public static void o(wi wiVar, boolean z10, hh hhVar) {
        Integer num;
        wiVar.f30023y0.s(1.0f);
        wiVar.f30026z0.s(1.0f);
        wiVar.f30023y0.k(wiVar.f29981l2);
        wiVar.f30026z0.k(wiVar.f29981l2);
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

    public static void p(wi wiVar) {
        int i10;
        if (wiVar.f29974j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29974j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22125s1;
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
        wiVar.V1(true);
        org.telegram.ui.ActionBar.w0 w0Var = wiVar.f29953c1;
        ci.e4 e4Var = wiVar.f29956d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = new ci.e4(wiVar.getContext(), 1);
        wiVar.f29956d1 = e4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        wiVar.f29956d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        wiVar.f29956d1.m(1.0f, -((wiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        wiVar.f29956d1.setTranslationY(wiVar.f29946a1.getTranslationY());
        ci.e4 e4Var3 = wiVar.f29956d1;
        e4Var3.f4625l0 = new fe(3, wiVar, e4Var2);
        wiVar.containerView.addView(e4Var3, w7.y5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        wiVar.f29956d1.u();
    }

    public static void q(wi wiVar, ValueAnimator valueAnimator) {
        wiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.e3 e3Var = wiVar.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public static void r(wi wiVar) {
        o1.k kVar = wiVar.f29993p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(wiVar.containerView, o1.h.f15555n, 0.0f);
        wiVar.f29993p2 = kVar2;
        kVar2.f15572u.a(1.5f);
        wiVar.f29993p2.f15572u.b(1500.0f);
        wiVar.f29993p2.f();
    }

    public static void s(wi wiVar, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        wi wiVar2 = wiVar;
        wh whVar = wiVar2.f30024y1;
        oi[] oiVarArr = wiVar2.f30015w0;
        org.telegram.ui.ActionBar.o2 o2Var2 = wiVar2.f29962f0;
        if (o2Var2 == null) {
            o2Var = LaunchActivity.R();
        } else {
            o2Var = o2Var2;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (view instanceof qi) {
                Activity parentActivity = o2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (wiVar2.L1 || wiVar2.M1 || !wiVar2.Y0()) {
                        if (!wiVar2.L1 && !wiVar2.M1) {
                            xn xnVar = new xn(1, wiVar2.getContext(), e6Var, wiVar2);
                            wiVar2.T = xnVar;
                            wiVar2.N1(xnVar);
                        }
                        wiVar2.N1(wiVar2.f29974j0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (wiVar2.N1 || !wiVar2.Y0()) {
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
                        wiVar2.y1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (wiVar2.K1 || !wiVar2.Y0()) {
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
                        wiVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (wiVar2.Q1 || !wiVar2.Y0()) {
                        if (Build.VERSION.SDK_INT >= 23 && wiVar2.Q1 && wiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(wiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        wiVar2.A1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((wiVar2.Q1 || !wiVar2.Y0()) && AndroidUtilities.isMapsInstalled(o2Var2)) {
                        if (!wiVar2.Q1) {
                            xn xnVar2 = new xn(6, wiVar2.getContext(), e6Var, wiVar2);
                            wiVar2.T = xnVar2;
                            wiVar2.N1(xnVar2);
                        } else {
                            if (wiVar2.f29988o0 == null) {
                                il ilVar = new il(wiVar2, wiVar2.getContext(), e6Var, (wiVar2.H || wiVar2.R1) ? false : false);
                                wiVar2.f29988o0 = ilVar;
                                oiVarArr[5] = ilVar;
                                dl dlVar = wiVar2.f30007t2;
                                if (dlVar != null) {
                                    ilVar.setDelegate(dlVar);
                                } else {
                                    ilVar.setDelegate(new eh(wiVar2, 11));
                                }
                            }
                            wiVar2.N1(wiVar2.f29988o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (wiVar2.O1 || !wiVar2.Y0()) {
                        if (!wiVar2.O1) {
                            xn xnVar3 = new xn(9, wiVar2.getContext(), e6Var, wiVar2);
                            wiVar2.T = xnVar3;
                            wiVar2.N1(xnVar3);
                        } else {
                            wiVar2.P1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (wiVar2.f30002s0 == null) {
                        hg.i0 i0Var = new hg.i0(wiVar2.getContext(), wiVar2.resourcesProvider, wiVar2);
                        wiVar2.f30002s0 = i0Var;
                        oiVarArr[7] = i0Var;
                        i0Var.setupBlurredSearchField(wiVar2.E2);
                    }
                    wiVar2.N1(wiVar2.f30002s0);
                } else if (i10 == 12) {
                    if (wiVar2.P1 || !wiVar2.Y0()) {
                        if (!wiVar2.P1) {
                            xn xnVar4 = new xn(9, wiVar2.getContext(), e6Var, wiVar2);
                            wiVar2.T = xnVar4;
                            wiVar2.N1(xnVar4);
                        } else {
                            if (wiVar2.f29985n0 == null) {
                                wn wnVar = new wn(wiVar, wiVar.getContext(), true, e6Var, null);
                                wiVar2 = wiVar;
                                wiVar2.f29985n0 = wnVar;
                                oiVarArr[1] = wnVar;
                                wnVar.setDelegate(new eh(wiVar2, 13));
                            }
                            wiVar2.N1(wiVar2.f29985n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (wiVar2.f30008u0 == null) {
                        rk rkVar = new rk(wiVar2, wiVar2.getContext(), e6Var, true);
                        wiVar2.f30008u0 = rkVar;
                        oiVarArr[8] = rkVar;
                        rkVar.setDelegate(wiVar2.a2);
                    }
                    wiVar2.N1(wiVar2.f30008u0);
                } else if (i10 == 14) {
                    if (wiVar2.f30005t0 == null) {
                        rk rkVar2 = new rk(wiVar2, wiVar2.getContext(), e6Var, false);
                        wiVar2.f30005t0 = rkVar2;
                        oiVarArr[9] = rkVar2;
                        rkVar2.setDelegate(wiVar2.a2);
                    }
                    wiVar2.N1(wiVar2.f30005t0);
                } else if (i10 == 16) {
                    if (wiVar2.f30011v0 == null) {
                        ii.r rVar = new ii.r(wiVar2.J1, wiVar2.getContext(), e6Var, wiVar2);
                        wiVar2.f30011v0 = rVar;
                        oiVarArr[10] = rVar;
                    }
                    wiVar2.N1(wiVar2.f30011v0);
                } else if (view.getTag() instanceof Integer) {
                    wiVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, wiVar2.p1(), false, 0L);
                }
            } else if (view instanceof pi) {
                pi piVar = (pi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = piVar.f27377c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        cj1.a(wiVar2.getContext(), new org.telegram.ui.qc(16, wiVar2, piVar), null);
                    } else {
                        wiVar2.K1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    wiVar2.Z1.j1(piVar.f27376b);
                    wiVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                whVar.w0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > whVar.getMeasuredWidth()) {
                whVar.w0(i14 - whVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void t(wi wiVar, int i10) {
        ah.i iVar = wiVar.C2;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.d0.a(i10, 4)) {
                ni.a e = wiVar.glassEngine.e();
                e.b(wiVar.containerView.getY(), wiVar.containerView.getWidth(), wiVar.containerView.getY() + wiVar.containerView.getHeight());
                iVar.h(e);
            }
            iVar.e(wiVar.G2, wiVar.containerView.getWidth(), wiVar.containerView.getHeight());
        }
    }

    public static void u(wi wiVar, org.telegram.messenger.video.o oVar) {
        AnimatorSet animatorSet = wiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            oVar.run();
        }
    }

    public static void v(wi wiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.a3 a3Var) {
        wiVar.currentSheetAnimation = null;
        wiVar.f29993p2 = null;
        animationNotificationsLocker.unlock();
        wiVar.currentSheetAnimationType = 0;
        if (a3Var != null) {
            a3Var.onOpenAnimationEnd();
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

    public static boolean w(org.telegram.ui.Components.wi r46, android.content.Context r47, org.telegram.ui.ActionBar.e6 r48, org.telegram.ui.ActionBar.o2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.w(org.telegram.ui.Components.wi, android.content.Context, org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.o2, android.view.View):boolean");
    }

    public static void x(wi wiVar, int i10) {
        wiVar.navBarColorKey = -1;
        wiVar.navBarColor = i10;
        wiVar.containerView.invalidate();
    }

    public final void A1() {
        boolean z10;
        if (!this.Q1) {
            xn xnVar = new xn(5, getContext(), this.resourcesProvider, this);
            this.T = xnVar;
            N1(xnVar);
        }
        if (this.f29977k0 == null) {
            ak akVar = new ak(getContext(), this.resourcesProvider, this);
            this.f29977k0 = akVar;
            this.f30015w0[2] = akVar;
            akVar.setupBlurredSearchField(this.E2);
            this.f29977k0.setDelegate(new fi(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            TLRPC.Chat chat = ((org.telegram.ui.xn) o2Var).e;
            ak akVar2 = this.f29977k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            akVar2.setMultipleSelectionAllowed(z10);
        }
        N1(this.f29977k0);
    }

    public final void B1(boolean z10) {
        int i10;
        if (!this.K1 && z10) {
            xn xnVar = new xn(4, getContext(), this.resourcesProvider, this);
            this.T = xnVar;
            N1(xnVar);
        }
        boolean z11 = false;
        if (this.f29991p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            qk qkVar = new qk(i10, getContext(), this.resourcesProvider, this);
            this.f29991p0 = qkVar;
            this.f30015w0[4] = qkVar;
            qkVar.setDelegate(new gi(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f29991p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
            if (o2Var instanceof org.telegram.ui.xn) {
                TLRPC.Chat chat = ((org.telegram.ui.xn) o2Var).e;
                qk qkVar2 = this.f29991p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i11 = -1;
                }
                qkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f29991p0.setMaxSelectedFiles(this.S1);
                qk qkVar3 = this.f29991p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                qkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        qk qkVar4 = this.f29991p0;
        qkVar4.f27758d0 = this.N;
        if (z10) {
            N1(qkVar4);
        }
    }

    public final void C1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y7 y7Var = this.X0;
        int i10 = 1;
        if (y7Var.f19570n0) {
            y7Var.i(true);
        }
        this.f29977k0 = null;
        this.f30002s0 = null;
        this.f29980l0 = null;
        this.m0 = null;
        this.f29985n0 = null;
        this.f29988o0 = null;
        this.f29991p0 = null;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
            if (i10 < oiVarArr.length) {
                oi oiVar = oiVarArr[i10];
                if (oiVar != null) {
                    oiVar.m();
                    this.containerView.removeView(oiVarArr[i10]);
                    oiVarArr[i10] = null;
                }
                i10++;
            } else {
                Q1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        oi oiVar;
        int i11;
        if (i10 == 0) {
            e1();
            c1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            c1();
            wn wnVar = this.m0;
            if (wnVar != null && ((oiVar = this.f30026z0) == wnVar || this.f30023y0 == wnVar)) {
                if (oiVar == wnVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                X1(i11);
            }
            wn wnVar2 = this.f29985n0;
            if (wnVar2 != null) {
                oi oiVar2 = this.f30026z0;
                if (oiVar2 == wnVar2 || this.f30023y0 == wnVar2) {
                    if (oiVar2 != wnVar2) {
                        i12 = 0;
                    }
                    X1(i12);
                }
            }
        } else if (i10 == 1) {
            c1();
        } else if (i10 == 3) {
            d1();
        } else if (i10 == 4) {
            d1();
        } else if (i10 == 5) {
            d1();
            di diVar = this.I0;
            if (diVar != null) {
                diVar.setEphemeralFactor(f7);
                diVar.setSameWidthFactor(f7);
            }
        }
    }

    public final boolean D1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) o2Var;
            TLRPC.Chat chat = xnVar.e;
            if (xnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.J1).edit();
                edit.putBoolean("silent_" + xnVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (Z0(k1().getText())) {
            return true;
        }
        X0();
        if (this.h.f14203f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long l1 = l1();
        oi oiVar = this.f30023y0;
        if (oiVar != null) {
            i12 = oiVar.getSelectedItemsCount();
        }
        return e5.b0(this.J1, l1, h1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                wi wiVar = wi.this;
                wiVar.I1 = true;
                wiVar.Z1.B1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void E1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f29947b.a(z10, z11);
        lu k12 = k1();
        this.f29952c0 = z10;
        lu k13 = k1();
        int i11 = 0;
        if (this.D0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        oi oiVar = this.f30023y0;
        if (oiVar != this.f29974j0 && oiVar != this.f29994q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f29952c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        ci.m6 m6Var = this.O0;
        hg.j jVar = this.C0;
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
            sr srVar = sr.h;
            duration.setInterpolator(srVar).setUpdateListener(new fh(this, 0)).withEndAction(new Runnable(this) {
                public final wi f24579b;

                {
                    this.f24579b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            wi wiVar = this.f24579b;
                            if (!z14 || !z12) {
                                wiVar.O0.setVisibility(8);
                            }
                            wiVar.Y1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24579b.C0.setVisibility(8);
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
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(srVar).setUpdateListener(new fh(this, 1)).withEndAction(new Runnable(this) {
                public final wi f24579b;

                {
                    this.f24579b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            wi wiVar = this.f24579b;
                            if (!z14 || !z12) {
                                wiVar.O0.setVisibility(8);
                            }
                            wiVar.Y1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24579b.C0.setVisibility(8);
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
            Y1();
            jVar.setAlpha((z14 || !z12) ? 0.0f : 0.0f);
            if (z14 || !z12) {
                f12 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f12);
            jVar.setVisibility((z14 || !z12) ? 8 : 8);
        }
        if (k12 != k13) {
            k12.k(true);
            k13.setText(z5.cloneSpans(k12.getText()));
            k13.getEditText().setAllowTextEntitiesIntersection(k12.getEditText().getAllowTextEntitiesIntersection());
            if (k12.getEditText().isFocused()) {
                k13.getEditText().requestFocus();
                k13.getEditText().setSelection(k12.getEditText().getSelectionStart(), k12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new hh(this, 0));
    }

    public final void F1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f29974j0) != null) {
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
        S1(0);
    }

    public final void G1(int i10, boolean z10) {
        if (this.H1 != null) {
            return;
        }
        this.S1 = i10;
        this.T1 = z10;
    }

    public final void H1(float f7) {
        boolean z10 = false;
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void I1(String str) {
        boolean z10 = true;
        this.Q0 = 1;
        this.F = true;
        this.S0 = false;
        this.M1 = false;
        this.f30020x1.setVisibility(8);
        this.f29975j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
        if (chatAttachAlertPhotoLayout != null) {
            wi wiVar = chatAttachAlertPhotoLayout.f27104b;
            chatAttachAlertPhotoLayout.f22141g1 = (wiVar.Q0 == 0 || wiVar.F) ? false : false;
        }
    }

    public final void J1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.J1(boolean):void");
    }

    public final void K1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.K1(long, java.lang.String, boolean, boolean):void");
    }

    public final void L1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.xn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.xn) o2Var).e)) {
            new xc(this.f29999r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new fe(4, this, o2Var)).j();
        }
    }

    public final boolean M1(boolean z10, boolean z11) {
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
        this.f29951c.a(z10, true);
        vh vhVar = this.D0;
        if (vhVar.getTag() != null) {
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
        vhVar.setTag(num);
        yh yhVar = this.E0;
        if (yhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(yhVar.getEditText());
        }
        yhVar.k(true);
        this.P0.k(true);
        vh vhVar2 = this.f30020x1;
        vh vhVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                vhVar.setVisibility(0);
            }
            vhVar3.setVisibility(0);
        } else if (this.S0) {
            vhVar2.setVisibility(0);
        }
        oi oiVar2 = this.f30023y0;
        if ((oiVar2 == this.f29974j0 || oiVar2 == this.f29994q0) && this.f29952c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        y7 y7Var2 = this.X0;
        ci.m6 m6Var = this.O0;
        hg.j jVar = this.C0;
        di diVar = this.I0;
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
            arrayList.add(ObjectAnimator.ofFloat(vhVar, property, f18));
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
            arrayList.add(ObjectAnimator.ofFloat(m6Var, property, f20));
            Property property2 = View.SCALE_X;
            if (z10) {
                f21 = 1.0f;
            } else {
                f21 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vhVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(diVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(diVar, property3, f26));
            if (y7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(vhVar, property4, f28));
            } else if (this.S0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(vhVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(vhVar2, property, f27));
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
            vhVar.setAlpha(f7);
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
            vhVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            vhVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            vhVar3.setAlpha(f13);
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
            diVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            diVar.setScaleY(f16);
            if (y7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                vhVar.setTranslationY(dp);
            } else if (this.S0 && ((oiVar = this.f30023y0) == null || oiVar.J())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                vhVar2.setTranslationY(f17);
            }
            if (!z10) {
                vhVar.setVisibility(4);
                vhVar3.setVisibility(4);
            }
            if (z13) {
                Y1();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f30023y0.getSelectedItemsCount());
        }
        diVar.g(i10, z11);
        if (this.H1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.J1).getSendPaidMessagesStars(l1());
        }
        diVar.i(h1() + this.f30023y0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), diVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            yhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void N1(oi oiVar) {
        long j3 = this.W0;
        xn xnVar = this.T;
        if (oiVar == xnVar) {
            j3 = xnVar.f30443s;
        } else if (oiVar == this.f29974j0) {
            j3 = 1;
        } else if (oiVar == this.f29980l0) {
            j3 = 3;
        } else if (oiVar == this.f29991p0) {
            j3 = 4;
        } else if (oiVar == this.f29977k0) {
            j3 = 5;
        } else if (oiVar == this.f29988o0) {
            j3 = 6;
        } else if (oiVar == this.m0) {
            j3 = 9;
        } else if (oiVar == this.f29998r0) {
            j3 = 10;
        } else if (oiVar == this.f30002s0) {
            j3 = 11;
        } else if (oiVar == this.f29985n0) {
            j3 = 12;
        } else if (oiVar == this.f30005t0) {
            j3 = 14;
        } else if (oiVar == this.f30008u0) {
            j3 = 13;
        } else if (oiVar == this.f30011v0) {
            j3 = 16;
        }
        O1(oiVar, j3, true);
    }

    public final void O1(oi oiVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        fm fmVar;
        boolean z12;
        Integer num;
        fm fmVar2;
        int i11;
        int dp;
        Float f7;
        int i12;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f30006t1 == null && this.M0 == null) {
            oi oiVar2 = this.f30023y0;
            if (oiVar2 == oiVar) {
                oiVar2.G();
                return;
            }
            int i13 = 0;
            if (oiVar == this.f29985n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.x0(this.f29962f0, 39, false).show();
                return;
            }
            int i14 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
            if (i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f29961f.a(z11, z10);
            this.f29984n.i(Long.valueOf(j3), z10);
            this.D1 = false;
            this.B1 = false;
            this.F1 = 0.0f;
            this.E1.setVisibility(8);
            RadialProgressView radialProgressView = this.C1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            vh vhVar = this.f30020x1;
            vhVar.setAlpha(1.0f);
            vhVar.setTranslationY(this.F1);
            int i15 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.f30019x0;
                if (i15 >= longSparseArray.size()) {
                    break;
                }
                ((ei.q4) longSparseArray.valueAt(i15)).setMeasureOffsetY(0);
                i15++;
            }
            this.W0 = j3;
            wh whVar = this.f30024y1;
            int childCount = whVar.getChildCount();
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = whVar.getChildAt(i16);
                if (childAt instanceof qi) {
                    qi qiVar = (qi) childAt;
                    i12 = i14;
                    f7 = valueOf;
                    if (qiVar.f27744b == qiVar.f27745c.W0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    qiVar.f28006a.e(z13, true);
                } else {
                    f7 = valueOf;
                    i12 = i14;
                    if (childAt instanceof pi) {
                        ((pi) childAt).a(true);
                    }
                }
                i16++;
                i14 = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int i17 = i14;
            int firstOffset = (this.f30023y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f29950b2[0];
            this.f30026z0 = oiVar;
            oiVar.getClass();
            boolean z14 = oiVar instanceof ii.r;
            jh.f fVar = this.f30012v1;
            if (fVar != null) {
                if (z14) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                fVar.setFadeHeightBottom(dp);
            }
            xh xhVar = this.f30016w1;
            if (xhVar != null) {
                if (z14) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                xhVar.setVisibility(i11);
            }
            if (this.f30026z0.h() != 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            y7 y7Var = this.X0;
            y7Var.setVisibility(i10);
            if (y7Var.f19570n0) {
                y7Var.i(true);
            }
            this.f30023y0.r();
            oi oiVar3 = this.f30026z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
            if (oiVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.f30026z0.E(this.f30023y0);
            this.f30026z0.setVisibility(0);
            if (oiVar.getParent() != null) {
                this.containerView.removeView(this.f30026z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.f30023y0);
            ViewParent parent = this.f30026z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                oi oiVar4 = this.f30026z0;
                if (oiVar4 != this.f29988o0) {
                    indexOfChild++;
                }
                viewGroup.addView(oiVar4, indexOfChild, w7.y5.c(-1.0f, -1));
            }
            hh hhVar = new hh(this, 3);
            oi oiVar5 = this.f30023y0;
            boolean z15 = oiVar5 instanceof sm;
            hi hiVar = this.f29958e0;
            if (!z15 && !(this.f30026z0 instanceof sm)) {
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f30026z0.setAlpha(0.0f);
                    this.f30026z0.setTranslationY(AndroidUtilities.dp(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.f30023y0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f30023y0, hiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, View.ALPHA, y7Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(sr.f28359f);
                    animatorSet.addListener(new ei(this, firstOffset, hhVar, 0));
                    this.f30006t1 = animatorSet;
                    hiVar.set(this.f30023y0, f10);
                    animatorSet.start();
                } else {
                    oiVar5.setAlpha(0.0f);
                    hhVar.run();
                    X1(0);
                    this.containerView.invalidate();
                }
            } else {
                int max = Math.max(this.f30026z0.getWidth(), this.f30023y0.getWidth());
                oi oiVar6 = this.f30026z0;
                if (oiVar6 instanceof sm) {
                    oiVar6.setTranslationX(max);
                    oi oiVar7 = this.f30023y0;
                    if ((oiVar7 instanceof ChatAttachAlertPhotoLayout) && (fmVar2 = ((ChatAttachAlertPhotoLayout) oiVar7).P) != null) {
                        fmVar2.setVisibility(4);
                    }
                } else {
                    this.f30023y0.setTranslationX(-max);
                    oi oiVar8 = this.f30026z0;
                    if (oiVar8 == chatAttachAlertPhotoLayout && (fmVar = ((ChatAttachAlertPhotoLayout) oiVar8).P) != null) {
                        fmVar.setVisibility(0);
                    }
                }
                this.f30026z0.setAlpha(1.0f);
                this.f30023y0.setAlpha(1.0f);
                if (z10) {
                    hiVar.set(this.f30023y0, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, oiVar, hhVar, 15));
                } else {
                    if (this.f30026z0.getCurrentItemTop() <= oiVar.getButtonsHideOffset()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f30023y0.s(1.0f);
                    this.f30026z0.s(1.0f);
                    this.f30023y0.k(this.f29981l2);
                    this.f30026z0.k(this.f29981l2);
                    this.containerView.invalidate();
                    hiVar.set(this.f30023y0, Float.valueOf(1.0f));
                    if (z12) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    y7Var.setTag(num);
                    hhVar.run();
                }
            }
            if (this.f29983m2 && !(oiVar instanceof ei.q4)) {
                this.f29983m2 = false;
                y7Var.e();
                y7Var.invalidate();
                r1();
            }
            if (i17 != 0 && j3 != 6 && !(oiVar instanceof ei.q4)) {
                if (j3 == 4) {
                    i13 = AndroidUtilities.dp(84.0f);
                }
            } else {
                i13 = AndroidUtilities.dp(46.0f);
            }
            y7Var.setForcedMenuWidth(i13);
        }
    }

    public final void P1(boolean z10, Boolean bool) {
        wi wiVar;
        if (this.m0 == null) {
            wiVar = this;
            wn wnVar = new wn(wiVar, getContext(), false, this.resourcesProvider, bool);
            wiVar.m0 = wnVar;
            wiVar.f30015w0[1] = wnVar;
            wnVar.setDelegate(new eh(this, 17));
        } else {
            wiVar = this;
        }
        O1(wiVar.m0, 9L, z10);
    }

    public final void Q1(boolean z10, boolean z11) {
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
            if (!this.F && !this.T0 && ((this.Q0 != 0 || !this.f29995q1) && this.f30023y0 == this.f29974j0 && (this.L1 || this.M1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f30023y0 == this.T) {
                z12 = false;
            }
            vh vhVar = this.f30020x1;
            org.telegram.ui.ActionBar.w0 w0Var = this.f29946a1;
            if (z10) {
                if (z12) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.S0 && this.D0.getTag() == null) {
                vhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
            if (o2Var != null) {
                if (z10) {
                    if (this.f29970h2) {
                        i10 = org.telegram.ui.ActionBar.i6.f19363tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f19128h5;
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
                this.Y0.addListener(new ca(2, this, z10));
                this.Y0.setInterpolator(sr.h);
                this.Y0.setDuration(380L);
                this.Y0.start();
                return;
            }
            if (z10 && this.S0 && ((oiVar = this.f30023y0) == null || oiVar.J())) {
                vhVar.setVisibility(4);
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
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f29959e1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.Q0 != 0 || !this.f29995q1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void R1() {
        float alpha;
        int[] iArr = this.G0;
        yh yhVar = this.E0;
        yhVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            oi oiVar = this.f30023y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
            if ((oiVar == chatAttachAlertPhotoLayout || oiVar == this.f29994q0) && this.f29952c0) {
                ci.m6 m6Var = this.O0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.B2.getTop());
            } else {
                alpha = -yhVar.getHeight();
            }
            if (Math.abs(this.B2.getTranslationY() - alpha) > 0.5f) {
                this.B2.setTranslationY(alpha);
                this.B2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        e1();
    }

    public final void S1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.S1(int):void");
    }

    public final void T1() {
        boolean g10;
        float f7;
        float f10;
        float f11;
        oi oiVar = this.f30023y0;
        int i10 = 0;
        if (oiVar == null) {
            g10 = false;
        } else {
            g10 = oiVar.g();
        }
        bi.o oVar = this.f29963f1;
        oVar.setEnabled(g10);
        oi oiVar2 = this.f30023y0;
        float f12 = 0.5f;
        if (oiVar2 != null) {
            if (oiVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f30026z0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f29955d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        oi oiVar3 = this.f30026z0;
        if (oiVar3 != null) {
            if (oiVar3.g()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29955d0, f12, f7);
        }
        this.f29966g1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f29969h1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void U1(oi oiVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (oiVar != null) {
            ah.i iVar = this.C2;
            if (iVar != null && Build.VERSION.SDK_INT >= 31) {
                iVar.f(0.0f, i10);
            }
            int currentItemTop = oiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (oiVar == this.f30023y0 && currentItemTop <= oiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (oiVar == this.f30023y0) {
                    Q1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.qk.D(11.0f, i11, currentItemTop);
                oi oiVar2 = this.f30023y0;
                if (oiVar2 == oiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((oiVar2 instanceof sm) || (this.f30026z0 instanceof sm)) {
                    Object obj = this.f30006t1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f15565f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f29950b2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f29954c2 = i13;
                        return;
                    }
                    return;
                }
                this.f29954c2 = i13;
                iArr[i12] = D;
                X1(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void V1(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f29949b1) != null) {
            int i10 = 0;
            if (this.f29995q1 && this.f29971i0 && this.f30023y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f5612f = z12;
            if (!z10) {
                ((e6) uVar.f5613g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.f29953c1;
            if (z10 && this.f29995q1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(sr.h).withEndAction(new oh(this, z11, 0)).start();
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

    public final void W1(boolean z10) {
        boolean z11;
        float f7;
        oi oiVar = this.f29974j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f29994q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f29997r;
                if (e6Var == null) {
                    e6Var = this.resourcesProvider;
                }
                ?? oiVar2 = new oi(context, e6Var, this);
                oiVar2.f28336y = 0.0f;
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
                oiVar2.f28331n = e6Var;
                oiVar2.f27106f = true;
                oiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.a0 o9 = oiVar2.f27104b.X0.o();
                TextView textView = new TextView(context);
                oiVar2.f28335x = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = oiVar2.f27103a;
                am amVar = new am(oiVar2, context, o9, e6Var2, 1);
                y7 y7Var = oiVar2.f27104b.X0;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                y7Var.addView(amVar, 0, w7.y5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                amVar.addView(textView, w7.y5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(oiVar2, context, e6Var2, 14);
                oiVar2.f28332r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.z7(oiVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                oiVar2.f28333s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                rm rmVar = new rm(oiVar2, context);
                oiVar2.v = rmVar;
                rmVar.setClipToPadding(true);
                rmVar.setClipChildren(true);
                oiVar2.addView(w0Var, w7.y5.c(-1.0f, -1));
                oiVar2.P = oiVar2.f27104b.f29974j0;
                rmVar.f28032c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = oiVar2.P;
                rmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                rmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                rmVar.c();
                UndoView undoView = new UndoView(context, null, false, oiVar2.f27104b.f29997r);
                oiVar2.f28334w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                oiVar2.addView(undoView, w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                oiVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f29994q0 = oiVar2;
                oiVar2.bringToFront();
            }
            oi oiVar3 = this.f30023y0;
            sm smVar = this.f29994q0;
            if (oiVar3 != smVar) {
                oiVar = smVar;
            }
            N1(oiVar);
            return;
        }
        N1(oiVar);
    }

    public final void X0() {
        if (k1().f26144a.length() <= 0) {
            return;
        }
        this.f30023y0.a(k1().getText());
    }

    public final void X1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.X1(int):void");
    }

    public final boolean Y0() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if ((o2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) o2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void Y1() {
        int i10 = 0;
        X1(0);
        this.f29999r1.invalidate();
        ci.m6 m6Var = this.O0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
        if (chatAttachAlertPhotoLayout != null) {
            vl vlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (vlVar != null && vlVar.getFastScroll() != null) {
                fl0 fastScroll = vlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f22158p1;
                if (this.f29952c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.f24319h0 = currentActionBarHeight + i10;
                vlVar.getFastScroll().invalidate();
            }
        }
        R1();
        e1();
    }

    public final boolean Z0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.xn) o2Var).a(), o2Var, charSequence);
        }
        return false;
    }

    public final void a1() {
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
        wh whVar = this.f30024y1;
        if (whVar == null) {
            return;
        }
        int childCount = whVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            whVar.getChildAt(i20);
        }
        boolean z11 = this.f29970h2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.i6.f19137hg;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f19164j5;
        }
        this.f29975j1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.i6.f19137hg;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f19164j5;
        }
        this.f29989o1.setTextColor(getThemedColor(i11));
        this.f29963f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.i6.f19137hg;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.f19164j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.w0 w0Var = this.f29946a1;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.i6.f19156ig;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.I5;
        }
        org.telegram.ui.ActionBar.i6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.i6.E8;
        w0Var.G(getThemedColor(i21), false);
        w0Var.G(getThemedColor(i21), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f29953c1;
        if (w0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.i6.f19137hg;
            } else {
                i19 = org.telegram.ui.ActionBar.i6.f19164j5;
            }
            w0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f29959e1;
        if (w0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.i6.f19137hg;
            } else {
                i17 = org.telegram.ui.ActionBar.i6.f19164j5;
            }
            w0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = w0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.i6.f19156ig;
            } else {
                i18 = org.telegram.ui.ActionBar.i6.I5;
            }
            org.telegram.ui.ActionBar.i6.w1(getThemedColor(i18), background2);
        }
        yh yhVar = this.E0;
        org.telegram.ui.ActionBar.e6 e6Var = yhVar.M;
        gu guVar = yhVar.f26144a;
        int i22 = yhVar.L;
        if (i22 == 0) {
            guVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, e6Var));
            int i23 = org.telegram.ui.ActionBar.i6.G6;
            guVar.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i23, e6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i23, e6Var));
        } else if (i22 != 2 && i22 != 3) {
            guVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19353t5, e6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var));
        } else {
            guVar.setHintTextColor(-1929379841);
            guVar.setTextColor(-1);
            guVar.setCursorColor(-1);
            guVar.setHandlesColor(-1);
            guVar.setHighlightColor(822083583);
            guVar.quoteColor = -1;
        }
        yhVar.f26146c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
        hu huVar = yhVar.d;
        if (huVar != null) {
            huVar.S();
        }
        whVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.i6.f19137hg;
        } else {
            i14 = org.telegram.ui.ActionBar.i6.f19164j5;
        }
        int themedColor2 = getThemedColor(i14);
        y7 y7Var = this.X0;
        y7Var.E(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.i6.f19156ig;
        } else {
            i15 = org.telegram.ui.ActionBar.i6.I5;
        }
        y7Var.B(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.i6.f19137hg;
        } else {
            i16 = org.telegram.ui.ActionBar.i6.f19164j5;
        }
        y7Var.setTitleColor(getThemedColor(i16));
        int n12 = n1(false);
        org.telegram.ui.ActionBar.i6.w1(n12, this.shadowDrawable);
        fh.c cVar = this.D2;
        if (cVar.f9058a.getColor() != n12) {
            cVar.a(n12);
            jh.f fVar = this.f30012v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            xh xhVar = this.f30016w1;
            if (xhVar != null) {
                xhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
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
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.i6.f19146i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
    }

    public final void b1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.b1(boolean):void");
    }

    public final void c1() {
        float f7 = this.f29951c.e;
        float f10 = (1.0f - this.f29947b.e) * f7;
        this.f30016w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f30023y0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f29993p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f29996q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f29961f.e;
        float b10 = yf.e0.b(this.h.e);
        if (this.R1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b20.d(this.F0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
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
            C1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f30023y0.o(i10);
    }

    public final void e1() {
        di diVar = this.I0;
        vh vhVar = this.H0;
        ci.m6 m6Var = this.O0;
        if (m6Var != null && m6Var.getVisibility() == 0 && m6Var.getAlpha() != 0.0f) {
            float f7 = this.f29947b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            diVar.setAlpha(abs * abs * abs * abs);
            vhVar.setTranslationY(AndroidUtilities.lerp(this.f29967g2, ((m6Var.getTranslationY() + m6Var.getTop()) - vhVar.getTop()) + AndroidUtilities.dp(8.0f), sr.f28362j.getInterpolation(f7)));
            return;
        }
        vhVar.setTranslationY(this.f29967g2);
        diVar.setAlpha(1.0f);
    }

    public final void f1(int i10) {
        this.S0 = true;
        this.f30020x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f29978k1;
        if (w0Var != null) {
            this.f29975j1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f29975j1;
        textView.setText(string);
        this.S0 = false;
        this.f30020x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.f29971i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.w0 w0Var = this.f29978k1;
        if (w0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            w0Var.setVisibility(0);
            w0Var.setClickable(true);
            w0Var.setAlpha(1.0f);
            w0Var.setScaleX(1.0f);
            w0Var.setScaleY(1.0f);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
            if (i10 < oiVarArr.length) {
                oi oiVar = oiVarArr[i10];
                if (oiVar != null && (themeDescriptions = oiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f19146i5));
                return arrayList;
            }
        }
    }

    public final int h1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if ((o2Var instanceof org.telegram.ui.xn) && (messagePreviewParams = ((org.telegram.ui.xn) o2Var).f39758f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat i1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) o2Var).e;
        }
        return MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float j1() {
        vh vhVar = this.D0;
        float alpha = 1.0f - vhVar.getAlpha();
        return vhVar.getMeasuredHeight() - (alpha * (vhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final lu k1() {
        oi oiVar;
        if (this.f29952c0 && ((oiVar = this.f30023y0) == this.f29974j0 || oiVar == this.f29994q0)) {
            return this.P0;
        }
        return this.E0;
    }

    public final long l1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) o2Var).a();
        }
        return this.Z;
    }

    public final int m1(int i10) {
        oi oiVar = this.f30026z0;
        int[] iArr = this.f29950b2;
        if (oiVar != null && ((this.f30023y0 instanceof sm) || (oiVar instanceof sm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f29955d0);
        }
        return iArr[i10];
    }

    public final int n1(boolean z10) {
        boolean q6;
        int i10;
        y7 y7Var;
        if (this.f29970h2) {
            return getThemedColor(org.telegram.ui.ActionBar.i6.f19363tg);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        Iterator it = this.f29984n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            long longValue = ((Long) hVar.f14212a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += hVar.c();
            }
        }
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        if (z10 && (y7Var = this.X0) != null && y7Var.getVisibility() == 0) {
            a2 *= 1.0f - y7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.i6.f19001a7;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f19146i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void o1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.o1():void");
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
        if (y7Var.f19570n0) {
            y7Var.i(true);
        } else if (this.f30023y0.i()) {
        } else {
            if (k1() != null && k1().e) {
                k1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f30023y0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
        s91 s91Var = chatAttachAlertPhotoLayout.f22150l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f22146j0;
        TextView textView = chatAttachAlertPhotoLayout.f22157p0;
        vl vlVar = chatAttachAlertPhotoLayout.f22160r;
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
                if (vlVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.l0.B(222.0f, i13, i16), i14, org.telegram.messenger.l0.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.l0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (vlVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.l0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.l0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == s91Var) {
            if (z10) {
                if (vlVar.getVisibility() == 0) {
                    s91Var.layout(0, org.telegram.messenger.l0.B(310.0f, i13, i16), i14, org.telegram.messenger.l0.B(260.0f, i13, i16));
                    return true;
                }
                s91Var.layout(0, org.telegram.messenger.l0.B(176.0f, i13, i16), i14, org.telegram.messenger.l0.B(126.0f, i13, i16));
                return true;
            } else if (vlVar.getVisibility() == 0) {
                s91Var.layout(org.telegram.messenger.l0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                s91Var.layout(org.telegram.messenger.l0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (vlVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (vlVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != vlVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.l0.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
        jm jmVar = chatAttachAlertPhotoLayout.v;
        vl vlVar = chatAttachAlertPhotoLayout.f22160r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.f22162s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        fm fmVar = chatAttachAlertPhotoLayout.P;
        if (view == fmVar) {
            if (chatAttachAlertPhotoLayout.f22130b0 && !chatAttachAlertPhotoLayout.f22134d0) {
                fmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f22146j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            s91 s91Var = chatAttachAlertPhotoLayout.f22150l0;
            if (view == s91Var) {
                if (z10) {
                    s91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                s91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == vlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    vlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (b0Var.f42993o != 0) {
                        vlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        jmVar.l();
                    }
                } else {
                    vlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (b0Var.f42993o != 1) {
                        vlVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        b0Var.j1(1);
                        jmVar.l();
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
        this.f29974j0.setTranslationX(0.0f);
        this.f29986n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29996q2 = animatorSet;
        hi hiVar = this.f29990o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, hiVar, 0.0f, 400.0f));
        this.f29996q2.setDuration(400L);
        this.f29996q2.setStartDelay(20L);
        hiVar.set(this, Float.valueOf(0.0f));
        this.f29996q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new fh(this, 2));
        o1.k kVar = this.f29993p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f15555n, 0.0f);
        this.f29993p2 = kVar2;
        if (this.H1 != null) {
            kVar2.f15572u.a(0.75f);
            this.f29993p2.f15572u.b(350.0f);
        } else {
            kVar2.f15572u.a(0.75f);
            this.f29993p2.f15572u.b(350.0f);
        }
        this.f29993p2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.f3 f3Var = this.backDrawable;
        q6 q6Var = s6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(f3Var, q6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.o oVar = new org.telegram.messenger.video.o(this, animationNotificationsLocker, this.delegate, 14);
        this.f29993p2.a(new ei.m4(2, this, oVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, oVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        H1(0.0f);
        ofFloat2.addUpdateListener(new fh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(sr.f28359f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f30023y0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f30023y0.B(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f29962f0 instanceof org.telegram.ui.xn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f30023y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30003s1 = true;
        if (!this.M1 && !this.L1) {
            Y0();
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

    public final boolean p1() {
        if (this.f29952c0) {
            oi oiVar = this.f30023y0;
            if (oiVar == this.f29974j0 || oiVar == this.f29994q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        ui uiVar = this.Z1;
        if (uiVar != null && !this.f30009u1) {
            boolean c02 = uiVar.c0();
            this.f30009u1 = true;
            ci.y0 y0Var = new ci.y0(this, editTextBoldCursor, z10, 18);
            if (c02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(y0Var, j3);
        }
    }

    public final void r1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int n12 = n1(false);
            org.telegram.ui.ActionBar.i6.w1(n12, this.shadowDrawable);
            fh.c cVar = this.D2;
            if (cVar.f9058a.getColor() != n12) {
                cVar.a(n12);
                jh.f fVar = this.f30012v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                xh xhVar = this.f30016w1;
                if (xhVar != null) {
                    xhVar.invalidate();
                }
            }
            T1();
            this.containerView.invalidate();
        }
    }

    public final void s1() {
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
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
        yh yhVar = this.E0;
        if (yhVar != null) {
            yhVar.o();
        }
        ai aiVar = this.P0;
        if (aiVar != null) {
            aiVar.o();
        }
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        oi oiVar = this.f30023y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29974j0;
        if (oiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f22145i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            this.calcMandatoryInsets = ((org.telegram.ui.xn) o2Var).x9();
        }
        T1();
        this.f30003s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f29983m2) {
            this.f29983m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            r1();
        }
    }

    public final void t1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
            if (tL_attachMenuBot2.bot_id == user.f18476id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        c2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.q5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void u1() {
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
            if (i10 < oiVarArr.length) {
                oi oiVar = oiVarArr[i10];
                if (oiVar != null) {
                    oiVar.x();
                }
                i10++;
            } else {
                this.f29964f2 = true;
                return;
            }
        }
    }

    public final void v1() {
        int i10 = 0;
        this.f29964f2 = false;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
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

    public final void w1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (o2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) o2Var;
            MessageSuggestionParams messageSuggestionParams = xnVar.f39770g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.s5.U(i10, messageSuggestionParams.amount)) {
                xnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f30001s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.I0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                L1(o2Var);
                return;
            }
            return;
        }
        if (this.H1 == null && (o2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) o2Var;
            if (xnVar2.c()) {
                e5.M(getContext(), xnVar2.a(), new eh(this, 14), this.resourcesProvider);
                return;
            }
        }
        oi oiVar = this.f30023y0;
        if (oiVar != this.f29974j0 && oiVar != this.f29994q0) {
            if (!oiVar.I(0, true, 0, p1(), this.N0)) {
                this.A2 = true;
                dismiss();
                return;
            }
            return;
        }
        D1(0, true, 0, p1(), this.N0);
    }

    public final void x1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (i10 == 3) {
            if (this.N1 || !Y0()) {
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
                y1(true);
            }
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(o2Var)) {
            if (this.f29988o0 == null) {
                il ilVar = new il(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : false);
                this.f29988o0 = ilVar;
                this.f30015w0[5] = ilVar;
                dl dlVar = this.f30007t2;
                if (dlVar != null) {
                    ilVar.setDelegate(dlVar);
                } else if (o2Var instanceof org.telegram.ui.xn) {
                    ilVar.setDelegate(new eh(this, 18));
                }
            }
            N1(this.f29988o0);
        }
    }

    public final void y1(boolean z10) {
        if (!this.N1 && z10) {
            xn xnVar = new xn(3, getContext(), this.resourcesProvider, this);
            this.T = xnVar;
            N1(xnVar);
        }
        int i10 = 1;
        if (this.f29980l0 == null) {
            ij ijVar = new ij(getContext(), this.resourcesProvider, this);
            this.f29980l0 = ijVar;
            this.f30015w0[3] = ijVar;
            ijVar.setupBlurredSearchField(this.E2);
            this.f29980l0.setDelegate(new eh(this, 15));
            if (this.H) {
                this.f29980l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            TLRPC.Chat chat = ((org.telegram.ui.xn) o2Var).e;
            ij ijVar2 = this.f29980l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            ijVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            N1(this.f29980l0);
        }
    }

    public final void z1() {
        if (this.f29998r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
            ?? oiVar = new oi(context, e6Var, this);
            oiVar.f26067r = AndroidUtilities.dp(80.0f);
            oiVar.f26069w = 3;
            ai.w0 w0Var = new ai.w0(oiVar, context, e6Var, 11);
            oiVar.f26066n = w0Var;
            za zaVar = new za(oiVar, context);
            oiVar.v = zaVar;
            w0Var.setAdapter(zaVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A5, oiVar.f27103a));
            oiVar.addView(w0Var, w7.y5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(oiVar, 17));
            bi.l lVar = new bi.l(oiVar, oiVar.f26067r, 1);
            oiVar.f26068s = lVar;
            lVar.O = new ci.x1(oiVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f29998r0 = oiVar;
            oiVar.setDelegate(new gb(this, 1));
        }
        N1(this.f29998r0);
    }

    @Override
    public final void dismiss() {
        if (this.f30023y0.n() || isDismissed()) {
            return;
        }
        yh yhVar = this.E0;
        if (yhVar != null) {
            AndroidUtilities.hideKeyboard(yhVar.getEditText());
        }
        ai aiVar = this.P0;
        if (aiVar != null) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        this.f30019x0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.f29962f0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.A2 && o2Var != null && this.f30023y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.f30028z2) {
                return;
            }
            this.f30028z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new eh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18655a.setOnCancelListener(new kh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.N = b1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30015w0;
            if (i10 >= oiVarArr.length) {
                break;
            }
            oi oiVar = oiVarArr[i10];
            if (oiVar != null && this.f30023y0 != oiVar) {
                oiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7), 0), true, (AndroidUtilities.IntColorCallback) new eh(this, 12));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.f29973i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public wi(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}
