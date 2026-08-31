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
    public final SensorManager f27574a;
    public final AudioManager f27575b;
    public final Sensor f27576c;
    public final Sensor d;
    public final Sensor f27577e;
    public final Sensor f27578f;
    public final PowerManager.WakeLock h;
    public boolean f27579n;
    public boolean f27580r;
    public k71 f27581s;
    public boolean v;
    public long f27582w;
    public int f27583x;
    public int f27584y;
    public long E = 0;
    public float H = -100.0f;
    public final float[] J = new float[3];
    public final float[] K = new float[3];
    public final float[] L = new float[3];

    public ht() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f27574a = sensorManager;
        this.f27576c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f27577e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f27578f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f27577e = null;
            this.f27578f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f27575b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        k71 k71Var = this.f27581s;
        if (k71Var == null) {
            return;
        }
        if (this.f27580r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        k71Var.S(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
