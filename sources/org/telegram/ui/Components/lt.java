package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class lt implements SensorEventListener {
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f26132a;
    public final AudioManager f26133b;
    public final Sensor f26134c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f26135f;
    public final PowerManager.WakeLock h;
    public boolean f26136n;
    public boolean f26137r;
    public u71 f26138s;
    public boolean v;
    public long f26139w;
    public int f26140x;
    public int f26141y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public lt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f26132a = sensorManager;
        this.f26134c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f26135f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f26135f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f26133b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        u71 u71Var = this.f26138s;
        if (u71Var == null) {
            return;
        }
        if (this.f26137r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        u71Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lt.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
