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
import org.telegram.ui.Components.c60;
public final class y5 implements SensorEventListener {
    public static y5 G;
    public float E;
    public final SensorManager f35446a;
    public final Sensor f35447b;
    public final WindowManager f35448c;
    public boolean f35451r;
    public boolean f35452s;
    public float v;
    public float f35453w;
    public float f35455y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f35449f = new float[9];
    public final float[] h = new float[9];
    public final float[] f35450n = new float[3];
    public int f35454x = -1;
    public final c60 F = new c60(this, 1);

    public y5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f35446a = sensorManager;
        this.f35448c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f35447b = defaultSensor;
    }

    public final void a() {
        if (this.f35451r) {
            this.f35446a.unregisterListener(this);
        }
        this.f35452s = false;
        this.f35451r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f35455y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f35449f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35448c.getDefaultDisplay().getRotation();
        if (this.f35454x != rotation) {
            this.f35452s = false;
            this.f35454x = rotation;
        }
        int i11 = this.f35454x;
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
        float[] fArr4 = this.f35450n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f35452s) {
                this.v = fArr4[1];
                this.f35453w = fArr4[2];
                this.f35452s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f35453w, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
            float f7 = this.f35455y;
            this.f35455y = com.google.android.gms.internal.play_billing.k3.y(max, f7, 0.12f, f7);
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
