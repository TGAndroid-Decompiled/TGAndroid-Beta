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
import ci.ab;
import ci.m6;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.w9;
import org.webrtc.RendererCommon;
import w7.z5;
public final class k1 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final fw0 f32002b0 = new fw0(new e1(0), new e1(1));
    public static final fw0 f32003c0 = new fw0(new e1(2), new e1(3));
    public static final k1 f32004d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public k2.e G;
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
    public i2.h0 X;
    public com.google.android.gms.internal.cast.p Y;
    public t2 Z;
    public float f32005a;
    public boolean f32006a0;
    public WindowManager f32007b;
    public WindowManager.LayoutParams f32008c;
    public org.telegram.ui.f d;
    public m6 f32009e;
    public t2 f32010f;
    public FrameLayout h;
    public h f32011n;
    public w9 f32012r;
    public ab f32013s;
    public TLRPC.GroupCallParticipant v;
    public boolean f32014w;
    public boolean f32015x;
    public boolean f32016y;

    static {
        ?? obj = new Object();
        obj.f32005a = 1.4f;
        obj.f32011n = new h();
        obj.f32014w = true;
        obj.P = 1.0f;
        obj.X = new i2.h0((Object) obj, 19);
        f32004d0 = obj;
    }

    public static void j() {
        k1 k1Var = f32004d0;
        if (k1Var.V) {
            k1Var.V = false;
            AndroidUtilities.runOnUIThread(new uh(15), 100L);
            k1Var.E.getNotificationCenter().removeObserver(k1Var, NotificationCenter.groupCallUpdated);
            k1Var.E.getNotificationCenter().removeObserver(k1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(k1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = k1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (k1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(k1Var.X);
                k1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(tr.f31215f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(k1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new h1(k1Var));
            animatorSet.start();
            pf.e eVar = k1Var.O;
            if (eVar != null) {
                eVar.c();
                k1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        k1 k1Var = f32004d0;
        k1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !k1Var.V) {
            k1Var.V = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            k1Var.E = accountInstance;
            accountInstance.getNotificationCenter().addObserver(k1Var, NotificationCenter.groupCallUpdated);
            k1Var.E.getNotificationCenter().addObserver(k1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(k1Var, NotificationCenter.didEndCall);
            k1Var.M = k1Var.m();
            k1Var.N = k1Var.l();
            k1Var.P = 1.0f;
            k1Var.K = false;
            o1.k kVar = new o1.k(k1Var, f32002b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f16993u = lVar;
            k1Var.S = kVar;
            o1.k kVar2 = new o1.k(k1Var, f32003c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f16993u = lVar2;
            k1Var.T = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new lg.b(k1Var, 2));
            k1Var.F = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                k1Var.F.setStylusScaleEnabled(false);
            }
            k1Var.G = new k2.e(activity2, new i1(k1Var, scaledTouchSlop));
            k1Var.f32009e = new m6(k1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(k1Var, activity2, 2);
            k1Var.d = fVar;
            fVar.addView(k1Var.f32009e, z5.c(-1.0f, -1));
            k1Var.f32009e.setOutlineProvider(new ai.k2(17));
            k1Var.f32009e.setClipToOutline(true);
            k1Var.f32009e.setBackgroundColor(i6.w0(null, i6.f20891gg, false));
            w9 w9Var = new w9(activity2);
            k1Var.f32012r = w9Var;
            k1Var.f32009e.addView(w9Var, z5.c(-1.0f, -1));
            t2 t2Var = new t2(activity2, false, false, false, false);
            k1Var.f32010f = t2Var;
            t2Var.setAlpha(0.0f);
            k1Var.f32010f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            t2 t2Var2 = k1Var.f32010f;
            t2Var2.f32228a0 = 0;
            t2Var2.d.setRotateTextureWithScreen(true);
            k1Var.f32010f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j1(k1Var));
            k1Var.f32009e.addView(k1Var.f32010f, z5.c(-1.0f, -1));
            ab abVar = new ab(k1Var, activity2, 28);
            k1Var.f32013s = abVar;
            k1Var.f32009e.addView(abVar, z5.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            k1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            k1Var.h.addView(view, z5.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = i6.f20908hg;
            imageView.setColorFilter(i6.w0(null, i11, false));
            int i12 = i6.f20918i6;
            imageView.setBackground(i6.f0(i6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new ai.e2(13));
            float f7 = 38;
            float f10 = 4;
            k1Var.h.addView(imageView, z5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(i6.w0(null, i11, false));
            imageView2.setBackground(i6.f0(i6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o(activity2, 3));
            k1Var.h.addView(imageView2, z5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            k1Var.f32009e.addView(k1Var.h, z5.c(-1.0f, -1));
            k1Var.f32007b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(activity2, false);
            k1Var.f32008c = b10;
            int i13 = k1Var.M;
            b10.width = i13;
            b10.height = k1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            k1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = k1Var.f32008c;
            float dp3 = (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f);
            k1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = k1Var.f32008c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            k1Var.d.setAlpha(0.0f);
            k1Var.d.setScaleX(0.1f);
            k1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f32007b, k1Var.d, k1Var.f32008c);
            k1Var.f32007b.addView(k1Var.d, k1Var.f32008c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(tr.f31215f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(k1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new f1(k1Var, 0));
            animatorSet.start();
            k1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            pf.e eVar = k1Var.O;
            if (eVar != null) {
                eVar.c();
                k1Var.O = null;
            }
            if (activity != null && sf.c.a(activity) == 1) {
                pf.d dVar = new pf.d(activity, k1Var);
                dVar.f44415c = "pip-rtmp-video";
                dVar.f44416e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f44420j = k1Var.d;
                dVar.f44421k = k1Var.f32010f.getPlaceholderView();
                k1Var.O = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        t2 t2Var = this.f32010f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.f32006a0 = true;
        this.f32007b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        pf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f32008c;
            int width = this.O.h.f46793a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f32008c;
            int height = this.O.h.f46793a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f32006a0 = false;
        this.f32007b.addView(this.d, this.f32008c);
        this.d.invalidate();
        t2 t2Var = this.Z;
        if (t2Var != null) {
            t2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override
    public final Bitmap c() {
        t2 t2Var = this.Z;
        if (t2Var != null && t2Var.d.isAvailable()) {
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
        t2 t2Var = this.f32010f;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f32010f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f32010f.getContext(), false, false, false, false);
        this.Z = t2Var;
        t2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.Z;
        t2Var2.f32228a0 = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(this));
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f32016y);
                }
                t2 t2Var = this.Z;
                if (t2Var == null) {
                    t2Var = this.f32010f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f32016y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(t2Var.d, this.f32016y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f32016y, t2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = h9.d(user.f20194id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f32012r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = h9.d(chat.f20047id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f32012r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f32015x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f32014w != z12) {
            this.f32013s.animate().cancel();
            ViewPropertyAnimator animate = this.f32013s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            tr trVar = tr.f31215f;
            duration.setInterpolator(trVar).start();
            this.f32012r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f32012r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(trVar).start();
            this.f32010f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f32010f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(trVar).start();
            this.f32014w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f32008c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f32008c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f32007b, this.d, this.f32008c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f16983b = f13;
        kVar.f16984c = true;
        o1.l lVar = kVar.f16993u;
        float B = a4.a.B(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (B >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f17000i = dp;
        this.S.f();
        o1.k kVar2 = this.T;
        kVar2.f16983b = this.R;
        kVar2.f16984c = true;
        kVar2.f16993u.f17000i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
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
                    this.f32005a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f32005a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(tr.f31215f);
        this.L.addUpdateListener(new r0(this, 2));
        this.L.addListener(new f1(this, 1));
        this.L.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
