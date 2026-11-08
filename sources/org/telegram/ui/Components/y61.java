package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class y61 implements SensorEventListener {
    public final float[] f40589a = new float[3];
    public final float[] f40590b = new float[3];
    public int f40591c;
    public final WindowManager d;
    public final SensorManager f40592e;
    public final Sensor f40593f;
    public boolean h;
    public x61 f40594n;

    public y61(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f40592e = sensorManager;
        this.f40593f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i7, int i10) {
        float f10 = i7;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.k61 k61Var) {
        this.f40594n = k61Var;
    }

    public final void c(boolean z9) {
        if (this.h != z9) {
            this.h = z9;
            Sensor sensor = this.f40593f;
            if (sensor != null) {
                SensorManager sensorManager = this.f40592e;
                if (z9) {
                    sensorManager.registerListener(this, sensor, 1);
                } else {
                    sensorManager.unregisterListener(this);
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y61.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
