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
public final class l8 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static l8 T0;
    public static final float[] U0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public String B0;
    public AnimatorSet C0;
    public int D0;
    public final r7 E;
    public int E0;
    public final ci.d F;
    public final int F0;
    public final ci.d G;
    public final LaunchActivity G0;
    public final s4.z H;
    public int H0;
    public final b8 I;
    public float I0;
    public final c8 J;
    public int J0;
    public final t7 K;
    public long K0;
    public final u7 L;
    public long L0;
    public final c8 M;
    public boolean M0;
    public final org.telegram.ui.ActionBar.u0 N;
    public final org.telegram.ui.Cells.t6 N0;
    public final org.telegram.ui.wr O;
    public org.telegram.ui.jj O0;
    public org.telegram.ui.ActionBar.e1 P;
    public long P0;
    public final v7 Q;
    public float Q0;
    public final boolean R;
    public final org.telegram.ui.Cells.d2 R0;
    public final o90 S;
    public ValueAnimator S0;
    public final d8 T;
    public final org.telegram.ui.ActionBar.h5 U;
    public final org.telegram.ui.ActionBar.u0 V;
    public final hd W;
    public final org.telegram.ui.ActionBar.a1 X;
    public boolean Y;
    public final org.telegram.ui.ActionBar.e1[] Z;
    public final TextView f28228a0;
    public final View f28229b;
    public final org.telegram.ui.ActionBar.u0 f28230b0;
    public final a8 f28231c;
    public final org.telegram.ui.ActionBar.e1 f28232c0;
    public final View d;
    public final org.telegram.ui.ActionBar.e1 f28233d0;
    public final View f28234e;
    public final org.telegram.ui.ActionBar.e1 f28235e0;
    public boolean f28236f;
    public final org.telegram.ui.ActionBar.e1 f28237f0;
    public final ImageView f28238g0;
    public boolean h;
    public final ih0 f28239h0;
    public final r7 f28240i0;
    public final y9 f28241j0;
    public final org.telegram.ui.ActionBar.u0 f28242k0;
    public final org.telegram.ui.ActionBar.u0 f28243l0;
    public boolean m0;
    public final w7 f28244n;
    public final View[] f28245n0;
    public final o1.k f28246o0;
    public long f28247p0;
    public boolean f28248q0;
    public final s4.d0 f28249r;
    public boolean f28250r0;
    public final k8 f28251s;
    public int f28252s0;
    public int f28253t0;
    public final boolean f28254u0;
    public final LinearLayout v;
    public final boolean f28255v0;
    public final ImageView f28256w;
    public MessagesController.SavedMusicList f28257w0;
    public final TextView f28258x;
    public ArrayList f28259x0;
    public final TextView f28260y;
    public MessageObject f28261y0;
    public boolean f28262z0;

    public l8(Activity activity, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, (Context) activity, d6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.y yVar;
        boolean z11;
        TLRPC.User user;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[6];
        this.Z = e1VarArr;
        View[] viewArr = new View[5];
        this.f28245n0 = viewArr;
        this.f28250r0 = true;
        this.f28252s0 = -1;
        this.A0 = Integer.MAX_VALUE;
        this.I0 = -1.0f;
        this.N0 = new org.telegram.ui.Cells.t6(this, 4);
        this.R0 = new org.telegram.ui.Cells.d2(this);
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
        z7 z7Var = new z7(this, activity);
        this.containerView = z7Var;
        z7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        a8 a8Var = new a8(this, activity, d6Var, 0);
        this.f28231c = a8Var;
        a8Var.setBackgroundColor(0);
        a8Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i15 = org.telegram.ui.ActionBar.h6.Oi;
        a8Var.D(getThemedColor(i15), false);
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.h6.Ni), false);
        a8Var.setTitleColor(getThemedColor(i15));
        a8Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.h6.Pi));
        a8Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y o9 = a8Var.o();
        o9.setLayoutParams(w7.x5.e(-1, -1, 119));
        View view = new View(activity);
        this.f28229b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5));
        a8Var.addView(view, 0, w7.x5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        a8Var.setAlpha(0.0f);
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 6));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.f28234e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.V5));
        r7 r7Var = new r7(this, activity, 2);
        this.E = r7Var;
        b8 b8Var = new b8(this, activity);
        this.I = b8Var;
        r7Var.addView(b8Var, w7.x5.a(44.0f, 0.0f, 20.0f, 20.0f, 0.0f, 44, 53));
        c8 c8Var = new c8(this, activity, activity, 0);
        this.J = c8Var;
        r7Var.addView(c8Var, w7.x5.a(-2.0f, 20.0f, 20.0f, 20.0f, 0.0f, -1, 51));
        c8 c8Var2 = new c8(this, activity, activity, 1);
        this.M = c8Var2;
        r7Var.addView(c8Var2, w7.x5.a(-2.0f, 14.0f, 47.0f, 20.0f, 0.0f, -1, 51));
        d8 d8Var = new d8(this, activity, d6Var);
        this.T = d8Var;
        d8Var.setLineWidth(4);
        d8Var.setDelegate(new q7(this));
        d8Var.setReportChanges(true);
        r7Var.addView(d8Var, w7.x5.a(44.0f, 5.0f, 67.0f, 5.0f, 0.0f, -1, 51));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.f17024u = lVar;
        kVar.b(new m7(this, 0));
        this.f28246o0 = kVar;
        o90 o90Var = new o90(activity);
        this.S = o90Var;
        o90Var.setVisibility(4);
        o90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
        o90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
        r7Var.addView(o90Var, w7.x5.a(2.0f, 21.0f, 90.0f, 21.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.U = h5Var;
        h5Var.setTextSize(12);
        h5Var.l("0:00", false);
        int i16 = org.telegram.ui.ActionBar.h6.Si;
        h5Var.setTextColor(getThemedColor(i16));
        h5Var.setImportantForAccessibility(2);
        r7Var.addView(h5Var, w7.x5.a(-2.0f, 20.0f, 98.0f, 0.0f, 0.0f, 100, 51));
        TextView textView = new TextView(activity);
        this.f28228a0 = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i16));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        r7Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 96.0f, 20.0f, 0.0f, -2, 53));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(activity, null, 0, getThemedColor(i16), false, d6Var);
        this.V = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setShowSubmenuByMove(false);
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        u0Var.setDelegate(new b7(this, 0));
        hd hdVar = new hd();
        this.W = hdVar;
        u0Var.setIcon(hdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(getContext(), d6Var);
        this.X = a1Var;
        a1Var.setRoundRadiusDp(6.0f);
        a1Var.setDrawShadow(true);
        a1Var.setOnValueChange(new c7(this, 0));
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
        r7Var.addView(u0Var, w7.x5.a(36.0f, 0.0f, 86.0f, 20.0f, 0.0f, 36, 53));
        u0Var.setOnClickListener(new org.telegram.ui.rf(16, this, fArr));
        u0Var.setOnLongClickListener(new ai.r3(2, this, d6Var));
        F0(false);
        r7 r7Var2 = new r7(this, activity, 0);
        r7Var.addView(r7Var2, w7.x5.a(66.0f, 0.0f, 111.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(activity, null, 0, 0, false, d6Var);
        this.f28230b0 = u0Var2;
        viewArr[0] = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setShowSubmenuByMove(false);
        u0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i17 = org.telegram.ui.ActionBar.h6.f20913i6;
        u0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(18.0f)));
        r7Var2.addView(u0Var2, w7.x5.e(48, 48, 51));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        l8 l8Var = this.f25640b;
                        l8Var.I0();
                        l8Var.f28230b0.M(null, null);
                        return;
                    default:
                        l8.K(this.f25640b, view4);
                        return;
                }
            }
        });
        this.f28232c0 = u0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.f28233d0 = u0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        u0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f28235e0 = u0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        u0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f28237f0 = u0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        u0Var2.setShowedFromBottom(true);
        u0Var2.setDelegate(new b7(this, 1));
        int i18 = org.telegram.ui.ActionBar.h6.Wi;
        int themedColor = getThemedColor(i18);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        t7 t7Var = new t7(this, activity, scaledTouchSlop);
        this.K = t7Var;
        viewArr[1] = t7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        t7Var.setScaleType(scaleType);
        t7Var.f(R.raw.player_prev, 20, 20, null);
        t7Var.h(themedColor, "Triangle 3");
        t7Var.h(themedColor, "Triangle 4");
        t7Var.h(themedColor, "Rectangle 4");
        t7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(22.0f)));
        r7Var2.addView(t7Var, w7.x5.e(48, 48, 51));
        t7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f28238g0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        ih0 ih0Var = new ih0(28);
        this.f28239h0 = ih0Var;
        imageView.setImageDrawable(ih0Var);
        ih0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(24.0f)));
        r7Var2.addView(imageView, w7.x5.e(48, 48, 51));
        imageView.setOnClickListener(new ai.e2(8));
        u7 u7Var = new u7(this, activity, scaledTouchSlop);
        this.L = u7Var;
        viewArr[3] = u7Var;
        u7Var.setScaleType(scaleType);
        u7Var.f(R.raw.player_prev, 20, 20, null);
        u7Var.h(themedColor, "Triangle 3");
        u7Var.h(themedColor, "Triangle 4");
        u7Var.h(themedColor, "Rectangle 4");
        u7Var.setRotation(180.0f);
        u7Var.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(22.0f)));
        r7Var2.addView(u7Var, w7.x5.e(48, 48, 51));
        u7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(activity, null, 0, themedColor, false, d6Var);
        this.N = u0Var3;
        viewArr[4] = u0Var3;
        org.telegram.ui.wr wrVar = new org.telegram.ui.wr(activity, R.drawable.ic_ab_other, d6Var);
        this.O = wrVar;
        u0Var3.setIcon(wrVar);
        u0Var3.setLongClickEnabled(false);
        u0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(18.0f)));
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f25640b;

            {
                this.f25640b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        l8 l8Var = this.f25640b;
                        l8Var.I0();
                        l8Var.f28230b0.M(null, null);
                        return;
                    default:
                        l8.K(this.f25640b, view4);
                        return;
                }
            }
        });
        r7Var2.addView(u0Var3, w7.x5.e(48, 48, 51));
        v7 v7Var = new v7(this, activity, 0);
        this.Q = v7Var;
        this.R = true;
        try {
            v7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e7) {
            FileLog.e(e7);
            this.R = false;
        }
        this.Q.setVisibility(4);
        org.telegram.ui.wr wrVar2 = this.O;
        if (wrVar2 != null) {
            wrVar2.a(b5.d.u());
        }
        this.N.setShowedFromBottom(true);
        this.N.setDelegate(new b7(this, 2));
        this.N.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.x5.d(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.f28256w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f28258x = textView2;
        int i19 = org.telegram.ui.ActionBar.h6.X5;
        textView2.setTextColor(getThemedColor(i19));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f28260y = textView3;
        textView3.setTextColor(getThemedColor(i19));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        w7 w7Var = new w7(this, activity);
        this.f28244n = w7Var;
        w7Var.setClipToPadding(false);
        getContext();
        s4.d0 d0Var = new s4.d0(1, false);
        this.f28249r = d0Var;
        w7Var.setLayoutManager(d0Var);
        w7Var.setHorizontalScrollBarEnabled(false);
        w7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w7Var, w7.x5.e(-1, -1, 51));
        k8 k8Var = new k8(this, activity);
        this.f28251s = k8Var;
        w7Var.setAdapter(k8Var);
        w7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        w7Var.setOnItemClickListener(new o7(0));
        w7Var.setOnItemLongClickListener(new b7(this, 3));
        w7Var.setOnScrollListener(new ai.r(this, 14));
        ci.d dVar = new ci.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.F = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new er(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f29743b;

            {
                this.f29743b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        l8.F(this.f29743b, d6Var);
                        return;
                    default:
                        l8.E(this.f29743b, d6Var);
                        return;
                }
            }
        });
        this.E.addView(dVar, w7.x5.a(42.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 87));
        ci.d dVar2 = new ci.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.G = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f29743b;

            {
                this.f29743b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        l8.F(this.f29743b, d6Var);
                        return;
                    default:
                        l8.E(this.f29743b, d6Var);
                        return;
                }
            }
        });
        this.E.addView(dVar2, w7.x5.a(42.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 87));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f28257w0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28254u0 = z10;
        this.f28231c.m0 = z10;
        this.f28255v0 = t0();
        this.f28259x0 = MediaController.getInstance().getPlaylist();
        if (t0()) {
            yVar = o9;
            this.f28242k0 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = o9;
        }
        org.telegram.ui.ActionBar.u0 a2 = yVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 4);
        this.f28243l0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i20 = org.telegram.ui.ActionBar.h6.Oi;
        searchField.setTextColor(getThemedColor(i20));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Si));
        searchField.setCursorColor(getThemedColor(i20));
        if (z10) {
            w7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, d6Var));
            this.f28231c.setAlpha(1.0f);
            this.f28229b.setAlpha(0.0f);
            org.telegram.ui.Cells.d2 d2Var = this.R0;
            a8 a8Var2 = this.f28231c;
            Float valueOf = Float.valueOf(0.0f);
            d2Var.getClass();
            d2Var.a(a8Var2, valueOf);
        }
        if (this.f28259x0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        k8Var.h = z11;
        if (z11) {
            w7Var.setVisibility(0);
            w7Var.setTranslationY(0.0f);
        } else {
            w7Var.setVisibility(8);
            w7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        k8Var.l();
        this.f28231c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f28257w0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f28231c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f28231c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f28257w0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(MessagesController.getInstance(this.currentAccount), dialogId);
                if (l4 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(l4.user_id))) != null) {
                    this.f28231c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f28231c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f28231c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f28231c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f28231c.setTitle(chat.title);
                }
            }
        }
        if (t0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.z zVar = new s4.z(new x7(this));
            this.H = zVar;
            zVar.e(w7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        r7 r7Var3 = this.E;
        if (!t0() && !this.f28262z0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(r7Var3, w7.x5.e(-1, i10 + 179, 83));
        this.containerView.addView(this.f28234e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
        if (!t0() && !this.f28262z0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f28234e.getLayoutParams();
        if (!t0() && !this.f28262z0) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        layoutParams2.bottomMargin = AndroidUtilities.dp(179 + i12);
        this.containerView.addView(this.d, w7.x5.d(3.0f, -1));
        this.containerView.addView(this.f28231c);
        r7 r7Var4 = new r7(this, activity, 1);
        this.f28240i0 = r7Var4;
        r7Var4.setAlpha(0.0f);
        r7Var4.setVisibility(4);
        getContainer().addView(r7Var4);
        y9 y9Var = new y9(activity);
        this.f28241j0 = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        y9Var.setScaleX(0.9f);
        y9Var.setScaleY(0.9f);
        r7Var4.addView(y9Var, w7.x5.a(-1.0f, 30.0f, 30.0f, 30.0f, 30.0f, -1, 51));
        J0(false);
        H0();
        if (this.h && k8Var.h() == 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        linearLayout.setVisibility(i13);
        E0();
    }

    public static void B(l8 l8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j3, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f20162id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(l8Var) {
                        public final l8 f28220b;

                        {
                            this.f28220b = l8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    l8.t(this.f28220b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    l8.D(this.f28220b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(l8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f20106id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(l8Var) {
                    public final l8 f28220b;

                    {
                        this.f28220b = l8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                l8.t(this.f28220b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                l8.D(this.f28220b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new r2(l8Var, j3, z11, document, runnable));
    }

    public static void C(l8 l8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(l8Var.currentAccount).getSavedMusicIds().update(j3, z10);
        long clientUserId = UserConfig.getInstance(l8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(l8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f20074id == j3) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(l8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(l8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void D(l8 l8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f20089id == i10) {
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
                l8Var.w0(new MessageObject(l8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new n7(l8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 2));
        }
    }

    public static void E(l8 l8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && l8Var.G0 != null) {
            l8Var.w0(playingMessageObject, false, new ai.f(24), false);
            l8Var.z0(false);
            org.telegram.messenger.q.q(R.string.AudioSaveToMyProfileUnsaved, new ad((FrameLayout) l8Var.containerView, d6Var), R.raw.ic_delete, 36);
        }
    }

    public static void F(l8 l8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && l8Var.G0 != null) {
            l8Var.w0(playingMessageObject, true, new ai.f(24), false);
            l8Var.z0(true);
            org.telegram.messenger.q.q(R.string.AudioSaveToMyProfileSaved, new ad((FrameLayout) l8Var.containerView, d6Var), R.raw.saved_messages, 36);
        }
    }

    public static void G(l8 l8Var, float[] fArr) {
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
        if (currentTimeMillis - l8Var.P0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && l8Var.containerView != null) {
                org.telegram.ui.jj jjVar = new org.telegram.ui.jj(5, 1, l8Var.getContext(), null, false);
                l8Var.O0 = jjVar;
                jjVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                l8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                l8Var.E.addView(l8Var.O0, w7.x5.a(-2.0f, 0.0f, 0.0f, 6.0f, 0.0f, -2, 48));
                l8Var.O0.f(l8Var.V, true);
            }
        }
        l8Var.P0 = currentTimeMillis;
    }

    public static void H(l8 l8Var) {
        new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void I(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void J(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void K(l8 l8Var, View view) {
        v7 v7Var = l8Var.Q;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        p80 G = p80.G(l8Var.container, l8Var.resourcesProvider, view, true);
        p80 q02 = l8Var.q0(G, playingMessageObject);
        if (!l8Var.t0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, q02, 7), !l8Var.f28262z0);
            if (!l8Var.f28262z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new i7(l8Var, G, 0), !l8Var.f28262z0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new i7(l8Var, G, 1), !l8Var.f28262z0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new i7(l8Var, G, 2), z10);
        if (l8Var.R) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, G.f29754e, G.d, false, false);
            G.d(e1Var);
            l8Var.P = e1Var;
            e1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            l8Var.P.setOnClickListener(new org.telegram.ui.rf(17, l8Var, G));
            AndroidUtilities.removeFromParent(v7Var);
            l8Var.P.addView(v7Var, 0, w7.x5.d(-1.0f, -1));
            l8Var.e();
        }
        G.m(l8Var.t0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new i7(l8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void L(l8 l8Var, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            a2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(l8Var.currentAccount).getInputPeer(UserConfig.getInstance(l8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.oo(4, l8Var, a2Var));
    }

    public static void M(l8 l8Var, MessageObject messageObject, p80 p80Var) {
        ArrayList<MessageObject> k10;
        int i10;
        String formatString;
        long clientUserId = UserConfig.getInstance(l8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = l8Var.currentAccount;
        if (i11 != i12) {
            l8Var.G0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                i10 = 36;
                p80Var.u();
                org.telegram.messenger.q.q(R.string.AudioSaveToSavedMessagesSaved, new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider), R.raw.saved_messages, i10);
            }
            k10 = null;
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
        } else {
            k10 = org.telegram.messenger.q.k(messageObject);
        }
        if (k10 != null) {
            SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(k10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(l8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, l8Var.f28257w0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R != null) {
            ad a02 = ad.a0(R);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(l8Var.currentAccount).getClientUserId()) {
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
        p80Var.u();
        org.telegram.messenger.q.q(R.string.AudioSaveToSavedMessagesSaved, new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void Q(l8 l8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f7;
        float f10;
        float f11;
        View view = l8Var.d;
        a8 a8Var = l8Var.f28231c;
        w7 w7Var = l8Var.f28244n;
        if (w7Var.getChildCount() <= 0) {
            int paddingTop = w7Var.getPaddingTop();
            l8Var.A0 = paddingTop;
            w7Var.setTopGlowOffset(paddingTop);
            l8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = w7Var.getChildAt(0);
        bm0 bm0Var = (bm0) w7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.x) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int dp = AndroidUtilities.dp(7.0f);
        if (bottom < AndroidUtilities.dp(7.0f) || bm0Var == null || bm0Var.b() != 0) {
            bottom = dp;
        }
        if (bottom <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 1.0f;
        if ((z10 && a8Var.getTag() == null) || (!z10 && a8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            a8Var.setTag(num);
            AnimatorSet animatorSet = l8Var.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
                l8Var.C0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            l8Var.C0 = animatorSet2;
            float f13 = 0.0f;
            if (l8Var.f28254u0) {
                org.telegram.ui.Cells.d2 d2Var = l8Var.R0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a8Var, d2Var, f10);
                View view2 = l8Var.f28229b;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a8Var, property2, f7);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f13));
            }
            l8Var.C0.setDuration(320L);
            l8Var.C0.setInterpolator(is.h);
            l8Var.C0.addListener(new y7(l8Var, 2));
            l8Var.C0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w7Var.getLayoutParams();
        int D = org.telegram.messenger.ai.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (l8Var.A0 != D) {
            l8Var.A0 = D;
            w7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            l8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (l8Var.backgroundPaddingTop + ((int) (w7Var.getTranslationY() + ((l8Var.A0 - l8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - l8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        if (f12 <= 0.5f && i0.a.f(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != l8Var.M0) {
            l8Var.M0 = z11;
            AndroidUtilities.setLightStatusBar(l8Var, z11);
        }
    }

    public static int i0(l8 l8Var) {
        return l8Var.currentAccount;
    }

    public static int j0(l8 l8Var) {
        return l8Var.backgroundPaddingTop;
    }

    public static int k0(l8 l8Var) {
        return l8Var.backgroundPaddingTop;
    }

    public static void o(l8 l8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = l8Var.f28257w0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (l8Var.f28257w0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                l8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(l8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, l8Var.f28257w0);
        }
    }

    public static void p(l8 l8Var) {
        new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void q(l8 l8Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject) {
        a2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f20096id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f20080id = document.f20074id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = l8Var.f28257w0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            l8Var.f28259x0.clear();
            l8Var.f28259x0.addAll(l8Var.f28257w0.list);
            l8Var.f28251s.l();
            ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void r(l8 l8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = l8Var.G0;
        int i10 = UserConfig.selectedAccount;
        int i11 = l8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(l8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(l8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.zn(bundle), false, false);
        l8Var.dismiss();
    }

    public static void s(l8 l8Var, p80 p80Var) {
        l8Var.z0(true);
        new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        p80Var.u();
    }

    public static ImageLocation s0(MessageObject messageObject) {
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

    public static void t(l8 l8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f20089id == i10) {
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
                l8Var.w0(new MessageObject(l8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new n7(l8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new k7(l8Var, tL_error, 3));
        }
    }

    public static void u(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void v(l8 l8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.sy syVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String formatPluralStringComma;
        long j3;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(l8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j10 = topicKey.dialogId;
            Bundle i12 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else if (DialogObject.isUserDialog(j10)) {
                i12.putLong("user_id", j10);
            } else {
                i12.putLong("chat_id", -j10);
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i12);
            if (topicKey.topicId != 0) {
                ng.d.a(znVar, topicKey);
            }
            if (l8Var.G0.q0(znVar, true, false)) {
                znVar.Eb(arrayList3);
                if (topicKey.topicId != 0) {
                    syVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            syVar.finishFragment();
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(arrayList3, j3, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(l8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j3, null, null, null, null, null, null, z10, i10, 0, 0, l8Var.f28257w0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        syVar.finishFragment();
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R != null) {
            ad a02 = ad.a0(R);
            int i14 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(l8Var.currentAccount).getClientUserId()) {
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

    public static void w(l8 l8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && l8Var.f28257w0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f20074id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f20096id = tL_inputDocument;
                tL_inputDocument.f20080id = document.f20074id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = l8Var.f28257w0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                l8Var.f28259x0.clear();
                l8Var.f28259x0.addAll(l8Var.f28257w0.list);
                l8Var.f28251s.l();
                ConnectionsManager.getInstance(l8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(l8Var.getContext(), 3, null);
            a2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(l8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ai.d5(l8Var, a2Var, document, 5));
            }
        }
    }

    public static void x(l8 l8Var, MessageObject messageObject, p80 p80Var) {
        l8Var.f28257w0.remove(messageObject);
        l8Var.f28259x0.remove(messageObject);
        l8Var.f28251s.l();
        p80Var.u();
        l8Var.z0(false);
        org.telegram.messenger.q.q(R.string.AudioSaveToMyProfileUnsaved, new ad((FrameLayout) l8Var.containerView, l8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void y(l8 l8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.p((FrameLayout) l8Var.containerView, l8Var.resourcesProvider, tL_error, false);
    }

    public static void z(l8 l8Var) {
        org.telegram.ui.ActionBar.d6 d6Var = l8Var.resourcesProvider;
        new ad((FrameLayout) l8Var.containerView, d6Var).o(zc.F, d6Var).j();
    }

    public final void A0(org.telegram.messenger.MessageObject r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l8.A0(org.telegram.messenger.MessageObject):void");
    }

    public final void B0(boolean z10, boolean z11) {
        y9 y9Var = this.f28241j0;
        r7 r7Var = this.f28240i0;
        if (z10) {
            if (r7Var.getVisibility() != 0 && !this.m0) {
                r7Var.setTag(1);
                b8 b8Var = this.I;
                y9Var.setImageBitmap(b8Var.f26678a[b8Var.f26679b].getImageReceiver().getBitmap());
                this.m0 = true;
                hn0.d(new c7(this, 1));
                r7Var.setVisibility(0);
                r7Var.animate().alpha(1.0f).setDuration(180L).setListener(new y7(this, 0)).start();
                y9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (r7Var.getVisibility() != 0) {
        } else {
            r7Var.setTag(null);
            if (z11) {
                this.m0 = true;
                r7Var.animate().alpha(0.0f).setDuration(180L).setListener(new y7(this, 1)).start();
                y9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            r7Var.setAlpha(0.0f);
            r7Var.setVisibility(4);
            y9Var.setImageBitmap(null);
            y9Var.setScaleX(0.9f);
            y9Var.setScaleY(0.9f);
        }
    }

    public final void C0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        int i10;
        boolean z10 = true;
        p80 G = p80.G(this.container, this.resourcesProvider, xVar, true);
        if (t0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new h7(this, G, messageObject, 0), !this.f28262z0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new h7(this, G, messageObject, 1), !this.f28262z0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new h7(this, messageObject, G, 2), true);
        } else {
            p80 q02 = q0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, q02, 6), !this.f28262z0);
            if (!this.f28262z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new h7(this, G, messageObject, 3), !this.f28262z0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new h7(this, G, messageObject, 4), !this.f28262z0);
            if (messageObject.getId() <= 0) {
                z10 = false;
            }
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new e7(this, messageObject, 1), z10);
        }
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        G.V(i10);
        G.Z();
    }

    public final void D0() {
        if (this.H0 == 1) {
            this.K0 = System.currentTimeMillis();
            this.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.t6 t6Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            AndroidUtilities.runOnUIThread(t6Var);
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
            e();
            boolean z11 = this.Y;
            int i10 = 0;
            this.Y = false;
            while (true) {
                org.telegram.ui.ActionBar.e1[] e1VarArr = this.Z;
                if (i10 < e1VarArr.length) {
                    if (!z11 && Math.abs(playbackSpeed - U0[i10]) < 0.05f) {
                        org.telegram.ui.ActionBar.e1 e1Var = e1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.h6.Qh;
                        e1Var.c(getThemedColor(i11), getThemedColor(i11));
                    } else {
                        org.telegram.ui.ActionBar.e1 e1Var2 = e1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.h6.E8;
                        e1Var2.c(getThemedColor(i12), getThemedColor(i12));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void G0(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l8.G0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.u0 u0Var = this.f28230b0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                u0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.h6.Xi;
                u0Var.setTag(Integer.valueOf(i11));
                u0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.h6.C1(u0Var.getBackground(), getThemedColor(i11) & 436207615, true);
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
            int i12 = org.telegram.ui.ActionBar.h6.Wi;
            u0Var.setTag(Integer.valueOf(i12));
            u0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.h6.C1(u0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.h6.f20913i6), true);
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.h6.Xi;
        u0Var.setTag(Integer.valueOf(i13));
        u0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.h6.C1(u0Var.getBackground(), 436207615 & getThemedColor(i13), true);
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

    public final void I0() {
        boolean z10;
        y0(this.f28235e0, SharedConfig.shuffleMusic);
        y0(this.f28237f0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        y0(this.f28233d0, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        y0(this.f28232c0, z11);
    }

    public final void J0(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l8.J0(boolean):void");
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
        w7 w7Var = this.f28244n;
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
                k8 k8Var = this.f28251s;
                if (i10 == i14) {
                    this.f28257w0 = MediaController.getInstance().currentSavedMusicList;
                    this.f28259x0 = MediaController.getInstance().getPlaylist();
                    k8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f28257w0 = MediaController.getInstance().currentSavedMusicList;
                    this.f28259x0 = MediaController.getInstance().getPlaylist();
                    k8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        w7Var.B0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        s4.d0 d0Var = this.f28249r;
                        d0Var.L0();
                        int N0 = d0Var.N0();
                        if (N0 != -1) {
                            View m10 = d0Var.m(N0);
                            if (m10 != null) {
                                i13 = m10.getTop();
                            }
                            d0Var.h1(N0 + intValue, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoaded) {
                    if (((String) objArr[0]).equals(this.B0)) {
                        J0(false);
                        this.f28248q0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.B0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        float f7 = 1.0f;
                        if (!this.f28248q0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f28247p0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f7 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.B0);
                                }
                                this.f28247p0 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        if (f7 != -1.0f) {
                            o1.k kVar = this.f28246o0;
                            kVar.f17024u.f17031i = f7 * 1000.0f;
                            kVar.h();
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
                int childCount = w7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = w7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = w7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = w7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    xVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    D0();
                } else if (this.H0 == 1 && this.I0 != -1.0f) {
                    org.telegram.ui.Cells.t6 t6Var = this.N0;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    this.L0 = 0L;
                    t6Var.run();
                    this.I0 = -1.0f;
                }
            }
        }
        org.telegram.ui.wr wrVar = this.O;
        if (wrVar != null) {
            wrVar.a(b5.d.u());
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

    public final void e() {
        boolean z10;
        float f7;
        int themedColor;
        int i10;
        float f10 = 1.0f;
        org.telegram.ui.ActionBar.u0 u0Var = this.V;
        if (u0Var != null) {
            if (Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f) {
                i10 = org.telegram.ui.ActionBar.h6.f21192x7;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.Qh;
            }
            int themedColor2 = getThemedColor(i10);
            hd hdVar = this.W;
            if (hdVar != null) {
                ((q6) hdVar.f27067c).u(themedColor2);
                Paint paint = (Paint) hdVar.f27066b;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.e1 e1Var = this.P;
        if (e1Var != null) {
            v7 v7Var = this.Q;
            if (v7Var != null && v7Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.E8);
            final int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.h6.F8);
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            final int themedColor5 = getThemedColor(i11);
            ValueAnimator valueAnimator = e1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (e1Var.J) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            e1Var.I = ofFloat;
            e1Var.J = z10;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    e1 e1Var2 = e1.this;
                    e1Var2.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i12 = themedColor3;
                    int i13 = themedColor5;
                    e1Var2.setTextColor(i0.a.d(floatValue, i12, i13));
                    e1Var2.setIconColor(i0.a.d(floatValue, themedColor4, i13));
                }
            });
            e1Var.I.addListener(new org.telegram.ui.ActionBar.d1(e1Var, z10, themedColor3, themedColor5, themedColor4));
            e1Var.I.setInterpolator(is.h);
            e1Var.I.start();
            org.telegram.ui.ActionBar.e1 e1Var2 = this.P;
            if (v7Var != null && v7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20913i6);
            }
            e1Var2.setSelectorColor(themedColor);
        }
    }

    @Override
    public final int getContainerViewHeight() {
        r7 r7Var = this.E;
        if (r7Var == null) {
            return 0;
        }
        if (this.f28259x0.size() <= 1) {
            return r7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f28244n.getTranslationY() + ((this.A0 - this.backgroundPaddingTop) - dp));
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
        a7 a7Var = new a7(this, 0);
        int i10 = org.telegram.ui.ActionBar.h6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28231c, 64, null, null, null, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28231c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28231c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28231c, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28231c, 134217728, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28231c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20921ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20939je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21142uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21159vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21225z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20938jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20920id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.h6.f20893h5));
        int i12 = org.telegram.ui.ActionBar.h6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.f21173w7;
        org.telegram.ui.ActionBar.u0 u0Var = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.h6.f21192x7));
        int i15 = org.telegram.ui.ActionBar.h6.Wi;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f28230b0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, a7Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Xi));
        int i16 = org.telegram.ui.ActionBar.h6.f20913i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, a7Var, i16));
        int i17 = org.telegram.ui.ActionBar.h6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, a7Var, i17));
        int i18 = org.telegram.ui.ActionBar.h6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, a7Var, i18));
        org.telegram.ui.ActionBar.u0 u0Var3 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 0, null, null, null, a7Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 0, null, null, null, a7Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 0, null, null, null, a7Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 0, null, null, null, a7Var, i18));
        t7 t7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.j6(t7Var, (Class[]) null, new dk0[]{t7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t7Var, (Class[]) null, new dk0[]{t7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t7Var, (Class[]) null, new dk0[]{t7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 131080, null, null, null, null, i16));
        ImageView imageView = this.f28238g0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 131080, null, null, null, null, i16));
        u7 u7Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u7Var, (Class[]) null, new dk0[]{u7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u7Var, (Class[]) null, new dk0[]{u7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u7Var, (Class[]) null, new dk0[]{u7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28234e, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28256w, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.W5));
        int i19 = org.telegram.ui.ActionBar.h6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28258x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28260y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28244n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20806c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28228a0, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 4, null, null, null, null, i11));
        c8 c8Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.j6(c8Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c8Var.getNextTextView(), 4, null, null, null, null, i10));
        c8 c8Var2 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.j6(c8Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c8Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
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
        a8 a8Var = this.f28231c;
        if (a8Var != null && a8Var.f21322n0) {
            a8Var.h(true);
        } else if (this.f28240i0.getTag() != null) {
            B0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        r7 r7Var = this.f28240i0;
        if (view != r7Var) {
            return false;
        }
        r7Var.layout(0, 0, r7Var.getMeasuredWidth(), r7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        r7 r7Var = this.f28240i0;
        if (view == r7Var) {
            r7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.S.a(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
    }

    public final p80 q0(p80 p80Var, MessageObject messageObject) {
        long j3;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j3 = document.f20074id;
        } else {
            j3 = 0;
        }
        p80 J = p80Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(p80Var, 26), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new h7(this, messageObject, p80Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new h7(this, messageObject, p80Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new h7(this, messageObject, p80Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void r0(MessageObject messageObject) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.G0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle d = org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true);
        d.putBoolean("canSelectTopics", true);
        org.telegram.ui.sy syVar = new org.telegram.ui.sy(d);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            k10 = null;
        } else {
            k10 = org.telegram.messenger.q.k(messageObject);
            tL_document = null;
        }
        syVar.C2 = new a1.d(this, k10, tL_document, messageObject, 6);
        launchActivity.p0(syVar);
        dismiss();
    }

    @Override
    public final void show() {
        super.show();
        T0 = this;
    }

    public final boolean t0() {
        MessagesController.SavedMusicList savedMusicList = this.f28257w0;
        if (savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return false;
    }

    public final void u0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && (launchActivity = this.G0) != null) {
            if (i10 == 1) {
                r0(playingMessageObject);
            } else if (i10 == 2) {
                A0(playingMessageObject);
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
                launchActivity.q0(new org.telegram.ui.zn(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                v0(playingMessageObject);
            } else if (i10 == 6) {
                pf.b.S().W(MediaController.getInstance().getCurrentChromecastMedia());
                this.Q.performClick();
            } else if (i10 == 7) {
                w0(playingMessageObject, false, new e7(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                ci.d8 d8Var = new ci.d8(getContext(), true, null, new g7(this, 0), null);
                d8Var.f4952h0 = true;
                d8Var.Z = false;
                d8Var.f4960q0.N(true);
                d8Var.show();
            }
        }
    }

    public final void v0(MessageObject messageObject) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) {
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
        if (str3 != null && str3.length() > 0 && !sc.v.u(str3)) {
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
        MediaController.saveFile(str4, this.G0, 3, str2, str5, new g7(this, 1));
    }

    public final void w0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j3 = document.f20074id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f20096id = tL_inputDocument;
        tL_inputDocument.f20080id = j3;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new j7(this, z11, messageObject, z10, runnable, j3, document));
    }

    public final boolean x0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l8.x0(boolean):boolean");
    }

    public final void y0(org.telegram.ui.ActionBar.e1 e1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.h6.Xi;
            e1Var.setTextColor(getThemedColor(i10));
            e1Var.setIconColor(getThemedColor(i10));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        e1Var.setTextColor(getThemedColor(i11));
        e1Var.setIconColor(getThemedColor(i11));
    }

    public final void z0(final boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean t02 = t0();
        ci.d dVar = this.G;
        ci.d dVar2 = this.F;
        if (!t02 && !this.f28262z0) {
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
            is isVar = is.h;
            duration.setInterpolator(isVar).withEndAction(new Runnable(this) {
                public final l8 f26370b;

                {
                    this.f26370b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            ci.d dVar3 = this.f26370b.F;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            ci.d dVar4 = this.f26370b.G;
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
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(isVar).withEndAction(new Runnable(this) {
                public final l8 f26370b;

                {
                    this.f26370b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            ci.d dVar3 = this.f26370b.F;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            ci.d dVar4 = this.f26370b.G;
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
