package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class ys implements SensorEventListener {
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager f42463a;
    public final AudioManager f42464b;
    public final Sensor f42465c;
    public final Sensor d;
    public final Sensor f42466e;
    public final Sensor f42467f;
    public final PowerManager.WakeLock h;
    public boolean f42468n;
    public boolean f42469r;
    public i61 f42470s;
    public boolean f42471w;
    public long f42472x;
    public int f42473y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public ys() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f26895b.getSystemService("sensor");
        this.f42463a = sensorManager;
        this.f42465c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f42466e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f42467f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.s2.f26694a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f42466e = null;
            this.f42467f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f26895b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f42464b = (AudioManager) org.telegram.messenger.t0.f26895b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        i61 i61Var = this.f42470s;
        if (i61Var == null) {
            return;
        }
        if (this.f42469r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        i61Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
