package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class ws implements SensorEventListener {
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager f41764a;
    public final AudioManager f41765b;
    public final Sensor f41766c;
    public final Sensor d;
    public final Sensor f41767e;
    public final Sensor f41768f;
    public final PowerManager.WakeLock h;
    public boolean f41769n;
    public boolean f41770r;
    public f61 f41771s;
    public boolean f41772w;
    public long f41773x;
    public int f41774y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public ws() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f26915b.getSystemService("sensor");
        this.f41764a = sensorManager;
        this.f41766c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f41767e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f41768f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.s2.f26723a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f41767e = null;
            this.f41768f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f26915b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f41765b = (AudioManager) org.telegram.messenger.t0.f26915b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        f61 f61Var = this.f41771s;
        if (f61Var == null) {
            return;
        }
        if (this.f41770r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        f61Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
