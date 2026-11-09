package org.telegram.ui.Wallet;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.ui.Components.g40;
public final class g6 implements SensorEventListener {
    public static g6 G;
    public float D;
    public float E;
    public final SensorManager f42503a;
    public final Sensor f42504b;
    public final WindowManager f42505c;
    public boolean f42509r;
    public boolean f42510s;
    public float f42511w;
    public float f42512x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f42506e = new WeakHashMap();
    public final float[] f42507f = new float[9];
    public final float[] h = new float[9];
    public final float[] f42508n = new float[3];
    public int f42513y = -1;
    public final g40 F = new g40(this, 1);

    public g6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42503a = sensorManager;
        this.f42505c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f42504b = defaultSensor;
    }

    public final void a() {
        if (this.f42509r) {
            this.f42503a.unregisterListener(this);
        }
        this.f42510s = false;
        this.f42509r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.D = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f42507f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f42505c.getDefaultDisplay().getRotation();
        if (this.f42513y != rotation) {
            this.f42510s = false;
            this.f42513y = rotation;
        }
        int i10 = this.f42513y;
        int i11 = 129;
        if (i10 == 1) {
            i7 = 129;
            i11 = 2;
        } else {
            i7 = 130;
            if (i10 != 2) {
                if (i10 == 3) {
                    i11 = 130;
                    i7 = 1;
                } else {
                    i7 = 2;
                    i11 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i11, i7, fArr3);
        float[] fArr4 = this.f42508n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f42510s) {
                this.f42511w = fArr4[1];
                this.f42512x = fArr4[2];
                this.f42510s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f42512x, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.f42511w, 6.283185307179586d)) / 0.45f));
            float f10 = this.D;
            this.D = com.google.android.recaptcha.internal.a.z(max, f10, 0.12f, f10);
            float f11 = this.E;
            this.E = com.google.android.recaptcha.internal.a.z(max2, f11, 0.12f, f11);
            for (View view : this.f42506e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
