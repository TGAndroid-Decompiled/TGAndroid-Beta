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
import org.telegram.ui.Components.t40;
public final class y6 implements SensorEventListener {
    public static y6 H;
    public float E;
    public float F;
    public final SensorManager f45356a;
    public final Sensor f45357b;
    public final WindowManager f45358c;
    public boolean f45362r;
    public boolean f45363s;
    public float f45364w;
    public float f45365x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f45359e = new WeakHashMap();
    public final float[] f45360f = new float[9];
    public final float[] h = new float[9];
    public final float[] f45361n = new float[3];
    public int f45366y = -1;
    public final t40 G = new t40(this, 1);

    public y6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45356a = sensorManager;
        this.f45358c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f45357b = defaultSensor;
    }

    public final void a() {
        if (this.f45362r) {
            this.f45356a.unregisterListener(this);
        }
        this.f45363s = false;
        this.f45362r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f45360f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f45358c.getDefaultDisplay().getRotation();
        if (this.f45366y != rotation) {
            this.f45363s = false;
            this.f45366y = rotation;
        }
        int i10 = this.f45366y;
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
        float[] fArr4 = this.f45361n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f45363s) {
                this.f45364w = fArr4[1];
                this.f45365x = fArr4[2];
                this.f45363s = true;
            }
            float C = a8.p0.C((float) Math.IEEEremainder(fArr4[2] - this.f45365x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C((float) Math.IEEEremainder(fArr4[1] - this.f45364w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.vision.e2.z(C, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.gms.internal.vision.e2.z(C2, f11, 0.12f, f11);
            for (View view : this.f45359e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
