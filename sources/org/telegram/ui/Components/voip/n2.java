package org.telegram.ui.Components.voip;

import ai.aa;
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
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vt;
import org.webrtc.RendererCommon;
import w7.x5;
public final class n2 implements VoIPService.StateListener, sf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean U = false;
    public static n2 V;
    public static n2 W;
    public static int X;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public long L;
    public int M;
    public AnimatorSet O;
    public t2 R;
    public com.google.android.gms.internal.cast.p S;
    public final m6 f32148a;
    public final m2 f32149b;
    public WindowManager f32150c;
    public WindowManager.LayoutParams d;
    public qf.e f32151e;
    public final int f32152f;
    public final int h;
    public final View f32153n;
    public final t2 f32154r;
    public final t2 f32155s;
    public float v;
    public ValueAnimator f32156w;
    public final s0 f32157x = new s0(this, 4);
    public final float[] f32158y = new float[2];
    public final aa N = new aa(6);
    public final j2 P = new j2(this, 0);
    public final j2 Q = new j2(this, 1);
    public final l2 T = new l2(this);

    public n2(int i10, int i11, Context context, boolean z10) {
        this.f32152f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.F = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.E = i13;
        m6 m6Var = new m6(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 15);
        this.f32148a = m6Var;
        m6Var.setWillNotDraw(false);
        m6Var.setPadding(i13, i12, i13, i12);
        m2 m2Var = new m2(this, context);
        this.f32149b = m2Var;
        t2 t2Var = new t2(context, false, true);
        this.f32155s = t2Var;
        t2Var.f32270a0 = 3;
        t2 t2Var2 = new t2(context, false, true);
        this.f32154r = t2Var2;
        t2Var2.d.setMirror(true);
        m2Var.addView(t2Var);
        m2Var.addView(t2Var2);
        m2Var.setBackgroundColor(-7829368);
        m6Var.addView(m2Var);
        m6Var.setClipChildren(false);
        m6Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.f32153n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            m2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            m2Var.addView(imageView, x5.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 53));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            m2Var.addView(imageView2, x5.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 51));
            imageView.setOnClickListener(new ai.e2(15));
            imageView2.setOnClickListener(new vt(26, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (U) {
            return;
        }
        n2 n2Var = W;
        if (n2Var != null) {
            n2Var.j();
        }
        n2 n2Var2 = V;
        if (n2Var2 != null) {
            n2Var2.j();
        }
        W = null;
        V = null;
    }

    public static n2 k() {
        n2 n2Var = W;
        if (n2Var != null) {
            return n2Var;
        }
        return V;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        WindowManager windowManager;
        if (V == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f7 = i12;
            float f10 = f7 * 0.4f;
            float f11 = i11;
            float f12 = 0.4f * f11;
            layoutParams.height = (int) ((f7 * 0.25f) + ((((int) ((f10 * 1.05f) - f10)) / 2) * 2));
            layoutParams.width = (int) ((f11 * 0.25f) + ((((int) ((1.05f * f12) - f12)) / 2) * 2));
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
            V = new n2(i11, i12, activity, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            n2 n2Var = V;
            n2Var.M = i10;
            n2Var.f32150c = windowManager;
            n2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
            n2 n2Var2 = V;
            n2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f15 = point.x;
            float f16 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f17 = n2Var2.f32152f * 0.25f;
            float f18 = n2Var2.h * 0.25f;
            m2 m2Var = n2Var2.f32149b;
            if (m2Var.getMeasuredWidth() != 0) {
                f17 = m2Var.getMeasuredWidth();
            }
            if (m2Var.getMeasuredWidth() != 0) {
                f18 = m2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = n2Var2.d;
            layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (n2Var2.E - dp));
            layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (n2Var2.F - dp3));
            AndroidUtilities.updateViewLayout(n2Var2.f32150c, n2Var2.f32148a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(V, NotificationCenter.didEndCall);
            windowManager.addView(V.f32148a, layoutParams);
            V.f32154r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            V.f32155s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), V.T);
            if (i13 == 0) {
                V.f32148a.setScaleX(0.5f);
                V.f32148a.setScaleY(0.5f);
                V.f32148a.setAlpha(0.0f);
                V.f32148a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    n2 n2Var3 = V;
                    sharedInstance.setSinks(n2Var3.f32154r.d, n2Var3.f32155s.d);
                }
            } else if (i13 == 1) {
                V.f32148a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    n2 n2Var4 = V;
                    sharedInstance2.setBackgroundSinks(n2Var4.f32154r.d, n2Var4.f32155s.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
                n2 n2Var5 = V;
                qf.d dVar = new qf.d(activity, n2Var5);
                dVar.f46231c = "voip-pip";
                dVar.f46232e = 1;
                t2 t2Var = n2Var5.f32155s;
                dVar.f46236j = t2Var.d;
                dVar.f46237k = t2Var.getPlaceholderView();
                n2Var5.f32151e = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        t2 t2Var = this.f32155s;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f32154r.d, this.R.d);
        }
        WindowManager windowManager = this.f32150c;
        m6 m6Var = this.f32148a;
        windowManager.removeView(m6Var);
        m6Var.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        WindowManager windowManager = this.f32150c;
        WindowManager.LayoutParams layoutParams = this.d;
        m6 m6Var = this.f32148a;
        windowManager.addView(m6Var, layoutParams);
        t2 t2Var = this.R;
        if (t2Var != null) {
            t2Var.d.release();
            this.R = null;
        }
        m6Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f32154r.d, this.f32155s.d);
        }
    }

    @Override
    public final Bitmap c() {
        t2 t2Var = this.R;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.R.d.getBitmap();
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
    public final Bitmap e() {
        t2 t2Var = this.f32155s;
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
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f32155s.getContext(), false, true, false, false);
        this.R = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        t2 t2Var2 = this.R;
        t2Var2.f32270a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new k2(this));
        View view = this.R.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.R;
    }

    public final void j() {
        this.f32154r.d.release();
        this.f32155s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f32148a.setVisibility(8);
        if (this.f32148a.getParent() != null) {
            m2 m2Var = this.f32149b;
            float[] fArr = this.f32158y;
            int i10 = m2.h;
            m2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            n2 n2Var = m2Var.f32109f;
            int i11 = n2Var.d.x;
            m2 m2Var2 = n2Var.f32149b;
            float left = m2Var2.getLeft() + i11;
            float f7 = m2Var.f32106b;
            fArr[0] = (left - f7) / (((point.x - f7) - m2Var.f32107c) - m2Var2.getMeasuredWidth());
            float top = m2Var2.getTop() + n2Var.d.y;
            float f10 = m2Var.d;
            fArr[1] = (top - f10) / (((point.y - f10) - m2Var.f32108e) - m2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f32158y[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f32158y[1]))).apply();
            try {
                this.f32150c.removeView(this.f32148a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        qf.e eVar = this.f32151e;
        if (eVar != null) {
            eVar.c();
            this.f32151e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f32149b.getMeasuredWidth() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.H;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f7 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.H = z11;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.G = z12;
            t2 t2Var = this.f32154r;
            t2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            t2Var.setIsScreencast(sharedInstance.isScreencast());
            t2Var.d(1.0f, false);
        }
        if (!z10) {
            if (!this.H) {
                f7 = 0.0f;
            }
            this.v = f7;
        } else if (z13 != this.H) {
            ValueAnimator valueAnimator = this.f32156w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.v;
            if (!this.H) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32156w = ofFloat;
            ofFloat.addUpdateListener(this.f32157x);
            this.f32156w.setDuration(300L).setInterpolator(is.f27451f);
            this.f32156w.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        m();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            Context context = V.f32148a.getContext();
            if (this.f32151e == null && tf.c.a(context) == 1 && (context instanceof Activity)) {
                qf.d dVar = new qf.d((Activity) context, this);
                dVar.f46231c = "voip-pip";
                dVar.f46232e = 1;
                t2 t2Var = this.f32155s;
                dVar.f46236j = t2Var.d;
                dVar.f46237k = t2Var.getPlaceholderView();
                this.f32151e = dVar.a();
            }
        } else {
            qf.e eVar = this.f32151e;
            if (eVar != null) {
                eVar.c();
                this.f32151e = null;
            }
        }
        m();
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z10 && this.G) {
                sharedInstance.setVideoState(false, 1);
            } else if (z10 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new vh(16), 200L);
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
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
    }
}
