package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class js implements SensorEventListener {
    public int D;
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f35024a;
    public final AudioManager f35025b;
    public final Sensor f35026c;
    public final Sensor d;
    public final Sensor f35027e;
    public final Sensor f35028f;
    public final PowerManager.WakeLock h;
    public boolean f35029n;
    public boolean f35030r;
    public s51 f35031s;
    public boolean f35032w;
    public long f35033x;
    public int f35034y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public js() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f25555b.getSystemService("sensor");
        this.f35024a = sensorManager;
        this.f35026c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f35027e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f35028f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f35027e = null;
            this.f35028f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f25555b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f35025b = (AudioManager) org.telegram.messenger.t0.f25555b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        s51 s51Var = this.f35031s;
        if (s51Var == null) {
            return;
        }
        if (this.f35030r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        s51Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.js.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
