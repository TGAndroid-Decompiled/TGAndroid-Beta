package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class bt implements SensorEventListener {
    public int A;
    public int B;
    public long C;
    public boolean E;
    public boolean F;
    public float H;
    public final SensorManager f27216a;
    public final AudioManager f27217b;
    public final Sensor f27218c;
    public final Sensor d;
    public final Sensor f27219e;
    public final Sensor f27220f;
    public final PowerManager.WakeLock h;
    public boolean f27221n;
    public boolean f27222r;
    public x61 f27223s;
    public boolean v;
    public long f27224w;
    public int f27225x;
    public int f27226y;
    public long D = 0;
    public float G = -100.0f;
    public final float[] I = new float[3];
    public final float[] J = new float[3];
    public final float[] K = new float[3];

    public bt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f27216a = sensorManager;
        this.f27218c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f27219e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f27220f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f27219e = null;
            this.f27220f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f27217b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i10;
        x61 x61Var = this.f27223s;
        if (x61Var == null) {
            return;
        }
        if (this.f27222r) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        x61Var.T(i10);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bt.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
