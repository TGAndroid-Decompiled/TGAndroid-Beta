package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
public final class vs implements SensorEventListener {
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager f41421a;
    public final AudioManager f41422b;
    public final Sensor f41423c;
    public final Sensor d;
    public final Sensor f41424e;
    public final Sensor f41425f;
    public final PowerManager.WakeLock h;
    public boolean f41426n;
    public boolean f41427r;
    public h61 f41428s;
    public boolean f41429w;
    public long f41430x;
    public int f41431y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public vs() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f27013b.getSystemService("sensor");
        this.f41421a = sensorManager;
        this.f41423c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f41424e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f41425f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.s2.f26829a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f41424e = null;
            this.f41425f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.f27013b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f41422b = (AudioManager) org.telegram.messenger.t0.f27013b.getSystemService("audio");
    }

    public final void a() {
        int i7;
        h61 h61Var = this.f41428s;
        if (h61Var == null) {
            return;
        }
        if (this.f41427r) {
            i7 = 0;
        } else {
            i7 = 3;
        }
        h61Var.x0(i7);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vs.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
