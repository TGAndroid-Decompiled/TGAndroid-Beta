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
import org.telegram.ui.Components.b40;
public final class g6 implements SensorEventListener {
    public static g6 H;
    public float E;
    public float F;
    public final SensorManager f42569a;
    public final Sensor f42570b;
    public final WindowManager f42571c;
    public boolean f42575r;
    public boolean f42576s;
    public float f42577w;
    public float f42578x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f42572e = new WeakHashMap();
    public final float[] f42573f = new float[9];
    public final float[] h = new float[9];
    public final float[] f42574n = new float[3];
    public int f42579y = -1;
    public final b40 G = new b40(this, 1);

    public g6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42569a = sensorManager;
        this.f42571c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f42570b = defaultSensor;
    }

    public final void a() {
        if (this.f42575r) {
            this.f42569a.unregisterListener(this);
        }
        this.f42576s = false;
        this.f42575r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i3;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f42573f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f42571c.getDefaultDisplay().getRotation();
        if (this.f42579y != rotation) {
            this.f42576s = false;
            this.f42579y = rotation;
        }
        int i10 = this.f42579y;
        int i11 = 129;
        if (i10 == 1) {
            i3 = 129;
            i11 = 2;
        } else {
            i3 = 130;
            if (i10 != 2) {
                if (i10 == 3) {
                    i11 = 130;
                    i3 = 1;
                } else {
                    i3 = 2;
                    i11 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i11, i3, fArr3);
        float[] fArr4 = this.f42574n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f42576s) {
                this.f42577w = fArr4[1];
                this.f42578x = fArr4[2];
                this.f42576s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f42578x, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.f42577w, 6.283185307179586d)) / 0.45f));
            float f10 = this.E;
            this.E = com.google.android.recaptcha.internal.a.y(max, f10, 0.12f, f10);
            float f11 = this.F;
            this.F = com.google.android.recaptcha.internal.a.y(max2, f11, 0.12f, f11);
            for (View view : this.f42572e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
