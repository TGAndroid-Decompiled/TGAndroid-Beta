package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class k8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static k8 T0;
    public static final float[] U0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public String B0;
    public AnimatorSet C0;
    public int D0;
    public final q7 E;
    public int E0;
    public final di.d F;
    public final int F0;
    public final di.d G;
    public final LaunchActivity G0;
    public final s4.y H;
    public int H0;
    public final a8 I;
    public float I0;
    public final b8 J;
    public int J0;
    public final s7 K;
    public long K0;
    public final t7 L;
    public long L0;
    public final b8 M;
    public boolean M0;
    public final org.telegram.ui.ActionBar.v0 N;
    public final org.telegram.ui.Cells.l7 N0;
    public final org.telegram.ui.zr O;
    public org.telegram.ui.ij O0;
    public org.telegram.ui.ActionBar.f1 P;
    public long P0;
    public final u7 Q;
    public float Q0;
    public final boolean R;
    public final org.telegram.ui.Cells.c2 R0;
    public final m80 S;
    public ValueAnimator S0;
    public final c8 T;
    public final org.telegram.ui.ActionBar.j5 U;
    public final org.telegram.ui.ActionBar.v0 V;
    public final fd W;
    public final org.telegram.ui.ActionBar.b1 X;
    public boolean Y;
    public final org.telegram.ui.ActionBar.f1[] Z;
    public final TextView f27713a0;
    public final View f27714b;
    public final org.telegram.ui.ActionBar.v0 f27715b0;
    public final z7 f27716c;
    public final org.telegram.ui.ActionBar.f1 f27717c0;
    public final View d;
    public final org.telegram.ui.ActionBar.f1 f27718d0;
    public final View f27719e;
    public final org.telegram.ui.ActionBar.f1 f27720e0;
    public boolean f27721f;
    public final org.telegram.ui.ActionBar.f1 f27722f0;
    public final ImageView f27723g0;
    public boolean h;
    public final fg0 f27724h0;
    public final q7 f27725i0;
    public final x9 f27726j0;
    public final org.telegram.ui.ActionBar.v0 f27727k0;
    public final org.telegram.ui.ActionBar.v0 f27728l0;
    public boolean m0;
    public final v7 f27729n;
    public final View[] f27730n0;
    public final o1.k f27731o0;
    public long f27732p0;
    public boolean f27733q0;
    public final s4.c0 f27734r;
    public boolean f27735r0;
    public final j8 f27736s;
    public int f27737s0;
    public int f27738t0;
    public final boolean f27739u0;
    public final LinearLayout v;
    public final boolean f27740v0;
    public final ImageView f27741w;
    public MessagesController.SavedMusicList f27742w0;
    public final TextView f27743x;
    public ArrayList f27744x0;
    public final TextView f27745y;
    public MessageObject f27746y0;
    public boolean f27747z0;

    public k8(Activity activity, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, (Context) activity, f6Var, true);
        boolean z10;
        boolean z11;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[6];
        this.Z = f1VarArr;
        View[] viewArr = new View[5];
        this.f27730n0 = viewArr;
        this.f27735r0 = true;
        this.f27737s0 = -1;
        this.A0 = Integer.MAX_VALUE;
        this.I0 = -1.0f;
        this.N0 = new org.telegram.ui.Cells.l7(this, 4);
        this.R0 = new org.telegram.ui.Cells.c2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.G0 = (LaunchActivity) activity;
        this.F0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        y7 y7Var = new y7(this, activity);
        this.containerView = y7Var;
        y7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        z7 z7Var = new z7(this, activity, f6Var, 0);
        this.f27716c = z7Var;
        z7Var.setBackgroundColor(0);
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.j6.Oi;
        z7Var.C(getThemedColor(i13), false);
        z7Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), false);
        z7Var.setTitleColor(getThemedColor(i13));
        z7Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
        z7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z n10 = z7Var.n();
        n10.setLayoutParams(w7.x5.e(-1, -1, 119));
        View view = new View(activity);
        this.f27714b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5));
        z7Var.addView(view, 0, w7.x5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        z7Var.setAlpha(0.0f);
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, 7));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.f27719e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        q7 q7Var = new q7(this, activity, 2);
        this.E = q7Var;
        a8 a8Var = new a8(this, activity);
        this.I = a8Var;
        q7Var.addView(a8Var, w7.x5.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        b8 b8Var = new b8(this, activity, activity, 0);
        this.J = b8Var;
        q7Var.addView(b8Var, w7.x5.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        b8 b8Var2 = new b8(this, activity, activity, 1);
        this.M = b8Var2;
        q7Var.addView(b8Var2, w7.x5.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        c8 c8Var = new c8(this, activity, f6Var);
        this.T = c8Var;
        c8Var.setLineWidth(4);
        c8Var.setDelegate(new p7(this));
        c8Var.setReportChanges(true);
        q7Var.addView(c8Var, w7.x5.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.f16825u = lVar;
        kVar.b(new l7(this, 0));
        this.f27731o0 = kVar;
        m80 m80Var = new m80(activity);
        this.S = m80Var;
        m80Var.setVisibility(4);
        m80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
        m80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
        q7Var.addView(m80Var, w7.x5.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.U = j5Var;
        j5Var.setTextSize(12);
        j5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.j6.Si;
        j5Var.setTextColor(getThemedColor(i14));
        j5Var.setImportantForAccessibility(2);
        q7Var.addView(j5Var, w7.x5.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f27713a0 = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i14));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        q7Var.addView(textView, w7.x5.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(activity, null, 0, getThemedColor(i14), false, f6Var);
        this.V = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setShowSubmenuByMove(false);
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        v0Var.setDelegate(new a7(this, 0));
        fd fdVar = new fd();
        this.W = fdVar;
        v0Var.setIcon(fdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), f6Var);
        this.X = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        b1Var.setDrawShadow(true);
        b1Var.setOnValueChange(new b7(this, 0));
        f1VarArr[0] = v0Var.e(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        f1VarArr[1] = v0Var.e(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        f1VarArr[2] = v0Var.e(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        f1VarArr[3] = v0Var.e(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        f1VarArr[4] = v0Var.e(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        f1VarArr[5] = v0Var.e(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            v0Var.setPadding(0, 1, 0, 0);
        }
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(400.0f));
        v0Var.setShowedFromBottom(true);
        q7Var.addView(v0Var, w7.x5.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        v0Var.setOnClickListener(new org.telegram.ui.rf(16, this, fArr));
        v0Var.setOnLongClickListener(new bi.d3(2, this, f6Var));
        F0(false);
        q7 q7Var2 = new q7(this, activity, 0);
        q7Var.addView(q7Var2, w7.x5.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(activity, null, 0, 0, false, f6Var);
        this.f27715b0 = v0Var2;
        viewArr[0] = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setShowSubmenuByMove(false);
        v0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i15 = org.telegram.ui.ActionBar.j6.f20753i6;
        v0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f)));
        q7Var2.addView(v0Var2, w7.x5.e(48, 48, 51));
        v0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f24912b;

            {
                this.f24912b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        k8 k8Var = this.f24912b;
                        k8Var.I0();
                        k8Var.f27715b0.M(null, null);
                        return;
                    default:
                        k8.J(this.f24912b, view4);
                        return;
                }
            }
        });
        this.f27717c0 = v0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.f27718d0 = v0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27720e0 = v0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27722f0 = v0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        v0Var2.setShowedFromBottom(true);
        v0Var2.setDelegate(new a7(this, 1));
        int i16 = org.telegram.ui.ActionBar.j6.Wi;
        int themedColor = getThemedColor(i16);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        s7 s7Var = new s7(this, activity, scaledTouchSlop);
        this.K = s7Var;
        viewArr[1] = s7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        s7Var.setScaleType(scaleType);
        s7Var.f(R.raw.player_prev, 20, 20, null);
        s7Var.h(themedColor, "Triangle 3");
        s7Var.h(themedColor, "Triangle 4");
        s7Var.h(themedColor, "Rectangle 4");
        s7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f)));
        q7Var2.addView(s7Var, w7.x5.e(48, 48, 51));
        s7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f27723g0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        fg0 fg0Var = new fg0(28);
        this.f27724h0 = fg0Var;
        imageView.setImageDrawable(fg0Var);
        fg0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(24.0f)));
        q7Var2.addView(imageView, w7.x5.e(48, 48, 51));
        imageView.setOnClickListener(new ah.f(9));
        t7 t7Var = new t7(this, activity, scaledTouchSlop);
        this.L = t7Var;
        viewArr[3] = t7Var;
        t7Var.setScaleType(scaleType);
        t7Var.f(R.raw.player_prev, 20, 20, null);
        t7Var.h(themedColor, "Triangle 3");
        t7Var.h(themedColor, "Triangle 4");
        t7Var.h(themedColor, "Rectangle 4");
        t7Var.setRotation(180.0f);
        t7Var.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f)));
        q7Var2.addView(t7Var, w7.x5.e(48, 48, 51));
        t7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(activity, null, 0, themedColor, false, f6Var);
        this.N = v0Var3;
        viewArr[4] = v0Var3;
        org.telegram.ui.zr zrVar = new org.telegram.ui.zr(activity, R.drawable.ic_ab_other, f6Var);
        this.O = zrVar;
        v0Var3.setIcon(zrVar);
        v0Var3.setLongClickEnabled(false);
        v0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f)));
        v0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f24912b;

            {
                this.f24912b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        k8 k8Var = this.f24912b;
                        k8Var.I0();
                        k8Var.f27715b0.M(null, null);
                        return;
                    default:
                        k8.J(this.f24912b, view4);
                        return;
                }
            }
        });
        q7Var2.addView(v0Var3, w7.x5.e(48, 48, 51));
        u7 u7Var = new u7(this, activity, 0);
        this.Q = u7Var;
        this.R = true;
        try {
            u7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e7) {
            FileLog.e(e7);
            this.R = false;
        }
        this.Q.setVisibility(4);
        org.telegram.ui.zr zrVar2 = this.O;
        if (zrVar2 != null) {
            zrVar2.a(b5.d.u());
        }
        this.N.setShowedFromBottom(true);
        this.N.setDelegate(new a7(this, 2));
        this.N.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.x5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ci.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.f27741w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f27743x = textView2;
        int i18 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i18));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f27745y = textView3;
        textView3.setTextColor(getThemedColor(i18));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        v7 v7Var = new v7(this, activity);
        this.f27729n = v7Var;
        v7Var.setClipToPadding(false);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        this.f27734r = c0Var;
        v7Var.setLayoutManager(c0Var);
        v7Var.setHorizontalScrollBarEnabled(false);
        v7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(v7Var, w7.x5.e(-1, -1, 51));
        j8 j8Var = new j8(this, activity);
        this.f27736s = j8Var;
        v7Var.setAdapter(j8Var);
        v7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        v7Var.setOnItemClickListener(new n7(0));
        v7Var.setOnItemLongClickListener(new a7(this, 3));
        v7Var.setOnScrollListener(new ah.e0(this, 15));
        di.d dVar = new di.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.F = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new nq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f28986b;

            {
                this.f28986b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        k8.D(this.f28986b, f6Var);
                        return;
                    default:
                        k8.C(this.f28986b, f6Var);
                        return;
                }
            }
        });
        this.E.addView(dVar, w7.x5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        di.d dVar2 = new di.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.G = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f28986b;

            {
                this.f28986b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        k8.D(this.f28986b, f6Var);
                        return;
                    default:
                        k8.C(this.f28986b, f6Var);
                        return;
                }
            }
        });
        this.E.addView(dVar2, w7.x5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f27742w0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27739u0 = z10;
        this.f27716c.m0 = z10;
        this.f27740v0 = s0();
        this.f27744x0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            this.f27727k0 = n10.a(8, R.drawable.msg_add);
        }
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 4);
        this.f27728l0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i19 = org.telegram.ui.ActionBar.j6.Oi;
        searchField.setTextColor(getThemedColor(i19));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
        searchField.setCursorColor(getThemedColor(i19));
        if (z10) {
            v7Var.o1();
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, f6Var));
            this.f27716c.setAlpha(1.0f);
            this.f27714b.setAlpha(0.0f);
            this.R0.set(this.f27716c, Float.valueOf(0.0f));
        }
        if (this.f27744x0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j8Var.h = z11;
        if (z11) {
            v7Var.setVisibility(0);
            v7Var.setTranslationY(0.0f);
        } else {
            v7Var.setVisibility(8);
            v7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        j8Var.l();
        this.f27716c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f27742w0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f27716c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f27716c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f27742w0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(MessagesController.getInstance(this.currentAccount), dialogId);
                if (m10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(m10.user_id))) != null) {
                    this.f27716c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f27716c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f27716c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f27716c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f27716c.setTitle(chat.title);
                }
            }
        }
        if (s0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.y yVar = new s4.y(new w7(this));
            this.H = yVar;
            yVar.d(v7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        q7 q7Var3 = this.E;
        int i20 = 52;
        if (!s0() && !this.f27747z0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(q7Var3, w7.x5.e(-1, i10 + 179, 83));
        this.containerView.addView(this.f27719e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
        if (!s0() && !this.f27747z0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        ((FrameLayout.LayoutParams) this.f27719e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.f27747z0) ? 0 : 0));
        this.containerView.addView(this.d, w7.x5.c(3.0f, -1));
        this.containerView.addView(this.f27716c);
        q7 q7Var4 = new q7(this, activity, 1);
        this.f27725i0 = q7Var4;
        q7Var4.setAlpha(0.0f);
        q7Var4.setVisibility(4);
        getContainer().addView(q7Var4);
        x9 x9Var = new x9(activity);
        this.f27726j0 = x9Var;
        x9Var.setAspectFit(true);
        x9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        x9Var.setScaleX(0.9f);
        x9Var.setScaleY(0.9f);
        q7Var4.addView(x9Var, w7.x5.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        if (this.h && j8Var.h() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        E0();
    }

    public static void A(k8 k8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(k8Var.currentAccount).getSavedMusicIds().update(j3, z10);
        long clientUserId = UserConfig.getInstance(k8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(k8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f19875id == j3) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(k8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(k8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void B(k8 k8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f19890id == i10) {
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
                k8Var.v0(new MessageObject(k8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new m7(k8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 2));
        }
    }

    public static void C(k8 k8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && k8Var.G0 != null) {
            k8Var.v0(playingMessageObject, false, new ah.j(25), false);
            k8Var.y0(false);
            org.telegram.messenger.w1.o(R.string.AudioSaveToMyProfileUnsaved, new yc((FrameLayout) k8Var.containerView, f6Var), R.raw.ic_delete, 36);
        }
    }

    public static void D(k8 k8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && k8Var.G0 != null) {
            k8Var.v0(playingMessageObject, true, new ah.j(25), false);
            k8Var.y0(true);
            org.telegram.messenger.w1.o(R.string.AudioSaveToMyProfileSaved, new yc((FrameLayout) k8Var.containerView, f6Var), R.raw.saved_messages, 36);
        }
    }

    public static void F(k8 k8Var, float[] fArr) {
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
        if (currentTimeMillis - k8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && k8Var.containerView != null) {
                org.telegram.ui.ij ijVar = new org.telegram.ui.ij(5, 1, k8Var.getContext(), null, false);
                k8Var.O0 = ijVar;
                ijVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                k8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                k8Var.E.addView(k8Var.O0, w7.x5.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                k8Var.O0.f(k8Var.V, true);
            }
        }
        k8Var.P0 = currentTimeMillis;
    }

    public static void G(k8 k8Var) {
        new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void H(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static void I(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static void J(k8 k8Var, View view) {
        u7 u7Var = k8Var.Q;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        n70 G = n70.G(k8Var.container, k8Var.resourcesProvider, view, true);
        n70 p02 = k8Var.p0(G, playingMessageObject);
        if (!k8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new fi.m2(G, p02, 7), !k8Var.f27747z0);
            if (!k8Var.f27747z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new h7(k8Var, G, 0), !k8Var.f27747z0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new h7(k8Var, G, 1), !k8Var.f27747z0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new h7(k8Var, G, 2), z10);
        if (k8Var.R) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, G.f28635e, G.d, false, false);
            G.d(f1Var);
            k8Var.P = f1Var;
            f1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            k8Var.P.setOnClickListener(new org.telegram.ui.rf(17, k8Var, G));
            AndroidUtilities.removeFromParent(u7Var);
            k8Var.P.addView(u7Var, 0, w7.x5.c(-1.0f, -1));
            k8Var.D0();
        }
        G.m(k8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new h7(k8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void K(k8 k8Var, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            b2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(k8Var.currentAccount).getInputPeer(UserConfig.getInstance(k8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.ro(4, k8Var, b2Var));
    }

    public static void L(k8 k8Var, MessageObject messageObject, n70 n70Var) {
        ArrayList<MessageObject> l4;
        String formatString;
        int i10;
        long clientUserId = UserConfig.getInstance(k8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = k8Var.currentAccount;
        if (i11 != i12) {
            k8Var.G0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                l4 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            n70Var.u();
            org.telegram.messenger.w1.o(R.string.AudioSaveToSavedMessagesSaved, new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        l4 = org.telegram.messenger.w1.l(messageObject);
        if (l4 != null) {
            SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(l4, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(k8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, k8Var.f27742w0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null) {
            yc a02 = yc.a0(R);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(k8Var.currentAccount).getClientUserId()) {
                formatString = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                formatString = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId));
            } else {
                formatString = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i10 = 36;
            a02.Q(i13, 36, formatString).j();
            n70Var.u();
            org.telegram.messenger.w1.o(R.string.AudioSaveToSavedMessagesSaved, new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        n70Var.u();
        org.telegram.messenger.w1.o(R.string.AudioSaveToSavedMessagesSaved, new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(k8 k8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f7;
        float f10;
        float f11;
        View view = k8Var.d;
        z7 z7Var = k8Var.f27716c;
        v7 v7Var = k8Var.f27729n;
        if (v7Var.getChildCount() <= 0) {
            int paddingTop = v7Var.getPaddingTop();
            k8Var.A0 = paddingTop;
            v7Var.setTopGlowOffset(paddingTop);
            k8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = v7Var.getChildAt(0);
        vk0 vk0Var = (vk0) v7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.x) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int dp = AndroidUtilities.dp(7.0f);
        if (bottom < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            bottom = dp;
        }
        if (bottom <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 1.0f;
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            z7Var.setTag(num);
            AnimatorSet animatorSet = k8Var.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
                k8Var.C0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            k8Var.C0 = animatorSet2;
            float f13 = 0.0f;
            if (k8Var.f27739u0) {
                org.telegram.ui.Cells.c2 c2Var = k8Var.R0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, c2Var, f10);
                View view2 = k8Var.f27714b;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z7Var, property2, f7);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f13));
            }
            k8Var.C0.setDuration(320L);
            k8Var.C0.setInterpolator(pr.h);
            k8Var.C0.addListener(new x7(k8Var, 2));
            k8Var.C0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v7Var.getLayoutParams();
        int D = org.telegram.messenger.vl.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (k8Var.A0 != D) {
            k8Var.A0 = D;
            v7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            k8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (k8Var.backgroundPaddingTop + ((int) (v7Var.getTranslationY() + ((k8Var.A0 - k8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - k8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        if (f12 <= 0.5f && i0.a.f(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != k8Var.M0) {
            k8Var.M0 = z11;
            AndroidUtilities.setLightStatusBar(k8Var, z11);
        }
    }

    public static int h0(k8 k8Var) {
        return k8Var.currentAccount;
    }

    public static void m(k8 k8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = k8Var.f27742w0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (k8Var.f27742w0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                k8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(k8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, k8Var.f27742w0);
        }
    }

    public static void n(k8 k8Var) {
        new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void o(k8 k8Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        b2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f19897id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f19881id = document.f19875id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = k8Var.f27742w0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            k8Var.f27744x0.clear();
            k8Var.f27744x0.addAll(k8Var.f27742w0.list);
            k8Var.f27736s.l();
            ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void p(k8 k8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = k8Var.G0;
        int i10 = UserConfig.selectedAccount;
        int i11 = k8Var.currentAccount;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(k8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(k8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.co(bundle), false, false);
        k8Var.dismiss();
    }

    public static void q(k8 k8Var, n70 n70Var) {
        k8Var.y0(true);
        new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        n70Var.u();
    }

    public static void r(k8 k8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f19890id == i10) {
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
                k8Var.v0(new MessageObject(k8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new m7(k8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 3));
        }
    }

    public static ImageLocation r0(MessageObject messageObject) {
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

    public static void s(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static void t(k8 k8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.uy uyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String formatPluralStringComma;
        long j3;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(k8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j10 = topicKey.dialogId;
            Bundle i12 = a4.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else if (DialogObject.isUserDialog(j10)) {
                i12.putLong("user_id", j10);
            } else {
                i12.putLong("chat_id", -j10);
            }
            org.telegram.ui.co coVar = new org.telegram.ui.co(i12);
            if (topicKey.topicId != 0) {
                og.d.a(coVar, topicKey);
            }
            if (k8Var.G0.q0(coVar, true, false)) {
                coVar.Ab(arrayList3);
                if (topicKey.topicId != 0) {
                    uyVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            uyVar.finishFragment();
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(arrayList3, j3, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(k8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j3, null, null, null, null, null, null, z10, i10, 0, 0, k8Var.f27742w0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        uyVar.finishFragment();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null) {
            yc a02 = yc.a0(R);
            int i14 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(k8Var.currentAccount).getClientUserId()) {
                formatPluralStringComma = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId > 0) {
                formatPluralStringComma = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId < 0) {
                formatPluralStringComma = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size());
            }
            a02.Q(i14, 36, formatPluralStringComma).j();
        }
    }

    public static void u(k8 k8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && k8Var.f27742w0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f19875id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f19897id = tL_inputDocument;
                tL_inputDocument.f19881id = document.f19875id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = k8Var.f27742w0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                k8Var.f27744x0.clear();
                k8Var.f27744x0.addAll(k8Var.f27742w0.list);
                k8Var.f27736s.l();
                ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k8Var.getContext(), 3, null);
            b2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(k8Var.currentAccount).uploadFile(file.getAbsolutePath(), new bi.o4(k8Var, b2Var, document, 3));
            }
        }
    }

    public static void v(k8 k8Var, MessageObject messageObject, n70 n70Var) {
        k8Var.f27742w0.remove(messageObject);
        k8Var.f27744x0.remove(messageObject);
        k8Var.f27736s.l();
        n70Var.u();
        k8Var.y0(false);
        org.telegram.messenger.w1.o(R.string.AudioSaveToMyProfileUnsaved, new yc((FrameLayout) k8Var.containerView, k8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(k8 k8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.p6.q((FrameLayout) k8Var.containerView, k8Var.resourcesProvider, tL_error, false);
    }

    public static void x(k8 k8Var) {
        org.telegram.ui.ActionBar.f6 f6Var = k8Var.resourcesProvider;
        new yc((FrameLayout) k8Var.containerView, f6Var).o(xc.F, f6Var).j();
    }

    public static void y(k8 k8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j3, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f19963id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(k8Var) {
                        public final k8 f27709b;

                        {
                            this.f27709b = k8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    k8.r(this.f27709b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    k8.B(this.f27709b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(k8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f19907id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(k8Var) {
                    public final k8 f27709b;

                    {
                        this.f27709b = k8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                k8.r(this.f27709b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                k8.B(this.f27709b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j7(k8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new q2(k8Var, j3, z11, document, runnable));
    }

    public final void A0(boolean z10, boolean z11) {
        x9 x9Var = this.f27726j0;
        q7 q7Var = this.f27725i0;
        if (z10) {
            if (q7Var.getVisibility() != 0 && !this.m0) {
                q7Var.setTag(1);
                a8 a8Var = this.I;
                x9Var.setImageBitmap(a8Var.f25952a[a8Var.f25953b].getImageReceiver().getBitmap());
                this.m0 = true;
                am0.d(new b7(this, 1));
                q7Var.setVisibility(0);
                q7Var.animate().alpha(1.0f).setDuration(180L).setListener(new x7(this, 0)).start();
                x9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (q7Var.getVisibility() != 0) {
        } else {
            q7Var.setTag(null);
            if (z11) {
                this.m0 = true;
                q7Var.animate().alpha(0.0f).setDuration(180L).setListener(new x7(this, 1)).start();
                x9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            q7Var.setAlpha(0.0f);
            q7Var.setVisibility(4);
            x9Var.setImageBitmap(null);
            x9Var.setScaleX(0.9f);
            x9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        int i10;
        boolean z10 = true;
        n70 G = n70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new g7(this, G, messageObject, 0), !this.f27747z0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new g7(this, G, messageObject, 1), !this.f27747z0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new g7(this, messageObject, G, 2), true);
        } else {
            n70 p02 = p0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new fi.m2(G, p02, 6), !this.f27747z0);
            if (!this.f27747z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new g7(this, G, messageObject, 3), !this.f27747z0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new g7(this, G, messageObject, 4), !this.f27747z0);
            if (messageObject.getId() <= 0) {
                z10 = false;
            }
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new d7(this, messageObject, 1), z10);
        }
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        G.V(i10);
        G.Z();
    }

    public final void C0() {
        if (this.H0 == 1) {
            this.K0 = System.currentTimeMillis();
            this.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.l7 l7Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var);
        }
    }

    public final void D0() {
        boolean z10;
        float f7;
        int themedColor;
        int i10;
        float f10 = 1.0f;
        org.telegram.ui.ActionBar.v0 v0Var = this.V;
        if (v0Var != null) {
            if (Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f) {
                i10 = org.telegram.ui.ActionBar.j6.f21026x7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Qh;
            }
            int themedColor2 = getThemedColor(i10);
            fd fdVar = this.W;
            if (fdVar != null) {
                ((p6) fdVar.f26016c).r(themedColor2);
                Paint paint = (Paint) fdVar.f26015b;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.f1 f1Var = this.P;
        if (f1Var != null) {
            u7 u7Var = this.Q;
            if (u7Var != null && u7Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.E8);
            final int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.j6.F8);
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            final int themedColor5 = getThemedColor(i11);
            ValueAnimator valueAnimator = f1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (f1Var.J) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            f1Var.I = ofFloat;
            f1Var.J = z10;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    f1 f1Var2 = f1.this;
                    f1Var2.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i12 = themedColor3;
                    int i13 = themedColor5;
                    f1Var2.setTextColor(i0.a.d(floatValue, i12, i13));
                    f1Var2.setIconColor(i0.a.d(floatValue, themedColor4, i13));
                }
            });
            f1Var.I.addListener(new org.telegram.ui.ActionBar.e1(f1Var, z10, themedColor3, themedColor5, themedColor4));
            f1Var.I.setInterpolator(pr.h);
            f1Var.I.start();
            org.telegram.ui.ActionBar.f1 f1Var2 = this.P;
            if (u7Var != null && u7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6);
            }
            f1Var2.setSelectorColor(themedColor);
        }
    }

    public final void E0() {
        int i10;
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.E.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(150.0f);
        } else {
            i10 = -AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - i10) / 2);
    }

    public final void F0(boolean z10) {
        if (this.V != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            this.W.l(playbackSpeed, z10);
            this.X.d(playbackSpeed, z10);
            D0();
            boolean z11 = this.Y;
            int i10 = 0;
            this.Y = false;
            while (true) {
                org.telegram.ui.ActionBar.f1[] f1VarArr = this.Z;
                if (i10 < f1VarArr.length) {
                    if (!z11 && Math.abs(playbackSpeed - U0[i10]) < 0.05f) {
                        org.telegram.ui.ActionBar.f1 f1Var = f1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.j6.Qh;
                        f1Var.c(getThemedColor(i11), getThemedColor(i11));
                    } else {
                        org.telegram.ui.ActionBar.f1 f1Var2 = f1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.j6.E8;
                        f1Var2.c(getThemedColor(i12), getThemedColor(i12));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void G0(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k8.G0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.v0 v0Var = this.f27715b0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                v0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.j6.Xi;
                v0Var.setTag(Integer.valueOf(i11));
                v0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.j6.B1(v0Var.getBackground(), getThemedColor(i11) & 436207615, true);
                v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i10 == 0) {
                v0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                v0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (SharedConfig.playOrderReversed) {
            if (i10 == 0) {
                v0Var.setIcon(R.drawable.player_new_order);
            } else {
                v0Var.setIcon(R.drawable.player_new_repeat_reverse);
            }
        } else {
            v0Var.setIcon(R.drawable.player_new_repeatall);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.j6.Wi;
            v0Var.setTag(Integer.valueOf(i12));
            v0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.j6.B1(v0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6), true);
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.j6.Xi;
        v0Var.setTag(Integer.valueOf(i13));
        v0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.j6.B1(v0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 == 0) {
            if (SharedConfig.shuffleMusic) {
                v0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
                return;
            } else {
                v0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
                return;
            }
        }
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
    }

    public final void I0() {
        boolean z10;
        x0(this.f27720e0, SharedConfig.shuffleMusic);
        x0(this.f27722f0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        x0(this.f27718d0, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        x0(this.f27717c0, z11);
    }

    public final void J0(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k8.J0(boolean):void");
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.x xVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.x xVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i12 = NotificationCenter.messagePlayingDidStart;
        v7 v7Var = this.f27729n;
        int i13 = 0;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject2 != null && playingMessageObject2.isMusic()) {
                    G0(playingMessageObject2, false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
                F0(true);
                return;
            } else {
                int i14 = NotificationCenter.musicDidLoad;
                j8 j8Var = this.f27736s;
                if (i10 == i14) {
                    this.f27742w0 = MediaController.getInstance().currentSavedMusicList;
                    this.f27744x0 = MediaController.getInstance().getPlaylist();
                    j8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f27742w0 = MediaController.getInstance().currentSavedMusicList;
                    this.f27744x0 = MediaController.getInstance().getPlaylist();
                    j8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        v7Var.B0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        s4.c0 c0Var = this.f27734r;
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
                    if (((String) objArr[0]).equals(this.B0)) {
                        J0(false);
                        this.f27733q0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.B0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        float f7 = 1.0f;
                        if (!this.f27733q0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f27732p0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f7 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.B0);
                                }
                                this.f27732p0 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        if (f7 != -1.0f) {
                            o1.k kVar = this.f27731o0;
                            kVar.f16825u.f16832i = f7 * 1000.0f;
                            kVar.f();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.musicIdsLoaded) {
                    J0(false);
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
        J0(z10);
        if (i10 != i15 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (((MessageObject) objArr[0]).eventId == 0) {
                int childCount = v7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = v7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = v7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = v7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    xVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    C0();
                } else if (this.H0 == 1 && this.I0 != -1.0f) {
                    org.telegram.ui.Cells.l7 l7Var = this.N0;
                    AndroidUtilities.cancelRunOnUIThread(l7Var);
                    this.L0 = 0L;
                    l7Var.run();
                    this.I0 = -1.0f;
                }
            }
        }
        org.telegram.ui.zr zrVar = this.O;
        if (zrVar != null) {
            zrVar.a(b5.d.u());
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
        if (T0 == this) {
            T0 = null;
        }
    }

    @Override
    public final int getContainerViewHeight() {
        q7 q7Var = this.E;
        if (q7Var == null) {
            return 0;
        }
        if (this.f27744x0.size() <= 1) {
            return q7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f27729n.getTranslationY() + ((this.A0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override
    public final int getObserverTag() {
        return this.F0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z6 z6Var = new z6(this, 0);
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27716c, 64, null, null, null, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27716c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27716c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27716c, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27716c, 134217728, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27716c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20761ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20779je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20978uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20995vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21061z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20778jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20760id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.j6.f20734h5));
        int i12 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.f21009w7;
        org.telegram.ui.ActionBar.v0 v0Var = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.j6.f21026x7));
        int i15 = org.telegram.ui.ActionBar.j6.Wi;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f27715b0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, z6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.Xi));
        int i16 = org.telegram.ui.ActionBar.j6.f20753i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, z6Var, i16));
        int i17 = org.telegram.ui.ActionBar.j6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, z6Var, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, z6Var, i18));
        org.telegram.ui.ActionBar.v0 v0Var3 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, z6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, z6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, z6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, z6Var, i18));
        s7 s7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.l6(s7Var, (Class[]) null, new xi0[]{s7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(s7Var, (Class[]) null, new xi0[]{s7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(s7Var, (Class[]) null, new xi0[]{s7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 131080, null, null, null, null, i16));
        ImageView imageView = this.f27723g0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 131080, null, null, null, null, i16));
        t7 t7Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.l6(t7Var, (Class[]) null, new xi0[]{t7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t7Var, (Class[]) null, new xi0[]{t7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t7Var, (Class[]) null, new xi0[]{t7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27719e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27741w, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.W5));
        int i19 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27743x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27745y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27729n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20646c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f20735h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27713a0, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, null, null, null, null, i11));
        b8 b8Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.l6(b8Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(b8Var.getNextTextView(), 4, null, null, null, null, i10));
        b8 b8Var2 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(b8Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(b8Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
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
        z7 z7Var = this.f27716c;
        if (z7Var != null && z7Var.f21103n0) {
            z7Var.h(true);
        } else if (this.f27725i0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        q7 q7Var = this.f27725i0;
        if (view != q7Var) {
            return false;
        }
        q7Var.layout(0, 0, q7Var.getMeasuredWidth(), q7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        q7 q7Var = this.f27725i0;
        if (view == q7Var) {
            q7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.S.a(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
    }

    public final n70 p0(n70 n70Var, MessageObject messageObject) {
        long j3;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j3 = document.f19875id;
        } else {
            j3 = 0;
        }
        n70 J = n70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lu0(n70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new g7(this, messageObject, n70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new g7(this, messageObject, n70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new g7(this, messageObject, n70Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList l4;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.G0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
        e7.putBoolean("canSelectTopics", true);
        org.telegram.ui.uy uyVar = new org.telegram.ui.uy(e7);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            l4 = null;
        } else {
            l4 = org.telegram.messenger.w1.l(messageObject);
            tL_document = null;
        }
        uyVar.C2 = new a1.d(this, l4, tL_document, messageObject, 6);
        launchActivity.p0(uyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.f27742w0;
        if (savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        T0 = this;
    }

    public final void t0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && (launchActivity = this.G0) != null) {
            if (i10 == 1) {
                q0(playingMessageObject);
            } else if (i10 == 2) {
                z0(playingMessageObject);
            } else if (i10 == 4) {
                int i11 = UserConfig.selectedAccount;
                int i12 = this.currentAccount;
                if (i11 != i12) {
                    launchActivity.K0(i12);
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
                launchActivity.q0(new org.telegram.ui.co(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                u0(playingMessageObject);
            } else if (i10 == 6) {
                pf.b.W().g0(MediaController.getInstance().getCurrentChromecastMedia());
                this.Q.performClick();
            } else if (i10 == 7) {
                v0(playingMessageObject, false, new d7(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                di.g8 g8Var = new di.g8(getContext(), true, null, new f7(this, 0), null);
                g8Var.f7279h0 = true;
                g8Var.Z = false;
                g8Var.f7287q0.N(true);
                g8Var.show();
            }
        }
    }

    public final void u0(MessageObject messageObject) {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
            LaunchActivity launchActivity = this.G0;
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
        if (str3 != null && str3.length() > 0 && !w.f.o(str3)) {
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
        MediaController.saveFile(str4, this.G0, 3, str2, str5, new f7(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j3 = document.f19875id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f19897id = tL_inputDocument;
        tL_inputDocument.f19881id = j3;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new i7(this, z11, messageObject, z10, runnable, j3, document));
    }

    public final boolean w0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k8.w0(boolean):boolean");
    }

    public final void x0(org.telegram.ui.ActionBar.f1 f1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.Xi;
            f1Var.setTextColor(getThemedColor(i10));
            f1Var.setIconColor(getThemedColor(i10));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        f1Var.setTextColor(getThemedColor(i11));
        f1Var.setIconColor(getThemedColor(i11));
    }

    public final void y0(final boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean s02 = s0();
        di.d dVar = this.G;
        di.d dVar2 = this.F;
        if (!s02 && !this.f27747z0) {
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
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final k8 f25575b;

                {
                    this.f25575b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            di.d dVar3 = this.f25575b.F;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            di.d dVar4 = this.f25575b.G;
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
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final k8 f25575b;

                {
                    this.f25575b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            di.d dVar3 = this.f25575b.F;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            di.d dVar4 = this.f25575b.G;
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

    public final void z0(org.telegram.messenger.MessageObject r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k8.z0(org.telegram.messenger.MessageObject):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
