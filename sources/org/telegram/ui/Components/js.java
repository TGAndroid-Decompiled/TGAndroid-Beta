package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class js implements SensorEventListener {
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager f35174a;
    public final AudioManager f35175b;
    public final Sensor f35176c;
    public final Sensor d;
    public final Sensor f35177e;
    public final Sensor f35178f;
    public final PowerManager.WakeLock h;
    public boolean f35179n;
    public boolean f35180r;
    public m51 f35181s;
    public boolean f35182w;
    public long f35183x;
    public int f35184y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public js() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f25457b.getSystemService("sensor");
        this.f35174a = sensorManager;
        this.f35176c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f35177e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f35178f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f35177e = null;
            this.f35178f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f25457b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f35175b = (AudioManager) org.telegram.messenger.t0.f25457b.getSystemService("audio");
    }

    public final void a() {
        int i3;
        m51 m51Var = this.f35181s;
        if (m51Var == null) {
            return;
        }
        if (this.f35180r) {
            i3 = 0;
        } else {
            i3 = 3;
        }
        m51Var.x0(i3);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.js.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
