package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class ps implements SensorEventListener {
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager f38395a;
    public final AudioManager f38396b;
    public final Sensor f38397c;
    public final Sensor d;
    public final Sensor f38398e;
    public final Sensor f38399f;
    public final PowerManager.WakeLock h;
    public boolean f38400n;
    public boolean f38401r;
    public u51 f38402s;
    public boolean f38403w;
    public long f38404x;
    public int f38405y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public ps() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f26600b.getSystemService("sensor");
        this.f38395a = sensorManager;
        this.f38397c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f38398e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f38399f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f38398e = null;
            this.f38399f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f26600b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f38396b = (AudioManager) org.telegram.messenger.t0.f26600b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        u51 u51Var = this.f38402s;
        if (u51Var == null) {
            return;
        }
        if (this.f38401r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        u51Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
