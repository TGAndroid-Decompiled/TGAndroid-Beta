package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class x61 implements SensorEventListener {
    public final float[] f40194a = new float[3];
    public final float[] f40195b = new float[3];
    public int f40196c;
    public final WindowManager d;
    public final SensorManager f40197e;
    public final Sensor f40198f;
    public boolean h;
    public w61 f40199n;

    public x61(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f40197e = sensorManager;
        this.f40198f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i7, int i10) {
        float f10 = i7;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.k61 k61Var) {
        this.f40199n = k61Var;
    }

    public final void c(boolean z9) {
        if (this.h != z9) {
            this.h = z9;
            Sensor sensor = this.f40198f;
            if (sensor != null) {
                SensorManager sensorManager = this.f40197e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x61.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
