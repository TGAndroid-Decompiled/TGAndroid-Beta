package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class b91 implements SensorEventListener {
    public final float[] f22901a = new float[3];
    public final float[] f22902b = new float[3];
    public int f22903c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f22904f;
    public boolean h;
    public a91 f22905n;

    public b91(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f22904f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f7 = i10;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f10 = (f7 + dp) / f7;
        float f11 = i11;
        return Math.max(f10, (dp + f11) / f11);
    }

    public final void b(dc1 dc1Var) {
        this.f22905n = dc1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f22904f;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
