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
    public final SensorManager f42502a;
    public final AudioManager f42503b;
    public final Sensor f42504c;
    public final Sensor d;
    public final Sensor f42505e;
    public final Sensor f42506f;
    public final PowerManager.WakeLock h;
    public boolean f42507n;
    public boolean f42508r;
    public i61 f42509s;
    public boolean f42510w;
    public long f42511x;
    public int f42512y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public ys() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f26931b.getSystemService("sensor");
        this.f42502a = sensorManager;
        this.f42504c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f42505e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f42506f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f42505e = null;
            this.f42506f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f26931b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f42503b = (AudioManager) org.telegram.messenger.t0.f26931b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        i61 i61Var = this.f42509s;
        if (i61Var == null) {
            return;
        }
        if (this.f42508r) {
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
