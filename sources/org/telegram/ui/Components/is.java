package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class is implements SensorEventListener {
    public int D;
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f34725a;
    public final AudioManager f34726b;
    public final Sensor f34727c;
    public final Sensor d;
    public final Sensor f34728e;
    public final Sensor f34729f;
    public final PowerManager.WakeLock h;
    public boolean f34730n;
    public boolean f34731r;
    public t51 f34732s;
    public boolean f34733w;
    public long f34734x;
    public int f34735y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public is() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f25570b.getSystemService("sensor");
        this.f34725a = sensorManager;
        this.f34727c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f34728e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f34729f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.f25216a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f34728e = null;
            this.f34729f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f25570b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f34726b = (AudioManager) org.telegram.messenger.t0.f25570b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        t51 t51Var = this.f34732s;
        if (t51Var == null) {
            return;
        }
        if (this.f34731r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        t51Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.is.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
