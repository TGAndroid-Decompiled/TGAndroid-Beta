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
import org.telegram.ui.Components.t40;
public final class y6 implements SensorEventListener {
    public static y6 H;
    public float E;
    public float F;
    public final SensorManager f45322a;
    public final Sensor f45323b;
    public final WindowManager f45324c;
    public boolean f45328r;
    public boolean f45329s;
    public float f45330w;
    public float f45331x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f45325e = new WeakHashMap();
    public final float[] f45326f = new float[9];
    public final float[] h = new float[9];
    public final float[] f45327n = new float[3];
    public int f45332y = -1;
    public final t40 G = new t40(this, 1);

    public y6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45322a = sensorManager;
        this.f45324c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f45323b = defaultSensor;
    }

    public final void a() {
        if (this.f45328r) {
            this.f45322a.unregisterListener(this);
        }
        this.f45329s = false;
        this.f45328r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f45326f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f45324c.getDefaultDisplay().getRotation();
        if (this.f45332y != rotation) {
            this.f45329s = false;
            this.f45332y = rotation;
        }
        int i10 = this.f45332y;
        int i11 = 129;
        if (i10 == 1) {
            i7 = 129;
            i11 = 2;
        } else {
            i7 = 130;
            if (i10 != 2) {
                if (i10 == 3) {
                    i11 = 130;
                    i7 = 1;
                } else {
                    i7 = 2;
                    i11 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i11, i7, fArr3);
        float[] fArr4 = this.f45327n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f45329s) {
                this.f45330w = fArr4[1];
                this.f45331x = fArr4[2];
                this.f45329s = true;
            }
            float C = a8.p0.C((float) Math.IEEEremainder(fArr4[2] - this.f45331x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C((float) Math.IEEEremainder(fArr4[1] - this.f45330w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.vision.e2.z(C, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.gms.internal.vision.e2.z(C2, f11, 0.12f, f11);
            for (View view : this.f45325e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
