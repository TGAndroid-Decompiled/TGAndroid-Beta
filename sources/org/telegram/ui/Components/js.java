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
    public final SensorManager f35117a;
    public final AudioManager f35118b;
    public final Sensor f35119c;
    public final Sensor d;
    public final Sensor f35120e;
    public final Sensor f35121f;
    public final PowerManager.WakeLock h;
    public boolean f35122n;
    public boolean f35123r;
    public u51 f35124s;
    public boolean f35125w;
    public long f35126x;
    public int f35127y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public js() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f25566b.getSystemService("sensor");
        this.f35117a = sensorManager;
        this.f35119c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f35120e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f35121f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.f25212a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f35120e = null;
            this.f35121f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f25566b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f35118b = (AudioManager) org.telegram.messenger.t0.f25566b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        u51 u51Var = this.f35124s;
        if (u51Var == null) {
            return;
        }
        if (this.f35123r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        u51Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.js.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
