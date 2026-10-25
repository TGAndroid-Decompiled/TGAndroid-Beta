package org.telegram.ui.Wallet;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.ui.Components.g60;
public final class x5 implements SensorEventListener {
    public static x5 G;
    public float E;
    public final SensorManager f37466a;
    public final Sensor f37467b;
    public final WindowManager f37468c;
    public boolean f37471r;
    public boolean f37472s;
    public float v;
    public float f37473w;
    public float f37475y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f37469f = new float[9];
    public final float[] h = new float[9];
    public final float[] f37470n = new float[3];
    public int f37474x = -1;
    public final g60 F = new g60(this, 1);

    public x5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f37466a = sensorManager;
        this.f37468c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f37467b = defaultSensor;
    }

    public final void a() {
        if (this.f37471r) {
            this.f37466a.unregisterListener(this);
        }
        this.f37472s = false;
        this.f37471r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f37475y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f37469f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f37468c.getDefaultDisplay().getRotation();
        if (this.f37474x != rotation) {
            this.f37472s = false;
            this.f37474x = rotation;
        }
        int i11 = this.f37474x;
        int i12 = 129;
        if (i11 == 1) {
            i10 = 129;
            i12 = 2;
        } else {
            i10 = 130;
            if (i11 != 2) {
                if (i11 == 3) {
                    i12 = 130;
                    i10 = 1;
                } else {
                    i10 = 2;
                    i12 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i12, i10, fArr3);
        float[] fArr4 = this.f37470n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f37472s) {
                this.v = fArr4[1];
                this.f37473w = fArr4[2];
                this.f37472s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f37473w, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
            float f7 = this.f37475y;
            this.f37475y = c3.h0.z(max, f7, 0.12f, f7);
            float f10 = this.E;
            this.E = c3.h0.z(max2, f10, 0.12f, f10);
            for (View view : this.e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
