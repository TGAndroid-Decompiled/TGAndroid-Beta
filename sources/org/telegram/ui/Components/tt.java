package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tt implements SensorEventListener {
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f33138a;
    public final AudioManager f33139b;
    public final Sensor f33140c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f33141f;
    public final PowerManager.WakeLock h;
    public boolean f33142n;
    public boolean f33143r;
    public s81 f33144s;
    public boolean v;
    public long f33145w;
    public int f33146x;
    public int f33147y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public tt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f33138a = sensorManager;
        this.f33140c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f33141f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f33141f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f33139b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        s81 s81Var = this.f33144s;
        if (s81Var == null) {
            return;
        }
        if (this.f33143r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        s81Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tt.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
