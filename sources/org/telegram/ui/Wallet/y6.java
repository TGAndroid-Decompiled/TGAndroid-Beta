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
    public final SensorManager f45352a;
    public final Sensor f45353b;
    public final WindowManager f45354c;
    public boolean f45358r;
    public boolean f45359s;
    public float f45360w;
    public float f45361x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f45355e = new WeakHashMap();
    public final float[] f45356f = new float[9];
    public final float[] h = new float[9];
    public final float[] f45357n = new float[3];
    public int f45362y = -1;
    public final t40 G = new t40(this, 1);

    public y6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45352a = sensorManager;
        this.f45354c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f45353b = defaultSensor;
    }

    public final void a() {
        if (this.f45358r) {
            this.f45352a.unregisterListener(this);
        }
        this.f45359s = false;
        this.f45358r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f45356f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f45354c.getDefaultDisplay().getRotation();
        if (this.f45362y != rotation) {
            this.f45359s = false;
            this.f45362y = rotation;
        }
        int i10 = this.f45362y;
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
        float[] fArr4 = this.f45357n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f45359s) {
                this.f45360w = fArr4[1];
                this.f45361x = fArr4[2];
                this.f45359s = true;
            }
            float C = a8.p0.C((float) Math.IEEEremainder(fArr4[2] - this.f45361x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C((float) Math.IEEEremainder(fArr4[1] - this.f45360w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.vision.e2.z(C, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.gms.internal.vision.e2.z(C2, f11, 0.12f, f11);
            for (View view : this.f45355e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
