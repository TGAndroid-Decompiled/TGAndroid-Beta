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
    public final SensorManager f28698a;
    public final AudioManager f28699b;
    public final Sensor f28700c;
    public final Sensor d;
    public final Sensor f28701e;
    public final Sensor f28702f;
    public final PowerManager.WakeLock h;
    public boolean f28703n;
    public boolean f28704r;
    public d81 f28705s;
    public boolean v;
    public long f28706w;
    public int f28707x;
    public int f28708y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public mt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f28698a = sensorManager;
        this.f28700c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f28701e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f28702f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f28701e = null;
            this.f28702f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f28699b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        d81 d81Var = this.f28705s;
        if (d81Var == null) {
            return;
        }
        if (this.f28704r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        d81Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mt.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
