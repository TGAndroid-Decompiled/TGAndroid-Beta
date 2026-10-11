package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j51 extends Dialog {
    public final org.telegram.ui.Components.au E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.d6 L;
    public MessageObject M;
    public h51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.m8 V;
    public boolean W;
    public ue X;
    public a3.h0 Y;
    public final e51 Z;
    public final Context f38875a;
    public float f38876a0;
    public final j0 f38877b;
    public boolean f38878b0;
    public final ci.m6 f38879c;
    public org.telegram.ui.ActionBar.a2 f38880c0;
    public org.telegram.ui.Components.d21 d;
    public ValueAnimator f38881d0;
    public i0.b f38882e;
    public ValueAnimator f38883e0;
    public Bitmap f38884f;
    public BitmapShader h;
    public Paint f38885n;
    public Matrix f38886r;
    public float f38887s;
    public float v;
    public org.telegram.ui.Components.l81 f38888w;
    public ci.d4 f38889x;
    public TextView f38890y;

    public j51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f38882e = i0.b.f11574e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new e51(this, 0);
        this.f38876a0 = 0.0f;
        this.f38878b0 = false;
        this.f38875a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        j0 j0Var = new j0(this, activity, 22);
        this.f38877b = j0Var;
        j0Var.setOnClickListener(new f51(this, 0));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f38879c = m6Var;
        m6Var.setClipToPadding(false);
        j0Var.addView(m6Var, w7.x5.e(-1, -1, 119));
        g51 g51Var = new g51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f46890a;
        r0.a0.i(j0Var, g51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.au();
        }
    }

    public final void c(boolean z10, e51 e51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f38881d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38883e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f38887s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38881d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.cb(10, this, z10));
        this.f38881d0.addListener(new androidx.fragment.app.g(this, z10, e51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f38881d0;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        valueAnimator3.setInterpolator(isVar);
        this.f38881d0.setDuration(j3);
        this.f38881d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38883e0 = ofFloat2;
        ofFloat2.addUpdateListener(new x11(this, 7));
        this.f38883e0.addListener(new f70(7, this, z10));
        this.f38883e0.setDuration(((float) j3) * 1.5f);
        this.f38883e0.setInterpolator(isVar);
        this.f38883e0.start();
    }

    public final void d() {
        if (!this.H) {
            j0 j0Var = this.f38877b;
            if (j0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = j0Var.getWidth();
                    i0.b bVar = this.f38882e;
                    this.F = (iArr[0] - this.f38882e.f11575a) - ((((width - bVar.f11575a) - bVar.f11577c) - this.O.getWidth()) / 2.0f);
                    int height = j0Var.getHeight();
                    i0.b bVar2 = this.f38882e;
                    this.G = org.telegram.messenger.q.x(((height - bVar2.f11576b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f38882e.f11576b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], j0Var.getHeight() * 0.7f, j0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((j0Var.getHeight() - this.O.getHeight()) / 2.0f);
                        this.I = clamp;
                        if (this.S) {
                            this.I = 0.0f;
                        } else {
                            this.I = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.G = 0.0f;
                    this.F = 0.0f;
                }
                this.H = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        h51 h51Var;
        if (!this.f38878b0) {
            org.telegram.ui.ActionBar.a2 a2Var = this.f38880c0;
            if (a2Var != null) {
                a2Var.dismiss();
                this.f38880c0 = null;
            }
            this.f38878b0 = true;
            ci.d4 d4Var = this.f38889x;
            if (d4Var != null) {
                d4Var.e(true);
            }
            org.telegram.ui.Components.l81 l81Var = this.f38888w;
            if (l81Var != null) {
                l81Var.B();
                this.f38888w.H();
                this.f38888w = null;
            }
            if (!this.S && (h51Var = this.N) != null && h51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.op0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f38887s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29589n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new e51(this, 3));
            j0 j0Var = this.f38877b;
            j0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f23220fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.d21 d21Var = new org.telegram.ui.Components.d21(this.f38875a, null);
                this.d = d21Var;
                j0Var.addView(d21Var, w7.x5.e(-1, -1, 119));
                org.telegram.ui.Components.d21 d21Var2 = this.d;
                h51 h51Var2 = this.N;
                e51 e51Var = new e51(this, 1);
                org.telegram.ui.Components.b21 b21Var = d21Var2.f25590a;
                if (b21Var != null) {
                    b21Var.e(h51Var2, 1.5f, e51Var);
                    Choreographer.getInstance().postFrameCallback(d21Var2.f25591b);
                } else {
                    org.telegram.ui.Components.c21 c21Var = new org.telegram.ui.Components.c21(h51Var2, e51Var);
                    c21Var.f25180g = 1.5f;
                    d21Var2.f25592c.add(c21Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.au auVar = this.E;
            if (auVar != null) {
                PowerManager.WakeLock wakeLock = auVar.h;
                SensorManager sensorManager = auVar.f24667a;
                if (auVar.f24672n) {
                    Sensor sensor = auVar.f24671f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(auVar, sensor);
                    }
                    Sensor sensor2 = auVar.f24670e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(auVar, sensor2);
                    }
                    Sensor sensor3 = auVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(auVar, sensor3);
                    }
                    sensorManager.unregisterListener(auVar, auVar.f24669c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    auVar.f24672n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f38887s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f38887s));
            ci.d4 d4Var = this.f38889x;
            if (d4Var != null) {
                d4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f38887s));
                this.f38889x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f38887s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a2 a2Var = this.f38880c0;
        if (a2Var != null) {
            a2Var.dismiss();
            this.f38880c0 = null;
        } else if (!this.f38878b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20404a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20404a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new g51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new g51(this, 2));
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f20404a;
            this.f38880c0 = a2Var2;
            a2Var2.show();
            TextView textView = (TextView) this.f38880c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        j0 j0Var = this.f38877b;
        setContentView(j0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        j0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(j0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new et(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            ue ueVar = this.X;
            if (ueVar != null) {
                AndroidUtilities.runOnUIThread(ueVar);
                this.X = null;
            }
            org.telegram.ui.Components.au auVar = this.E;
            if (auVar != null) {
                PowerManager.WakeLock wakeLock = auVar.h;
                SensorManager sensorManager = auVar.f24667a;
                if (!auVar.f24672n) {
                    Sensor sensor = auVar.f24671f;
                    if (sensor != null) {
                        sensorManager.registerListener(auVar, sensor, 30000);
                    }
                    Sensor sensor2 = auVar.f24670e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(auVar, sensor2, 30000);
                    }
                    Sensor sensor3 = auVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(auVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(auVar, auVar.f24669c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    auVar.f24672n = true;
                }
            }
        }
    }
}
