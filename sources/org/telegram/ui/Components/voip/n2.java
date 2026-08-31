package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import k7.c6;
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sx0;
import org.webrtc.RendererCommon;
public final class n2 implements VoIPService.StateListener, ef.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean Q = false;
    public static n2 R;
    public static n2 S;
    public static int T;
    public final int B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public long H;
    public int I;
    public AnimatorSet K;
    public t2 N;
    public c2.p O;
    public final ag.l f32201a;
    public final m2 f32202b;
    public WindowManager f32203c;
    public WindowManager.LayoutParams d;
    public cf.f f32204e;
    public final int f32205f;
    public final int h;
    public final t2 f32206n;
    public final t2 f32207r;
    public float f32208s;
    public ValueAnimator v;
    public final int f32211y;
    public final f5 f32209w = new f5(this, 7);
    public final float[] f32210x = new float[2];
    public final androidx.emoji2.text.n J = new androidx.emoji2.text.n(6);
    public final j2 L = new j2(this, 0);
    public final j2 M = new j2(this, 1);
    public final l2 P = new l2(this);

    public n2(Context context, int i10, int i11, boolean z4) {
        this.f32205f = i10;
        this.h = i11;
        float f10 = i11 * 0.4f;
        int i12 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.B = i12;
        float f11 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f11) - f11)) / 2;
        this.f32211y = i13;
        ag.l lVar = new ag.l(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 19);
        this.f32201a = lVar;
        lVar.setWillNotDraw(false);
        lVar.setPadding(i13, i12, i13, i12);
        m2 m2Var = new m2(this, context);
        this.f32202b = m2Var;
        t2 t2Var = new t2(context, false, true);
        this.f32207r = t2Var;
        t2Var.U = 3;
        t2 t2Var2 = new t2(context, false, true);
        this.f32206n = t2Var2;
        t2Var2.d.setMirror(true);
        m2Var.addView(t2Var);
        m2Var.addView(t2Var2);
        m2Var.setBackgroundColor(-7829368);
        lVar.addView(m2Var);
        lVar.setClipChildren(false);
        lVar.setClipToPadding(false);
        if (z4) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            m2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            m2Var.addView(imageView, c6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            m2Var.addView(imageView2, c6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new eg.m(17));
            imageView2.setOnClickListener(new sx0(11, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (Q) {
            return;
        }
        n2 n2Var = S;
        if (n2Var != null) {
            n2Var.j();
        }
        n2 n2Var2 = R;
        if (n2Var2 != null) {
            n2Var2.j();
        }
        S = null;
        R = null;
    }

    public static n2 k() {
        n2 n2Var = S;
        if (n2Var != null) {
            return n2Var;
        }
        return R;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        WindowManager windowManager;
        if (R == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f10 = i12;
            float f11 = f10 * 0.4f;
            float f12 = i11;
            float f13 = 0.4f * f12;
            layoutParams.height = (int) ((f10 * 0.25f) + ((((int) ((f11 * 1.05f) - f11)) / 2) * 2));
            layoutParams.width = (int) ((f12 * 0.25f) + ((((int) ((1.05f * f13) - f13)) / 2) * 2));
            layoutParams.gravity = 51;
            layoutParams.format = -3;
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            } else {
                layoutParams.type = 99;
            }
            layoutParams.flags = 16778120;
            R = new n2(activity, i11, i12, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            n2 n2Var = R;
            n2Var.I = i10;
            n2Var.f32203c = windowManager;
            n2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
            n2 n2Var2 = R;
            n2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f16 = point.x;
            float f17 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f18 = n2Var2.f32205f * 0.25f;
            float f19 = n2Var2.h * 0.25f;
            m2 m2Var = n2Var2.f32202b;
            if (m2Var.getMeasuredWidth() != 0) {
                f18 = m2Var.getMeasuredWidth();
            }
            if (m2Var.getMeasuredWidth() != 0) {
                f19 = m2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = n2Var2.d;
            layoutParams2.x = (int) (((((f16 - dp) - dp2) - f18) * f14) - (n2Var2.f32211y - dp));
            layoutParams2.y = (int) (((((f17 - dp3) - dp4) - f19) * f15) - (n2Var2.B - dp3));
            AndroidUtilities.updateViewLayout(n2Var2.f32203c, n2Var2.f32201a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(R, NotificationCenter.didEndCall);
            windowManager.addView(R.f32201a, layoutParams);
            R.f32206n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            R.f32207r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), R.P);
            if (i13 == 0) {
                R.f32201a.setScaleX(0.5f);
                R.f32201a.setScaleY(0.5f);
                R.f32201a.setAlpha(0.0f);
                R.f32201a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    n2 n2Var3 = R;
                    sharedInstance.setSinks(n2Var3.f32206n.d, n2Var3.f32207r.d);
                }
            } else if (i13 == 1) {
                R.f32201a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    n2 n2Var4 = R;
                    sharedInstance2.setBackgroundSinks(n2Var4.f32206n.d, n2Var4.f32207r.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ff.d.a(activity) == 1) {
                n2 n2Var5 = R;
                cf.e eVar = new cf.e(activity, n2Var5);
                eVar.f2482c = "voip-pip";
                eVar.f2483e = 1;
                t2 t2Var = n2Var5.f32207r;
                eVar.f2487j = t2Var.d;
                eVar.f2488k = t2Var.getPlaceholderView();
                n2Var5.f32204e = eVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.O = pVar;
        WindowManager windowManager = this.f32203c;
        WindowManager.LayoutParams layoutParams = this.d;
        ag.l lVar = this.f32201a;
        windowManager.addView(lVar, layoutParams);
        t2 t2Var = this.N;
        if (t2Var != null) {
            t2Var.d.release();
            this.N = null;
        }
        lVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f32206n.d, this.f32207r.d);
        }
    }

    @Override
    public final Bitmap b() {
        t2 t2Var = this.N;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.N.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        t2 t2Var = this.f32207r;
        if (t2Var != null) {
            s2 s2Var = t2Var.d;
            if (s2Var.isAvailable()) {
                return s2Var.getBitmap();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override
    public final void e(c2.p pVar) {
        this.O = pVar;
        t2 t2Var = this.f32207r;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f32206n.d, this.N.d);
        }
        WindowManager windowManager = this.f32203c;
        ag.l lVar = this.f32201a;
        windowManager.removeView(lVar);
        lVar.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f32207r.getContext(), false, true, false, false);
        this.N = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.N.d.setEnableHardwareScaler(true);
        this.N.d.setRotateTextureWithScreen(true);
        t2 t2Var2 = this.N;
        t2Var2.U = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new k2(this));
        View view = this.N.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.N;
    }

    public final void j() {
        this.f32206n.d.release();
        this.f32207r.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f32201a.setVisibility(8);
        if (this.f32201a.getParent() != null) {
            m2 m2Var = this.f32202b;
            float[] fArr = this.f32210x;
            int i10 = m2.h;
            m2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            n2 n2Var = m2Var.f32196f;
            int i11 = n2Var.d.x;
            m2 m2Var2 = n2Var.f32202b;
            float left = m2Var2.getLeft() + i11;
            float f10 = m2Var.f32193b;
            fArr[0] = (left - f10) / (((point.x - f10) - m2Var.f32194c) - m2Var2.getMeasuredWidth());
            float top = m2Var2.getTop() + n2Var.d.y;
            float f11 = m2Var.d;
            fArr[1] = (top - f11) / (((point.y - f11) - m2Var.f32195e) - m2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f32210x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f32210x[1]))).apply();
            try {
                this.f32203c.removeView(this.f32201a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        cf.f fVar = this.f32204e;
        if (fVar != null) {
            fVar.c();
            this.f32204e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z4;
        boolean z10;
        boolean z11;
        if (this.f32202b.getMeasuredWidth() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z12 = this.D;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f10 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.C = z11;
            t2 t2Var = this.f32206n;
            t2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            t2Var.setIsScreencast(sharedInstance.isScreencast());
            t2Var.d(1.0f, false);
        }
        if (!z4) {
            if (!this.D) {
                f10 = 0.0f;
            }
            this.f32208s = f10;
        } else if (z12 != this.D) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f32208s;
            if (!this.D) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.f32209w);
            this.v.setDuration(300L).setInterpolator(pr.f30183f);
            this.v.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        m();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            Context context = R.f32201a.getContext();
            if (this.f32204e == null && ff.d.a(context) == 1 && (context instanceof Activity)) {
                cf.e eVar = new cf.e((Activity) context, this);
                eVar.f2482c = "voip-pip";
                eVar.f2483e = 1;
                t2 t2Var = this.f32207r;
                eVar.f2487j = t2Var.d;
                eVar.f2488k = t2Var.getPlaceholderView();
                this.f32204e = eVar.a();
            }
        } else {
            cf.f fVar = this.f32204e;
            if (fVar != null) {
                fVar.c();
                this.f32204e = null;
            }
        }
        m();
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z4 && this.C) {
                sharedInstance.setVideoState(false, 1);
            } else if (z4 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new jc(19), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            i();
        } else if (i10 == 3 && !sharedInstance.isVideoAvailable()) {
            i();
        } else {
            m();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
    }
}
