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
import org.telegram.ui.Components.h60;
public final class k5 implements SensorEventListener {
    public static k5 G;
    public float E;
    public final SensorManager f33394a;
    public final Sensor f33395b;
    public final WindowManager f33396c;
    public boolean f33399r;
    public boolean f33400s;
    public float v;
    public float f33401w;
    public float f33403y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f33397f = new float[9];
    public final float[] h = new float[9];
    public final float[] f33398n = new float[3];
    public int f33402x = -1;
    public final h60 F = new h60(this, 1);

    public k5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f33394a = sensorManager;
        this.f33396c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f33395b = defaultSensor;
    }

    public final void a() {
        if (this.f33399r) {
            this.f33394a.unregisterListener(this);
        }
        this.f33400s = false;
        this.f33399r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f33403y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f33397f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f33396c.getDefaultDisplay().getRotation();
        if (this.f33402x != rotation) {
            this.f33400s = false;
            this.f33402x = rotation;
        }
        int i11 = this.f33402x;
        int i12 = 129;
        if (i11 == 1) {
            i10 = 129;
            i12 = 2;
        } else {
            i10 = 130;
            if (i11 != 2) {
                if (i11 == 3) {
                    i12 = 130;
                    i10 = 1;
                } else {
                    i10 = 2;
                    i12 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i12, i10, fArr3);
        float[] fArr4 = this.f33398n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!this.f33400s) {
            this.v = fArr4[1];
            this.f33401w = fArr4[2];
            this.f33400s = true;
        }
        float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f33401w, 6.283185307179586d)) / 0.45f));
        float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
        float f7 = this.f33403y;
        this.f33403y = com.google.android.gms.internal.play_billing.k3.y(max, f7, 0.12f, f7);
        float f10 = this.E;
        this.E = com.google.android.gms.internal.play_billing.k3.y(max2, f10, 0.12f, f10);
        for (View view : this.e.keySet()) {
            view.invalidate();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
