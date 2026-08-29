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
public final class g8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static g8 P0;
    public static final float[] Q0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final n7 A;
    public int A0;
    public final nh.d B;
    public final int B0;
    public final nh.d C;
    public final LaunchActivity C0;
    public final f2.e0 D;
    public int D0;
    public final w7 E;
    public float E0;
    public final x7 F;
    public int F0;
    public final p7 G;
    public long G0;
    public final q7 H;
    public long H0;
    public final x7 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.w0 J;
    public final lh.m7 J0;
    public final org.telegram.ui.nr K;
    public org.telegram.ui.zi K0;
    public org.telegram.ui.ActionBar.g1 L;
    public long L0;
    public final r7 M;
    public float M0;
    public final boolean N;
    public final org.telegram.ui.Cells.b2 N0;
    public final i80 O;
    public ValueAnimator O0;
    public final y7 P;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final org.telegram.ui.ActionBar.w0 R;
    public final cf.f S;
    public final org.telegram.ui.ActionBar.c1 T;
    public boolean U;
    public final org.telegram.ui.ActionBar.g1[] V;
    public final TextView W;
    public final org.telegram.ui.ActionBar.w0 X;
    public final org.telegram.ui.ActionBar.g1 Y;
    public final org.telegram.ui.ActionBar.g1 Z;
    public final org.telegram.ui.ActionBar.g1 f28776a0;
    public final View f28777b;
    public final org.telegram.ui.ActionBar.g1 f28778b0;
    public final cg.m1 f28779c;
    public final ImageView f28780c0;
    public final View d;
    public final cg0 f28781d0;
    public final View f28782e;
    public final n7 f28783e0;
    public boolean f28784f;
    public final t9 f28785f0;
    public final org.telegram.ui.ActionBar.w0 f28786g0;
    public boolean h;
    public final org.telegram.ui.ActionBar.w0 f28787h0;
    public boolean f28788i0;
    public final View[] f28789j0;
    public final o1.k f28790k0;
    public long f28791l0;
    public boolean m0;
    public final s7 f28792n;
    public boolean f28793n0;
    public int f28794o0;
    public int f28795p0;
    public final boolean f28796q0;
    public final f2.j0 f28797r;
    public final boolean f28798r0;
    public final f8 f28799s;
    public MessagesController.SavedMusicList f28800s0;
    public ArrayList f28801t0;
    public MessageObject f28802u0;
    public final LinearLayout v;
    public boolean f28803v0;
    public final ImageView f28804w;
    public int f28805w0;
    public final TextView f28806x;
    public String f28807x0;
    public final TextView f28808y;
    public AnimatorSet f28809y0;
    public int f28810z0;

    public g8(Activity activity, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var, true, false);
        boolean z10;
        org.telegram.ui.ActionBar.a0 a0Var;
        float f9;
        boolean z11;
        TLRPC.User user;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[6];
        this.V = g1VarArr;
        View[] viewArr = new View[5];
        this.f28789j0 = viewArr;
        this.f28793n0 = true;
        this.f28794o0 = -1;
        this.f28805w0 = Integer.MAX_VALUE;
        this.E0 = -1.0f;
        this.J0 = new lh.m7(this, 14);
        this.N0 = new org.telegram.ui.Cells.b2(this);
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
        v7 v7Var = new v7(this, activity);
        this.containerView = v7Var;
        v7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        cg.m1 m1Var = new cg.m1(this, activity, c6Var, 1);
        this.f28779c = m1Var;
        m1Var.setBackgroundColor(0);
        m1Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = org.telegram.ui.ActionBar.g6.Oi;
        m1Var.C(getThemedColor(i14), false);
        m1Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.Ni), false);
        m1Var.setTitleColor(getThemedColor(i14));
        m1Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
        m1Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.a0 n10 = m1Var.n();
        n10.setLayoutParams(i7.f6.e(-1, -1, 119));
        View view = new View(activity);
        this.f28777b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
        m1Var.addView(view, 0, i7.f6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        m1Var.setAlpha(0.0f);
        m1Var.setActionBarMenuOnItemClick(new cg.n1(this, 23));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.f28782e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        n7 n7Var = new n7(this, activity, 2);
        this.A = n7Var;
        w7 w7Var = new w7(this, activity);
        this.E = w7Var;
        n7Var.addView(w7Var, i7.f6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        x7 x7Var = new x7(this, activity, activity, 0);
        this.F = x7Var;
        n7Var.addView(x7Var, i7.f6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        x7 x7Var2 = new x7(this, activity, activity, 1);
        this.I = x7Var2;
        n7Var.addView(x7Var2, i7.f6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        y7 y7Var = new y7(this, activity, c6Var);
        this.P = y7Var;
        y7Var.setLineWidth(4);
        y7Var.setDelegate(new m7(this));
        y7Var.setReportChanges(true);
        n7Var.addView(y7Var, i7.f6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new ib.a(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.f19045u = lVar;
        kVar.b(new j7(this, 0));
        this.f28790k0 = kVar;
        i80 i80Var = new i80(activity);
        this.O = i80Var;
        i80Var.setVisibility(4);
        i80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
        i80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
        n7Var.addView(i80Var, i7.f6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.Q = h5Var;
        h5Var.setTextSize(12);
        h5Var.l("0:00", false);
        int i15 = org.telegram.ui.ActionBar.g6.Si;
        h5Var.setTextColor(getThemedColor(i15));
        h5Var.setImportantForAccessibility(2);
        n7Var.addView(h5Var, i7.f6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.W = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i15));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        n7Var.addView(textView, i7.f6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(activity, null, 0, getThemedColor(i15), false, c6Var);
        this.R = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setShowSubmenuByMove(false);
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        w0Var.setDelegate(new y6(this, 0));
        cf.f fVar = new cf.f();
        this.S = fVar;
        w0Var.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), c6Var);
        this.T = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        c1Var.setDrawShadow(true);
        c1Var.setOnValueChange(new z6(this, 0));
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
        n7Var.addView(w0Var, i7.f6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        w0Var.setOnClickListener(new t2(4, this, fArr));
        w0Var.setOnLongClickListener(new lh.e2(2, this, c6Var));
        F0(false);
        n7 n7Var2 = new n7(this, activity, 0);
        n7Var.addView(n7Var2, i7.f6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(activity, null, 0, 0, false, c6Var);
        this.X = w0Var2;
        viewArr[0] = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setShowSubmenuByMove(false);
        w0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i16 = org.telegram.ui.ActionBar.g6.f23152i6;
        w0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        n7Var2.addView(w0Var2, i7.f6.e(48, 48, 51));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f26679b;

            {
                this.f26679b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        g8 g8Var = this.f26679b;
                        g8Var.I0();
                        g8Var.X.M(null, null);
                        return;
                    default:
                        g8.I(this.f26679b, view4);
                        return;
                }
            }
        });
        this.Y = w0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.Z = w0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f28776a0 = w0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        w0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f28778b0 = w0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        w0Var2.setShowedFromBottom(true);
        w0Var2.setDelegate(new y6(this, 1));
        int i17 = org.telegram.ui.ActionBar.g6.Wi;
        int themedColor = getThemedColor(i17);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        p7 p7Var = new p7(this, activity, scaledTouchSlop);
        this.G = p7Var;
        viewArr[1] = p7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        p7Var.setScaleType(scaleType);
        p7Var.f(R.raw.player_prev, 20, 20, null);
        p7Var.h(themedColor, "Triangle 3");
        p7Var.h(themedColor, "Triangle 4");
        p7Var.h(themedColor, "Rectangle 4");
        p7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        n7Var2.addView(p7Var, i7.f6.e(48, 48, 51));
        p7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f28780c0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        cg0 cg0Var = new cg0(28);
        this.f28781d0 = cg0Var;
        imageView.setImageDrawable(cg0Var);
        cg0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(24.0f)));
        n7Var2.addView(imageView, i7.f6.e(48, 48, 51));
        imageView.setOnClickListener(new bg.n(12));
        q7 q7Var = new q7(this, activity, scaledTouchSlop);
        this.H = q7Var;
        viewArr[3] = q7Var;
        q7Var.setScaleType(scaleType);
        q7Var.f(R.raw.player_prev, 20, 20, null);
        q7Var.h(themedColor, "Triangle 3");
        q7Var.h(themedColor, "Triangle 4");
        q7Var.h(themedColor, "Rectangle 4");
        q7Var.setRotation(180.0f);
        q7Var.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        n7Var2.addView(q7Var, i7.f6.e(48, 48, 51));
        q7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(activity, null, 0, themedColor, false, c6Var);
        this.J = w0Var3;
        viewArr[4] = w0Var3;
        org.telegram.ui.nr nrVar = new org.telegram.ui.nr(activity, R.drawable.ic_ab_other, c6Var);
        this.K = nrVar;
        w0Var3.setIcon(nrVar);
        w0Var3.setLongClickEnabled(false);
        w0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f26679b;

            {
                this.f26679b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        g8 g8Var = this.f26679b;
                        g8Var.I0();
                        g8Var.X.M(null, null);
                        return;
                    default:
                        g8.I(this.f26679b, view4);
                        return;
                }
            }
        });
        n7Var2.addView(w0Var3, i7.f6.e(48, 48, 51));
        r7 r7Var = new r7(this, activity, 0);
        this.M = r7Var;
        this.N = true;
        try {
            r7Var.setRouteSelector(p5.a.c(activity).a());
        } catch (Exception e10) {
            FileLog.e(e10);
            this.N = false;
        }
        this.M.setVisibility(4);
        org.telegram.ui.nr nrVar2 = this.K;
        if (nrVar2 != null) {
            nrVar2.a(d1.f.u());
        }
        this.J.setShowedFromBottom(true);
        this.J.setDelegate(new y6(this, 2));
        this.J.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, i7.f6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new mh.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.f28804w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, i7.f6.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f28806x = textView2;
        int i18 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i18));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f28808y = textView3;
        textView3.setTextColor(getThemedColor(i18));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, i7.f6.t(-2, -2, 17, 0, 6, 0, 0));
        s7 s7Var = new s7(this, activity);
        this.f28792n = s7Var;
        s7Var.setClipToPadding(false);
        getContext();
        f2.j0 j0Var = new f2.j0(1, false);
        this.f28797r = j0Var;
        s7Var.setLayoutManager(j0Var);
        s7Var.setHorizontalScrollBarEnabled(false);
        s7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(s7Var, i7.f6.e(-1, -1, 51));
        f8 f8Var = new f8(this, activity);
        this.f28799s = f8Var;
        s7Var.setAdapter(f8Var);
        s7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        s7Var.setOnItemClickListener(new ih.a(2));
        s7Var.setOnItemLongClickListener(new y6(this, 3));
        s7Var.setOnScrollListener(new cg.g2(this, 17));
        nh.d dVar = new nh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.B = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new iq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f30243b;

            {
                this.f30243b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        g8.D(this.f30243b, c6Var);
                        return;
                    default:
                        g8.C(this.f30243b, c6Var);
                        return;
                }
            }
        });
        this.A.addView(dVar, i7.f6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        nh.d dVar2 = new nh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.C = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f30243b;

            {
                this.f30243b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        g8.D(this.f30243b, c6Var);
                        return;
                    default:
                        g8.C(this.f30243b, c6Var);
                        return;
                }
            }
        });
        this.A.addView(dVar2, i7.f6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f28800s0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28796q0 = z10;
        this.f28779c.f23610i0 = z10;
        this.f28798r0 = s0();
        this.f28801t0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            a0Var = n10;
            this.f28786g0 = a0Var.a(8, R.drawable.msg_add);
        } else {
            a0Var = n10;
        }
        org.telegram.ui.ActionBar.w0 a2 = a0Var.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.bb(this, 3);
        this.f28787h0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i19 = org.telegram.ui.ActionBar.g6.Oi;
        searchField.setTextColor(getThemedColor(i19));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
        searchField.setCursorColor(getThemedColor(i19));
        if (z10) {
            s7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var));
            this.f28779c.setAlpha(1.0f);
            f9 = 0.0f;
            this.f28777b.setAlpha(0.0f);
            this.N0.set(this.f28779c, Float.valueOf(0.0f));
        } else {
            f9 = 0.0f;
        }
        if (this.f28801t0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        f8Var.h = z11;
        if (z11) {
            s7Var.setVisibility(0);
            s7Var.setTranslationY(f9);
        } else {
            s7Var.setVisibility(8);
            s7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        f8Var.l();
        this.f28779c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f28800s0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f28779c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f28779c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f28800s0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(MessagesController.getInstance(this.currentAccount), dialogId);
                if (p10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(p10.user_id))) != null) {
                    this.f28779c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f28779c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f28779c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f28779c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f28779c.setTitle(chat.title);
                }
            }
        }
        if (s0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            f2.e0 e0Var = new f2.e0(new t7(this));
            this.D = e0Var;
            e0Var.d(s7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        n7 n7Var3 = this.A;
        int i20 = 52;
        if (!s0() && !this.f28803v0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(n7Var3, i7.f6.e(-1, i10 + 179, 83));
        this.containerView.addView(this.f28782e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        if (!s0() && !this.f28803v0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        ((FrameLayout.LayoutParams) this.f28782e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.f28803v0) ? 0 : 0));
        this.containerView.addView(this.d, i7.f6.c(3.0f, -1));
        this.containerView.addView(this.f28779c);
        n7 n7Var4 = new n7(this, activity, 1);
        this.f28783e0 = n7Var4;
        n7Var4.setAlpha(f9);
        n7Var4.setVisibility(4);
        getContainer().addView(n7Var4);
        t9 t9Var = new t9(activity);
        this.f28785f0 = t9Var;
        t9Var.setAspectFit(true);
        t9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        t9Var.setScaleX(0.9f);
        t9Var.setScaleY(0.9f);
        n7Var4.addView(t9Var, i7.f6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        if (this.h && f8Var.h() == 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        E0();
    }

    public static void A(g8 g8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(g8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(g8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f22398id == j10) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(g8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(g8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void B(g8 g8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f22413id == i10) {
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
                g8Var.v0(new MessageObject(g8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new k7(g8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 2));
        }
    }

    public static void C(g8 g8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && g8Var.C0 != null) {
            g8Var.v0(playingMessageObject, false, new g5(1), false);
            g8Var.y0(false);
            j7.l1.v(R.string.AudioSaveToMyProfileUnsaved, new tc((FrameLayout) g8Var.containerView, c6Var), R.raw.ic_delete, 36);
        }
    }

    public static void D(g8 g8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && g8Var.C0 != null) {
            g8Var.v0(playingMessageObject, true, new g5(1), false);
            g8Var.y0(true);
            j7.l1.v(R.string.AudioSaveToMyProfileSaved, new tc((FrameLayout) g8Var.containerView, c6Var), R.raw.saved_messages, 36);
        }
    }

    public static void E(g8 g8Var, float[] fArr) {
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
        if (currentTimeMillis - g8Var.L0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && g8Var.containerView != null) {
                org.telegram.ui.zi ziVar = new org.telegram.ui.zi(5, 1, g8Var.getContext(), null, false);
                g8Var.K0 = ziVar;
                ziVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                g8Var.K0.setText(LocaleController.getString(R.string.SpeedHint));
                g8Var.A.addView(g8Var.K0, i7.f6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                g8Var.K0.f(g8Var.R, true);
            }
        }
        g8Var.L0 = currentTimeMillis;
    }

    public static void F(g8 g8Var) {
        new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void G(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void H(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void I(g8 g8Var, View view) {
        r7 r7Var = g8Var.M;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        j70 G = j70.G(g8Var.container, g8Var.resourcesProvider, view, true);
        j70 p02 = g8Var.p0(G, playingMessageObject);
        if (!g8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ih.z2(G, p02, 5), !g8Var.f28803v0);
            if (!g8Var.f28803v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new f7(g8Var, G, 0), !g8Var.f28803v0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new f7(g8Var, G, 1), !g8Var.f28803v0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new f7(g8Var, G, 2), z10);
        if (g8Var.N) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, G.f29575e, G.d, false, false);
            G.d(g1Var);
            g8Var.L = g1Var;
            g1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            g8Var.L.setOnClickListener(new t2(5, g8Var, G));
            AndroidUtilities.removeFromParent(r7Var);
            g8Var.L.addView(r7Var, 0, i7.f6.c(-1.0f, -1));
            g8Var.D0();
        }
        G.m(g8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new f7(g8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void J(g8 g8Var, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            c2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(g8Var.currentAccount).getInputPeer(UserConfig.getInstance(g8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.zg(7, g8Var, c2Var));
    }

    public static void K(g8 g8Var, MessageObject messageObject, j70 j70Var) {
        ArrayList<MessageObject> n10;
        String formatString;
        int i10;
        long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = g8Var.currentAccount;
        if (i11 != i12) {
            g8Var.C0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                n10 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            j70Var.u();
            j7.l1.v(R.string.AudioSaveToSavedMessagesSaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        n10 = org.telegram.messenger.x3.n(messageObject);
        if (n10 != null) {
            SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(n10, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(g8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, g8Var.f28800s0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            tc a02 = tc.a0(R);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(g8Var.currentAccount).getClientUserId()) {
                formatString = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (clientUserId > 0) {
                formatString = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId));
            } else {
                formatString = LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i10 = 36;
            a02.Q(i13, 36, formatString).j();
            j70Var.u();
            j7.l1.v(R.string.AudioSaveToSavedMessagesSaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        j70Var.u();
        j7.l1.v(R.string.AudioSaveToSavedMessagesSaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(g8 g8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f9;
        float f10;
        float f11;
        View view = g8Var.d;
        cg.m1 m1Var = g8Var.f28779c;
        s7 s7Var = g8Var.f28792n;
        if (s7Var.getChildCount() <= 0) {
            int paddingTop = s7Var.getPaddingTop();
            g8Var.f28805w0 = paddingTop;
            s7Var.setTopGlowOffset(paddingTop);
            g8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = s7Var.getChildAt(0);
        vk0 vk0Var = (vk0) s7Var.G(childAt);
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
        if ((z10 && m1Var.getTag() == null) || (!z10 && m1Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            m1Var.setTag(num);
            AnimatorSet animatorSet = g8Var.f28809y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                g8Var.f28809y0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            g8Var.f28809y0 = animatorSet2;
            float f13 = 0.0f;
            if (g8Var.f28796q0) {
                org.telegram.ui.Cells.b2 b2Var = g8Var.N0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1Var, b2Var, f10);
                View view2 = g8Var.f28777b;
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
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m1Var, property2, f9);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f13));
            }
            g8Var.f28809y0.setDuration(320L);
            g8Var.f28809y0.setInterpolator(jr.h);
            g8Var.f28809y0.addListener(new u7(g8Var, 2));
            g8Var.f28809y0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s7Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (g8Var.f28805w0 != C) {
            g8Var.f28805w0 = C;
            s7Var.setTopGlowOffset((C - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            g8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (g8Var.backgroundPaddingTop + ((int) (s7Var.getTranslationY() + ((g8Var.f28805w0 - g8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - g8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        if (f12 <= 0.5f && i0.a.f(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != g8Var.I0) {
            g8Var.I0 = z11;
            AndroidUtilities.setLightStatusBar(g8Var, z11);
        }
    }

    public static int h0(g8 g8Var) {
        return g8Var.currentAccount;
    }

    public static int i0(g8 g8Var) {
        return g8Var.backgroundPaddingTop;
    }

    public static int j0(g8 g8Var) {
        return g8Var.backgroundPaddingTop;
    }

    public static void m(g8 g8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = g8Var.f28800s0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (g8Var.f28800s0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                g8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(g8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, g8Var.f28800s0);
        }
    }

    public static void n(g8 g8Var) {
        new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void o(g8 g8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f22420id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f22404id = document.f22398id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = g8Var.f28800s0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            g8Var.f28801t0.clear();
            g8Var.f28801t0.addAll(g8Var.f28800s0.list);
            g8Var.f28799s.l();
            ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void p(g8 g8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = g8Var.C0;
        int i10 = UserConfig.selectedAccount;
        int i11 = g8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(g8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(g8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.tn(bundle), false, false);
        g8Var.dismiss();
    }

    public static void q(g8 g8Var, j70 j70Var) {
        g8Var.y0(true);
        new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        j70Var.u();
    }

    public static void r(g8 g8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f22413id == i10) {
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
                g8Var.v0(new MessageObject(g8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new k7(g8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 3));
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

    public static void s(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void t(g8 g8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.fy fyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String formatPluralStringComma;
        long j10;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(g8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle i12 = a4.w.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                i12.putLong("user_id", j11);
            } else {
                i12.putLong("chat_id", -j11);
            }
            org.telegram.ui.tn tnVar = new org.telegram.ui.tn(i12);
            if (topicKey.topicId != 0) {
                yf.d.a(tnVar, topicKey);
            }
            if (g8Var.C0.q0(tnVar, true, false)) {
                tnVar.Ab(arrayList3);
                if (topicKey.topicId != 0) {
                    fyVar.removeSelfFromStack();
                    return;
                }
                return;
            }
            fyVar.finishFragment();
            return;
        }
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(g8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, g8Var.f28800s0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        fyVar.finishFragment();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null) {
            tc a02 = tc.a0(R);
            int i14 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(g8Var.currentAccount).getClientUserId()) {
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

    public static void u(g8 g8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && g8Var.f28800s0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f22398id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f22420id = tL_inputDocument;
                tL_inputDocument.f22404id = document.f22398id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = g8Var.f28800s0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                g8Var.f28801t0.clear();
                g8Var.f28801t0.addAll(g8Var.f28800s0.list);
                g8Var.f28799s.l();
                ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(g8Var.getContext(), 3, null);
            c2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(g8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ih.i(g8Var, c2Var, document, 7));
            }
        }
    }

    public static void v(g8 g8Var, MessageObject messageObject, j70 j70Var) {
        g8Var.f28800s0.remove(messageObject);
        g8Var.f28801t0.remove(messageObject);
        g8Var.f28799s.l();
        j70Var.u();
        g8Var.y0(false);
        j7.l1.v(R.string.AudioSaveToMyProfileUnsaved, new tc((FrameLayout) g8Var.containerView, g8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(g8 g8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.th.t((FrameLayout) g8Var.containerView, g8Var.resourcesProvider, tL_error, false);
    }

    public static void x(g8 g8Var) {
        org.telegram.ui.ActionBar.c6 c6Var = g8Var.resourcesProvider;
        new tc((FrameLayout) g8Var.containerView, c6Var).o(sc.B, c6Var).j();
    }

    public static void y(g8 g8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22486id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(g8Var) {
                        public final g8 f29332b;

                        {
                            this.f29332b = g8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    g8.r(this.f29332b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    g8.B(this.f29332b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(g8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f22430id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(g8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(g8Var) {
                    public final g8 f29332b;

                    {
                        this.f29332b = g8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                g8.r(this.f29332b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                g8.B(this.f29332b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                        }
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 0));
            return;
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(g8Var, tL_error, 1));
        }
        AndroidUtilities.runOnUIThread(new p2(g8Var, j10, z11, document, runnable));
    }

    public final void A0(boolean z10, boolean z11) {
        t9 t9Var = this.f28785f0;
        n7 n7Var = this.f28783e0;
        if (z10) {
            if (n7Var.getVisibility() != 0 && !this.f28788i0) {
                n7Var.setTag(1);
                w7 w7Var = this.E;
                t9Var.setImageBitmap(w7Var.f27000a[w7Var.f27001b].getImageReceiver().getBitmap());
                this.f28788i0 = true;
                yl0.d(new z6(this, 1));
                n7Var.setVisibility(0);
                n7Var.animate().alpha(1.0f).setDuration(180L).setListener(new u7(this, 0)).start();
                t9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (n7Var.getVisibility() != 0) {
        } else {
            n7Var.setTag(null);
            if (z11) {
                this.f28788i0 = true;
                n7Var.animate().alpha(0.0f).setDuration(180L).setListener(new u7(this, 1)).start();
                t9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            n7Var.setAlpha(0.0f);
            n7Var.setVisibility(4);
            t9Var.setImageBitmap(null);
            t9Var.setScaleX(0.9f);
            t9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        int i10;
        boolean z10 = true;
        j70 G = j70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 0), !this.f28803v0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 1), !this.f28803v0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new e7(this, messageObject, G, 2), true);
        } else {
            j70 p02 = p0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ih.z2(G, p02, 4), !this.f28803v0);
            if (!this.f28803v0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 3), !this.f28803v0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 4), !this.f28803v0);
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

    public final void C0() {
        if (this.D0 == 1) {
            this.G0 = System.currentTimeMillis();
            this.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            lh.m7 m7Var = this.J0;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var);
        }
    }

    public final void D0() {
        boolean z10;
        float f9;
        int themedColor;
        int i10;
        float f10 = 1.0f;
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        if (w0Var != null) {
            if (Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f) {
                i10 = org.telegram.ui.ActionBar.g6.f23419x7;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.Qh;
            }
            int themedColor2 = getThemedColor(i10);
            cf.f fVar = this.S;
            if (fVar != null) {
                ((n6) fVar.f3058b).r(themedColor2);
                Paint paint = (Paint) fVar.f3059c;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.g1 g1Var = this.L;
        if (g1Var != null) {
            r7 r7Var = this.M;
            if (r7Var != null && r7Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.E8);
            final int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.g6.F8);
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            final int themedColor5 = getThemedColor(i11);
            ValueAnimator valueAnimator = g1Var.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (g1Var.F) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
            g1Var.E = ofFloat;
            g1Var.F = z10;
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
            g1Var.E.addListener(new org.telegram.ui.ActionBar.f1(g1Var, z10, themedColor3, themedColor5, themedColor4));
            g1Var.E.setInterpolator(jr.h);
            g1Var.E.start();
            org.telegram.ui.ActionBar.g1 g1Var2 = this.L;
            if (r7Var != null && r7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6);
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
        if (this.A.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(150.0f);
        } else {
            i10 = -AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - i10) / 2);
    }

    public final void F0(boolean z10) {
        if (this.R != null) {
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
            this.S.l(playbackSpeed, z10);
            this.T.d(playbackSpeed, z10);
            D0();
            boolean z11 = this.U;
            int i10 = 0;
            this.U = false;
            while (true) {
                org.telegram.ui.ActionBar.g1[] g1VarArr = this.V;
                if (i10 < g1VarArr.length) {
                    if (!z11 && Math.abs(playbackSpeed - Q0[i10]) < 0.05f) {
                        org.telegram.ui.ActionBar.g1 g1Var = g1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.g6.Qh;
                        g1Var.c(getThemedColor(i11), getThemedColor(i11));
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var2 = g1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.g6.E8;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g8.G0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.w0 w0Var = this.X;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                w0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.g6.Xi;
                w0Var.setTag(Integer.valueOf(i11));
                w0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.g6.B1(w0Var.getBackground(), getThemedColor(i11) & 436207615, true);
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
            int i12 = org.telegram.ui.ActionBar.g6.Wi;
            w0Var.setTag(Integer.valueOf(i12));
            w0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.g6.B1(w0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), true);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.g6.Xi;
        w0Var.setTag(Integer.valueOf(i13));
        w0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.g6.B1(w0Var.getBackground(), 436207615 & getThemedColor(i13), true);
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
        boolean z10;
        x0(this.f28776a0, SharedConfig.shuffleMusic);
        x0(this.f28778b0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        x0(this.Z, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        x0(this.Y, z11);
    }

    public final void J0(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g8.J0(boolean):void");
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
        s7 s7Var = this.f28792n;
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
                f8 f8Var = this.f28799s;
                if (i10 == i14) {
                    this.f28800s0 = MediaController.getInstance().currentSavedMusicList;
                    this.f28801t0 = MediaController.getInstance().getPlaylist();
                    f8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f28800s0 = MediaController.getInstance().currentSavedMusicList;
                    this.f28801t0 = MediaController.getInstance().getPlaylist();
                    f8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        s7Var.B0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        f2.j0 j0Var = this.f28797r;
                        j0Var.L0();
                        int N0 = j0Var.N0();
                        if (N0 != -1) {
                            View m10 = j0Var.m(N0);
                            if (m10 != null) {
                                i13 = m10.getTop();
                            }
                            j0Var.h1(N0 + intValue, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoaded) {
                    if (((String) objArr[0]).equals(this.f28807x0)) {
                        J0(false);
                        this.m0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.f28807x0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f9 = 1.0f;
                        if (!this.m0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f28791l0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f9 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.f28807x0);
                                }
                                this.f28791l0 = elapsedRealtime;
                            } else {
                                f9 = -1.0f;
                            }
                        }
                        if (f9 != -1.0f) {
                            o1.k kVar = this.f28790k0;
                            kVar.f19045u.f19052i = f9 * 1000.0f;
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
                int childCount = s7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = s7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = s7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = s7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    xVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    C0();
                } else if (this.D0 == 1 && this.E0 != -1.0f) {
                    lh.m7 m7Var = this.J0;
                    AndroidUtilities.cancelRunOnUIThread(m7Var);
                    this.H0 = 0L;
                    m7Var.run();
                    this.E0 = -1.0f;
                }
            }
        }
        org.telegram.ui.nr nrVar = this.K;
        if (nrVar != null) {
            nrVar.a(d1.f.u());
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
        n7 n7Var = this.A;
        if (n7Var == null) {
            return 0;
        }
        if (this.f28801t0.size() <= 1) {
            return n7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f28792n.getTranslationY() + ((this.f28805w0 - this.backgroundPaddingTop) - dp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / dp2));
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
        x6 x6Var = new x6(this, 0);
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28779c, 64, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28779c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28779c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28779c, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28779c, 134217728, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28779c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23160ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23178je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23371uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23389vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23177jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23159id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.g6.f23133h5));
        int i12 = org.telegram.ui.ActionBar.g6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23402w7;
        org.telegram.ui.ActionBar.w0 w0Var = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.g6.f23419x7));
        int i15 = org.telegram.ui.ActionBar.g6.Wi;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Xi));
        int i16 = org.telegram.ui.ActionBar.g6.f23152i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i16));
        int i17 = org.telegram.ui.ActionBar.g6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i18));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 0, null, null, null, x6Var, i18));
        p7 p7Var = this.G;
        arrayList.add(new org.telegram.ui.ActionBar.i6(p7Var, (Class[]) null, new xi0[]{p7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(p7Var, (Class[]) null, new xi0[]{p7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(p7Var, (Class[]) null, new xi0[]{p7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 131080, null, null, null, null, i16));
        ImageView imageView = this.f28780c0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 131080, null, null, null, null, i16));
        q7 q7Var = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.i6(q7Var, (Class[]) null, new xi0[]{q7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(q7Var, (Class[]) null, new xi0[]{q7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(q7Var, (Class[]) null, new xi0[]{q7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28782e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28804w, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.W5));
        int i19 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28806x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28808y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28792n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, i11));
        x7 x7Var = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var.getNextTextView(), 4, null, null, null, null, i10));
        x7 x7Var2 = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x7Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        return arrayList;
    }

    @Override
    public final boolean isTouchOutside(float f9, float f10) {
        int i10;
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f10 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f10 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f9 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f9 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
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
        if (f10 >= top + i10 && f9 >= this.containerView.getLeft() && f9 <= this.containerView.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onBackPressed() {
        cg.m1 m1Var = this.f28779c;
        if (m1Var != null && m1Var.f23612j0) {
            m1Var.h(true);
        } else if (this.f28783e0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        n7 n7Var = this.f28783e0;
        if (view != n7Var) {
            return false;
        }
        n7Var.layout(0, 0, n7Var.getMeasuredWidth(), n7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        n7 n7Var = this.f28783e0;
        if (view == n7Var) {
            n7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.O.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    public final j70 p0(j70 j70Var, MessageObject messageObject) {
        long j10;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j10 = document.f22398id;
        } else {
            j10 = 0;
        }
        j70 J = j70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.it0(j70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new e7(this, messageObject, j70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new e7(this, messageObject, j70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new e7(this, messageObject, j70Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList n10;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.C0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
        e10.putBoolean("canSelectTopics", true);
        org.telegram.ui.fy fyVar = new org.telegram.ui.fy(e10);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            n10 = null;
        } else {
            n10 = org.telegram.messenger.x3.n(messageObject);
            tL_document = null;
        }
        fyVar.f38379y2 = new a1.d(this, n10, tL_document, messageObject, 7);
        launchActivity.p0(fyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.f28800s0;
        if (savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        P0 = this;
    }

    public final void t0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && (launchActivity = this.C0) != null) {
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
                launchActivity.q0(new org.telegram.ui.tn(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                u0(playingMessageObject);
            } else if (i10 == 6) {
                ze.b.H().V(MediaController.getInstance().getCurrentChromecastMedia());
                this.M.performClick();
            } else if (i10 == 7) {
                v0(playingMessageObject, false, new b7(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                nh.g7 g7Var = new nh.g7(getContext(), true, null, new d7(this, 0), null);
                g7Var.f17710d0 = true;
                g7Var.V = false;
                g7Var.m0.N(true);
                g7Var.show();
            }
        }
    }

    public final void u0(MessageObject messageObject) {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
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
        if (str3 != null && str3.length() > 0 && !com.google.android.recaptcha.internal.a.v(str3)) {
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
        MediaController.saveFile(str4, this.C0, 3, str2, str5, new d7(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j10 = document.f22398id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f22420id = tL_inputDocument;
        tL_inputDocument.f22404id = j10;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new g7(this, z11, messageObject, z10, runnable, j10, document));
    }

    public final boolean w0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g8.w0(boolean):boolean");
    }

    public final void x0(org.telegram.ui.ActionBar.g1 g1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.Xi;
            g1Var.setTextColor(getThemedColor(i10));
            g1Var.setIconColor(getThemedColor(i10));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        g1Var.setTextColor(getThemedColor(i11));
        g1Var.setIconColor(getThemedColor(i11));
    }

    public final void y0(final boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        boolean s02 = s0();
        nh.d dVar = this.C;
        nh.d dVar2 = this.B;
        if (!s02 && !this.f28803v0) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f13 = 0.0f;
            float f14 = 1.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
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
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).withEndAction(new Runnable(this) {
                public final g8 f27356b;

                {
                    this.f27356b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            nh.d dVar3 = this.f27356b.B;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            nh.d dVar4 = this.f27356b.C;
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
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(jrVar).withEndAction(new Runnable(this) {
                public final g8 f27356b;

                {
                    this.f27356b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            nh.d dVar3 = this.f27356b.B;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            nh.d dVar4 = this.f27356b.C;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g8.z0(org.telegram.messenger.MessageObject):void");
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
