package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wt implements SensorEventListener {
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager f30655a;
    public final AudioManager f30656b;
    public final Sensor f30657c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f30658f;
    public final PowerManager.WakeLock h;
    public boolean f30659n;
    public boolean f30660r;
    public i81 f30661s;
    public boolean v;
    public long f30662w;
    public int f30663x;
    public int f30664y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public wt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f30655a = sensorManager;
        this.f30657c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f30658f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f30658f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f30656b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        i81 i81Var = this.f30661s;
        if (i81Var == null) {
            return;
        }
        if (this.f30660r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        i81Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wt.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
