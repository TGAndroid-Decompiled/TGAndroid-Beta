package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mt implements SensorEventListener {
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f26369a;
    public final AudioManager f26370b;
    public final Sensor f26371c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f26372f;
    public final PowerManager.WakeLock h;
    public boolean f26373n;
    public boolean f26374r;
    public v71 f26375s;
    public boolean v;
    public long f26376w;
    public int f26377x;
    public int f26378y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public mt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f26369a = sensorManager;
        this.f26371c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f26372f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f26372f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f26370b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        v71 v71Var = this.f26375s;
        if (v71Var == null) {
            return;
        }
        if (this.f26374r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        v71Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mt.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
