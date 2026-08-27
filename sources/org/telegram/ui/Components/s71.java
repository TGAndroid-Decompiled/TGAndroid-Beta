package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ab1;

public final class s71 implements SensorEventListener {

    public final float[] f32350a = new float[3];

    public final float[] f32351b = new float[3];

    public int f32352c;
    public final WindowManager d;

    public final SensorManager f32353e;

    public final Sensor f32354f;
    public boolean h;

    public r71 f32355n;

    public s71(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f32353e = sensorManager;
        this.f32354f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f10 = i10;
        float fDp = AndroidUtilities.dp(16.0f) * 2;
        float f11 = (f10 + fDp) / f10;
        float f12 = i11;
        return Math.max(f11, (fDp + f12) / f12);
    }

    public final void b(ab1 ab1Var) {
        this.f32355n = ab1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f32354f;
            if (sensor == null) {
                return;
            }
            SensorManager sensorManager = this.f32353e;
            if (z10) {
                sensorManager.registerListener(this, sensor, 1);
            } else {
                sensorManager.unregisterListener(this);
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int iRound;
        int iRound2;
        r71 r71Var;
        float f10;
        int rotation = this.d.getDefaultDisplay().getRotation();
        float[] fArr = sensorEvent.values;
        float f11 = fArr[0] / 9.80665f;
        float f12 = fArr[1] / 9.80665f;
        float f13 = fArr[2] / 9.80665f;
        float f14 = f13 * f13;
        float fAtan2 = (float) ((Math.atan2(f11, Math.sqrt((f12 * f12) + f14)) / 3.141592653589793d) * 2.0d);
        float fAtan3 = (float) ((Math.atan2(f12, Math.sqrt((f11 * f11) + f14)) / 3.141592653589793d) * 2.0d);
        if (rotation != 1) {
            if (rotation == 2) {
                float f15 = -fAtan3;
                fAtan3 = -fAtan2;
                fAtan2 = f15;
            } else if (rotation != 3) {
                fAtan2 = fAtan3;
                fAtan3 = fAtan2;
            } else {
                fAtan2 = -fAtan2;
            }
        }
        int i10 = this.f32352c;
        float[] fArr2 = this.f32350a;
        fArr2[i10] = fAtan2;
        float[] fArr3 = this.f32351b;
        fArr3[i10] = fAtan3;
        this.f32352c = (i10 + 1) % fArr2.length;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i11 = 0; i11 < fArr2.length; i11++) {
            f16 += fArr2[i11];
            f17 += fArr3[i11];
        }
        float length = f16 / fArr2.length;
        float length2 = f17 / fArr2.length;
        if (length <= 1.0f) {
            f10 = length < -1.0f ? -2.0f : 2.0f;
            iRound = Math.round(AndroidUtilities.dpf2(16.0f) * length2);
            iRound2 = Math.round(AndroidUtilities.dpf2(16.0f) * length);
            float fMax = Math.max(-1.0f, Math.min(1.0f, (-length2) / 0.45f));
            float fMax2 = Math.max(-1.0f, Math.min(1.0f, (-length) / 0.45f));
            float fSqrt = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
            float f18 = fMax / fSqrt;
            float f19 = fMax2 / fSqrt;
            Math.atan2((f18 * (-1.0f)) - (f19 * 0.0f), (f19 * (-1.0f)) + (f18 * 0.0f));
            r71Var = this.f32355n;
            if (r71Var != null) {
                r71Var.d(iRound, iRound2);
            }
        }
        length = f10 - length;
        iRound = Math.round(AndroidUtilities.dpf2(16.0f) * length2);
        iRound2 = Math.round(AndroidUtilities.dpf2(16.0f) * length);
        float fMax3 = Math.max(-1.0f, Math.min(1.0f, (-length2) / 0.45f));
        float fMax4 = Math.max(-1.0f, Math.min(1.0f, (-length) / 0.45f));
        float fSqrt2 = (float) Math.sqrt((fMax4 * fMax4) + (fMax3 * fMax3));
        float f110 = fMax3 / fSqrt2;
        float f111 = fMax4 / fSqrt2;
        Math.atan2((f110 * (-1.0f)) - (f111 * 0.0f), (f111 * (-1.0f)) + (f110 * 0.0f));
        r71Var = this.f32355n;
        if (r71Var != null) {
            r71Var.d(iRound, iRound2);
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
