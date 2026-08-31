package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
public final class c8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static c8 Q0;
    public static final float[] R0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public final j7 B;
    public int B0;
    public final qh.d C;
    public final int C0;
    public final qh.d D;
    public final LaunchActivity D0;
    public final f2.f0 E;
    public int E0;
    public final s7 F;
    public float F0;
    public final t7 G;
    public int G0;
    public final l7 H;
    public long H0;
    public final m7 I;
    public long I0;
    public final t7 J;
    public boolean J0;
    public final org.telegram.ui.ActionBar.w0 K;
    public final m2.b K0;
    public final org.telegram.ui.ur L;
    public org.telegram.ui.ej L0;
    public org.telegram.ui.ActionBar.g1 M;
    public long M0;
    public final n7 N;
    public float N0;
    public final boolean O;
    public final org.telegram.ui.Cells.c2 O0;
    public final p80 P;
    public ValueAnimator P0;
    public final u7 Q;
    public final org.telegram.ui.ActionBar.l5 R;
    public final org.telegram.ui.ActionBar.w0 S;
    public final ef.f T;
    public final org.telegram.ui.ActionBar.c1 U;
    public boolean V;
    public final org.telegram.ui.ActionBar.g1[] W;
    public final TextView X;
    public final org.telegram.ui.ActionBar.w0 Y;
    public final org.telegram.ui.ActionBar.g1 Z;
    public final org.telegram.ui.ActionBar.g1 f25827a0;
    public final View f25828b;
    public final org.telegram.ui.ActionBar.g1 f25829b0;
    public final fg.k1 f25830c;
    public final org.telegram.ui.ActionBar.g1 f25831c0;
    public final View d;
    public final ImageView f25832d0;
    public final View f25833e;
    public final og0 f25834e0;
    public boolean f25835f;
    public final j7 f25836f0;
    public final p9 f25837g0;
    public boolean h;
    public final org.telegram.ui.ActionBar.w0 f25838h0;
    public final org.telegram.ui.ActionBar.w0 f25839i0;
    public boolean f25840j0;
    public final View[] f25841k0;
    public final o1.j f25842l0;
    public long m0;
    public final o7 f25843n;
    public boolean f25844n0;
    public boolean f25845o0;
    public int f25846p0;
    public int f25847q0;
    public final f2.j0 f25848r;
    public final boolean f25849r0;
    public final b8 f25850s;
    public final boolean f25851s0;
    public MessagesController.SavedMusicList f25852t0;
    public ArrayList f25853u0;
    public final LinearLayout v;
    public MessageObject f25854v0;
    public final ImageView f25855w;
    public boolean f25856w0;
    public final TextView f25857x;
    public int f25858x0;
    public final TextView f25859y;
    public String f25860y0;
    public AnimatorSet f25861z0;

    public c8(Activity activity, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var, true, false);
        boolean z4;
        float f10;
        boolean z10;
        TLRPC.User user;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.W = g1VarArr;
        View[] viewArr = new View[5];
        this.f25841k0 = viewArr;
        this.f25845o0 = true;
        this.f25846p0 = -1;
        this.f25858x0 = Integer.MAX_VALUE;
        this.F0 = -1.0f;
        this.K0 = new m2.b(this, 13);
        this.O0 = new org.telegram.ui.Cells.c2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.D0 = (LaunchActivity) activity;
        this.C0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        r7 r7Var = new r7(this, activity);
        this.containerView = r7Var;
        r7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        fg.k1 k1Var = new fg.k1(this, activity, g6Var, 1);
        this.f25830c = k1Var;
        k1Var.setBackgroundColor(0);
        k1Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = org.telegram.ui.ActionBar.k6.Oi;
        k1Var.C(getThemedColor(i14), false);
        k1Var.B(getThemedColor(org.telegram.ui.ActionBar.k6.Ni), false);
        k1Var.setTitleColor(getThemedColor(i14));
        k1Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.k6.Pi));
        k1Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z n10 = k1Var.n();
        n10.setLayoutParams(k7.c6.e(-1, -1, 119));
        View view = new View(activity);
        this.f25828b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
        k1Var.addView(view, 0, k7.c6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        k1Var.setAlpha(0.0f);
        k1Var.setActionBarMenuOnItemClick(new fg.l1(this, 23));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.f25833e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.V5));
        j7 j7Var = new j7(this, activity, 2);
        this.B = j7Var;
        s7 s7Var = new s7(this, activity);
        this.F = s7Var;
        j7Var.addView(s7Var, k7.c6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, activity, 0);
        this.G = t7Var;
        j7Var.addView(t7Var, k7.c6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var2 = new t7(this, activity, activity, 1);
        this.J = t7Var2;
        j7Var.addView(t7Var2, k7.c6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        u7 u7Var = new u7(this, activity, g6Var);
        this.Q = u7Var;
        u7Var.setLineWidth(4);
        u7Var.setDelegate(new i7(this));
        u7Var.setReportChanges(true);
        j7Var.addView(u7Var, k7.c6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new kb.a(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.f16336u = kVar;
        jVar.b(new f7(this, 0));
        this.f25842l0 = jVar;
        p80 p80Var = new p80(activity);
        this.P = p80Var;
        p80Var.setVisibility(4);
        p80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ti));
        p80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
        j7Var.addView(p80Var, k7.c6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.R = l5Var;
        l5Var.setTextSize(12);
        l5Var.l("0:00", false);
        int i15 = org.telegram.ui.ActionBar.k6.Si;
        l5Var.setTextColor(getThemedColor(i15));
        l5Var.setImportantForAccessibility(2);
        j7Var.addView(l5Var, k7.c6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.X = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i15));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        j7Var.addView(textView, k7.c6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i15), false, g6Var);
        this.S = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new u6(this, 0));
        ef.f fVar = new ef.f();
        this.T = fVar;
        w0Var.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), g6Var);
        this.U = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new v6(this, 0));
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
        j7Var.addView(w0Var, k7.c6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new w2(1, this, fArr));
        w0Var.setOnLongClickListener(new oh.g2(2, this, g6Var));
        F0(false);
        j7 j7Var2 = new j7(this, activity, 0);
        j7Var.addView(j7Var2, k7.c6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, g6Var);
        this.Y = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i16 = org.telegram.ui.ActionBar.k6.f21750i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        j7Var2.addView(w0Var2, k7.c6.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f32650b;

            {
                this.f32650b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        c8 c8Var = this.f32650b;
                        c8Var.I0();
                        c8Var.Y.M(null, null);
                        return;
                    default:
                        c8.I(this.f32650b, view4);
                        return;
                }
            }
        });
        this.Z = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.f25827a0 = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f25829b0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f25831c0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new u6(this, 1));
        int i17 = org.telegram.ui.ActionBar.k6.Wi;
        int themedColor = getThemedColor(i17);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        l7 l7Var = new l7(this, activity, scaledTouchSlop);
        this.H = l7Var;
        viewArr[1] = l7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l7Var.setScaleType(scaleType);
        l7Var.f(R.raw.player_prev, 20, 20, null);
        l7Var.h(themedColor, "Triangle 3");
        l7Var.h(themedColor, "Triangle 4");
        l7Var.h(themedColor, "Rectangle 4");
        l7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        j7Var2.addView(l7Var, k7.c6.e(48, 48, 51));
        l7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f25832d0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        og0 og0Var = new og0(28);
        this.f25834e0 = og0Var;
        imageView.setImageDrawable(og0Var);
        og0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(24.0f)));
        j7Var2.addView(imageView, k7.c6.e(48, 48, 51));
        imageView.setOnClickListener(new eg.m(10));
        m7 m7Var = new m7(this, activity, scaledTouchSlop);
        this.I = m7Var;
        viewArr[3] = m7Var;
        m7Var.setScaleType(scaleType);
        m7Var.f(R.raw.player_prev, 20, 20, null);
        m7Var.h(themedColor, "Triangle 3");
        m7Var.h(themedColor, "Triangle 4");
        m7Var.h(themedColor, "Rectangle 4");
        m7Var.setRotation(180.0f);
        m7Var.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        j7Var2.addView(m7Var, k7.c6.e(48, 48, 51));
        m7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, g6Var);
        this.K = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.ur urVar = new org.telegram.ui.ur(activity, R.drawable.ic_ab_other, g6Var);
        this.L = urVar;
        w0Var3.setIcon(urVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f32650b;

            {
                this.f32650b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        c8 c8Var = this.f32650b;
                        c8Var.I0();
                        c8Var.Y.M(null, null);
                        return;
                    default:
                        c8.I(this.f32650b, view4);
                        return;
                }
            }
        });
        j7Var2.addView(w0Var3, k7.c6.e(48, 48, 51));
        n7 n7Var = new n7(this, activity, 0);
        this.N = n7Var;
        this.O = true;
        try {
            n7Var.setRouteSelector(r5.a.c(activity).a());
        } catch (Exception e6) {
            FileLog.e(e6);
            this.O = false;
        }
        this.N.setVisibility(4);
        org.telegram.ui.ur urVar2 = this.L;
        if (urVar2 != null) {
            urVar2.a(d1.f.u());
        }
        this.K.setShowedFromBottom(true);
        this.K.setDelegate(new u6(this, 2));
        this.K.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, k7.c6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new org.telegram.ui.ActionBar.s2(10));
        ImageView imageView2 = new ImageView(activity);
        this.f25855w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, k7.c6.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f25857x = textView2;
        int i18 = org.telegram.ui.ActionBar.k6.X5;
        textView2.setTextColor(getThemedColor(i18));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f25859y = textView3;
        textView3.setTextColor(getThemedColor(i18));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, k7.c6.t(-2, -2, 17, 0, 6, 0, 0));
        o7 o7Var = new o7(this, activity);
        this.f25843n = o7Var;
        o7Var.setClipToPadding(false);
        getContext();
        f2.j0 j0Var = new f2.j0(1, false);
        this.f25848r = j0Var;
        o7Var.setLayoutManager(j0Var);
        o7Var.setHorizontalScrollBarEnabled(false);
        o7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(o7Var, k7.c6.e(-1, -1, 51));
        b8 b8Var = new b8(this, activity);
        this.f25850s = b8Var;
        o7Var.setAdapter(b8Var);
        o7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.A5));
        o7Var.setOnItemClickListener(new lh.a(2));
        o7Var.setOnItemLongClickListener(new u6(this, 3));
        o7Var.setOnScrollListener(new fg.e2(this, 15));
        qh.d dVar = new qh.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.C = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new oq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f27400b;

            {
                this.f27400b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        c8.D(this.f27400b, g6Var);
                        return;
                    default:
                        c8.C(this.f27400b, g6Var);
                        return;
                }
            }
        });
        this.B.addView(dVar, k7.c6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        qh.d dVar2 = new qh.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.D = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f27400b;

            {
                this.f27400b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        c8.D(this.f27400b, g6Var);
                        return;
                    default:
                        c8.C(this.f27400b, g6Var);
                        return;
                }
            }
        });
        this.B.addView(dVar2, k7.c6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f25852t0 = savedMusicList;
        if (savedMusicList != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f25849r0 = z4;
        this.f25830c.f21544j0 = z4;
        this.f25851s0 = s0();
        this.f25853u0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            this.f25838h0 = n10.a(8, R.drawable.msg_add);
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.fb(this, 3);
        this.f25839i0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i19 = org.telegram.ui.ActionBar.k6.Oi;
        searchField.setTextColor(getThemedColor(i19));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Si));
        searchField.setCursorColor(getThemedColor(i19));
        if (z4) {
            o7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, g6Var));
            this.f25830c.setAlpha(1.0f);
            f10 = 0.0f;
            this.f25828b.setAlpha(0.0f);
            this.O0.set(this.f25830c, Float.valueOf(0.0f));
        } else {
            f10 = 0.0f;
        }
        if (this.f25853u0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        b8Var.h = z10;
        if (z10) {
            o7Var.setVisibility(0);
            o7Var.setTranslationY(f10);
        } else {
            o7Var.setVisibility(8);
            o7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        b8Var.l();
        this.f25830c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f25852t0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f25830c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f25830c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f25852t0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat n11 = org.telegram.messenger.y3.n(MessagesController.getInstance(this.currentAccount), dialogId);
                if (n11 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(n11.user_id))) != null) {
                    this.f25830c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f25830c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f25830c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f25830c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f25830c.setTitle(chat.title);
                }
            }
        }
        if (s0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            f2.f0 f0Var = new f2.f0(new p7(this));
            this.E = f0Var;
            f0Var.d(o7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        j7 j7Var3 = this.B;
        int i20 = 52;
        if (!s0() && !this.f25856w0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(j7Var3, k7.c6.e(-1, i10 + 179, 83));
        this.containerView.addView(this.f25833e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        if (!s0() && !this.f25856w0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        ((FrameLayout.LayoutParams) this.f25833e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.f25856w0) ? 0 : 0));
        this.containerView.addView(this.d, k7.c6.c(3.0f, -1));
        this.containerView.addView(this.f25830c);
        j7 j7Var4 = new j7(this, activity, 1);
        this.f25836f0 = j7Var4;
        j7Var4.setAlpha(f10);
        j7Var4.setVisibility(4);
        getContainer().addView(j7Var4);
        p9 p9Var = new p9(activity);
        this.f25837g0 = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        p9Var.setScaleX(0.9f);
        p9Var.setScaleY(0.9f);
        j7Var4.addView(p9Var, k7.c6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        if (this.h && b8Var.h() == 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        E0();
    }

    public static void A(c8 c8Var, long j10, boolean z4, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(c8Var.currentAccount).getSavedMusicIds().update(j10, z4);
        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(c8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z4) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f20849id == j10) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(c8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void B(c8 c8Var, int i10, boolean z4, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f20864id == i10) {
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
                c8Var.v0(new MessageObject(c8Var.currentAccount, message, false, true), z4, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new g7(c8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new d7(c8Var, tL_error, 2));
        }
    }

    public static void C(c8 c8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && c8Var.D0 != null) {
            c8Var.v0(playingMessageObject, false, new ag.f(29), false);
            c8Var.y0(false);
            l.d.v(R.string.AudioSaveToMyProfileUnsaved, new qc((FrameLayout) c8Var.containerView, g6Var), R.raw.ic_delete, 36);
        }
    }

    public static void D(c8 c8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && c8Var.D0 != null) {
            c8Var.v0(playingMessageObject, true, new ag.f(29), false);
            c8Var.y0(true);
            l.d.v(R.string.AudioSaveToMyProfileSaved, new qc((FrameLayout) c8Var.containerView, g6Var), R.raw.saved_messages, 36);
        }
    }

    public static void E(c8 c8Var, float[] fArr) {
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
        if (currentTimeMillis - c8Var.M0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && c8Var.containerView != null) {
                org.telegram.ui.ej ejVar = new org.telegram.ui.ej(5, 1, c8Var.getContext(), null, false);
                c8Var.L0 = ejVar;
                ejVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                c8Var.L0.setText(LocaleController.getString(R.string.SpeedHint));
                c8Var.B.addView(c8Var.L0, k7.c6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                c8Var.L0.f(c8Var.S, true);
            }
        }
        c8Var.M0 = currentTimeMillis;
    }

    public static void F(c8 c8Var) {
        new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void G(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.yh.u((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void H(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.yh.u((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void I(c8 c8Var, View view) {
        n7 n7Var = c8Var.N;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z4 = true;
        q70 G = q70.G(c8Var.container, c8Var.resourcesProvider, view, true);
        q70 p02 = c8Var.p0(G, playingMessageObject);
        if (!c8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new lh.y2(G, p02, 5), !c8Var.f25856w0);
            if (!c8Var.f25856w0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new b7(c8Var, G, 0), !c8Var.f25856w0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new b7(c8Var, G, 1), !c8Var.f25856w0);
        if (playingMessageObject.getId() <= 0) {
            z4 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new b7(c8Var, G, 2), z4);
        if (c8Var.O) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.f30304e, G.d, false, false);
            G.d(g1Var);
            c8Var.M = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            c8Var.M.setOnClickListener(new w2(2, c8Var, G));
            AndroidUtilities.removeFromParent(n7Var);
            c8Var.M.addView(n7Var, 0, k7.c6.c(-1.0f, -1));
            c8Var.D0();
        }
        G.m(c8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new b7(c8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void J(c8 c8Var, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            d2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(c8Var.currentAccount).getInputPeer(UserConfig.getInstance(c8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.lo(4, c8Var, d2Var));
    }

    public static void K(c8 c8Var, MessageObject messageObject, q70 q70Var) {
        ArrayList<MessageObject> m9;
        String formatString;
        int i10;
        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = c8Var.currentAccount;
        if (i11 != i12) {
            c8Var.D0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                m9 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            q70Var.u();
            l.d.v(R.string.AudioSaveToSavedMessagesSaved, new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        m9 = org.telegram.messenger.y3.m(messageObject);
        if (m9 != null) {
            SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(m9, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(c8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, c8Var.f25852t0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null) {
            qc a02 = qc.a0(R);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(c8Var.currentAccount).getClientUserId()) {
                formatString = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                formatString = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId));
            } else {
                formatString = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i10 = 36;
            a02.Q(i13, 36, formatString).j();
            q70Var.u();
            l.d.v(R.string.AudioSaveToSavedMessagesSaved, new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        q70Var.u();
        l.d.v(R.string.AudioSaveToSavedMessagesSaved, new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(c8 c8Var) {
        int bottom;
        boolean z4;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = c8Var.d;
        fg.k1 k1Var = c8Var.f25830c;
        o7 o7Var = c8Var.f25843n;
        if (o7Var.getChildCount() <= 0) {
            int paddingTop = o7Var.getPaddingTop();
            c8Var.f25858x0 = paddingTop;
            o7Var.setTopGlowOffset(paddingTop);
            c8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = o7Var.getChildAt(0);
        fl0 fl0Var = (fl0) o7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.x) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int dp = AndroidUtilities.dp(7.0f);
        if (bottom < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            bottom = dp;
        }
        if (bottom <= AndroidUtilities.dp(12.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f13 = 1.0f;
        if ((z4 && k1Var.getTag() == null) || (!z4 && k1Var.getTag() != null)) {
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            k1Var.setTag(num);
            AnimatorSet animatorSet = c8Var.f25861z0;
            if (animatorSet != null) {
                animatorSet.cancel();
                c8Var.f25861z0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            c8Var.f25861z0 = animatorSet2;
            float f14 = 0.0f;
            if (c8Var.f25849r0) {
                org.telegram.ui.Cells.c2 c2Var = c8Var.O0;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k1Var, c2Var, f11);
                View view2 = c8Var.f25828b;
                Property property = View.ALPHA;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, f12);
                if (z4) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property, f14));
            } else {
                Property property2 = View.ALPHA;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k1Var, property2, f10);
                if (z4) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            c8Var.f25861z0.setDuration(320L);
            c8Var.f25861z0.setInterpolator(pr.h);
            c8Var.f25861z0.addListener(new q7(c8Var, 2));
            c8Var.f25861z0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o7Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (c8Var.f25858x0 != C) {
            c8Var.f25858x0 = C;
            o7Var.setTopGlowOffset((C - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            c8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (c8Var.backgroundPaddingTop + ((int) (o7Var.getTranslationY() + ((c8Var.f25858x0 - c8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - c8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        if (f13 <= 0.5f && i0.a.f(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != c8Var.J0) {
            c8Var.J0 = z10;
            AndroidUtilities.setLightStatusBar(c8Var, z10);
        }
    }

    public static int h0(c8 c8Var) {
        return c8Var.currentAccount;
    }

    public static int i0(c8 c8Var) {
        return c8Var.backgroundPaddingTop;
    }

    public static int j0(c8 c8Var) {
        return c8Var.backgroundPaddingTop;
    }

    public static void m(c8 c8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = c8Var.f25852t0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (c8Var.f25852t0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                c8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, c8Var.f25852t0);
        }
    }

    public static void n(c8 c8Var) {
        new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void o(c8 c8Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject) {
        d2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f20871id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f20855id = document.f20849id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = c8Var.f25852t0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            c8Var.f25853u0.clear();
            c8Var.f25853u0.addAll(c8Var.f25852t0.list);
            c8Var.f25850s.l();
            ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void p(c8 c8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = c8Var.D0;
        int i10 = UserConfig.selectedAccount;
        int i11 = c8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(c8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.xn(bundle), false, false);
        c8Var.dismiss();
    }

    public static void q(c8 c8Var, q70 q70Var) {
        c8Var.y0(true);
        new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        q70Var.u();
    }

    public static void r(c8 c8Var, int i10, boolean z4, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f20864id == i10) {
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
                c8Var.v0(new MessageObject(c8Var.currentAccount, message, false, true), z4, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new g7(c8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new d7(c8Var, tL_error, 3));
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

    public static void s(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.yh.u((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void t(c8 c8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.py pyVar, ArrayList arrayList2, CharSequence charSequence, boolean z4, int i10) {
        String formatPluralStringComma;
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(c8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i12.putLong("user_id", j11);
            } else {
                i12.putLong("chat_id", -j11);
            }
            org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i12);
            if (topicKey.topicId != 0) {
                bg.e.a(xnVar, topicKey);
            }
            if (c8Var.D0.q0(xnVar, true, false)) {
                xnVar.Ab(arrayList3);
                if (topicKey.topicId != 0) {
                    pyVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            pyVar.finishFragment();
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z4, i10, 0, 0, c8Var.f25852t0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        pyVar.finishFragment();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null) {
            qc a02 = qc.a0(R);
            int i14 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(c8Var.currentAccount).getClientUserId()) {
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

    public static void u(c8 c8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && c8Var.f25852t0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f20849id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f20871id = tL_inputDocument;
                tL_inputDocument.f20855id = document.f20849id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = c8Var.f25852t0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                c8Var.f25853u0.clear();
                c8Var.f25853u0.addAll(c8Var.f25852t0.list);
                c8Var.f25850s.l();
                ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(c8Var.getContext(), 3, null);
            d2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(c8Var.currentAccount).uploadFile(file.getAbsolutePath(), new lh.h(c8Var, d2Var, document, 7));
            }
        }
    }

    public static void v(c8 c8Var, MessageObject messageObject, q70 q70Var) {
        c8Var.f25852t0.remove(messageObject);
        c8Var.f25853u0.remove(messageObject);
        c8Var.f25850s.l();
        q70Var.u();
        c8Var.y0(false);
        l.d.v(R.string.AudioSaveToMyProfileUnsaved, new qc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.yh.u((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void x(c8 c8Var) {
        org.telegram.ui.ActionBar.g6 g6Var = c8Var.resourcesProvider;
        new qc((FrameLayout) c8Var.containerView, g6Var).o(pc.C, g6Var).j();
    }

    public static void y(c8 c8Var, boolean z4, MessageObject messageObject, final boolean z10, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z4 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f20937id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(c8Var) {
                        public final c8 f26453b;

                        {
                            this.f26453b = c8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    c8.r(this.f26453b, id2, z10, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    c8.B(this.f26453b, id2, z10, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(c8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f20881id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(c8Var) {
                    public final c8 f26453b;

                    {
                        this.f26453b = c8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                c8.r(this.f26453b, id3, z10, runnable, tLObject, tL_error2);
                                return;
                            default:
                                c8.B(this.f26453b, id3, z10, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new d7(c8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new d7(c8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new o2(c8Var, j10, z10, document, runnable));
    }

    public final void A0(boolean z4, boolean z10) {
        p9 p9Var = this.f25837g0;
        j7 j7Var = this.f25836f0;
        if (z4) {
            if (j7Var.getVisibility() != 0 && !this.f25840j0) {
                j7Var.setTag(1);
                s7 s7Var = this.F;
                p9Var.setImageBitmap(s7Var.f32965a[s7Var.f32966b].getImageReceiver().getBitmap());
                this.f25840j0 = true;
                jm0.d(new v6(this, 1));
                j7Var.setVisibility(0);
                j7Var.animate().alpha(1.0f).setDuration(180L).setListener(new q7(this, 0)).start();
                p9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (j7Var.getVisibility() != 0) {
        } else {
            j7Var.setTag(null);
            if (z10) {
                this.f25840j0 = true;
                j7Var.animate().alpha(0.0f).setDuration(180L).setListener(new q7(this, 1)).start();
                p9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            j7Var.setAlpha(0.0f);
            j7Var.setVisibility(4);
            p9Var.setImageBitmap(null);
            p9Var.setScaleX(0.9f);
            p9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        int i10;
        boolean z4 = true;
        q70 G = q70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new a7(this, G, messageObject, 0), !this.f25856w0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new a7(this, G, messageObject, 1), !this.f25856w0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a7(this, messageObject, G, 2), true);
        } else {
            q70 p02 = p0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new lh.y2(G, p02, 4), !this.f25856w0);
            if (!this.f25856w0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new a7(this, G, messageObject, 3), !this.f25856w0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new a7(this, G, messageObject, 4), !this.f25856w0);
            if (messageObject.getId() <= 0) {
                z4 = false;
            }
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new x6(this, messageObject, 1), z4);
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
        if (this.E0 == 1) {
            this.H0 = System.currentTimeMillis();
            this.F0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            m2.b bVar = this.K0;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar);
        }
    }

    public final void D0() {
        boolean z4;
        float f10;
        int themedColor;
        int i10;
        float f11 = 1.0f;
        org.telegram.ui.ActionBar.w0 w0Var = this.S;
        if (w0Var != null) {
            if (Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f) {
                i10 = org.telegram.ui.ActionBar.k6.f22018x7;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Qh;
            }
            int themedColor2 = getThemedColor(i10);
            ef.f fVar = this.T;
            if (fVar != null) {
                ((j6) fVar.f5050b).r(themedColor2);
                Paint paint = (Paint) fVar.f5051c;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.M;
        if (g1Var != null) {
            n7 n7Var = this.N;
            if (n7Var != null && n7Var.b()) {
                z4 = true;
            } else {
                z4 = false;
            }
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.E8);
            final int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.k6.F8);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            final int themedColor5 = getThemedColor(i11);
            ValueAnimator valueAnimator = g1Var.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (g1Var.G) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z4) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            g1Var.F = ofFloat;
            g1Var.G = z4;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    g1 g1Var2 = g1.this;
                    g1Var2.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i12 = themedColor3;
                    int i13 = themedColor5;
                    g1Var2.setTextColor(i0.a.d(floatValue, i12, i13));
                    g1Var2.setIconColor(i0.a.d(floatValue, themedColor4, i13));
                }
            });
            g1Var.F.addListener(new org.telegram.ui.ActionBar.f1(g1Var, z4, themedColor3, themedColor5, themedColor4));
            g1Var.F.setInterpolator(pr.h);
            g1Var.F.start();
            org.telegram.ui.ActionBar.g1 g1Var2 = this.M;
            if (n7Var != null && n7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6);
            }
            g1Var2.setSelectorColor(themedColor);
        }
    }

    public final void E0() {
        int i10;
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.B.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(150.0f);
        } else {
            i10 = -AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - i10) / 2);
    }

    public final void F0(boolean z4) {
        if (this.S != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            this.T.l(playbackSpeed, z4);
            this.U.d(playbackSpeed, z4);
            D0();
            boolean z10 = this.V;
            int i10 = 0;
            this.V = false;
            while (true) {
                org.telegram.ui.ActionBar.g1[] g1VarArr = this.W;
                if (i10 < g1VarArr.length) {
                    if (!z10 && Math.abs(playbackSpeed - R0[i10]) < 0.05f) {
                        org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.k6.Qh;
                        g1Var.c(getThemedColor(i11), getThemedColor(i11));
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.k6.E8;
                        g1Var2.c(getThemedColor(i12), getThemedColor(i12));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void G0(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.G0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.Y;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.k6.Xi;
                w0Var.setTag(Integer.valueOf(i11));
                w0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.k6.B1(w0Var.getBackground(), getThemedColor(i11) & 436207615, true);
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
            int i12 = org.telegram.ui.ActionBar.k6.Wi;
            w0Var.setTag(Integer.valueOf(i12));
            w0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.k6.B1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.k6.Xi;
        w0Var.setTag(Integer.valueOf(i13));
        w0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.k6.B1(w0Var.getBackground(), 436207615 & getThemedColor(i13), true);
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

    public final void I0() {
        boolean z4;
        x0(this.f25829b0, SharedConfig.shuffleMusic);
        x0(this.f25831c0, SharedConfig.playOrderReversed);
        boolean z10 = false;
        if (SharedConfig.repeatMode == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        x0(this.f25827a0, z4);
        if (SharedConfig.repeatMode == 2) {
            z10 = true;
        }
        x0(this.Z, z10);
    }

    public final void J0(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.J0(boolean):void");
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        org.telegram.ui.Cells.x xVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.x xVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i12 = NotificationCenter.messagePlayingDidStart;
        o7 o7Var = this.f25843n;
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
                b8 b8Var = this.f25850s;
                if (i10 == i14) {
                    this.f25852t0 = MediaController.getInstance().currentSavedMusicList;
                    this.f25853u0 = MediaController.getInstance().getPlaylist();
                    b8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f25852t0 = MediaController.getInstance().currentSavedMusicList;
                    this.f25853u0 = MediaController.getInstance().getPlaylist();
                    b8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        o7Var.B0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        f2.j0 j0Var = this.f25848r;
                        j0Var.L0();
                        int N0 = j0Var.N0();
                        if (N0 != -1) {
                            View m9 = j0Var.m(N0);
                            if (m9 != null) {
                                i13 = m9.getTop();
                            }
                            j0Var.h1(N0 + intValue, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoaded) {
                    if (((String) objArr[0]).equals(this.f25860y0)) {
                        J0(false);
                        this.f25844n0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.f25860y0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.f25844n0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.m0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f10 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.f25860y0);
                                }
                                this.m0 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            o1.j jVar = this.f25842l0;
                            jVar.f16336u.f16343i = f10 * 1000.0f;
                            jVar.f();
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
            z4 = true;
        } else {
            z4 = false;
        }
        J0(z4);
        if (i10 != i15 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (((MessageObject) objArr[0]).eventId == 0) {
                int childCount = o7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = o7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = o7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = o7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    xVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    C0();
                } else if (this.E0 == 1 && this.F0 != -1.0f) {
                    m2.b bVar = this.K0;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    this.I0 = 0L;
                    bVar.run();
                    this.F0 = -1.0f;
                }
            }
        }
        org.telegram.ui.ur urVar = this.L;
        if (urVar != null) {
            urVar.a(d1.f.u());
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
        if (Q0 == this) {
            Q0 = null;
        }
    }

    @Override
    public final int getContainerViewHeight() {
        j7 j7Var = this.B;
        if (j7Var == null) {
            return 0;
        }
        if (this.f25853u0.size() <= 1) {
            return j7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f25843n.getTranslationY() + ((this.f25858x0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override
    public final int getObserverTag() {
        return this.C0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t6 t6Var = new t6(this, 0);
        int i10 = org.telegram.ui.ActionBar.k6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25830c, 64, null, null, null, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25830c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25830c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25830c, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25830c, 134217728, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25830c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21757ie));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21774je));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21967uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21985vc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21773jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21756id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.k6.f21731h5));
        int i12 = org.telegram.ui.ActionBar.k6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.f21999w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.S;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.k6.f22018x7));
        int i15 = org.telegram.ui.ActionBar.k6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 0, null, null, null, t6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Xi));
        int i16 = org.telegram.ui.ActionBar.k6.f21750i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 0, null, null, null, t6Var, i16));
        int i17 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 0, null, null, null, t6Var, i17));
        int i18 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 0, null, null, null, t6Var, i18));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3, 0, null, null, null, t6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3, 0, null, null, null, t6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3, 0, null, null, null, t6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3, 0, null, null, null, t6Var, i18));
        l7 l7Var = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.m6(l7Var, (Class[]) null, new ij0[]{l7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(l7Var, (Class[]) null, new ij0[]{l7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(l7Var, (Class[]) null, new ij0[]{l7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 131080, null, null, null, null, i16));
        ImageView imageView = this.f25832d0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 131080, null, null, null, null, i16));
        m7 m7Var = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.m6(m7Var, (Class[]) null, new ij0[]{m7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(m7Var, (Class[]) null, new ij0[]{m7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(m7Var, (Class[]) null, new ij0[]{m7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25833e, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25855w, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.W5));
        int i19 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25857x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25859y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f25843n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21642c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.X, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 4, null, null, null, null, i11));
        t7 t7Var = this.G;
        arrayList.add(new org.telegram.ui.ActionBar.m6(t7Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t7Var.getNextTextView(), 4, null, null, null, null, i10));
        t7 t7Var2 = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.m6(t7Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t7Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        return arrayList;
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        int i10;
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f11 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f11 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f10 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
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
        if (f11 >= top + i10 && f10 >= this.containerView.getLeft() && f10 <= this.containerView.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onBackPressed() {
        fg.k1 k1Var = this.f25830c;
        if (k1Var != null && k1Var.f21546k0) {
            k1Var.h(true);
        } else if (this.f25836f0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        j7 j7Var = this.f25836f0;
        if (view != j7Var) {
            return false;
        }
        j7Var.layout(0, 0, j7Var.getMeasuredWidth(), j7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        j7 j7Var = this.f25836f0;
        if (view == j7Var) {
            j7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.P.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    public final q70 p0(q70 q70Var, MessageObject messageObject) {
        long j10;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j10 = document.f20849id;
        } else {
            j10 = 0;
        }
        q70 J = q70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.tt0(q70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new a7(this, messageObject, q70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new a7(this, messageObject, q70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new a7(this, messageObject, q70Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList m9;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.D0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle e6 = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
        e6.putBoolean("canSelectTopics", true);
        org.telegram.ui.py pyVar = new org.telegram.ui.py(e6);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            m9 = null;
        } else {
            m9 = org.telegram.messenger.y3.m(messageObject);
            tL_document = null;
        }
        pyVar.f40308z2 = new a1.d(this, m9, tL_document, messageObject, 7);
        launchActivity.p0(pyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.f25852t0;
        if (savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        Q0 = this;
    }

    public final void t0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && (launchActivity = this.D0) != null) {
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
                launchActivity.q0(new org.telegram.ui.xn(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                u0(playingMessageObject);
            } else if (i10 == 6) {
                bf.b.O().c0(MediaController.getInstance().getCurrentChromecastMedia());
                this.N.performClick();
            } else if (i10 == 7) {
                v0(playingMessageObject, false, new x6(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                qh.k6 k6Var = new qh.k6(getContext(), true, null, new z6(this, 0), null);
                k6Var.f45571e0 = true;
                k6Var.W = false;
                k6Var.f45579n0.N(true);
                k6Var.show();
            }
        }
    }

    public final void u0(MessageObject messageObject) {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
            LaunchActivity launchActivity = this.D0;
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
        if (str3 != null && str3.length() > 0 && !e2.c.t(str3)) {
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
        MediaController.saveFile(str4, this.D0, 3, str2, str5, new z6(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z4, Runnable runnable, boolean z10) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j10 = document.f20849id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z4;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f20871id = tL_inputDocument;
        tL_inputDocument.f20855id = j10;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new c7(this, z10, messageObject, z4, runnable, j10, document));
    }

    public final boolean w0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.w0(boolean):boolean");
    }

    public final void x0(org.telegram.ui.ActionBar.g1 g1Var, boolean z4) {
        if (z4) {
            int i10 = org.telegram.ui.ActionBar.k6.Xi;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        g1Var.setTextColor(getThemedColor(i11));
        g1Var.setIconColor(getThemedColor(i11));
    }

    public final void y0(final boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean s02 = s0();
        qh.d dVar = this.D;
        qh.d dVar2 = this.C;
        if (!s02 && !this.f25856w0) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z4) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z4) {
                f12 = 0.8f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(420L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final c8 f33380b;

                {
                    this.f33380b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            qh.d dVar3 = this.f33380b.C;
                            if (z4) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            qh.d dVar4 = this.f33380b.D;
                            if (z4) {
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
            if (z4) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f14);
            if (!z4) {
                f13 = 0.8f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
            if (!z4) {
                f15 = 0.8f;
            }
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(prVar).withEndAction(new Runnable(this) {
                public final c8 f33380b;

                {
                    this.f33380b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            qh.d dVar3 = this.f33380b.C;
                            if (z4) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            qh.d dVar4 = this.f33380b.D;
                            if (z4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.z0(org.telegram.messenger.MessageObject):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
