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
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
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
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ei1;

public class gi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, ud.b {
    public static final int K2 = 0;
    public final i0 A;
    public final mh A0;
    public final j6 A1;
    public final og.d A2;
    public boolean B;
    public final ImageView B0;
    public float B1;
    public final og.c B2;
    public boolean C;
    public final int[] C0;
    public int C1;
    public final jg.a C2;
    public boolean D;
    public final ih D0;
    public MessageObject D1;
    public final jg.a D2;
    public int E;
    public final rh E0;
    public boolean E1;
    public final wg E2;
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
    public final ag.y1 K0;
    public boolean K1;
    public boolean L;
    public final ph L0;
    public boolean L1;
    public h40 M;
    public int M0;
    public boolean M1;
    public boolean N;
    public bt N0;
    public boolean N1;
    public final dd0 O;
    public boolean O0;
    public int O1;
    public jn P;
    public boolean P0;
    public boolean P1;
    public j40 Q;
    public boolean Q0;
    public boolean Q1;
    public boolean R;
    public final float R0;
    public float R1;
    public boolean S;
    public long S0;
    public float S1;
    public sj T;
    public final ag.d2 T0;
    public ValueAnimator T1;
    public oi U;
    public AnimatorSet U0;
    public int U1;
    public long V;
    public AnimatorSet V0;
    public ei V1;
    public boolean W;
    public final org.telegram.ui.ActionBar.v0 W0;
    public tm W1;
    public final jg.b X;
    public final lh.v X0;
    public final int[] X1;
    public boolean Y;
    public final org.telegram.ui.ActionBar.v0 Y0;
    public int Y1;
    public float Z;
    public lh.w3 Z0;
    public float Z1;

    public final uh f28632a0;

    public final org.telegram.ui.ActionBar.v0 f28633a1;
    public float a2;

    public final ud.a f28634b;

    public final org.telegram.ui.ActionBar.n2 f28635b0;

    public final ag.e1 f28636b1;

    public boolean f28637b2;

    public final ud.a f28638c;

    public final boolean f28639c0;

    public float f28640c1;

    public float f28641c2;
    public final ud.a d;

    public ye f28642d0;

    public float f28643d1;

    public final boolean f28644d2;

    public final ud.a f28645e;

    public boolean f28646e0;

    public final ih f28647e1;

    public boolean f28648e2;

    public final ud.a f28649f;

    public final ChatAttachAlertPhotoLayout f28650f0;

    public final TextView f28651f1;

    public final ArrayList f28652f2;

    public lj f28653g0;

    public final org.telegram.ui.ActionBar.v0 f28654g1;

    public final Rect f28655g2;
    public final ud.a h;

    public ri f28656h0;

    public final LinearLayout f28657h1;

    public float f28658h2;

    public in f28659i0;

    public final ImageView f28660i1;

    public boolean f28661i2;

    public in f28662j0;

    public final LinearLayout f28663j1;

    public int f28664j2;

    public tk f28665k0;

    public final TextView f28666k1;

    public final uh f28667k2;

    public bk f28668l0;
    public float l1;

    public o1.j f28669l2;
    public em m0;

    public boolean f28670m1;

    public AnimatorSet f28671m2;

    public final ud.j f28672n;

    public ui f28673n0;

    public final wh f28674n1;

    public boolean f28675n2;

    public qf.e0 f28676o0;

    public boolean f28677o1;

    public boolean f28678o2;

    public ck f28679p0;

    public Object f28680p1;

    public ok f28681p2;

    public ck f28682q0;

    public boolean f28683q1;

    public boolean f28684q2;

    public org.telegram.ui.pn f28685r;

    public rh.p f28686r0;

    public final sg.f f28687r1;

    public boolean f28688r2;

    public final j6 f28689s;

    public final yh[] f28690s0;

    public final kh f28691s1;

    public File f28692s2;

    public final LongSparseArray f28693t0;

    public final ih f28694t1;

    public double[] f28695t2;

    public yh f28696u0;

    public final jh f28697u1;

    public boolean f28698u2;
    public final j6 v;

    public yh f28699v0;

    public final f2.k0 f28700v1;

    public boolean f28701v2;

    public final ImageView f28702w;

    public final lg.d f28703w0;

    public final di f28704w1;

    public boolean f28705w2;

    public final i0 f28706x;

    public final lg.d f28707x0;

    public boolean f28708x1;

    public lh.i f28709x2;

    public final ImageView f28710y;

    public final lh f28711y0;

    public final RadialProgressView f28712y1;

    public final jg.e f28713y2;

    public final ih f28714z0;

    public boolean f28715z1;

    public final og.d f28716z2;

    public gi(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.v0 v0Var;
        ag.e1 e1Var;
        int i10;
        float f10;
        super(context, c6Var, false, false);
        er erVar = er.h;
        this.f28634b = new ud.a(0, this, erVar, 380L, false);
        this.f28638c = new ud.a(1, this, erVar, 380L, false);
        this.d = new ud.a(2, this, erVar, 380L, false);
        this.f28645e = new ud.a(3, this, erVar, 380L, false);
        this.f28649f = new ud.a(4, this, erVar, 380L, true);
        this.h = new ud.a(5, this, erVar, 320L, false);
        ud.j jVar = new ud.j(new pg(this, 1), erVar, 380L);
        this.f28672n = jVar;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.Z = 0.0f;
        this.f28632a0 = new uh(this, 0);
        this.f28646e0 = false;
        yh[] yhVarArr = new yh[11];
        this.f28690s0 = yhVarArr;
        this.f28693t0 = new LongSparseArray();
        this.C0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Paint(1);
        this.Q0 = true;
        this.R0 = 1.0f;
        this.f28708x1 = false;
        this.f28715z1 = false;
        int i11 = UserConfig.selectedAccount;
        this.F1 = i11;
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
        this.f28648e2 = false;
        ArrayList arrayList = new ArrayList();
        this.f28652f2 = arrayList;
        Rect rect = new Rect();
        this.f28655g2 = rect;
        this.f28667k2 = new uh(this, 1);
        this.f28675n2 = true;
        this.f28678o2 = false;
        this.f28701v2 = false;
        this.f28705w2 = false;
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
        boolean z13 = n2Var instanceof org.telegram.ui.rn;
        og.c cVar = new og.c();
        this.B2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f28713y2 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.A2 = dVar;
            int i12 = 9;
            dVar.i(new n1.d(this, i12));
            og.d dVar2 = new og.d(null);
            this.f28716z2 = dVar2;
            dVar2.i(new m5.o(this, i12));
            jg.a aVar = new jg.a(dVar);
            this.C2 = aVar;
            aVar.f12944f = LiteMode.isEnabled(262144);
            jg.a aVar2 = new jg.a(dVar2);
            this.D2 = aVar2;
            aVar2.f12944f = LiteMode.isEnabled(262144);
        } else {
            this.f28713y2 = null;
            this.f28716z2 = null;
            this.A2 = null;
            this.C2 = new jg.a(cVar);
            this.D2 = new jg.a(cVar);
        }
        jg.a aVar3 = new jg.a(cVar);
        this.E2 = new wg(this, 0);
        this.f28644d2 = z10;
        this.f28639c0 = z13 && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f28635b0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        wh whVar = new wh(this, context);
        this.f28674n1 = whVar;
        whVar.setDelegate(new xh(this));
        this.containerView = whVar;
        whVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        ag.d2 d2Var = new ag.d2(this, context, c6Var, 2);
        this.T0 = d2Var;
        d2Var.O0 = true;
        d2Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        d2Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i14 = org.telegram.ui.ActionBar.g6.f23161j5;
        d2Var.D(getThemedColor(i14), false);
        int i15 = org.telegram.ui.ActionBar.g6.I5;
        d2Var.C(getThemedColor(i15), false);
        d2Var.setTitleColor(getThemedColor(i14));
        d2Var.setOccupyStatusBar(true);
        d2Var.setAlpha(0.0f);
        final int i16 = 4;
        d2Var.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.W0 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.ic_ab_other);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var2.setVisibility(4);
        v0Var2.setAlpha(0.0f);
        v0Var2.setScaleX(0.6f);
        v0Var2.setScaleY(0.6f);
        v0Var2.setSubMenuOpenSide(2);
        v0Var2.setDelegate(new pg(this, 8));
        v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        v0Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
        v0Var2.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i16) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.Y0 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        lh.v vVar = new lh.v();
        this.X0 = vVar;
        v0Var3.setIcon(vVar);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var3.setVisibility(8);
        v0Var3.setAlpha(0.0f);
        v0Var3.setScaleX(0.6f);
        v0Var3.setScaleY(0.6f);
        v0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        v0Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
        final int i17 = 5;
        v0Var3.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i17) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        ag.e1 e1Var2 = new ag.e1(this, context);
        e1Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        e1Var2.setText(LocaleController.getString(R.string.Create));
        e1Var2.setTypeface(AndroidUtilities.bold());
        e1Var2.setTextSize(1, 14.0f);
        e1Var2.setVisibility(4);
        e1Var2.setAlpha(0.0f);
        e1Var2.setGravity(17);
        e1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        e1Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i18 = 6;
        e1Var2.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i18) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        h7.b6.a(e1Var2);
        this.f28636b1 = e1Var2;
        W1();
        if (n2Var != null) {
            e1Var = e1Var2;
            v0Var = v0Var3;
            i10 = -1;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
            this.f28633a1 = v0Var4;
            v0Var4.setLongClickEnabled(false);
            v0Var4.setIcon(R.drawable.outline_header_search);
            v0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            v0Var4.setVisibility(4);
            v0Var4.setAlpha(0.0f);
            v0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            v0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
            v0Var4.setOnClickListener(new jh.a2(5, this, z11));
        } else {
            v0Var = v0Var3;
            e1Var = e1Var2;
            i10 = -1;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.f28654g1 = v0Var5;
        v0Var5.setLongClickEnabled(false);
        v0Var5.setIcon(R.drawable.ic_ab_other);
        v0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var5.setVisibility(8);
        v0Var5.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 3, i10));
        final int i19 = 2;
        v0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {

            public final gi f33079b;

            {
                this.f33079b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final gi giVar = this.f33079b;
                        mh mhVar = giVar.A0;
                        if (mhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(giVar.getContext(), c6Var);
                            e0Var.m0(mhVar.getText());
                            final int i20 = 0;
                            e0Var.f27883f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            mh mhVar2 = giVar.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar = giVar.L0;
                                            phVar.setText(charSequence);
                                            phVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = giVar.V;
                            boolean z14 = giVar.D1 != null;
                            yg ygVar = new yg(giVar, 0);
                            e0Var.f27885h0 = j10;
                            e0Var.f27886i0 = z14;
                            e0Var.f27887j0 = ygVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final gi giVar2 = this.f33079b;
                        ph phVar = giVar2.L0;
                        if (phVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(giVar2.getContext(), c6Var);
                            e0Var2.m0(phVar.getText());
                            final int i21 = 1;
                            e0Var2.f27883f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            mh mhVar2 = giVar2.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar2.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = giVar2.V;
                            boolean z15 = giVar2.D1 != null;
                            yg ygVar2 = new yg(giVar2, 1);
                            e0Var2.f27885h0 = j11;
                            e0Var2.f27886i0 = z15;
                            e0Var2.f27887j0 = ygVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        gi giVar3 = this.f33079b;
                        giVar3.f28654g1.M(null, null);
                        PhotoViewer photoViewerT1 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = giVar3.f28635b0;
                        photoViewerT1.K2(null, n2Var2, c6Var);
                        PhotoViewer.t1().L2(giVar3);
                        PhotoViewer photoViewerT2 = PhotoViewer.t1();
                        int i22 = giVar3.O1;
                        boolean z16 = giVar3.P1;
                        photoViewerT2.h = i22;
                        photoViewerT2.f35700n = z16;
                        if (!giVar3.V1.s()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(giVar3.getContainer().findFocus());
                        }
                        File fileW = lh.z7.w(giVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i23 = point.x;
                        int i24 = point.y;
                        if (i23 > 1080 || i24 > 1080) {
                            float fMin = Math.min(i23, i24) / 1080.0f;
                            i23 = (int) (i23 * fMin);
                            i24 = (int) (i24 * fMin);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i23, i24, Bitmap.Config.ARGB_8888);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileW));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        bitmapCreateBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileW.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new hh(giVar3, photoEntry), n2Var2 instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var2 : null);
                        if (giVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, giVar3.F);
                        }
                        break;
                }
            }
        });
        v0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        v0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i20 = 7;
        v0Var5.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i20) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        ih ihVar = new ih(this, context, 0);
        this.f28647e1 = ihVar;
        final int i21 = 8;
        ihVar.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i21) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        ihVar.setAlpha(0.0f);
        ihVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28657h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f28651f1 = textView;
        textView.setTextColor(getThemedColor(i14));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, h7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f28660i1 = imageView;
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(drawableMutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, h7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ihVar.addView(linearLayout, h7.z5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f28663j1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView2.setImageDrawable(drawableMutate2);
        linearLayout2.addView(imageView2, h7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f28666k1 = textView2;
        textView2.setTextColor(getThemedColor(i14));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, h7.z5.q(-2, -2, 16));
        ihVar.addView(linearLayout2, h7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.f28650f0 = chatAttachAlertPhotoLayout;
        yhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f28696u0 = chatAttachAlertPhotoLayout;
        this.S0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, h7.z5.c(-1.0f, -1));
        sg.f fVar = new sg.f(context);
        this.f28687r1 = fVar;
        fVar.setup(aVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, h7.z5.g());
        this.containerView.addView(ihVar, h7.z5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ag.y1 y1Var = new ag.y1(context);
        this.K0 = y1Var;
        this.containerView.addView(y1Var, h7.z5.e(-1, -2, 55));
        this.containerView.addView(d2Var, h7.z5.c(-2.0f, -1));
        this.containerView.addView(v0Var2, h7.z5.e(48, 48, 53));
        this.containerView.addView(v0Var, h7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var6 = this.f28633a1;
        if (v0Var6 != null) {
            this.containerView.addView(v0Var6, h7.z5.e(48, 48, 53));
        }
        ihVar.addView(v0Var5, h7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(e1Var, h7.z5.e(-2, 48, 53));
        ih ihVar2 = new ih(this, context, 1);
        this.f28694t1 = ihVar2;
        jh jhVar = new jh(context, 0);
        this.f28697u1 = jhVar;
        jhVar.setClipChildren(true);
        jhVar.setClipToPadding(false);
        di diVar = new di(this, context);
        this.f28704w1 = diVar;
        jhVar.setAdapter(diVar);
        f2.k0 k0Var = new f2.k0(0, false);
        this.f28700v1 = k0Var;
        jhVar.setLayoutManager(k0Var);
        jhVar.setVerticalScrollBarEnabled(false);
        jhVar.setHorizontalScrollBarEnabled(false);
        jhVar.setItemAnimator(null);
        jhVar.setLayoutAnimation(null);
        jhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        jhVar.f35297v2 = true;
        jhVar.setOverScrollMode(2);
        jg.a aVar4 = this.C2;
        qg.j jVar2 = new qg.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = jVar2;
        aVar4.f12943e = viewGroup2;
        jg.a aVar5 = this.D2;
        qg.j jVar3 = new qg.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = jVar3;
        aVar5.f12943e = viewGroup3;
        qg.j jVar4 = new qg.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = jVar4;
        aVar3.f12943e = viewGroup4;
        kh khVar = new kh(this, context, 0);
        this.f28691s1 = khVar;
        jg.b bVar = new jg.b(aVar3.c(khVar, null, false));
        this.X = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(khVar, h7.z5.g());
        lg.d dVarC = this.C2.c(ihVar2, ng.c.f(c6Var), false);
        dVarC.p(AndroidUtilities.dp(28.0f));
        dVarC.o(AndroidUtilities.dp(7.0f));
        ihVar2.setBackground(dVarC);
        jhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        jhVar.setClipToOutline(true);
        int iDp = AndroidUtilities.dp(11.0f);
        float fDp = AndroidUtilities.dp(28.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        jhVar.setOutlineProvider(new gf.q0(iDp, fDp));
        jhVar.setImportantForAccessibility(1);
        ihVar2.addView(jhVar, h7.z5.g());
        this.containerView.addView(ihVar2, h7.z5.e(-1, 70, 81));
        jhVar.setOnItemClickListener(new cg.x0(11, this, c6Var));
        jhVar.setOnItemLongClickListener(new pg(this, 3));
        final int i22 = 0;
        j6 j6Var = new j6(context, true, false, true);
        this.A1 = j6Var;
        j6Var.setVisibility(8);
        j6Var.setAlpha(0.0f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        int iDp2 = AndroidUtilities.dp(16.0f);
        j6Var.setPadding(iDp2, 0, iDp2, 0);
        j6Var.setTextSize(AndroidUtilities.dp(f10));
        j6Var.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i22) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        this.containerView.addView(j6Var, h7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f28712y1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, h7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f23441z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i23 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i23) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        ih ihVar3 = new ih(this, context, 2);
        this.f28714z0 = ihVar3;
        lh lhVar = new lh(this, context);
        this.f28711y0 = lhVar;
        ihVar3.addView(lhVar, h7.z5.e(-1, -1, 119));
        lg.d dVarC2 = this.D2.c(whVar, ng.c.m(c6Var), false);
        this.f28703w0 = dVarC2;
        dVarC2.f15601k = true;
        dVarC2.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        dVarC2.t(AndroidUtilities.dp(32.0f));
        dVarC2.h.f15585g = 0.4f;
        dVarC2.j();
        lg.d dVarC3 = this.C2.c(lhVar, ng.c.m(c6Var), false);
        this.f28707x0 = dVarC3;
        dVarC3.p(AndroidUtilities.dp(22.0f));
        dVarC3.o(AndroidUtilities.dp(7.0f));
        lhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        ihVar3.setWillNotDraw(false);
        ihVar3.setVisibility(4);
        ihVar3.setAlpha(0.0f);
        this.containerView.addView(ihVar3, h7.z5.e(-1, -2, 83));
        ihVar3.setOnTouchListener(new kh.e(13));
        j6 j6Var2 = new j6(context, false, false, false);
        this.f28689s = j6Var2;
        j6Var2.setAllowCancel(true);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setVisibility(8);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i24 = org.telegram.ui.ActionBar.g6.f23423y6;
        j6Var2.setTextColor(getThemedColor(i24));
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        lhVar.addView(j6Var2, h7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f28702w = imageView4;
        i0 i0Var = new i0(context);
        this.f28706x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.g6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        int i26 = org.telegram.ui.ActionBar.g6.f23144i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        lhVar.addView(imageView4, h7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        h7.b6.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) {

            public final gi f33079b;

            {
                this.f33079b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final gi giVar = this.f33079b;
                        mh mhVar = giVar.A0;
                        if (mhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(giVar.getContext(), c6Var);
                            e0Var.m0(mhVar.getText());
                            final int i28 = 0;
                            e0Var.f27883f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i28) {
                                        case 0:
                                            mh mhVar2 = giVar.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = giVar.V;
                            boolean z14 = giVar.D1 != null;
                            yg ygVar = new yg(giVar, 0);
                            e0Var.f27885h0 = j10;
                            e0Var.f27886i0 = z14;
                            e0Var.f27887j0 = ygVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final gi giVar2 = this.f33079b;
                        ph phVar = giVar2.L0;
                        if (phVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(giVar2.getContext(), c6Var);
                            e0Var2.m0(phVar.getText());
                            final int i29 = 1;
                            e0Var2.f27883f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i29) {
                                        case 0:
                                            mh mhVar2 = giVar2.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar2.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = giVar2.V;
                            boolean z15 = giVar2.D1 != null;
                            yg ygVar2 = new yg(giVar2, 1);
                            e0Var2.f27885h0 = j11;
                            e0Var2.f27886i0 = z15;
                            e0Var2.f27887j0 = ygVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        gi giVar3 = this.f33079b;
                        giVar3.f28654g1.M(null, null);
                        PhotoViewer photoViewerT1 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = giVar3.f28635b0;
                        photoViewerT1.K2(null, n2Var2, c6Var);
                        PhotoViewer.t1().L2(giVar3);
                        PhotoViewer photoViewerT2 = PhotoViewer.t1();
                        int i210 = giVar3.O1;
                        boolean z16 = giVar3.P1;
                        photoViewerT2.h = i210;
                        photoViewerT2.f35700n = z16;
                        if (!giVar3.V1.s()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(giVar3.getContainer().findFocus());
                        }
                        File fileW = lh.z7.w(giVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i211 = point.x;
                        int i212 = point.y;
                        if (i211 > 1080 || i212 > 1080) {
                            float fMin = Math.min(i211, i212) / 1080.0f;
                            i211 = (int) (i211 * fMin);
                            i212 = (int) (i212 * fMin);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i211, i212, Bitmap.Config.ARGB_8888);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileW));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        bitmapCreateBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileW.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new hh(giVar3, photoEntry), n2Var2 instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var2 : null);
                        if (giVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, giVar3.F);
                        }
                        break;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        mh mhVar = new mh(this, context, whVar, c6Var);
        this.A0 = mhVar;
        mhVar.F = true;
        mhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        mhVar.s();
        mhVar.getEditText().setLayoutParams(h7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        mhVar.getEditText().addTextChangedListener(new oh(this));
        lhVar.addView(mhVar, h7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        lhVar.setClipChildren(false);
        ihVar3.setClipChildren(false);
        mhVar.setClipChildren(false);
        y1Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        y1Var.setWillNotDraw(false);
        ph phVar = new ph(this, context, whVar, c6Var);
        this.L0 = phVar;
        phVar.F = true;
        phVar.getEditText().addTextChangedListener(new qh(this, n2Var));
        phVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        phVar.getEditText().setLayoutParams(h7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        phVar.getEditText().setTextSize(1, 17.0f);
        phVar.getEmojiButton().setLayoutParams(h7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        phVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        y1Var.addView(phVar, h7.z5.e(-1, -2, 119));
        y1Var.setAlpha(0.0f);
        y1Var.setVisibility(8);
        mhVar.addView(imageView3, h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        lg.d dVarC4 = this.C2.c(y1Var, ng.c.m(c6Var), false);
        dVarC4.p(AndroidUtilities.dp(22.0f));
        dVarC4.o(AndroidUtilities.dp(7.0f));
        y1Var.setBackground(dVarC4);
        y1Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        j6 j6Var3 = new j6(context, false, false, false);
        this.v = j6Var3;
        j6Var3.setScaleProperty(0.6f);
        j6Var3.setVisibility(8);
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setTextColor(getThemedColor(i24));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        j6Var3.setAllowCancel(true);
        y1Var.addView(j6Var3, h7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Xd), mode2));
        phVar.addView(imageView5, h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i28) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f28710y = imageView6;
        i0 i0Var2 = new i0(context);
        this.A = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        y1Var.addView(imageView6, h7.z5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        h7.b6.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) {

            public final gi f33079b;

            {
                this.f33079b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final gi giVar = this.f33079b;
                        mh mhVar2 = giVar.A0;
                        if (mhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(giVar.getContext(), c6Var);
                            e0Var.m0(mhVar2.getText());
                            final int i210 = 0;
                            e0Var.f27883f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i210) {
                                        case 0:
                                            mh mhVar3 = giVar.A0;
                                            mhVar3.setText(charSequence);
                                            mhVar3.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = giVar.V;
                            boolean z14 = giVar.D1 != null;
                            yg ygVar = new yg(giVar, 0);
                            e0Var.f27885h0 = j10;
                            e0Var.f27886i0 = z14;
                            e0Var.f27887j0 = ygVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final gi giVar2 = this.f33079b;
                        ph phVar2 = giVar2.L0;
                        if (phVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(giVar2.getContext(), c6Var);
                            e0Var2.m0(phVar2.getText());
                            final int i211 = 1;
                            e0Var2.f27883f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i211) {
                                        case 0:
                                            mh mhVar3 = giVar2.A0;
                                            mhVar3.setText(charSequence);
                                            mhVar3.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar3 = giVar2.L0;
                                            phVar3.setText(charSequence);
                                            phVar3.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = giVar2.V;
                            boolean z15 = giVar2.D1 != null;
                            yg ygVar2 = new yg(giVar2, 1);
                            e0Var2.f27885h0 = j11;
                            e0Var2.f27886i0 = z15;
                            e0Var2.f27887j0 = ygVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        gi giVar3 = this.f33079b;
                        giVar3.f28654g1.M(null, null);
                        PhotoViewer photoViewerT1 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = giVar3.f28635b0;
                        photoViewerT1.K2(null, n2Var2, c6Var);
                        PhotoViewer.t1().L2(giVar3);
                        PhotoViewer photoViewerT2 = PhotoViewer.t1();
                        int i212 = giVar3.O1;
                        boolean z16 = giVar3.P1;
                        photoViewerT2.h = i212;
                        photoViewerT2.f35700n = z16;
                        if (!giVar3.V1.s()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(giVar3.getContainer().findFocus());
                        }
                        File fileW = lh.z7.w(giVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i213 = point.x;
                        int i214 = point.y;
                        if (i213 > 1080 || i214 > 1080) {
                            float fMin = Math.min(i213, i214) / 1080.0f;
                            i213 = (int) (i213 * fMin);
                            i214 = (int) (i214 * fMin);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i213, i214, Bitmap.Config.ARGB_8888);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileW));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        bitmapCreateBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileW.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new hh(giVar3, photoEntry), n2Var2 instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var2 : null);
                        if (giVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, giVar3.F);
                        }
                        break;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        ih ihVar4 = new ih(this, context, 3);
        this.D0 = ihVar4;
        ihVar4.setFocusable(true);
        ihVar4.setFocusableInTouchMode(true);
        ihVar4.setVisibility(4);
        ihVar4.setScaleX(0.2f);
        ihVar4.setScaleY(0.2f);
        ihVar4.setAlpha(0.0f);
        ihVar4.setClipChildren(false);
        ihVar4.setClipToPadding(false);
        this.containerView.addView(ihVar4, h7.z5.e(110, 50, 85));
        rh rhVar = new rh(R.drawable.send_plane_24, context, c6Var, this);
        this.E0 = rhVar;
        rhVar.setImportantForAccessibility(2);
        ihVar4.addView(rhVar, h7.z5.e(-1, -1, 119));
        rhVar.setTranslationX(this.backgroundPaddingLeft);
        int iDp3 = AndroidUtilities.dp(52.0f);
        int iDp4 = AndroidUtilities.dp(38.0f);
        rhVar.E = iDp3;
        rhVar.F = iDp4;
        float fDp2 = AndroidUtilities.dp(7.0f);
        float fDp3 = AndroidUtilities.dp(6.0f);
        rhVar.I = fDp2;
        rhVar.J = fDp3;
        rhVar.f28994d0 = true;
        final int i30 = 3;
        rhVar.setOnClickListener(new View.OnClickListener(this) {

            public final gi f32769b;

            {
                this.f32769b = this;
            }

            @Override
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i30) {
                    case 0:
                        gi giVar = this.f32769b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.f28693t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.f32769b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                        }
                        break;
                    case 2:
                        gi giVar3 = this.f32769b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
                        }
                        break;
                    case 3:
                        this.f32769b.z1();
                        break;
                    case 4:
                        this.f32769b.W0.M(null, null);
                        break;
                    case 5:
                        gi.t(this.f32769b);
                        break;
                    case 6:
                        yh yhVar = this.f32769b.f28696u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                        }
                        break;
                    case 7:
                        this.f32769b.f28654g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.f32769b;
                        giVar4.Z1(giVar4.f28696u0 != giVar4.m0);
                        break;
                }
            }
        });
        rhVar.setOnLongClickListener(new org.telegram.ui.wf(this, context, c6Var, n2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        kh khVar2 = new kh(this, context, 1);
        khVar2.setAlpha(0.0f);
        khVar2.setScaleX(0.2f);
        khVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        ik0 fastScroll = chatAttachAlertPhotoLayout.A.getFastScroll();
        jg.a aVar6 = this.C2;
        mg.d dVarM = ng.c.m(c6Var);
        zk0 zk0Var = fastScroll.f29395k0;
        lg.d dVarC5 = aVar6.c(zk0Var.f35257b1, dVarM, false);
        fastScroll.f29381a0 = dVarC5;
        dVarC5.o(AndroidUtilities.dp(4.0f));
        fastScroll.f29381a0.p(AndroidUtilities.dp(24.0f));
        lg.d dVarC6 = aVar6.c(zk0Var.f35257b1, dVarM, false);
        fastScroll.f29383b0 = dVarC6;
        dVarC6.o(AndroidUtilities.dp(6.0f));
        fastScroll.f29383b0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f29383b0.p(AndroidUtilities.dp(f10));
        dd0 dd0Var = new dd0(context);
        this.O = dd0Var;
        this.containerView.addView(dd0Var, h7.z5.c(-1.0f, -1));
        mg.d dVar3 = new mg.d(c6Var);
        dVar3.f18050e = new pg(this, 4);
        dVar3.f18049c = new pg(this, 5);
        dVar3.d = new pg(this, 6);
        dVar3.f18048b = new pg(this, 7);
        float fDpf2 = AndroidUtilities.dpf2(3.3333333f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f18052n = fDpf2;
        dVar3.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f18051f = fDpf4;
        dVar3.h = fDpf5;
        d2Var.M(this.C2, dVar3, false);
        jVar.i(1L, false);
    }

    public static void M(gi giVar) {
        int alpha;
        ag.d2 d2Var = giVar.T0;
        sg.f fVar = giVar.f28687r1;
        if (fVar == null || d2Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = giVar.resourcesProvider;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        if (d2Var.getVisibility() == 0) {
            alpha = (int) (d2Var.getAlpha() * (zA ? 255 : 160));
        } else {
            alpha = 0;
        }
        fVar.setFadeTopAlpha(alpha);
    }

    public static void Q(gi giVar) {
        lh.i iVar = new lh.i(giVar, giVar.getContext(), giVar.V, LaunchActivity.R(), giVar.resourcesProvider, 1);
        giVar.f28709x2 = iVar;
        iVar.p(new o0.b(giVar, 6));
        ViewGroup viewGroup = giVar.containerView;
        viewGroup.addView(giVar.f28709x2, viewGroup.indexOfChild(giVar.f28714z0), h7.z5.e(-1, -1, 83));
        lh.i iVar2 = giVar.f28709x2;
        iVar2.getAdapter().f45923c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f45926e = false;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            iVar2.getAdapter().f45932i0 = false;
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            pf.u0 adapter = iVar2.getAdapter();
            rnVar.i();
            TLRPC.Chat chat = rnVar.f42026e;
            adapter.getClass();
            adapter.f45931h0 = chat;
            iVar2.getAdapter().W(rnVar.V7);
            iVar2.getAdapter().f45921a0 = rnVar.f42026e != null;
        } else {
            iVar2.getAdapter().f45932i0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f45921a0 = false;
        }
        iVar2.getAdapter().f45922b0 = false;
        giVar.U1();
    }

    public static void m(gi giVar, ValueAnimator valueAnimator) {
        giVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = giVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static void n(gi giVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        giVar.currentSheetAnimation = null;
        giVar.f28669l2 = null;
        animationNotificationsLocker.unlock();
        giVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (giVar.useHardwareLayer) {
            giVar.container.setLayerType(0, null);
        }
        if (giVar.isFullscreen) {
            WindowManager.LayoutParams attributes = giVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            giVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void p(gi giVar, int i10) {
        giVar.navBarColorKey = -1;
        giVar.navBarColor = i10;
        giVar.containerView.invalidate();
    }

    public static void q(gi giVar) {
        o1.j jVar = giVar.f28669l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(giVar.containerView, o1.h.f19130n, 0.0f);
        giVar.f28669l2 = jVar2;
        jVar2.f19147u.a(1.5f);
        giVar.f28669l2.f19147u.b(1500.0f);
        giVar.f28669l2.f();
    }

    public static boolean r(gi giVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.n2 n2Var, View view) throws Throwable {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.rn rnVar;
        boolean z10;
        boolean z11;
        MessageObject messageObject3;
        long j10;
        MessageObject messageObject4;
        HashMap<Object, Object> map;
        int i10;
        CharSequence charSequence;
        String string;
        MessageObject messageObject5;
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i11;
        Throwable th2;
        String str;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        long j11;
        org.telegram.ui.rn rnVar2;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        gi giVar2 = giVar;
        rh rhVar = giVar2.E0;
        org.telegram.ui.ActionBar.n2 n2Var2 = giVar2.f28635b0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = giVar2.f28650f0;
        int i13 = giVar2.F1;
        long jA = giVar2.V;
        if ((jA == 0 && !(n2Var2 instanceof org.telegram.ui.rn)) || giVar2.G - giVar2.H < 0 || giVar2.h.f48498f) {
            return false;
        }
        if (n2Var2 instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar3 = (org.telegram.ui.rn) n2Var2;
            TLRPC.User userI = rnVar3.i();
            MessageObject messageObject6 = rnVar3.f42095j5;
            MessageObject messageObject7 = rnVar3.f42057g5;
            if (rnVar3.c() || rnVar3.N3 == 5) {
                return false;
            }
            messageObject2 = messageObject7;
            messageObject = messageObject6;
            rnVar = rnVar3;
            user = userI;
            jA = rnVar3.a();
        } else {
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(jA));
            messageObject = null;
            messageObject2 = null;
            rnVar = null;
        }
        ye yeVar = giVar2.f28642d0;
        if (yeVar != null) {
            yeVar.dismiss();
        }
        ye yeVar2 = new ye(giVar2, context, c6Var, 1);
        giVar2.f28642d0 = yeVar2;
        yeVar2.r(rhVar, false, new gg.f(giVar2, n2Var, c6Var, 21));
        ArrayList arrayList = new ArrayList();
        yh yhVar = giVar2.f28696u0;
        if (yhVar == chatAttachAlertPhotoLayout2 || yhVar == giVar2.m0) {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout2;
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout2.getSelectedPhotosOrder();
            if (selectedPhotos.isEmpty()) {
                z10 = false;
                z11 = false;
                messageObject3 = null;
            } else {
                String str2 = "";
                int iCeil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                MessageObject messageObject8 = null;
                int i14 = 0;
                int i15 = 0;
                z10 = false;
                z11 = false;
                while (i14 < iCeil) {
                    int i16 = i14 * 10;
                    MessageObject messageObject9 = messageObject8;
                    MessageObject messageObject10 = messageObject2;
                    String str3 = str2;
                    int iMin = Math.min(10, selectedPhotos.size() - i16);
                    HashMap<Object, Object> map2 = selectedPhotos;
                    long jNextLong = Utilities.random.nextLong();
                    int i17 = i15;
                    int i18 = iCeil;
                    int i19 = 0;
                    while (i19 < iMin) {
                        int i20 = iMin;
                        int i21 = i16 + i19;
                        int i22 = i19;
                        if (i21 >= selectedPhotosOrder.size()) {
                            jA = jA;
                            i10 = i14;
                            map = map2;
                        } else {
                            HashMap<Object, Object> map3 = map2;
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) map3.get(selectedPhotosOrder.get(i21));
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            int i23 = i17 + 1;
                            tL_message.f22401id = i17;
                            map = map3;
                            tL_message.out = true;
                            i10 = i14;
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(jA);
                            boolean z15 = photoEntry.isVideo;
                            if (z15 || (str = photoEntry.imagePath) == null) {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            } else {
                                tL_message.attachPath = str;
                            }
                            if (i20 > 0) {
                                tL_message.grouped_id = jNextLong;
                            }
                            int i24 = photoEntry.width;
                            int i25 = photoEntry.height;
                            int i26 = photoEntry.orientation;
                            if (z15) {
                                if (photoEntry.videoOrientation == -1) {
                                    try {
                                        MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                        try {
                                            if (!photoEntry.isLivePhoto() || photoEntry.livePhotoVideoOffset <= 0) {
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                try {
                                                    mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                                    parcelFileDescriptor = null;
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    i11 = 0;
                                                    parcelFileDescriptor = null;
                                                    photoEntry.videoOrientation = i11;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        try {
                                                            mediaMetadataRetriever2.release();
                                                        } catch (IOException e10) {
                                                            FileLog.e(e10);
                                                        }
                                                    }
                                                    if (parcelFileDescriptor != null) {
                                                        try {
                                                            parcelFileDescriptor.close();
                                                        } catch (IOException e11) {
                                                            FileLog.e(e11);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th = th;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    parcelFileDescriptor = null;
                                                    if (mediaMetadataRetriever != null) {
                                                        try {
                                                            mediaMetadataRetriever.release();
                                                        } catch (IOException e12) {
                                                            FileLog.e(e12);
                                                        }
                                                    }
                                                    if (parcelFileDescriptor == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        parcelFileDescriptor.close();
                                                        throw th;
                                                    } catch (IOException e13) {
                                                        FileLog.e(e13);
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                File file = new File(photoEntry.path);
                                                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                                                try {
                                                    parcelFileDescriptor = parcelFileDescriptorOpen;
                                                    try {
                                                        mediaMetadataRetriever3.setDataSource(parcelFileDescriptorOpen.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i11 = 0;
                                                        photoEntry.videoOrientation = i11;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                            mediaMetadataRetriever2.release();
                                                        }
                                                        if (parcelFileDescriptor != null) {
                                                            parcelFileDescriptor.close();
                                                        }
                                                        i26 = photoEntry.videoOrientation;
                                                        if ((i26 / 90) % 2 != 0) {
                                                            i25 = i24;
                                                            i24 = i25;
                                                        }
                                                        if (photoEntry.isLivePhoto()) {
                                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                                            tL_message.media = tL_messageMediaPhoto;
                                                            tL_messageMediaPhoto.live_photo = true;
                                                            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                                            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                                            tL_photoSize.f22405w = i24;
                                                            tL_photoSize.h = i25;
                                                            tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                            tL_message.media.photo.sizes.add(tL_photoSize);
                                                            tL_message.media.document = new TLRPC.TL_document();
                                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                            tL_documentAttributeVideo.f22387w = i24;
                                                            tL_documentAttributeVideo.h = i25;
                                                            tL_documentAttributeVideo.duration = photoEntry.duration;
                                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                                        } else if (photoEntry.isVideo) {
                                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                            tL_message.media = tL_messageMediaDocument;
                                                            tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                                            tL_documentAttributeVideo2.f22387w = i24;
                                                            tL_documentAttributeVideo2.h = i25;
                                                            tL_documentAttributeVideo2.duration = photoEntry.duration;
                                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                                        } else {
                                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                                            tL_message.media = tL_messageMediaPhoto2;
                                                            tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                                            tL_photoSize2.f22405w = i24;
                                                            tL_photoSize2.h = i25;
                                                            tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                            tL_message.media.photo.sizes.add(tL_photoSize2);
                                                        }
                                                        tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                        charSequence = photoEntry.caption;
                                                        if (charSequence == null) {
                                                            string = str3;
                                                        } else {
                                                            string = charSequence.toString();
                                                        }
                                                        tL_message.message = string;
                                                        if (TextUtils.isEmpty(string)) {
                                                            CharSequence[] charSequenceArr = {giVar2.m1().getText()};
                                                            MessageObject.addLinks(true, charSequenceArr[0]);
                                                            tL_message.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr, true);
                                                            tL_message.message = charSequenceArr[0].toString();
                                                        }
                                                        if (i10 == 0) {
                                                            tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                            if (messageObject10 != null) {
                                                                tL_messageReplyHeader.flags |= 2;
                                                                tL_messageReplyHeader.reply_to_top_id = messageObject10.getId();
                                                            }
                                                            tL_messageReplyHeader.flags |= 16;
                                                            tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                            tL_message.reply_to = tL_messageReplyHeader;
                                                        }
                                                        messageObject5 = new MessageObject(i13, tL_message, true, false);
                                                        if (i10 == 0) {
                                                            messageObject5.replyMessageObject = messageObject;
                                                        }
                                                        messageObject5.sendPreviewEntry = photoEntry;
                                                        messageObject5.sendPreview = true;
                                                        messageObject5.notime = true;
                                                        messageObject5.isOutOwnerCached = Boolean.TRUE;
                                                        arrayList.add(messageObject5);
                                                        if (messageObject9 == null) {
                                                            messageObject9 = messageObject5;
                                                        }
                                                        i17 = i23;
                                                        z10 = true;
                                                        z11 = true;
                                                        i19 = i22 + 1;
                                                        selectedPhotosOrder = selectedPhotosOrder;
                                                        iMin = i20;
                                                        map2 = map;
                                                        i14 = i10;
                                                        jA = jA;
                                                    } catch (Throwable th4) {
                                                        th2 = th4;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        th = th2;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        if (mediaMetadataRetriever != null) {
                                                            mediaMetadataRetriever.release();
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                            throw th;
                                                        }
                                                        parcelFileDescriptor.close();
                                                        throw th;
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    parcelFileDescriptor = parcelFileDescriptorOpen;
                                                } catch (Throwable th5) {
                                                    th2 = th5;
                                                    parcelFileDescriptor = parcelFileDescriptorOpen;
                                                }
                                            }
                                            try {
                                                try {
                                                    photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                    try {
                                                        mediaMetadataRetriever2.release();
                                                    } catch (IOException e16) {
                                                        FileLog.e(e16);
                                                    }
                                                    if (parcelFileDescriptor != null) {
                                                        parcelFileDescriptor.close();
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    i11 = 0;
                                                    photoEntry.videoOrientation = i11;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        mediaMetadataRetriever2.release();
                                                    }
                                                    if (parcelFileDescriptor != null) {
                                                        parcelFileDescriptor.close();
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                th = th2;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                if (mediaMetadataRetriever != null) {
                                                    mediaMetadataRetriever.release();
                                                }
                                                if (parcelFileDescriptor == null) {
                                                    throw th;
                                                }
                                                parcelFileDescriptor.close();
                                                throw th;
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        mediaMetadataRetriever = null;
                                    }
                                }
                                i26 = photoEntry.videoOrientation;
                            }
                            if ((i26 / 90) % 2 != 0) {
                                i25 = i24;
                                i24 = i25;
                            }
                            if (photoEntry.isLivePhoto()) {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto3 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto3;
                                tL_messageMediaPhoto3.live_photo = true;
                                tL_messageMediaPhoto3.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize3 = new TLRPC.TL_photoSize();
                                tL_photoSize3.f22405w = i24;
                                tL_photoSize3.h = i25;
                                tL_photoSize3.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize3);
                                tL_message.media.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo3 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo3.f22387w = i24;
                                tL_documentAttributeVideo3.h = i25;
                                tL_documentAttributeVideo3.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo3);
                            } else if (photoEntry.isVideo) {
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument2;
                                tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo4 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo4.f22387w = i24;
                                tL_documentAttributeVideo4.h = i25;
                                tL_documentAttributeVideo4.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo4);
                            } else {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto4 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto4;
                                tL_messageMediaPhoto4.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize4 = new TLRPC.TL_photoSize();
                                tL_photoSize4.f22405w = i24;
                                tL_photoSize4.h = i25;
                                tL_photoSize4.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize4);
                            }
                            tL_message.media.spoiler = photoEntry.hasSpoiler;
                            charSequence = photoEntry.caption;
                            if (charSequence == null) {
                                string = str3;
                            } else {
                                string = charSequence.toString();
                            }
                            tL_message.message = string;
                            if (TextUtils.isEmpty(string) && i10 == 0 && i22 == 0) {
                                CharSequence[] charSequenceArr2 = {giVar2.m1().getText()};
                                MessageObject.addLinks(true, charSequenceArr2[0]);
                                tL_message.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                                tL_message.message = charSequenceArr2[0].toString();
                            }
                            if (i10 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                if (messageObject10 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = messageObject10.getId();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            messageObject5 = new MessageObject(i13, tL_message, true, false);
                            if (i10 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject5.replyMessageObject = messageObject;
                            }
                            messageObject5.sendPreviewEntry = photoEntry;
                            messageObject5.sendPreview = true;
                            messageObject5.notime = true;
                            messageObject5.isOutOwnerCached = Boolean.TRUE;
                            arrayList.add(messageObject5);
                            if (messageObject9 == null && !TextUtils.isEmpty(tL_message.message)) {
                                messageObject9 = messageObject5;
                            }
                            i17 = i23;
                            z10 = true;
                            z11 = true;
                        }
                        i19 = i22 + 1;
                        selectedPhotosOrder = selectedPhotosOrder;
                        iMin = i20;
                        map2 = map;
                        i14 = i10;
                        jA = jA;
                    }
                    i14++;
                    iCeil = i18;
                    str2 = str3;
                    messageObject2 = messageObject10;
                    selectedPhotos = map2;
                    i15 = i17;
                    messageObject8 = messageObject9;
                }
                messageObject3 = messageObject8;
            }
            j10 = jA;
            messageObject4 = messageObject3;
        } else if (yhVar == giVar2.f28653g0) {
            if (TextUtils.isEmpty(giVar2.m1().getText())) {
                i12 = 0;
                z14 = false;
            } else {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.f22401id = 0;
                tL_message2.out = true;
                tL_message2.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                tL_message2.peer_id = MessagesController.getInstance(i13).getPeer(jA);
                CharSequence[] charSequenceArr3 = {giVar2.m1().getText()};
                MessageObject.addLinks(true, charSequenceArr3[0]);
                tL_message2.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr3, true);
                tL_message2.message = charSequenceArr3[0].toString();
                MessageObject messageObject11 = new MessageObject(i13, tL_message2, true, false);
                messageObject11.sendPreview = true;
                messageObject11.notime = true;
                messageObject11.isOutOwnerCached = Boolean.TRUE;
                arrayList.add(messageObject11);
                i12 = 1;
                z14 = true;
            }
            ArrayList<TLRPC.User> selected = giVar2.f28653g0.getSelected();
            int i27 = 0;
            while (i27 < selected.size()) {
                TLRPC.User user2 = selected.get(i27);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                int i28 = i12 + 1;
                tL_message3.f22401id = i12;
                ArrayList<TLRPC.User> arrayList2 = selected;
                tL_message3.out = true;
                tL_message3.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                tL_message3.peer_id = MessagesController.getInstance(i13).getPeer(jA);
                TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                tL_message3.media = tL_messageMediaContact;
                tL_messageMediaContact.phone_number = user2.phone;
                tL_messageMediaContact.first_name = user2.first_name;
                tL_messageMediaContact.last_name = user2.last_name;
                if (user2.restriction_reason.isEmpty() || !user2.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                    tL_message3.media.vcard = "";
                } else {
                    tL_message3.media.vcard = user2.restriction_reason.get(0).text;
                }
                tL_message3.media.user_id = user2.f22527id;
                MessageObject messageObject12 = new MessageObject(i13, tL_message3, true, false);
                messageObject12.sendPreview = true;
                messageObject12.notime = true;
                messageObject12.isOutOwnerCached = Boolean.TRUE;
                arrayList.add(messageObject12);
                i27++;
                i12 = i28;
                selected = arrayList2;
                z14 = true;
            }
            messageObject4 = null;
            z10 = false;
            giVar2 = giVar;
            j10 = jA;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout2;
            if (yhVar == giVar2.f28668l0) {
                messageObject4 = null;
                boolean z16 = false;
                int i29 = 0;
                for (int i30 = 0; i30 < giVar2.f28668l0.O.size(); i30++) {
                    String str5 = (String) giVar2.f28668l0.O.get(i30);
                    if (str5 != null) {
                        int iLastIndexOf = str5.lastIndexOf(File.separator);
                        String strSubstring = iLastIndexOf < 0 ? str5 : str5.substring(iLastIndexOf + 1);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i31 = i29 + 1;
                            tL_message4.f22401id = i29;
                            tL_message4.out = true;
                            tL_message4.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message4.peer_id = MessagesController.getInstance(i13).getPeer(jA);
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                            tL_message4.media = tL_messageMediaDocument3;
                            tL_message4.attachPath = str5;
                            tL_messageMediaDocument3.document = new TLRPC.TL_document();
                            TLRPC.Document document = tL_message4.media.document;
                            document.file_name = strSubstring;
                            document.size = new File(str5).length();
                            if (TextUtils.isEmpty(tL_message4.message) && i30 == 0) {
                                z12 = true;
                                z13 = false;
                                CharSequence[] charSequenceArr4 = {giVar2.m1().getText()};
                                tL_message4.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr4, true);
                                tL_message4.message = charSequenceArr4[0].toString();
                            } else {
                                z12 = true;
                                z13 = false;
                            }
                            MessageObject messageObject13 = new MessageObject(i13, tL_message4, z12, z13);
                            messageObject13.attachPathExists = z12;
                            messageObject13.sendPreview = z12;
                            messageObject13.notime = z12;
                            messageObject13.isOutOwnerCached = Boolean.TRUE;
                            arrayList.add(messageObject13);
                            if (i30 == 0 && messageObject4 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                messageObject4 = messageObject13;
                            }
                            i29 = i31;
                            z16 = true;
                        }
                    }
                }
                j10 = jA;
                z11 = z16;
                z10 = false;
            } else {
                ri riVar = giVar2.f28656h0;
                if (yhVar == riVar) {
                    arrayList.addAll(riVar.getSelected());
                    if (arrayList.isEmpty()) {
                        messageObject4 = null;
                    } else {
                        messageObject4 = (MessageObject) arrayList.get(0);
                        CharSequence[] charSequenceArr5 = {giVar2.m1().getText()};
                        MessageObject.addLinks(true, charSequenceArr5[0]);
                        messageObject4.messageOwner.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr5, true);
                        messageObject4.messageOwner.message = charSequenceArr5[0].toString();
                        if (TextUtils.isEmpty(messageObject4.messageOwner.message)) {
                            messageObject4 = null;
                        } else {
                            messageObject4.generateCaption();
                        }
                    }
                    if (arrayList.size() > 1) {
                        for (int i32 = 0; i32 < Math.ceil(arrayList.size() / 10.0f); i32++) {
                            int i33 = i32 * 10;
                            int iMin2 = Math.min(10, arrayList.size() - i33);
                            long jNextLong2 = Utilities.random.nextLong();
                            for (int i34 = 0; i34 < iMin2; i34++) {
                                int i35 = i33 + i34;
                                if (i35 < arrayList.size()) {
                                    ((MessageObject) arrayList.get(i35)).messageOwner.grouped_id = jNextLong2;
                                }
                            }
                        }
                    }
                    j10 = jA;
                    z10 = false;
                    z11 = true;
                } else {
                    j10 = jA;
                    messageObject4 = null;
                    z10 = false;
                    z11 = false;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        b70 b70VarF = b70.F(giVar2.containerView, c6Var, rhVar);
        if (messageObject4 != null) {
            yh yhVar2 = giVar2.f28696u0;
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
            if (yhVar2 == chatAttachAlertPhotoLayout || yhVar2 == giVar2.m0) {
                fb0 fb0Var = new fb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), c6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = giVar2.Y;
                message.invert_media = z17;
                fb0Var.a(!z17, false);
                fb0Var.setOnClickListener(new gg.f(giVar2, messageObject4, fb0Var, 22));
                b70VarF.q(fb0Var);
                if (giVar2.D1 == null) {
                    b70VarF.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
        }
        boolean zIsUserSelf = UserObject.isUserSelf(user);
        if (giVar2.D1 != null || ((rnVar != null && ChatObject.isMonoForum(rnVar.f42026e)) || ((rnVar == null || !rnVar.D6()) && !giVar2.f28696u0.c()))) {
            j11 = j10;
        } else {
            j11 = j10;
            b70VarF.c(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new e5.u(giVar2, j11, c6Var, 22), false);
        }
        yh yhVar3 = giVar2.f28696u0;
        if ((yhVar3 == chatAttachAlertPhotoLayout || yhVar3 == giVar2.m0) && yhVar3.getSelectedItemsCount() == 1 && rnVar != null && ChatObject.isMonoForum(rnVar.f42026e)) {
            rnVar2 = rnVar;
            b70VarF.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new org.telegram.messenger.pg(giVar2, j11, rnVar2, c6Var, 4), false);
        } else {
            rnVar2 = rnVar;
        }
        if (giVar2.D1 == null && !zIsUserSelf) {
            b70VarF.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new sg(giVar2, 1), false);
        }
        if (giVar2.D1 == null && z10 && rnVar2 != null && ChatObject.isChannelAndNotMegaGroup(rnVar2.f42026e) && (chatFull = rnVar2.V7) != null && chatFull.paid_media_allowed) {
            b70VarF.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.f1 f1VarY = b70VarF.y();
            f1VarY.setOnClickListener(new gh.a4(giVar2, context, f1VarY, c6Var, 13));
            long starsPrice = chatAttachAlertPhotoLayout.getStarsPrice();
            if (starsPrice > 0) {
                f1VarY.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                f1VarY.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                f1VarY.setText(LocaleController.getString(R.string.PaidMediaButton));
                f1VarY.setSubtext(null);
            }
            giVar2.f28642d0.s(starsPrice);
        }
        b70VarF.Y();
        giVar2.f28642d0.p(b70VarF);
        giVar2.f28642d0.q(arrayList);
        if (giVar2.D1 == null && j11 >= 0 && z11) {
            giVar2.f28642d0.d(n2Var);
            giVar2.f28642d0.o(giVar2.J0);
        }
        giVar2.f28642d0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void s(gi giVar, org.telegram.ui.ActionBar.i3 i3Var) {
        AnimatorSet animatorSet = giVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        i3Var.run();
    }

    public static void t(gi giVar) {
        if (giVar.f28650f0 == null) {
            return;
        }
        boolean zS = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !zS;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(zS);
                        for (int i10 = 0; i10 < chatAttachAlertPhotoLayout.A.getChildCount(); i10++) {
                            View childAt = chatAttachAlertPhotoLayout.A.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q5) {
                                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                if (q5Var.getPhotoEntry() == photoEntry) {
                                    q5Var.getImageView().invalidate();
                                }
                            }
                        }
                    }
                }
            }
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
            SharedConfig.photoLiveDefault = z10;
            editorEdit.putBoolean("photoLiveDefault", z10).apply();
            chatAttachAlertPhotoLayout.v0();
        }
        giVar.Y1(true);
        org.telegram.ui.ActionBar.v0 v0Var = giVar.Y0;
        lh.w3 w3Var = giVar.Z0;
        if (w3Var != null) {
            w3Var.e(true);
        }
        lh.w3 w3Var2 = new lh.w3(giVar.getContext(), 1);
        giVar.Z0 = w3Var2;
        w3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(!zS ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        giVar.Z0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        giVar.Z0.n(1.0f, -((giVar.containerView.getWidth() - ((v0Var.getWidth() / 2.0f) + v0Var.getX())) - AndroidUtilities.dp(14.0f)));
        giVar.Z0.setTranslationY(giVar.W0.getTranslationY());
        lh.w3 w3Var3 = giVar.Z0;
        w3Var3.f16984h0 = new org.telegram.ui.yq(12, giVar, w3Var2);
        giVar.containerView.addView(w3Var3, h7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        giVar.Z0.v();
    }

    public static void u(gi giVar, boolean z10, sg sgVar) {
        giVar.f28696u0.t(1.0f);
        giVar.f28699v0.t(1.0f);
        giVar.f28696u0.k(giVar.f28658h2);
        giVar.f28699v0.k(giVar.f28658h2);
        giVar.containerView.invalidate();
        giVar.T0.setTag(z10 ? 1 : null);
        sgVar.run();
    }

    public static void w(gi giVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        gi giVar2 = giVar;
        jh jhVar = giVar2.f28697u1;
        yh[] yhVarArr = giVar2.f28690s0;
        org.telegram.ui.ActionBar.n2 n2Var = giVar2.f28635b0;
        org.telegram.ui.ActionBar.n2 n2VarR = n2Var == null ? LaunchActivity.R() : n2Var;
        if (n2VarR == null || n2VarR.getParentActivity() == null) {
            return;
        }
        if (view instanceof ai) {
            Activity parentActivity = n2VarR.getParentActivity();
            int iIntValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (iIntValue == 1) {
                if (!giVar2.H1 && !giVar2.I1 && giVar2.a1()) {
                    return;
                }
                if (!giVar2.H1 && !giVar2.I1) {
                    jn jnVar = new jn(1, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar;
                    giVar2.Q1(jnVar);
                }
                giVar2.Q1(giVar2.f28650f0);
            } else if (iIntValue == 3) {
                if (!giVar2.J1 && giVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(giVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                giVar2.B1(true);
            } else if (iIntValue == 4) {
                if (!giVar2.G1 && giVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(giVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                giVar2.E1(true);
            } else if (iIntValue == 5) {
                if (!giVar2.M1 && giVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && giVar2.M1 && giVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(giVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                giVar2.D1();
            } else if (iIntValue == 6) {
                if ((!giVar2.M1 && giVar2.a1()) || !AndroidUtilities.isMapsInstalled(n2Var)) {
                    return;
                }
                if (giVar2.M1) {
                    if (giVar2.f28665k0 == null) {
                        tk tkVar = new tk(giVar2, giVar2.getContext(), c6Var, (giVar2.D || giVar2.N1) ? false : true);
                        giVar2.f28665k0 = tkVar;
                        yhVarArr[5] = tkVar;
                        ok okVar = giVar2.f28681p2;
                        if (okVar != null) {
                            tkVar.setDelegate(okVar);
                        } else {
                            tkVar.setDelegate(new pg(giVar2, 9));
                        }
                    }
                    giVar2.Q1(giVar2.f28665k0);
                } else {
                    jn jnVar2 = new jn(6, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar2;
                    giVar2.Q1(jnVar2);
                }
            } else if (iIntValue == 9) {
                if (!giVar2.K1 && giVar2.a1()) {
                    return;
                }
                if (giVar2.K1) {
                    giVar2.S1(true, null);
                } else {
                    jn jnVar3 = new jn(9, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar3;
                    giVar2.Q1(jnVar3);
                }
            } else if (iIntValue == 11) {
                if (giVar2.f28676o0 == null) {
                    qf.e0 e0Var = new qf.e0(giVar2.getContext(), giVar2.resourcesProvider, giVar2);
                    giVar2.f28676o0 = e0Var;
                    yhVarArr[7] = e0Var;
                    e0Var.setupBlurredSearchField(giVar2.C2);
                }
                giVar2.Q1(giVar2.f28676o0);
            } else if (iIntValue == 12) {
                if (!giVar2.L1 && giVar2.a1()) {
                    return;
                }
                if (giVar2.L1) {
                    if (giVar2.f28662j0 == null) {
                        in inVar = new in(giVar, giVar.getContext(), true, c6Var, null);
                        giVar2 = giVar;
                        giVar2.f28662j0 = inVar;
                        yhVarArr[1] = inVar;
                        inVar.setDelegate(new pg(giVar2, 10));
                    }
                    giVar2.Q1(giVar2.f28662j0);
                } else {
                    jn jnVar4 = new jn(9, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar4;
                    giVar2.Q1(jnVar4);
                }
            } else if (iIntValue == 13) {
                if (giVar2.f28682q0 == null) {
                    ck ckVar = new ck(giVar2, giVar2.getContext(), c6Var, true);
                    giVar2.f28682q0 = ckVar;
                    yhVarArr[8] = ckVar;
                    ckVar.setDelegate(giVar2.W1);
                }
                giVar2.Q1(giVar2.f28682q0);
            } else if (iIntValue == 14) {
                if (giVar2.f28679p0 == null) {
                    ck ckVar2 = new ck(giVar2, giVar2.getContext(), c6Var, false);
                    giVar2.f28679p0 = ckVar2;
                    yhVarArr[9] = ckVar2;
                    ckVar2.setDelegate(giVar2.W1);
                }
                giVar2.Q1(giVar2.f28679p0);
            } else if (iIntValue == 16) {
                if (giVar2.f28686r0 == null) {
                    rh.p pVar = new rh.p(giVar2.F1, giVar2.getContext(), c6Var, giVar2);
                    giVar2.f28686r0 = pVar;
                    yhVarArr[10] = pVar;
                }
                giVar2.Q1(giVar2.f28686r0);
            } else if (view.getTag() instanceof Integer) {
                giVar2.V1.n0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, giVar2.s1(), false, 0L);
            }
        } else if (view instanceof zh) {
            zh zhVar = (zh) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = zhVar.f35239c;
            if (tL_attachMenuBot == null) {
                giVar2.V1.g0(zhVar.f35238b);
                giVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                ei1.a(giVar2.getContext(), new jh.y1(5, giVar2, zhVar), null);
            } else {
                giVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int iDp = AndroidUtilities.dp(70.0f);
        int i12 = left - iDp;
        if (i12 < 0) {
            jhVar.v0(i12, 0, null);
            return;
        }
        int i13 = right + iDp;
        if (i13 > jhVar.getMeasuredWidth()) {
            jhVar.v0(i13 - jhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static void x(gi giVar) {
        yh yhVar;
        em emVar;
        giVar.f28680p1 = null;
        yh yhVar2 = giVar.f28696u0;
        if (yhVar2 != giVar.f28650f0 && (yhVar = giVar.f28699v0) != (emVar = giVar.m0) && yhVar2 != yhVar && yhVar2 != emVar) {
            giVar.containerView.removeView(yhVar2);
        }
        giVar.f28696u0.setVisibility(8);
        giVar.f28696u0.r();
        giVar.f28699v0.F();
        giVar.f28696u0 = giVar.f28699v0;
        giVar.f28699v0 = null;
        int[] iArr = giVar.X1;
        iArr[0] = iArr[1];
        giVar.H1(giVar.Y, false);
        giVar.W1();
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
                if (this.f28665k0 == null) {
                    tk tkVar = new tk(this, getContext(), this.resourcesProvider, (this.D || this.N1) ? false : true);
                    this.f28665k0 = tkVar;
                    this.f28690s0[5] = tkVar;
                    ok okVar = this.f28681p2;
                    if (okVar != null) {
                        tkVar.setDelegate(okVar);
                    } else if (n2Var instanceof org.telegram.ui.rn) {
                        tkVar.setDelegate(new pg(this, 16));
                    }
                }
                Q1(this.f28665k0);
                return;
            }
            return;
        }
        if (this.J1 || !a1()) {
            Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : null;
            if (parentActivity != null) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            B1(true);
        }
    }

    public final void B1(boolean z10) {
        if (!this.J1 && z10) {
            jn jnVar = new jn(3, getContext(), this.resourcesProvider, this);
            this.P = jnVar;
            Q1(jnVar);
        }
        int i10 = 1;
        if (this.f28656h0 == null) {
            ri riVar = new ri(getContext(), this.resourcesProvider, this);
            this.f28656h0 = riVar;
            this.f28690s0[3] = riVar;
            riVar.setupBlurredSearchField(this.C2);
            this.f28656h0.setDelegate(new pg(this, 13));
            if (this.D) {
                this.f28656h0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            TLRPC.Chat chat = ((org.telegram.ui.rn) n2Var).f42026e;
            ri riVar2 = this.f28656h0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                i10 = -1;
            }
            riVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.f28656h0);
        }
    }

    public final void C1() {
        if (this.f28673n0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            ui uiVar = new ui(context, c6Var, this);
            uiVar.f33087r = AndroidUtilities.dp(80.0f);
            uiVar.f33089w = 3;
            hh.f1 f1Var = new hh.f1(uiVar, context, c6Var, 11);
            uiVar.f33086n = f1Var;
            pa paVar = new pa(uiVar, context);
            uiVar.v = paVar;
            f1Var.setAdapter(paVar);
            f1Var.setClipToPadding(false);
            f1Var.setItemAnimator(null);
            f1Var.setLayoutAnimation(null);
            f1Var.setVerticalScrollBarEnabled(false);
            f1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, uiVar.f34899a));
            uiVar.addView(f1Var, h7.z5.c(-1.0f, -1));
            f1Var.setOnScrollListener(new ag.z2(uiVar, 25));
            kh.l lVar = new kh.l(uiVar, uiVar.f33087r, 1);
            uiVar.f33088s = lVar;
            lVar.O = new gh.u5(uiVar, 4);
            f1Var.setLayoutManager(lVar);
            this.f28673n0 = uiVar;
            uiVar.setDelegate(new va(this, 1));
        }
        Q1(this.f28673n0);
    }

    public final void D1() {
        if (!this.M1) {
            jn jnVar = new jn(5, getContext(), this.resourcesProvider, this);
            this.P = jnVar;
            Q1(jnVar);
        }
        if (this.f28653g0 == null) {
            lj ljVar = new lj(getContext(), this.resourcesProvider, this);
            this.f28653g0 = ljVar;
            this.f28690s0[2] = ljVar;
            ljVar.setupBlurredSearchField(this.C2);
            this.f28653g0.setDelegate(new sh(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            TLRPC.Chat chat = ((org.telegram.ui.rn) n2Var).f42026e;
            this.f28653g0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.f28653g0);
    }

    public final void E1(boolean z10) {
        if (!this.G1 && z10) {
            jn jnVar = new jn(4, getContext(), this.resourcesProvider, this);
            this.P = jnVar;
            Q1(jnVar);
        }
        boolean z11 = false;
        if (this.f28668l0 == null) {
            bk bkVar = new bk(this.J ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.f28668l0 = bkVar;
            this.f28690s0[4] = bkVar;
            bkVar.setDelegate(new th(this));
        }
        int i10 = 1;
        if (this.D) {
            this.f28668l0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
            if (n2Var instanceof org.telegram.ui.rn) {
                TLRPC.Chat chat = ((org.telegram.ui.rn) n2Var).f42026e;
                bk bkVar2 = this.f28668l0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                    i10 = -1;
                }
                bkVar2.setMaxSelectedFiles(i10);
            } else {
                this.f28668l0.setMaxSelectedFiles(this.O1);
                bk bkVar3 = this.f28668l0;
                if (!this.J && !this.S) {
                    z11 = true;
                }
                bkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        bk bkVar4 = this.f28668l0;
        bkVar4.W = this.J;
        if (z10) {
            Q1(bkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ag.d2 d2Var = this.T0;
        int i10 = 1;
        if (d2Var.f23578j0) {
            d2Var.h(true);
        }
        this.f28653g0 = null;
        this.f28676o0 = null;
        this.f28656h0 = null;
        this.f28659i0 = null;
        this.f28662j0 = null;
        this.f28665k0 = null;
        this.f28668l0 = null;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i10 >= yhVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.m();
                this.containerView.removeView(yhVarArr[i10]);
                yhVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.E1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            TLRPC.Chat chat = rnVar.f42026e;
            if (rnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.F1).edit().putBoolean("silent_" + rnVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f48498f) {
            this.E1 = true;
            this.V1.n0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long jN1 = n1();
        yh yhVar = this.f28696u0;
        return y4.b0(this.F1, jN1, j1() + (yhVar != null ? yhVar.getSelectedItemsCount() : 1), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                gi giVar = this.f27427a;
                giVar.E1 = true;
                giVar.V1.n0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        this.f28634b.a(z10, z11);
        tt ttVarM1 = m1();
        this.Y = z10;
        tt ttVarM2 = m1();
        final boolean z12 = this.f28714z0.getTag() != null;
        yh yhVar = this.f28696u0;
        final boolean z13 = this.Y && (yhVar == this.f28650f0 || yhVar == this.m0);
        ag.y1 y1Var = this.K0;
        lh lhVar = this.f28711y0;
        if (z11) {
            y1Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = y1Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            er erVar = er.h;
            final int i10 = 0;
            duration.setInterpolator(erVar).setUpdateListener(new qg(this, i10)).withEndAction(new Runnable(this) {

                public final gi f32155b;

                {
                    this.f32155b = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            gi giVar = this.f32155b;
                            if (!z13 || !z12) {
                                giVar.K0.setVisibility(8);
                            }
                            giVar.b2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.f32155b.f28711y0.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            lhVar.setVisibility(0);
            ViewPropertyAnimator interpolator = lhVar.animate().translationY((z13 || !z12) ? lhVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new qg(this, i11)).withEndAction(new Runnable(this) {

                public final gi f32155b;

                {
                    this.f32155b = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            gi giVar = this.f32155b;
                            if (!z13 || !z12) {
                                giVar.K0.setVisibility(8);
                            }
                            giVar.b2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.f32155b.f28711y0.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
        } else {
            y1Var.setVisibility((z13 && z12) ? 0 : 8);
            y1Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            b2();
            lhVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            lhVar.setTranslationY((z13 || !z12) ? lhVar.getMeasuredHeight() : 0.0f);
            lhVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (ttVarM1 != ttVarM2) {
            ttVarM1.k(true);
            ttVarM2.setText(t5.cloneSpans(ttVarM1.getText()));
            ttVarM2.getEditText().setAllowTextEntitiesIntersection(ttVarM1.getEditText().getAllowTextEntitiesIntersection());
            if (ttVarM1.getEditText().isFocused()) {
                ttVarM2.getEditText().requestFocus();
                ttVarM2.getEditText().setSelection(ttVarM1.getEditText().getSelectionStart(), ttVarM1.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new sg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f28650f0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.D1 == messageObject && this.C1 == i10) {
            return;
        }
        this.D1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.D1.isMusic()) {
                i10 = 2;
            } else {
                i10 = this.D1.isDocument() ? 1 : 0;
            }
        }
        this.C1 = i10;
        if (this.D1 != null) {
            this.O1 = 1;
            this.P1 = false;
        } else {
            this.O1 = -1;
            this.P1 = true;
        }
        this.f28704w1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z10) {
        if (this.D1 != null) {
            return;
        }
        this.O1 = i10;
        this.P1 = z10;
    }

    public final void K1(float f10) {
        int iK = i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.navBarColor = iK;
        AndroidUtilities.setNavigationBarColor((Dialog) this, iK, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void L1(String str) {
        this.M0 = 1;
        this.B = true;
        this.O0 = false;
        this.I1 = false;
        this.f28694t1.setVisibility(8);
        this.f28651f1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        if (chatAttachAlertPhotoLayout != null) {
            gi giVar = chatAttachAlertPhotoLayout.f34900b;
            chatAttachAlertPhotoLayout.f26247c1 = (giVar.M0 == 0 || giVar.B) ? false : true;
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
            if (!(n2Var instanceof org.telegram.ui.rn) || ((org.telegram.ui.rn) n2Var).x()) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (this.f28698u2 == z11) {
            return;
        }
        if (z11) {
            MessagesController.getInstance(this.F1).getTonesController().load();
        }
        this.f28698u2 = z11;
        ImageView imageView = this.f28702w;
        imageView.setVisibility(0);
        ImageView imageView2 = this.f28710y;
        imageView2.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorScaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
        er erVar = er.h;
        viewPropertyAnimatorScaleY.setInterpolator(erVar).setDuration(420L).withEndAction(new bh(this, z11, 1)).start();
        imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(erVar).setDuration(420L).withEndAction(new bh(this, z11, 2)).start();
        if (z11) {
            i0 i0Var = this.f28706x;
            Objects.requireNonNull(i0Var);
            imageView.postDelayed(new h0(i0Var, 1), 220L);
            i0 i0Var2 = this.A;
            Objects.requireNonNull(i0Var2);
            imageView2.postDelayed(new h0(i0Var2, 1), 220L);
        }
    }

    public final void N1(long j10, String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        MessageObject replyingMessageObject;
        long jA;
        int i10;
        long jN8;
        int i11;
        org.telegram.ui.ActionBar.f1 f1Var;
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView;
        long j11;
        JSONObject jSONObjectP;
        TLRPC.InputReplyTo inputReplyToCreateReplyInput;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String string;
        LongSparseArray longSparseArray = this.f28693t0;
        int i12 = 1;
        if (longSparseArray.get(j10) == null || !Objects.equals(str, ((nh.e4) longSparseArray.get(j10)).getStartCommand())) {
            n2Var = this.f28635b0;
            if (n2Var instanceof org.telegram.ui.rn) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
                nh.e4 e4Var = new nh.e4(context, c6Var, this);
                e4Var.Q = new nh.u3(e4Var, 2);
                org.telegram.ui.ActionBar.v0 v0VarA = e4Var.f34900b.T0.n().a(0, R.drawable.ic_ab_other);
                e4Var.G = v0VarA;
                v0VarA.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
                org.telegram.ui.ActionBar.f1 f1VarE = v0VarA.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
                e4Var.H = f1VarE;
                f1VarE.setVisibility(8);
                v0VarA.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
                org.telegram.ui.ActionBar.f1 f1VarE2 = v0VarA.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                e4Var.I = f1VarE2;
                f1VarE2.setVisibility(8);
                v0VarA.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
                v0VarA.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
                v0VarA.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
                nh.x3 x3Var = new nh.x3(e4Var, context, c6Var, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, e4Var.f34899a));
                e4Var.f18669n = x3Var;
                nh.s2 s2Var = new nh.s2(e4Var, context, i12);
                e4Var.F = s2Var;
                s2Var.addView(x3Var, h7.z5.c(-1.0f, -1));
                s2Var.setScrollListener(new nh.u3(e4Var, 3));
                int i13 = 4;
                s2Var.setScrollEndListener(new nh.u3(e4Var, i13));
                s2Var.setDelegate(new nh.w3(e4Var));
                s2Var.setIsKeyboardVisible(new nh.w3(e4Var));
                e4Var.addView(s2Var, h7.z5.c(-1.0f, -1));
                nh.y3 y3Var = new nh.y3(context, c6Var);
                e4Var.E = y3Var;
                e4Var.addView(y3Var, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
                x3Var.setWebViewProgressListener(new gh.c6(e4Var, i13));
                NotificationCenter.getGlobalInstance().addObserver(e4Var, NotificationCenter.didSetNewTheme);
                longSparseArray.put(j10, e4Var);
                ((nh.e4) longSparseArray.get(j10)).setDelegate(new nh(this, e4Var, str, j10));
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                replyingMessageObject = rnVar.U.getReplyingMessageObject();
                nh.e4 e4Var2 = (nh.e4) longSparseArray.get(j10);
                jA = rnVar.a();
                if (replyingMessageObject != null) {
                    i10 = replyingMessageObject.messageOwner.f22401id;
                } else {
                    i10 = 0;
                }
                jN8 = rnVar.N8();
                nh.x3 x3Var2 = e4Var2.f18669n;
                i11 = this.F1;
                e4Var2.B = i11;
                e4Var2.f18672w = jA;
                e4Var2.v = j10;
                e4Var2.f18674y = i10;
                e4Var2.A = jN8;
                e4Var2.C = str;
                f1Var = e4Var2.I;
                if (f1Var != null) {
                    if (MediaDataController.getInstance(i11).canCreateAttachedMenuBotShortcut(j10)) {
                        f1Var.setVisibility(0);
                    } else {
                        f1Var.setVisibility(8);
                    }
                }
                x3Var2.setBotUser(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)));
                x3Var2.q(i11, j10);
                tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(i11).getInputPeer(jA);
                tL_messages_requestWebView.bot = MessagesController.getInstance(i11).getInputUser(j10);
                tL_messages_requestWebView.silent = false;
                tL_messages_requestWebView.platform = "android";
                if (jA < 0) {
                    j11 = 0;
                    chatFull = MessagesController.getInstance(i11).getChatFull(-jA);
                    if (chatFull != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_requestWebView.send_as = MessagesController.getInstance(i11).getInputPeer(peer);
                        tL_messages_requestWebView.flags |= 8192;
                    }
                } else {
                    j11 = 0;
                }
                if (str != null) {
                    tL_messages_requestWebView.start_param = str;
                    tL_messages_requestWebView.flags |= 8;
                }
                if (i10 != 0) {
                    inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(i11).createReplyInput(i10);
                    tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                    if (jN8 != j11) {
                        inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(i11).getInputPeer(jN8);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (jN8 != j11) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i11).getInputPeer(jN8);
                    tL_messages_requestWebView.flags |= 1;
                }
                jSONObjectP = nh.b3.p(e4Var2.f34899a, false);
                if (jSONObjectP != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = jSONObjectP.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_requestWebView, new hh.u1(e4Var2, i11, 4));
                NotificationCenter.getInstance(i11).addObserver(e4Var2, NotificationCenter.webViewResultSent);
            }
        } else {
            nh.e4 e4Var3 = (nh.e4) longSparseArray.get(j10);
            if (e4Var3.D) {
                e4Var3.D = false;
                n2Var = this.f28635b0;
                if (n2Var instanceof org.telegram.ui.rn) {
                    Context context2 = getContext();
                    org.telegram.ui.ActionBar.c6 c6Var2 = this.resourcesProvider;
                    nh.e4 e4Var4 = new nh.e4(context2, c6Var2, this);
                    e4Var4.Q = new nh.u3(e4Var4, 2);
                    org.telegram.ui.ActionBar.v0 v0VarA2 = e4Var4.f34900b.T0.n().a(0, R.drawable.ic_ab_other);
                    e4Var4.G = v0VarA2;
                    v0VarA2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
                    org.telegram.ui.ActionBar.f1 f1VarE3 = v0VarA2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
                    e4Var4.H = f1VarE3;
                    f1VarE3.setVisibility(8);
                    v0VarA2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
                    org.telegram.ui.ActionBar.f1 f1VarE4 = v0VarA2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    e4Var4.I = f1VarE4;
                    f1VarE4.setVisibility(8);
                    v0VarA2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
                    v0VarA2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
                    v0VarA2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
                    nh.x3 x3Var3 = new nh.x3(e4Var4, context2, c6Var2, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, e4Var4.f34899a));
                    e4Var4.f18669n = x3Var3;
                    nh.s2 s2Var2 = new nh.s2(e4Var4, context2, i12);
                    e4Var4.F = s2Var2;
                    s2Var2.addView(x3Var3, h7.z5.c(-1.0f, -1));
                    s2Var2.setScrollListener(new nh.u3(e4Var4, 3));
                    int i14 = 4;
                    s2Var2.setScrollEndListener(new nh.u3(e4Var4, i14));
                    s2Var2.setDelegate(new nh.w3(e4Var4));
                    s2Var2.setIsKeyboardVisible(new nh.w3(e4Var4));
                    e4Var4.addView(s2Var2, h7.z5.c(-1.0f, -1));
                    nh.y3 y3Var2 = new nh.y3(context2, c6Var2);
                    e4Var4.E = y3Var2;
                    e4Var4.addView(y3Var2, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
                    x3Var3.setWebViewProgressListener(new gh.c6(e4Var4, i14));
                    NotificationCenter.getGlobalInstance().addObserver(e4Var4, NotificationCenter.didSetNewTheme);
                    longSparseArray.put(j10, e4Var4);
                    ((nh.e4) longSparseArray.get(j10)).setDelegate(new nh(this, e4Var4, str, j10));
                    org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) n2Var;
                    replyingMessageObject = rnVar2.U.getReplyingMessageObject();
                    nh.e4 e4Var5 = (nh.e4) longSparseArray.get(j10);
                    jA = rnVar2.a();
                    if (replyingMessageObject != null) {
                        i10 = replyingMessageObject.messageOwner.f22401id;
                    } else {
                        i10 = 0;
                    }
                    jN8 = rnVar2.N8();
                    nh.x3 x3Var4 = e4Var5.f18669n;
                    i11 = this.F1;
                    e4Var5.B = i11;
                    e4Var5.f18672w = jA;
                    e4Var5.v = j10;
                    e4Var5.f18674y = i10;
                    e4Var5.A = jN8;
                    e4Var5.C = str;
                    f1Var = e4Var5.I;
                    if (f1Var != null) {
                        if (MediaDataController.getInstance(i11).canCreateAttachedMenuBotShortcut(j10)) {
                            f1Var.setVisibility(0);
                        } else {
                            f1Var.setVisibility(8);
                        }
                    }
                    x3Var4.setBotUser(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)));
                    x3Var4.q(i11, j10);
                    tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                    tL_messages_requestWebView.peer = MessagesController.getInstance(i11).getInputPeer(jA);
                    tL_messages_requestWebView.bot = MessagesController.getInstance(i11).getInputUser(j10);
                    tL_messages_requestWebView.silent = false;
                    tL_messages_requestWebView.platform = "android";
                    if (jA < 0) {
                        j11 = 0;
                        chatFull = MessagesController.getInstance(i11).getChatFull(-jA);
                        if (chatFull != null) {
                            tL_messages_requestWebView.send_as = MessagesController.getInstance(i11).getInputPeer(peer);
                            tL_messages_requestWebView.flags |= 8192;
                        }
                    } else {
                        j11 = 0;
                    }
                    if (str != null) {
                        tL_messages_requestWebView.start_param = str;
                        tL_messages_requestWebView.flags |= 8;
                    }
                    if (i10 != 0) {
                        inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(i11).createReplyInput(i10);
                        tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                        if (jN8 != j11) {
                            inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(i11).getInputPeer(jN8);
                            tL_messages_requestWebView.reply_to.flags |= 32;
                        }
                        tL_messages_requestWebView.flags |= 1;
                    } else if (jN8 != j11) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum2 = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum2;
                        tL_inputReplyToMonoForum2.monoforum_peer_id = MessagesController.getInstance(i11).getInputPeer(jN8);
                        tL_messages_requestWebView.flags |= 1;
                    }
                    jSONObjectP = nh.b3.p(e4Var5.f34899a, false);
                    if (jSONObjectP != null) {
                        TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                        tL_messages_requestWebView.theme_params = tL_dataJSON2;
                        tL_dataJSON2.data = jSONObjectP.toString();
                        tL_messages_requestWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_requestWebView, new hh.u1(e4Var5, i11, 4));
                    NotificationCenter.getInstance(i11).addObserver(e4Var5, NotificationCenter.webViewResultSent);
                }
            }
        }
        if (longSparseArray.get(j10) != null) {
            ((nh.e4) longSparseArray.get(j10)).F.setSwipeOffsetAnimationDisallowed(true);
            R1((yh) longSparseArray.get(j10), -j10, z11);
            if (z10) {
                nh.e4 e4Var6 = (nh.e4) longSparseArray.get(j10);
                TLRPC.User user = MessagesController.getInstance(e4Var6.B).getUser(Long.valueOf(e4Var6.v));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(e4Var6.B).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i15 = 0;
                do {
                    if (i15 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    } else {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i15);
                        i15++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                    }
                } while (tL_attachMenuBot.bot_id != e4Var6.v);
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z12 = tL_attachMenuBot.show_in_side_menu;
                if (z12 && tL_attachMenuBot.show_in_attach_menu) {
                    string = LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name);
                } else {
                    string = z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
                }
                AndroidUtilities.runOnUIThread(new lh.k7(16, e4Var6, string), 200L);
            }
        }
    }

    public final void O1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.rn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.rn) n2Var).f42026e)) {
            new mc(this.f28674n1, this.resourcesProvider).f(MessagesController.getInstance(this.F1).captionLengthLimitPremium, new org.telegram.ui.yq(13, this, n2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        int iMax;
        yh yhVar;
        this.f28638c.a(z10, true);
        ih ihVar = this.f28714z0;
        if (z10 == (ihVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ihVar.setTag(z10 ? 1 : null);
        mh mhVar = this.A0;
        if (mhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(mhVar.getEditText());
        }
        mhVar.k(true);
        this.L0.k(true);
        ih ihVar2 = this.f28694t1;
        ih ihVar3 = this.D0;
        if (z10) {
            if (!this.J) {
                ihVar.setVisibility(0);
            }
            ihVar3.setVisibility(0);
        } else if (this.O0) {
            ihVar2.setVisibility(0);
        }
        yh yhVar2 = this.f28696u0;
        boolean z12 = (yhVar2 == this.f28650f0 || yhVar2 == this.m0) && this.Y;
        ag.d2 d2Var = this.T0;
        ag.y1 y1Var = this.K0;
        lh lhVar = this.f28711y0;
        rh rhVar = this.E0;
        if (z11) {
            this.I0 = new AnimatorSet();
            if (z12) {
                y1Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(lhVar, (Property<lh, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (z10 && !z12) {
                lhVar.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(lhVar, (Property<lh, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(y1Var, (Property<ag.y1, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(ihVar3, (Property<ih, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(ihVar3, (Property<ih, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ihVar3, (Property<ih, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(rhVar, (Property<rh, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(rhVar, (Property<rh, Float>) property3, z10 ? 1.0f : 0.2f));
            if (d2Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.O0) {
                arrayList.add(ObjectAnimator.ofFloat(ihVar2, (Property<ih, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ihVar2, (Property<ih, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new qg(this, 4));
                arrayList.add(valueAnimatorOfFloat);
            }
            this.I0.playTogether(arrayList);
            this.I0.setInterpolator(new DecelerateInterpolator());
            this.I0.setDuration(180L);
            this.I0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.I0.start();
            iMax = 0;
        } else {
            ihVar.setAlpha(z10 ? 1.0f : 0.0f);
            lhVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                iMax = 0;
            } else {
                iMax = 0;
                lhVar.setVisibility(0);
                lhVar.setTranslationY(0.0f);
            }
            ihVar3.setScaleX(z10 ? 1.0f : 0.2f);
            ihVar3.setScaleY(z10 ? 1.0f : 0.2f);
            ihVar3.setAlpha(z10 ? 1.0f : 0.0f);
            y1Var.setVisibility((z10 && z12) ? 0 : 8);
            y1Var.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            rhVar.setScaleX(z10 ? 1.0f : 0.2f);
            rhVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (d2Var.getTag() != null) {
                ihVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.O0 && ((yhVar = this.f28696u0) == null || yhVar.J())) {
                ihVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                ihVar.setVisibility(4);
                ihVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z10) {
            iMax = Math.max(1, this.f28696u0.getSelectedItemsCount());
        }
        rhVar.g(iMax, z11);
        rhVar.i(j1() + this.f28696u0.getSelectedItemsCount(), this.D1 != null ? 0L : MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mhVar.getLayoutParams();
        int iMax2 = Math.max(AndroidUtilities.dp(48.0f), rhVar.l());
        if (marginLayoutParams.rightMargin != iMax2) {
            marginLayoutParams.rightMargin = iMax2;
            mhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(yh yhVar) {
        long j10 = this.S0;
        jn jnVar = this.P;
        if (yhVar == jnVar) {
            j10 = jnVar.f29740s;
        } else if (yhVar == this.f28650f0) {
            j10 = 1;
        } else if (yhVar == this.f28656h0) {
            j10 = 3;
        } else if (yhVar == this.f28668l0) {
            j10 = 4;
        } else if (yhVar == this.f28653g0) {
            j10 = 5;
        } else if (yhVar == this.f28665k0) {
            j10 = 6;
        } else if (yhVar == this.f28659i0) {
            j10 = 9;
        } else if (yhVar == this.f28673n0) {
            j10 = 10;
        } else if (yhVar == this.f28676o0) {
            j10 = 11;
        } else if (yhVar == this.f28662j0) {
            j10 = 12;
        } else if (yhVar == this.f28679p0) {
            j10 = 14;
        } else if (yhVar == this.f28682q0) {
            j10 = 13;
        } else if (yhVar == this.f28686r0) {
            j10 = 16;
        }
        R1(yhVar, j10, true);
    }

    public final void R1(yh yhVar, long j10, boolean z10) {
        ql qlVar;
        ql qlVar2;
        int iDp;
        Float f10;
        int i10;
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f28680p1 == null && this.I0 == null) {
            yh yhVar2 = this.f28696u0;
            if (yhVar2 == yhVar) {
                yhVar2.G();
                return;
            }
            if (yhVar == this.f28662j0 && !UserConfig.getInstance(this.F1).isPremium()) {
                new ag.g2(this.f28635b0, 39, false).show();
                return;
            }
            int i11 = 1;
            int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
            this.f28649f.a(i12 == 0, z10);
            this.f28672n.i(Long.valueOf(j10), z10);
            this.f28715z1 = false;
            this.f28708x1 = false;
            this.B1 = 0.0f;
            this.A1.setVisibility(8);
            RadialProgressView radialProgressView = this.f28712y1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ih ihVar = this.f28694t1;
            ihVar.setAlpha(1.0f);
            ihVar.setTranslationY(this.B1);
            int i13 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.f28693t0;
                if (i13 >= longSparseArray.size()) {
                    break;
                }
                ((nh.e4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                i13++;
            }
            this.S0 = j10;
            jh jhVar = this.f28697u1;
            int childCount = jhVar.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = jhVar.getChildAt(i14);
                if (childAt instanceof ai) {
                    ai aiVar = (ai) childAt;
                    i10 = i12;
                    f10 = fValueOf;
                    aiVar.f27104a.e(((long) aiVar.f26746b) == aiVar.f26747c.S0, true);
                } else {
                    f10 = fValueOf;
                    i10 = i12;
                    if (childAt instanceof zh) {
                        ((zh) childAt).a(true);
                    }
                }
                i14++;
                i12 = i10;
                fValueOf = f10;
            }
            Float f11 = fValueOf;
            int i15 = i12;
            int firstOffset = (this.f28696u0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.X1[0];
            this.f28699v0 = yhVar;
            yhVar.getClass();
            boolean z11 = yhVar instanceof rh.p;
            sg.f fVar = this.f28687r1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            kh khVar = this.f28691s1;
            if (khVar != null) {
                khVar.setVisibility(z11 ? 4 : 0);
            }
            int i16 = this.f28699v0.h() != 0 ? 0 : 4;
            ag.d2 d2Var = this.T0;
            d2Var.setVisibility(i16);
            if (d2Var.f23578j0) {
                d2Var.h(true);
            }
            this.f28696u0.s();
            yh yhVar3 = this.f28699v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
            if (yhVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.f28699v0.E(this.f28696u0);
            this.f28699v0.setVisibility(0);
            if (yhVar.getParent() != null) {
                this.containerView.removeView(this.f28699v0);
            }
            int iIndexOfChild = this.containerView.indexOfChild(this.f28696u0);
            ViewParent parent = this.f28699v0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                yh yhVar4 = this.f28699v0;
                if (yhVar4 != this.f28665k0) {
                    iIndexOfChild++;
                }
                viewGroup.addView(yhVar4, iIndexOfChild, h7.z5.c(-1.0f, -1));
            }
            sg sgVar = new sg(this, 3);
            yh yhVar5 = this.f28696u0;
            boolean z12 = yhVar5 instanceof em;
            uh uhVar = this.f28632a0;
            if (z12 || (this.f28699v0 instanceof em)) {
                int iMax = Math.max(this.f28699v0.getWidth(), this.f28696u0.getWidth());
                yh yhVar6 = this.f28699v0;
                if (yhVar6 instanceof em) {
                    yhVar6.setTranslationX(iMax);
                    yh yhVar7 = this.f28696u0;
                    if ((yhVar7 instanceof ChatAttachAlertPhotoLayout) && (qlVar2 = ((ChatAttachAlertPhotoLayout) yhVar7).L) != null) {
                        qlVar2.setVisibility(4);
                    }
                } else {
                    this.f28696u0.setTranslationX(-iMax);
                    yh yhVar8 = this.f28699v0;
                    if (yhVar8 == chatAttachAlertPhotoLayout && (qlVar = ((ChatAttachAlertPhotoLayout) yhVar8).L) != null) {
                        qlVar.setVisibility(0);
                    }
                }
                this.f28699v0.setAlpha(1.0f);
                this.f28696u0.setAlpha(1.0f);
                if (z10) {
                    yh yhVar9 = this.f28696u0;
                    uhVar.getClass();
                    uhVar.a(yhVar9, f11);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(this, yhVar, sgVar, 11));
                } else {
                    boolean z13 = this.f28699v0.getCurrentItemTop() <= yhVar.getButtonsHideOffset();
                    this.f28696u0.t(1.0f);
                    this.f28699v0.t(1.0f);
                    this.f28696u0.k(this.f28658h2);
                    this.f28699v0.k(this.f28658h2);
                    this.containerView.invalidate();
                    yh yhVar10 = this.f28696u0;
                    Float fValueOf2 = Float.valueOf(1.0f);
                    uhVar.getClass();
                    uhVar.a(yhVar10, fValueOf2);
                    d2Var.setTag(z13 ? 1 : null);
                    sgVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f28699v0.setAlpha(0.0f);
                this.f28699v0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f28696u0, (Property<yh, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f28696u0, uhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) View.ALPHA, d2Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(er.f28122f);
                animatorSet.addListener(new hh.l3(this, firstOffset, sgVar, i11));
                this.f28680p1 = animatorSet;
                yh yhVar11 = this.f28696u0;
                uhVar.getClass();
                uhVar.a(yhVar11, f11);
                animatorSet.start();
            } else {
                yhVar5.setAlpha(0.0f);
                sgVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (this.f28661i2 && !(yhVar instanceof nh.e4)) {
                this.f28661i2 = false;
                d2Var.d();
                d2Var.invalidate();
                u1();
            }
            if (i15 == 0 || j10 == 6 || (yhVar instanceof nh.e4)) {
                iDp = AndroidUtilities.dp(46.0f);
            } else {
                iDp = j10 == 4 ? AndroidUtilities.dp(84.0f) : 0;
            }
            d2Var.setForcedMenuWidth(iDp);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        gi giVar;
        if (this.f28659i0 == null) {
            giVar = this;
            in inVar = new in(giVar, getContext(), false, this.resourcesProvider, bool);
            giVar.f28659i0 = inVar;
            giVar.f28690s0[1] = inVar;
            inVar.setDelegate(new pg(this, 15));
        } else {
            giVar = this;
        }
        R1(giVar.f28659i0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        yh yhVar;
        this.d.a(z10, z11);
        ag.d2 d2Var = this.T0;
        if (!(z10 && d2Var.getTag() == null) && (z10 || d2Var.getTag() == null)) {
            return;
        }
        d2Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.U0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.U0 = null;
        }
        boolean z12 = (this.B || this.P0 || (this.M0 == 0 && this.f28670m1) || this.f28696u0 != this.f28650f0 || (!this.H1 && !this.I1)) ? false : true;
        if (this.f28696u0 == this.P) {
            z12 = false;
        }
        ih ihVar = this.f28694t1;
        org.telegram.ui.ActionBar.v0 v0Var = this.W0;
        if (z10) {
            if (z12) {
                v0Var.setVisibility(0);
                v0Var.setClickable(true);
            }
        } else if (this.O0 && this.f28714z0.getTag() == null) {
            ihVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.b.f(getThemedColor(this.f28644d2 ? org.telegram.ui.ActionBar.g6.f23349tg : org.telegram.ui.ActionBar.g6.f23124h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
            }
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.U0 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - d2Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, z10 ? 1.0f : 0.0f));
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.U0.playTogether(arrayList);
            this.U0.addListener(new org.telegram.ui.go(3, this, z10));
            this.U0.setInterpolator(er.h);
            this.U0.setDuration(380L);
            this.U0.start();
            return;
        }
        if (z10 && this.O0 && ((yhVar = this.f28696u0) == null || yhVar.J())) {
            ihVar.setVisibility(4);
        }
        d2Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            v0Var.setAlpha(z10 ? 1.0f : 0.0f);
            v0Var.setScaleX(z10 ? 1.0f : 0.6f);
            v0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f28633a1;
        if (v0Var2 != null) {
            v0Var2.setVisibility(4);
        }
        if (this.M0 == 0 && this.f28670m1) {
            return;
        }
        v0Var.setVisibility(4);
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.C0;
        mh mhVar = this.A0;
        mhVar.getLocationOnScreen(iArr);
        if (this.f28709x2 != null) {
            yh yhVar = this.f28696u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
            if ((yhVar == chatAttachAlertPhotoLayout || yhVar == this.m0) && this.Y) {
                ag.y1 y1Var = this.K0;
                alpha = (y1Var.getAlpha() * y1Var.getMeasuredHeight()) + (y1Var.getY() - this.f28709x2.getTop());
            } else {
                alpha = -mhVar.getHeight();
            }
            if (Math.abs(this.f28709x2.getTranslationY() - alpha) > 0.5f) {
                this.f28709x2.setTranslationY(alpha);
                this.f28709x2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        g1();
    }

    public final void V1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.f28680p1 != null) {
            return;
        }
        int selectedItemsCount = this.f28696u0.getSelectedItemsCount();
        rh rhVar = this.E0;
        if (selectedItemsCount == 0) {
            rhVar.g(0, i10 != 0);
            P1(false, i10 != 0);
        } else {
            if (P1(true, i10 != 0) || i10 == 0) {
                rhVar.g(selectedItemsCount, i10 != 0);
                rhVar.b();
            } else {
                rhVar.g(selectedItemsCount, true);
                rhVar.b();
            }
        }
        this.f28696u0.C(selectedItemsCount);
        d1(i10 != 0);
        if (this.f28696u0 == this.f28650f0 && ((((z10 = (n2Var = this.f28635b0) instanceof org.telegram.ui.rn)) || this.M0 != 0 || this.P0) && ((selectedItemsCount == 0 && this.f28670m1) || ((selectedItemsCount != 0 || this.M0 != 0 || this.P0) && !this.f28670m1)))) {
            this.f28670m1 = (selectedItemsCount == 0 && this.M0 == 0 && !this.P0) ? false : true;
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            int i11 = this.M0;
            ag.d2 d2Var = this.T0;
            org.telegram.ui.ActionBar.v0 v0Var = this.f28633a1;
            if (i11 == 0 || v0Var == null || d2Var.getTag() == null || !z10) {
                z11 = false;
            } else {
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                if (ChatObject.isChannel(rnVar.f42026e) && (tL_chatBannedRights = rnVar.f42026e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            boolean z12 = this.f28670m1;
            ih ihVar = this.f28647e1;
            org.telegram.ui.ActionBar.v0 v0Var2 = this.W0;
            if (z12) {
                if (this.M0 == 0 && !this.P0) {
                    v0Var2.setVisibility(0);
                    v0Var2.setClickable(true);
                }
                ihVar.setVisibility(0);
            } else if (d2Var.getTag() != null && v0Var != null) {
                v0Var.setVisibility(0);
            }
            if (i10 == 0) {
                if (d2Var.getTag() == null && this.M0 == 0 && !this.P0) {
                    v0Var2.setAlpha(this.f28670m1 ? 1.0f : 0.0f);
                    v0Var2.setScaleX(this.f28670m1 ? 1.0f : 0.6f);
                    v0Var2.setScaleY(this.f28670m1 ? 1.0f : 0.6f);
                }
                ihVar.setAlpha(this.f28670m1 ? 1.0f : 0.0f);
                if (z11) {
                    v0Var.setAlpha(this.f28670m1 ? 0.0f : 1.0f);
                }
                if (this.f28670m1 && v0Var != null) {
                    v0Var.setVisibility(4);
                }
            } else {
                this.V0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (d2Var.getTag() == null && this.M0 == 0 && !this.P0) {
                    arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, this.f28670m1 ? 1.0f : 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, this.f28670m1 ? 1.0f : 0.6f));
                    arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, this.f28670m1 ? 1.0f : 0.6f));
                }
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property, this.f28670m1 ? 1.0f : 0.0f));
                if (z11) {
                    arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, this.f28670m1 ? 0.0f : 1.0f));
                }
                this.V0.playTogether(arrayList);
                this.V0.addListener(new org.telegram.ui.am(this, 14));
                this.V0.setDuration(180L);
                this.V0.start();
            }
        }
        Y1(i10 != 0);
        MessageObject messageObject = this.D1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()) : 0L;
        yh yhVar = this.f28696u0;
        rhVar.i(j1() + (yhVar != null ? yhVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        mh mhVar = this.A0;
        if (mhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mhVar.getLayoutParams();
            int iMax = Math.max(AndroidUtilities.dp(48.0f), rhVar.l());
            if (marginLayoutParams.rightMargin != iMax) {
                marginLayoutParams.rightMargin = iMax;
                mhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void W1() {
        float fZ;
        yh yhVar = this.f28696u0;
        boolean zG = yhVar == null ? false : yhVar.g();
        ag.e1 e1Var = this.f28636b1;
        e1Var.setEnabled(zG);
        yh yhVar2 = this.f28696u0;
        if (yhVar2 != null) {
            fZ = ((yhVar2.g() ? 1.0f : 0.5f) * (this.f28699v0 == null ? 1.0f : this.Z)) + 0.0f;
        } else {
            fZ = 0.0f;
        }
        yh yhVar3 = this.f28699v0;
        if (yhVar3 != null) {
            fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.Z, yhVar3.g() ? 1.0f : 0.5f, fZ);
        }
        this.f28640c1 = fZ;
        if (e1Var != null) {
            float f10 = fZ * this.f28643d1;
            e1Var.setAlpha(f10);
            e1Var.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(yh yhVar, int i10) {
        if (yhVar == null) {
            return;
        }
        jg.e eVar = this.f28713y2;
        if (eVar != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(0.0f, i10);
            Z0();
        }
        int currentItemTop = yhVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = yhVar == this.f28696u0 && currentItemTop <= yhVar.getButtonsHideOffset();
        this.N = z11;
        if (yhVar == this.f28696u0) {
            T1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yhVar.getLayoutParams();
        int iC = org.telegram.messenger.rl.C(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        yh yhVar2 = this.f28696u0;
        int i11 = yhVar2 == yhVar ? 0 : 1;
        if ((yhVar2 instanceof em) || (this.f28699v0 instanceof em)) {
            Object obj = this.f28680p1;
            if ((obj instanceof o1.j) && ((o1.j) obj).f19141f) {
                z10 = true;
            }
        }
        int[] iArr = this.X1;
        int i12 = iArr[i11];
        if (i12 == iC && !z10) {
            if (i10 != 0) {
                this.Y1 = i12;
            }
        } else {
            this.Y1 = i12;
            iArr[i11] = iC;
            a2(i11);
            this.containerView.invalidate();
        }
    }

    public final void Y0() {
        if (m1().f32875a.length() <= 0) {
            return;
        }
        this.f28696u0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        lh.v vVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        if (chatAttachAlertPhotoLayout == null || (vVar = this.X0) == null) {
            return;
        }
        boolean z11 = this.f28670m1 && this.f28646e0 && this.f28696u0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        vVar.f16926f = z12;
        if (!z10) {
            ((y5) vVar.f16927g).a(z12);
        }
        vVar.invalidateSelf();
        org.telegram.ui.ActionBar.v0 v0Var = this.Y0;
        if (z10 && this.f28670m1) {
            v0Var.setVisibility(0);
            v0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(er.h).withEndAction(new bh(this, z11, 0)).start();
        } else {
            v0Var.setVisibility(z11 ? 0 : 8);
            v0Var.setAlpha(z11 ? 1.0f : 0.0f);
            v0Var.setScaleX(z11 ? 1.0f : 0.6f);
            v0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    public final void Z0() {
        jg.e eVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f28713y2) == null) {
            return;
        }
        ih ihVar = this.f28694t1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.H2;
        qg.j.c(ihVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.T0.getMeasuredHeight();
        RectF rectF2 = this.G2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        yh yhVar = this.f28696u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        if (yhVar != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null) {
            z10 = false;
        } else {
            gl glVar = chatAttachAlertPhotoLayout.A;
            if (glVar.getFastScroll() != null) {
                ik0 fastScroll = glVar.getFastScroll();
                lg.d dVar = fastScroll.f29381a0;
                RectF rectF3 = this.I2;
                if (dVar != null || fastScroll.f29383b0 != null) {
                    rectF3.set(fastScroll.f29383b0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.f29381a0.getBounds());
                    rectF3.union(rectF4);
                }
                ik0 fastScroll2 = glVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                qg.j.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        int i10 = z10 ? 3 : 2;
        ArrayList arrayList = this.F2;
        ArrayList arrayList2 = this.J2;
        eVar.g(gf.m0.a(arrayList, i10, arrayList2), arrayList2);
        eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z10) {
        yh yhVar = this.f28650f0;
        if (!z10) {
            Q1(yhVar);
            return;
        }
        if (this.I) {
            if (this.m0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f28685r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                em emVar = new em(context, c6Var, this);
                emVar.f28091y = 0.0f;
                emVar.A = 0.0f;
                emVar.B = 0.0f;
                emVar.C = 0.0f;
                emVar.D = 0.0f;
                emVar.E = 0.0f;
                emVar.F = null;
                emVar.G = false;
                emVar.I = 0.0f;
                emVar.M = false;
                emVar.O = false;
                Point point = AndroidUtilities.displaySize;
                emVar.P = point.y > point.x;
                emVar.f28086n = c6Var;
                emVar.f34903f = true;
                emVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z zVarN = emVar.f34900b.T0.n();
                TextView textView = new TextView(context);
                emVar.f28090x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = emVar.f34899a;
                ll llVar = new ll(emVar, context, zVarN, c6Var2, 1);
                emVar.f34900b.T0.addView(llVar, 0, h7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                llVar.addView(textView, h7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                hh.f1 f1Var = new hh.f1(emVar, context, c6Var2, 14);
                emVar.f28087r = f1Var;
                f1Var.setAdapter(new org.telegram.ui.w7(emVar, 3));
                f2.k0 k0Var = new f2.k0(1, false);
                emVar.f28088s = k0Var;
                f1Var.setLayoutManager(k0Var);
                f1Var.setClipChildren(false);
                f1Var.setClipToPadding(false);
                f1Var.setOverScrollMode(2);
                f1Var.setVerticalScrollBarEnabled(false);
                dm dmVar = new dm(emVar, context);
                emVar.v = dmVar;
                dmVar.setClipToPadding(true);
                dmVar.setClipChildren(true);
                emVar.addView(f1Var, h7.z5.c(-1.0f, -1));
                emVar.L = emVar.f34900b.f28650f0;
                dmVar.f27800c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.L;
                dmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                dmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                dmVar.c();
                UndoView undoView = new UndoView(context, null, false, emVar.f34900b.f28685r);
                emVar.f28089w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                emVar.addView(undoView, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                emVar.J = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.m0 = emVar;
                emVar.bringToFront();
            }
            yh yhVar2 = this.f28696u0;
            em emVar2 = this.m0;
            if (yhVar2 != emVar2) {
                yhVar = emVar2;
            }
            Q1(yhVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        return (n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).K6();
    }

    public final void a2(int i10) {
        int i11;
        float translationY;
        float f10;
        float translationY2;
        float f11;
        float translationY3;
        float fMax;
        int i12;
        float f12 = this.d.f48497e;
        yh yhVar = i10 == 0 ? this.f28696u0 : this.f28699v0;
        if (yhVar == null || yhVar.getVisibility() != 0) {
            return;
        }
        int iP1 = p1(i10);
        if (yhVar == this.f28659i0 || yhVar == this.f28662j0) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        float f13 = 1.0f - f12;
        if (AndroidUtilities.isTablet()) {
            i11 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i11 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.T0.getAlpha();
        ih ihVar = this.f28647e1;
        float fDp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - ihVar.getAlpha()) * 26.0f);
        boolean z10 = this.f28670m1;
        org.telegram.ui.ActionBar.v0 v0Var = this.W0;
        ag.y1 y1Var = this.K0;
        if (z10 && this.M0 == 0 && !this.P0) {
            v0Var.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((iP1 - AndroidUtilities.dp((i11 * f12) + 37.0f)) + fDp) - (y1Var.getAlpha() * y1Var.getMeasuredHeight())) + this.f28658h2);
        } else {
            v0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.f28658h2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.Y0;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(v0Var.getTranslationY());
        }
        lh.w3 w3Var = this.Z0;
        if (w3Var != null) {
            w3Var.setTranslationY(v0Var.getTranslationY());
        }
        if (this.B && this.f28677o1) {
            yh yhVar2 = this.f28699v0;
            if (yhVar2 != null && this.f28696u0 != null) {
                translationY = Math.min(yhVar2.getTranslationY(), this.f28696u0.getTranslationY());
            } else if (yhVar2 != null) {
                translationY = yhVar2.getTranslationY();
            } else {
                translationY = 0.0f;
            }
        } else {
            translationY = 0.0f;
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f28633a1;
        if (v0Var3 != null) {
            v0Var3.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.f28658h2);
        }
        float fDp2 = ((((iP1 - AndroidUtilities.dp((i11 * f12) + 25.0f)) + fDp) + this.f28658h2) + translationY) - (y1Var.getAlpha() * y1Var.getMeasuredHeight());
        this.l1 = fDp2;
        ihVar.setTranslationY(Math.max(this.f28658h2, fDp2));
        y1Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f28658h2, (ihVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
        if (this.Y) {
            U1();
        }
        g1();
        int i13 = 59;
        if (this.f28659i0 == null) {
            f10 = 0.0f;
            translationY2 = 0.0f;
        } else {
            if (AndroidUtilities.isTablet()) {
                i12 = 63;
            } else {
                Point point2 = AndroidUtilities.displaySize;
                i12 = point2.x > point2.y ? 53 : 59;
            }
            in inVar = this.f28659i0;
            if (inVar == this.f28699v0) {
                translationY2 = (inVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f12) + 7.0f) - (f13 * 12.0f));
                f10 = this.Z;
            } else if (inVar == this.f28696u0) {
                translationY2 = (inVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f12) + 7.0f) - (f13 * 12.0f));
                f10 = this.f28699v0 == null ? 1.0f : 1.0f - this.Z;
            } else {
                f10 = 0.0f;
                translationY2 = 0.0f;
            }
        }
        if (this.f28662j0 == null) {
            f11 = 0.0f;
            translationY3 = 0.0f;
        } else {
            if (AndroidUtilities.isTablet()) {
                i13 = 63;
            } else {
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i13 = 53;
                }
            }
            in inVar2 = this.f28662j0;
            if (inVar2 == this.f28699v0) {
                translationY3 = (inVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i13 * f12) + 7.0f) - (f13 * 12.0f));
                f11 = this.Z;
            } else if (inVar2 == this.f28696u0) {
                translationY3 = (inVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i13 * f12) + 7.0f) - (f13 * 12.0f));
                f11 = this.f28699v0 != null ? 1.0f - this.Z : 1.0f;
            } else {
                f11 = 0.0f;
                translationY3 = 0.0f;
            }
        }
        ag.e1 e1Var = this.f28636b1;
        if (e1Var != null) {
            int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - e1Var.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
            if (f10 <= 0.0f || f11 <= 0.0f) {
                if (f10 <= 0.0f) {
                    translationY2 = 0.0f;
                }
                if (f11 <= 0.0f) {
                    translationY3 = 0.0f;
                }
                fMax = Math.max(translationY2, translationY3);
            } else {
                fMax = AndroidUtilities.lerp(translationY2, translationY3, f11);
            }
            e1Var.setTranslationY(Math.max(0.0f, fMax) + this.f28658h2);
            e1Var.setTranslationX(-((measuredWidth * f13) + AndroidUtilities.dp((7.0f * f13) + 12.0f)));
        }
        float fMax2 = Math.max(f11, f10);
        this.f28643d1 = fMax2;
        if (e1Var != null) {
            float f14 = this.f28640c1 * fMax2;
            e1Var.setAlpha(f14);
            e1Var.setVisibility(f14 <= 0.0f ? 4 : 0);
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (!(n2Var instanceof org.telegram.ui.rn)) {
            return false;
        }
        return ChatActivityEnterView.I(this.F1, ((org.telegram.ui.rn) n2Var).a(), n2Var, charSequence);
    }

    public final void b2() {
        int alpha = 0;
        a2(0);
        this.f28674n1.invalidate();
        ag.y1 y1Var = this.K0;
        y1Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        if (chatAttachAlertPhotoLayout != null) {
            gl glVar = chatAttachAlertPhotoLayout.A;
            chatAttachAlertPhotoLayout.V();
            if (glVar != null && glVar.getFastScroll() != null) {
                ik0 fastScroll = glVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1;
                if (this.Y) {
                    alpha = (int) (y1Var.getAlpha() * y1Var.getMeasuredHeight());
                }
                fastScroll.f29386d0 = currentActionBarHeight + alpha;
                glVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        jh jhVar = this.f28697u1;
        if (jhVar == null) {
            return;
        }
        int childCount = jhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jhVar.getChildAt(i10);
        }
        boolean z10 = this.f28644d2;
        this.f28651f1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5));
        this.f28666k1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5));
        this.f28636b1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5);
        org.telegram.ui.ActionBar.v0 v0Var = this.W0;
        v0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.g6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23153ig : org.telegram.ui.ActionBar.g6.I5), v0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        v0Var.G(getThemedColor(i11), false);
        v0Var.G(getThemedColor(i11), true);
        v0Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.Y0;
        if (v0Var2 != null) {
            v0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f28633a1;
        if (v0Var3 != null) {
            v0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5));
            org.telegram.ui.ActionBar.g6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23153ig : org.telegram.ui.ActionBar.g6.I5), v0Var3.getBackground());
        }
        mh mhVar = this.A0;
        org.telegram.ui.ActionBar.c6 c6Var = mhVar.I;
        ot otVar = mhVar.f32875a;
        int i12 = mhVar.H;
        if (i12 == 0) {
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            otVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        } else if (i12 == 2 || i12 == 3) {
            otVar.setHintTextColor(-1929379841);
            otVar.setTextColor(-1);
            otVar.setCursorColor(-1);
            otVar.setHandlesColor(-1);
            otVar.setHighlightColor(822083583);
            otVar.quoteColor = -1;
        } else {
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23338t5, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        }
        mhVar.f32877c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        pt ptVar = mhVar.d;
        if (ptVar != null) {
            ptVar.U();
        }
        jhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5);
        ag.d2 d2Var = this.T0;
        d2Var.D(themedColor2, false);
        d2Var.C(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23153ig : org.telegram.ui.ActionBar.g6.I5), false);
        d2Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5));
        int iQ1 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(iQ1, this.shadowDrawable);
        og.c cVar = this.B2;
        if (cVar.f19449a.getColor() != iQ1) {
            cVar.a(iQ1);
            sg.f fVar = this.f28687r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            kh khVar = this.f28691s1;
            if (khVar != null) {
                khVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i14 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i14];
            if (yhVar != null) {
                yhVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23143i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5), false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f28696u0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.f28669l2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.f28671m2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean z10) {
        boolean z11;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.rn)) {
            return;
        }
        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
        tt ttVar = this.Y ? this.L0 : this.A0;
        String string = ttVar != null ? ttVar.getText().toString() : null;
        if (this.D1 == null) {
            yh yhVar = this.f28696u0;
            z11 = true;
            if ((yhVar != null && yhVar.getSelectedItemsCount() > 1) || (gf.x.g(this.F1).e(string, rnVar.Z7) <= 0 && ((messageObject = rnVar.f42095j5) == null || !messageObject.isEphemeral()))) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.h.a(z11, z10);
        if (z11 && s1()) {
            H1(false, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            di diVar = this.f28704w1;
            if (diVar != null) {
                diVar.l();
            }
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        if (z10) {
            this.f28705w2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ei eiVar = this.V1;
        if (eiVar != null) {
            eiVar.y(new sg(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f28696u0.p(i10);
    }

    public final void e1() {
        float f10 = this.f28638c.f48497e;
        this.f28691s1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.f48497e))), 1.0f - ((1.0f - this.f28634b.f48497e) * f10)));
    }

    public final void f1() {
        m10.d(this.B0, com.google.android.recaptcha.internal.a.C(this.f28645e.f48497e, this.f28649f.f48497e, gf.m0.b(this.h.f48497e), this.N1 ? 0.0f : 1.0f));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        rh rhVar = this.E0;
        ih ihVar = this.D0;
        ag.y1 y1Var = this.K0;
        if (y1Var == null || y1Var.getVisibility() != 0 || y1Var.getAlpha() == 0.0f) {
            ihVar.setTranslationY(this.f28641c2);
            rhVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.f28634b.f48497e;
        float fAbs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
        rhVar.setAlpha(fAbs * fAbs * fAbs * fAbs);
        ihVar.setTranslationY(AndroidUtilities.lerp(this.f28641c2, ((y1Var.getTranslationY() + y1Var.getTop()) - ihVar.getTop()) + AndroidUtilities.dp(8.0f), er.f28125j.getInterpolation(f10)));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i10 >= yhVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23143i5));
                return arrayList;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null && (themeDescriptions = yhVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    public final void h1(int i10) {
        this.O0 = true;
        this.f28694t1.setVisibility(0);
        this.D = true;
        this.E = i10;
        this.M0 = 0;
        this.B = false;
        this.C = false;
        this.F = null;
        org.telegram.ui.ActionBar.v0 v0Var = this.f28654g1;
        if (v0Var != null) {
            this.f28651f1.setTranslationY(0.0f);
            v0Var.setVisibility(8);
        }
    }

    public final void i1(lh.a8 a8Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f28651f1;
        textView.setText(string);
        this.O0 = false;
        this.f28694t1.setVisibility(8);
        this.M0 = 1;
        this.B = true;
        this.C = true;
        this.f28646e0 = false;
        this.F = a8Var;
        org.telegram.ui.ActionBar.v0 v0Var = this.f28654g1;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (!(n2Var instanceof org.telegram.ui.rn) || (messagePreviewParams = ((org.telegram.ui.rn) n2Var).f41992b5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        return n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).f42026e : MessagesController.getInstance(this.F1).getChat(Long.valueOf(-this.V));
    }

    public final float l1() {
        ih ihVar = this.f28714z0;
        return ihVar.getMeasuredHeight() - ((1.0f - ihVar.getAlpha()) * (ihVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final tt m1() {
        yh yhVar;
        return (this.Y && ((yhVar = this.f28696u0) == this.f28650f0 || yhVar == this.m0)) ? this.L0 : this.A0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        return n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).a() : this.V;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        yh yhVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            in inVar = this.f28659i0;
            if (inVar != null && ((yhVar = this.f28699v0) == inVar || this.f28696u0 == inVar)) {
                a2(yhVar == inVar ? 1 : 0);
            }
            in inVar2 = this.f28662j0;
            if (inVar2 != null) {
                yh yhVar2 = this.f28699v0;
                if (yhVar2 == inVar2 || this.f28696u0 == inVar2) {
                    a2(yhVar2 != inVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 1) {
            e1();
            return;
        }
        if (i10 == 3) {
            f1();
            return;
        }
        if (i10 == 4) {
            f1();
            return;
        }
        if (i10 == 5) {
            f1();
            rh rhVar = this.E0;
            if (rhVar != null) {
                rhVar.setEphemeralFactor(f10);
                rhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final int o1() {
        yh yhVar = this.f28696u0;
        in inVar = this.f28659i0;
        if (yhVar == inVar && inVar.A != null) {
            return inVar.getEmojiPadding();
        }
        in inVar2 = this.f28662j0;
        if (yhVar != inVar2 || inVar2.A == null) {
            return this.Y ? this.L0.getEmojiPadding() : this.A0.getEmojiPadding();
        }
        return inVar2.getEmojiPadding();
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
        ag.d2 d2Var = this.T0;
        if (d2Var.f23578j0) {
            d2Var.h(true);
            return;
        }
        if (this.f28696u0.i()) {
            return;
        }
        if (m1() == null || !m1().f32878e) {
            super.onBackPressed();
        } else {
            m1().k(true);
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f28696u0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int iDp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        k81 k81Var = chatAttachAlertPhotoLayout.f26256h0;
        ag.p1 p1Var = chatAttachAlertPhotoLayout.f26252f0;
        TextView textView = chatAttachAlertPhotoLayout.f26264l0;
        gl glVar = chatAttachAlertPhotoLayout.f26270r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == p1Var) {
            if (z10) {
                if (glVar.getVisibility() == 0) {
                    p1Var.layout(0, org.telegram.messenger.y1.B(222.0f, i13, i16), i14, org.telegram.messenger.y1.B(96.0f, i13, i16));
                    return true;
                }
                p1Var.layout(0, org.telegram.messenger.y1.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (glVar.getVisibility() == 0) {
                p1Var.layout(org.telegram.messenger.y1.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            p1Var.layout(org.telegram.messenger.y1.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == k81Var) {
            if (z10) {
                if (glVar.getVisibility() == 0) {
                    k81Var.layout(0, org.telegram.messenger.y1.B(310.0f, i13, i16), i14, org.telegram.messenger.y1.B(260.0f, i13, i16));
                    return true;
                }
                k81Var.layout(0, org.telegram.messenger.y1.B(176.0f, i13, i16), i14, org.telegram.messenger.y1.B(126.0f, i13, i16));
                return true;
            }
            if (glVar.getVisibility() == 0) {
                k81Var.layout(org.telegram.messenger.y1.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            k81Var.layout(org.telegram.messenger.y1.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != glVar) {
                return false;
            }
            if (z10) {
                int iB = org.telegram.messenger.y1.B(88.0f, i15, i16);
                view.layout(0, iB, view.getMeasuredWidth(), view.getMeasuredHeight() + iB);
                return true;
            }
            int iDp2 = (i10 + i14) - AndroidUtilities.dp(88.0f);
            view.layout(iDp2, 0, view.getMeasuredWidth() + iDp2, view.getMeasuredHeight());
            return true;
        }
        if (z10) {
            iDp = (i14 - textView.getMeasuredWidth()) / 2;
            int iDp3 = i13 - AndroidUtilities.dp(167.0f);
            textView.setRotation(0.0f);
            if (glVar.getVisibility() == 0) {
                iDp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = iDp3 - i16;
        } else {
            iDp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (glVar.getVisibility() == 0) {
                iDp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(iDp, measuredWidth, textView.getMeasuredWidth() + iDp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        ul ulVar = chatAttachAlertPhotoLayout.v;
        gl glVar = chatAttachAlertPhotoLayout.f26270r;
        org.telegram.ui.j jVar = chatAttachAlertPhotoLayout.f26272s;
        boolean z10 = i10 < i11;
        ql qlVar = chatAttachAlertPhotoLayout.L;
        if (view != qlVar) {
            ag.p1 p1Var = chatAttachAlertPhotoLayout.f26252f0;
            if (view == p1Var) {
                if (z10) {
                    p1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                p1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            k81 k81Var = chatAttachAlertPhotoLayout.f26256h0;
            if (view == k81Var) {
                if (z10) {
                    k81Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                k81Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            if (view == glVar) {
                chatAttachAlertPhotoLayout.F0 = true;
                if (z10) {
                    glVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (jVar.f5720o != 0) {
                        glVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        jVar.j1(0);
                        ulVar.l();
                    }
                } else {
                    glVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (jVar.f5720o != 1) {
                        glVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        jVar.j1(1);
                        ulVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.F0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.U && !chatAttachAlertPhotoLayout.W) {
            qlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        this.f28650f0.setTranslationX(0.0f);
        this.f28663j1.setAlpha(0.0f);
        this.f28657h1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28671m2 = animatorSet;
        int i10 = 2;
        uh uhVar = this.f28667k2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, uhVar, 0.0f, 400.0f));
        this.f28671m2.setDuration(400L);
        this.f28671m2.setStartDelay(20L);
        Float fValueOf = Float.valueOf(0.0f);
        uhVar.getClass();
        uhVar.a(this, fValueOf);
        this.f28671m2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new qg(this, i10));
        o1.j jVar = this.f28669l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.f19130n, 0.0f);
        this.f28669l2 = jVar2;
        if (this.D1 != null) {
            jVar2.f19147u.a(0.75f);
            this.f28669l2.f19147u.b(350.0f);
        } else {
            jVar2.f19147u.a(0.75f);
            this.f28669l2.f19147u.b(350.0f);
        }
        this.f28669l2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, m6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.ui.ActionBar.i3 i3Var = new org.telegram.ui.ActionBar.i3(this, animationNotificationsLocker, this.delegate, 10);
        this.f28669l2.a(new nh.a4(i10, this, i3Var));
        this.currentSheetAnimation.addListener(new ag.x1(22, this, i3Var));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new qg(this, 3));
        valueAnimatorOfFloat2.setStartDelay(25L);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(er.f28122f);
        valueAnimatorOfFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f28696u0.q()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f28696u0.D(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f28635b0 instanceof org.telegram.ui.rn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f28696u0.v();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f28677o1 = true;
        if (this.I1 || this.H1) {
            return;
        }
        a1();
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).f35543x0.add(this.O);
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
            ((LaunchActivity) context).f35543x0.remove(this.O);
        }
    }

    public final int p1(int i10) {
        yh yhVar = this.f28699v0;
        int[] iArr = this.X1;
        return (yhVar == null || !((this.f28696u0 instanceof em) || (yhVar instanceof em))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.Z);
    }

    public final int q1(boolean z10) {
        ag.d2 d2Var;
        if (this.f28644d2) {
            return getThemedColor(org.telegram.ui.ActionBar.g6.f23349tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        float fC = 0.0f;
        for (ud.e eVar : this.f28672n) {
            long jLongValue = ((Long) eVar.f48505a).longValue();
            if (jLongValue == 1 || jLongValue == 3 || jLongValue == 4 || jLongValue == 5 || jLongValue == 6 || jLongValue == 9 || jLongValue == 11 || jLongValue == 12) {
                fC += eVar.c();
            }
        }
        float fA = h7.n.a(fC, 0.0f, 1.0f);
        if (z10 && (d2Var = this.T0) != null && d2Var.getVisibility() == 0) {
            fA *= 1.0f - d2Var.getAlpha();
        }
        return i0.b.d(fA, getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5), getThemedColor(zA ? org.telegram.ui.ActionBar.g6.f22999a7 : org.telegram.ui.ActionBar.g6.f23143i5));
    }

    public final void r1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        yh yhVar;
        this.J0 = 0L;
        this.E0.setEffect(0L);
        int i10 = 0;
        this.f28715z1 = false;
        this.f28708x1 = false;
        this.B1 = 0.0f;
        this.A1.setVisibility(8);
        RadialProgressView radialProgressView = this.f28712y1;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        ih ihVar = this.f28694t1;
        ihVar.setAlpha(1.0f);
        ihVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f28693t0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((nh.e4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.M0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (i12 == 2) {
            user = null;
            chat = null;
        } else if (n2Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            chat = rnVar.f42026e;
            user = rnVar.i();
        } else {
            long j10 = this.V;
            int i13 = this.F1;
            if (j10 >= 0) {
                user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.V));
                chat = null;
            } else if (j10 < 0) {
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.V));
                user = null;
            } else {
                user = null;
                chat = null;
            }
        }
        boolean z10 = n2Var instanceof org.telegram.ui.rn;
        if ((z10 && this.M0 != 2) || chat != null || user != null) {
            if (chat != null) {
                this.H1 = ChatObject.canSendPhoto(chat);
                this.I1 = ChatObject.canSendVideo(chat);
                this.J1 = ChatObject.canSendMusic(chat);
                this.K1 = ChatObject.canSendPolls(chat);
                this.L1 = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                this.M1 = ChatObject.canSendPlain(chat);
                this.G1 = ChatObject.canSendDocument(chat);
            } else {
                this.K1 = UserObject.isBot(user) || UserObject.isUserSelf(user);
                this.L1 = !z10 || ((org.telegram.ui.rn) n2Var).h == null;
            }
        }
        if (this.N1) {
            this.K1 = false;
            this.L1 = false;
        }
        mh mhVar = this.A0;
        if (!z10 || this.M0 == 2) {
            mhVar.setVisibility(this.S ? 0 : 4);
        }
        boolean z11 = this.I1;
        boolean z12 = this.H1;
        boolean z13 = this.G1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        az azVar = chatAttachAlertPhotoLayout.D;
        boolean z14 = z11 || z12;
        chatAttachAlertPhotoLayout.f26271r0 = z14;
        chatAttachAlertPhotoLayout.f26273s0 = z11;
        chatAttachAlertPhotoLayout.f26274t0 = z12;
        chatAttachAlertPhotoLayout.f26276v0 = z13;
        ql qlVar = chatAttachAlertPhotoLayout.L;
        if (qlVar != null) {
            qlVar.setAlpha(z14 ? 1.0f : 0.2f);
            chatAttachAlertPhotoLayout.L.setEnabled(chatAttachAlertPhotoLayout.f26271r0);
        }
        if (((giVar.f28635b0 instanceof org.telegram.ui.rn) || giVar.k1() != null) && giVar.M0 == 0) {
            chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.f26271r0) {
                azVar.setText(LocaleController.getString(R.string.NoPhotos));
                azVar.a(0, 0, 0);
            } else {
                TLRPC.Chat chatK1 = giVar.k1();
                azVar.a(R.raw.media_forbidden, 150, 150);
                if (ChatObject.isActionBannedByDefault(chatK1, 7)) {
                    azVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                } else if (AndroidUtilities.isBannedForever(chatK1.banned_rights)) {
                    azVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                } else {
                    azVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(chatK1.banned_rights.until_date)));
                }
            }
        } else if (chatAttachAlertPhotoLayout.q0()) {
            chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
        } else {
            chatAttachAlertPhotoLayout.Q0 = MediaController.allPhotosAlbumEntry;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            chatAttachAlertPhotoLayout.L0 = chatAttachAlertPhotoLayout.e0();
        }
        if (chatAttachAlertPhotoLayout.Q0 != null) {
            for (int i14 = 0; i14 < Math.min(100, chatAttachAlertPhotoLayout.Q0.photos.size()); i14++) {
                chatAttachAlertPhotoLayout.Q0.photos.get(i14).reset();
            }
        }
        chatAttachAlertPhotoLayout.Z();
        chatAttachAlertPhotoLayout.y0(false);
        chatAttachAlertPhotoLayout.f26272s.h1(0, 1000000);
        chatAttachAlertPhotoLayout.B.h1(0, 1000000);
        chatAttachAlertPhotoLayout.f26279x.setText(LocaleController.getString(R.string.ChatGallery));
        MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
        chatAttachAlertPhotoLayout.P0 = albumEntry;
        if (albumEntry != null) {
            chatAttachAlertPhotoLayout.T0 = false;
            if (azVar != null) {
                azVar.c();
            }
        }
        chatAttachAlertPhotoLayout.u0();
        mhVar.k(true);
        this.L0.k(true);
        this.f28683q1 = false;
        setFocusable(false);
        if (this.K || this.L) {
            if (this.f28665k0 == null) {
                tk tkVar = new tk(this, getContext(), this.resourcesProvider, (this.D || this.L || this.N1) ? false : true);
                this.f28665k0 = tkVar;
                this.f28690s0[5] = tkVar;
                ok okVar = this.f28681p2;
                if (okVar != null) {
                    tkVar.setDelegate(okVar);
                } else {
                    tkVar.setDelegate(new pg(this, i10));
                }
            }
            this.S0 = 5L;
            yhVar = this.f28665k0;
        } else if (this.J) {
            E1(false);
            yhVar = this.f28668l0;
            this.S0 = 4L;
        } else {
            MessageObject messageObject = this.D1;
            if (messageObject != null) {
                int i15 = this.C1;
                if (i15 == -1) {
                    this.O0 = true;
                    if (messageObject.isMusic()) {
                        B1(false);
                        yhVar = this.f28656h0;
                        this.S0 = 3L;
                    } else if (this.D1.isDocument()) {
                        E1(false);
                        yhVar = this.f28668l0;
                        this.S0 = 4L;
                    } else {
                        this.S0 = 1L;
                    }
                } else {
                    if (i15 == 2) {
                        B1(false);
                        yhVar = this.f28656h0;
                        this.S0 = 3L;
                    } else if (i15 == 1) {
                        E1(false);
                        yhVar = this.f28668l0;
                        this.S0 = 4L;
                    } else {
                        this.S0 = 1L;
                        yhVar = chatAttachAlertPhotoLayout;
                    }
                    this.O0 = false;
                }
            } else {
                this.O0 = this.M0 == 0 && !this.P0;
                this.S0 = 1L;
            }
            yhVar = chatAttachAlertPhotoLayout;
        }
        ihVar.setVisibility(this.O0 ? 0 : 8);
        if (this.f28696u0 != yhVar) {
            ag.d2 d2Var = this.T0;
            if (d2Var.f23578j0) {
                d2Var.h(true);
            }
            this.containerView.removeView(this.f28696u0);
            this.f28696u0.s();
            this.f28696u0.setVisibility(8);
            this.f28696u0.r();
            this.f28696u0 = yhVar;
            this.allowNestedScroll = true;
            if (yhVar.getParent() == null) {
                this.containerView.addView(this.f28696u0, 0, h7.z5.c(-1.0f, -1));
            }
            yhVar.setAlpha(1.0f);
            yhVar.setVisibility(0);
            yhVar.E(null);
            yhVar.F();
            d2Var.setVisibility(yhVar.h() != 0 ? 0 : 4);
            H1(this.Y, false);
            W1();
        }
        if (this.f28696u0 != chatAttachAlertPhotoLayout) {
            chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
        }
        V1(0);
        this.f28704w1.l();
        m1().setText("");
        this.f28700v1.h1(0, 1000000);
    }

    public final boolean s1() {
        if (!this.Y) {
            return false;
        }
        yh yhVar = this.f28696u0;
        return yhVar == this.f28650f0 || yhVar == this.m0;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        yh yhVar = this.f28696u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28650f0;
        return yhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f26251e1;
    }

    @Override
    public final void show() {
        super.show();
        this.E1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            this.calcMandatoryInsets = ((org.telegram.ui.rn) n2Var).x9();
        }
        W1();
        this.f28677o1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int iK = i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7), 0);
            this.navBarColor = iK;
            AndroidUtilities.setNavigationBarColor((Dialog) this, iK, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.f28661i2) {
            this.f28661i2 = false;
            ag.d2 d2Var = this.T0;
            d2Var.d();
            d2Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ei eiVar = this.V1;
        if (eiVar == null || this.f28683q1) {
            return;
        }
        boolean zS = eiVar.s();
        this.f28683q1 = true;
        AndroidUtilities.runOnUIThread(new hh.t5(this, editTextBoldCursor, z10, 15), zS ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int iQ1 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(iQ1, this.shadowDrawable);
        og.c cVar = this.B2;
        if (cVar.f19449a.getColor() != iQ1) {
            cVar.a(iQ1);
            sg.f fVar = this.f28687r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            kh khVar = this.f28691s1;
            if (khVar != null) {
                khVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i10 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.m();
            }
            i10++;
        }
        int i11 = this.F1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.R = true;
        mh mhVar = this.A0;
        if (mhVar != null) {
            mhVar.o();
        }
        ph phVar = this.L0;
        if (phVar != null) {
            phVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.f22527id) {
                break;
            }
        }
        String string = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string2 = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string2;
        if (tL_attachMenuBot == null) {
            string = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        b2Var.P = AndroidUtilities.replaceTags(string);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ag.l0(this, tL_attachMenuBot, user, 22));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i10 >= yhVarArr.length) {
                this.f28637b2 = true;
                return;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.y();
            }
            i10++;
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f28637b2 = false;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i10 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.B();
            }
            i10++;
        }
        if (isShowing()) {
            this.V1.s();
        }
        di diVar = this.f28704w1;
        if (diVar != null) {
            diVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.D1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28635b0;
        int i10 = this.F1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.D1.getDialogId()) && (n2Var instanceof org.telegram.ui.rn)) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            MessageSuggestionParams messageSuggestionParamsOf = rnVar.f42006c5;
            if (messageSuggestionParamsOf == null) {
                messageSuggestionParamsOf = MessageSuggestionParams.of(this.D1.messageOwner.suggested_post);
            }
            if (!hh.u7.U(i10, messageSuggestionParamsOf.amount)) {
                rnVar.Tb(messageSuggestionParamsOf);
                return;
            }
        }
        if (this.G - this.H < 0) {
            AndroidUtilities.shakeView(this.f28689s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.E0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(i10).premiumFeaturesBlocked() || MessagesController.getInstance(i10).captionLengthLimitPremium <= this.H) {
                return;
            }
            O1(n2Var);
            return;
        }
        if (this.D1 == null && (n2Var instanceof org.telegram.ui.rn)) {
            org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) n2Var;
            if (rnVar2.c()) {
                y4.M(getContext(), rnVar2.a(), new pg(this, 12), this.resourcesProvider);
                return;
            }
        }
        yh yhVar = this.f28696u0;
        if (yhVar == this.f28650f0 || yhVar == this.m0) {
            G1(0, true, 0, s1(), this.J0);
            return;
        }
        if (yhVar.I(0, true, 0, s1(), this.J0)) {
            return;
        }
        this.f28705w2 = true;
        dismiss();
    }

    @Override
    public final void dismiss() {
        if (this.f28696u0.n() || isDismissed()) {
            return;
        }
        mh mhVar = this.A0;
        if (mhVar != null) {
            AndroidUtilities.hideKeyboard(mhVar.getEditText());
        }
        ph phVar = this.L0;
        if (phVar != null) {
            AndroidUtilities.hideKeyboard(phVar.getEditText());
        }
        this.f28693t0.clear();
        org.telegram.ui.ActionBar.n2 n2VarR = this.f28635b0;
        if (n2VarR == null) {
            n2VarR = LaunchActivity.R();
        }
        if (!this.f28705w2 && n2VarR != null && this.f28696u0.getSelectedItemsCount() > 0 && !this.B) {
            if (this.f28701v2) {
                return;
            }
            this.f28701v2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2VarR.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new pg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.setOnCancelListener(new vg(this, 0));
            a1 a1Var = new a1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.J = a1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.f28690s0;
            if (i10 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null && this.f28696u0 != yhVar) {
                yhVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7), 0), true, (AndroidUtilities.IntColorCallback) new pg(this, 11));
        if (n2VarR != null) {
            AndroidUtilities.setLightStatusBar(this, n2VarR.isLightStatusBar());
        }
        this.f28648e2 = false;
        super.dismiss();
        this.f28705w2 = false;
    }

    @Override
    public final void A(float f10, int i10) {
    }

    public gi(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}
