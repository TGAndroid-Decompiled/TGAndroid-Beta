package org.telegram.p009ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

public class WallpaperParallaxEffect implements SensorEventListener {
    private Sensor accelerometer;
    private int bufferOffset;
    private Callback callback;
    private boolean enabled;
    private SensorManager sensorManager;
    private WindowManager f1104wm;
    private float[] rollBuffer = new float[3];
    private float[] pitchBuffer = new float[3];

    public interface Callback {
        void onOffsetsChanged(int i, int i2, float f);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public WallpaperParallaxEffect(Context context) {
        this.f1104wm = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager.getDefaultSensor(1);
    }

    public void setEnabled(boolean z) {
        if (this.enabled != z) {
            this.enabled = z;
            Sensor sensor = this.accelerometer;
            if (sensor != null) {
                if (z) {
                    this.sensorManager.registerListener(this, sensor, 1);
                } else {
                    this.sensorManager.unregisterListener(this);
                }
            }
        }
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public float getScale(int i, int i2) {
        float f = i;
        float dp = AndroidUtilities.m34dp(16.0f) * 2;
        float f2 = (f + dp) / f;
        float f3 = i2;
        return Math.max(f2, (dp + f3) / f3);
    }

    @Override
    public void onSensorChanged(android.hardware.SensorEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.WallpaperParallaxEffect.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
