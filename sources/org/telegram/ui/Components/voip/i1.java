package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.d5;
import bi.n7;
import bi.nc;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.webrtc.RendererCommon;
import w7.a6;
public final class i1 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final sv0 f28167b0 = new sv0(new gp0(11), new gp0(12));
    public static final sv0 f28168c0 = new sv0(new gp0(13), new gp0(14));
    public static final i1 f28169d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public l2.h G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public pf.e O;
    public float P;
    public float Q;
    public float R;
    public o1.k S;
    public o1.k T;
    public Float U;
    public boolean V;
    public boolean W;
    public x X;
    public com.google.android.gms.internal.cast.p Y;
    public r2 Z;
    public float f28170a;
    public boolean f28171a0;
    public WindowManager f28172b;
    public WindowManager.LayoutParams f28173c;
    public org.telegram.ui.f d;
    public n7 e;
    public r2 f28174f;
    public FrameLayout h;
    public h f28175n;
    public w9 f28176r;
    public nc f28177s;
    public TLRPC.GroupCallParticipant v;
    public boolean f28178w;
    public boolean f28179x;
    public boolean f28180y;

    static {
        ?? obj = new Object();
        obj.f28170a = 1.4f;
        obj.f28175n = new h();
        obj.f28178w = true;
        obj.P = 1.0f;
        obj.X = new x(obj, 1);
        f28169d0 = obj;
    }

    public static void j() {
        i1 i1Var = f28169d0;
        if (i1Var.V) {
            i1Var.V = false;
            AndroidUtilities.runOnUIThread(new c30(8), 100L);
            i1Var.E.getNotificationCenter().removeObserver(i1Var, NotificationCenter.groupCallUpdated);
            i1Var.E.getNotificationCenter().removeObserver(i1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(i1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = i1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(i1Var.X);
                i1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(wr.f28819f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new f1(i1Var));
            animatorSet.start();
            pf.e eVar = i1Var.O;
            if (eVar != null) {
                eVar.c();
                i1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        i1 i1Var = f28169d0;
        i1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !i1Var.V) {
            i1Var.V = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            i1Var.E = accountInstance;
            accountInstance.getNotificationCenter().addObserver(i1Var, NotificationCenter.groupCallUpdated);
            i1Var.E.getNotificationCenter().addObserver(i1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(i1Var, NotificationCenter.didEndCall);
            i1Var.M = i1Var.m();
            i1Var.N = i1Var.l();
            i1Var.P = 1.0f;
            i1Var.K = false;
            o1.k kVar = new o1.k(i1Var, f28167b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f14134u = lVar;
            i1Var.S = kVar;
            o1.k kVar2 = new o1.k(i1Var, f28168c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f14134u = lVar2;
            i1Var.T = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new kg.b(i1Var, 2));
            i1Var.F = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                i1Var.F.setStylusScaleEnabled(false);
            }
            i1Var.G = new l2.h(activity2, new g1(i1Var, scaledTouchSlop));
            i1Var.e = new n7(i1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(i1Var, activity2, 2);
            i1Var.d = fVar;
            fVar.addView(i1Var.e, a6.c(-1.0f, -1));
            i1Var.e.setOutlineProvider(new bi.g(14));
            i1Var.e.setClipToOutline(true);
            i1Var.e.setBackgroundColor(j6.w0(null, j6.f17990gg, false));
            w9 w9Var = new w9(activity2);
            i1Var.f28176r = w9Var;
            i1Var.e.addView(w9Var, a6.c(-1.0f, -1));
            r2 r2Var = new r2(activity2, false, false, false, false);
            i1Var.f28174f = r2Var;
            r2Var.setAlpha(0.0f);
            i1Var.f28174f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            r2 r2Var2 = i1Var.f28174f;
            r2Var2.f28373a0 = 0;
            r2Var2.d.setRotateTextureWithScreen(true);
            i1Var.f28174f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new h1(i1Var));
            i1Var.e.addView(i1Var.f28174f, a6.c(-1.0f, -1));
            nc ncVar = new nc(i1Var, activity2, 27);
            i1Var.f28177s = ncVar;
            i1Var.e.addView(ncVar, a6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            i1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            i1Var.h.addView(view, a6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = j6.f18007hg;
            imageView.setColorFilter(j6.w0(null, i11, false));
            int i12 = j6.f18017i6;
            imageView.setBackground(j6.f0(j6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new d5(12));
            float f7 = 38;
            float f10 = 4;
            i1Var.h.addView(imageView, a6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(j6.w0(null, i11, false));
            imageView2.setBackground(j6.f0(j6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new ai.u(activity2, 29));
            i1Var.h.addView(imageView2, a6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            i1Var.e.addView(i1Var.h, a6.c(-1.0f, -1));
            i1Var.f28172b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(activity2, false);
            i1Var.f28173c = b10;
            int i13 = i1Var.M;
            b10.width = i13;
            b10.height = i1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            i1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = i1Var.f28173c;
            float dp3 = (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f);
            i1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = i1Var.f28173c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            i1Var.d.setAlpha(0.0f);
            i1Var.d.setScaleX(0.1f);
            i1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f28172b, i1Var.d, i1Var.f28173c);
            i1Var.f28172b.addView(i1Var.d, i1Var.f28173c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(wr.f28819f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new d1(i1Var, 0));
            animatorSet.start();
            i1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            pf.e eVar = i1Var.O;
            if (eVar != null) {
                eVar.c();
                i1Var.O = null;
            }
            if (activity != null && sf.c.a(activity) == 1) {
                pf.d dVar = new pf.d(activity, i1Var);
                dVar.f39911c = "pip-rtmp-video";
                dVar.e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f39915j = i1Var.d;
                dVar.f39916k = i1Var.f28174f.getPlaceholderView();
                i1Var.O = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        r2 r2Var = this.f28174f;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        i(true);
        this.f28171a0 = true;
        this.f28172b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        pf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f28173c;
            int width = this.O.h.f41839a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f28173c;
            int height = this.O.h.f41839a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f28171a0 = false;
        this.f28172b.addView(this.d, this.f28173c);
        this.d.invalidate();
        r2 r2Var = this.Z;
        if (r2Var != null) {
            r2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override
    public final Bitmap c() {
        r2 r2Var = this.Z;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.Z.d.getBitmap();
        }
        return null;
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
    public final Bitmap e() {
        r2 r2Var = this.f28174f;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f28174f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        r2 r2Var = new r2(this.f28174f.getContext(), false, false, false, false);
        this.Z = r2Var;
        r2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = this.Z;
        r2Var2.f28373a0 = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new e1(this));
        View view = this.Z.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Z;
    }

    public final void i(boolean z10) {
        float dp;
        float f7;
        float f10;
        float f11;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        boolean z11;
        int d;
        int d10;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z12 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z10 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f28180y);
                }
                r2 r2Var = this.Z;
                if (r2Var == null) {
                    r2Var = this.f28174f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f28180y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(r2Var.d, this.f28180y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f28180y, r2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = g9.d(user.f17342id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f28176r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = g9.d(chat.f17195id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f28176r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f28179x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f28178w != z12) {
            this.f28177s.animate().cancel();
            ViewPropertyAnimator animate = this.f28177s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            wr wrVar = wr.f28819f;
            duration.setInterpolator(wrVar).start();
            this.f28176r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f28176r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(wrVar).start();
            this.f28174f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f28174f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(wrVar).start();
            this.f28178w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f28173c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f28173c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f28172b, this.d, this.f28173c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f14125b = f13;
        kVar.f14126c = true;
        o1.l lVar = kVar.f14134u;
        float A = a4.a.A(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (A >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f14140i = dp;
        this.S.f();
        o1.k kVar2 = this.T;
        kVar2.f14125b = this.R;
        kVar2.f14126c = true;
        kVar2.f14134u.f14140i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
        this.T.f();
    }

    public final float k() {
        float f7;
        if (this.U == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f10 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f10 != 0.0f) {
                    f7 = 1.0f / f10;
                    this.U = Float.valueOf(f7);
                    Point point = AndroidUtilities.displaySize;
                    this.f28170a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f28170a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.U.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float min;
        float f7;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void o(boolean z10) {
        float f7;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(200L);
        this.L = duration;
        duration.setInterpolator(wr.f28819f);
        this.L.addUpdateListener(new ai.a(this, 18));
        this.L.addListener(new d1(this, 1));
        this.L.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
