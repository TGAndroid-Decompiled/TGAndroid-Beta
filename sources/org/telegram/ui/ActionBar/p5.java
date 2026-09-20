package org.telegram.ui.ActionBar;

import ai.z9;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class p5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f7 > 500.0f) {
                j6.h = 1.0f;
            } else {
                j6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (j6.h <= j6.f19326q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (j6.f19196j) {
                        j6.f19196j = false;
                        AndroidUtilities.cancelRunOnUIThread(j6.f19235l);
                    }
                    if (!j6.f19215k) {
                        j6.f19215k = true;
                        z9 z9Var = j6.f19253m;
                        if (Math.abs(j6.f19177i - SystemClock.elapsedRealtime()) < 12000) {
                            j3 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(z9Var, j3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j6.f19215k) {
                j6.f19215k = false;
                AndroidUtilities.cancelRunOnUIThread(j6.f19253m);
            }
            if (!j6.f19196j) {
                j6.f19196j = true;
                z9 z9Var2 = j6.f19235l;
                if (Math.abs(j6.f19177i - SystemClock.elapsedRealtime()) < 12000) {
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
