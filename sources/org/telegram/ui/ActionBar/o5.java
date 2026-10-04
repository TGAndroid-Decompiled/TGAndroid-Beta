package org.telegram.ui.ActionBar;

import ai.z9;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class o5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f7 > 500.0f) {
                i6.h = 1.0f;
            } else {
                i6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (i6.h <= i6.f21052q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (i6.f20921j) {
                        i6.f20921j = false;
                        AndroidUtilities.cancelRunOnUIThread(i6.f20960l);
                    }
                    if (!i6.f20940k) {
                        i6.f20940k = true;
                        z9 z9Var = i6.f20978m;
                        if (Math.abs(i6.f20902i - SystemClock.elapsedRealtime()) < 12000) {
                            j3 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(z9Var, j3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i6.f20940k) {
                i6.f20940k = false;
                AndroidUtilities.cancelRunOnUIThread(i6.f20978m);
            }
            if (!i6.f20921j) {
                i6.f20921j = true;
                z9 z9Var2 = i6.f20960l;
                if (Math.abs(i6.f20902i - SystemClock.elapsedRealtime()) < 12000) {
                    j3 = 12000;
                }
                AndroidUtilities.runOnUIThread(z9Var2, j3);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
