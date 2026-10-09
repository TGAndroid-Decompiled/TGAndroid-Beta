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
import org.telegram.ui.Components.k60;
public final class l5 implements SensorEventListener {
    public static l5 G;
    public float E;
    public final SensorManager f35196a;
    public final Sensor f35197b;
    public final WindowManager f35198c;
    public boolean f35202r;
    public boolean f35203s;
    public float v;
    public float f35204w;
    public float f35206y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f35199e = new WeakHashMap();
    public final float[] f35200f = new float[9];
    public final float[] h = new float[9];
    public final float[] f35201n = new float[3];
    public int f35205x = -1;
    public final k60 F = new k60(this, 1);

    public l5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f35196a = sensorManager;
        this.f35198c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f35197b = defaultSensor;
    }

    public final void a() {
        if (this.f35202r) {
            this.f35196a.unregisterListener(this);
        }
        this.f35203s = false;
        this.f35202r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f35206y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f35200f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35198c.getDefaultDisplay().getRotation();
        if (this.f35205x != rotation) {
            this.f35203s = false;
            this.f35205x = rotation;
        }
        int i11 = this.f35205x;
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
        float[] fArr4 = this.f35201n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!this.f35203s) {
            this.v = fArr4[1];
            this.f35204w = fArr4[2];
            this.f35203s = true;
        }
        float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f35204w, 6.283185307179586d)) / 0.45f));
        float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
        float f7 = this.f35206y;
        this.f35206y = com.google.android.gms.internal.vision.e2.y(max, f7, 0.12f, f7);
        float f10 = this.E;
        this.E = com.google.android.gms.internal.vision.e2.y(max2, f10, 0.12f, f10);
        for (View view : this.f35199e.keySet()) {
            view.invalidate();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
