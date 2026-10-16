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
import org.telegram.ui.Components.h60;
public final class m5 implements SensorEventListener {
    public static m5 G;
    public float E;
    public final SensorManager f33200a;
    public final Sensor f33201b;
    public final WindowManager f33202c;
    public boolean f33205r;
    public boolean f33206s;
    public float v;
    public float f33207w;
    public float f33209y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f33203f = new float[9];
    public final float[] h = new float[9];
    public final float[] f33204n = new float[3];
    public int f33208x = -1;
    public final h60 F = new h60(this, 1);

    public m5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f33200a = sensorManager;
        this.f33202c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f33201b = defaultSensor;
    }

    public final void a() {
        if (this.f33205r) {
            this.f33200a.unregisterListener(this);
        }
        this.f33206s = false;
        this.f33205r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f33209y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f33203f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f33202c.getDefaultDisplay().getRotation();
        if (this.f33208x != rotation) {
            this.f33206s = false;
            this.f33208x = rotation;
        }
        int i11 = this.f33208x;
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
        float[] fArr4 = this.f33204n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!this.f33206s) {
            this.v = fArr4[1];
            this.f33207w = fArr4[2];
            this.f33206s = true;
        }
        float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f33207w, 6.283185307179586d)) / 0.45f));
        float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
        float f7 = this.f33209y;
        this.f33209y = com.google.android.gms.internal.play_billing.k3.y(max, f7, 0.12f, f7);
        float f10 = this.E;
        this.E = com.google.android.gms.internal.play_billing.k3.y(max2, f10, 0.12f, f10);
        for (View view : this.e.keySet()) {
            view.invalidate();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
