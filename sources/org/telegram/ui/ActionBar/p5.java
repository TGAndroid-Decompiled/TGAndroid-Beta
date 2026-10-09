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
            if (i6.h <= i6.f21030q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (i6.f20900j) {
                        i6.f20900j = false;
                        AndroidUtilities.cancelRunOnUIThread(i6.f20938l);
                    }
                    if (!i6.f20918k) {
                        i6.f20918k = true;
                        aa aaVar = i6.f20956m;
                        if (Math.abs(i6.f20881i - SystemClock.elapsedRealtime()) < 12000) {
                            j3 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(aaVar, j3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i6.f20918k) {
                i6.f20918k = false;
                AndroidUtilities.cancelRunOnUIThread(i6.f20956m);
            }
            if (!i6.f20900j) {
                i6.f20900j = true;
                aa aaVar2 = i6.f20938l;
                if (Math.abs(i6.f20881i - SystemClock.elapsedRealtime()) < 12000) {
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
