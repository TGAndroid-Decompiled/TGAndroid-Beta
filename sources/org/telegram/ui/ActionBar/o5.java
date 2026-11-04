package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.zi;
public final class o5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f25465x && org.telegram.messenger.t0.f25464w) {
            if (f10 > 500.0f) {
                k6.h = 1.0f;
            } else {
                k6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (k6.h <= k6.f28114q) {
                MediaController B = MediaController.B();
                if (B.J) {
                    if (!B.J()) {
                        zi ziVar = B.f21348v0;
                        if (ziVar != null && (zi.S4(ziVar.f26868k) || B.f21348v0.i4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (k6.f27982j) {
                    k6.f27982j = false;
                    org.telegram.messenger.g0.r(k6.f28019l);
                }
                if (!k6.f28001k) {
                    k6.f28001k = true;
                    androidx.emoji2.text.o oVar = k6.f28038m;
                    if (Math.abs(k6.f27966i - SystemClock.elapsedRealtime()) < 12000) {
                        j10 = 12000;
                    }
                    org.telegram.messenger.g0.i3(oVar, j10);
                    return;
                }
                return;
            }
            if (k6.f28001k) {
                k6.f28001k = false;
                org.telegram.messenger.g0.r(k6.f28038m);
            }
            if (!k6.f27982j) {
                k6.f27982j = true;
                androidx.emoji2.text.o oVar2 = k6.f28019l;
                if (Math.abs(k6.f27966i - SystemClock.elapsedRealtime()) < 12000) {
                    j10 = 12000;
                }
                org.telegram.messenger.g0.i3(oVar2, j10);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
