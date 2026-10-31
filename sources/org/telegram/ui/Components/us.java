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
    public final SensorManager f31021a;
    public final AudioManager f31022b;
    public final Sensor f31023c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f31024f;
    public final PowerManager.WakeLock h;
    public boolean f31025n;
    public boolean f31026r;
    public u61 f31027s;
    public boolean f31028w;
    public long f31029x;
    public int f31030y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public us() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.w0.f19025b.getSystemService("sensor");
        this.f31021a = sensorManager;
        this.f31023c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f31024f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.v2.f18448a) {
                org.telegram.messenger.f8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f31024f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.w0.f19025b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f31022b = (AudioManager) org.telegram.messenger.w0.f19025b.getSystemService("audio");
    }

    public final void a() {
        int i10;
        u61 u61Var = this.f31027s;
        if (u61Var == null) {
            return;
        }
        if (this.f31026r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        u61Var.x0(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.us.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
