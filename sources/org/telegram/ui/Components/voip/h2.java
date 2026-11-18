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
import c8.ma;
import c8.nd;
import hi.k3;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.me;
import org.telegram.ui.LaunchActivity;
public final class h2 implements VoIPService.StateListener, fs {
    public static boolean T = false;
    public static h2 U;
    public static h2 V;
    public static int W;
    public final int F;
    public final int G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;
    public long M;
    public int N;
    public AnimatorSet P;
    public final ai.k0 f40902a;
    public final g2 f40903b;
    public WindowManager f40904c;
    public WindowManager.LayoutParams d;
    public boolean f40905e;
    public final int f40906f;
    public final int h;
    public final View f40907n;
    public final n2 f40908r;
    public final n2 f40909s;
    public float f40910w;
    public ValueAnimator f40911x;
    public final k3 f40912y = new k3(this, 21);
    public final float[] E = new float[2];
    public final androidx.emoji2.text.o O = new androidx.emoji2.text.o(8);
    public final e2 Q = new e2(this, 0);
    public final e2 R = new e2(this, 1);
    public final f2 S = new Object();

    public h2(Context context, int i7, int i10, boolean z10) {
        this.f40906f = i7;
        this.h = i10;
        float f10 = i10 * 0.4f;
        int i11 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.G = i11;
        float f11 = i7 * 0.4f;
        int i12 = ((int) ((1.05f * f11) - f11)) / 2;
        this.F = i12;
        ai.k0 k0Var = new ai.k0(this, context, context.getDrawable(2131230923), 22);
        this.f40902a = k0Var;
        k0Var.setWillNotDraw(false);
        k0Var.setPadding(i12, i11, i12, i11);
        g2 g2Var = new g2(this, context);
        this.f40903b = g2Var;
        n2 n2Var = new n2(context, false, true);
        this.f40909s = n2Var;
        n2Var.f41077b0 = 3;
        n2 n2Var2 = new n2(context, false, true);
        this.f40908r = n2Var2;
        n2Var2.d.setMirror(true);
        g2Var.addView(n2Var);
        g2Var.addView(n2Var2);
        g2Var.setBackgroundColor(-7829368);
        k0Var.addView(g2Var);
        k0Var.setClipChildren(false);
        k0Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.f40907n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(-16777216, 76), 0}));
            g2Var.addView(view, -1, org.telegram.messenger.g0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232544);
            imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView.setContentDescription(gd.M0(2131752030, null));
            g2Var.addView(imageView, ma.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(2131232545);
            imageView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView2.setContentDescription(gd.M0(2131747624, null));
            g2Var.addView(imageView2, ma.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bi.o(19));
            imageView2.setOnClickListener(new c31(8, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        h2 h2Var = U;
        if (h2Var != null && V == null && !T && h2Var.f40902a.getParent() != null && nd.a(launchActivity) != h2Var.f40905e) {
            int i7 = h2Var.N;
            int i10 = h2Var.f40906f;
            int i11 = h2Var.h;
            b();
            f(launchActivity, i7, i10, i11, 0);
        }
    }

    public static void b() {
        if (T) {
            return;
        }
        h2 h2Var = V;
        if (h2Var != null) {
            h2Var.c();
        }
        h2 h2Var2 = U;
        if (h2Var2 != null) {
            h2Var2.c();
        }
        V = null;
        U = null;
        i2.g();
    }

    public static h2 d() {
        h2 h2Var = V;
        if (h2Var != null) {
            return h2Var;
        }
        return U;
    }

    public static void f(Activity activity, int i7, int i10, int i11, int i12) {
        WindowManager windowManager;
        if (U == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f10 = i11;
            float f11 = f10 * 0.4f;
            float f12 = i10;
            float f13 = 0.4f * f12;
            layoutParams.height = (int) ((f10 * 0.25f) + ((((int) ((f11 * 1.05f) - f11)) / 2) * 2));
            layoutParams.width = (int) ((f12 * 0.25f) + ((((int) ((1.05f * f13) - f13)) / 2) * 2));
            layoutParams.gravity = 51;
            layoutParams.format = -3;
            if (nd.a(activity)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            } else {
                layoutParams.type = 2;
            }
            layoutParams.flags = 16778120;
            h2 h2Var = new h2(activity, i10, i11, false);
            U = h2Var;
            h2Var.f40905e = nd.a(activity);
            if (U.f40905e) {
                windowManager = (WindowManager) org.telegram.messenger.t0.f26913b.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            h2 h2Var2 = U;
            h2Var2.N = i7;
            h2Var2.f40904c = windowManager;
            h2Var2.d = layoutParams;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("voippipconfig", 0);
            float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
            h2 h2Var3 = U;
            h2Var3.getClass();
            Point point = org.telegram.messenger.g0.f24118q;
            float f16 = point.x;
            float f17 = point.y;
            float L = org.telegram.messenger.g0.L(16.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            float L3 = org.telegram.messenger.g0.L(60.0f);
            float L4 = org.telegram.messenger.g0.L(16.0f);
            float f18 = h2Var3.f40906f * 0.25f;
            float f19 = h2Var3.h * 0.25f;
            g2 g2Var = h2Var3.f40903b;
            if (g2Var.getMeasuredWidth() != 0) {
                f18 = g2Var.getMeasuredWidth();
            }
            if (g2Var.getMeasuredWidth() != 0) {
                f19 = g2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = h2Var3.d;
            layoutParams2.x = (int) (((((f16 - L) - L2) - f18) * f14) - (h2Var3.F - L));
            layoutParams2.y = (int) (((((f17 - L3) - L4) - f19) * f15) - (h2Var3.G - L3));
            org.telegram.messenger.g0.R3(h2Var3.f40904c, h2Var3.f40902a, layoutParams2);
            ks.e().b(U, ks.D2);
            windowManager.addView(U.f40902a, layoutParams);
            U.f40908r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            U.f40909s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), U.S);
            if (i12 == 0) {
                U.f40902a.setScaleX(0.5f);
                U.f40902a.setScaleY(0.5f);
                U.f40902a.setAlpha(0.0f);
                U.f40902a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    h2 h2Var4 = U;
                    sharedInstance.setSinks(h2Var4.f40908r.d, h2Var4.f40909s.d);
                }
            } else if (i12 == 1) {
                U.f40902a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    h2 h2Var5 = U;
                    sharedInstance2.setBackgroundSinks(h2Var5.f40908r.d, h2Var5.f40909s.d);
                }
            }
            i2.g();
        }
    }

    public final void c() {
        this.f40908r.d.release();
        this.f40909s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f40902a.setVisibility(8);
        if (this.f40902a.getParent() != null) {
            g2 g2Var = this.f40903b;
            float[] fArr = this.E;
            int i7 = g2.h;
            g2Var.getClass();
            Point point = org.telegram.messenger.g0.f24118q;
            h2 h2Var = g2Var.f40883f;
            int i10 = h2Var.d.x;
            g2 g2Var2 = h2Var.f40903b;
            float left = g2Var2.getLeft() + i10;
            float f10 = g2Var.f40880b;
            fArr[0] = (left - f10) / (((point.x - f10) - g2Var.f40881c) - g2Var2.getMeasuredWidth());
            float top = g2Var2.getTop() + h2Var.d.y;
            float f11 = g2Var.d;
            fArr[1] = (top - f11) / (((point.y - f11) - g2Var.f40882e) - g2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            org.telegram.messenger.t0.f26913b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.E[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.E[1]))).apply();
            try {
                this.f40904c.removeView(this.f40902a);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        ks.e().n(this, ks.D2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.D2) {
            b();
        }
    }

    public final void e() {
        VoIPService sharedInstance;
        if (!this.f40905e && !nd.b(org.telegram.messenger.t0.f26913b) && (sharedInstance = VoIPService.getSharedInstance()) != null && this.H) {
            sharedInstance.setVideoState(false, 1);
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f40903b.getMeasuredWidth() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.I;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f10 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.I = z11;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.H = z12;
            n2 n2Var = this.f40908r;
            n2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            n2Var.setIsScreencast(sharedInstance.isScreencast());
            n2Var.d(false, 1.0f);
        }
        if (!z10) {
            if (!this.I) {
                f10 = 0.0f;
            }
            this.f40910w = f10;
        } else if (z13 != this.I) {
            ValueAnimator valueAnimator = this.f40911x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f40910w;
            if (!this.I) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f40911x = ofFloat;
            ofFloat.addUpdateListener(this.f40912y);
            this.f40911x.setDuration(300L).setInterpolator(lr.f37208f);
            this.f40911x.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        g();
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        i2.g();
        g();
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z10 && this.H) {
                sharedInstance.setVideoState(false, 1);
            } else if (z10 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i7) {
        if (i7 == 11 || i7 == 17 || i7 == 4 || i7 == 10) {
            org.telegram.messenger.g0.h3(new me(20), 200L);
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
    public final void onVideoAvailableChange(boolean z10) {
    }

    @Override
    public final void onAudioSettingsChanged() {
    }
}
