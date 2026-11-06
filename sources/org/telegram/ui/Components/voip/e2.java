package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import bi.x5;
import c8.ha;
import c8.jc;
import fi.v3;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class e2 implements VoIPService.StateListener, ls {
    public static boolean S = false;
    public static e2 T;
    public static e2 U;
    public static int V;
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
    public final x5 f39118a;
    public final d2 f39119b;
    public WindowManager f39120c;
    public WindowManager.LayoutParams d;
    public boolean f39121e;
    public final int f39122f;
    public final int h;
    public final View f39123n;
    public final k2 f39124r;
    public final k2 f39125s;
    public float f39126w;
    public ValueAnimator f39127x;
    public final v3 f39128y = new v3(this, 20);
    public final float[] D = new float[2];
    public final androidx.emoji2.text.n N = new androidx.emoji2.text.n(8);
    public final b2 P = new b2(this, 0);
    public final b2 Q = new b2(this, 1);
    public final c2 R = new Object();

    public e2(Context context, int i7, int i10, boolean z9) {
        this.f39122f = i7;
        this.h = i10;
        float f10 = i10 * 0.4f;
        int i11 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.F = i11;
        float f11 = i7 * 0.4f;
        int i12 = ((int) ((1.05f * f11) - f11)) / 2;
        this.E = i12;
        x5 x5Var = new x5(this, context, context.getDrawable(2131230923), 19);
        this.f39118a = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.setPadding(i12, i11, i12, i11);
        d2 d2Var = new d2(this, context);
        this.f39119b = d2Var;
        k2 k2Var = new k2(context, false, true);
        this.f39125s = k2Var;
        k2Var.f39278a0 = 3;
        k2 k2Var2 = new k2(context, false, true);
        this.f39124r = k2Var2;
        k2Var2.d.setMirror(true);
        d2Var.addView(k2Var);
        d2Var.addView(k2Var2);
        d2Var.setBackgroundColor(-7829368);
        x5Var.addView(d2Var);
        x5Var.setClipChildren(false);
        x5Var.setClipToPadding(false);
        if (z9) {
            View view = new View(context);
            this.f39123n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(-16777216, 76), 0}));
            d2Var.addView(view, -1, org.telegram.messenger.g0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232542);
            imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView.setContentDescription(hd.M0(2131752041, null));
            d2Var.addView(imageView, ha.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(2131232543);
            imageView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView2.setContentDescription(hd.M0(2131747816, null));
            d2Var.addView(imageView2, ha.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bi.l1(14));
            imageView2.setOnClickListener(new n41(4, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        e2 e2Var = T;
        if (e2Var != null && U == null && !S && e2Var.f39118a.getParent() != null && jc.a(launchActivity) != e2Var.f39121e) {
            int i7 = e2Var.M;
            int i10 = e2Var.f39122f;
            int i11 = e2Var.h;
            b();
            f(launchActivity, i7, i10, i11, 0);
        }
    }

    public static void b() {
        if (S) {
            return;
        }
        e2 e2Var = U;
        if (e2Var != null) {
            e2Var.c();
        }
        e2 e2Var2 = T;
        if (e2Var2 != null) {
            e2Var2.c();
        }
        U = null;
        T = null;
        f2.d();
    }

    public static e2 d() {
        e2 e2Var = U;
        if (e2Var != null) {
            return e2Var;
        }
        return T;
    }

    public static void f(Activity activity, int i7, int i10, int i11, int i12) {
        WindowManager windowManager;
        if (T == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f10 = i11;
            float f11 = f10 * 0.4f;
            float f12 = i10;
            float f13 = 0.4f * f12;
            layoutParams.height = (int) ((f10 * 0.25f) + ((((int) ((f11 * 1.05f) - f11)) / 2) * 2));
            layoutParams.width = (int) ((f12 * 0.25f) + ((((int) ((1.05f * f13) - f13)) / 2) * 2));
            layoutParams.gravity = 51;
            layoutParams.format = -3;
            if (jc.a(activity)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            } else {
                layoutParams.type = 2;
            }
            layoutParams.flags = 16778120;
            e2 e2Var = new e2(activity, i10, i11, false);
            T = e2Var;
            e2Var.f39121e = jc.a(activity);
            if (T.f39121e) {
                windowManager = (WindowManager) org.telegram.messenger.t0.f25555b.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            e2 e2Var2 = T;
            e2Var2.M = i7;
            e2Var2.f39120c = windowManager;
            e2Var2.d = layoutParams;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("voippipconfig", 0);
            float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
            e2 e2Var3 = T;
            e2Var3.getClass();
            Point point = org.telegram.messenger.g0.f22537q;
            float f16 = point.x;
            float f17 = point.y;
            float L = org.telegram.messenger.g0.L(16.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            float L3 = org.telegram.messenger.g0.L(60.0f);
            float L4 = org.telegram.messenger.g0.L(16.0f);
            float f18 = e2Var3.f39122f * 0.25f;
            float f19 = e2Var3.h * 0.25f;
            d2 d2Var = e2Var3.f39119b;
            if (d2Var.getMeasuredWidth() != 0) {
                f18 = d2Var.getMeasuredWidth();
            }
            if (d2Var.getMeasuredWidth() != 0) {
                f19 = d2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = e2Var3.d;
            layoutParams2.x = (int) (((((f16 - L) - L2) - f18) * f14) - (e2Var3.E - L));
            layoutParams2.y = (int) (((((f17 - L3) - L4) - f19) * f15) - (e2Var3.F - L3));
            org.telegram.messenger.g0.T3(e2Var3.f39120c, e2Var3.f39118a, layoutParams2);
            qs.e().b(T, qs.D2);
            windowManager.addView(T.f39118a, layoutParams);
            T.f39124r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            T.f39125s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), T.R);
            if (i12 == 0) {
                T.f39118a.setScaleX(0.5f);
                T.f39118a.setScaleY(0.5f);
                T.f39118a.setAlpha(0.0f);
                T.f39118a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    e2 e2Var4 = T;
                    sharedInstance.setSinks(e2Var4.f39124r.d, e2Var4.f39125s.d);
                }
            } else if (i12 == 1) {
                T.f39118a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    e2 e2Var5 = T;
                    sharedInstance2.setBackgroundSinks(e2Var5.f39124r.d, e2Var5.f39125s.d);
                }
            }
            f2.d();
        }
    }

    public final void c() {
        this.f39124r.d.release();
        this.f39125s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f39118a.setVisibility(8);
        if (this.f39118a.getParent() != null) {
            d2 d2Var = this.f39119b;
            float[] fArr = this.D;
            int i7 = d2.h;
            d2Var.getClass();
            Point point = org.telegram.messenger.g0.f22537q;
            e2 e2Var = d2Var.f39096f;
            int i10 = e2Var.d.x;
            d2 d2Var2 = e2Var.f39119b;
            float left = d2Var2.getLeft() + i10;
            float f10 = d2Var.f39093b;
            fArr[0] = (left - f10) / (((point.x - f10) - d2Var.f39094c) - d2Var2.getMeasuredWidth());
            float top = d2Var2.getTop() + e2Var.d.y;
            float f11 = d2Var.d;
            fArr[1] = (top - f11) / (((point.y - f11) - d2Var.f39095e) - d2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            org.telegram.messenger.t0.f25555b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.D[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.D[1]))).apply();
            try {
                this.f39120c.removeView(this.f39118a);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        qs.e().n(this, qs.D2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.D2) {
            b();
        }
    }

    public final void e() {
        VoIPService sharedInstance;
        if (!this.f39121e && !jc.b(org.telegram.messenger.t0.f25555b) && (sharedInstance = VoIPService.getSharedInstance()) != null && this.G) {
            sharedInstance.setVideoState(false, 1);
        }
    }

    public final void g() {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f39119b.getMeasuredWidth() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = this.H;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f10 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.G = z11;
            k2 k2Var = this.f39124r;
            k2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            k2Var.setIsScreencast(sharedInstance.isScreencast());
            k2Var.d(false, 1.0f);
        }
        if (!z9) {
            if (!this.H) {
                f10 = 0.0f;
            }
            this.f39126w = f10;
        } else if (z12 != this.H) {
            ValueAnimator valueAnimator = this.f39127x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f39126w;
            if (!this.H) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39127x = ofFloat;
            ofFloat.addUpdateListener(this.f39128y);
            this.f39127x.setDuration(300L).setInterpolator(xq.f40310f);
            this.f39127x.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        g();
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        f2.d();
        g();
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z9 && this.G) {
                sharedInstance.setVideoState(false, 1);
            } else if (z9 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i7) {
        if (i7 == 11 || i7 == 17 || i7 == 4 || i7 == 10) {
            org.telegram.messenger.g0.i3(new l10(12), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            b();
        } else if (i7 == 3 && !sharedInstance.isVideoAvailable()) {
            b();
        } else {
            g();
        }
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
    }

    @Override
    public final void onAudioSettingsChanged() {
    }
}
