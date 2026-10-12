package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class n5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f7 > 500.0f) {
                g6.h = 1.0f;
            } else {
                g6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (g6.h <= g6.f20132q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (g6.f20001j) {
                        g6.f20001j = false;
                        AndroidUtilities.cancelRunOnUIThread(g6.f20040l);
                    }
                    if (!g6.f20021k) {
                        g6.f20021k = true;
                        androidx.emoji2.text.n nVar = g6.f20058m;
                        if (Math.abs(g6.f19983i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (g6.f20021k) {
                g6.f20021k = false;
                AndroidUtilities.cancelRunOnUIThread(g6.f20058m);
            }
            if (!g6.f20001j) {
                g6.f20001j = true;
                androidx.emoji2.text.n nVar2 = g6.f20040l;
                if (Math.abs(g6.f19983i - SystemClock.elapsedRealtime()) < 12000) {
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
