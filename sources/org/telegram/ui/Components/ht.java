package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ht implements SensorEventListener {
    public int B;
    public int C;
    public long D;
    public boolean F;
    public boolean G;
    public float I;
    public final SensorManager f27613a;
    public final AudioManager f27614b;
    public final Sensor f27615c;
    public final Sensor d;
    public final Sensor f27616e;
    public final Sensor f27617f;
    public final PowerManager.WakeLock h;
    public boolean f27618n;
    public boolean f27619r;
    public j71 f27620s;
    public boolean v;
    public long f27621w;
    public int f27622x;
    public int f27623y;
    public long E = 0;
    public float H = -100.0f;
    public final float[] J = new float[3];
    public final float[] K = new float[3];
    public final float[] L = new float[3];

    public ht() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f27613a = sensorManager;
        this.f27615c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f27616e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f27617f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f27616e = null;
            this.f27617f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f27614b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        j71 j71Var = this.f27620s;
        if (j71Var == null) {
            return;
        }
        if (this.f27619r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        j71Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
