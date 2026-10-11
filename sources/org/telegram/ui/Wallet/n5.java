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
import org.telegram.ui.Components.l60;
public final class n5 implements SensorEventListener {
    public static n5 G;
    public float E;
    public final SensorManager f35356a;
    public final Sensor f35357b;
    public final WindowManager f35358c;
    public boolean f35362r;
    public boolean f35363s;
    public float v;
    public float f35364w;
    public float f35366y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f35359e = new WeakHashMap();
    public final float[] f35360f = new float[9];
    public final float[] h = new float[9];
    public final float[] f35361n = new float[3];
    public int f35365x = -1;
    public final l60 F = new l60(this, 1);

    public n5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f35356a = sensorManager;
        this.f35358c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f35357b = defaultSensor;
    }

    public final void a() {
        if (this.f35362r) {
            this.f35356a.unregisterListener(this);
        }
        this.f35363s = false;
        this.f35362r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f35366y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f35360f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35358c.getDefaultDisplay().getRotation();
        if (this.f35365x != rotation) {
            this.f35363s = false;
            this.f35365x = rotation;
        }
        int i11 = this.f35365x;
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
        float[] fArr4 = this.f35361n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!this.f35363s) {
            this.v = fArr4[1];
            this.f35364w = fArr4[2];
            this.f35363s = true;
        }
        float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f35364w, 6.283185307179586d)) / 0.45f));
        float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
        float f7 = this.f35366y;
        this.f35366y = com.google.android.gms.internal.vision.e2.y(max, f7, 0.12f, f7);
        float f10 = this.E;
        this.E = com.google.android.gms.internal.vision.e2.y(max2, f10, 0.12f, f10);
        for (View view : this.f35359e.keySet()) {
            view.invalidate();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
