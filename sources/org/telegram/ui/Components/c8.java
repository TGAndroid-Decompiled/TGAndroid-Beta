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
public final class c8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static c8 P0;
    public static final float[] Q0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final i7 A;
    public int A0;
    public final kh.d B;
    public final int B0;
    public final kh.d C;
    public final LaunchActivity C0;
    public final f2.h0 D;
    public int D0;
    public final s7 E;
    public float E0;
    public final t7 F;
    public int F0;
    public final k7 G;
    public long G0;
    public final l7 H;
    public long H0;
    public final t7 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.w0 J;
    public final m.i3 J0;
    public final org.telegram.ui.nr K;
    public org.telegram.ui.wi K0;
    public org.telegram.ui.ActionBar.g1 L;
    public long L0;
    public final m7 M;
    public float M0;
    public final boolean N;
    public final org.telegram.ui.Cells.c2 N0;
    public final v70 O;
    public ValueAnimator O0;
    public final u7 P;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final org.telegram.ui.ActionBar.w0 R;
    public final vc S;
    public final org.telegram.ui.ActionBar.c1 T;
    public boolean U;
    public final org.telegram.ui.ActionBar.g1[] V;
    public final TextView W;
    public final org.telegram.ui.ActionBar.w0 X;
    public final org.telegram.ui.ActionBar.g1 Y;
    public final org.telegram.ui.ActionBar.g1 Z;
    public final org.telegram.ui.ActionBar.g1 f27378a0;
    public final View f27379b;
    public final org.telegram.ui.ActionBar.g1 f27380b0;
    public final r7 f27381c;
    public final ImageView f27382c0;
    public final View d;
    public final qf0 f27383d0;
    public final View f27384e;
    public final i7 f27385e0;
    public boolean f27386f;
    public final o9 f27387f0;
    public final org.telegram.ui.ActionBar.w0 f27388g0;
    public boolean h;
    public final org.telegram.ui.ActionBar.w0 f27389h0;
    public boolean f27390i0;
    public final View[] f27391j0;
    public final o1.j f27392k0;
    public long f27393l0;
    public boolean m0;
    public final n7 f27394n;
    public boolean f27395n0;
    public int f27396o0;
    public int f27397p0;
    public final boolean f27398q0;
    public final f2.m0 f27399r;
    public final boolean f27400r0;
    public final b8 f27401s;
    public MessagesController.SavedMusicList f27402s0;
    public ArrayList f27403t0;
    public MessageObject f27404u0;
    public final LinearLayout v;
    public boolean f27405v0;
    public final ImageView f27406w;
    public int f27407w0;
    public final TextView f27408x;
    public String f27409x0;
    public final TextView f27410y;
    public AnimatorSet f27411y0;
    public int f27412z0;

    public c8(Activity activity, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, b6Var, true, false);
        boolean z10;
        org.telegram.ui.ActionBar.z zVar;
        boolean z11;
        TLRPC.User user;
        int i9;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.V = g1VarArr;
        View[] viewArr = new View[5];
        this.f27391j0 = viewArr;
        this.f27395n0 = true;
        this.f27396o0 = -1;
        this.f27407w0 = Integer.MAX_VALUE;
        this.E0 = -1.0f;
        this.J0 = new m.i3(this, 11);
        this.N0 = new org.telegram.ui.Cells.c2(this);
        this.doNotOverlayNavigationBar = true;
        fixNavigationBar();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            this.currentAccount = playingMessageObject.currentAccount;
        } else {
            this.currentAccount = UserConfig.selectedAccount;
        }
        this.C0 = (LaunchActivity) activity;
        this.B0 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        q7 q7Var = new q7(this, activity);
        this.containerView = q7Var;
        q7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        r7 r7Var = new r7(this, activity, b6Var, 0);
        this.f27381c = r7Var;
        r7Var.setBackgroundColor(0);
        r7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.f6.Oi;
        r7Var.C(getThemedColor(i13), false);
        r7Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.Ni), false);
        r7Var.setTitleColor(getThemedColor(i13));
        r7Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.f6.Pi));
        r7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z n10 = r7Var.n();
        n10.setLayoutParams(g7.e6.e(-1, -1, 119));
        View view = new View(activity);
        this.f27379b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
        r7Var.addView(view, 0, g7.e6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 1));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.f27384e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.V5));
        i7 i7Var = new i7(this, activity, 2);
        this.A = i7Var;
        s7 s7Var = new s7(this, activity);
        this.E = s7Var;
        i7Var.addView(s7Var, g7.e6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, activity, 0);
        this.F = t7Var;
        i7Var.addView(t7Var, g7.e6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var2 = new t7(this, activity, activity, 1);
        this.I = t7Var2;
        i7Var.addView(t7Var2, g7.e6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        u7 u7Var = new u7(this, activity, b6Var);
        this.P = u7Var;
        u7Var.setLineWidth(4);
        u7Var.setDelegate(new h7(this));
        u7Var.setReportChanges(true);
        i7Var.addView(u7Var, g7.e6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new gb.a(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.f18800u = kVar;
        jVar.b(new e7(this, 0));
        this.f27392k0 = jVar;
        v70 v70Var = new v70(activity);
        this.O = v70Var;
        v70Var.setVisibility(4);
        v70Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ti));
        v70Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.f6.Vi));
        i7Var.addView(v70Var, g7.e6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.Q = h5Var;
        h5Var.setTextSize(12);
        h5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.f6.Si;
        h5Var.setTextColor(getThemedColor(i14));
        h5Var.setImportantForAccessibility(2);
        i7Var.addView(h5Var, g7.e6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.W = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i14));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        i7Var.addView(textView, g7.e6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i14), false, b6Var);
        this.R = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new t6(this, 0));
        vc vcVar = new vc();
        this.S = vcVar;
        w0Var.setIcon(vcVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), b6Var);
        this.T = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new u6(this, 0));
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
        i7Var.addView(w0Var, g7.e6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new s2(3, this, fArr));
        w0Var.setOnLongClickListener(new ih.g2(2, this, b6Var));
        E0(false);
        i7 i7Var2 = new i7(this, activity, 0);
        i7Var.addView(i7Var2, g7.e6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, b6Var);
        this.X = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i15 = org.telegram.ui.ActionBar.f6.f23092i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f)));
        i7Var2.addView(w0Var2, g7.e6.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f33270b;

            {
                this.f33270b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        c8 c8Var = this.f33270b;
                        c8Var.H0();
                        c8Var.X.M(null, null);
                        return;
                    default:
                        c8.I(this.f33270b, view4);
                        return;
                }
            }
        });
        this.Y = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.Z = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27378a0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27380b0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new t6(this, 1));
        int i16 = org.telegram.ui.ActionBar.f6.Wi;
        int themedColor = getThemedColor(i16);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        k7 k7Var = new k7(this, activity, scaledTouchSlop);
        this.G = k7Var;
        viewArr[1] = k7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k7Var.setScaleType(scaleType);
        k7Var.f(R.raw.player_prev, 20, 20, null);
        k7Var.h(themedColor, "Triangle 3");
        k7Var.h(themedColor, "Triangle 4");
        k7Var.h(themedColor, "Rectangle 4");
        k7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f)));
        i7Var2.addView(k7Var, g7.e6.e(48, 48, 51));
        k7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f27382c0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        qf0 qf0Var = new qf0(28);
        this.f27383d0 = qf0Var;
        imageView.setImageDrawable(qf0Var);
        qf0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(24.0f)));
        i7Var2.addView(imageView, g7.e6.e(48, 48, 51));
        imageView.setOnClickListener(new fh.n(11));
        l7 l7Var = new l7(this, activity, scaledTouchSlop);
        this.H = l7Var;
        viewArr[3] = l7Var;
        l7Var.setScaleType(scaleType);
        l7Var.f(R.raw.player_prev, 20, 20, null);
        l7Var.h(themedColor, "Triangle 3");
        l7Var.h(themedColor, "Triangle 4");
        l7Var.h(themedColor, "Rectangle 4");
        l7Var.setRotation(180.0f);
        l7Var.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(22.0f)));
        i7Var2.addView(l7Var, g7.e6.e(48, 48, 51));
        l7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, b6Var);
        this.J = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.nr nrVar = new org.telegram.ui.nr(activity, R.drawable.ic_ab_other, b6Var);
        this.K = nrVar;
        w0Var3.setIcon(nrVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i15), 1, AndroidUtilities.dp(18.0f)));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f33270b;

            {
                this.f33270b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        c8 c8Var = this.f33270b;
                        c8Var.H0();
                        c8Var.X.M(null, null);
                        return;
                    default:
                        c8.I(this.f33270b, view4);
                        return;
                }
            }
        });
        i7Var2.addView(w0Var3, g7.e6.e(48, 48, 51));
        m7 m7Var = new m7(this, activity, 0);
        this.M = m7Var;
        this.N = true;
        try {
            m7Var.setRouteSelector(n5.a.c(activity).a());
        } catch (Exception e10) {
            FileLog.e(e10);
            this.N = false;
        }
        this.M.setVisibility(4);
        org.telegram.ui.nr nrVar2 = this.K;
        if (nrVar2 != null) {
            nrVar2.a(d1.f.t());
        }
        this.J.setShowedFromBottom(true);
        this.J.setDelegate(new t6(this, 2));
        this.J.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, g7.e6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new jh.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.f27406w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, g7.e6.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f27408x = textView2;
        int i17 = org.telegram.ui.ActionBar.f6.X5;
        textView2.setTextColor(getThemedColor(i17));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f27410y = textView3;
        textView3.setTextColor(getThemedColor(i17));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, g7.e6.t(-2, -2, 17, 0, 6, 0, 0));
        n7 n7Var = new n7(this, activity);
        this.f27394n = n7Var;
        n7Var.setClipToPadding(false);
        getContext();
        f2.m0 m0Var = new f2.m0(1, false);
        this.f27399r = m0Var;
        n7Var.setLayoutManager(m0Var);
        n7Var.setHorizontalScrollBarEnabled(false);
        n7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(n7Var, g7.e6.e(-1, -1, 51));
        b8 b8Var = new b8(this, activity);
        this.f27401s = b8Var;
        n7Var.setAdapter(b8Var);
        n7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        n7Var.setOnItemClickListener(new fh.a(2));
        n7Var.setOnItemLongClickListener(new t6(this, 3));
        n7Var.setOnScrollListener(new bg.o2(this, 21));
        kh.d dVar = new kh.d(activity, b6Var, true);
        dVar.setRoundRadius(24);
        this.B = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new eq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f28664b;

            {
                this.f28664b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        c8.D(this.f28664b, b6Var);
                        return;
                    default:
                        c8.C(this.f28664b, b6Var);
                        return;
                }
            }
        });
        this.A.addView(dVar, g7.e6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        kh.d dVar2 = new kh.d(activity, b6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.C = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final c8 f28664b;

            {
                this.f28664b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        c8.D(this.f28664b, b6Var);
                        return;
                    default:
                        c8.C(this.f28664b, b6Var);
                        return;
                }
            }
        });
        this.A.addView(dVar2, g7.e6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f27402s0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27398q0 = z10;
        this.f27381c.f23575i0 = z10;
        this.f27400r0 = r0();
        this.f27403t0 = MediaController.getInstance().getPlaylist();
        if (r0()) {
            zVar = n10;
            this.f27388g0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = n10;
        }
        org.telegram.ui.ActionBar.w0 a2 = zVar.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.cb(this, 3);
        this.f27389h0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i18 = org.telegram.ui.ActionBar.f6.Oi;
        searchField.setTextColor(getThemedColor(i18));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Si));
        searchField.setCursorColor(getThemedColor(i18));
        if (z10) {
            n7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var));
            this.f27381c.setAlpha(1.0f);
            this.f27379b.setAlpha(0.0f);
            this.N0.set(this.f27381c, Float.valueOf(0.0f));
        }
        if (this.f27403t0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        b8Var.h = z11;
        if (z11) {
            n7Var.setVisibility(0);
            n7Var.setTranslationY(0.0f);
        } else {
            n7Var.setVisibility(8);
            n7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        b8Var.l();
        this.f27381c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f27402s0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f27381c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f27381c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f27402s0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(MessagesController.getInstance(this.currentAccount), dialogId);
                if (l10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(l10.user_id))) != null) {
                    this.f27381c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f27381c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f27381c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f27381c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f27381c.setTitle(chat.title);
                }
            }
        }
        if (r0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            f2.h0 h0Var = new f2.h0(new o7(this));
            this.D = h0Var;
            h0Var.d(n7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        i7 i7Var3 = this.A;
        int i19 = 52;
        if (!r0() && !this.f27405v0) {
            i9 = 52;
        } else {
            i9 = 0;
        }
        viewGroup2.addView(i7Var3, g7.e6.e(-1, i9 + 179, 83));
        this.containerView.addView(this.f27384e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        if (!r0() && !this.f27405v0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i10 + 179);
        ((FrameLayout.LayoutParams) this.f27384e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((r0() || this.f27405v0) ? 0 : 0));
        this.containerView.addView(this.d, g7.e6.c(3.0f, -1));
        this.containerView.addView(this.f27381c);
        i7 i7Var4 = new i7(this, activity, 1);
        this.f27385e0 = i7Var4;
        i7Var4.setAlpha(0.0f);
        i7Var4.setVisibility(4);
        getContainer().addView(i7Var4);
        o9 o9Var = new o9(activity);
        this.f27387f0 = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        o9Var.setScaleX(0.9f);
        o9Var.setScaleY(0.9f);
        i7Var4.addView(o9Var, g7.e6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        I0(false);
        G0();
        if (this.h && b8Var.h() == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        D0();
    }

    public static void A(c8 c8Var, int i9, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i10 = 0;
            while (true) {
                if (i10 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i10).f22401id == i9) {
                        message = messages_messages.messages.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    message = null;
                    break;
                }
            }
            if (message != null) {
                c8Var.u0(new MessageObject(c8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new f7(c8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 2));
        }
    }

    public static void C(c8 c8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && c8Var.C0 != null) {
            c8Var.u0(playingMessageObject, false, new bg.d2(29), false);
            c8Var.x0(false);
            org.telegram.messenger.l0.p(R.string.AudioSaveToMyProfileUnsaved, new oc((FrameLayout) c8Var.containerView, b6Var), R.raw.ic_delete, 36);
        }
    }

    public static void D(c8 c8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && c8Var.C0 != null) {
            c8Var.u0(playingMessageObject, true, new bg.d2(29), false);
            c8Var.x0(true);
            org.telegram.messenger.l0.p(R.string.AudioSaveToMyProfileSaved, new oc((FrameLayout) c8Var.containerView, b6Var), R.raw.saved_messages, 36);
        }
    }

    public static void E(c8 c8Var, float[] fArr) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        int i9 = 0;
        while (true) {
            if (i9 < fArr.length) {
                if (playbackSpeed - 0.1f <= fArr[i9]) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        int i10 = i9 + 1;
        if (i10 >= fArr.length) {
            i10 = 0;
        }
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c8Var.L0 > 300) {
            int i11 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i11 > 2) {
                i11 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i11).apply();
            if (i11 >= 0 && c8Var.containerView != null) {
                org.telegram.ui.wi wiVar = new org.telegram.ui.wi(5, 1, c8Var.getContext(), null, false);
                c8Var.K0 = wiVar;
                wiVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                c8Var.K0.setText(LocaleController.getString(R.string.SpeedHint));
                c8Var.A.addView(c8Var.K0, g7.e6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                c8Var.K0.f(c8Var.R, true);
            }
        }
        c8Var.L0 = currentTimeMillis;
    }

    public static void F(c8 c8Var) {
        new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void G(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void H(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void I(c8 c8Var, View view) {
        m7 m7Var = c8Var.M;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        x60 G = x60.G(c8Var.container, c8Var.resourcesProvider, view, true);
        x60 o02 = c8Var.o0(G, playingMessageObject);
        if (!c8Var.r0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new fh.k3(G, o02, 6), !c8Var.f27405v0);
            if (!c8Var.f27405v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new a7(c8Var, G, 0), !c8Var.f27405v0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new a7(c8Var, G, 1), !c8Var.f27405v0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new a7(c8Var, G, 2), z10);
        if (c8Var.N) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.f34555e, G.d, false, false);
            G.d(g1Var);
            c8Var.L = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            c8Var.L.setOnClickListener(new s2(4, c8Var, G));
            AndroidUtilities.removeFromParent(m7Var);
            c8Var.L.addView(m7Var, 0, g7.e6.c(-1.0f, -1));
            c8Var.C0();
        }
        G.m(c8Var.r0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new a7(c8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void J(c8 c8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(c8Var.currentAccount).getInputPeer(UserConfig.getInstance(c8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.rc(11, c8Var, c2Var));
    }

    public static void K(c8 c8Var, MessageObject messageObject, x60 x60Var) {
        ArrayList<MessageObject> k10;
        String formatString;
        int i9;
        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
        int i10 = UserConfig.selectedAccount;
        int i11 = c8Var.currentAccount;
        if (i10 != i11) {
            c8Var.C0.K0(i11);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                k10 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i9 = 36;
            x60Var.u();
            org.telegram.messenger.l0.p(R.string.AudioSaveToSavedMessagesSaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i9);
        }
        k10 = org.telegram.messenger.l0.k(messageObject);
        if (k10 != null) {
            SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(k10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(c8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, c8Var.f27402s0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            oc a02 = oc.a0(R);
            int i12 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(c8Var.currentAccount).getClientUserId()) {
                formatString = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                formatString = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId));
            } else {
                formatString = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i9 = 36;
            a02.Q(i12, 36, formatString).j();
            x60Var.u();
            org.telegram.messenger.l0.p(R.string.AudioSaveToSavedMessagesSaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i9);
        }
        i9 = 36;
        x60Var.u();
        org.telegram.messenger.l0.p(R.string.AudioSaveToSavedMessagesSaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.saved_messages, i9);
    }

    public static void O(c8 c8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = c8Var.d;
        r7 r7Var = c8Var.f27381c;
        n7 n7Var = c8Var.f27394n;
        if (n7Var.getChildCount() <= 0) {
            int paddingTop = n7Var.getPaddingTop();
            c8Var.f27407w0 = paddingTop;
            n7Var.setTopGlowOffset(paddingTop);
            c8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = n7Var.getChildAt(0);
        ik0 ik0Var = (ik0) n7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.x) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int dp = AndroidUtilities.dp(7.0f);
        if (bottom < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            bottom = dp;
        }
        if (bottom <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 1.0f;
        if ((z10 && r7Var.getTag() == null) || (!z10 && r7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            r7Var.setTag(num);
            AnimatorSet animatorSet = c8Var.f27411y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                c8Var.f27411y0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            c8Var.f27411y0 = animatorSet2;
            float f14 = 0.0f;
            if (c8Var.f27398q0) {
                org.telegram.ui.Cells.c2 c2Var = c8Var.N0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, c2Var, f11);
                View view2 = c8Var.f27379b;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, f12);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property, f14));
            } else {
                Property property2 = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r7Var, property2, f10);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            c8Var.f27411y0.setDuration(320L);
            c8Var.f27411y0.setInterpolator(gr.h);
            c8Var.f27411y0.addListener(new p7(c8Var, 2));
            c8Var.f27411y0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
        int D = org.telegram.messenger.ll.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (c8Var.f27407w0 != D) {
            c8Var.f27407w0 = D;
            n7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            c8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (c8Var.backgroundPaddingTop + ((int) (n7Var.getTranslationY() + ((c8Var.f27407w0 - c8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - c8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        if (f13 <= 0.5f && i0.a.f(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != c8Var.I0) {
            c8Var.I0 = z11;
            AndroidUtilities.setLightStatusBar(c8Var, z11);
        }
    }

    public static int g0(c8 c8Var) {
        return c8Var.currentAccount;
    }

    public static int h0(c8 c8Var) {
        return c8Var.backgroundPaddingTop;
    }

    public static int i0(c8 c8Var) {
        return c8Var.backgroundPaddingTop;
    }

    public static void m(c8 c8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = c8Var.f27402s0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (c8Var.f27402s0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                c8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, c8Var.f27402s0);
        }
    }

    public static void n(c8 c8Var) {
        new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void o(c8 c8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f22408id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f22392id = document.f22386id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = c8Var.f27402s0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            c8Var.f27403t0.clear();
            c8Var.f27403t0.addAll(c8Var.f27402s0.list);
            c8Var.f27401s.l();
            ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void p(c8 c8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = c8Var.C0;
        int i9 = UserConfig.selectedAccount;
        int i10 = c8Var.currentAccount;
        if (i9 != i10) {
            launchActivity.K0(i10);
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
        launchActivity.q0(new org.telegram.ui.qn(bundle), false, false);
        c8Var.dismiss();
    }

    public static void q(c8 c8Var, x60 x60Var) {
        c8Var.x0(true);
        new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        x60Var.u();
    }

    public static ImageLocation q0(MessageObject messageObject) {
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

    public static void r(c8 c8Var, int i9, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i10 = 0;
            while (true) {
                if (i10 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i10).f22401id == i9) {
                        message = messages_messages.messages.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    message = null;
                    break;
                }
            }
            if (message != null) {
                c8Var.u0(new MessageObject(c8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new f7(c8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 3));
        }
    }

    public static void s(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void t(c8 c8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.dy dyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i9) {
        String formatPluralStringComma;
        long j10;
        int i10;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(c8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i11 = aa.d.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i11.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i11.putLong("user_id", j11);
            } else {
                i11.putLong("chat_id", -j11);
            }
            org.telegram.ui.qn qnVar = new org.telegram.ui.qn(i11);
            if (topicKey.topicId != 0) {
                vf.c.a(qnVar, topicKey);
            }
            if (c8Var.C0.q0(qnVar, true, false)) {
                qnVar.Ab(arrayList3);
                if (topicKey.topicId != 0) {
                    dyVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            dyVar.finishFragment();
            return;
        }
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i10 = i12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i10 = i12;
                SendMessagesHelper.getInstance(c8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i9, 0, 0, c8Var.f27402s0, null, false, false));
            }
            i12 = i10 + 1;
            arrayList3 = arrayList;
        }
        dyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            oc a02 = oc.a0(R);
            int i13 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(c8Var.currentAccount).getClientUserId()) {
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

    public static void u(c8 c8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && c8Var.f27402s0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f22386id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f22408id = tL_inputDocument;
                tL_inputDocument.f22392id = document.f22386id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = c8Var.f27402s0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                c8Var.f27403t0.clear();
                c8Var.f27403t0.addAll(c8Var.f27402s0.list);
                c8Var.f27401s.l();
                ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c8Var.getContext(), 3, null);
            c2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(c8Var.currentAccount).uploadFile(file.getAbsolutePath(), new fh.i(c8Var, c2Var, document, 7));
            }
        }
    }

    public static void v(c8 c8Var, MessageObject messageObject, x60 x60Var) {
        c8Var.f27402s0.remove(messageObject);
        c8Var.f27403t0.remove(messageObject);
        c8Var.f27401s.l();
        x60Var.u();
        c8Var.x0(false);
        org.telegram.messenger.l0.p(R.string.AudioSaveToMyProfileUnsaved, new oc((FrameLayout) c8Var.containerView, c8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(c8 c8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.j2.s((FrameLayout) c8Var.containerView, c8Var.resourcesProvider, tL_error, false);
    }

    public static void x(c8 c8Var) {
        org.telegram.ui.ActionBar.b6 b6Var = c8Var.resourcesProvider;
        new oc((FrameLayout) c8Var.containerView, b6Var).o(nc.B, b6Var).j();
    }

    public static void y(c8 c8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22474id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(c8Var) {
                        public final c8 f27665b;

                        {
                            this.f27665b = c8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    c8.r(this.f27665b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    c8.A(this.f27665b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(c8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f22418id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(c8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(c8Var) {
                    public final c8 f27665b;

                    {
                        this.f27665b = c8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                c8.r(this.f27665b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                c8.A(this.f27665b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new c7(c8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new m2(c8Var, j10, z11, document, runnable));
    }

    public static void z(c8 c8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(c8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(c8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f22386id == j10) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(c8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(c8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public final void A0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        int i9;
        boolean z10 = true;
        x60 G = x60.G(this.container, this.resourcesProvider, xVar, true);
        if (r0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new z6(this, G, messageObject, 0), !this.f27405v0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new z6(this, G, messageObject, 1), !this.f27405v0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new z6(this, messageObject, G, 2), true);
        } else {
            x60 o02 = o0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new fh.k3(G, o02, 5), !this.f27405v0);
            if (!this.f27405v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new z6(this, G, messageObject, 3), !this.f27405v0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new z6(this, G, messageObject, 4), !this.f27405v0);
            if (messageObject.getId() <= 0) {
                z10 = false;
            }
            G.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new w6(this, messageObject, 1), z10);
        }
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        G.V(i9);
        G.Z();
    }

    public final void B0() {
        if (this.D0 == 1) {
            this.G0 = System.currentTimeMillis();
            this.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            m.i3 i3Var = this.J0;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var);
        }
    }

    public final void C0() {
        boolean z10;
        float f10;
        int themedColor;
        int i9;
        float f11 = 1.0f;
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        if (w0Var != null) {
            if (Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f) {
                i9 = org.telegram.ui.ActionBar.f6.f23352x7;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Qh;
            }
            int themedColor2 = getThemedColor(i9);
            vc vcVar = this.S;
            if (vcVar != null) {
                ((i6) vcVar.f33344c).r(themedColor2);
                Paint paint = (Paint) vcVar.f33343b;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.L;
        if (g1Var != null) {
            m7 m7Var = this.M;
            if (m7Var != null && m7Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.E8);
            final int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.f6.F8);
            int i10 = org.telegram.ui.ActionBar.f6.Oh;
            final int themedColor5 = getThemedColor(i10);
            ValueAnimator valueAnimator = g1Var.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (g1Var.F) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            g1Var.E = ofFloat;
            g1Var.F = z10;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    g1 g1Var2 = g1.this;
                    g1Var2.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i11 = themedColor3;
                    int i12 = themedColor5;
                    g1Var2.setTextColor(i0.a.d(floatValue, i11, i12));
                    g1Var2.setIconColor(i0.a.d(floatValue, themedColor4, i12));
                }
            });
            g1Var.E.addListener(new org.telegram.ui.ActionBar.f1(g1Var, z10, themedColor3, themedColor5, themedColor4));
            g1Var.E.setInterpolator(gr.h);
            g1Var.E.start();
            org.telegram.ui.ActionBar.g1 g1Var2 = this.L;
            if (m7Var != null && m7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i10));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6);
            }
            g1Var2.setSelectorColor(themedColor);
        }
    }

    public final void D0() {
        int i9;
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.A.getVisibility() == 0) {
            i9 = AndroidUtilities.dp(150.0f);
        } else {
            i9 = -AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - i9) / 2);
    }

    public final void E0(boolean z10) {
        if (this.R != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            this.S.l(playbackSpeed, z10);
            this.T.d(playbackSpeed, z10);
            C0();
            boolean z11 = this.U;
            int i9 = 0;
            this.U = false;
            while (true) {
                org.telegram.ui.ActionBar.g1[] g1VarArr = this.V;
                if (i9 < g1VarArr.length) {
                    if (!z11 && Math.abs(playbackSpeed - Q0[i9]) < 0.05f) {
                        org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i9];
                        int i10 = org.telegram.ui.ActionBar.f6.Qh;
                        g1Var.c(getThemedColor(i10), getThemedColor(i10));
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i9];
                        int i11 = org.telegram.ui.ActionBar.f6.E8;
                        g1Var2.c(getThemedColor(i11), getThemedColor(i11));
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void F0(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.F0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void G0() {
        int i9 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.X;
        if (i9 != 0 && i9 != 1) {
            if (i9 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.f6.Xi;
                w0Var.setTag(Integer.valueOf(i10));
                w0Var.setIconColor(getThemedColor(i10));
                org.telegram.ui.ActionBar.f6.B1(w0Var.getBackground(), getThemedColor(i10) & 436207615, true);
                w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOne));
                return;
            }
            return;
        }
        if (SharedConfig.shuffleMusic) {
            if (i9 == 0) {
                w0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                w0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (SharedConfig.playOrderReversed) {
            if (i9 == 0) {
                w0Var.setIcon(R.drawable.player_new_order);
            } else {
                w0Var.setIcon(R.drawable.player_new_repeat_reverse);
            }
        } else {
            w0Var.setIcon(R.drawable.player_new_repeatall);
        }
        if (i9 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i11 = org.telegram.ui.ActionBar.f6.Wi;
            w0Var.setTag(Integer.valueOf(i11));
            w0Var.setIconColor(getThemedColor(i11));
            org.telegram.ui.ActionBar.f6.B1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.f6.Xi;
        w0Var.setTag(Integer.valueOf(i12));
        w0Var.setIconColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.f6.B1(w0Var.getBackground(), 436207615 & getThemedColor(i12), true);
        if (i9 == 0) {
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

    public final void H0() {
        boolean z10;
        w0(this.f27378a0, SharedConfig.shuffleMusic);
        w0(this.f27380b0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0(this.Z, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        w0(this.Y, z11);
    }

    public final void I0(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.I0(boolean):void");
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.x xVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.x xVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i11 = NotificationCenter.messagePlayingDidStart;
        n7 n7Var = this.f27394n;
        int i12 = 0;
        if (i9 != i11 && i9 != NotificationCenter.messagePlayingPlayStateChanged && i9 != NotificationCenter.messagePlayingDidReset) {
            if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject2 != null && playingMessageObject2.isMusic()) {
                    F0(playingMessageObject2, false);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.messagePlayingSpeedChanged) {
                E0(true);
                return;
            } else {
                int i13 = NotificationCenter.musicDidLoad;
                b8 b8Var = this.f27401s;
                if (i9 == i13) {
                    this.f27402s0 = MediaController.getInstance().currentSavedMusicList;
                    this.f27403t0 = MediaController.getInstance().getPlaylist();
                    b8Var.l();
                    return;
                } else if (i9 == NotificationCenter.moreMusicDidLoad) {
                    this.f27402s0 = MediaController.getInstance().currentSavedMusicList;
                    this.f27403t0 = MediaController.getInstance().getPlaylist();
                    b8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        n7Var.B0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        f2.m0 m0Var = this.f27399r;
                        m0Var.L0();
                        int N0 = m0Var.N0();
                        if (N0 != -1) {
                            View m10 = m0Var.m(N0);
                            if (m10 != null) {
                                i12 = m10.getTop();
                            }
                            m0Var.h1(N0 + intValue, i12);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i9 == NotificationCenter.fileLoaded) {
                    if (((String) objArr[0]).equals(this.f27409x0)) {
                        I0(false);
                        this.m0 = true;
                        return;
                    }
                    return;
                } else if (i9 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.f27409x0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.m0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f27393l0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f10 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.f27409x0);
                                }
                                this.f27393l0 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            o1.j jVar = this.f27392k0;
                            jVar.f18800u.f18807i = f10 * 1000.0f;
                            jVar.f();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i9 == NotificationCenter.musicIdsLoaded) {
                    I0(false);
                    return;
                } else {
                    return;
                }
            }
        }
        int i14 = NotificationCenter.messagePlayingDidReset;
        if (i9 == i14 && ((Boolean) objArr[1]).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        I0(z10);
        if (i9 != i14 && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (((MessageObject) objArr[0]).eventId == 0) {
                int childCount = n7Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = n7Var.getChildAt(i15);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = n7Var.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = n7Var.getChildAt(i16);
                if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    xVar.b(false, true);
                }
            }
            if (i9 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    B0();
                } else if (this.D0 == 1 && this.E0 != -1.0f) {
                    m.i3 i3Var = this.J0;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    this.H0 = 0L;
                    i3Var.run();
                    this.E0 = -1.0f;
                }
            }
        }
        org.telegram.ui.nr nrVar = this.K;
        if (nrVar != null) {
            nrVar.a(d1.f.t());
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
        if (P0 == this) {
            P0 = null;
        }
    }

    @Override
    public final int getContainerViewHeight() {
        i7 i7Var = this.A;
        if (i7Var == null) {
            return 0;
        }
        if (this.f27403t0.size() <= 1) {
            return i7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f27394n.getTranslationY() + ((this.f27407w0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
        }
        return this.container.getMeasuredHeight() - (translationY + AndroidUtilities.statusBarHeight);
    }

    @Override
    public final int getObserverTag() {
        return this.B0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 0);
        int i9 = org.telegram.ui.ActionBar.f6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27381c, 64, null, null, null, s6Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27381c, 128, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27381c, 1024, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27381c, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27381c, 134217728, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27381c, 67108864, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23099ie));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23116je));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23309uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23323vc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23115jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23098id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.f6.f23072h5));
        int i11 = org.telegram.ui.ActionBar.f6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 2048, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.f23335w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 262152, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.f6.f23352x7));
        int i14 = org.telegram.ui.ActionBar.f6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Xi));
        int i15 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i15));
        int i16 = org.telegram.ui.ActionBar.f6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i16));
        int i17 = org.telegram.ui.ActionBar.f6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i17));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 0, null, null, null, s6Var, i17));
        k7 k7Var = this.G;
        arrayList.add(new org.telegram.ui.ActionBar.h6(k7Var, (Class[]) null, new mi0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(k7Var, (Class[]) null, new mi0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(k7Var, (Class[]) null, new mi0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 131080, null, null, null, null, i15));
        ImageView imageView = this.f27382c0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 131080, null, null, null, null, i15));
        l7 l7Var = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.h6(l7Var, (Class[]) null, new mi0[]{l7Var.getAnimatedDrawable()}, "Triangle 3", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(l7Var, (Class[]) null, new mi0[]{l7Var.getAnimatedDrawable()}, "Triangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(l7Var, (Class[]) null, new mi0[]{l7Var.getAnimatedDrawable()}, "Rectangle 4", i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 131080, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27384e, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27406w, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.W5));
        int i18 = org.telegram.ui.ActionBar.f6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27408x, 8, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27410y, 8, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 4096, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27394n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.W, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4, null, null, null, null, i10));
        t7 t7Var = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var.getTextView(), 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var.getNextTextView(), 4, null, null, null, null, i9));
        t7 t7Var2 = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var2.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(t7Var2.getNextTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        return arrayList;
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        int i9;
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
            i9 = drawable.getBounds().top;
        } else {
            i9 = 0;
        }
        if (f11 >= top + i9 && f10 >= this.containerView.getLeft() && f10 <= this.containerView.getRight()) {
            return false;
        }
        return true;
    }

    public final x60 o0(x60 x60Var, MessageObject messageObject) {
        long j10;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j10 = document.f22386id;
        } else {
            j10 = 0;
        }
        x60 J = x60Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.kt0(x60Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new z6(this, messageObject, x60Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new z6(this, messageObject, x60Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new z6(this, messageObject, x60Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    @Override
    public final void onBackPressed() {
        r7 r7Var = this.f27381c;
        if (r7Var != null && r7Var.f23577j0) {
            r7Var.h(true);
        } else if (this.f27385e0.getTag() != null) {
            z0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        i7 i7Var = this.f27385e0;
        if (view != i7Var) {
            return false;
        }
        i7Var.layout(0, 0, i7Var.getMeasuredWidth(), i7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i9, int i10) {
        i7 i7Var = this.f27385e0;
        if (view == i7Var) {
            i7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.O.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    public final void p0(MessageObject messageObject) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i9 = UserConfig.selectedAccount;
        int i10 = this.currentAccount;
        LaunchActivity launchActivity = this.C0;
        if (i9 != i10) {
            launchActivity.K0(i10);
        }
        Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
        e10.putBoolean("canSelectTopics", true);
        org.telegram.ui.dy dyVar = new org.telegram.ui.dy(e10);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            k10 = null;
        } else {
            k10 = org.telegram.messenger.l0.k(messageObject);
            tL_document = null;
        }
        dyVar.f37752y2 = new a1.d(this, k10, tL_document, messageObject, 8);
        launchActivity.p0(dyVar);
        dismiss();
    }

    public final boolean r0() {
        MessagesController.SavedMusicList savedMusicList = this.f27402s0;
        if (savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return false;
    }

    public final void s0(int i9) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && (launchActivity = this.C0) != null) {
            if (i9 == 1) {
                p0(playingMessageObject);
            } else if (i9 == 2) {
                y0(playingMessageObject);
            } else if (i9 == 4) {
                int i10 = UserConfig.selectedAccount;
                int i11 = this.currentAccount;
                if (i10 != i11) {
                    launchActivity.K0(i11);
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
                launchActivity.q0(new org.telegram.ui.qn(bundle), false, false);
                dismiss();
            } else if (i9 == 5) {
                t0(playingMessageObject);
            } else if (i9 == 6) {
                we.b.C().M(MediaController.getInstance().getCurrentChromecastMedia());
                this.M.performClick();
            } else if (i9 == 7) {
                u0(playingMessageObject, false, new w6(this, playingMessageObject, 0), false);
            } else if (i9 == 8) {
                kh.s7 s7Var = new kh.s7(getContext(), true, null, new y6(this, 0), null);
                s7Var.f16036d0 = true;
                s7Var.V = false;
                s7Var.m0.N(true);
                s7Var.show();
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        P0 = this;
    }

    public final void t0(MessageObject messageObject) {
        String str;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23 && (i9 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
            LaunchActivity launchActivity = this.C0;
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
        if (str3 != null && str3.length() > 0 && !e2.c.w(str3)) {
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
        MediaController.saveFile(str4, this.C0, 3, str2, str5, new y6(this, 1));
    }

    public final void u0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j10 = document.f22386id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f22408id = tL_inputDocument;
        tL_inputDocument.f22392id = j10;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new b7(this, z11, messageObject, z10, runnable, j10, document));
    }

    public final boolean v0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.v0(boolean):boolean");
    }

    public final void w0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i9 = org.telegram.ui.ActionBar.f6.Xi;
            g1Var.setTextColor(getThemedColor(i9));
            g1Var.setIconColor(getThemedColor(i9));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        g1Var.setTextColor(getThemedColor(i10));
        g1Var.setIconColor(getThemedColor(i10));
    }

    public final void x0(final boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean r02 = r0();
        kh.d dVar = this.C;
        kh.d dVar2 = this.B;
        if (!r02 && !this.f27405v0) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z10) {
                f12 = 0.8f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final c8 f34546b;

                {
                    this.f34546b = this;
                }

                @Override
                public final void run() {
                    int i9;
                    int i10;
                    switch (r3) {
                        case 0:
                            kh.d dVar3 = this.f34546b.B;
                            if (z10) {
                                i9 = 8;
                            } else {
                                i9 = 0;
                            }
                            dVar3.setVisibility(i9);
                            return;
                        default:
                            kh.d dVar4 = this.f34546b.C;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            dVar4.setVisibility(i10);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = dVar.animate();
            if (z10) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f14);
            if (!z10) {
                f13 = 0.8f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
            if (!z10) {
                f15 = 0.8f;
            }
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final c8 f34546b;

                {
                    this.f34546b = this;
                }

                @Override
                public final void run() {
                    int i9;
                    int i10;
                    switch (r3) {
                        case 0:
                            kh.d dVar3 = this.f34546b.B;
                            if (z10) {
                                i9 = 8;
                            } else {
                                i9 = 0;
                            }
                            dVar3.setVisibility(i9);
                            return;
                        default:
                            kh.d dVar4 = this.f34546b.C;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            dVar4.setVisibility(i10);
                            return;
                    }
                }
            }).start();
            return;
        }
        dVar2.setVisibility(8);
        dVar.setVisibility(8);
    }

    public final void y0(org.telegram.messenger.MessageObject r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c8.y0(org.telegram.messenger.MessageObject):void");
    }

    public final void z0(boolean z10, boolean z11) {
        o9 o9Var = this.f27387f0;
        i7 i7Var = this.f27385e0;
        if (z10) {
            if (i7Var.getVisibility() != 0 && !this.f27390i0) {
                i7Var.setTag(1);
                s7 s7Var = this.E;
                o9Var.setImageBitmap(s7Var.f34593a[s7Var.f34594b].getImageReceiver().getBitmap());
                this.f27390i0 = true;
                ll0.d(new u6(this, 1));
                i7Var.setVisibility(0);
                i7Var.animate().alpha(1.0f).setDuration(180L).setListener(new p7(this, 0)).start();
                o9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (i7Var.getVisibility() != 0) {
        } else {
            i7Var.setTag(null);
            if (z11) {
                this.f27390i0 = true;
                i7Var.animate().alpha(0.0f).setDuration(180L).setListener(new p7(this, 1)).start();
                o9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            i7Var.setAlpha(0.0f);
            i7Var.setVisibility(4);
            o9Var.setImageBitmap(null);
            o9Var.setScaleX(0.9f);
            o9Var.setScaleY(0.9f);
        }
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
