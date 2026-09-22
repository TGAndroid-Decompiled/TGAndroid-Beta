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
public final class i8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static i8 T0;
    public static final float[] U0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public int A0;
    public String B0;
    public AnimatorSet C0;
    public int D0;
    public final o7 E;
    public int E0;
    public final ci.d F;
    public final int F0;
    public final ci.d G;
    public final LaunchActivity G0;
    public final s4.y H;
    public int H0;
    public final y7 I;
    public float I0;
    public final z7 J;
    public int J0;
    public final q7 K;
    public long K0;
    public final r7 L;
    public long L0;
    public final z7 M;
    public boolean M0;
    public final org.telegram.ui.ActionBar.v0 N;
    public final org.telegram.ui.Cells.u6 N0;
    public final org.telegram.ui.yr O;
    public org.telegram.ui.ij O0;
    public org.telegram.ui.ActionBar.f1 P;
    public long P0;
    public final s7 Q;
    public float Q0;
    public final boolean R;
    public final org.telegram.ui.Cells.d2 R0;
    public final x80 S;
    public ValueAnimator S0;
    public final a8 T;
    public final org.telegram.ui.ActionBar.j5 U;
    public final org.telegram.ui.ActionBar.v0 V;
    public final ed W;
    public final org.telegram.ui.ActionBar.b1 X;
    public boolean Y;
    public final org.telegram.ui.ActionBar.f1[] Z;
    public final TextView f24997a0;
    public final View f24998b;
    public final org.telegram.ui.ActionBar.v0 f24999b0;
    public final x7 f25000c;
    public final org.telegram.ui.ActionBar.f1 f25001c0;
    public final View d;
    public final org.telegram.ui.ActionBar.f1 f25002d0;
    public final View e;
    public final org.telegram.ui.ActionBar.f1 f25003e0;
    public boolean f25004f;
    public final org.telegram.ui.ActionBar.f1 f25005f0;
    public final ImageView f25006g0;
    public boolean h;
    public final sg0 f25007h0;
    public final o7 f25008i0;
    public final v9 f25009j0;
    public final org.telegram.ui.ActionBar.v0 f25010k0;
    public final org.telegram.ui.ActionBar.v0 f25011l0;
    public boolean m0;
    public final t7 f25012n;
    public final View[] f25013n0;
    public final o1.k f25014o0;
    public long f25015p0;
    public boolean f25016q0;
    public final s4.c0 f25017r;
    public boolean f25018r0;
    public final h8 f25019s;
    public int f25020s0;
    public int f25021t0;
    public final boolean f25022u0;
    public final LinearLayout v;
    public final boolean f25023v0;
    public final ImageView f25024w;
    public MessagesController.SavedMusicList f25025w0;
    public final TextView f25026x;
    public ArrayList f25027x0;
    public final TextView f25028y;
    public MessageObject f25029y0;
    public boolean f25030z0;

    public i8(Activity activity, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, (Context) activity, f6Var, true);
        boolean z10;
        boolean z11;
        TLRPC.User user;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[6];
        this.Z = f1VarArr;
        View[] viewArr = new View[5];
        this.f25013n0 = viewArr;
        this.f25018r0 = true;
        this.f25020s0 = -1;
        this.A0 = Integer.MAX_VALUE;
        this.I0 = -1.0f;
        this.N0 = new org.telegram.ui.Cells.u6(this, 5);
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
        w7 w7Var = new w7(this, activity);
        this.containerView = w7Var;
        w7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        x7 x7Var = new x7(this, activity, f6Var, 0);
        this.f25000c = x7Var;
        x7Var.setBackgroundColor(0);
        x7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = org.telegram.ui.ActionBar.j6.Oi;
        x7Var.B(getThemedColor(i14), false);
        x7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), false);
        x7Var.setTitleColor(getThemedColor(i14));
        x7Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
        x7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z n10 = x7Var.n();
        n10.setLayoutParams(w7.y5.e(-1, -1, 119));
        View view = new View(activity);
        this.f24998b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5));
        x7Var.addView(view, 0, w7.y5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        x7Var.setAlpha(0.0f);
        x7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 6));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        o7 o7Var = new o7(this, activity, 2);
        this.E = o7Var;
        y7 y7Var = new y7(this, activity);
        this.I = y7Var;
        o7Var.addView(y7Var, w7.y5.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        z7 z7Var = new z7(this, activity, activity, 0);
        this.J = z7Var;
        o7Var.addView(z7Var, w7.y5.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        z7 z7Var2 = new z7(this, activity, activity, 1);
        this.M = z7Var2;
        o7Var.addView(z7Var2, w7.y5.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        a8 a8Var = new a8(this, activity, f6Var);
        this.T = a8Var;
        a8Var.setLineWidth(4);
        a8Var.setDelegate(new n7(this));
        a8Var.setReportChanges(true);
        o7Var.addView(a8Var, w7.y5.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.k kVar = new o1.k(new o1.j(0.0f));
        o1.l lVar = new o1.l();
        lVar.b(750.0f);
        lVar.a(1.0f);
        kVar.f15537u = lVar;
        kVar.b(new j7(this, 0));
        this.f25014o0 = kVar;
        x80 x80Var = new x80(activity);
        this.S = x80Var;
        x80Var.setVisibility(4);
        x80Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
        x80Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
        o7Var.addView(x80Var, w7.y5.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.U = j5Var;
        j5Var.setTextSize(12);
        j5Var.l("0:00", false);
        int i15 = org.telegram.ui.ActionBar.j6.Si;
        j5Var.setTextColor(getThemedColor(i15));
        j5Var.setImportantForAccessibility(2);
        o7Var.addView(j5Var, w7.y5.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f24997a0 = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i15));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        o7Var.addView(textView, w7.y5.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(activity, null, 0, getThemedColor(i15), false, f6Var);
        this.V = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setShowSubmenuByMove(false);
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        v0Var.setDelegate(new y6(this, 0));
        ed edVar = new ed();
        this.W = edVar;
        v0Var.setIcon(edVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), f6Var);
        this.X = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        b1Var.setDrawShadow(true);
        b1Var.setOnValueChange(new z6(this, 0));
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
        o7Var.addView(v0Var, w7.y5.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        v0Var.setOnClickListener(new org.telegram.ui.sf(16, this, fArr));
        v0Var.setOnLongClickListener(new ai.q3(2, this, f6Var));
        F0(false);
        o7 o7Var2 = new o7(this, activity, 0);
        o7Var.addView(o7Var2, w7.y5.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(activity, null, 0, 0, false, f6Var);
        this.f24999b0 = v0Var2;
        viewArr[0] = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setShowSubmenuByMove(false);
        v0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i16 = org.telegram.ui.ActionBar.j6.f19199i6;
        v0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        o7Var2.addView(v0Var2, w7.y5.e(48, 48, 51));
        v0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f22552b;

            {
                this.f22552b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        i8 i8Var = this.f22552b;
                        i8Var.I0();
                        i8Var.f24999b0.M(null, null);
                        return;
                    default:
                        i8.J(this.f22552b, view4);
                        return;
                }
            }
        });
        this.f25001c0 = v0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.f25002d0 = v0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f25003e0 = v0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f25005f0 = v0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        v0Var2.setShowedFromBottom(true);
        v0Var2.setDelegate(new y6(this, 1));
        int i17 = org.telegram.ui.ActionBar.j6.Wi;
        int themedColor = getThemedColor(i17);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        q7 q7Var = new q7(this, activity, scaledTouchSlop);
        this.K = q7Var;
        viewArr[1] = q7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q7Var.setScaleType(scaleType);
        q7Var.f(R.raw.player_prev, 20, 20, null);
        q7Var.h(themedColor, "Triangle 3");
        q7Var.h(themedColor, "Triangle 4");
        q7Var.h(themedColor, "Rectangle 4");
        q7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        o7Var2.addView(q7Var, w7.y5.e(48, 48, 51));
        q7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f25006g0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        sg0 sg0Var = new sg0(28);
        this.f25007h0 = sg0Var;
        imageView.setImageDrawable(sg0Var);
        sg0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(24.0f)));
        o7Var2.addView(imageView, w7.y5.e(48, 48, 51));
        imageView.setOnClickListener(new ai.e2(8));
        r7 r7Var = new r7(this, activity, scaledTouchSlop);
        this.L = r7Var;
        viewArr[3] = r7Var;
        r7Var.setScaleType(scaleType);
        r7Var.f(R.raw.player_prev, 20, 20, null);
        r7Var.h(themedColor, "Triangle 3");
        r7Var.h(themedColor, "Triangle 4");
        r7Var.h(themedColor, "Rectangle 4");
        r7Var.setRotation(180.0f);
        r7Var.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(22.0f)));
        o7Var2.addView(r7Var, w7.y5.e(48, 48, 51));
        r7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(activity, null, 0, themedColor, false, f6Var);
        this.N = v0Var3;
        viewArr[4] = v0Var3;
        org.telegram.ui.yr yrVar = new org.telegram.ui.yr(activity, R.drawable.ic_ab_other, f6Var);
        this.O = yrVar;
        v0Var3.setIcon(yrVar);
        v0Var3.setLongClickEnabled(false);
        v0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(18.0f)));
        v0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f22552b;

            {
                this.f22552b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r2) {
                    case 0:
                        i8 i8Var = this.f22552b;
                        i8Var.I0();
                        i8Var.f24999b0.M(null, null);
                        return;
                    default:
                        i8.J(this.f22552b, view4);
                        return;
                }
            }
        });
        o7Var2.addView(v0Var3, w7.y5.e(48, 48, 51));
        s7 s7Var = new s7(this, activity, 0);
        this.Q = s7Var;
        this.R = true;
        try {
            s7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e) {
            FileLog.e(e);
            this.R = false;
        }
        this.Q.setVisibility(4);
        org.telegram.ui.yr yrVar2 = this.O;
        if (yrVar2 != null) {
            yrVar2.a(b5.d.u());
        }
        this.N.setShowedFromBottom(true);
        this.N.setDelegate(new y6(this, 2));
        this.N.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, w7.y5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(11));
        ImageView imageView2 = new ImageView(activity);
        this.f25024w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.y5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f25026x = textView2;
        int i18 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i18));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, w7.y5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f25028y = textView3;
        textView3.setTextColor(getThemedColor(i18));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, w7.y5.t(-2, -2, 17, 0, 6, 0, 0));
        t7 t7Var = new t7(this, activity);
        this.f25012n = t7Var;
        t7Var.setClipToPadding(false);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        this.f25017r = c0Var;
        t7Var.setLayoutManager(c0Var);
        t7Var.setHorizontalScrollBarEnabled(false);
        t7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(t7Var, w7.y5.e(-1, -1, 51));
        h8 h8Var = new h8(this, activity);
        this.f25019s = h8Var;
        t7Var.setAdapter(h8Var);
        t7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        t7Var.setOnItemClickListener(new l7(0));
        t7Var.setOnItemLongClickListener(new y6(this, 3));
        t7Var.setOnScrollListener(new ai.r(this, 15));
        ci.d dVar = new ci.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.F = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new oq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f26348b;

            {
                this.f26348b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        i8.D(this.f26348b, f6Var);
                        return;
                    default:
                        i8.B(this.f26348b, f6Var);
                        return;
                }
            }
        });
        this.E.addView(dVar, w7.y5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ci.d dVar2 = new ci.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.G = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f26348b;

            {
                this.f26348b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        i8.D(this.f26348b, f6Var);
                        return;
                    default:
                        i8.B(this.f26348b, f6Var);
                        return;
                }
            }
        });
        this.E.addView(dVar2, w7.y5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f25025w0 = savedMusicList;
        if (savedMusicList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25022u0 = z10;
        this.f25000c.m0 = z10;
        this.f25023v0 = s0();
        this.f25027x0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            this.f25010k0 = n10.a(8, R.drawable.msg_add);
        }
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 5);
        this.f25011l0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i19 = org.telegram.ui.ActionBar.j6.Oi;
        searchField.setTextColor(getThemedColor(i19));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
        searchField.setCursorColor(getThemedColor(i19));
        if (z10) {
            t7Var.q1();
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19053a7, f6Var));
            this.f25000c.setAlpha(1.0f);
            this.f24998b.setAlpha(0.0f);
            this.R0.set(this.f25000c, Float.valueOf(0.0f));
        }
        if (this.f25027x0.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        h8Var.h = z11;
        if (z11) {
            t7Var.setVisibility(0);
            t7Var.setTranslationY(0.0f);
        } else {
            t7Var.setVisibility(8);
            t7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        h8Var.l();
        this.f25000c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f25025w0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f25000c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f25000c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f25025w0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat k10 = org.telegram.messenger.l0.k(MessagesController.getInstance(this.currentAccount), dialogId);
                if (k10 != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(k10.user_id))) != null) {
                    this.f25000c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f25000c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f25000c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f25000c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f25000c.setTitle(chat.title);
                }
            }
        }
        if (s0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.y yVar = new s4.y(new u7(this));
            this.H = yVar;
            yVar.e(t7Var);
        }
        ViewGroup viewGroup2 = this.containerView;
        o7 o7Var3 = this.E;
        int i20 = 52;
        if (!s0() && !this.f25030z0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(o7Var3, w7.y5.e(-1, i10 + 179, 83));
        this.containerView.addView(this.e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
        if (!s0() && !this.f25030z0) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = AndroidUtilities.dp(i11 + 179);
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.f25030z0) ? 0 : 0));
        this.containerView.addView(this.d, w7.y5.c(3.0f, -1));
        this.containerView.addView(this.f25000c);
        o7 o7Var4 = new o7(this, activity, 1);
        this.f25008i0 = o7Var4;
        o7Var4.setAlpha(0.0f);
        o7Var4.setVisibility(4);
        getContainer().addView(o7Var4);
        v9 v9Var = new v9(activity);
        this.f25009j0 = v9Var;
        v9Var.setAspectFit(true);
        v9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        v9Var.setScaleX(0.9f);
        v9Var.setScaleY(0.9f);
        o7Var4.addView(v9Var, w7.y5.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        if (this.h && h8Var.h() == 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        E0();
    }

    public static void A(i8 i8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f18364id == i10) {
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
                i8Var.v0(new MessageObject(i8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new k7(i8Var, 0));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(i8Var, tL_error, 2));
        }
    }

    public static void B(i8 i8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && i8Var.G0 != null) {
            i8Var.v0(playingMessageObject, false, new ai.f(24), false);
            i8Var.y0(false);
            org.telegram.messenger.l0.o(R.string.AudioSaveToMyProfileUnsaved, new xc((FrameLayout) i8Var.containerView, f6Var), R.raw.ic_delete, 36);
        }
    }

    public static void D(i8 i8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && i8Var.G0 != null) {
            i8Var.v0(playingMessageObject, true, new ai.f(24), false);
            i8Var.y0(true);
            org.telegram.messenger.l0.o(R.string.AudioSaveToMyProfileSaved, new xc((FrameLayout) i8Var.containerView, f6Var), R.raw.saved_messages, 36);
        }
    }

    public static void E(i8 i8Var, float[] fArr) {
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
                org.telegram.ui.ij ijVar = new org.telegram.ui.ij(5, 1, i8Var.getContext(), null, false);
                i8Var.O0 = ijVar;
                ijVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                i8Var.O0.setText(LocaleController.getString(R.string.SpeedHint));
                i8Var.E.addView(i8Var.O0, w7.y5.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                i8Var.O0.f(i8Var.V, true);
            }
        }
        i8Var.P0 = currentTimeMillis;
    }

    public static void F(i8 i8Var) {
        new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void G(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void I(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void J(i8 i8Var, View view) {
        s7 s7Var = i8Var.Q;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        boolean z10 = true;
        y70 G = y70.G(i8Var.container, i8Var.resourcesProvider, view, true);
        y70 p02 = i8Var.p0(G, playingMessageObject);
        if (!i8Var.s0()) {
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, p02, 7), !i8Var.f25030z0);
            if (!i8Var.f25030z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
        }
        G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new f7(i8Var, G, 0), !i8Var.f25030z0);
        G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new f7(i8Var, G, 1), !i8Var.f25030z0);
        if (playingMessageObject.getId() <= 0) {
            z10 = false;
        }
        G.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new f7(i8Var, G, 2), z10);
        if (i8Var.R) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, G.e, G.d, false, false);
            G.d(f1Var);
            i8Var.P = f1Var;
            f1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            i8Var.P.setOnClickListener(new org.telegram.ui.sf(17, i8Var, G));
            AndroidUtilities.removeFromParent(s7Var);
            i8Var.P.addView(s7Var, 0, w7.y5.c(-1.0f, -1));
            i8Var.D0();
        }
        G.m(i8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new f7(i8Var, G, 3));
        G.X(AndroidUtilities.dp(64.0f));
        G.Z();
    }

    public static void K(i8 i8Var, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            b2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(i8Var.currentAccount).getInputPeer(UserConfig.getInstance(i8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.oo(4, i8Var, b2Var));
    }

    public static void L(i8 i8Var, MessageObject messageObject, y70 y70Var) {
        ArrayList<MessageObject> j3;
        String formatString;
        int i10;
        long clientUserId = UserConfig.getInstance(i8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = i8Var.currentAccount;
        if (i11 != i12) {
            i8Var.G0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                j3 = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            }
            i10 = 36;
            y70Var.u();
            org.telegram.messenger.l0.o(R.string.AudioSaveToSavedMessagesSaved, new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        j3 = org.telegram.messenger.l0.j(messageObject);
        if (j3 != null) {
            SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(j3, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i8Var.currentAccount);
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, i8Var.f25025w0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(of2);
        }
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null) {
            xc a02 = xc.a0(R);
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
            y70Var.u();
            org.telegram.messenger.l0.o(R.string.AudioSaveToSavedMessagesSaved, new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        i10 = 36;
        y70Var.u();
        org.telegram.messenger.l0.o(R.string.AudioSaveToSavedMessagesSaved, new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.saved_messages, i10);
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
        x7 x7Var = i8Var.f25000c;
        t7 t7Var = i8Var.f25012n;
        if (t7Var.getChildCount() <= 0) {
            int paddingTop = t7Var.getPaddingTop();
            i8Var.A0 = paddingTop;
            t7Var.setTopGlowOffset(paddingTop);
            i8Var.containerView.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = t7Var.getChildAt(0);
        il0 il0Var = (il0) t7Var.H(childAt);
        if (childAt instanceof org.telegram.ui.Cells.x) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int dp = AndroidUtilities.dp(7.0f);
        if (bottom < AndroidUtilities.dp(7.0f) || il0Var == null || il0Var.b() != 0) {
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
            AnimatorSet animatorSet = i8Var.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
                i8Var.C0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            i8Var.C0 = animatorSet2;
            float f13 = 0.0f;
            if (i8Var.f25022u0) {
                org.telegram.ui.Cells.d2 d2Var = i8Var.R0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var, d2Var, f10);
                View view2 = i8Var.f24998b;
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
            i8Var.C0.setDuration(320L);
            i8Var.C0.setInterpolator(qr.h);
            i8Var.C0.addListener(new v7(i8Var, 2));
            i8Var.C0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t7Var.getLayoutParams();
        int D = org.telegram.messenger.rk.D(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, bottom);
        if (i8Var.A0 != D) {
            i8Var.A0 = D;
            t7Var.setTopGlowOffset((D - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            i8Var.containerView.invalidate();
        }
        int dp2 = AndroidUtilities.dp(13.0f);
        if (i8Var.backgroundPaddingTop + ((int) (t7Var.getTranslationY() + ((i8Var.A0 - i8Var.backgroundPaddingTop) - dp2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - i8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + dp2));
        }
        if (f12 <= 0.5f && i0.a.f(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != i8Var.M0) {
            i8Var.M0 = z11;
            AndroidUtilities.setLightStatusBar(i8Var, z11);
        }
    }

    public static int h0(i8 i8Var) {
        return i8Var.currentAccount;
    }

    public static int i0(i8 i8Var) {
        return i8Var.backgroundPaddingTop;
    }

    public static int j0(i8 i8Var) {
        return i8Var.backgroundPaddingTop;
    }

    public static void m(i8 i8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = i8Var.f25025w0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (i8Var.f25025w0.list.isEmpty()) {
                MediaController.getInstance().cleanup();
                i8Var.dismiss();
                return;
            }
            NotificationCenter.getInstance(i8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, i8Var.f25025w0);
        }
    }

    public static void n(i8 i8Var) {
        new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void o(i8 i8Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        b2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f18371id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f18355id = document.f18349id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = i8Var.f25025w0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            i8Var.f25027x0.clear();
            i8Var.f25027x0.addAll(i8Var.f25025w0.list);
            i8Var.f25019s.l();
            ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void p(i8 i8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = i8Var.G0;
        int i10 = UserConfig.selectedAccount;
        int i11 = i8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(i8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(i8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.zn(bundle), false, false);
        i8Var.dismiss();
    }

    public static void q(i8 i8Var, y70 y70Var) {
        i8Var.y0(true);
        new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        y70Var.u();
    }

    public static void r(i8 i8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    if (messages_messages.messages.get(i11).f18364id == i10) {
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
                i8Var.v0(new MessageObject(i8Var.currentAccount, message, false, true), z10, runnable, true);
            } else {
                AndroidUtilities.runOnUIThread(new k7(i8Var, 1));
            }
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new h7(i8Var, tL_error, 3));
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

    public static void s(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void t(i8 i8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.uy uyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String formatPluralStringComma;
        long j3;
        int i11;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(i8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
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
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i12);
            if (topicKey.topicId != 0) {
                ng.d.a(znVar, topicKey);
            }
            if (i8Var.G0.q0(znVar, true, false)) {
                znVar.Ab(arrayList3);
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
                SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            if (arrayList3 != null) {
                i11 = i13;
                SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(arrayList3, j3, false, false, true, 0, 0L);
            } else {
                i11 = i13;
                SendMessagesHelper.getInstance(i8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j3, null, null, null, null, null, null, z10, i10, 0, 0, i8Var.f25025w0, null, false, false));
            }
            i13 = i11 + 1;
            arrayList3 = arrayList;
        }
        uyVar.finishFragment();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null) {
            xc a02 = xc.a0(R);
            int i14 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(i8Var.currentAccount).getClientUserId()) {
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

    public static void u(i8 i8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject != null && i8Var.f25025w0 != null && (document = messageObject.getDocument()) != null) {
            if (document.f18349id != 0) {
                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.f18371id = tL_inputDocument;
                tL_inputDocument.f18355id = document.f18349id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                MessagesController.SavedMusicList savedMusicList = i8Var.f25025w0;
                if (savedMusicList != null) {
                    savedMusicList.add(document);
                }
                i8Var.f25027x0.clear();
                i8Var.f25027x0.addAll(i8Var.f25025w0.list);
                i8Var.f25019s.l();
                ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(i8Var.getContext(), 3, null);
            b2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(i8Var.currentAccount).uploadFile(file.getAbsolutePath(), new ai.d5(i8Var, b2Var, document, 3));
            }
        }
    }

    public static void v(i8 i8Var, MessageObject messageObject, y70 y70Var) {
        i8Var.f25025w0.remove(messageObject);
        i8Var.f25027x0.remove(messageObject);
        i8Var.f25019s.l();
        y70Var.u();
        i8Var.y0(false);
        org.telegram.messenger.l0.o(R.string.AudioSaveToMyProfileUnsaved, new xc((FrameLayout) i8Var.containerView, i8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void w(i8 i8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.c1.s((FrameLayout) i8Var.containerView, i8Var.resourcesProvider, tL_error, false);
    }

    public static void x(i8 i8Var) {
        org.telegram.ui.ActionBar.f6 f6Var = i8Var.resourcesProvider;
        new xc((FrameLayout) i8Var.containerView, f6Var).o(wc.F, f6Var).j();
    }

    public static void y(i8 i8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j3, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            if (!z10 && messageObject.getId() >= 0) {
                if (messageObject.getDialogId() >= 0) {
                    final int id2 = messageObject.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f18437id.add(Integer.valueOf(id2));
                    ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(i8Var) {
                        public final i8 f24987b;

                        {
                            this.f24987b = i8Var;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                            switch (r5) {
                                case 0:
                                    i8.r(this.f24987b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                                default:
                                    i8.A(this.f24987b, id2, z11, runnable, tLObject, tL_error2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                final int id3 = messageObject.getId();
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = MessagesController.getInstance(i8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
                tL_channels_getMessages.f18381id.add(Integer.valueOf(id3));
                ConnectionsManager.getInstance(i8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(i8Var) {
                    public final i8 f24987b;

                    {
                        this.f24987b = i8Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                        switch (r5) {
                            case 0:
                                i8.r(this.f24987b, id3, z11, runnable, tLObject, tL_error2);
                                return;
                            default:
                                i8.A(this.f24987b, id3, z11, runnable, tLObject, tL_error2);
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
        AndroidUtilities.runOnUIThread(new p2(i8Var, j3, z11, document, runnable));
    }

    public static void z(i8 i8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(i8Var.currentAccount).getSavedMusicIds().update(j3, z10);
        long clientUserId = UserConfig.getInstance(i8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(i8Var.currentAccount).getUserFull(clientUserId);
        if (userFull != null) {
            if (z10) {
                userFull.flags2 |= 2097152;
                userFull.saved_music = document;
            } else {
                TLRPC.Document document2 = userFull.saved_music;
                if (document2 != null && document2.f18349id == j3) {
                    userFull.flags2 &= -2097153;
                    userFull.saved_music = null;
                }
            }
            MessagesStorage.getInstance(i8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(i8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public final void A0(boolean z10, boolean z11) {
        v9 v9Var = this.f25009j0;
        o7 o7Var = this.f25008i0;
        if (z10) {
            if (o7Var.getVisibility() != 0 && !this.m0) {
                o7Var.setTag(1);
                y7 y7Var = this.I;
                v9Var.setImageBitmap(y7Var.f23582a[y7Var.f23583b].getImageReceiver().getBitmap());
                this.m0 = true;
                om0.d(new z6(this, 1));
                o7Var.setVisibility(0);
                o7Var.animate().alpha(1.0f).setDuration(180L).setListener(new v7(this, 0)).start();
                v9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (o7Var.getVisibility() != 0) {
        } else {
            o7Var.setTag(null);
            if (z11) {
                this.m0 = true;
                o7Var.animate().alpha(0.0f).setDuration(180L).setListener(new v7(this, 1)).start();
                v9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            o7Var.setAlpha(0.0f);
            o7Var.setVisibility(4);
            v9Var.setImageBitmap(null);
            v9Var.setScaleX(0.9f);
            v9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        int i10;
        boolean z10 = true;
        y70 G = y70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 0), !this.f25030z0);
            G.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 1), !this.f25030z0);
            G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new e7(this, messageObject, G, 2), true);
        } else {
            y70 p02 = p0(G, messageObject);
            G.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new ei.m2(G, p02, 6), !this.f25030z0);
            if (!this.f25030z0 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new e7(this, G, messageObject, 3), !this.f25030z0);
            G.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new e7(this, G, messageObject, 4), !this.f25030z0);
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
        if (this.H0 == 1) {
            this.K0 = System.currentTimeMillis();
            this.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            org.telegram.ui.Cells.u6 u6Var = this.N0;
            AndroidUtilities.cancelRunOnUIThread(u6Var);
            AndroidUtilities.runOnUIThread(u6Var);
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
                i10 = org.telegram.ui.ActionBar.j6.f19476x7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Qh;
            }
            int themedColor2 = getThemedColor(i10);
            ed edVar = this.W;
            if (edVar != null) {
                ((n6) edVar.f23937c).r(themedColor2);
                Paint paint = (Paint) edVar.f23936b;
                if (paint != null) {
                    paint.setColor(themedColor2);
                }
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(themedColor2 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.f1 f1Var = this.P;
        if (f1Var != null) {
            s7 s7Var = this.Q;
            if (s7Var != null && s7Var.b()) {
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
            f1Var.I.setInterpolator(qr.h);
            f1Var.I.start();
            org.telegram.ui.ActionBar.f1 f1Var2 = this.P;
            if (s7Var != null && s7Var.b()) {
                themedColor = org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i11));
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19199i6);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.G0(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.v0 v0Var = this.f24999b0;
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
            org.telegram.ui.ActionBar.j6.B1(v0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.j6.f19199i6), true);
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
        x0(this.f25003e0, SharedConfig.shuffleMusic);
        x0(this.f25005f0, SharedConfig.playOrderReversed);
        boolean z11 = false;
        if (SharedConfig.repeatMode == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        x0(this.f25002d0, z10);
        if (SharedConfig.repeatMode == 2) {
            z11 = true;
        }
        x0(this.f25001c0, z11);
    }

    public final void J0(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.J0(boolean):void");
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
        t7 t7Var = this.f25012n;
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
                h8 h8Var = this.f25019s;
                if (i10 == i14) {
                    this.f25025w0 = MediaController.getInstance().currentSavedMusicList;
                    this.f25027x0 = MediaController.getInstance().getPlaylist();
                    h8Var.l();
                    return;
                } else if (i10 == NotificationCenter.moreMusicDidLoad) {
                    this.f25025w0 = MediaController.getInstance().currentSavedMusicList;
                    this.f25027x0 = MediaController.getInstance().getPlaylist();
                    h8Var.l();
                    if (SharedConfig.playOrderReversed) {
                        t7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        s4.c0 c0Var = this.f25017r;
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
                        this.f25016q0 = true;
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (((String) objArr[0]).equals(this.B0) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        float f7 = 1.0f;
                        if (!this.f25016q0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f25015p0) >= 500) {
                                if (MediaController.getInstance().isStreamingCurrentAudio()) {
                                    f7 = FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.B0);
                                }
                                this.f25015p0 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        if (f7 != -1.0f) {
                            o1.k kVar = this.f25014o0;
                            kVar.f15537u.f15543i = f7 * 1000.0f;
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
                int childCount = t7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = t7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = t7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = t7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                    xVar.b(false, true);
                }
            }
            if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().isMessagePaused()) {
                    C0();
                } else if (this.H0 == 1 && this.I0 != -1.0f) {
                    org.telegram.ui.Cells.u6 u6Var = this.N0;
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    this.L0 = 0L;
                    u6Var.run();
                    this.I0 = -1.0f;
                }
            }
        }
        org.telegram.ui.yr yrVar = this.O;
        if (yrVar != null) {
            yrVar.a(b5.d.u());
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
        o7 o7Var = this.E;
        if (o7Var == null) {
            return 0;
        }
        if (this.f25027x0.size() <= 1) {
            return o7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f25012n.getTranslationY() + ((this.A0 - this.backgroundPaddingTop) - dp));
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
        x6 x6Var = new x6(this, 0);
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25000c, 64, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25000c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25000c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25000c, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25000c, 134217728, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25000c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19207ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19225je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19428uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19445vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19511z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19224jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19206id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.j6.f19180h5));
        int i12 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.f19459w7;
        org.telegram.ui.ActionBar.v0 v0Var = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.j6.f19476x7));
        int i15 = org.telegram.ui.ActionBar.j6.Wi;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f24999b0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Xi));
        int i16 = org.telegram.ui.ActionBar.j6.f19199i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, x6Var, i16));
        int i17 = org.telegram.ui.ActionBar.j6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, x6Var, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, x6Var, i18));
        org.telegram.ui.ActionBar.v0 v0Var3 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, x6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, x6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, x6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 0, null, null, null, x6Var, i18));
        q7 q7Var = this.K;
        arrayList.add(new org.telegram.ui.ActionBar.l6(q7Var, (Class[]) null, new kj0[]{q7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(q7Var, (Class[]) null, new kj0[]{q7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(q7Var, (Class[]) null, new kj0[]{q7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 131080, null, null, null, null, i16));
        ImageView imageView = this.f25006g0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 131080, null, null, null, null, i16));
        r7 r7Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.l6(r7Var, (Class[]) null, new kj0[]{r7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(r7Var, (Class[]) null, new kj0[]{r7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(r7Var, (Class[]) null, new kj0[]{r7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25024w, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.W5));
        int i19 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25026x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25028y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25012n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19092c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19181h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24997a0, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, null, null, null, null, i11));
        z7 z7Var = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z7Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(z7Var.getNextTextView(), 4, null, null, null, null, i10));
        z7 z7Var2 = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z7Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(z7Var2.getNextTextView(), 4, null, null, null, null, i11));
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
        x7 x7Var = this.f25000c;
        if (x7Var != null && x7Var.f19552n0) {
            x7Var.h(true);
        } else if (this.f25008i0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        o7 o7Var = this.f25008i0;
        if (view != o7Var) {
            return false;
        }
        o7Var.layout(0, 0, o7Var.getMeasuredWidth(), o7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        o7 o7Var = this.f25008i0;
        if (view == o7Var) {
            o7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.S.a(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
    }

    public final y70 p0(y70 y70Var, MessageObject messageObject) {
        long j3;
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            j3 = document.f18349id;
        } else {
            j3 = 0;
        }
        y70 J = y70Var.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(y70Var, 25), false);
        J.k();
        J.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new e7(this, messageObject, y70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new e7(this, messageObject, y70Var, 7), false);
        J.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new e7(this, messageObject, y70Var, 8), false);
        J.k();
        J.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return J;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList j3;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.G0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle e = org.telegram.messenger.rk.e(3, "onlySelect", "dialogsType", true);
        e.putBoolean("canSelectTopics", true);
        org.telegram.ui.uy uyVar = new org.telegram.ui.uy(e);
        if (messageObject.getId() < 0) {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            j3 = null;
        } else {
            j3 = org.telegram.messenger.l0.j(messageObject);
            tL_document = null;
        }
        uyVar.C2 = new a1.d(this, j3, tL_document, messageObject, 6);
        launchActivity.p0(uyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.f25025w0;
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
                launchActivity.q0(new org.telegram.ui.zn(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                u0(playingMessageObject);
            } else if (i10 == 6) {
                of.b.S().W(MediaController.getInstance().getCurrentChromecastMedia());
                this.Q.performClick();
            } else if (i10 == 7) {
                v0(playingMessageObject, false, new b7(this, playingMessageObject, 0), false);
            } else if (i10 == 8) {
                ci.g8 g8Var = new ci.g8(getContext(), true, null, new d7(this, 0), null);
                g8Var.f4705h0 = true;
                g8Var.Z = false;
                g8Var.f4713q0.N(true);
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
        if (str3 != null && str3.length() > 0 && !v7.j0.r(str3)) {
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
        MediaController.saveFile(str4, this.G0, 3, str2, str5, new d7(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document document = messageObject.getDocument();
        if (document == null) {
            return;
        }
        long j3 = document.f18349id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f18371id = tL_inputDocument;
        tL_inputDocument.f18355id = j3;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, new g7(this, z11, messageObject, z10, runnable, j3, document));
    }

    public final boolean w0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.w0(boolean):boolean");
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
        ci.d dVar = this.G;
        ci.d dVar2 = this.F;
        if (!s02 && !this.f25030z0) {
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
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).withEndAction(new Runnable(this) {
                public final i8 f23265b;

                {
                    this.f23265b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            ci.d dVar3 = this.f23265b.F;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            ci.d dVar4 = this.f23265b.G;
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
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(qrVar).withEndAction(new Runnable(this) {
                public final i8 f23265b;

                {
                    this.f23265b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            ci.d dVar3 = this.f23265b.F;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            ci.d dVar4 = this.f23265b.G;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.z0(org.telegram.messenger.MessageObject):void");
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
