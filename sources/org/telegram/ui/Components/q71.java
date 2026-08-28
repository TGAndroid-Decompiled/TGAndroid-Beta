package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cb1;
public final class q71 implements SensorEventListener {
    public final float[] f31853a = new float[3];
    public final float[] f31854b = new float[3];
    public int f31855c;
    public final WindowManager d;
    public final SensorManager f31856e;
    public final Sensor f31857f;
    public boolean h;
    public p71 f31858n;

    public q71(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f31856e = sensorManager;
        this.f31857f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i9, int i10) {
        float f10 = i9;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f11 = (f10 + dp) / f10;
        float f12 = i10;
        return Math.max(f11, (dp + f12) / f12);
    }

    public final void b(cb1 cb1Var) {
        this.f31858n = cb1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f31857f;
            if (sensor != null) {
                SensorManager sensorManager = this.f31856e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q71.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
