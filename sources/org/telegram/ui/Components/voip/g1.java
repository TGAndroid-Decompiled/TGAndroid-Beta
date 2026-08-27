package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.y8;
import org.webrtc.RendererCommon;

public final class g1 implements NotificationCenter.NotificationCenterDelegate, af.a {
    public static final su0 X = new su0(new pc0(20), new pc0(21));
    public static final su0 Y = new su0(new pc0(22), new pc0(23));
    public static final g1 Z;
    public AccountInstance A;
    public ScaleGestureDetector B;
    public m5.o C;
    public boolean D;
    public boolean E;
    public View F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ye.d K;
    public float L;
    public float M;
    public float N;
    public o1.j O;
    public o1.j P;
    public Float Q;
    public boolean R;
    public boolean S;
    public nh.f0 T;
    public bf.e U;
    public r2 V;
    public boolean W;

    public float f33567a;

    public WindowManager f33568b;

    public WindowManager.LayoutParams f33569c;
    public org.telegram.ui.f d;

    public ag.y1 f33570e;

    public r2 f33571f;
    public FrameLayout h;

    public h f33572n;

    public n9 f33573r;

    public ag.s0 f33574s;
    public TLRPC.GroupCallParticipant v;

    public boolean f33575w;

    public boolean f33576x;

    public boolean f33577y;

    static {
        g1 g1Var = new g1();
        g1Var.f33567a = 1.4f;
        g1Var.f33572n = new h();
        g1Var.f33575w = true;
        g1Var.L = 1.0f;
        g1Var.T = new nh.f0(g1Var, 12);
        Z = g1Var;
    }

    public static void j() {
        g1 g1Var = Z;
        if (g1Var.R) {
            g1Var.R = false;
            AndroidUtilities.runOnUIThread(new gc(17), 100L);
            g1Var.A.getNotificationCenter().removeObserver(g1Var, NotificationCenter.groupCallUpdated);
            g1Var.A.getNotificationCenter().removeObserver(g1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(g1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = g1Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (g1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(g1Var.T);
                g1Var.S = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(er.f28122f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(g1Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(g1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(g1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new d1(g1Var));
            animatorSet.start();
            ye.d dVar = g1Var.K;
            if (dVar != null) {
                dVar.c();
                g1Var.K = null;
            }
        }
    }

    public static void n(Activity activity) {
        g1 g1Var = Z;
        g1Var.getClass();
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || g1Var.R) {
            return;
        }
        int i10 = 1;
        g1Var.R = true;
        AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
        g1Var.A = accountInstance;
        accountInstance.getNotificationCenter().addObserver(g1Var, NotificationCenter.groupCallUpdated);
        g1Var.A.getNotificationCenter().addObserver(g1Var, NotificationCenter.applyGroupCallVisibleParticipants);
        NotificationCenter.getGlobalInstance().addObserver(g1Var, NotificationCenter.didEndCall);
        g1Var.I = g1Var.m();
        g1Var.J = g1Var.l();
        g1Var.L = 1.0f;
        g1Var.G = false;
        o1.j jVar = new o1.j(g1Var, X);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.f19147u = kVar;
        g1Var.O = jVar;
        o1.j jVar2 = new o1.j(g1Var, Y);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.f19147u = kVar2;
        g1Var.P = jVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new pf0(g1Var, i10));
        g1Var.B = scaleGestureDetector;
        int i11 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i11 >= 23) {
            g1Var.B.setStylusScaleEnabled(false);
        }
        g1Var.C = new m5.o(context, new e1(g1Var, scaledTouchSlop));
        g1Var.f33570e = new ag.y1(g1Var, context);
        org.telegram.ui.f fVar = new org.telegram.ui.f(g1Var, context, 2);
        g1Var.d = fVar;
        fVar.addView(g1Var.f33570e, z5.c(-1.0f, -1));
        g1Var.f33570e.setOutlineProvider(new cg.l1(15));
        g1Var.f33570e.setClipToOutline(true);
        g1Var.f33570e.setBackgroundColor(g6.w0(null, g6.f23117gg, false));
        n9 n9Var = new n9(context);
        g1Var.f33573r = n9Var;
        g1Var.f33570e.addView(n9Var, z5.c(-1.0f, -1));
        r2 r2Var = new r2(context, false, false, false, false);
        g1Var.f33571f = r2Var;
        r2Var.setAlpha(0.0f);
        g1Var.f33571f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = g1Var.f33571f;
        r2Var2.T = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
        g1Var.f33571f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new f1(g1Var));
        g1Var.f33570e.addView(g1Var.f33571f, z5.c(-1.0f, -1));
        ag.s0 s0Var = new ag.s0(g1Var, context, 26);
        g1Var.f33574s = s0Var;
        g1Var.f33570e.addView(s0Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        g1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        g1Var.h.addView(view, z5.c(-1.0f, -1));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = g6.f23135hg;
        imageView.setColorFilter(g6.w0(null, i12, false));
        int i13 = g6.f23144i6;
        imageView.setBackground(g6.f0(g6.w0(null, i13, false), 1, -1));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new ag.l2(17));
        float f10 = 38;
        float f11 = 4;
        g1Var.h.addView(imageView, z5.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(g6.w0(null, i12, false));
        imageView2.setBackground(g6.f0(g6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new c5(context, 13));
        g1Var.h.addView(imageView2, z5.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        g1Var.f33570e.addView(g1Var.h, z5.c(-1.0f, -1));
        g1Var.f33568b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParamsB = bf.d.b(context, false);
        g1Var.f33569c = layoutParamsB;
        int i14 = g1Var.I;
        layoutParamsB.width = i14;
        layoutParamsB.height = g1Var.J;
        float fDp = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        g1Var.M = fDp;
        layoutParamsB.x = (int) fDp;
        WindowManager.LayoutParams layoutParams = g1Var.f33569c;
        float fDp2 = (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f);
        g1Var.N = fDp2;
        layoutParams.y = (int) fDp2;
        WindowManager.LayoutParams layoutParams2 = g1Var.f33569c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        g1Var.d.setAlpha(0.0f);
        g1Var.d.setScaleX(0.1f);
        g1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f33568b, g1Var.d, g1Var.f33569c);
        g1Var.f33568b.addView(g1Var.d, g1Var.f33569c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f28122f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(g1Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(g1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(g1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new b1(g1Var, 0));
        animatorSet.start();
        g1Var.i(false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        ye.d dVar = g1Var.K;
        if (dVar != null) {
            dVar.c();
            g1Var.K = null;
        }
        if (activity == null || bf.d.a(activity) != 1) {
            return;
        }
        ye.c cVar = new ye.c(activity, g1Var);
        cVar.f49851c = "pip-rtmp-video";
        cVar.f49852e = 1;
        cVar.d = AndroidUtilities.dp(10.0f);
        cVar.f49856j = g1Var.d;
        cVar.f49857k = g1Var.f33571f.getPlaceholderView();
        g1Var.K = cVar.a();
    }

    @Override
    public final Bitmap a() {
        r2 r2Var = this.V;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.V.d.getBitmap();
    }

    @Override
    public final Bitmap c() {
        r2 r2Var = this.f33571f;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.f33571f.d.getBitmap();
    }

    @Override
    public final void d(bf.e eVar) {
        this.U = eVar;
        r2 r2Var = this.f33571f;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        i(true);
        this.W = true;
        this.f33568b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i(false);
        }
    }

    @Override
    public final void f(bf.e eVar) {
        this.U = eVar;
        ye.d dVar = this.K;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f33569c;
            int iWidth = this.K.h.f2081a.width();
            this.I = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.f33569c;
            int iHeight = this.K.h.f2081a.height();
            this.J = iHeight;
            layoutParams2.height = iHeight;
        }
        this.W = false;
        this.f33568b.addView(this.d, this.f33569c);
        this.d.invalidate();
        r2 r2Var = this.V;
        if (r2Var != null) {
            r2Var.d.release();
            this.V = null;
        }
        i(true);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        r2 r2Var = new r2(this.f33571f.getContext(), false, false, false, false);
        this.V = r2Var;
        r2Var.d.setOpaque(false);
        this.V.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = this.V;
        r2Var2.T = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
        this.V.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new c1(this));
        View view = this.V.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.V;
    }

    public final void i(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z11 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z10 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f33577y);
                }
                r2 r2Var = this.V;
                if (r2Var == null) {
                    r2Var = this.f33571f;
                }
                this.f33577y = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(r2Var.d, this.f33577y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f33577y, r2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    int iD = user != null ? y8.d(user.f22527id) : i0.b.d(0.2f, -16777216, -1);
                    this.f33573r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, iD, -16777216), i0.b.d(0.4f, iD, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int iD2 = chat != null ? y8.d(chat.f22380id) : i0.b.d(0.2f, -16777216, -1);
                    this.f33573r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, iD2, -16777216), i0.b.d(0.4f, iD2, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f33576x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z11 = true;
        }
        if (this.f33575w != z11) {
            this.f33574s.animate().cancel();
            ViewPropertyAnimator duration = this.f33574s.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L);
            er erVar = er.f28122f;
            duration.setInterpolator(erVar).start();
            this.f33573r.animate().cancel();
            this.f33573r.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(erVar).start();
            this.f33571f.animate().cancel();
            this.f33571f.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(erVar).start();
            this.f33575w = z11;
        }
        if (this.I == m() * this.L && this.J == l() * this.L) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f33569c;
        int iM = (int) (m() * this.L);
        this.I = iM;
        layoutParams.width = iM;
        WindowManager.LayoutParams layoutParams2 = this.f33569c;
        int iL = (int) (l() * this.L);
        this.J = iL;
        layoutParams2.height = iL;
        AndroidUtilities.updateViewLayout(this.f33568b, this.d, this.f33569c);
        o1.j jVar = this.O;
        float f10 = this.M;
        jVar.f19138b = f10;
        jVar.f19139c = true;
        o1.k kVar = jVar.f19147u;
        float fD = a9.p.d(m(), this.L, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        kVar.f19154i = fD >= f11 / 2.0f ? (f11 - (m() * this.L)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.O.f();
        o1.j jVar2 = this.P;
        float f12 = this.N;
        jVar2.f19138b = f12;
        jVar2.f19139c = true;
        jVar2.f19147u.f19154i = h7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.L)) - AndroidUtilities.dp(16.0f));
        this.P.f();
    }

    public final float k() {
        float f10;
        if (this.Q == null) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                f10 = 0.5625f;
            } else {
                float f11 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f11 != 0.0f) {
                    f10 = 1.0f / f11;
                } else {
                    f10 = 0.5625f;
                }
            }
            this.Q = Float.valueOf(f10);
            Point point = AndroidUtilities.displaySize;
            this.f33567a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.Q.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float fMin;
        float f10;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            fMin = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (fMin * f10);
    }

    public final void o(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.H = duration;
        duration.setInterpolator(er.f28122f);
        this.H.addUpdateListener(new lh.m2(this, 12));
        this.H.addListener(new b1(this, 1));
        this.H.start();
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void e(Canvas canvas) {
    }
}
