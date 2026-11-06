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
import org.telegram.ui.Components.f40;
public final class i6 implements SensorEventListener {
    public static i6 G;
    public float D;
    public float E;
    public final SensorManager f42589a;
    public final Sensor f42590b;
    public final WindowManager f42591c;
    public boolean f42595r;
    public boolean f42596s;
    public float f42597w;
    public float f42598x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f42592e = new WeakHashMap();
    public final float[] f42593f = new float[9];
    public final float[] h = new float[9];
    public final float[] f42594n = new float[3];
    public int f42599y = -1;
    public final f40 F = new f40(this, 1);

    public i6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42589a = sensorManager;
        this.f42591c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f42590b = defaultSensor;
    }

    public final void a() {
        if (this.f42595r) {
            this.f42589a.unregisterListener(this);
        }
        this.f42596s = false;
        this.f42595r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.D = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f42593f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f42591c.getDefaultDisplay().getRotation();
        if (this.f42599y != rotation) {
            this.f42596s = false;
            this.f42599y = rotation;
        }
        int i10 = this.f42599y;
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
        float[] fArr4 = this.f42594n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f42596s) {
                this.f42597w = fArr4[1];
                this.f42598x = fArr4[2];
                this.f42596s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f42598x, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.f42597w, 6.283185307179586d)) / 0.45f));
            float f10 = this.D;
            this.D = com.google.android.recaptcha.internal.a.z(max, f10, 0.12f, f10);
            float f11 = this.E;
            this.E = com.google.android.recaptcha.internal.a.z(max2, f11, 0.12f, f11);
            for (View view : this.f42592e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
