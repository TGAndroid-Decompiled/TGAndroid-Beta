package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
public final class r5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f26923x && org.telegram.messenger.t0.f26922w) {
            if (f10 > 500.0f) {
                n6.h = 1.0f;
            } else {
                n6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (n6.h <= n6.f29629q) {
                MediaController B = MediaController.B();
                if (B.J) {
                    if (!B.J()) {
                        fj fjVar = B.f22743v0;
                        if (fjVar != null && (fj.R4(fjVar.f23968k) || B.f22743v0.h4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (n6.f29499j) {
                    n6.f29499j = false;
                    org.telegram.messenger.g0.r(n6.f29537l);
                }
                if (!n6.f29518k) {
                    n6.f29518k = true;
                    androidx.emoji2.text.o oVar = n6.f29555m;
                    if (Math.abs(n6.f29481i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.h3(oVar, j3);
                    return;
                }
                return;
            }
            if (n6.f29518k) {
                n6.f29518k = false;
                org.telegram.messenger.g0.r(n6.f29555m);
            }
            if (!n6.f29499j) {
                n6.f29499j = true;
                androidx.emoji2.text.o oVar2 = n6.f29537l;
                if (Math.abs(n6.f29481i - SystemClock.elapsedRealtime()) < 12000) {
                    j3 = 12000;
                }
                org.telegram.messenger.g0.h3(oVar2, j3);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
