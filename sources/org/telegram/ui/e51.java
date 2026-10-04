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
public final class e51 extends Dialog {
    public final org.telegram.ui.Components.mt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.d6 L;
    public MessageObject M;
    public c51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.k8 V;
    public boolean W;
    public ve X;
    public a3.h0 Y;
    public final z41 Z;
    public final Context f35912a;
    public float f35913a0;
    public final k0 f35914b;
    public boolean f35915b0;
    public final ci.m6 f35916c;
    public org.telegram.ui.ActionBar.b2 f35917c0;
    public org.telegram.ui.Components.v11 d;
    public ValueAnimator f35918d0;
    public i0.b f35919e;
    public ValueAnimator f35920e0;
    public Bitmap f35921f;
    public BitmapShader h;
    public Paint f35922n;
    public Matrix f35923r;
    public float f35924s;
    public float v;
    public org.telegram.ui.Components.d81 f35925w;
    public ci.e4 f35926x;
    public TextView f35927y;

    public e51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f35919e = i0.b.f11524e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new z41(this, 0);
        this.f35913a0 = 0.0f;
        this.f35915b0 = false;
        this.f35912a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.f35914b = k0Var;
        k0Var.setOnClickListener(new a51(this, 0));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f35916c = m6Var;
        m6Var.setClipToPadding(false);
        k0Var.addView(m6Var, w7.z5.e(-1, -1, 119));
        b51 b51Var = new b51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f45595a;
        r0.a0.j(k0Var, b51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.mt();
        }
    }

    public final void c(boolean z10, z41 z41Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35918d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35920e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35924s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35918d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(10, this, z10));
        this.f35918d0.addListener(new androidx.fragment.app.g(this, z10, z41Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35918d0;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        valueAnimator3.setInterpolator(trVar);
        this.f35918d0.setDuration(j3);
        this.f35918d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35920e0 = ofFloat2;
        ofFloat2.addUpdateListener(new b21(this, 6));
        this.f35920e0.addListener(new g70(7, this, z10));
        this.f35920e0.setDuration(((float) j3) * 1.5f);
        this.f35920e0.setInterpolator(trVar);
        this.f35920e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f35914b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f35919e;
                    this.F = (iArr[0] - this.f35919e.f11525a) - ((((width - bVar.f11525a) - bVar.f11527c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f35919e;
                    this.G = org.telegram.messenger.f0.x(((height - bVar2.f11526b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f35919e.f11526b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.O.getHeight()) / 2.0f);
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
        c51 c51Var;
        if (!this.f35915b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f35917c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f35917c0 = null;
            }
            this.f35915b0 = true;
            ci.e4 e4Var = this.f35926x;
            if (e4Var != null) {
                e4Var.e(true);
            }
            org.telegram.ui.Components.d81 d81Var = this.f35925w;
            if (d81Var != null) {
                d81Var.B();
                this.f35925w.H();
                this.f35925w = null;
            }
            if (!this.S && (c51Var = this.N) != null && c51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.bp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f35924s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f25028n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new z41(this, 3));
            k0 k0Var = this.f35914b;
            k0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f23202fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.v11 v11Var = new org.telegram.ui.Components.v11(this.f35912a, null);
                this.d = v11Var;
                k0Var.addView(v11Var, w7.z5.e(-1, -1, 119));
                org.telegram.ui.Components.v11 v11Var2 = this.d;
                c51 c51Var2 = this.N;
                z41 z41Var = new z41(this, 1);
                org.telegram.ui.Components.t11 t11Var = v11Var2.f31499a;
                if (t11Var != null) {
                    t11Var.e(c51Var2, 1.5f, z41Var);
                    Choreographer.getInstance().postFrameCallback(v11Var2.f31500b);
                } else {
                    org.telegram.ui.Components.u11 u11Var = new org.telegram.ui.Components.u11(c51Var2, z41Var);
                    u11Var.f31243g = 1.5f;
                    v11Var2.f31501c.add(u11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.mt mtVar = this.E;
            if (mtVar != null) {
                PowerManager.WakeLock wakeLock = mtVar.h;
                SensorManager sensorManager = mtVar.f28692a;
                if (mtVar.f28697n) {
                    Sensor sensor = mtVar.f28696f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(mtVar, sensor);
                    }
                    Sensor sensor2 = mtVar.f28695e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(mtVar, sensor2);
                    }
                    Sensor sensor3 = mtVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(mtVar, sensor3);
                    }
                    sensorManager.unregisterListener(mtVar, mtVar.f28694c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    mtVar.f28697n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35924s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35924s));
            ci.e4 e4Var = this.f35926x;
            if (e4Var != null) {
                e4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35924s));
                this.f35926x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35924s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f35917c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f35917c0 = null;
        } else if (!this.f35915b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20367a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20367a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new b51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new b51(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20367a;
            this.f35917c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f35917c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
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
        k0 k0Var = this.f35914b;
        setContentView(k0Var, layoutParams);
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
        k0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new ft(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            ve veVar = this.X;
            if (veVar != null) {
                AndroidUtilities.runOnUIThread(veVar);
                this.X = null;
            }
            org.telegram.ui.Components.mt mtVar = this.E;
            if (mtVar != null) {
                PowerManager.WakeLock wakeLock = mtVar.h;
                SensorManager sensorManager = mtVar.f28692a;
                if (!mtVar.f28697n) {
                    Sensor sensor = mtVar.f28696f;
                    if (sensor != null) {
                        sensorManager.registerListener(mtVar, sensor, 30000);
                    }
                    Sensor sensor2 = mtVar.f28695e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(mtVar, sensor2, 30000);
                    }
                    Sensor sensor3 = mtVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(mtVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(mtVar, mtVar.f28694c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    mtVar.f28697n = true;
                }
            }
        }
    }
}
