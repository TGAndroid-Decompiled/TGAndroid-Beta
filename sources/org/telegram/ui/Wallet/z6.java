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
import org.telegram.ui.Components.q40;
public final class z6 implements SensorEventListener {
    public static z6 H;
    public float E;
    public float F;
    public final SensorManager f45484a;
    public final Sensor f45485b;
    public final WindowManager f45486c;
    public boolean f45490r;
    public boolean f45491s;
    public float f45492w;
    public float f45493x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f45487e = new WeakHashMap();
    public final float[] f45488f = new float[9];
    public final float[] h = new float[9];
    public final float[] f45489n = new float[3];
    public int f45494y = -1;
    public final q40 G = new q40(this, 1);

    public z6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45484a = sensorManager;
        this.f45486c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f45485b = defaultSensor;
    }

    public final void a() {
        if (this.f45490r) {
            this.f45484a.unregisterListener(this);
        }
        this.f45491s = false;
        this.f45490r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f45488f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f45486c.getDefaultDisplay().getRotation();
        if (this.f45494y != rotation) {
            this.f45491s = false;
            this.f45494y = rotation;
        }
        int i10 = this.f45494y;
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
        float[] fArr4 = this.f45489n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f45491s) {
                this.f45492w = fArr4[1];
                this.f45493x = fArr4[2];
                this.f45491s = true;
            }
            float C = a8.p0.C((float) Math.IEEEremainder(fArr4[2] - this.f45493x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C((float) Math.IEEEremainder(fArr4[1] - this.f45492w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.vision.e2.z(C, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.gms.internal.vision.e2.z(C2, f11, 0.12f, f11);
            for (View view : this.f45487e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
