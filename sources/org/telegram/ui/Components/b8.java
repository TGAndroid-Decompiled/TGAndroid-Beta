package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

public final class b8 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public static b8 P0;
    public static final float[] Q0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final i7 A;
    public int A0;
    public final lh.d B;
    public final int B0;
    public final lh.d C;
    public final LaunchActivity C0;
    public final f2.f0 D;
    public int D0;
    public final r7 E;
    public float E0;
    public final s7 F;
    public int F0;
    public final k7 G;
    public long G0;
    public final l7 H;
    public long H0;
    public final s7 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.v0 J;
    public final m.i3 J0;
    public final org.telegram.ui.pr K;
    public org.telegram.ui.yi K0;
    public org.telegram.ui.ActionBar.f1 L;
    public long L0;
    public final m7 M;
    public float M0;
    public final boolean N;
    public final org.telegram.ui.Cells.b2 N0;
    public final z70 O;
    public ValueAnimator O0;
    public final t7 P;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final org.telegram.ui.ActionBar.v0 R;
    public final af.g S;
    public final org.telegram.ui.ActionBar.b1 T;
    public boolean U;
    public final org.telegram.ui.ActionBar.f1[] V;
    public final TextView W;
    public final org.telegram.ui.ActionBar.v0 X;
    public final org.telegram.ui.ActionBar.f1 Y;
    public final org.telegram.ui.ActionBar.f1 Z;

    public final org.telegram.ui.ActionBar.f1 f27010a0;

    public final View f27011b;

    public final org.telegram.ui.ActionBar.f1 f27012b0;

    public final ag.d2 f27013c;

    public final ImageView f27014c0;
    public final View d;

    public final tf0 f27015d0;

    public final View f27016e;

    public final i7 f27017e0;

    public boolean f27018f;

    public final n9 f27019f0;

    public final org.telegram.ui.ActionBar.v0 f27020g0;
    public boolean h;

    public final org.telegram.ui.ActionBar.v0 f27021h0;

    public boolean f27022i0;

    public final View[] f27023j0;

    public final o1.j f27024k0;

    public long f27025l0;
    public boolean m0;

    public final n7 f27026n;

    public boolean f27027n0;

    public int f27028o0;

    public int f27029p0;

    public final boolean f27030q0;

    public final f2.k0 f27031r;

    public final boolean f27032r0;

    public final a8 f27033s;

    public MessagesController.SavedMusicList f27034s0;

    public ArrayList f27035t0;

    public MessageObject f27036u0;
    public final LinearLayout v;

    public boolean f27037v0;

    public final ImageView f27038w;

    public int f27039w0;

    public final TextView f27040x;

    public String f27041x0;

    public final TextView f27042y;

    public AnimatorSet f27043y0;

    public int f27044z0;

    public b8(Activity activity, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.User user;
        super(activity, c6Var, true, false);
        int i10 = 1;
        final int i11 = 0;
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[6];
        this.V = f1VarArr;
        View[] viewArr = new View[5];
        this.f27023j0 = viewArr;
        this.f27027n0 = true;
        this.f27028o0 = -1;
        this.f27039w0 = Integer.MAX_VALUE;
        this.E0 = -1.0f;
        this.J0 = new m.i3(this, 11);
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
        q7 q7Var = new q7(this, activity);
        this.containerView = q7Var;
        q7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        ag.d2 d2Var = new ag.d2(this, activity, c6Var, i10);
        this.f27013c = d2Var;
        d2Var.setBackgroundColor(0);
        d2Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.g6.Oi;
        d2Var.D(getThemedColor(i13), false);
        d2Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.Ni), false);
        d2Var.setTitleColor(getThemedColor(i13));
        d2Var.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
        d2Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.z zVarN = d2Var.n();
        zVarN.setLayoutParams(h7.z5.e(-1, -1, 119));
        View view = new View(activity);
        this.f27011b = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        d2Var.addView(view, 0, h7.z5.e(-1, -1, 119));
        view.setAlpha(0.0f);
        d2Var.setAlpha(0.0f);
        int i14 = 2;
        d2Var.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, i14));
        View view2 = new View(activity);
        this.d = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.f27016e = view3;
        view3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        i7 i7Var = new i7(this, activity, i14);
        this.A = i7Var;
        r7 r7Var = new r7(this, activity);
        this.E = r7Var;
        i7Var.addView(r7Var, h7.z5.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(this, activity, activity, i11);
        this.F = s7Var;
        i7Var.addView(s7Var, h7.z5.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        s7 s7Var2 = new s7(this, activity, activity, i10);
        this.I = s7Var2;
        i7Var.addView(s7Var2, h7.z5.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, c6Var);
        this.P = t7Var;
        int i15 = 4;
        t7Var.setLineWidth(4);
        t7Var.setDelegate(new h7(this));
        t7Var.setReportChanges(true);
        i7Var.addView(t7Var, h7.z5.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new hb.a(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.f19147u = kVar;
        jVar.b(new e7(this, i11));
        this.f27024k0 = jVar;
        z70 z70Var = new z70(activity);
        this.O = z70Var;
        z70Var.setVisibility(4);
        z70Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
        z70Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
        i7Var.addView(z70Var, h7.z5.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.Q = h5Var;
        h5Var.setTextSize(12);
        h5Var.l("0:00", false);
        int i16 = org.telegram.ui.ActionBar.g6.Si;
        h5Var.setTextColor(getThemedColor(i16));
        h5Var.setImportantForAccessibility(2);
        i7Var.addView(h5Var, h7.z5.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.W = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(getThemedColor(i16));
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        i7Var.addView(textView, h7.z5.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        int i17 = 2;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(activity, null, 0, getThemedColor(i16), false, c6Var);
        this.R = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setShowSubmenuByMove(false);
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(224.0f));
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        v0Var.setDelegate(new t6(this, i11));
        af.g gVar = new af.g();
        this.S = gVar;
        v0Var.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), c6Var);
        this.T = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        b1Var.setDrawShadow(true);
        b1Var.setOnValueChange(new u6(this, i11));
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
        i7Var.addView(v0Var, h7.z5.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        v0Var.setOnClickListener(new q2(i15, this, fArr));
        v0Var.setOnLongClickListener(new jh.f2(i17, this, c6Var));
        F0(false);
        i7 i7Var2 = new i7(this, activity, i11);
        i7Var.addView(i7Var2, h7.z5.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(activity, null, 0, 0, false, c6Var);
        this.X = v0Var2;
        viewArr[0] = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setShowSubmenuByMove(false);
        v0Var2.setAdditionalYOffset(-AndroidUtilities.dp(166.0f));
        int i18 = org.telegram.ui.ActionBar.g6.f23144i6;
        v0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f)));
        i7Var2.addView(v0Var2, h7.z5.e(48, 48, 51));
        v0Var2.setOnClickListener(new View.OnClickListener(this) {

            public final b8 f33277b;

            {
                this.f33277b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i11) {
                    case 0:
                        b8 b8Var = this.f33277b;
                        b8Var.I0();
                        b8Var.X.M(null, null);
                        break;
                    default:
                        b8.J(this.f33277b, view4);
                        break;
                }
            }
        });
        this.Y = v0Var2.e(3, R.drawable.player_new_repeatone, LocaleController.getString(R.string.RepeatSong));
        this.Z = v0Var2.e(4, R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27010a0 = v0Var2.e(2, R.drawable.player_new_shuffle, LocaleController.getString(R.string.ShuffleList));
        v0Var2.a(-1).getLayoutParams().height = AndroidUtilities.dp(4.0f);
        this.f27012b0 = v0Var2.e(1, R.drawable.player_new_order, LocaleController.getString(R.string.ReverseOrder));
        v0Var2.setShowedFromBottom(true);
        v0Var2.setDelegate(new t6(this, i10));
        int i19 = org.telegram.ui.ActionBar.g6.Wi;
        int themedColor = getThemedColor(i19);
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
        k7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f)));
        i7Var2.addView(k7Var, h7.z5.e(48, 48, 51));
        k7Var.setContentDescription(LocaleController.getString(R.string.AccDescrPrevious));
        ImageView imageView = new ImageView(activity);
        this.f27014c0 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        tf0 tf0Var = new tf0(28);
        this.f27015d0 = tf0Var;
        imageView.setImageDrawable(tf0Var);
        tf0Var.a(!MediaController.getInstance().isMessagePaused(), false);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i19), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(24.0f)));
        i7Var2.addView(imageView, h7.z5.e(48, 48, 51));
        imageView.setOnClickListener(new ag.l2(12));
        l7 l7Var = new l7(this, activity, scaledTouchSlop);
        this.H = l7Var;
        viewArr[3] = l7Var;
        l7Var.setScaleType(scaleType);
        l7Var.f(R.raw.player_prev, 20, 20, null);
        l7Var.h(themedColor, "Triangle 3");
        l7Var.h(themedColor, "Triangle 4");
        l7Var.h(themedColor, "Rectangle 4");
        l7Var.setRotation(180.0f);
        l7Var.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(22.0f)));
        i7Var2.addView(l7Var, h7.z5.e(48, 48, 51));
        l7Var.setContentDescription(LocaleController.getString(R.string.Next));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(activity, null, 0, themedColor, false, c6Var);
        this.J = v0Var3;
        viewArr[4] = v0Var3;
        org.telegram.ui.pr prVar = new org.telegram.ui.pr(activity, R.drawable.ic_ab_other, c6Var);
        this.K = prVar;
        v0Var3.setIcon(prVar);
        v0Var3.setLongClickEnabled(false);
        v0Var3.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        final int i20 = 1;
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i18), 1, AndroidUtilities.dp(18.0f)));
        v0Var3.setOnClickListener(new View.OnClickListener(this) {

            public final b8 f33277b;

            {
                this.f33277b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        b8 b8Var = this.f33277b;
                        b8Var.I0();
                        b8Var.X.M(null, null);
                        break;
                    default:
                        b8.J(this.f33277b, view4);
                        break;
                }
            }
        });
        i7Var2.addView(v0Var3, h7.z5.e(48, 48, 51));
        m7 m7Var = new m7(this, activity, 0);
        this.M = m7Var;
        this.N = true;
        try {
            m7Var.setRouteSelector(n5.a.c(activity).a());
        } catch (Exception e9) {
            FileLog.e(e9);
            this.N = false;
        }
        this.M.setVisibility(4);
        org.telegram.ui.pr prVar2 = this.K;
        if (prVar2 != null) {
            prVar2.a(d1.f.t());
        }
        this.J.setShowedFromBottom(true);
        this.J.setDelegate(new t6(this, 2));
        this.J.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        this.containerView.addView(linearLayout, h7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new kh.e(11));
        ImageView imageView2 = new ImageView(activity);
        this.f27038w = imageView2;
        imageView2.setImageResource(R.drawable.music_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, h7.z5.n(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f27040x = textView2;
        int i21 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i21));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.NoAudioFound));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f27042y = textView3;
        textView3.setTextColor(getThemedColor(i21));
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textView3, h7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        n7 n7Var = new n7(this, activity);
        this.f27026n = n7Var;
        n7Var.setClipToPadding(false);
        getContext();
        f2.k0 k0Var = new f2.k0(1, false);
        this.f27031r = k0Var;
        n7Var.setLayoutManager(k0Var);
        n7Var.setHorizontalScrollBarEnabled(false);
        n7Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(n7Var, h7.z5.e(-1, -1, 51));
        a8 a8Var = new a8(this, activity);
        this.f27033s = a8Var;
        n7Var.setAdapter(a8Var);
        n7Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        n7Var.setOnItemClickListener(new gh.a(2));
        n7Var.setOnItemLongClickListener(new t6(this, 3));
        n7Var.setOnScrollListener(new ag.z2(this, 22));
        lh.d dVar = new lh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.B = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i22 = 0;
        spannableStringBuilder.setSpan(new cq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AudioAddToProfile));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {

            public final b8 f28542b;

            {
                this.f28542b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i22) {
                    case 0:
                        b8.E(this.f28542b, c6Var);
                        break;
                    default:
                        b8.D(this.f28542b, c6Var);
                        break;
                }
            }
        });
        this.A.addView(dVar, h7.z5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i23 = 1;
        lh.d dVar2 = new lh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.d();
        this.C = dVar2;
        dVar2.setText(LocaleController.getString(R.string.AudioRemoveFromProfile));
        dVar2.setOnClickListener(new View.OnClickListener(this) {

            public final b8 f28542b;

            {
                this.f28542b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i23) {
                    case 0:
                        b8.E(this.f28542b, c6Var);
                        break;
                    default:
                        b8.D(this.f28542b, c6Var);
                        break;
                }
            }
        });
        this.A.addView(dVar2, h7.z5.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
        this.f27034s0 = savedMusicList;
        boolean z10 = savedMusicList != null;
        this.f27030q0 = z10;
        this.f27013c.f23576i0 = z10;
        this.f27032r0 = s0();
        this.f27035t0 = MediaController.getInstance().getPlaylist();
        if (s0()) {
            zVar = zVarN;
            this.f27020g0 = zVar.a(8, R.drawable.msg_add);
        } else {
            zVar = zVarN;
        }
        org.telegram.ui.ActionBar.v0 v0VarA = zVar.a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new org.telegram.ui.db(this, 3);
        this.f27021h0 = v0VarA;
        v0VarA.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = v0VarA.getSearchField();
        searchField.setHint(LocaleController.getString(R.string.Search));
        int i24 = org.telegram.ui.ActionBar.g6.Oi;
        searchField.setTextColor(getThemedColor(i24));
        searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
        searchField.setCursorColor(getThemedColor(i24));
        if (z10) {
            n7Var.p1();
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6Var));
            this.f27013c.setAlpha(1.0f);
            this.f27011b.setAlpha(0.0f);
            org.telegram.ui.Cells.b2 b2Var = this.N0;
            ag.d2 d2Var2 = this.f27013c;
            Float fValueOf = Float.valueOf(0.0f);
            b2Var.getClass();
            b2Var.a(d2Var2, fValueOf);
        }
        boolean z11 = this.f27035t0.size() > 1;
        a8Var.h = z11;
        if (z11) {
            n7Var.setVisibility(0);
            n7Var.setTranslationY(0.0f);
        } else {
            n7Var.setVisibility(8);
            n7Var.setTranslationY(AndroidUtilities.displaySize.y);
        }
        a8Var.l();
        this.f27013c.setTitle(LocaleController.getString(R.string.AttachMusic));
        MessagesController.SavedMusicList savedMusicList2 = this.f27034s0;
        if (savedMusicList2 != null) {
            if (savedMusicList2.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.f27013c.setTitle(LocaleController.getString(R.string.ProfilePlaylistTitleMine));
            } else {
                this.f27013c.setTitle(LocaleController.formatString(R.string.ProfilePlaylistTitle, DialogObject.getShortName(this.f27034s0.dialogId)));
            }
        } else if (playingMessageObject != null && !MediaController.getInstance().currentPlaylistIsGlobalSearch()) {
            long dialogId = playingMessageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                TLRPC.EncryptedChat encryptedChatN = org.telegram.messenger.y1.n(MessagesController.getInstance(this.currentAccount), dialogId);
                if (encryptedChatN != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChatN.user_id))) != null) {
                    this.f27013c.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                if (playingMessageObject.getSavedDialogId() == 2666000) {
                    this.f27013c.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else {
                    this.f27013c.setTitle(LocaleController.getString(R.string.SavedMessages));
                }
            } else if (DialogObject.isUserDialog(dialogId)) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                if (user2 != null) {
                    this.f27013c.setTitle(ContactsController.formatName(user2.first_name, user2.last_name));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    this.f27013c.setTitle(chat.title);
                }
            }
        }
        if (s0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            f2.f0 f0Var = new f2.f0(new o7(this));
            this.D = f0Var;
            f0Var.d(n7Var);
        }
        this.containerView.addView(this.A, h7.z5.e(-1, ((s0() || this.f27037v0) ? 0 : 52) + 179, 83));
        this.containerView.addView(this.f27016e, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        ((FrameLayout.LayoutParams) this.A.getLayoutParams()).height = AndroidUtilities.dp(((s0() || this.f27037v0) ? 0 : 52) + 179);
        ((FrameLayout.LayoutParams) this.f27016e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(179 + ((s0() || this.f27037v0) ? 0 : 52));
        this.containerView.addView(this.d, h7.z5.c(3.0f, -1));
        this.containerView.addView(this.f27013c);
        i7 i7Var3 = new i7(this, activity, 1);
        this.f27017e0 = i7Var3;
        i7Var3.setAlpha(0.0f);
        i7Var3.setVisibility(4);
        getContainer().addView(i7Var3);
        n9 n9Var = new n9(activity);
        this.f27019f0 = n9Var;
        n9Var.setAspectFit(true);
        n9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        n9Var.setScaleX(0.9f);
        n9Var.setScaleY(0.9f);
        i7Var3.addView(n9Var, h7.z5.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        J0(false);
        H0();
        linearLayout.setVisibility((this.h && a8Var.h() == 0) ? 0 : 8);
        E0();
    }

    public static void B(b8 b8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        MessagesController.getInstance(b8Var.currentAccount).getSavedMusicIds().update(j10, z10);
        long clientUserId = UserConfig.getInstance(b8Var.currentAccount).getClientUserId();
        TLRPC.UserFull userFull = MessagesController.getInstance(b8Var.currentAccount).getUserFull(clientUserId);
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
            MessagesStorage.getInstance(b8Var.currentAccount).updateUserInfo(userFull, true);
            NotificationCenter.getInstance(b8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(clientUserId));
        }
        runnable.run();
    }

    public static void C(b8 b8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new c7(b8Var, tL_error, 2));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i11 = 0;
        while (true) {
            if (i11 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i11).f22401id == i10) {
                    message = messages_messages.messages.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (message != null) {
            b8Var.v0(new MessageObject(b8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new f7(b8Var, 0));
        }
    }

    public static void D(b8 b8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || b8Var.C0 == null) {
            return;
        }
        b8Var.v0(playingMessageObject, false, new ag.l3(28), false);
        b8Var.y0(false);
        org.telegram.messenger.y1.q(R.string.AudioSaveToMyProfileUnsaved, new mc((FrameLayout) b8Var.containerView, c6Var), R.raw.ic_delete, 36);
    }

    public static void E(b8 b8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || b8Var.C0 == null) {
            return;
        }
        b8Var.v0(playingMessageObject, true, new ag.l3(28), false);
        b8Var.y0(true);
        org.telegram.messenger.y1.q(R.string.AudioSaveToMyProfileSaved, new mc((FrameLayout) b8Var.containerView, c6Var), R.raw.saved_messages, 36);
    }

    public static void F(b8 b8Var, float[] fArr) {
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= fArr.length) {
                i10 = -1;
                break;
            } else if (playbackSpeed - 0.1f <= fArr[i10]) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        if (i11 >= fArr.length) {
            i11 = 0;
        }
        MediaController.getInstance().setPlaybackSpeed(true, fArr[i11]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - b8Var.L0 > 300) {
            int i12 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
            if (i12 > 2) {
                i12 = -10;
            }
            MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i12).apply();
            if (i12 >= 0 && b8Var.containerView != null) {
                org.telegram.ui.yi yiVar = new org.telegram.ui.yi(5, 1, b8Var.getContext(), null, z10);
                b8Var.K0 = yiVar;
                yiVar.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                b8Var.K0.setText(LocaleController.getString(R.string.SpeedHint));
                b8Var.A.addView(b8Var.K0, h7.z5.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                b8Var.K0.f(b8Var.R, true);
            }
        }
        b8Var.L0 = jCurrentTimeMillis;
    }

    public static void G(b8 b8Var) {
        new mc((FrameLayout) b8Var.containerView, b8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void H(b8 b8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.pa.t((FrameLayout) b8Var.containerView, b8Var.resourcesProvider, tL_error, false);
    }

    public static void I(b8 b8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.pa.t((FrameLayout) b8Var.containerView, b8Var.resourcesProvider, tL_error, false);
    }

    public static void J(b8 b8Var, View view) {
        m7 m7Var = b8Var.M;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        b70 b70VarG = b70.G(b8Var.container, b8Var.resourcesProvider, view, true);
        b70 b70VarP0 = b8Var.p0(b70VarG, playingMessageObject);
        if (!b8Var.s0()) {
            b70VarG.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new gh.f3(b70VarG, b70VarP0, 6), !b8Var.f27037v0);
            if (!b8Var.f27037v0 && b70VarG.y() != null) {
                b70VarG.y().setRightIcon(R.drawable.msg_arrowright);
            }
            b70VarG.k();
        }
        b70VarG.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new a7(b8Var, b70VarG, 0), !b8Var.f27037v0);
        b70VarG.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new a7(b8Var, b70VarG, 1), !b8Var.f27037v0);
        b70VarG.l(R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat), new a7(b8Var, b70VarG, 2), playingMessageObject.getId() > 0);
        if (b8Var.N) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, b70VarG.f26967e, b70VarG.d, false, false);
            b70VarG.d(f1Var);
            b8Var.L = f1Var;
            f1Var.g(LocaleController.getString(R.string.VideoPlayerChromecast), R.drawable.menu_video_chromecast, null);
            b8Var.L.setOnClickListener(new q2(5, b8Var, b70VarG));
            AndroidUtilities.removeFromParent(m7Var);
            b8Var.L.addView(m7Var, 0, h7.z5.c(-1.0f, -1));
            b8Var.D0();
        }
        b70VarG.m(b8Var.s0(), R.drawable.msg_delete, LocaleController.getString(R.string.ProfilePlaylistRemoveFromProfile), true, new a7(b8Var, b70VarG, 3));
        b70VarG.X(AndroidUtilities.dp(64.0f));
        b70VarG.Z();
    }

    public static void K(b8 b8Var, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Document document, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            b2Var.dismiss();
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = MessagesController.getInstance(b8Var.currentAccount).getInputPeer(UserConfig.getInstance(b8Var.currentAccount).getClientUserId());
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = document.mime_type;
        tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
        ConnectionsManager.getInstance(b8Var.currentAccount).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.gg(8, b8Var, b2Var));
    }

    public static void L(b8 b8Var, MessageObject messageObject, b70 b70Var) {
        ArrayList<MessageObject> arrayListM;
        String string;
        int i10;
        long clientUserId = UserConfig.getInstance(b8Var.currentAccount).getClientUserId();
        int i11 = UserConfig.selectedAccount;
        int i12 = b8Var.currentAccount;
        if (i11 != i12) {
            b8Var.C0.K0(i12);
        }
        TLRPC.TL_document tL_document = null;
        if (messageObject.getId() < 0) {
            if (messageObject.getDocument() instanceof TLRPC.TL_document) {
                arrayListM = null;
                tL_document = (TLRPC.TL_document) messageObject.getDocument();
            } else {
                i10 = 36;
            }
            b70Var.u();
            org.telegram.messenger.y1.q(R.string.AudioSaveToSavedMessagesSaved, new mc((FrameLayout) b8Var.containerView, b8Var.resourcesProvider), R.raw.saved_messages, i10);
        }
        arrayListM = org.telegram.messenger.y1.m(messageObject);
        if (arrayListM != null) {
            SendMessagesHelper.getInstance(b8Var.currentAccount).sendMessage(arrayListM, clientUserId, false, false, true, 0, 0L);
        } else {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(b8Var.currentAccount);
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, clientUserId, null, null, null, null, null, null, true, 0, 0, 0, b8Var.f27034s0, null, false, false);
            clientUserId = clientUserId;
            sendMessagesHelper.sendMessage(sendMessageParamsOf);
        }
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR != null) {
            mc mcVarA0 = mc.a0(n2VarR);
            int i13 = R.raw.forward;
            if (clientUserId == UserConfig.getInstance(b8Var.currentAccount).getClientUserId()) {
                string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else {
                string = clientUserId > 0 ? LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(clientUserId)) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(clientUserId));
            }
            i10 = 36;
            mcVarA0.Q(i13, 36, string).j();
        } else {
            i10 = 36;
        }
        b70Var.u();
        org.telegram.messenger.y1.q(R.string.AudioSaveToSavedMessagesSaved, new mc((FrameLayout) b8Var.containerView, b8Var.resourcesProvider), R.raw.saved_messages, i10);
    }

    public static void P(b8 b8Var) {
        View view = b8Var.d;
        ag.d2 d2Var = b8Var.f27013c;
        n7 n7Var = b8Var.f27026n;
        if (n7Var.getChildCount() <= 0) {
            int paddingTop = n7Var.getPaddingTop();
            b8Var.f27039w0 = paddingTop;
            n7Var.setTopGlowOffset(paddingTop);
            b8Var.containerView.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = n7Var.getChildAt(0);
        lk0 lk0Var = (lk0) n7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.x ? childAt.getTop() : childAt.getBottom();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = iDp;
        }
        boolean z11 = top <= AndroidUtilities.dp(12.0f);
        if ((z11 && d2Var.getTag() == null) || (!z11 && d2Var.getTag() != null)) {
            d2Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = b8Var.f27043y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                b8Var.f27043y0 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            b8Var.f27043y0 = animatorSet2;
            int i10 = 2;
            if (b8Var.f27030q0) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(d2Var, b8Var.N0, z11 ? 1.0f : 0.0f);
                View view2 = b8Var.f27011b;
                Property property = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            b8Var.f27043y0.setDuration(320L);
            b8Var.f27043y0.setInterpolator(er.h);
            b8Var.f27043y0.addListener(new p7(b8Var, i10));
            b8Var.f27043y0.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
        int iC = org.telegram.messenger.rl.C(11.0f, layoutParams.topMargin - AndroidUtilities.statusBarHeight, top);
        if (b8Var.f27039w0 != iC) {
            b8Var.f27039w0 = iC;
            n7Var.setTopGlowOffset((iC - layoutParams.topMargin) - AndroidUtilities.statusBarHeight);
            b8Var.containerView.invalidate();
        }
        int iDp2 = AndroidUtilities.dp(13.0f);
        int translationY = (int) (n7Var.getTranslationY() + ((b8Var.f27039w0 - b8Var.backgroundPaddingTop) - iDp2));
        if ((b8Var.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - b8Var.backgroundPaddingTop) / (AndroidUtilities.dp(4.0f) + iDp2)) : 1.0f) <= 0.5f && i0.b.f(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != b8Var.I0) {
            b8Var.I0 = z10;
            AndroidUtilities.setLightStatusBar(b8Var, z10);
        }
    }

    public static void m(b8 b8Var, MessageObject messageObject) {
        MessagesController.SavedMusicList savedMusicList = b8Var.f27034s0;
        if (savedMusicList != null) {
            savedMusicList.remove(messageObject);
            if (!b8Var.f27034s0.list.isEmpty()) {
                NotificationCenter.getInstance(b8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, b8Var.f27034s0);
            } else {
                MediaController.getInstance().cleanup();
                b8Var.dismiss();
            }
        }
    }

    public static void n(b8 b8Var) {
        new mc((FrameLayout) b8Var.containerView, b8Var.resourcesProvider).t(LocaleController.formatString(R.string.UnknownErrorCode, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
    }

    public static void p(b8 b8Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        b2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.f22408id = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f22392id = document.f22386id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            MessagesController.SavedMusicList savedMusicList = b8Var.f27034s0;
            if (savedMusicList != null) {
                savedMusicList.add(document);
            }
            b8Var.f27035t0.clear();
            b8Var.f27035t0.addAll(b8Var.f27034s0.list);
            b8Var.f27033s.l();
            ConnectionsManager.getInstance(b8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
        }
    }

    public static void q(b8 b8Var, MessageObject messageObject) {
        LaunchActivity launchActivity = b8Var.C0;
        int i10 = UserConfig.selectedAccount;
        int i11 = b8Var.currentAccount;
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
            TLRPC.Chat chat = MessagesController.getInstance(b8Var.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        NotificationCenter.getInstance(b8Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        launchActivity.q0(new org.telegram.ui.rn(bundle), false, false);
        b8Var.dismiss();
    }

    public static void r(b8 b8Var, b70 b70Var) {
        b8Var.y0(true);
        new mc((FrameLayout) b8Var.containerView, b8Var.resourcesProvider).Q(R.raw.saved_messages, 36, LocaleController.getString(R.string.AudioSaveToMyProfileSaved)).j();
        b70Var.u();
    }

    public static ImageLocation r0(MessageObject messageObject) {
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        if (!(closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) && !(closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            closestPhotoSizeWithSize = null;
        }
        if (closestPhotoSizeWithSize != null) {
            return ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        }
        String artworkUrl = messageObject.getArtworkUrl(true);
        if (artworkUrl != null) {
            return ImageLocation.getForPath(artworkUrl);
        }
        return null;
    }

    public static void s(b8 b8Var, int i10, boolean z10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Message message;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new c7(b8Var, tL_error, 3));
                return;
            }
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i11 = 0;
        while (true) {
            if (i11 >= messages_messages.messages.size()) {
                message = null;
                break;
            } else {
                if (messages_messages.messages.get(i11).f22401id == i10) {
                    message = messages_messages.messages.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (message != null) {
            b8Var.v0(new MessageObject(b8Var.currentAccount, message, false, true), z10, runnable, true);
        } else {
            AndroidUtilities.runOnUIThread(new f7(b8Var, 1));
        }
    }

    public static void t(b8 b8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.pa.t((FrameLayout) b8Var.containerView, b8Var.resourcesProvider, tL_error, false);
    }

    public static void u(b8 b8Var, ArrayList arrayList, TLRPC.TL_document tL_document, MessageObject messageObject, org.telegram.ui.gy gyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, int i10) {
        String pluralStringComma;
        long j10;
        ArrayList arrayList3 = arrayList;
        if (arrayList2.size() <= 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId != UserConfig.getInstance(b8Var.currentAccount).getClientUserId() && charSequence == null && arrayList3 != null) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
            long j11 = topicKey.dialogId;
            Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else if (DialogObject.isUserDialog(j11)) {
                bundleH.putLong("user_id", j11);
            } else {
                bundleH.putLong("chat_id", -j11);
            }
            org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundleH);
            if (topicKey.topicId != 0) {
                wf.c.a(rnVar, topicKey);
            }
            if (!b8Var.C0.q0(rnVar, true, false)) {
                gyVar.finishFragment();
                return;
            }
            rnVar.Ab(arrayList3);
            if (topicKey.topicId != 0) {
                gyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        int i11 = 0;
        while (i11 < arrayList2.size()) {
            long j12 = ((MessagesStorage.TopicKey) arrayList2.get(i11)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                SendMessagesHelper.getInstance(b8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            if (arrayList3 != null) {
                SendMessagesHelper.getInstance(b8Var.currentAccount).sendMessage(arrayList3, j10, false, false, true, 0, 0L);
            } else {
                SendMessagesHelper.getInstance(b8Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, messageObject.messageOwner.attachPath, j10, null, null, null, null, null, null, z10, i10, 0, 0, b8Var.f27034s0, null, false, false));
            }
            i11++;
            arrayList3 = arrayList;
        }
        gyVar.finishFragment();
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR != null) {
            mc mcVarA0 = mc.a0(n2VarR);
            int i12 = R.raw.forward;
            if (arrayList2.size() == 1 && ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(b8Var.currentAccount).getClientUserId()) {
                pluralStringComma = LocaleController.getString(R.string.FwdMessageToSavedMessages);
            } else if (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId <= 0) {
                pluralStringComma = (arrayList2.size() != 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId >= 0) ? LocaleController.formatPluralStringComma("FwdMessageToManyChats", arrayList2.size()) : LocaleController.formatString(R.string.FwdMessageToGroup, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            } else {
                pluralStringComma = LocaleController.formatString(R.string.FwdMessageToUser, DialogObject.getShortName(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId));
            }
            mcVarA0.Q(i12, 36, pluralStringComma).j();
        }
    }

    public static void v(b8 b8Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || b8Var.f27034s0 == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        if (document.f22386id == 0) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(b8Var.getContext(), 3, null);
            b2Var.q(180L);
            File file = new File(messageObject.messageOwner.attachPath);
            if (file.exists()) {
                FileLoader.getInstance(b8Var.currentAccount).uploadFile(file.getAbsolutePath(), new gh.i(b8Var, b2Var, document, 7));
                return;
            }
            return;
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f22408id = tL_inputDocument;
        tL_inputDocument.f22392id = document.f22386id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        MessagesController.SavedMusicList savedMusicList = b8Var.f27034s0;
        if (savedMusicList != null) {
            savedMusicList.add(document);
        }
        b8Var.f27035t0.clear();
        b8Var.f27035t0.addAll(b8Var.f27034s0.list);
        b8Var.f27033s.l();
        ConnectionsManager.getInstance(b8Var.currentAccount).sendRequest(tL_account_saveMusic, null);
    }

    public static void w(b8 b8Var, MessageObject messageObject, b70 b70Var) {
        b8Var.f27034s0.remove(messageObject);
        b8Var.f27035t0.remove(messageObject);
        b8Var.f27033s.l();
        b70Var.u();
        b8Var.y0(false);
        org.telegram.messenger.y1.q(R.string.AudioSaveToMyProfileUnsaved, new mc((FrameLayout) b8Var.containerView, b8Var.resourcesProvider), R.raw.ic_delete, 36);
    }

    public static void x(b8 b8Var, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.pa.t((FrameLayout) b8Var.containerView, b8Var.resourcesProvider, tL_error, false);
    }

    public static void y(b8 b8Var) {
        FrameLayout frameLayout = (FrameLayout) b8Var.containerView;
        org.telegram.ui.ActionBar.c6 c6Var = b8Var.resourcesProvider;
        new mc(frameLayout, c6Var).o(lc.B, c6Var).j();
    }

    public static void z(final b8 b8Var, boolean z10, MessageObject messageObject, final boolean z11, final Runnable runnable, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new c7(b8Var, tL_error, 1));
            }
            AndroidUtilities.runOnUIThread(new m2(b8Var, j10, z11, document, runnable));
            return;
        }
        if (z10 || messageObject.getId() < 0) {
            AndroidUtilities.runOnUIThread(new c7(b8Var, tL_error, 0));
            return;
        }
        if (messageObject.getDialogId() >= 0) {
            final int id2 = messageObject.getId();
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.f22474id.add(Integer.valueOf(id2));
            final int i10 = 0;
            ConnectionsManager.getInstance(b8Var.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate(b8Var) {

                public final b8 f27661b;

                {
                    this.f27661b = b8Var;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    switch (i10) {
                        case 0:
                            b8.s(this.f27661b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                        default:
                            b8.C(this.f27661b, id2, z11, runnable, tLObject, tL_error2);
                            break;
                    }
                }
            });
            return;
        }
        final int id3 = messageObject.getId();
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(b8Var.currentAccount).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessages.f22418id.add(Integer.valueOf(id3));
        final int i11 = 1;
        ConnectionsManager.getInstance(b8Var.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate(b8Var) {

            public final b8 f27661b;

            {
                this.f27661b = b8Var;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                switch (i11) {
                    case 0:
                        b8.s(this.f27661b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                    default:
                        b8.C(this.f27661b, id3, z11, runnable, tLObject, tL_error2);
                        break;
                }
            }
        });
    }

    public final void A0(boolean z10, boolean z11) {
        n9 n9Var = this.f27019f0;
        i7 i7Var = this.f27017e0;
        if (z10) {
            if (i7Var.getVisibility() == 0 || this.f27022i0) {
                return;
            }
            i7Var.setTag(1);
            r7 r7Var = this.E;
            n9Var.setImageBitmap(r7Var.f34129a[r7Var.f34130b].getImageReceiver().getBitmap());
            this.f27022i0 = true;
            ol0.d(new u6(this, 1));
            i7Var.setVisibility(0);
            i7Var.animate().alpha(1.0f).setDuration(180L).setListener(new p7(this, 0)).start();
            n9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (i7Var.getVisibility() != 0) {
            return;
        }
        i7Var.setTag(null);
        if (z11) {
            this.f27022i0 = true;
            i7Var.animate().alpha(0.0f).setDuration(180L).setListener(new p7(this, 1)).start();
            n9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            i7Var.setAlpha(0.0f);
            i7Var.setVisibility(4);
            n9Var.setImageBitmap(null);
            n9Var.setScaleX(0.9f);
            n9Var.setScaleY(0.9f);
        }
    }

    public final void B0(org.telegram.ui.Cells.x xVar, MessageObject messageObject) {
        b70 b70VarG = b70.G(this.container, this.resourcesProvider, xVar, true);
        if (s0()) {
            b70VarG.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new z6(this, b70VarG, messageObject, 0), !this.f27037v0);
            b70VarG.l(R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile), new z6(this, b70VarG, messageObject, 1), !this.f27037v0);
            b70VarG.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new z6(this, messageObject, b70VarG, 2), true);
        } else {
            b70VarG.l(R.drawable.msg_stories_save, LocaleController.getString(R.string.AudioSaveTo), new gh.f3(b70VarG, p0(b70VarG, messageObject), 5), !this.f27037v0);
            if (!this.f27037v0 && b70VarG.y() != null) {
                b70VarG.y().setRightIcon(R.drawable.msg_arrowright);
            }
            b70VarG.k();
            b70VarG.l(R.drawable.msg_forward, LocaleController.getString(R.string.Forward), new z6(this, b70VarG, messageObject, 3), !this.f27037v0);
            b70VarG.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new z6(this, b70VarG, messageObject, 4), !this.f27037v0);
            b70VarG.l(R.drawable.msg_view_file, LocaleController.getString(R.string.ShowInChat), new w6(this, messageObject, 1), messageObject.getId() > 0);
        }
        b70VarG.V(LocaleController.isRTL ? 3 : 5);
        b70VarG.Z();
    }

    public final void C0() {
        if (this.D0 == 1) {
            this.G0 = System.currentTimeMillis();
            this.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
            m.i3 i3Var = this.J0;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var);
        }
    }

    public final void D0() {
        org.telegram.ui.ActionBar.v0 v0Var = this.R;
        if (v0Var != null) {
            int themedColor = getThemedColor(Math.abs(MediaController.getInstance().getPlaybackSpeed(true) - 1.0f) < 0.05f ? org.telegram.ui.ActionBar.g6.f23407x7 : org.telegram.ui.ActionBar.g6.Qh);
            af.g gVar = this.S;
            if (gVar != null) {
                ((i6) gVar.f272b).r(themedColor);
                Paint paint = (Paint) gVar.f273c;
                if (paint != null) {
                    paint.setColor(themedColor);
                }
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(themedColor & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        final org.telegram.ui.ActionBar.f1 f1Var = this.L;
        if (f1Var != null) {
            m7 m7Var = this.M;
            boolean z10 = m7Var != null && m7Var.b();
            final int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.E8);
            final int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.F8);
            int i10 = org.telegram.ui.ActionBar.g6.Oh;
            final int themedColor4 = getThemedColor(i10);
            ValueAnimator valueAnimator = f1Var.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f1Var.F ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
            f1Var.E = valueAnimatorOfFloat;
            f1Var.F = z10;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    f1 f1Var2 = f1Var;
                    f1Var2.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i11 = themedColor2;
                    int i12 = themedColor4;
                    f1Var2.setTextColor(i0.b.d(fFloatValue, i11, i12));
                    f1Var2.setIconColor(i0.b.d(fFloatValue, themedColor3, i12));
                }
            });
            f1Var.E.addListener(new org.telegram.ui.ActionBar.e1(f1Var, z10, themedColor2, themedColor4, themedColor3));
            f1Var.E.setInterpolator(er.h);
            f1Var.E.start();
            this.L.setSelectorColor((m7Var == null || !m7Var.b()) ? getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6) : org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)));
        }
    }

    public final void E0() {
        LinearLayout linearLayout = this.v;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.containerView.getMeasuredHeight()) - (this.A.getVisibility() == 0 ? AndroidUtilities.dp(150.0f) : -AndroidUtilities.dp(30.0f))) / 2);
    }

    public final void F0(boolean z10) {
        if (this.R == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
        this.S.l(playbackSpeed, z10);
        this.T.d(playbackSpeed, z10);
        D0();
        boolean z11 = this.U;
        int i10 = 0;
        this.U = false;
        while (true) {
            org.telegram.ui.ActionBar.f1[] f1VarArr = this.V;
            if (i10 >= f1VarArr.length) {
                return;
            }
            if (z11 || Math.abs(playbackSpeed - Q0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.f1 f1Var = f1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.E8;
                f1Var.c(getThemedColor(i11), getThemedColor(i11));
            } else {
                org.telegram.ui.ActionBar.f1 f1Var2 = f1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.g6.Qh;
                f1Var2.c(getThemedColor(i12), getThemedColor(i12));
            }
            i10++;
        }
    }

    public final void G0(MessageObject messageObject, boolean z10) {
        boolean z11;
        int duration;
        t7 t7Var = this.P;
        if (t7Var != null) {
            if (t7Var.v) {
                duration = (int) (messageObject.getDuration() * ((double) t7Var.getProgress()));
            } else {
                if (this.E0 >= 0.0f) {
                    int i10 = this.D0;
                    z11 = true;
                    if (i10 != -1 && (i10 != 1 || !MediaController.getInstance().isMessagePaused())) {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                    t7Var.e(this.E0, z10);
                } else {
                    t7Var.e(messageObject.audioProgress, z10);
                }
                float bufferedProgressFromPosition = 1.0f;
                if (!this.m0) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (Math.abs(jElapsedRealtime - this.f27025l0) >= 500) {
                        bufferedProgressFromPosition = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(messageObject.audioProgress, this.f27041x0) : 1.0f;
                        this.f27025l0 = jElapsedRealtime;
                    } else {
                        bufferedProgressFromPosition = -1.0f;
                    }
                }
                if (bufferedProgressFromPosition != -1.0f) {
                    o1.j jVar = this.f27024k0;
                    jVar.f19147u.f19154i = bufferedProgressFromPosition * 1000.0f;
                    jVar.f();
                }
                if (z11) {
                    duration = (int) (messageObject.getDuration() * ((double) t7Var.getProgress()));
                    messageObject.audioProgressSec = duration;
                } else {
                    duration = messageObject.audioProgressSec;
                }
            }
            if (this.f27044z0 != duration) {
                this.f27044z0 = duration;
                this.Q.l(AndroidUtilities.formatShortDuration(duration), false);
            }
            t7Var.g(messageObject);
        }
    }

    public final void H0() {
        int i10 = SharedConfig.repeatMode;
        org.telegram.ui.ActionBar.v0 v0Var = this.X;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                v0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.g6.Xi;
                v0Var.setTag(Integer.valueOf(i11));
                v0Var.setIconColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.g6.B1(v0Var.getBackground(), getThemedColor(i11) & 436207615, true);
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
        } else if (!SharedConfig.playOrderReversed) {
            v0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i10 == 0) {
            v0Var.setIcon(R.drawable.player_new_order);
        } else {
            v0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i10 == 0 && !SharedConfig.shuffleMusic && !SharedConfig.playOrderReversed) {
            int i12 = org.telegram.ui.ActionBar.g6.Wi;
            v0Var.setTag(Integer.valueOf(i12));
            v0Var.setIconColor(getThemedColor(i12));
            org.telegram.ui.ActionBar.g6.B1(v0Var.getBackground(), getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), true);
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatOff));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.g6.Xi;
        v0Var.setTag(Integer.valueOf(i13));
        v0Var.setIconColor(getThemedColor(i13));
        org.telegram.ui.ActionBar.g6.B1(v0Var.getBackground(), 436207615 & getThemedColor(i13), true);
        if (i10 != 0) {
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrRepeatList));
        } else if (SharedConfig.shuffleMusic) {
            v0Var.setContentDescription(LocaleController.getString(R.string.ShuffleList));
        } else {
            v0Var.setContentDescription(LocaleController.getString(R.string.ReverseOrder));
        }
    }

    public final void I0() {
        x0(this.f27010a0, SharedConfig.shuffleMusic);
        x0(this.f27012b0, SharedConfig.playOrderReversed);
        x0(this.Z, SharedConfig.repeatMode == 1);
        x0(this.Y, SharedConfig.repeatMode == 2);
    }

    public final void J0(boolean z10) {
        File pathToMessage;
        n9 n9Var;
        ImageView imageView;
        int i10;
        Bitmap bitmap;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if ((playingMessageObject == null && z10) || (playingMessageObject != null && !playingMessageObject.isMusic())) {
            dismiss();
            return;
        }
        if (playingMessageObject == null) {
            this.f27036u0 = null;
            return;
        }
        boolean z11 = playingMessageObject == this.f27036u0;
        this.f27036u0 = playingMessageObject;
        long j10 = playingMessageObject.eventId;
        org.telegram.ui.ActionBar.v0 v0Var = this.J;
        if (j10 != 0 || playingMessageObject.getId() <= -2000000000) {
            v0Var.setVisibility(4);
        } else {
            v0Var.setVisibility(0);
        }
        long dialogId = playingMessageObject.getDialogId();
        long j11 = playingMessageObject.getDocument() != null ? playingMessageObject.getDocument().f22386id : 0L;
        boolean z12 = (dialogId < 0 && MessagesController.getInstance(this.currentAccount).isPeerNoForwards(dialogId)) || MessagesController.getInstance(this.currentAccount).isPeerNoForwards(playingMessageObject.getDialogId()) || playingMessageObject.messageOwner.noforwards;
        if (z12 != this.f27037v0) {
            this.f27037v0 = z12;
            i7 i7Var = this.A;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i7Var.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(((z12 || s0()) ? 0 : 52) + 179);
            i7Var.setLayoutParams(layoutParams);
            View view = this.f27016e;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(179 + ((s0() || z12) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z12) {
            v0Var.r(1);
            v0Var.r(2);
            v0Var.r(5);
            v0Var.r(6);
            v0Var.setAdditionalYOffset(-AndroidUtilities.dp(16.0f));
        } else {
            v0Var.K(1);
            v0Var.K(2);
            v0Var.K(5);
            v0Var.setAdditionalYOffset(-AndroidUtilities.dp(197.0f));
        }
        String str = playingMessageObject.messageOwner.attachPath;
        if (str == null || str.length() <= 0) {
            pathToMessage = null;
        } else {
            pathToMessage = new File(playingMessageObject.messageOwner.attachPath);
            if (!pathToMessage.exists()) {
                pathToMessage = null;
            }
        }
        if (pathToMessage == null) {
            pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(playingMessageObject.messageOwner);
        }
        boolean z13 = SharedConfig.streamMedia && ((int) playingMessageObject.getDialogId()) != 0 && playingMessageObject.isMusic();
        boolean zExists = pathToMessage.exists();
        ImageView imageView2 = this.f27014c0;
        t7 t7Var = this.P;
        z70 z70Var = this.O;
        if (zExists || z13) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            z70Var.setVisibility(4);
            t7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String fileName = playingMessageObject.getFileName();
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            z70Var.a(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            z70Var.setVisibility(0);
            t7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        G0(playingMessageObject, !z11);
        r7 r7Var = this.E;
        n9 n9Var2 = z11 ? r7Var.f34129a[r7Var.f34130b] : r7Var.f34129a[r7Var.f34130b == 0 ? (char) 1 : (char) 0];
        se.a audioInfo = MediaController.getInstance().getAudioInfo();
        if (!z11) {
            AnimatorSet animatorSet = r7Var.f34131c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            r7Var.f34131c = new AnimatorSet();
            int i11 = r7Var.f34130b == 0 ? 1 : 0;
            r7Var.f34130b = i11;
            n9[] n9VarArr = r7Var.f34129a;
            n9 n9Var3 = n9VarArr[i11 ^ 1];
            n9 n9Var4 = n9VarArr[i11];
            boolean zHasBitmapImage = n9Var3.getImageReceiver().hasBitmapImage();
            n9Var4.setAlpha(zHasBitmapImage ? 1.0f : 0.0f);
            n9Var4.setScaleX(0.8f);
            n9Var4.setScaleY(0.8f);
            n9Var4.setVisibility(0);
            if (zHasBitmapImage) {
                n9Var3.bringToFront();
            } else {
                n9Var3.setVisibility(8);
                n9Var3.setImageDrawable(null);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat.setDuration(125L);
            valueAnimatorOfFloat.setInterpolator(er.f28123g);
            valueAnimatorOfFloat.addUpdateListener(new ig.y(5, n9Var4, zHasBitmapImage));
            if (zHasBitmapImage) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(n9Var3.getScaleX(), 0.8f);
                valueAnimatorOfFloat2.setDuration(125L);
                valueAnimatorOfFloat2.setInterpolator(er.f28124i);
                valueAnimatorOfFloat2.addUpdateListener(new ag.t2(8, n9Var3, n9Var4));
                valueAnimatorOfFloat2.addListener(new org.telegram.ui.am(n9Var3, 7));
                r7Var.f34131c.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
            } else {
                r7Var.f34131c.play(valueAnimatorOfFloat);
            }
            r7Var.f34131c.start();
        }
        if (audioInfo == null || (bitmap = audioInfo.f47869o) == null) {
            this.f27041x0 = FileLoader.getAttachFileName(playingMessageObject.getDocument());
            this.m0 = false;
            String artworkUrl = playingMessageObject.getArtworkUrl(false);
            ImageLocation imageLocationR0 = r0(playingMessageObject);
            if (TextUtils.isEmpty(artworkUrl)) {
                n9Var = n9Var2;
                imageView = imageView2;
                i10 = 8;
                if (imageLocationR0 != null) {
                    n9Var.k(null, null, imageLocationR0, null, 0L, null, playingMessageObject, 1);
                } else {
                    n9Var.setImageDrawable(null);
                }
            } else {
                ImageLocation forPath = ImageLocation.getForPath(artworkUrl);
                n9Var = n9Var2;
                imageView = imageView2;
                i10 = 8;
                n9Var.k(forPath, null, imageLocationR0, null, 0L, null, playingMessageObject, 1);
            }
            n9Var.invalidate();
        } else {
            n9Var2.setImageBitmap(bitmap);
            this.f27041x0 = null;
            this.m0 = true;
            imageView = imageView2;
            i10 = 8;
        }
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        tf0 tf0Var = this.f27015d0;
        if (zIsMessagePaused) {
            tf0Var.a(false, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            tf0Var.a(true, true);
            imageView.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        String musicTitle = playingMessageObject.getMusicTitle();
        String musicAuthor = playingMessageObject.getMusicAuthor();
        this.F.setText(musicTitle);
        this.I.setText(musicAuthor);
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        this.B.setLoading(savedMusicIds.loading);
        y0(savedMusicIds.ids.contains(Long.valueOf(j11)));
        int duration = (int) playingMessageObject.getDuration();
        this.A0 = duration;
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(duration != 0 ? AndroidUtilities.formatShortDuration(duration) : "-:--");
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.R;
        if (duration > 600) {
            v0Var2.setVisibility(0);
        } else {
            v0Var2.setVisibility(i10);
        }
        if (z11) {
            return;
        }
        MediaController mediaController = MediaController.getInstance();
        ArrayList<MessageObject> playlist = mediaController.getPlaylist();
        if (playlist.size() <= 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int playingMessageObjectNum = mediaController.getPlayingMessageObjectNum();
        int size = playingMessageObjectNum + 1;
        int size2 = playingMessageObjectNum - 1;
        if (size >= playlist.size()) {
            size = 0;
        }
        if (size <= -1) {
            size = playlist.size() - 1;
        }
        if (size2 <= -1) {
            size2 = playlist.size() - 1;
        }
        if (size2 >= playlist.size()) {
            size2 = 0;
        }
        arrayList.add(playlist.get(size));
        if (size != size2) {
            arrayList.add(playlist.get(size2));
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            ImageLocation imageLocationR1 = r0(messageObject);
            if (imageLocationR1 != null) {
                if (imageLocationR1.path != null) {
                    ImageLoader.getInstance().preloadArtwork(imageLocationR1.path);
                } else {
                    FileLoader.getInstance(this.currentAccount).loadFile(imageLocationR1, messageObject, null, 0, 1);
                }
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.x xVar;
        MessageObject messageObject;
        org.telegram.ui.Cells.x xVar2;
        MessageObject messageObject2;
        MessageObject playingMessageObject;
        int i12 = NotificationCenter.messagePlayingDidStart;
        n7 n7Var = this.f27026n;
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            int i13 = NotificationCenter.messagePlayingDidReset;
            J0(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = n7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = n7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && (messageObject = (xVar = (org.telegram.ui.Cells.x) childAt).getMessageObject()) != null && (messageObject.isVoice() || messageObject.isMusic())) {
                        xVar.b(false, true);
                    }
                }
                if (i10 == NotificationCenter.messagePlayingPlayStateChanged && MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        C0();
                    } else if (this.D0 == 1 && this.E0 != -1.0f) {
                        m.i3 i3Var = this.J0;
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        this.H0 = 0L;
                        i3Var.run();
                        this.E0 = -1.0f;
                    }
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int childCount2 = n7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = n7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.x) && (messageObject2 = (xVar2 = (org.telegram.ui.Cells.x) childAt2).getMessageObject()) != null && (messageObject2.isVoice() || messageObject2.isMusic())) {
                        xVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.pr prVar = this.K;
            if (prVar != null) {
                prVar.a(d1.f.t());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || !playingMessageObject2.isMusic()) {
                return;
            }
            G0(playingMessageObject2, false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            F0(true);
            return;
        }
        int i16 = NotificationCenter.musicDidLoad;
        a8 a8Var = this.f27033s;
        if (i10 == i16) {
            this.f27034s0 = MediaController.getInstance().currentSavedMusicList;
            this.f27035t0 = MediaController.getInstance().getPlaylist();
            a8Var.l();
            return;
        }
        if (i10 == NotificationCenter.moreMusicDidLoad) {
            this.f27034s0 = MediaController.getInstance().currentSavedMusicList;
            this.f27035t0 = MediaController.getInstance().getPlaylist();
            a8Var.l();
            if (SharedConfig.playOrderReversed) {
                n7Var.B0();
                int iIntValue = ((Integer) objArr[0]).intValue();
                f2.k0 k0Var = this.f27031r;
                k0Var.L0();
                int iN0 = k0Var.N0();
                if (iN0 != -1) {
                    View viewM = k0Var.m(iN0);
                    k0Var.h1(iN0 + iIntValue, viewM != null ? viewM.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.f27041x0)) {
                J0(false);
                this.m0 = true;
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadProgressChanged) {
            if (i10 == NotificationCenter.musicIdsLoaded) {
                J0(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.f27041x0) || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
            return;
        }
        float bufferedProgressFromPosition = 1.0f;
        if (!this.m0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - this.f27025l0) >= 500) {
                bufferedProgressFromPosition = MediaController.getInstance().isStreamingCurrentAudio() ? FileLoader.getInstance(this.currentAccount).getBufferedProgressFromPosition(playingMessageObject.audioProgress, this.f27041x0) : 1.0f;
                this.f27025l0 = jElapsedRealtime;
            } else {
                bufferedProgressFromPosition = -1.0f;
            }
        }
        if (bufferedProgressFromPosition != -1.0f) {
            o1.j jVar = this.f27024k0;
            jVar.f19147u.f19154i = bufferedProgressFromPosition * 1000.0f;
            jVar.f();
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
        if (this.f27035t0.size() <= 1) {
            return i7Var.getMeasuredHeight() + this.backgroundPaddingTop;
        }
        int iDp = AndroidUtilities.dp(13.0f);
        int translationY = (int) (this.f27026n.getTranslationY() + ((this.f27039w0 - this.backgroundPaddingTop) - iDp));
        if (this.backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float fDp = AndroidUtilities.dp(4.0f) + iDp;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - fDp) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.backgroundPaddingTop) / fDp));
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
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27013c, 64, null, null, null, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27013c, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27013c, 1024, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27013c, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27013c, 134217728, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27013c, 67108864, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23152ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23170je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23363uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23379vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23169jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{org.telegram.ui.Cells.x.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23151id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, org.telegram.ui.ActionBar.g6.f23124h5));
        int i12 = org.telegram.ui.ActionBar.g6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 2048, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23392w7;
        org.telegram.ui.ActionBar.v0 v0Var = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 262152, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 262152, null, null, null, null, org.telegram.ui.ActionBar.g6.f23407x7));
        int i15 = org.telegram.ui.ActionBar.g6.Wi;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Xi));
        int i16 = org.telegram.ui.ActionBar.g6.f23144i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, i16));
        int i17 = org.telegram.ui.ActionBar.g6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, i18));
        org.telegram.ui.ActionBar.v0 v0Var3 = this.J;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3, 0, null, null, null, s6Var, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3, 0, null, null, null, s6Var, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3, 0, null, null, null, s6Var, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3, 0, null, null, null, s6Var, i18));
        k7 k7Var = this.G;
        arrayList.add(new org.telegram.ui.ActionBar.i6(k7Var, (Class[]) null, new oi0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(k7Var, (Class[]) null, new oi0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(k7Var, (Class[]) null, new oi0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 131080, null, null, null, null, i16));
        ImageView imageView = this.f27014c0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 131080, null, null, null, null, i16));
        l7 l7Var = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.i6(l7Var, (Class[]) null, new oi0[]{l7Var.getAnimatedDrawable()}, "Triangle 3", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(l7Var, (Class[]) null, new oi0[]{l7Var.getAnimatedDrawable()}, "Triangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(l7Var, (Class[]) null, new oi0[]{l7Var.getAnimatedDrawable()}, "Rectangle 4", i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 131080, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27016e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27038w, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.W5));
        int i19 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27040x, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27042y, 8, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 4096, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27026n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, i11));
        s7 s7Var = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.i6(s7Var.getTextView(), 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(s7Var.getNextTextView(), 4, null, null, null, null, i10));
        s7 s7Var2 = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.i6(s7Var2.getTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(s7Var2.getNextTextView(), 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        return arrayList;
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
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
        return f11 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f10 < ((float) this.containerView.getLeft()) || f10 > ((float) this.containerView.getRight());
    }

    @Override
    public final void onBackPressed() {
        ag.d2 d2Var = this.f27013c;
        if (d2Var != null && d2Var.f23578j0) {
            d2Var.h(true);
        } else if (this.f27017e0.getTag() != null) {
            A0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        i7 i7Var = this.f27017e0;
        if (view != i7Var) {
            return false;
        }
        i7Var.layout(0, 0, i7Var.getMeasuredWidth(), i7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        i7 i7Var = this.f27017e0;
        if (view != i7Var) {
            return false;
        }
        i7Var.measure(View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getContainer().getMeasuredHeight(), 1073741824));
        return true;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.O.a(Math.min(1.0f, j10 / j11), true);
    }

    public final b70 p0(b70 b70Var, MessageObject messageObject) {
        MessagesController.SavedMusicIds savedMusicIds = MessagesController.getInstance(this.currentAccount).getSavedMusicIds();
        TLRPC.Document document = messageObject.getDocument();
        long j10 = document != null ? document.f22386id : 0L;
        b70 b70VarJ = b70Var.J();
        b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lt0(b70Var, 25), false);
        b70VarJ.k();
        b70VarJ.l(R.drawable.left_status_profile, LocaleController.getString(R.string.AudioSaveToMyProfile), new z6(this, messageObject, b70Var, 6), !savedMusicIds.ids.contains(Long.valueOf(j10)));
        b70VarJ.c(R.drawable.msg_saved, LocaleController.getString(R.string.AudioSaveToSavedMessages), new z6(this, messageObject, b70Var, 7), false);
        b70VarJ.c(R.drawable.menu_download_round, LocaleController.getString(R.string.AudioSaveToMusicFolder), new z6(this, messageObject, b70Var, 8), false);
        b70VarJ.k();
        b70VarJ.p(12, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.AudioSaveToInfo));
        return b70VarJ;
    }

    public final void q0(MessageObject messageObject) {
        ArrayList arrayListM;
        TLRPC.TL_document tL_document;
        int i10 = UserConfig.selectedAccount;
        int i11 = this.currentAccount;
        LaunchActivity launchActivity = this.C0;
        if (i10 != i11) {
            launchActivity.K0(i11);
        }
        Bundle bundleE = org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true);
        bundleE.putBoolean("canSelectTopics", true);
        org.telegram.ui.gy gyVar = new org.telegram.ui.gy(bundleE);
        if (messageObject.getId() >= 0) {
            arrayListM = org.telegram.messenger.y1.m(messageObject);
            tL_document = null;
        } else {
            if (!(messageObject.getDocument() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) messageObject.getDocument();
            arrayListM = null;
        }
        gyVar.f38621y2 = new a1.d(this, arrayListM, tL_document, messageObject, 8);
        launchActivity.p0(gyVar);
        dismiss();
    }

    public final boolean s0() {
        MessagesController.SavedMusicList savedMusicList = this.f27034s0;
        return savedMusicList != null && savedMusicList.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final void show() {
        super.show();
        P0 = this;
    }

    public final void t0(int i10) {
        LaunchActivity launchActivity;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || (launchActivity = this.C0) == null) {
            return;
        }
        if (i10 == 1) {
            q0(playingMessageObject);
            return;
        }
        if (i10 == 2) {
            z0(playingMessageObject);
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                u0(playingMessageObject);
                return;
            }
            if (i10 == 6) {
                xe.b.D().P(MediaController.getInstance().getCurrentChromecastMedia());
                this.M.performClick();
                return;
            } else {
                if (i10 == 7) {
                    v0(playingMessageObject, false, new w6(this, playingMessageObject, 0), false);
                    return;
                }
                if (i10 == 8) {
                    lh.r7 r7Var = new lh.r7(getContext(), true, null, new y6(this, 0), null);
                    r7Var.f16654d0 = true;
                    r7Var.V = false;
                    r7Var.m0.N(true);
                    r7Var.show();
                    return;
                }
                return;
            }
        }
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
        launchActivity.q0(new org.telegram.ui.rn(bundle), false, false);
        dismiss();
    }

    public final void u0(MessageObject messageObject) {
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
        String str = documentFileName;
        String string = messageObject.messageOwner.attachPath;
        if (string != null && string.length() > 0 && !com.google.android.recaptcha.internal.a.v(string)) {
            string = null;
        }
        if (string == null || string.length() == 0) {
            string = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).toString();
        }
        MediaController.saveFile(string, this.C0, 3, str, messageObject.getDocument() != null ? messageObject.getDocument().mime_type : "", new y6(this, 1));
    }

    public final void v0(MessageObject messageObject, boolean z10, Runnable runnable, boolean z11) {
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

    public final boolean w0(boolean z10) {
        int iIndexOf;
        boolean z11;
        f2.k0 k0Var;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            if (z10) {
                n7 n7Var = this.f27026n;
                int childCount = n7Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = n7Var.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.x) && ((org.telegram.ui.Cells.x) childAt).getMessageObject() == playingMessageObject) {
                        if (childAt.getBottom() > n7Var.getMeasuredHeight()) {
                            break;
                        }
                    }
                }
                iIndexOf = this.f27035t0.indexOf(playingMessageObject);
                if (this.f27032r0) {
                    iIndexOf++;
                }
                if (iIndexOf >= 0) {
                    z11 = SharedConfig.playOrderReversed;
                    k0Var = this.f27031r;
                    if (z11) {
                        k0Var.n0(iIndexOf);
                        return true;
                    }
                    k0Var.n0(this.f27035t0.size() - iIndexOf);
                    return true;
                }
            } else {
                iIndexOf = this.f27035t0.indexOf(playingMessageObject);
                if (this.f27032r0) {
                    iIndexOf++;
                }
                if (iIndexOf >= 0) {
                    z11 = SharedConfig.playOrderReversed;
                    k0Var = this.f27031r;
                    if (z11) {
                        k0Var.n0(iIndexOf);
                        return true;
                    }
                    k0Var.n0(this.f27035t0.size() - iIndexOf);
                    return true;
                }
            }
        }
        return false;
    }

    public final void x0(org.telegram.ui.ActionBar.f1 f1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.Xi;
            f1Var.setTextColor(getThemedColor(i10));
            f1Var.setIconColor(getThemedColor(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.g6.E8;
            f1Var.setTextColor(getThemedColor(i11));
            f1Var.setIconColor(getThemedColor(i11));
        }
    }

    public final void y0(final boolean z10) {
        boolean zS0 = s0();
        lh.d dVar = this.C;
        lh.d dVar2 = this.B;
        if (zS0 || this.f27037v0) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        er erVar = er.h;
        final int i10 = 0;
        duration.setInterpolator(erVar).withEndAction(new Runnable(this) {

            public final b8 f34509b;

            {
                this.f34509b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f34509b.B.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.f34509b.C.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i11 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(erVar).withEndAction(new Runnable(this) {

            public final b8 f34509b;

            {
                this.f34509b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f34509b.B.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.f34509b.C.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    public final void z0(MessageObject messageObject) {
        File pathToMessage;
        try {
            if (TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                pathToMessage = null;
            } else {
                pathToMessage = new File(messageObject.messageOwner.attachPath);
                if (!pathToMessage.exists()) {
                    pathToMessage = null;
                }
            }
            if (pathToMessage == null) {
                pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner);
            }
            if (!pathToMessage.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PleaseDownload);
                alertDialog$Builder.o();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(messageObject.getMimeType());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", pathToMessage));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToMessage));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToMessage));
            }
            this.C0.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
        } catch (Exception e9) {
            FileLog.e(e9);
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
