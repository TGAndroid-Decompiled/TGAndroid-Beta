package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ft implements SensorEventListener {
    public int B;
    public int C;
    public long D;
    public boolean F;
    public boolean G;
    public float I;
    public final SensorManager f24949a;
    public final AudioManager f24950b;
    public final Sensor f24951c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f24952f;
    public final PowerManager.WakeLock h;
    public boolean f24953n;
    public boolean f24954r;
    public i71 f24955s;
    public boolean v;
    public long f24956w;
    public int f24957x;
    public int f24958y;
    public long E = 0;
    public float H = -100.0f;
    public final float[] J = new float[3];
    public final float[] K = new float[3];
    public final float[] L = new float[3];

    public ft() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f24949a = sensorManager;
        this.f24951c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f24952f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f24952f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f24950b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        i71 i71Var = this.f24955s;
        if (i71Var == null) {
            return;
        }
        if (this.f24954r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        i71Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ft.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
