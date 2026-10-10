package org.telegram.ui.ActionBar;

import ai.aa;
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
            if (i6.h <= i6.f21034q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (i6.f20904j) {
                        i6.f20904j = false;
                        AndroidUtilities.cancelRunOnUIThread(i6.f20942l);
                    }
                    if (!i6.f20922k) {
                        i6.f20922k = true;
                        aa aaVar = i6.f20960m;
                        if (Math.abs(i6.f20885i - SystemClock.elapsedRealtime()) < 12000) {
                            j3 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(aaVar, j3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i6.f20922k) {
                i6.f20922k = false;
                AndroidUtilities.cancelRunOnUIThread(i6.f20960m);
            }
            if (!i6.f20904j) {
                i6.f20904j = true;
                aa aaVar2 = i6.f20942l;
                if (Math.abs(i6.f20885i - SystemClock.elapsedRealtime()) < 12000) {
                    j3 = 12000;
                }
                AndroidUtilities.runOnUIThread(aaVar2, j3);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
