package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class q61 implements SensorEventListener {
    public final float[] f37359a = new float[3];
    public final float[] f37360b = new float[3];
    public int f37361c;
    public final WindowManager d;
    public final SensorManager f37362e;
    public final Sensor f37363f;
    public boolean h;
    public p61 f37364n;

    public q61(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f37362e = sensorManager;
        this.f37363f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i3, int i10) {
        float f10 = i3;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.a61 a61Var) {
        this.f37364n = a61Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f37363f;
            if (sensor != null) {
                SensorManager sensorManager = this.f37362e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q61.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
