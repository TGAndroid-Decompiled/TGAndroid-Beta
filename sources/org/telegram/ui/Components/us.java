package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class us implements SensorEventListener {
    public int D;
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f31072a;
    public final AudioManager f31073b;
    public final Sensor f31074c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f31075f;
    public final PowerManager.WakeLock h;
    public boolean f31076n;
    public boolean f31077r;
    public v61 f31078s;
    public boolean f31079w;
    public long f31080x;
    public int f31081y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public us() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.w0.f18945b.getSystemService("sensor");
        this.f31072a = sensorManager;
        this.f31074c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f31075f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f31075f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.w0.f18945b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f31073b = (AudioManager) org.telegram.messenger.w0.f18945b.getSystemService("audio");
    }

    public final void a() {
        int i10;
        v61 v61Var = this.f31078s;
        if (v61Var == null) {
            return;
        }
        if (this.f31077r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        v61Var.x0(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.us.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
