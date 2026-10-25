package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class x91 implements SensorEventListener {
    public final float[] f34669a = new float[3];
    public final float[] f34670b = new float[3];
    public int f34671c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f34672f;
    public boolean h;
    public w91 f34673n;

    public x91(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f34672f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f7 = i10;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f10 = (f7 + dp) / f7;
        float f11 = i11;
        return Math.max(f10, (dp + f11) / f11);
    }

    public final void b(org.telegram.ui.hb1 hb1Var) {
        this.f34673n = hb1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f34672f;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x91.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
