package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ThemePreviewActivity$$ExternalSyntheticLambda13;

public final class WallpaperParallaxEffect implements SensorEventListener {
    public final Sensor accelerometer;
    public int bufferOffset;
    public Callback callback;
    public boolean enabled;
    public final SensorManager sensorManager;
    public final WindowManager wm;
    public final float[] rollBuffer = new float[3];
    public final float[] pitchBuffer = new float[3];

    public interface Callback {
        void onOffsetsChanged(int i, int i2);
    }

    public WallpaperParallaxEffect(Context context) {
        this.wm = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager.getDefaultSensor(1);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int iRound;
        int iRound2;
        Callback callback;
        float f;
        int rotation = this.wm.getDefaultDisplay().getRotation();
        float[] fArr = sensorEvent.values;
        float f2 = fArr[0] / 9.80665f;
        float f3 = fArr[1] / 9.80665f;
        float f4 = fArr[2] / 9.80665f;
        float f5 = f4 * f4;
        float fAtan2 = (float) ((Math.atan2(f2, Math.sqrt((f3 * f3) + f5)) / 3.141592653589793d) * 2.0d);
        float fAtan3 = (float) ((Math.atan2(f3, Math.sqrt((f2 * f2) + f5)) / 3.141592653589793d) * 2.0d);
        if (rotation != 1) {
            if (rotation == 2) {
                float f6 = -fAtan3;
                fAtan3 = -fAtan2;
                fAtan2 = f6;
            } else if (rotation != 3) {
                fAtan2 = fAtan3;
                fAtan3 = fAtan2;
            } else {
                fAtan2 = -fAtan2;
            }
        }
        int i = this.bufferOffset;
        float[] fArr2 = this.rollBuffer;
        fArr2[i] = fAtan2;
        float[] fArr3 = this.pitchBuffer;
        fArr3[i] = fAtan3;
        this.bufferOffset = (i + 1) % fArr2.length;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < fArr2.length; i2++) {
            f7 += fArr2[i2];
            f8 += fArr3[i2];
        }
        float length = f7 / fArr2.length;
        float length2 = f8 / fArr2.length;
        if (length <= 1.0f) {
            f = length < -1.0f ? -2.0f : 2.0f;
            iRound = Math.round(AndroidUtilities.dpf2(16.0f) * length2);
            iRound2 = Math.round(AndroidUtilities.dpf2(16.0f) * length);
            float fMax = Math.max(-1.0f, Math.min(1.0f, (-length2) / 0.45f));
            float fMax2 = Math.max(-1.0f, Math.min(1.0f, (-length) / 0.45f));
            float fSqrt = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
            float f9 = fMax / fSqrt;
            float f10 = fMax2 / fSqrt;
            Math.atan2((f9 * (-1.0f)) - (f10 * 0.0f), (f10 * (-1.0f)) + (f9 * 0.0f));
            callback = this.callback;
            if (callback != null) {
                callback.onOffsetsChanged(iRound, iRound2);
            }
        }
        length = f - length;
        iRound = Math.round(AndroidUtilities.dpf2(16.0f) * length2);
        iRound2 = Math.round(AndroidUtilities.dpf2(16.0f) * length);
        float fMax3 = Math.max(-1.0f, Math.min(1.0f, (-length2) / 0.45f));
        float fMax4 = Math.max(-1.0f, Math.min(1.0f, (-length) / 0.45f));
        float fSqrt2 = (float) Math.sqrt((fMax4 * fMax4) + (fMax3 * fMax3));
        float f11 = fMax3 / fSqrt2;
        float f12 = fMax4 / fSqrt2;
        Math.atan2((f11 * (-1.0f)) - (f12 * 0.0f), (f12 * (-1.0f)) + (f11 * 0.0f));
        callback = this.callback;
        if (callback != null) {
            callback.onOffsetsChanged(iRound, iRound2);
        }
    }

    public final void setCallback(ThemePreviewActivity$$ExternalSyntheticLambda13 themePreviewActivity$$ExternalSyntheticLambda13) {
        this.callback = themePreviewActivity$$ExternalSyntheticLambda13;
    }

    public final void setEnabled(boolean z) {
        if (this.enabled != z) {
            this.enabled = z;
            Sensor sensor = this.accelerometer;
            if (sensor == null) {
                return;
            }
            SensorManager sensorManager = this.sensorManager;
            if (z) {
                sensorManager.registerListener(this, sensor, 1);
            } else {
                sensorManager.unregisterListener(this);
            }
        }
    }
}
