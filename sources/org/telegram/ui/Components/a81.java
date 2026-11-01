package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class a81 implements SensorEventListener {
    public final float[] f24316a = new float[3];
    public final float[] f24317b = new float[3];
    public int f24318c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f24319f;
    public boolean h;
    public z71 f24320n;

    public a81(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f24319f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f7 = i10;
        float L = org.telegram.messenger.i0.L(16.0f) * 2;
        float f10 = (f7 + L) / f7;
        float f11 = i11;
        return Math.max(f10, (L + f11) / f11);
    }

    public final void b(org.telegram.ui.a81 a81Var) {
        this.f24320n = a81Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f24319f;
            if (sensor != null) {
                SensorManager sensorManager = this.e;
                if (z10) {
                    sensorManager.registerListener(this, sensor, 1);
                } else {
                    sensorManager.unregisterListener(this);
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
