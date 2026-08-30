package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qb1;
public final class o81 implements SensorEventListener {
    public final float[] f27514a = new float[3];
    public final float[] f27515b = new float[3];
    public int f27516c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f27517f;
    public boolean h;
    public n81 f27518n;

    public o81(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f27517f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f10 = i10;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f11 = (f10 + dp) / f10;
        float f12 = i11;
        return Math.max(f11, (dp + f12) / f12);
    }

    public final void b(qb1 qb1Var) {
        this.f27518n = qb1Var;
    }

    public final void c(boolean z4) {
        if (this.h != z4) {
            this.h = z4;
            Sensor sensor = this.f27517f;
            if (sensor != null) {
                SensorManager sensorManager = this.e;
                if (z4) {
                    sensorManager.registerListener(this, sensor, 1);
                } else {
                    sensorManager.unregisterListener(this);
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o81.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
