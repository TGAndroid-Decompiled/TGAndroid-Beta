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
                i6.h = 1.0f;
            } else {
                i6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (i6.h <= i6.f19064q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (i6.f18935j) {
                        i6.f18935j = false;
                        AndroidUtilities.cancelRunOnUIThread(i6.f18974l);
                    }
                    if (!i6.f18954k) {
                        i6.f18954k = true;
                        z9 z9Var = i6.f18992m;
                        if (Math.abs(i6.f18916i - SystemClock.elapsedRealtime()) < 12000) {
                            j3 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(z9Var, j3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i6.f18954k) {
                i6.f18954k = false;
                AndroidUtilities.cancelRunOnUIThread(i6.f18992m);
            }
            if (!i6.f18935j) {
                i6.f18935j = true;
                z9 z9Var2 = i6.f18974l;
                if (Math.abs(i6.f18916i - SystemClock.elapsedRealtime()) < 12000) {
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
