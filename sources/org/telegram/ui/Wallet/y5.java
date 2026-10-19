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
import org.telegram.ui.Components.e60;
public final class y5 implements SensorEventListener {
    public static y5 G;
    public float E;
    public final SensorManager f35135a;
    public final Sensor f35136b;
    public final WindowManager f35137c;
    public boolean f35140r;
    public boolean f35141s;
    public float v;
    public float f35142w;
    public float f35144y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f35138f = new float[9];
    public final float[] h = new float[9];
    public final float[] f35139n = new float[3];
    public int f35143x = -1;
    public final e60 F = new e60(this, 1);

    public y5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f35135a = sensorManager;
        this.f35137c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f35136b = defaultSensor;
    }

    public final void a() {
        if (this.f35140r) {
            this.f35135a.unregisterListener(this);
        }
        this.f35141s = false;
        this.f35140r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f35144y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f35138f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35137c.getDefaultDisplay().getRotation();
        if (this.f35143x != rotation) {
            this.f35141s = false;
            this.f35143x = rotation;
        }
        int i11 = this.f35143x;
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
        float[] fArr4 = this.f35139n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f35141s) {
                this.v = fArr4[1];
                this.f35142w = fArr4[2];
                this.f35141s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f35142w, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
            float f7 = this.f35144y;
            this.f35144y = com.google.android.gms.internal.play_billing.k3.y(max, f7, 0.12f, f7);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.play_billing.k3.y(max2, f10, 0.12f, f10);
            for (View view : this.e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
