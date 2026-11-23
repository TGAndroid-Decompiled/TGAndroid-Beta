package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class m71 implements SensorEventListener {
    public final float[] f37442a = new float[3];
    public final float[] f37443b = new float[3];
    public int f37444c;
    public final WindowManager d;
    public final SensorManager f37445e;
    public final Sensor f37446f;
    public boolean h;
    public l71 f37447n;

    public m71(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f37445e = sensorManager;
        this.f37446f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i7, int i10) {
        float f10 = i7;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.l61 l61Var) {
        this.f37447n = l61Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f37446f;
            if (sensor != null) {
                SensorManager sensorManager = this.f37445e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
