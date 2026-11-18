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
public final class y6 implements SensorEventListener {
    public static y6 H;
    public float E;
    public float F;
    public final SensorManager f45312a;
    public final Sensor f45313b;
    public final WindowManager f45314c;
    public boolean f45318r;
    public boolean f45319s;
    public float f45320w;
    public float f45321x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f45315e = new WeakHashMap();
    public final float[] f45316f = new float[9];
    public final float[] h = new float[9];
    public final float[] f45317n = new float[3];
    public int f45322y = -1;
    public final q40 G = new q40(this, 1);

    public y6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45312a = sensorManager;
        this.f45314c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f45313b = defaultSensor;
    }

    public final void a() {
        if (this.f45318r) {
            this.f45312a.unregisterListener(this);
        }
        this.f45319s = false;
        this.f45318r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f45316f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f45314c.getDefaultDisplay().getRotation();
        if (this.f45322y != rotation) {
            this.f45319s = false;
            this.f45322y = rotation;
        }
        int i10 = this.f45322y;
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
        float[] fArr4 = this.f45317n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f45319s) {
                this.f45320w = fArr4[1];
                this.f45321x = fArr4[2];
                this.f45319s = true;
            }
            float C = a8.p0.C((float) Math.IEEEremainder(fArr4[2] - this.f45321x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C((float) Math.IEEEremainder(fArr4[1] - this.f45320w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.vision.e2.z(C, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.gms.internal.vision.e2.z(C2, f11, 0.12f, f11);
            for (View view : this.f45315e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
