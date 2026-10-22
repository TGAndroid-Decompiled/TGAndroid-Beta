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
    public final SensorManager f35145a;
    public final Sensor f35146b;
    public final WindowManager f35147c;
    public boolean f35150r;
    public boolean f35151s;
    public float v;
    public float f35152w;
    public float f35154y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f35148f = new float[9];
    public final float[] h = new float[9];
    public final float[] f35149n = new float[3];
    public int f35153x = -1;
    public final e60 F = new e60(this, 1);

    public y5(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f35145a = sensorManager;
        this.f35147c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f35146b = defaultSensor;
    }

    public final void a() {
        if (this.f35150r) {
            this.f35145a.unregisterListener(this);
        }
        this.f35151s = false;
        this.f35150r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.f35154y = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f35148f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35147c.getDefaultDisplay().getRotation();
        if (this.f35153x != rotation) {
            this.f35151s = false;
            this.f35153x = rotation;
        }
        int i11 = this.f35153x;
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
        float[] fArr4 = this.f35149n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f35151s) {
                this.v = fArr4[1];
                this.f35152w = fArr4[2];
                this.f35151s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f35152w, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
            float f7 = this.f35154y;
            this.f35154y = com.google.android.gms.internal.play_billing.k3.y(max, f7, 0.12f, f7);
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
