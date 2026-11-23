package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;
public final class q5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f26939x && org.telegram.messenger.t0.f26938w) {
            if (f10 > 500.0f) {
                m6.h = 1.0f;
            } else {
                m6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (m6.h <= m6.f29614q) {
                MediaController B = MediaController.B();
                if (B.J) {
                    if (!B.J()) {
                        gj gjVar = B.f22771v0;
                        if (gjVar != null && (gj.R4(gjVar.f24213k) || B.f22771v0.h4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (m6.f29484j) {
                    m6.f29484j = false;
                    org.telegram.messenger.g0.r(m6.f29522l);
                }
                if (!m6.f29503k) {
                    m6.f29503k = true;
                    androidx.emoji2.text.o oVar = m6.f29540m;
                    if (Math.abs(m6.f29466i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.h3(oVar, j3);
                    return;
                }
                return;
            }
            if (m6.f29503k) {
                m6.f29503k = false;
                org.telegram.messenger.g0.r(m6.f29540m);
            }
            if (!m6.f29484j) {
                m6.f29484j = true;
                androidx.emoji2.text.o oVar2 = m6.f29522l;
                if (Math.abs(m6.f29466i - SystemClock.elapsedRealtime()) < 12000) {
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
