package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class z61 implements SensorEventListener {
    public final float[] f42267a = new float[3];
    public final float[] f42268b = new float[3];
    public int f42269c;
    public final WindowManager d;
    public final SensorManager f42270e;
    public final Sensor f42271f;
    public boolean h;
    public y61 f42272n;

    public z61(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42270e = sensorManager;
        this.f42271f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i7, int i10) {
        float f10 = i7;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.h61 h61Var) {
        this.f42272n = h61Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f42271f;
            if (sensor != null) {
                SensorManager sensorManager = this.f42270e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z61.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
