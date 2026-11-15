package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;
public final class o5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f26617x && org.telegram.messenger.t0.f26616w) {
            if (f10 > 500.0f) {
                j6.h = 1.0f;
            } else {
                j6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (j6.h <= j6.f29082q) {
                MediaController B = MediaController.B();
                if (B.J) {
                    if (!B.J()) {
                        gj gjVar = B.f22377v0;
                        if (gjVar != null && (gj.R4(gjVar.f23819k) || B.f22377v0.h4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j6.f28952j) {
                    j6.f28952j = false;
                    org.telegram.messenger.g0.r(j6.f28990l);
                }
                if (!j6.f28971k) {
                    j6.f28971k = true;
                    androidx.emoji2.text.o oVar = j6.f29008m;
                    if (Math.abs(j6.f28934i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.i3(oVar, j3);
                    return;
                }
                return;
            }
            if (j6.f28971k) {
                j6.f28971k = false;
                org.telegram.messenger.g0.r(j6.f29008m);
            }
            if (!j6.f28952j) {
                j6.f28952j = true;
                androidx.emoji2.text.o oVar2 = j6.f28990l;
                if (Math.abs(j6.f28934i - SystemClock.elapsedRealtime()) < 12000) {
                    j3 = 12000;
                }
                org.telegram.messenger.g0.i3(oVar2, j3);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
