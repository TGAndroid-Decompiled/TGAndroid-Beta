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
    public final SensorManager f42613a;
    public final Sensor f42614b;
    public final WindowManager f42615c;
    public boolean f42619r;
    public boolean f42620s;
    public float f42621w;
    public float f42622x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap f42616e = new WeakHashMap();
    public final float[] f42617f = new float[9];
    public final float[] h = new float[9];
    public final float[] f42618n = new float[3];
    public int f42623y = -1;
    public final f40 F = new f40(this, 1);

    public i6(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42613a = sensorManager;
        this.f42615c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f42614b = defaultSensor;
    }

    public final void a() {
        if (this.f42619r) {
            this.f42613a.unregisterListener(this);
        }
        this.f42620s = false;
        this.f42619r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.D = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f42617f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f42615c.getDefaultDisplay().getRotation();
        if (this.f42623y != rotation) {
            this.f42620s = false;
            this.f42623y = rotation;
        }
        int i10 = this.f42623y;
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
        float[] fArr4 = this.f42618n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.f42620s) {
                this.f42621w = fArr4[1];
                this.f42622x = fArr4[2];
                this.f42620s = true;
            }
            float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.f42622x, 6.283185307179586d)) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.f42621w, 6.283185307179586d)) / 0.45f));
            float f10 = this.D;
            this.D = com.google.android.recaptcha.internal.a.z(max, f10, 0.12f, f10);
            float f11 = this.E;
            this.E = com.google.android.recaptcha.internal.a.z(max2, f11, 0.12f, f11);
            for (View view : this.f42616e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
