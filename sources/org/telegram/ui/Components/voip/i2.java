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
import c8.na;
import c8.od;
import hi.s3;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.p31;
import org.telegram.ui.LaunchActivity;
public final class i2 implements VoIPService.StateListener, fs {
    public static boolean T = false;
    public static i2 U;
    public static i2 V;
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
    public final ai.h0 f40933a;
    public final h2 f40934b;
    public WindowManager f40935c;
    public WindowManager.LayoutParams d;
    public boolean f40936e;
    public final int f40937f;
    public final int h;
    public final View f40938n;
    public final o2 f40939r;
    public final o2 f40940s;
    public float f40941w;
    public ValueAnimator f40942x;
    public final s3 f40943y = new s3(this, 21);
    public final float[] E = new float[2];
    public final androidx.emoji2.text.o O = new androidx.emoji2.text.o(8);
    public final f2 Q = new f2(this, 0);
    public final f2 R = new f2(this, 1);
    public final g2 S = new Object();

    public i2(Context context, int i7, int i10, boolean z10) {
        this.f40937f = i7;
        this.h = i10;
        float f10 = i10 * 0.4f;
        int i11 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.G = i11;
        float f11 = i7 * 0.4f;
        int i12 = ((int) ((1.05f * f11) - f11)) / 2;
        this.F = i12;
        ai.h0 h0Var = new ai.h0(this, context, context.getDrawable(2131230923), 22);
        this.f40933a = h0Var;
        h0Var.setWillNotDraw(false);
        h0Var.setPadding(i12, i11, i12, i11);
        h2 h2Var = new h2(this, context);
        this.f40934b = h2Var;
        o2 o2Var = new o2(context, false, true);
        this.f40940s = o2Var;
        o2Var.f41109b0 = 3;
        o2 o2Var2 = new o2(context, false, true);
        this.f40939r = o2Var2;
        o2Var2.d.setMirror(true);
        h2Var.addView(o2Var);
        h2Var.addView(o2Var2);
        h2Var.setBackgroundColor(-7829368);
        h0Var.addView(h2Var);
        h0Var.setClipChildren(false);
        h0Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.f40938n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(-16777216, 76), 0}));
            h2Var.addView(view, -1, org.telegram.messenger.g0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232547);
            imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView.setContentDescription(gd.N0(2131752029, null));
            h2Var.addView(imageView, na.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(2131232548);
            imageView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView2.setContentDescription(gd.N0(2131747623, null));
            h2Var.addView(imageView2, na.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bi.o(19));
            imageView2.setOnClickListener(new p31(6, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        i2 i2Var = U;
        if (i2Var != null && V == null && !T && i2Var.f40933a.getParent() != null && od.a(launchActivity) != i2Var.f40936e) {
            int i7 = i2Var.N;
            int i10 = i2Var.f40937f;
            int i11 = i2Var.h;
            b();
            f(launchActivity, i7, i10, i11, 0);
        }
    }

    public static void b() {
        if (T) {
            return;
        }
        i2 i2Var = V;
        if (i2Var != null) {
            i2Var.c();
        }
        i2 i2Var2 = U;
        if (i2Var2 != null) {
            i2Var2.c();
        }
        V = null;
        U = null;
        j2.d();
    }

    public static i2 d() {
        i2 i2Var = V;
        if (i2Var != null) {
            return i2Var;
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
            if (od.a(activity)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            } else {
                layoutParams.type = 2;
            }
            layoutParams.flags = 16778120;
            i2 i2Var = new i2(activity, i10, i11, false);
            U = i2Var;
            i2Var.f40936e = od.a(activity);
            if (U.f40936e) {
                windowManager = (WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            i2 i2Var2 = U;
            i2Var2.N = i7;
            i2Var2.f40935c = windowManager;
            i2Var2.d = layoutParams;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("voippipconfig", 0);
            float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
            i2 i2Var3 = U;
            i2Var3.getClass();
            Point point = org.telegram.messenger.g0.f24226q;
            float f16 = point.x;
            float f17 = point.y;
            float L = org.telegram.messenger.g0.L(16.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            float L3 = org.telegram.messenger.g0.L(60.0f);
            float L4 = org.telegram.messenger.g0.L(16.0f);
            float f18 = i2Var3.f40937f * 0.25f;
            float f19 = i2Var3.h * 0.25f;
            h2 h2Var = i2Var3.f40934b;
            if (h2Var.getMeasuredWidth() != 0) {
                f18 = h2Var.getMeasuredWidth();
            }
            if (h2Var.getMeasuredWidth() != 0) {
                f19 = h2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = i2Var3.d;
            layoutParams2.x = (int) (((((f16 - L) - L2) - f18) * f14) - (i2Var3.F - L));
            layoutParams2.y = (int) (((((f17 - L3) - L4) - f19) * f15) - (i2Var3.G - L3));
            org.telegram.messenger.g0.R3(i2Var3.f40935c, i2Var3.f40933a, layoutParams2);
            ks.e().b(U, ks.D2);
            windowManager.addView(U.f40933a, layoutParams);
            U.f40939r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            U.f40940s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), U.S);
            if (i12 == 0) {
                U.f40933a.setScaleX(0.5f);
                U.f40933a.setScaleY(0.5f);
                U.f40933a.setAlpha(0.0f);
                U.f40933a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    i2 i2Var4 = U;
                    sharedInstance.setSinks(i2Var4.f40939r.d, i2Var4.f40940s.d);
                }
            } else if (i12 == 1) {
                U.f40933a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i2 i2Var5 = U;
                    sharedInstance2.setBackgroundSinks(i2Var5.f40939r.d, i2Var5.f40940s.d);
                }
            }
            j2.d();
        }
    }

    public final void c() {
        this.f40939r.d.release();
        this.f40940s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f40933a.setVisibility(8);
        if (this.f40933a.getParent() != null) {
            h2 h2Var = this.f40934b;
            float[] fArr = this.E;
            int i7 = h2.h;
            h2Var.getClass();
            Point point = org.telegram.messenger.g0.f24226q;
            i2 i2Var = h2Var.f40922f;
            int i10 = i2Var.d.x;
            h2 h2Var2 = i2Var.f40934b;
            float left = h2Var2.getLeft() + i10;
            float f10 = h2Var.f40919b;
            fArr[0] = (left - f10) / (((point.x - f10) - h2Var.f40920c) - h2Var2.getMeasuredWidth());
            float top = h2Var2.getTop() + i2Var.d.y;
            float f11 = h2Var.d;
            fArr[1] = (top - f11) / (((point.y - f11) - h2Var.f40921e) - h2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            org.telegram.messenger.t0.f27013b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.E[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.E[1]))).apply();
            try {
                this.f40935c.removeView(this.f40933a);
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
        if (!this.f40936e && !od.b(org.telegram.messenger.t0.f27013b) && (sharedInstance = VoIPService.getSharedInstance()) != null && this.H) {
            sharedInstance.setVideoState(false, 1);
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f40934b.getMeasuredWidth() != 0) {
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
            o2 o2Var = this.f40939r;
            o2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            o2Var.setIsScreencast(sharedInstance.isScreencast());
            o2Var.d(false, 1.0f);
        }
        if (!z10) {
            if (!this.I) {
                f10 = 0.0f;
            }
            this.f40941w = f10;
        } else if (z13 != this.I) {
            ValueAnimator valueAnimator = this.f40942x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f40941w;
            if (!this.I) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f40942x = ofFloat;
            ofFloat.addUpdateListener(this.f40943y);
            this.f40942x.setDuration(300L).setInterpolator(kr.f36858f);
            this.f40942x.start();
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
        j2.d();
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
            org.telegram.messenger.g0.h3(new ne(20), 200L);
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
