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
public final class k51 extends Dialog {
    public final org.telegram.ui.Components.zt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.e6 L;
    public MessageObject M;
    public i51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.m8 V;
    public boolean W;
    public ve X;
    public a3.h0 Y;
    public final f51 Z;
    public final Context f39085a;
    public float f39086a0;
    public final k0 f39087b;
    public boolean f39088b0;
    public final ci.m6 f39089c;
    public org.telegram.ui.ActionBar.b2 f39090c0;
    public org.telegram.ui.Components.c21 d;
    public ValueAnimator f39091d0;
    public i0.b f39092e;
    public ValueAnimator f39093e0;
    public Bitmap f39094f;
    public BitmapShader h;
    public Paint f39095n;
    public Matrix f39096r;
    public float f39097s;
    public float v;
    public org.telegram.ui.Components.k81 f39098w;
    public ci.d4 f39099x;
    public TextView f39100y;

    public k51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f39092e = i0.b.f11575e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new f51(this, 0);
        this.f39086a0 = 0.0f;
        this.f39088b0 = false;
        this.f39085a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.f39087b = k0Var;
        k0Var.setOnClickListener(new g51(this, 0));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f39089c = m6Var;
        m6Var.setClipToPadding(false);
        k0Var.addView(m6Var, w7.x5.e(-1, -1, 119));
        h51 h51Var = new h51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(k0Var, h51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.zt();
        }
    }

    public final void c(boolean z10, f51 f51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f39091d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39093e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f39097s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39091d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.cb(10, this, z10));
        this.f39091d0.addListener(new androidx.fragment.app.g(this, z10, f51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39091d0;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        valueAnimator3.setInterpolator(hsVar);
        this.f39091d0.setDuration(j3);
        this.f39091d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f39093e0 = ofFloat2;
        ofFloat2.addUpdateListener(new y11(this, 7));
        this.f39093e0.addListener(new f70(7, this, z10));
        this.f39093e0.setDuration(((float) j3) * 1.5f);
        this.f39093e0.setInterpolator(hsVar);
        this.f39093e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f39087b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f39092e;
                    this.F = (iArr[0] - this.f39092e.f11576a) - ((((width - bVar.f11576a) - bVar.f11578c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f39092e;
                    this.G = org.telegram.messenger.q.x(((height - bVar2.f11577b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f39092e.f11577b);
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
        i51 i51Var;
        if (!this.f39088b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f39090c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f39090c0 = null;
            }
            this.f39088b0 = true;
            ci.d4 d4Var = this.f39099x;
            if (d4Var != null) {
                d4Var.e(true);
            }
            org.telegram.ui.Components.k81 k81Var = this.f39098w;
            if (k81Var != null) {
                k81Var.B();
                this.f39098w.H();
                this.f39098w = null;
            }
            if (!this.S && (i51Var = this.N) != null && i51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.np0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f39097s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29243n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new f51(this, 3));
            k0 k0Var = this.f39087b;
            k0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f23192fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.c21 c21Var = new org.telegram.ui.Components.c21(this.f39085a, null);
                this.d = c21Var;
                k0Var.addView(c21Var, w7.x5.e(-1, -1, 119));
                org.telegram.ui.Components.c21 c21Var2 = this.d;
                i51 i51Var2 = this.N;
                f51 f51Var = new f51(this, 1);
                org.telegram.ui.Components.a21 a21Var = c21Var2.f25213a;
                if (a21Var != null) {
                    a21Var.e(i51Var2, 1.5f, f51Var);
                    Choreographer.getInstance().postFrameCallback(c21Var2.f25214b);
                } else {
                    org.telegram.ui.Components.b21 b21Var = new org.telegram.ui.Components.b21(i51Var2, f51Var);
                    b21Var.f24858g = 1.5f;
                    c21Var2.f25215c.add(b21Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.zt ztVar = this.E;
            if (ztVar != null) {
                PowerManager.WakeLock wakeLock = ztVar.h;
                SensorManager sensorManager = ztVar.f33637a;
                if (ztVar.f33642n) {
                    Sensor sensor = ztVar.f33641f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ztVar, sensor);
                    }
                    Sensor sensor2 = ztVar.f33640e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ztVar, sensor2);
                    }
                    Sensor sensor3 = ztVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ztVar, sensor3);
                    }
                    sensorManager.unregisterListener(ztVar, ztVar.f33639c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ztVar.f33642n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f39097s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f39097s));
            ci.d4 d4Var = this.f39099x;
            if (d4Var != null) {
                d4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f39097s));
                this.f39099x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f39097s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f39090c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f39090c0 = null;
        } else if (!this.f39088b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20374a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20374a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new h51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new h51(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20374a;
            this.f39090c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f39090c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
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
        k0 k0Var = this.f39087b;
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
            org.telegram.ui.Components.zt ztVar = this.E;
            if (ztVar != null) {
                PowerManager.WakeLock wakeLock = ztVar.h;
                SensorManager sensorManager = ztVar.f33637a;
                if (!ztVar.f33642n) {
                    Sensor sensor = ztVar.f33641f;
                    if (sensor != null) {
                        sensorManager.registerListener(ztVar, sensor, 30000);
                    }
                    Sensor sensor2 = ztVar.f33640e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ztVar, sensor2, 30000);
                    }
                    Sensor sensor3 = ztVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ztVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(ztVar, ztVar.f33639c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ztVar.f33642n = true;
                }
            }
        }
    }
}
