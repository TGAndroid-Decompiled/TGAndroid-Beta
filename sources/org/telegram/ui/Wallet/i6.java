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
import org.telegram.ui.Components.i40;
public final class i6 implements SensorEventListener {
    public static i6 H;
    public float E;
    public float F;
    public final SensorManager f43976a;
    public final Sensor f43977b;
    public final WindowManager f43978c;
    public boolean f43982r;
    public boolean f43983s;
    public float f43984w;
    public float f43985x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f43979e = new WeakHashMap();
    public final float[] f43980f = new float[9];
    public final float[] h = new float[9];
    public final float[] f43981n = new float[3];
    public int f43986y = -1;
    public final i40 G = new i40(this, 1);

    public i6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f43976a = sensorManager;
        this.f43978c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f43977b = defaultSensor;
    }

    public final void a() {
        if (this.f43982r) {
            this.f43976a.unregisterListener(this);
        }
        this.f43983s = false;
        this.f43982r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f43980f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f43978c.getDefaultDisplay().getRotation();
        if (this.f43986y != rotation) {
            this.f43983s = false;
            this.f43986y = rotation;
        }
        int i10 = this.f43986y;
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
        float[] fArr4 = this.f43981n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f43983s) {
                this.f43984w = fArr4[1];
                this.f43985x = fArr4[2];
                this.f43983s = true;
            }
            float C = a8.p0.C((float) Math.IEEEremainder(fArr4[2] - this.f43985x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C((float) Math.IEEEremainder(fArr4[1] - this.f43984w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f10 = this.E;
            this.E = com.google.android.gms.internal.vision.e2.z(C, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.gms.internal.vision.e2.z(C2, f11, 0.12f, f11);
            for (View view : this.f43979e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
