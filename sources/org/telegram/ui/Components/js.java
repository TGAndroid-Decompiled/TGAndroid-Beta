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
    public final SensorManager f35050a;
    public final AudioManager f35051b;
    public final Sensor f35052c;
    public final Sensor d;
    public final Sensor f35053e;
    public final Sensor f35054f;
    public final PowerManager.WakeLock h;
    public boolean f35055n;
    public boolean f35056r;
    public t51 f35057s;
    public boolean f35058w;
    public long f35059x;
    public int f35060y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public js() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f25563b.getSystemService("sensor");
        this.f35050a = sensorManager;
        this.f35052c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f35053e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f35054f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f35053e = null;
            this.f35054f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f25563b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f35051b = (AudioManager) org.telegram.messenger.t0.f25563b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        t51 t51Var = this.f35057s;
        if (t51Var == null) {
            return;
        }
        if (this.f35056r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        t51Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.js.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
