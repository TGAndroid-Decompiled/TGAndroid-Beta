package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class f6 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f7 > 500.0f) {
                y6.h = 1.0f;
            } else {
                y6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (y6.h <= y6.f23589q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (y6.f23456j) {
                        y6.f23456j = false;
                        AndroidUtilities.cancelRunOnUIThread(y6.f23495l);
                    }
                    if (!y6.f23475k) {
                        y6.f23475k = true;
                        androidx.emoji2.text.n nVar = y6.f23512m;
                        if (Math.abs(y6.f23439i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (y6.f23475k) {
                y6.f23475k = false;
                AndroidUtilities.cancelRunOnUIThread(y6.f23512m);
            }
            if (!y6.f23456j) {
                y6.f23456j = true;
                androidx.emoji2.text.n nVar2 = y6.f23495l;
                if (Math.abs(y6.f23439i - SystemClock.elapsedRealtime()) < 12000) {
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
