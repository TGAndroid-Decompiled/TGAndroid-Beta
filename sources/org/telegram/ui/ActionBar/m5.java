package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class m5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f9 = sensorEvent.values[0];
        if (f9 <= 0.0f) {
            f9 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f9 > 500.0f) {
                g6.h = 1.0f;
            } else {
                g6.h = ((float) Math.ceil((Math.log(f9) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (g6.h <= g6.f23288q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (g6.f23163j) {
                        g6.f23163j = false;
                        AndroidUtilities.cancelRunOnUIThread(g6.f23200l);
                    }
                    if (!g6.f23182k) {
                        g6.f23182k = true;
                        ab.n nVar = g6.f23217m;
                        if (Math.abs(g6.f23145i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (g6.f23182k) {
                g6.f23182k = false;
                AndroidUtilities.cancelRunOnUIThread(g6.f23217m);
            }
            if (!g6.f23163j) {
                g6.f23163j = true;
                ab.n nVar2 = g6.f23200l;
                if (Math.abs(g6.f23145i - SystemClock.elapsedRealtime()) < 12000) {
                    j10 = 12000;
                }
                AndroidUtilities.runOnUIThread(nVar2, j10);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
