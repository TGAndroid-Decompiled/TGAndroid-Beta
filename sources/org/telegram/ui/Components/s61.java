package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class s61 implements SensorEventListener {
    public final float[] f37956a = new float[3];
    public final float[] f37957b = new float[3];
    public int f37958c;
    public final WindowManager d;
    public final SensorManager f37959e;
    public final Sensor f37960f;
    public boolean h;
    public r61 f37961n;

    public s61(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f37959e = sensorManager;
        this.f37960f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i7, int i10) {
        float f10 = i7;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.k61 k61Var) {
        this.f37961n = k61Var;
    }

    public final void c(boolean z9) {
        if (this.h != z9) {
            this.h = z9;
            Sensor sensor = this.f37960f;
            if (sensor != null) {
                SensorManager sensorManager = this.f37959e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s61.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
