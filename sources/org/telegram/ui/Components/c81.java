package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.db1;
public final class c81 implements SensorEventListener {
    public final float[] f27373a = new float[3];
    public final float[] f27374b = new float[3];
    public int f27375c;
    public final WindowManager d;
    public final SensorManager f27376e;
    public final Sensor f27377f;
    public boolean h;
    public b81 f27378n;

    public c81(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f27376e = sensorManager;
        this.f27377f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f9 = i10;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f10 = (f9 + dp) / f9;
        float f11 = i11;
        return Math.max(f10, (dp + f11) / f11);
    }

    public final void b(db1 db1Var) {
        this.f27378n = db1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f27377f;
            if (sensor != null) {
                SensorManager sensorManager = this.f27376e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c81.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
