package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class z71 implements SensorEventListener {
    public final float[] f32965a = new float[3];
    public final float[] f32966b = new float[3];
    public int f32967c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f32968f;
    public boolean h;
    public y71 f32969n;

    public z71(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f32968f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f7 = i10;
        float L = org.telegram.messenger.i0.L(16.0f) * 2;
        float f10 = (f7 + L) / f7;
        float f11 = i11;
        return Math.max(f10, (L + f11) / f11);
    }

    public final void b(org.telegram.ui.c81 c81Var) {
        this.f32969n = c81Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f32968f;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
