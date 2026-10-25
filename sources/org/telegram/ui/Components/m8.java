package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class m8 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static m8 Y0;
    public static final float[] Z0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public String A0;
    public AnimatorSet B0;
    public int C0;
    public int D0;
    public final fi.d E;
    public final int E0;
    public final fi.d F;
    public final LaunchActivity F0;
    public final s4.z G;
    public int G0;
    public final c8 H;
    public float H0;
    public final d8 I;
    public int I0;
    public final u7 J;
    public long J0;
    public final v7 K;
    public long K0;
    public final d8 L;
    public boolean L0;
    public final org.telegram.ui.ActionBar.w0 M;
    public float M0;
    public final org.telegram.ui.qr N;
    public final m.g3 N0;
    public org.telegram.ui.ActionBar.g1 O;
    public org.telegram.ui.bj O0;
    public final w7 P;
    public long P0;
    public final boolean Q;
    public float Q0;
    public final i90 R;
    public final org.telegram.ui.Cells.b2 R0;
    public final e8 S;
    public ValueAnimator S0;
    public final org.telegram.ui.ActionBar.b6 T;
    public int T0;
    public final org.telegram.ui.ActionBar.w0 U;
    public boolean U0;
    public final dd V;
    public int V0;
    public final org.telegram.ui.ActionBar.c1 W;
    public int W0;
    public boolean X;
    public int X0;
    public final org.telegram.ui.ActionBar.g1[] Y;
    public final TextView Z;
    public final org.telegram.ui.ActionBar.w0 f30420a0;
    public final View f30421b;
    public final org.telegram.ui.ActionBar.g1 f30422b0;
    public final b8 f30423c;
    public final org.telegram.ui.ActionBar.g1 f30424c0;
    public final View d;
    public final org.telegram.ui.ActionBar.g1 f30425d0;
    public final View e;
    public final org.telegram.ui.ActionBar.g1 f30426e0;
    public boolean f30427f;
    public final ImageView f30428f0;
    public final dh0 f30429g0;
    public boolean h;
    public final s7 f30430h0;
    public final y9 f30431i0;
    public final org.telegram.ui.ActionBar.w0 f30432j0;
    public final org.telegram.ui.ActionBar.w0 f30433k0;
    public boolean f30434l0;
    public final View[] m0;
    public final x7 f30435n;
    public final o1.j f30436n0;
    public long f30437o0;
    public boolean f30438p0;
    public boolean f30439q0;
    public final s4.c0 f30440r;
    public int f30441r0;
    public final l8 f30442s;
    public int f30443s0;
    public final boolean f30444t0;
    public final boolean f30445u0;
    public final LinearLayout v;
    public MessagesController.SavedMusicList f30446v0;
    public final TextView f30447w;
    public ArrayList f30448w0;
    public final TextView f30449x;
    public MessageObject f30450x0;
    public final s7 f30451y;
    public boolean f30452y0;
    public int f30453z0;

    public m8(Activity activity, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, (Context) activity, u6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.z zVar;
        boolean z11;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.Y = g1VarArr;
        View[] viewArr = new View[5];
        this.m0 = viewArr;
        this.f30439q0 = true;
        this.f30441r0 = -1;
        this.f30453z0 = Integer.MAX_VALUE;
        this.H0 = -1.0f;
        this.M0 = -1.0f;
        this.N0 = new m.g3(this, 9);
        this.R0 = new org.telegram.ui.Cells.b2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.F0 = (LaunchActivity) activity;
        this.E0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        a8 a8Var = new a8(this, activity);
        this.containerView = a8Var;
        a8Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        b8 b8Var = new b8(this, activity, u6Var, 0);
        this.f30423c = b8Var;
        b8Var.setBackgroundColor(0);
        b8Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i13, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.Ni, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i13, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 6, org.telegram.ui.ActionBar.y6.Pi, u6Var);
        b8Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z l4 = b8Var.l();
        l4.setLayoutParams(gb1.i(-1, -1, 119));
        View view = new View(activity);
        this.f30421b = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, view, u6Var);
        b8Var.addView(view, 0, gb1.i(-1, -1, 119));
        view.setAlpha(0.0f);
        b8Var.setAlpha(0.0f);
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 9));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view3, u6Var);
        s7 s7Var = new s7(this, activity, 2);
        this.f30451y = s7Var;
        c8 c8Var = new c8(this, activity);
        this.H = c8Var;
        s7Var.addView(c8Var, gb1.h(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        d8 d8Var = new d8(this, activity, activity, 0);
        this.I = d8Var;
        s7Var.addView(d8Var, gb1.h(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        d8 d8Var2 = new d8(this, activity, activity, 1);
        this.L = d8Var2;
        s7Var.addView(d8Var2, gb1.h(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        e8 e8Var = new e8(this, activity, u6Var);
        this.S = e8Var;
        e8Var.setLineWidth(4);
        e8Var.setDelegate(new r7(this));
        e8Var.setReportChanges(true);
        s7Var.addView(e8Var, gb1.h(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new ac.a(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.f18969u = kVar;
        jVar.b(new n7(this, 0));
        this.f30436n0 = jVar;
        i90 i90Var = new i90(activity);
        this.R = i90Var;
        i90Var.setVisibility(4);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.Ti, i90Var, u6Var);
        i90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
        s7Var.addView(i90Var, gb1.h(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(activity);
        this.T = b6Var;
        b6Var.setTextSize(12);
        b6Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.y6.Si;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i14, u6Var);
        b6Var.setImportantForAccessibility(2);
        s7Var.addView(b6Var, gb1.h(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Z = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        s7Var.addView(textView, gb1.h(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i14), false, u6Var);
        this.U = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new c7(this, 0));
        dd ddVar = new dd();
        this.V = ddVar;
        w0Var.setIcon(ddVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), u6Var);
        this.W = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new d7(this, 0));
        g1VarArr[0] = w0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        g1VarArr[1] = w0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        g1VarArr[2] = w0Var.e(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        g1VarArr[3] = w0Var.e(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        g1VarArr[4] = w0Var.e(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        g1VarArr[5] = w0Var.e(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            w0Var.setPadding(0, 1, 0, 0);
        }
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        w0Var.setShowedFromBottom(true);
        s7Var.addView(w0Var, gb1.h(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new org.telegram.ui.ActionBar.u1(26, this, fArr));
        w0Var.setOnLongClickListener(new di.l2(2, this, u6Var));
        L0(false);
        s7 s7Var2 = new s7(this, activity, 0);
        s7Var.addView(s7Var2, gb1.h(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, u6Var);
        this.f30420a0 = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i15 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
        w0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(w0Var2, g02, null, N, u6Var);
        s7Var2.addView(w0Var2, gb1.i(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f27751b;

            {
                this.f27751b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        m8 m8Var = this.f27751b;
                        m8Var.O0();
                        m8Var.f30420a0.U(null, null);
                        return;
                    default:
                        m8.K(this.f27751b, view4);
                        return;
                }
            }
        });
        this.f30422b0 = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.f30424c0 = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f30425d0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f30426e0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new c7(this, 1));
        int i16 = org.telegram.ui.ActionBar.y6.Wi;
        int themedColor = getThemedColor(i16);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        u7 u7Var = new u7(this, activity, scaledTouchSlop);
        this.J = u7Var;
        viewArr[1] = u7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u7Var.setScaleType(scaleType);
        u7Var.f(R.raw.player_prev, 20, 20, null);
        u7Var.h(themedColor, "Triangle 3");
        u7Var.h(themedColor, "Triangle 4");
        u7Var.h(themedColor, "Rectangle 4");
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
        u7Var.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(u7Var, g03, null, N2, u6Var);
        s7Var2.addView(u7Var, gb1.i(48, 48, 51));
        u7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f30428f0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        dh0 dh0Var = new dh0(28);
        this.f30429g0 = dh0Var;
        imageView.setImageDrawable(dh0Var);
        dh0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        org.telegram.ui.ActionBar.f7.t(imageView, i16, u6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(24.0f));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i15);
        imageView.setBackground(g04);
        org.telegram.ui.ActionBar.f7.k(imageView, g04, null, N3, u6Var);
        s7Var2.addView(imageView, gb1.i(48, 48, 51));
        imageView.setOnClickListener(new bh.f(10));
        v7 v7Var = new v7(this, activity, scaledTouchSlop);
        this.K = v7Var;
        viewArr[3] = v7Var;
        v7Var.setScaleType(scaleType);
        v7Var.f(R.raw.player_prev, 20, 20, null);
        v7Var.h(themedColor, "Triangle 3");
        v7Var.h(themedColor, "Triangle 4");
        v7Var.h(themedColor, "Rectangle 4");
        v7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i15);
        v7Var.setBackground(g05);
        org.telegram.ui.ActionBar.f7.k(v7Var, g05, null, N4, u6Var);
        s7Var2.addView(v7Var, gb1.i(48, 48, 51));
        v7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, u6Var);
        this.M = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.qr qrVar = new org.telegram.ui.qr(activity, R.drawable.ic_ab_other, u6Var);
        this.N = qrVar;
        w0Var3.setIcon(qrVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i15);
        w0Var3.setBackground(g06);
        org.telegram.ui.ActionBar.f7.k(w0Var3, g06, null, N5, u6Var);
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f27751b;

            {
                this.f27751b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        m8 m8Var = this.f27751b;
                        m8Var.O0();
                        m8Var.f30420a0.U(null, null);
                        return;
                    default:
                        m8.K(this.f27751b, view4);
                        return;
                }
            }
        });
        s7Var2.addView(w0Var3, gb1.i(48, 48, 51));
        w7 w7Var = new w7(this, activity, 0);
        this.P = w7Var;
        this.Q = true;
        try {
            w7Var.setRouteSelector(e6.a.c(activity).a());
        } catch (Exception e) {
            FileLog.e(e);
            this.Q = false;
        }
        this.P.setVisibility(4);
        org.telegram.ui.qr qrVar2 = this.N;
        if (qrVar2 != null) {
            qrVar2.a(c5.d.u());
        }
        this.M.setShowedFromBottom(true);
        this.M.setDelegate(new c7(this, 2));
        this.M.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, gb1.g(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.d(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.W5, u6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, gb1.r(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f30447w = textView2;
        int i18 = org.telegram.ui.ActionBar.y6.X5;
        org.telegram.ui.ActionBar.f7.V(textView2, i18, u6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, gb1.x(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f30449x = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i18, u6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, gb1.x(-2, -2, 17, 0, 6, 0, 0));
        x7 x7Var = new x7(this, activity);
        this.f30435n = x7Var;
        x7Var.setClipToPadding(false);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        this.f30440r = c0Var;
        x7Var.setLayoutManager(c0Var);
        x7Var.setHorizontalScrollBarEnabled(false);
        x7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(x7Var, gb1.i(-1, -1, 51));
        l8 l8Var = new l8(this, activity);
        this.f30442s = l8Var;
        x7Var.setAdapter(l8Var);
        org.telegram.ui.ActionBar.f7.m(x7Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        x7Var.setOnItemClickListener(new p7(0));
        x7Var.setOnItemLongClickListener(new c7(this, 3));
        x7Var.setOnScrollListener(new ai.b(this, 23));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        this.E = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new zq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f31849b;

            {
                this.f31849b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        m8.B(this.f31849b, u6Var);
                        return;
                    default:
                        m8.A(this.f31849b, u6Var);
                        return;
                }
            }
        });
        this.f30451y.addView(dVar, gb1.h(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        fi.d dVar2 = new fi.d(activity, u6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.F = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f31849b;

            {
                this.f31849b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        m8.B(this.f31849b, u6Var);
                        return;
                    default:
                        m8.A(this.f31849b, u6Var);
                        return;
                }
            }
        });
        this.f30451y.addView(dVar2, gb1.h(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f30446v0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30444t0 = z10;
        this.f30423c.m0 = z10;
        this.f30445u0 = z0();
        this.f30448w0 = MediaController.getInstance().getPlaylist();
        if (z0()) {
            zVar = l4;
            this.f30432j0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = l4;
        }
        org.telegram.ui.ActionBar.w0 a2 = zVar.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 5);
        this.f30433k0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i19 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(searchField, i19, u6Var);
        org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Si, u6Var);
        org.telegram.ui.ActionBar.f7.m(searchField, 30, i19, u6Var);
        if (z10) {
            x7Var.u1();
            setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, u6Var));
            this.f30423c.setAlpha(1.0f);
            this.f30421b.setAlpha(0.0f);
            this.R0.set(this.f30423c, Float.valueOf(0.0f));
        }
        if (this.f30448w0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        l8Var.h = z11;
        if (z11) {
            x7Var.setVisibility(0);
            x7Var.setTranslationY(0.0f);
        } else {
            x7Var.setVisibility(8);
            x7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        l8Var.l();
        this.f30423c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f30446v0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f30423c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f30423c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f30446v0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(MessagesController.getInstance(this.currentAccount), dialogId);
                if (m10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(m10.user_id))) != null) {
                    this.f30423c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f30423c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f30423c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f30423c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f30423c.setTitle(chat.title);
                }
            }
        }
        if (z0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.z zVar2 = new s4.z(new y7(this));
            this.G = zVar2;
            zVar2.h(x7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        s7 s7Var3 = this.f30451y;
        int i20 = 52;
        if (!z0() && !this.f30452y0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(s7Var3, gb1.i(-1, i10 + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30451y.getLayoutParams();
        if (!z0() && !this.f30452y0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((z0() || this.f30452y0) ? 0 : 0));
        this.containerView.addView(this.d, gb1.g(3.0f, -1));
        this.containerView.addView(this.f30423c);
        s7 s7Var4 = new s7(this, activity, 1);
        this.f30430h0 = s7Var4;
        s7Var4.setAlpha(0.0f);
        s7Var4.setVisibility(4);
        getContainer().addView(s7Var4);
        y9 y9Var = new y9(activity);
        this.f30431i0 = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        y9Var.setScaleX(0.9f);
        y9Var.setScaleY(0.9f);
        s7Var4.addView(y9Var, gb1.h(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        Q0(false);
        N0();
        if (this.h && l8Var.h() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        K0();
    }

    public static void A(m8 m8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && m8Var.F0 != null) {
            m8Var.C0(playingMessageObject, false, new k5(1), false);
            m8Var.F0(false);
            org.telegram.messenger.t.q(R.string.AudioSaveToMyProfileUnsaved, new wc((FrameLayout) m8Var.containerView, u6Var), R.raw.ic_delete, 36);
        }
    }

    public static void B(m8 m8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && m8Var.F0 != null) {
            m8Var.C0(playingMessageObject, true, new k5(1), false);
            m8Var.F0(true);
            org.telegram.messenger.t.q(R.string.AudioSaveToMyProfileSaved, new wc((FrameLayout) m8Var.containerView, u6Var), R.raw.saved_messages, 36);
        }
    }

    public static void C(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static void D(m8 m8Var, float[] fArr) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        int i10 = 0;
        while (true) {
            if (i10 < fArr.length) {
                if (playbackSpeed - 0.1f <= fArr[i10]) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        int i11 = i10 + 1;
        if (i11 >= fArr.length) {
            i11 = 0;
        }
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i11]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - m8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && m8Var.containerView != null) {
                org.telegram.ui.bj bjVar = new org.telegram.ui.bj(5, 1, m8Var.getContext(), null, false);
                m8Var.O0 = bjVar;
                bjVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                m8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                m8Var.f30451y.addView(m8Var.O0, gb1.h(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                m8Var.O0.f(m8Var.U, true);
            }
        }
        m8Var.P0 = currentTimeMillis;
    }

    public static void F(m8 m8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = m8Var.F0;
        int i10 = UserConfig.selectedAccount;
        int i11 = m8Var.currentAccount;
        if (i10 != i11) {
            launchActivity.P0(i11);
        }
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(m8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(m8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.v0(new org.telegram.ui.un(bundle), false, false);
        m8Var.dismiss();
    }

    public static void G(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(m8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(m8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(m8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f22033id == j10) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(m8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(m8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void H(m8 m8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f22048id == i10) {
                        message = messages_messages.messages.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    message = null;
                    break;
                }
            }
            if (message != null) {
                m8Var.C0(new MessageObject(m8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new o7(m8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 3));
        }
    }

    public static void I(m8 m8Var, MessageObject messageObject, k80 k80Var) {
        ArrayList<MessageObject> l4;
        int i10;
        String formatString;
        long clientUserId = UserConfig.getInstance(m8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = m8Var.currentAccount;
        if (i11 != i12) {
            m8Var.F0.P0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                i10 = 36;
                k80Var.u();
                org.telegram.messenger.t.q(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider), R.raw.saved_messages, i10);
            }
            l4 = null;
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
        } else {
            l4 = org.telegram.messenger.t.l(messageObject);
        }
        if (l4 != null) {
            SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(l4, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(m8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, m8Var.f30446v0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R != null) {
            wc b02 = wc.b0(R);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(m8Var.currentAccount).getClientUserId()) {
                formatString = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                formatString = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId));
            } else {
                formatString = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i10 = 36;
            b02.R(i13, 36, formatString).j();
        } else {
            i10 = 36;
        }
        k80Var.u();
        org.telegram.messenger.t.q(R.string.AudioSaveToSavedMessagesSaved, new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void J(m8 m8Var) {
        org.telegram.ui.ActionBar.u6 u6Var = m8Var.resourcesProvider;
        new wc((FrameLayout) m8Var.containerView, u6Var).o(vc.F, u6Var).j();
    }

    public static void K(m8 m8Var, View view) {
        w7 w7Var = m8Var.P;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        k80 G = k80.G(m8Var.container, m8Var.resourcesProvider, view, true);
        k80 u02 = m8Var.u0(G, playingMessageObject);
        if (!m8Var.z0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new hi.o2(G, u02, 7), !m8Var.f30452y0);
            if (!m8Var.f30452y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new j7(m8Var, G, 0), !m8Var.f30452y0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new j7(m8Var, G, 1), !m8Var.f30452y0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new j7(m8Var, G, 2), z10);
        if (m8Var.Q) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.e, G.d, false, false);
            G.d(g1Var);
            m8Var.O = g1Var;
            g1Var.j(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            m8Var.O.setOnClickListener(new org.telegram.ui.ActionBar.u1(27, m8Var, G));
            AndroidUtilities.removeFromParent(w7Var);
            m8Var.O.addView(w7Var, 0, gb1.g(-1.0f, -1));
            m8Var.updateColors();
        }
        G.m(R.drawable.msg_delete, new j7(m8Var, G, 3), LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), m8Var.z0(), true);
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void L(m8 m8Var, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            e2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(m8Var.currentAccount).getInputPeer(UserConfig.getInstance(m8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.z7(12, m8Var, e2Var));
    }

    public static void P(m8 m8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f7;
        float f10;
        float f11;
        View view = m8Var.d;
        b8 b8Var = m8Var.f30423c;
        x7 x7Var = m8Var.f30435n;
        if (x7Var.getChildCount() <= 0) {
            int paddingTop = x7Var.getPaddingTop();
            m8Var.f30453z0 = paddingTop;
            x7Var.setTopGlowOffset(paddingTop);
            m8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = x7Var.getChildAt(0);
        vl0 vl0Var = (vl0) x7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.w) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int dp = AndroidUtilities.dp(7.0f);
        if (bottom < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
            bottom = dp;
        }
        if (bottom <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 1.0f;
        if ((z10 && b8Var.getTag() == null) || (!z10 && b8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            b8Var.setTag(num);
            AnimatorSet animatorSet = m8Var.B0;
            if (animatorSet != null) {
                animatorSet.cancel();
                m8Var.B0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            m8Var.B0 = animatorSet2;
            float f13 = 0.0f;
            if (m8Var.f30444t0) {
                org.telegram.ui.Cells.b2 b2Var = m8Var.R0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, b2Var, f10);
                View view2 = m8Var.f30421b;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, f11);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property, f13));
            } else {
                Property property2 = View.ALPHA;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b8Var, property2, f7);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f13));
            }
            m8Var.B0.setDuration(320L);
            m8Var.B0.setInterpolator(ds.h);
            m8Var.B0.addListener(new z7(m8Var, 2));
            m8Var.B0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x7Var.getLayoutParams();
        int w10 = org.telegram.ui.d3.w(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (m8Var.f30453z0 != w10) {
            m8Var.f30453z0 = w10;
            x7Var.setTopGlowOffset((w10 - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            m8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (m8Var.backgroundPaddingTop + ((int) (x7Var.getTranslationY() + ((m8Var.f30453z0 - m8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - m8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        m8Var.M0 = f12;
        if (f12 <= 0.5f && i0.a.h(m8Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != m8Var.L0) {
            m8Var.L0 = z11;
            AndroidUtilities.setLightStatusBar(m8Var, z11);
        }
    }

    public static org.telegram.ui.ActionBar.u6 g0(m8 m8Var) {
        return m8Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.u6 i0(m8 m8Var) {
        return m8Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.u6 j0(m8 m8Var) {
        return m8Var.resourcesProvider;
    }

    public static int k0(m8 m8Var) {
        return m8Var.currentAccount;
    }

    public static int l0(m8 m8Var) {
        return m8Var.backgroundPaddingTop;
    }

    public static void m(m8 m8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = m8Var.f30446v0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (m8Var.f30446v0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                m8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(m8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, m8Var.f30446v0);
        }
    }

    public static int m0(m8 m8Var) {
        return m8Var.backgroundPaddingTop;
    }

    public static void n(m8 m8Var, k80 k80Var) {
        m8Var.F0(true);
        new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider).R(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        k80Var.u();
    }

    public static void o(m8 m8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22121id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(m8Var) {
                        public final m8 f30412b;

                        {
                            this.f30412b = m8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    m8.H(this.f30412b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    m8.x(this.f30412b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(m8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f22065id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(m8Var) {
                    public final m8 f30412b;

                    {
                        this.f30412b = m8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                m8.H(this.f30412b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                m8.x(this.f30412b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new s2(m8Var, j10, z11, document, runnable));
    }

    public static void p(m8 m8Var, MessageObject messageObject, k80 k80Var) {
        m8Var.f30446v0.remove(messageObject);
        m8Var.f30448w0.remove(messageObject);
        m8Var.f30442s.l();
        k80Var.u();
        m8Var.F0(false);
        org.telegram.messenger.t.q(R.string.AudioSaveToMyProfileUnsaved, new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void q(m8 m8Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject) {
        e2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f22055id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f22039id = document.f22033id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = m8Var.f30446v0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            m8Var.f30448w0.clear();
            m8Var.f30448w0.addAll(m8Var.f30446v0.list);
            m8Var.f30442s.l();
            ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void r(m8 m8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.cy cyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String formatPluralStringComma;
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(m8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i12 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i12.putLong("user_id", j11);
            } else {
                i12.putLong("chat_id", -j11);
            }
            org.telegram.ui.un unVar = new org.telegram.ui.un(i12);
            if (topicKey.topicId != 0) {
                pg.d.a(unVar, topicKey);
            }
            if (m8Var.F0.v0(unVar, true, false)) {
                unVar.Mb(arrayList3);
                if (topicKey.topicId != 0) {
                    cyVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            cyVar.finishFragment();
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(m8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, m8Var.f30446v0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        cyVar.finishFragment();
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R != null) {
            wc b02 = wc.b0(R);
            int i14 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(m8Var.currentAccount).getClientUserId()) {
                formatPluralStringComma = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId > 0) {
                formatPluralStringComma = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId < 0) {
                formatPluralStringComma = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size());
            }
            b02.R(i14, 36, formatPluralStringComma).j();
        }
    }

    public static void s(m8 m8Var) {
        new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void t(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static void u(m8 m8Var) {
        new wc((FrameLayout) m8Var.containerView, m8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void v(m8 m8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && m8Var.f30446v0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f22033id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f22055id = tL_inputDocument;
                tL_inputDocument.f22039id = document.f22033id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = m8Var.f30446v0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                m8Var.f30448w0.clear();
                m8Var.f30448w0.addAll(m8Var.f30446v0.list);
                m8Var.f30442s.l();
                ConnectionsManager.getInstance(m8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(m8Var.getContext(), 3, null);
            e2Var.r(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(m8Var.currentAccount).uploadFile(file.getAbsolutePath(), new bi.v3(m8Var, e2Var, document, 6));
            }
        }
    }

    public static void w(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static boolean w0(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.05f) {
            return true;
        }
        return false;
    }

    public static void x(m8 m8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f22048id == i10) {
                        message = messages_messages.messages.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    message = null;
                    break;
                }
            }
            if (message != null) {
                m8Var.C0(new MessageObject(m8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new o7(m8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l7(m8Var, tL_error, 2));
        }
    }

    public static void y(m8 m8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.d3.t((FrameLayout) m8Var.containerView, m8Var.resourcesProvider, tL_error, false);
    }

    public static ImageLocation y0(MessageObject messageObject) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            photoSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return ImageLocation.getForDocument(photoSize, document);
        }
        String artworkUrl = messageObject.getArtworkUrl(true);
        if (artworkUrl == null) {
            return null;
        }
        return ImageLocation.getForPath(artworkUrl);
    }

    public final void A0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && (launchActivity = this.F0) != null) {
            if (i10 == 1) {
                x0(playingMessageObject);
            } else if (i10 == 2) {
                G0(playingMessageObject);
            } else if (i10 == 4) {
                int i11 = UserConfig.selectedAccount;
                int i12 = this.currentAccount;
                if (i11 != i12) {
                    launchActivity.P0(i12);
                }
                Bundle bundle = new Bundle();
                long dialogId = playingMessageObject.getDialogId();
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                } else if (DialogObject.isUserDialog(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                    if (chat != null && chat.migrated_to != null) {
                        bundle.putLong("migrated_to", dialogId);
                        dialogId = -chat.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -dialogId);
                }
                bundle.putInt("message_id", playingMessageObject.getId());
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                launchActivity.v0(new org.telegram.ui.un(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                B0(playingMessageObject);
            } else if (i10 == 6) {
                rf.b.L().O(MediaController.getInstance().getCurrentChromecastMedia());
                this.P.performClick();
            } else if (i10 == 7) {
                C0(playingMessageObject, false, new f7(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                fi.o7 o7Var = new fi.o7(getContext(), true, null, new h7(this, 0), null);
                o7Var.f11403h0 = true;
                o7Var.Z = false;
                o7Var.f11410p0.O(true);
                o7Var.show();
            }
        }
    }

    public final void B0(MessageObject messageObject) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) {
            LaunchActivity launchActivity = this.F0;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
        if (TextUtils.isEmpty(documentFileName)) {
            documentFileName = messageObject.getFileName();
        }
        String str2 = documentFileName;
        String str3 = messageObject.messageOwner.attachPath;
        if (str3 != null && str3.length() > 0 && !b10.t(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            str3 = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        String str4 = str3;
        if (messageObject.getDocument() != null) {
            str = messageObject.getDocument().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.saveFile(str4, this.F0, 3, str2, str5, new h7(this, 1));
    }

    public final void C0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j10 = document.f22033id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f22055id = tL_inputDocument;
        tL_inputDocument.f22039id = j10;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new k7(this, z11, messageObject, z10, runnable, j10, document));
    }

    public final boolean D0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m8.D0(boolean):boolean");
    }

    public final void E0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.y6.Xi;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        g1Var.setTextColor(getThemedColor(i11));
        g1Var.setIconColor(getThemedColor(i11));
    }

    public final void F0(final boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z02 = z0();
        fi.d dVar = this.F;
        fi.d dVar2 = this.E;
        if (!z02 && !this.f30452y0) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f13 = 0.0f;
            float f14 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z10) {
                f10 = 0.8f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f11).setDuration(420L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final m8 f28470b;

                {
                    this.f28470b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            fi.d dVar3 = this.f28470b.E;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            fi.d dVar4 = this.f28470b.F;
                            if (z10) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            dVar4.setVisibility(i11);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = dVar.animate();
            if (z10) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f13);
            if (!z10) {
                f12 = 0.8f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
            if (!z10) {
                f14 = 0.8f;
            }
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final m8 f28470b;

                {
                    this.f28470b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            fi.d dVar3 = this.f28470b.E;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            fi.d dVar4 = this.f28470b.F;
                            if (z10) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            dVar4.setVisibility(i11);
                            return;
                    }
                }
            }).start();
            return;
        }
        dVar2.setVisibility(8);
        dVar.setVisibility(8);
    }

    public final void G0(org.telegram.messenger.MessageObject r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m8.G0(org.telegram.messenger.MessageObject):void");
    }

    public final void H0(boolean z10, boolean z11) {
        y9 y9Var = this.f30431i0;
        s7 s7Var = this.f30430h0;
        if (z10) {
            if (s7Var.getVisibility() != 0 && !this.f30434l0) {
                s7Var.setTag(1);
                c8 c8Var = this.H;
                y9Var.setImageBitmap(c8Var.f28856a[c8Var.f28857b].getImageReceiver().getBitmap());
                this.f30434l0 = true;
                hn0.d(new d7(this, 1));
                s7Var.setVisibility(0);
                s7Var.animate().alpha(1.0f).setDuration(180L).setListener(new z7(this, 0)).start();
                y9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (s7Var.getVisibility() != 0) {
        } else {
            s7Var.setTag(null);
            if (z11) {
                this.f30434l0 = true;
                s7Var.animate().alpha(0.0f).setDuration(180L).setListener(new z7(this, 1)).start();
                y9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            s7Var.setAlpha(0.0f);
            s7Var.setVisibility(4);
            y9Var.setImageBitmap(null);
            y9Var.setScaleX(0.9f);
            y9Var.setScaleY(0.9f);
        }
    }

    public final void I0(org.telegram.ui.Cells.w wVar, MessageObject messageObject) {
        int i10;
        boolean z10 = true;
        k80 G = k80.G(this.container, this.resourcesProvider, wVar, true);
        if (z0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new i7(this, G, messageObject, 0), !this.f30452y0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new i7(this, G, messageObject, 1), !this.f30452y0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new i7(this, messageObject, G, 2), true);
        } else {
            k80 u02 = u0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new hi.o2(G, u02, 6), !this.f30452y0);
            if (!this.f30452y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new i7(this, G, messageObject, 3), !this.f30452y0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new i7(this, G, messageObject, 4), !this.f30452y0);
            if (messageObject.getId() <= 0) {
                z10 = false;
            }
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new f7(this, messageObject, 1), z10);
        }
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        G.V(i10);
        G.Z();
    }

    public final void J0() {
        if (this.G0 == 1) {
            this.J0 = System.currentTimeMillis();
            this.H0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            m.g3 g3Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var);
        }
    }

    public final void K0() {
        int i10;
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f30451y.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(150.0f);
        } else {
            i10 = -AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - i10) / 2);
    }

    public final void L0(boolean z10) {
        if (this.U != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            this.V.l(playbackSpeed, z10);
            this.W.e(playbackSpeed, z10);
            updateColors();
            boolean z11 = this.X;
            int i10 = 0;
            this.X = false;
            while (true) {
                org.telegram.ui.ActionBar.g1[] g1VarArr = this.Y;
                if (i10 < g1VarArr.length) {
                    if (!z11 && w0(playbackSpeed, Z0[i10])) {
                        org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.y6.Qh;
                        g1Var.d(getThemedColor(i11), getThemedColor(i11));
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.y6.E8;
                        g1Var2.d(getThemedColor(i12), getThemedColor(i12));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void M0(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m8.M0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void N0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.f30420a0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.y6.Xi;
                w0Var.setTag(Integer.valueOf(i11));
                w0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), getThemedColor(i11) & 436207615, true);
                w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i10 == 0) {
                w0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                w0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (SharedConfig.playOrderReversed) {
            if (i10 == 0) {
                w0Var.setIcon(R.drawable.player_new_order);
            } else {
                w0Var.setIcon(R.drawable.player_new_repeat_reverse);
            }
        } else {
            w0Var.setIcon(R.drawable.player_new_repeatall);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.y6.Wi;
            w0Var.setTag(Integer.valueOf(i12));
            w0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.y6.f23446i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.y6.Xi;
        w0Var.setTag(Integer.valueOf(i13));
        w0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 == 0) {
            if (SharedConfig.shuffleMusic) {
                w0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
                return;
            } else {
                w0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
                return;
            }
        }
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
    }

    public final void O0() {
        boolean z10;
        E0(this.f30425d0, SharedConfig.shuffleMusic);
        E0(this.f30426e0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        E0(this.f30424c0, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        E0(this.f30422b0, z11);
    }

    public final void P0() {
        int i10;
        int themedColor;
        int i11;
        int i12;
        if (this.f30444t0) {
            i10 = org.telegram.ui.ActionBar.y6.f23297a7;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23425h5;
        }
        int themedColor2 = getThemedColor(i10);
        if (themedColor2 != this.T0) {
            this.T0 = themedColor2;
            setBackgroundColor(themedColor2);
        }
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.Wi);
        u7 u7Var = this.J;
        if (u7Var != null) {
            u7Var.h(themedColor3, "Triangle 3");
            u7Var.h(themedColor3, "Triangle 4");
            u7Var.h(themedColor3, "Rectangle 4");
        }
        v7 v7Var = this.K;
        if (v7Var != null) {
            v7Var.h(themedColor3, "Triangle 3");
            v7Var.h(themedColor3, "Triangle 4");
            v7Var.h(themedColor3, "Rectangle 4");
        }
        e8 e8Var = this.S;
        if (e8Var != null) {
            e8Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.w0 w0Var = this.U;
        if (w0Var != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            if (!w0(playbackSpeed, 1.0f)) {
                i11 = org.telegram.ui.ActionBar.y6.Qh;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23730x7;
            }
            int themedColor4 = getThemedColor(i11);
            dd ddVar = this.V;
            if (ddVar != null) {
                ((r6) ddVar.f27510c).u(themedColor4);
                Paint paint = (Paint) ddVar.f27509b;
                if (paint != null) {
                    paint.setColor(themedColor4);
                }
            }
            org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), themedColor4 & 436207615, true);
            int i13 = 0;
            while (true) {
                org.telegram.ui.ActionBar.g1[] g1VarArr = this.Y;
                if (i13 >= g1VarArr.length) {
                    break;
                }
                if (g1VarArr[i13] != null) {
                    if (w0(playbackSpeed, Z0[i13])) {
                        i12 = org.telegram.ui.ActionBar.y6.Qh;
                    } else {
                        i12 = org.telegram.ui.ActionBar.y6.E8;
                    }
                    int themedColor5 = getThemedColor(i12);
                    g1VarArr[i13].d(themedColor5, themedColor5);
                }
                i13++;
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.O;
        if (g1Var != null) {
            w7 w7Var = this.P;
            if (w7Var != null && w7Var.b()) {
                z10 = true;
            }
            int themedColor6 = getThemedColor(org.telegram.ui.ActionBar.y6.E8);
            int themedColor7 = getThemedColor(org.telegram.ui.ActionBar.y6.F8);
            int i14 = org.telegram.ui.ActionBar.y6.Oh;
            g1Var.e(themedColor6, themedColor7, getThemedColor(i14), z10);
            org.telegram.ui.ActionBar.g1 g1Var2 = this.O;
            if (w7Var != null && w7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i14));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23446i6);
            }
            g1Var2.setSelectorColor(themedColor);
        }
    }

    public final void Q0(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m8.Q0(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23452id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23469jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23677uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23470je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ie));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.w wVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.w wVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i12 = NotificationCenter.messagePlayingDidStart;
        x7 x7Var = this.f30435n;
        int i13 = 0;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject2 != null && playingMessageObject2.isMusic()) {
                    M0(playingMessageObject2, false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
                L0(true);
                return;
            } else {
                int i14 = NotificationCenter.musicDidLoad;
                l8 l8Var = this.f30442s;
                if (i10 == i14) {
                    this.f30446v0 = MediaController.getInstance().currentSavedMusicList;
                    this.f30448w0 = MediaController.getInstance().getPlaylist();
                    l8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f30446v0 = MediaController.getInstance().currentSavedMusicList;
                    this.f30448w0 = MediaController.getInstance().getPlaylist();
                    l8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        x7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        s4.c0 c0Var = this.f30440r;
                        c0Var.L0();
                        int N0 = c0Var.N0();
                        if (N0 != -1) {
                            View m10 = c0Var.m(N0);
                            if (m10 != null) {
                                i13 = m10.getTop();
                            }
                            c0Var.h1(N0 + intValue, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoaded) {
                    if (((String) objArr[0]).equals(this.A0)) {
                        Q0(false);
                        this.f30438p0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.A0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        float f7 = 1.0f;
                        if (!this.f30438p0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f30437o0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f7 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.A0);
                                }
                                this.f30437o0 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        if (f7 != -1.0f) {
                            o1.j jVar = this.f30436n0;
                            jVar.f18969u.f18975i = f7 * 1000.0f;
                            jVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.musicIdsLoaded) {
                    Q0(false);
                    return;
                } else {
                    return;
                }
            }
        }
        int i15 = NotificationCenter.messagePlayingDidReset;
        if (i10 == i15 && ((Boolean) objArr[1]).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Q0(z10);
        if (i10 != i15 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (((MessageObject) objArr[0]).eventId == 0) {
                int childCount = x7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = x7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = x7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = x7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    wVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    J0();
                } else if (this.G0 == 1 && this.H0 != -1.0f) {
                    m.g3 g3Var = this.N0;
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    this.K0 = 0L;
                    g3Var.run();
                    this.H0 = -1.0f;
                }
            }
        }
        org.telegram.ui.qr qrVar = this.N;
        if (qrVar != null) {
            qrVar.a(c5.d.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.moreMusicDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicIdsLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        if (Y0 == this) {
            Y0 = null;
        }
    }

    @Override
    public final int getContainerViewHeight() {
        s7 s7Var = this.f30451y;
        if (s7Var == null) {
            return 0;
        }
        if (this.f30448w0.size() <= 1) {
            return s7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f30435n.getTranslationY() + ((this.f30453z0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override
    public final int getObserverTag() {
        return this.E0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        b7 b7Var = new b7(this, 0);
        int i10 = org.telegram.ui.ActionBar.y6.Oi;
        b8 b8Var = this.f30423c;
        arrayList.add(new org.telegram.ui.ActionBar.h7(b8Var, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.h7(b8Var, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.containerView, 0, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23425h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vi));
        int i12 = org.telegram.ui.ActionBar.y6.f23710w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23730x7));
        int i13 = org.telegram.ui.ActionBar.y6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f30420a0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.Xi));
        int i14 = org.telegram.ui.ActionBar.y6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i14));
        int i15 = org.telegram.ui.ActionBar.y6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i15));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i15));
        u7 u7Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, new xj0[]{u7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, new xj0[]{u7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, new xj0[]{u7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        int i16 = org.telegram.ui.ActionBar.y6.f23446i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(u7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f30428f0, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        v7 v7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, new xj0[]{v7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, new xj0[]{v7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, new xj0[]{v7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(v7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        int i17 = org.telegram.ui.ActionBar.y6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f30447w, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f30449x, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23426h6));
        d8 d8Var = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        d8 d8Var2 = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(d8Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ii));
        return arrayList;
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        int i10;
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f10 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f10 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f7 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.containerView.getTop();
        Drawable drawable = this.shadowDrawable;
        if (drawable != null) {
            i10 = drawable.getBounds().top;
        } else {
            i10 = 0;
        }
        if (f10 >= top + i10 && f7 >= this.containerView.getLeft() && f7 <= this.containerView.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onBackPressed() {
        b8 b8Var = this.f30423c;
        if (b8Var != null && b8Var.f22772n0) {
            b8Var.g(true);
        } else if (this.f30430h0.getTag() != null) {
            H0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        s7 s7Var = this.f30430h0;
        if (view != s7Var) {
            return false;
        }
        s7Var.layout(0, 0, s7Var.getMeasuredWidth(), s7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        s7 s7Var = this.f30430h0;
        if (view == s7Var) {
            s7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.R.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            if (this.f30433k0 != null && this.f30420a0 != null && this.M != null && this.R != null) {
                v0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            P0();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            float f7 = this.M0;
            if (f7 >= 0.0f) {
                if (f7 <= 0.5f && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5)) > 0.699999988079071d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.L0) {
                    this.L0 = z10;
                    AndroidUtilities.setLightStatusBar(this, z10);
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override
    public final void show() {
        super.show();
        Y0 = this;
    }

    public final k80 u0(k80 k80Var, MessageObject messageObject) {
        long j10;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j10 = document.f22033id;
        } else {
            j10 = 0;
        }
        k80 J = k80Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.zt0(k80Var, 26), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new i7(this, messageObject, k80Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new i7(this, messageObject, k80Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new i7(this, messageObject, k80Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void updateColors() {
        int themedColor;
        int i10;
        boolean z10 = true;
        org.telegram.ui.ActionBar.w0 w0Var = this.U;
        if (w0Var != null) {
            if (!w0(MediaController.getInstance().getPlaybackSpeed(true), 1.0f)) {
                i10 = org.telegram.ui.ActionBar.y6.Qh;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23730x7;
            }
            int themedColor2 = getThemedColor(i10);
            dd ddVar = this.V;
            if (ddVar != null) {
                ((r6) ddVar.f27510c).u(themedColor2);
                Paint paint = (Paint) ddVar.f27509b;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.y6.g0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.O;
        if (g1Var != null) {
            w7 w7Var = this.P;
            z10 = (w7Var == null || !w7Var.b()) ? false : false;
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.E8);
            int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.y6.F8);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            g1Var.e(themedColor3, themedColor4, getThemedColor(i11), z10);
            org.telegram.ui.ActionBar.g1 g1Var2 = this.O;
            if (w7Var != null && w7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23446i6);
            }
            g1Var2.setSelectorColor(themedColor);
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f30420a0;
        int themedColor = getThemedColor(((Integer) w0Var.getTag()).intValue());
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Wi);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.f23446i6);
        if (!this.U0 || themedColor != this.V0) {
            this.V0 = themedColor;
            w0Var.setIconColor(themedColor);
        }
        boolean z10 = this.U0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.M;
        if (!z10 || themedColor2 != this.W0) {
            this.W0 = themedColor2;
            w0Var2.setIconColor(themedColor2);
        }
        if (!this.U0 || themedColor3 != this.X0) {
            this.X0 = themedColor3;
            org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), themedColor3, true);
            org.telegram.ui.ActionBar.y6.E1(w0Var2.getBackground(), themedColor3, true);
        }
        this.U0 = true;
        this.R.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
        O0();
        int i10 = org.telegram.ui.ActionBar.y6.G8;
        w0Var.H(getThemedColor(i10));
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        w0Var2.O(getThemedColor(i11), false);
        w0Var2.O(getThemedColor(i11), true);
        w0Var2.H(getThemedColor(i10));
    }

    public final void x0(MessageObject messageObject) {
        ArrayList l4;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.F0;
        if (i10 != i11) {
            launchActivity.P0(i11);
        }
        Bundle c10 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
        c10.putBoolean("canSelectTopics", true);
        org.telegram.ui.cy cyVar = new org.telegram.ui.cy(c10);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            l4 = null;
        } else {
            l4 = org.telegram.messenger.t.l(messageObject);
            tL_document = null;
        }
        cyVar.C2 = new a1.d(this, l4, tL_document, messageObject, 8);
        launchActivity.u0(cyVar);
        dismiss();
    }

    public final boolean z0() {
        MessagesController.SavedMusicList savedMusicList = this.f30446v0;
        if (savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
