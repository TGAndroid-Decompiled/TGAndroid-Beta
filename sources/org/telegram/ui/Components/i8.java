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
public final class i8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static i8 Y0;
    public static final float[] Z0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public String A0;
    public AnimatorSet B0;
    public int C0;
    public int D0;
    public final ei.d E;
    public final int E0;
    public final ei.d F;
    public final LaunchActivity F0;
    public final s4.y G;
    public int G0;
    public final y7 H;
    public float H0;
    public final z7 I;
    public int I0;
    public final q7 J;
    public long J0;
    public final r7 K;
    public long K0;
    public final z7 L;
    public boolean L0;
    public final org.telegram.ui.ActionBar.u0 M;
    public float M0;
    public final org.telegram.ui.nr N;
    public final org.telegram.ui.Cells.u5 N0;
    public org.telegram.ui.ActionBar.e1 O;
    public org.telegram.ui.aj O0;
    public final s7 P;
    public long P0;
    public final boolean Q;
    public float Q0;
    public final f90 R;
    public final org.telegram.ui.Cells.c2 R0;
    public final a8 S;
    public ValueAnimator S0;
    public final org.telegram.ui.ActionBar.n5 T;
    public int T0;
    public final org.telegram.ui.ActionBar.u0 U;
    public boolean U0;
    public final cd V;
    public int V0;
    public final org.telegram.ui.ActionBar.a1 W;
    public int W0;
    public boolean X;
    public int X0;
    public final org.telegram.ui.ActionBar.e1[] Y;
    public final TextView Z;
    public final org.telegram.ui.ActionBar.u0 f27325a0;
    public final View f27326b;
    public final org.telegram.ui.ActionBar.e1 f27327b0;
    public final x7 f27328c;
    public final org.telegram.ui.ActionBar.e1 f27329c0;
    public final View d;
    public final org.telegram.ui.ActionBar.e1 f27330d0;
    public final View e;
    public final org.telegram.ui.ActionBar.e1 f27331e0;
    public boolean f27332f;
    public final ImageView f27333f0;
    public final dh0 f27334g0;
    public boolean h;
    public final o7 f27335h0;
    public final u9 f27336i0;
    public final org.telegram.ui.ActionBar.u0 f27337j0;
    public final org.telegram.ui.ActionBar.u0 f27338k0;
    public boolean f27339l0;
    public final View[] m0;
    public final t7 f27340n;
    public final o1.k f27341n0;
    public long f27342o0;
    public boolean f27343p0;
    public boolean f27344q0;
    public final s4.b0 f27345r;
    public int f27346r0;
    public final h8 f27347s;
    public int f27348s0;
    public final boolean f27349t0;
    public final boolean f27350u0;
    public final LinearLayout v;
    public MessagesController.SavedMusicList f27351v0;
    public final TextView f27352w;
    public ArrayList f27353w0;
    public final TextView f27354x;
    public MessageObject f27355x0;
    public final o7 f27356y;
    public boolean f27357y0;
    public int f27358z0;

    public i8(Activity activity, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, (Context) activity, g6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.y yVar;
        float f7;
        boolean z11;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[6];
        this.Y = e1VarArr;
        View[] viewArr = new View[5];
        this.m0 = viewArr;
        this.f27344q0 = true;
        this.f27346r0 = -1;
        this.f27358z0 = Integer.MAX_VALUE;
        this.H0 = -1.0f;
        this.M0 = -1.0f;
        this.N0 = new org.telegram.ui.Cells.u5(this, 5);
        this.R0 = new org.telegram.ui.Cells.c2(this);
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
        w7 w7Var = new w7(this, activity);
        this.containerView = w7Var;
        w7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        x7 x7Var = new x7(this, activity, g6Var, 0);
        this.f27328c = x7Var;
        x7Var.setBackgroundColor(0);
        x7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.m(x7Var, 1, i13, g6Var);
        org.telegram.ui.ActionBar.r6.m(x7Var, 3, org.telegram.ui.ActionBar.k6.Ni, g6Var);
        org.telegram.ui.ActionBar.r6.m(x7Var, 5, i13, g6Var);
        org.telegram.ui.ActionBar.r6.m(x7Var, 6, org.telegram.ui.ActionBar.k6.Pi, g6Var);
        x7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y m10 = x7Var.m();
        m10.setLayoutParams(w7.z5.e(-1, -1, 119));
        View view = new View(activity);
        this.f27326b = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, view, g6Var);
        x7Var.addView(view, 0, w7.z5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        x7Var.setAlpha(0.0f);
        x7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 9));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view3, g6Var);
        o7 o7Var = new o7(this, activity, 2);
        this.f27356y = o7Var;
        y7 y7Var = new y7(this, activity);
        this.H = y7Var;
        o7Var.addView(y7Var, w7.z5.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        z7 z7Var = new z7(this, activity, activity, 0);
        this.I = z7Var;
        o7Var.addView(z7Var, w7.z5.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        z7 z7Var2 = new z7(this, activity, activity, 1);
        this.L = z7Var2;
        o7Var.addView(z7Var2, w7.z5.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        a8 a8Var = new a8(this, activity, g6Var);
        this.S = a8Var;
        a8Var.setLineWidth(4);
        a8Var.setDelegate(new n7(this));
        a8Var.setReportChanges(true);
        o7Var.addView(a8Var, w7.z5.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.f17622u = lVar;
        kVar.b(new j7(this, 0));
        this.f27341n0 = kVar;
        f90 f90Var = new f90(activity);
        this.R = f90Var;
        f90Var.setVisibility(4);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Ti, f90Var, g6Var);
        f90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        o7Var.addView(f90Var, w7.z5.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.T = n5Var;
        n5Var.setTextSize(12);
        n5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.k6.Si;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i14, g6Var);
        n5Var.setImportantForAccessibility(2);
        o7Var.addView(n5Var, w7.z5.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Z = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        o7Var.addView(textView, w7.z5.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(activity, null, 0, getThemedColor(i14), false, g6Var);
        this.U = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setShowSubmenuByMove(false);
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        u0Var.setDelegate(new y6(this, 0));
        cd cdVar = new cd();
        this.V = cdVar;
        u0Var.setIcon(cdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(getContext(), g6Var);
        this.W = a1Var;
        a1Var.setRoundRadiusDp(6.0f);
        a1Var.setDrawShadow(true);
        a1Var.setOnValueChange(new z6(this, 0));
        e1VarArr[0] = u0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        e1VarArr[1] = u0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        e1VarArr[2] = u0Var.e(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        e1VarArr[3] = u0Var.e(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        e1VarArr[4] = u0Var.e(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        e1VarArr[5] = u0Var.e(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            u0Var.setPadding(0, 1, 0, 0);
        }
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        u0Var.setShowedFromBottom(true);
        o7Var.addView(u0Var, w7.z5.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        u0Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(26, this, fArr));
        u0Var.setOnLongClickListener(new ci.l2(2, this, g6Var));
        L0(false);
        o7 o7Var2 = new o7(this, activity, 0);
        o7Var.addView(o7Var2, w7.z5.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(activity, null, 0, 0, false, g6Var);
        this.f27325a0 = u0Var2;
        viewArr[0] = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setShowSubmenuByMove(false);
        u0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i15 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
        u0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(u0Var2, g02, null, O, g6Var);
        o7Var2.addView(u0Var2, w7.z5.e(48, 48, 51));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f24639b;

            {
                this.f24639b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        i8 i8Var = this.f24639b;
                        i8Var.O0();
                        i8Var.f27325a0.M(null, null);
                        return;
                    default:
                        i8.K(this.f24639b, view4);
                        return;
                }
            }
        });
        this.f27327b0 = u0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.f27329c0 = u0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        u0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27330d0 = u0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        u0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27331e0 = u0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        u0Var2.setShowedFromBottom(true);
        u0Var2.setDelegate(new y6(this, 1));
        int i16 = org.telegram.ui.ActionBar.k6.Wi;
        int themedColor = getThemedColor(i16);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        q7 q7Var = new q7(this, activity, scaledTouchSlop);
        this.J = q7Var;
        viewArr[1] = q7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q7Var.setScaleType(scaleType);
        q7Var.f(R.raw.player_prev, 20, 20, null);
        q7Var.h(themedColor, "Triangle 3");
        q7Var.h(themedColor, "Triangle 4");
        q7Var.h(themedColor, "Rectangle 4");
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i15);
        q7Var.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(q7Var, g03, null, O2, g6Var);
        o7Var2.addView(q7Var, w7.z5.e(48, 48, 51));
        q7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f27333f0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        dh0 dh0Var = new dh0(28);
        this.f27334g0 = dh0Var;
        imageView.setImageDrawable(dh0Var);
        dh0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        org.telegram.ui.ActionBar.r6.t(imageView, i16, g6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(24.0f));
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i15);
        imageView.setBackground(g04);
        org.telegram.ui.ActionBar.r6.k(imageView, g04, null, O3, g6Var);
        o7Var2.addView(imageView, w7.z5.e(48, 48, 51));
        imageView.setOnClickListener(new ah.f(10));
        r7 r7Var = new r7(this, activity, scaledTouchSlop);
        this.K = r7Var;
        viewArr[3] = r7Var;
        r7Var.setScaleType(scaleType);
        r7Var.f(R.raw.player_prev, 20, 20, null);
        r7Var.h(themedColor, "Triangle 3");
        r7Var.h(themedColor, "Triangle 4");
        r7Var.h(themedColor, "Rectangle 4");
        r7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f));
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i15);
        r7Var.setBackground(g05);
        org.telegram.ui.ActionBar.r6.k(r7Var, g05, null, O4, g6Var);
        o7Var2.addView(r7Var, w7.z5.e(48, 48, 51));
        r7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(activity, null, 0, themedColor, false, g6Var);
        this.M = u0Var3;
        viewArr[4] = u0Var3;
        org.telegram.ui.nr nrVar = new org.telegram.ui.nr(activity, R.drawable.ic_ab_other, g6Var);
        this.N = nrVar;
        u0Var3.setIcon(nrVar);
        u0Var3.setLongClickEnabled(false);
        u0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i15);
        u0Var3.setBackground(g06);
        org.telegram.ui.ActionBar.r6.k(u0Var3, g06, null, O5, g6Var);
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f24639b;

            {
                this.f24639b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        i8 i8Var = this.f24639b;
                        i8Var.O0();
                        i8Var.f27325a0.M(null, null);
                        return;
                    default:
                        i8.K(this.f24639b, view4);
                        return;
                }
            }
        });
        o7Var2.addView(u0Var3, w7.z5.e(48, 48, 51));
        s7 s7Var = new s7(this, activity, 0);
        this.P = s7Var;
        this.Q = true;
        try {
            s7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e) {
            FileLog.e(e);
            this.Q = false;
        }
        this.P.setVisibility(4);
        org.telegram.ui.nr nrVar2 = this.N;
        if (nrVar2 != null) {
            nrVar2.a(b5.d.u());
        }
        this.M.setShowedFromBottom(true);
        this.M.setDelegate(new y6(this, 2));
        this.M.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new di.d(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, g6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f27352w = textView2;
        int i18 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.W(textView2, i18, g6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f27354x = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i18, g6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        t7 t7Var = new t7(this, activity);
        this.f27340n = t7Var;
        t7Var.setClipToPadding(false);
        getContext();
        s4.b0 b0Var = new s4.b0(1, false);
        this.f27345r = b0Var;
        t7Var.setLayoutManager(b0Var);
        t7Var.setHorizontalScrollBarEnabled(false);
        t7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(t7Var, w7.z5.e(-1, -1, 51));
        h8 h8Var = new h8(this, activity);
        this.f27347s = h8Var;
        t7Var.setAdapter(h8Var);
        org.telegram.ui.ActionBar.r6.m(t7Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        t7Var.setOnItemClickListener(new l7(0));
        t7Var.setOnItemLongClickListener(new y6(this, 3));
        t7Var.setOnScrollListener(new ah.d0(this, 19));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.E = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new vq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f28526b;

            {
                this.f28526b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        i8.B(this.f28526b, g6Var);
                        return;
                    default:
                        i8.A(this.f28526b, g6Var);
                        return;
                }
            }
        });
        this.f27356y.addView(dVar, w7.z5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ei.d dVar2 = new ei.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.F = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f28526b;

            {
                this.f28526b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        i8.B(this.f28526b, g6Var);
                        return;
                    default:
                        i8.A(this.f28526b, g6Var);
                        return;
                }
            }
        });
        this.f27356y.addView(dVar2, w7.z5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f27351v0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27349t0 = z10;
        this.f27328c.m0 = z10;
        this.f27350u0 = z0();
        this.f27353w0 = MediaController.getInstance().getPlaylist();
        if (z0()) {
            yVar = m10;
            this.f27337j0 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = m10;
        }
        org.telegram.ui.ActionBar.u0 a2 = yVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 4);
        this.f27338k0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i19 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.W(searchField, i19, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Si, g6Var);
        org.telegram.ui.ActionBar.r6.m(searchField, 30, i19, g6Var);
        if (z10) {
            t7Var.t1();
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, g6Var));
            this.f27328c.setAlpha(1.0f);
            f7 = 0.0f;
            this.f27326b.setAlpha(0.0f);
            org.telegram.ui.Cells.c2 c2Var = this.R0;
            x7 x7Var2 = this.f27328c;
            Float valueOf = Float.valueOf(0.0f);
            c2Var.getClass();
            c2Var.a(x7Var2, valueOf);
        } else {
            f7 = 0.0f;
        }
        if (this.f27353w0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        h8Var.h = z11;
        if (z11) {
            t7Var.setVisibility(0);
            t7Var.setTranslationY(f7);
        } else {
            t7Var.setVisibility(8);
            t7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        h8Var.l();
        this.f27328c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f27351v0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f27328c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f27328c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f27351v0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(MessagesController.getInstance(this.currentAccount), dialogId);
                if (l4 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(l4.user_id))) != null) {
                    this.f27328c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f27328c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f27328c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f27328c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f27328c.setTitle(chat.title);
                }
            }
        }
        if (z0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.y yVar2 = new s4.y(new u7(this));
            this.G = yVar2;
            yVar2.d(t7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        o7 o7Var3 = this.f27356y;
        int i20 = 52;
        if (!z0() && !this.f27357y0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(o7Var3, w7.z5.e(-1, i10 + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27356y.getLayoutParams();
        if (!z0() && !this.f27357y0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((z0() || this.f27357y0) ? 0 : 0));
        this.containerView.addView(this.d, w7.z5.c(3.0f, -1));
        this.containerView.addView(this.f27328c);
        o7 o7Var4 = new o7(this, activity, 1);
        this.f27335h0 = o7Var4;
        o7Var4.setAlpha(f7);
        o7Var4.setVisibility(4);
        getContainer().addView(o7Var4);
        u9 u9Var = new u9(activity);
        this.f27336i0 = u9Var;
        u9Var.setAspectFit(true);
        u9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        u9Var.setScaleX(0.9f);
        u9Var.setScaleY(0.9f);
        o7Var4.addView(u9Var, w7.z5.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        Q0(false);
        N0();
        if (this.h && h8Var.h() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        K0();
    }

    public static void A(i8 i8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && i8Var.F0 != null) {
            i8Var.C0(playingMessageObject, false, new ah.j(29), false);
            i8Var.F0(false);
            org.telegram.messenger.v0.p(R.string.AudioSaveToMyProfileUnsaved, new vc((FrameLayout) i8Var.containerView, g6Var), R.raw.ic_delete, 36);
        }
    }

    public static void B(i8 i8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && i8Var.F0 != null) {
            i8Var.C0(playingMessageObject, true, new ah.j(29), false);
            i8Var.F0(true);
            org.telegram.messenger.v0.p(R.string.AudioSaveToMyProfileSaved, new vc((FrameLayout) i8Var.containerView, g6Var), R.raw.saved_messages, 36);
        }
    }

    public static void C(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void D(i8 i8Var, float[] fArr) {
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
        if (currentTimeMillis - i8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && i8Var.containerView != null) {
                org.telegram.ui.aj ajVar = new org.telegram.ui.aj(5, 1, i8Var.getContext(), null, false);
                i8Var.O0 = ajVar;
                ajVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                i8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                i8Var.f27356y.addView(i8Var.O0, w7.z5.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                i8Var.O0.f(i8Var.U, true);
            }
        }
        i8Var.P0 = currentTimeMillis;
    }

    public static void E(i8 i8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = i8Var.F0;
        int i10 = UserConfig.selectedAccount;
        int i11 = i8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(i8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(i8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.v0(new org.telegram.ui.sn(bundle), false, false);
        i8Var.dismiss();
    }

    public static void F(i8 i8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(i8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(i8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(i8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f20350id == j10) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(i8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(i8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void G(i8 i8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f20365id == i10) {
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
                i8Var.C0(new MessageObject(i8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new k7(i8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(i8Var, tL_error, 3));
        }
    }

    public static void I(i8 i8Var, MessageObject messageObject, h80 h80Var) {
        ArrayList<MessageObject> k10;
        int i10;
        String formatString;
        long clientUserId = UserConfig.getInstance(i8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = i8Var.currentAccount;
        if (i11 != i12) {
            i8Var.F0.P0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                i10 = 36;
                h80Var.u();
                org.telegram.messenger.v0.p(R.string.AudioSaveToSavedMessagesSaved, new vc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.saved_messages, i10);
            }
            k10 = null;
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
        } else {
            k10 = org.telegram.messenger.v0.k(messageObject);
        }
        if (k10 != null) {
            SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(k10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, i8Var.f27351v0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            vc a02 = vc.a0(R);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(i8Var.currentAccount).getClientUserId()) {
                formatString = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                formatString = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId));
            } else {
                formatString = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i10 = 36;
            a02.Q(i13, 36, formatString).j();
        } else {
            i10 = 36;
        }
        h80Var.u();
        org.telegram.messenger.v0.p(R.string.AudioSaveToSavedMessagesSaved, new vc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void J(i8 i8Var) {
        org.telegram.ui.ActionBar.g6 g6Var = i8Var.resourcesProvider;
        new vc((FrameLayout) i8Var.containerView, g6Var).o(uc.F, g6Var).j();
    }

    public static void K(i8 i8Var, View view) {
        s7 s7Var = i8Var.P;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        h80 G = h80.G(i8Var.container, i8Var.resourcesProvider, view, true);
        h80 u02 = i8Var.u0(G, playingMessageObject);
        if (!i8Var.z0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new gi.g2(G, u02, 7), !i8Var.f27357y0);
            if (!i8Var.f27357y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new f7(i8Var, G, 0), !i8Var.f27357y0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new f7(i8Var, G, 1), !i8Var.f27357y0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new f7(i8Var, G, 2), z10);
        if (i8Var.Q) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, G.e, G.d, false, false);
            G.d(e1Var);
            i8Var.O = e1Var;
            e1Var.j(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            i8Var.O.setOnClickListener(new org.telegram.ui.ActionBar.s1(27, i8Var, G));
            AndroidUtilities.removeFromParent(s7Var);
            i8Var.O.addView(s7Var, 0, w7.z5.c(-1.0f, -1));
            i8Var.updateColors();
        }
        G.m(i8Var.z0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new f7(i8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void L(i8 i8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(i8Var.currentAccount).getInputPeer(UserConfig.getInstance(i8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.vc(11, i8Var, c2Var));
    }

    public static void P(i8 i8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f7;
        float f10;
        float f11;
        View view = i8Var.d;
        x7 x7Var = i8Var.f27328c;
        t7 t7Var = i8Var.f27340n;
        if (t7Var.getChildCount() <= 0) {
            int paddingTop = t7Var.getPaddingTop();
            i8Var.f27358z0 = paddingTop;
            t7Var.setTopGlowOffset(paddingTop);
            i8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = t7Var.getChildAt(0);
        vl0 vl0Var = (vl0) t7Var.G(childAt);
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
        if ((z10 && x7Var.getTag() == null) || (!z10 && x7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            x7Var.setTag(num);
            AnimatorSet animatorSet = i8Var.B0;
            if (animatorSet != null) {
                animatorSet.cancel();
                i8Var.B0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            i8Var.B0 = animatorSet2;
            float f13 = 0.0f;
            if (i8Var.f27349t0) {
                org.telegram.ui.Cells.c2 c2Var = i8Var.R0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var, c2Var, f10);
                View view2 = i8Var.f27326b;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x7Var, property2, f7);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f13));
            }
            i8Var.B0.setDuration(320L);
            i8Var.B0.setInterpolator(zr.h);
            i8Var.B0.addListener(new v7(i8Var, 2));
            i8Var.B0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t7Var.getLayoutParams();
        int D = org.telegram.messenger.tl.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (i8Var.f27358z0 != D) {
            i8Var.f27358z0 = D;
            t7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            i8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (i8Var.backgroundPaddingTop + ((int) (t7Var.getTranslationY() + ((i8Var.f27358z0 - i8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - i8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        i8Var.M0 = f12;
        if (f12 <= 0.5f && i0.a.h(i8Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != i8Var.L0) {
            i8Var.L0 = z11;
            AndroidUtilities.setLightStatusBar(i8Var, z11);
        }
    }

    public static int k0(i8 i8Var) {
        return i8Var.currentAccount;
    }

    public static int l0(i8 i8Var) {
        return i8Var.backgroundPaddingTop;
    }

    public static void m(i8 i8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = i8Var.f27351v0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (i8Var.f27351v0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                i8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(i8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, i8Var.f27351v0);
        }
    }

    public static int m0(i8 i8Var) {
        return i8Var.backgroundPaddingTop;
    }

    public static void n(i8 i8Var, h80 h80Var) {
        i8Var.F0(true);
        new vc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        h80Var.u();
    }

    public static void p(i8 i8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f20438id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(i8Var) {
                        public final i8 f27315b;

                        {
                            this.f27315b = i8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    i8.G(this.f27315b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    i8.y(this.f27315b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(i8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f20382id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(i8Var) {
                    public final i8 f27315b;

                    {
                        this.f27315b = i8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                i8.G(this.f27315b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                i8.y(this.f27315b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new h7(i8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(i8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new p2(i8Var, j10, z11, document, runnable));
    }

    public static void q(i8 i8Var, MessageObject messageObject, h80 h80Var) {
        i8Var.f27351v0.remove(messageObject);
        i8Var.f27353w0.remove(messageObject);
        i8Var.f27347s.l();
        h80Var.u();
        i8Var.F0(false);
        org.telegram.messenger.v0.p(R.string.AudioSaveToMyProfileUnsaved, new vc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void r(i8 i8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f20372id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f20356id = document.f20350id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = i8Var.f27351v0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            i8Var.f27353w0.clear();
            i8Var.f27353w0.addAll(i8Var.f27351v0.list);
            i8Var.f27347s.l();
            ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void s(i8 i8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.ey eyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String formatPluralStringComma;
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(i8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle h = a1.g.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                h.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                h.putLong("user_id", j11);
            } else {
                h.putLong("chat_id", -j11);
            }
            org.telegram.ui.sn snVar = new org.telegram.ui.sn(h);
            if (topicKey.topicId != 0) {
                og.d.a(snVar, topicKey);
            }
            if (i8Var.F0.v0(snVar, true, false)) {
                snVar.Gb(arrayList3);
                if (topicKey.topicId != 0) {
                    eyVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            eyVar.finishFragment();
            return;
        }
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i12;
                SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i12;
                SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, i8Var.f27351v0, null, false, false));
            }
            i12 = i11 + 1;
            arrayList3 = arrayList;
        }
        eyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            vc a02 = vc.a0(R);
            int i13 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(i8Var.currentAccount).getClientUserId()) {
                formatPluralStringComma = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId > 0) {
                formatPluralStringComma = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId < 0) {
                formatPluralStringComma = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size());
            }
            a02.Q(i13, 36, formatPluralStringComma).j();
        }
    }

    public static void t(i8 i8Var) {
        new vc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void u(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void v(i8 i8Var) {
        new vc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void w(i8 i8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && i8Var.f27351v0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f20350id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f20372id = tL_inputDocument;
                tL_inputDocument.f20356id = document.f20350id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = i8Var.f27351v0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                i8Var.f27353w0.clear();
                i8Var.f27353w0.addAll(i8Var.f27351v0.list);
                i8Var.f27347s.l();
                ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(i8Var.getContext(), 3, null);
            c2Var.r(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(i8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ai.a4(i8Var, c2Var, document, 6));
            }
        }
    }

    public static boolean w0(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.05f) {
            return true;
        }
        return false;
    }

    public static void x(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void y(i8 i8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f20365id == i10) {
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
                i8Var.C0(new MessageObject(i8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new k7(i8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(i8Var, tL_error, 2));
        }
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

    public static void z(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.b1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
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
                launchActivity.v0(new org.telegram.ui.sn(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                B0(playingMessageObject);
            } else if (i10 == 6) {
                qf.b.Y().d0(MediaController.getInstance().getCurrentChromecastMedia());
                this.P.performClick();
            } else if (i10 == 7) {
                C0(playingMessageObject, false, new b7(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                ei.s7 s7Var = new ei.s7(getContext(), true, null, new d7(this, 0), null);
                s7Var.f9814h0 = true;
                s7Var.Z = false;
                s7Var.f9823r0.N(true);
                s7Var.show();
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
        if (str3 != null && str3.length() > 0 && !si.o0.t(str3)) {
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
        MediaController.saveFile(str4, this.F0, 3, str2, str5, new d7(this, 1));
    }

    public final void C0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j10 = document.f20350id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f20372id = tL_inputDocument;
        tL_inputDocument.f20356id = j10;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new g7(this, z11, messageObject, z10, runnable, j10, document));
    }

    public final boolean D0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.D0(boolean):boolean");
    }

    public final void E0(org.telegram.ui.ActionBar.e1 e1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.k6.Xi;
            e1Var.setTextColor(getThemedColor(i10));
            e1Var.setIconColor(getThemedColor(i10));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        e1Var.setTextColor(getThemedColor(i11));
        e1Var.setIconColor(getThemedColor(i11));
    }

    public final void F0(final boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z02 = z0();
        ei.d dVar = this.F;
        ei.d dVar2 = this.E;
        if (!z02 && !this.f27357y0) {
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
            zr zrVar = zr.h;
            duration.setInterpolator(zrVar).withEndAction(new Runnable(this) {
                public final i8 f25238b;

                {
                    this.f25238b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            ei.d dVar3 = this.f25238b.E;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            ei.d dVar4 = this.f25238b.F;
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
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(zrVar).withEndAction(new Runnable(this) {
                public final i8 f25238b;

                {
                    this.f25238b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            ei.d dVar3 = this.f25238b.E;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            ei.d dVar4 = this.f25238b.F;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.G0(org.telegram.messenger.MessageObject):void");
    }

    public final void H0(boolean z10, boolean z11) {
        u9 u9Var = this.f27336i0;
        o7 o7Var = this.f27335h0;
        if (z10) {
            if (o7Var.getVisibility() != 0 && !this.f27339l0) {
                o7Var.setTag(1);
                y7 y7Var = this.H;
                u9Var.setImageBitmap(y7Var.f25618a[y7Var.f25619b].getImageReceiver().getBitmap());
                this.f27339l0 = true;
                bn0.d(new z6(this, 1));
                o7Var.setVisibility(0);
                o7Var.animate().alpha(1.0f).setDuration(180L).setListener(new v7(this, 0)).start();
                u9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (o7Var.getVisibility() != 0) {
        } else {
            o7Var.setTag(null);
            if (z11) {
                this.f27339l0 = true;
                o7Var.animate().alpha(0.0f).setDuration(180L).setListener(new v7(this, 1)).start();
                u9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            o7Var.setAlpha(0.0f);
            o7Var.setVisibility(4);
            u9Var.setImageBitmap(null);
            u9Var.setScaleX(0.9f);
            u9Var.setScaleY(0.9f);
        }
    }

    public final void I0(org.telegram.ui.Cells.w wVar, MessageObject messageObject) {
        int i10;
        boolean z10 = true;
        h80 G = h80.G(this.container, this.resourcesProvider, wVar, true);
        if (z0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 0), !this.f27357y0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 1), !this.f27357y0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new e7(this, messageObject, G, 2), true);
        } else {
            h80 u02 = u0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new gi.g2(G, u02, 6), !this.f27357y0);
            if (!this.f27357y0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 3), !this.f27357y0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 4), !this.f27357y0);
            if (messageObject.getId() <= 0) {
                z10 = false;
            }
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new b7(this, messageObject, 1), z10);
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
            org.telegram.ui.Cells.u5 u5Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var);
        }
    }

    public final void K0() {
        int i10;
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f27356y.getVisibility() == 0) {
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
                org.telegram.ui.ActionBar.e1[] e1VarArr = this.Y;
                if (i10 < e1VarArr.length) {
                    if (!z11 && w0(playbackSpeed, Z0[i10])) {
                        org.telegram.ui.ActionBar.e1 e1Var = e1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.k6.Qh;
                        e1Var.d(getThemedColor(i11), getThemedColor(i11));
                    } else {
                        org.telegram.ui.ActionBar.e1 e1Var2 = e1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.k6.E8;
                        e1Var2.d(getThemedColor(i12), getThemedColor(i12));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void M0(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.M0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void N0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.u0 u0Var = this.f27325a0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                u0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.k6.Xi;
                u0Var.setTag(Integer.valueOf(i11));
                u0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), getThemedColor(i11) & 436207615, true);
                u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i10 == 0) {
                u0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                u0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (SharedConfig.playOrderReversed) {
            if (i10 == 0) {
                u0Var.setIcon(R.drawable.player_new_order);
            } else {
                u0Var.setIcon(R.drawable.player_new_repeat_reverse);
            }
        } else {
            u0Var.setIcon(R.drawable.player_new_repeatall);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.k6.Wi;
            u0Var.setTag(Integer.valueOf(i12));
            u0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6), true);
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.k6.Xi;
        u0Var.setTag(Integer.valueOf(i13));
        u0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 == 0) {
            if (SharedConfig.shuffleMusic) {
                u0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
                return;
            } else {
                u0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
                return;
            }
        }
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
    }

    public final void O0() {
        boolean z10;
        E0(this.f27330d0, SharedConfig.shuffleMusic);
        E0(this.f27331e0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        E0(this.f27329c0, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        E0(this.f27327b0, z11);
    }

    public final void P0() {
        int i10;
        int themedColor;
        int i11;
        int i12;
        if (this.f27349t0) {
            i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21255h5;
        }
        int themedColor2 = getThemedColor(i10);
        if (themedColor2 != this.T0) {
            this.T0 = themedColor2;
            setBackgroundColor(themedColor2);
        }
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.Wi);
        q7 q7Var = this.J;
        if (q7Var != null) {
            q7Var.h(themedColor3, "Triangle 3");
            q7Var.h(themedColor3, "Triangle 4");
            q7Var.h(themedColor3, "Rectangle 4");
        }
        r7 r7Var = this.K;
        if (r7Var != null) {
            r7Var.h(themedColor3, "Triangle 3");
            r7Var.h(themedColor3, "Triangle 4");
            r7Var.h(themedColor3, "Rectangle 4");
        }
        a8 a8Var = this.S;
        if (a8Var != null) {
            a8Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.u0 u0Var = this.U;
        if (u0Var != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            if (!w0(playbackSpeed, 1.0f)) {
                i11 = org.telegram.ui.ActionBar.k6.Qh;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21555x7;
            }
            int themedColor4 = getThemedColor(i11);
            cd cdVar = this.V;
            if (cdVar != null) {
                ((n6) cdVar.f25293c).u(themedColor4);
                Paint paint = (Paint) cdVar.f25292b;
                if (paint != null) {
                    paint.setColor(themedColor4);
                }
            }
            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), themedColor4 & 436207615, true);
            int i13 = 0;
            while (true) {
                org.telegram.ui.ActionBar.e1[] e1VarArr = this.Y;
                if (i13 >= e1VarArr.length) {
                    break;
                }
                if (e1VarArr[i13] != null) {
                    if (w0(playbackSpeed, Z0[i13])) {
                        i12 = org.telegram.ui.ActionBar.k6.Qh;
                    } else {
                        i12 = org.telegram.ui.ActionBar.k6.E8;
                    }
                    int themedColor5 = getThemedColor(i12);
                    e1VarArr[i13].d(themedColor5, themedColor5);
                }
                i13++;
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.O;
        if (e1Var != null) {
            s7 s7Var = this.P;
            if (s7Var != null && s7Var.b()) {
                z10 = true;
            }
            int themedColor6 = getThemedColor(org.telegram.ui.ActionBar.k6.E8);
            int themedColor7 = getThemedColor(org.telegram.ui.ActionBar.k6.F8);
            int i14 = org.telegram.ui.ActionBar.k6.Oh;
            e1Var.e(themedColor6, themedColor7, getThemedColor(i14), z10);
            org.telegram.ui.ActionBar.e1 e1Var2 = this.O;
            if (s7Var != null && s7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i14));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6);
            }
            e1Var2.setSelectorColor(themedColor);
        }
    }

    public final void Q0(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.Q0(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21279id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21298jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21523vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21505uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21299je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21280ie));
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
        t7 t7Var = this.f27340n;
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
                h8 h8Var = this.f27347s;
                if (i10 == i14) {
                    this.f27351v0 = MediaController.getInstance().currentSavedMusicList;
                    this.f27353w0 = MediaController.getInstance().getPlaylist();
                    h8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f27351v0 = MediaController.getInstance().currentSavedMusicList;
                    this.f27353w0 = MediaController.getInstance().getPlaylist();
                    h8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        t7Var.B0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        s4.b0 b0Var = this.f27345r;
                        b0Var.L0();
                        int N0 = b0Var.N0();
                        if (N0 != -1) {
                            View m10 = b0Var.m(N0);
                            if (m10 != null) {
                                i13 = m10.getTop();
                            }
                            b0Var.h1(N0 + intValue, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoaded) {
                    if (((String) objArr[0]).equals(this.A0)) {
                        Q0(false);
                        this.f27343p0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.A0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        float f7 = 1.0f;
                        if (!this.f27343p0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f27342o0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f7 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.A0);
                                }
                                this.f27342o0 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        if (f7 != -1.0f) {
                            o1.k kVar = this.f27341n0;
                            kVar.f17622u.f17628i = f7 * 1000.0f;
                            kVar.h();
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
                int childCount = t7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = t7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = t7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = t7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    wVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    J0();
                } else if (this.G0 == 1 && this.H0 != -1.0f) {
                    org.telegram.ui.Cells.u5 u5Var = this.N0;
                    AndroidUtilities.cancelRunOnUIThread(u5Var);
                    this.K0 = 0L;
                    u5Var.run();
                    this.H0 = -1.0f;
                }
            }
        }
        org.telegram.ui.nr nrVar = this.N;
        if (nrVar != null) {
            nrVar.a(b5.d.u());
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
        o7 o7Var = this.f27356y;
        if (o7Var == null) {
            return 0;
        }
        if (this.f27353w0.size() <= 1) {
            return o7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f27340n.getTranslationY() + ((this.f27358z0 - this.backgroundPaddingTop) - dp));
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
        x6 x6Var = new x6(this, 0);
        int i10 = org.telegram.ui.ActionBar.k6.Oi;
        x7 x7Var = this.f27328c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(x7Var, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.t6(x7Var, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vi));
        int i12 = org.telegram.ui.ActionBar.k6.f21537w7;
        org.telegram.ui.ActionBar.u0 u0Var = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21555x7));
        int i13 = org.telegram.ui.ActionBar.k6.Wi;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f27325a0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.Xi));
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i14));
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i15));
        org.telegram.ui.ActionBar.u0 u0Var3 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i15));
        q7 q7Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q7Var, new xj0[]{q7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q7Var, new xj0[]{q7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q7Var, new xj0[]{q7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        int i16 = org.telegram.ui.ActionBar.k6.f21273i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f27333f0, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        r7 r7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var, new xj0[]{r7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var, new xj0[]{r7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var, new xj0[]{r7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        int i17 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f27352w, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f27354x, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21166c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        z7 z7Var = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.t6(z7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(z7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        z7 z7Var2 = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.t6(z7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(z7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
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
        x7 x7Var = this.f27328c;
        if (x7Var != null && x7Var.f21069n0) {
            x7Var.g(true);
        } else if (this.f27335h0.getTag() != null) {
            H0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        o7 o7Var = this.f27335h0;
        if (view != o7Var) {
            return false;
        }
        o7Var.layout(0, 0, o7Var.getMeasuredWidth(), o7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        o7 o7Var = this.f27335h0;
        if (view == o7Var) {
            o7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
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
            if (this.f27338k0 != null && this.f27325a0 != null && this.M != null && this.R != null) {
                v0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            P0();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            float f7 = this.M0;
            if (f7 >= 0.0f) {
                if (f7 <= 0.5f && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) > 0.699999988079071d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.L0) {
                    this.L0 = z10;
                    AndroidUtilities.setLightStatusBar(this, z10);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void show() {
        super.show();
        Y0 = this;
    }

    public final h80 u0(h80 h80Var, MessageObject messageObject) {
        long j10;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j10 = document.f20350id;
        } else {
            j10 = 0;
        }
        h80 J = h80Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ut0(h80Var, 26), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new e7(this, messageObject, h80Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new e7(this, messageObject, h80Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new e7(this, messageObject, h80Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void updateColors() {
        int themedColor;
        int i10;
        boolean z10 = true;
        org.telegram.ui.ActionBar.u0 u0Var = this.U;
        if (u0Var != null) {
            if (!w0(MediaController.getInstance().getPlaybackSpeed(true), 1.0f)) {
                i10 = org.telegram.ui.ActionBar.k6.Qh;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21555x7;
            }
            int themedColor2 = getThemedColor(i10);
            cd cdVar = this.V;
            if (cdVar != null) {
                ((n6) cdVar.f25293c).u(themedColor2);
                Paint paint = (Paint) cdVar.f25292b;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            u0Var.setBackground(org.telegram.ui.ActionBar.k6.g0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.O;
        if (e1Var != null) {
            s7 s7Var = this.P;
            z10 = (s7Var == null || !s7Var.b()) ? false : false;
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.E8);
            int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.k6.F8);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            e1Var.e(themedColor3, themedColor4, getThemedColor(i11), z10);
            org.telegram.ui.ActionBar.e1 e1Var2 = this.O;
            if (s7Var != null && s7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6);
            }
            e1Var2.setSelectorColor(themedColor);
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f27325a0;
        int themedColor = getThemedColor(((Integer) u0Var.getTag()).intValue());
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Wi);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6);
        if (!this.U0 || themedColor != this.V0) {
            this.V0 = themedColor;
            u0Var.setIconColor(themedColor);
        }
        boolean z10 = this.U0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.M;
        if (!z10 || themedColor2 != this.W0) {
            this.W0 = themedColor2;
            u0Var2.setIconColor(themedColor2);
        }
        if (!this.U0 || themedColor3 != this.X0) {
            this.X0 = themedColor3;
            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), themedColor3, true);
            org.telegram.ui.ActionBar.k6.E1(u0Var2.getBackground(), themedColor3, true);
        }
        this.U0 = true;
        this.R.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        O0();
        int i10 = org.telegram.ui.ActionBar.k6.G8;
        u0Var.B(getThemedColor(i10));
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        u0Var2.G(getThemedColor(i11), false);
        u0Var2.G(getThemedColor(i11), true);
        u0Var2.B(getThemedColor(i10));
    }

    public final void x0(MessageObject messageObject) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.F0;
        if (i10 != i11) {
            launchActivity.P0(i11);
        }
        Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
        e.putBoolean("canSelectTopics", true);
        org.telegram.ui.ey eyVar = new org.telegram.ui.ey(e);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            k10 = null;
        } else {
            k10 = org.telegram.messenger.v0.k(messageObject);
            tL_document = null;
        }
        eyVar.C2 = new a1.d(this, k10, tL_document, messageObject, 8);
        launchActivity.u0(eyVar);
        dismiss();
    }

    public final boolean z0() {
        MessagesController.SavedMusicList savedMusicList = this.f27351v0;
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
