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
import org.telegram.ui.Components.w40;
public final class m6 implements SensorEventListener {
    public static m6 G;
    public float D;
    public float E;
    public final SensorManager f34900a;
    public final Sensor f34901b;
    public final WindowManager f34902c;
    public boolean f34905r;
    public boolean f34906s;
    public float f34907w;
    public float f34908x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f34903f = new float[9];
    public final float[] h = new float[9];
    public final float[] f34904n = new float[3];
    public int f34909y = -1;
    public final w40 F = new w40(this, 1);

    public m6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34900a = sensorManager;
        this.f34902c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f34901b = defaultSensor;
    }

    public final void a() {
        if (this.f34905r) {
            this.f34900a.unregisterListener(this);
        }
        this.f34906s = false;
        this.f34905r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.D = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f34903f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f34902c.getDefaultDisplay().getRotation();
        if (this.f34909y != rotation) {
            this.f34906s = false;
            this.f34909y = rotation;
        }
        int i11 = this.f34909y;
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
        float[] fArr4 = this.f34904n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f34906s) {
                this.f34907w = fArr4[1];
                this.f34908x = fArr4[2];
                this.f34906s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f34908x, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.f34907w, 6.283185307179586d)) / 0.45f));
            float f7 = this.D;
            this.D = c3.i0.z(max, f7, 0.12f, f7);
            float f10 = this.E;
            this.E = c3.i0.z(max2, f10, 0.12f, f10);
            for (View view : this.e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
