package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.lc1;
public final class l81 implements SensorEventListener {
    public final float[] f28115a = new float[3];
    public final float[] f28116b = new float[3];
    public int f28117c;
    public final WindowManager d;
    public final SensorManager f28118e;
    public final Sensor f28119f;
    public boolean h;
    public k81 f28120n;

    public l81(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f28118e = sensorManager;
        this.f28119f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f7 = i10;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f10 = (f7 + dp) / f7;
        float f11 = i11;
        return Math.max(f10, (dp + f11) / f11);
    }

    public final void b(lc1 lc1Var) {
        this.f28120n = lc1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f28119f;
            if (sensor != null) {
                SensorManager sensorManager = this.f28118e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l81.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
