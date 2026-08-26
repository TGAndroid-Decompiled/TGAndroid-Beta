package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class FilterGLThread$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final FilterGLThread f$0;
    public final int f$1;
    public final int f$2;

    public FilterGLThread$$ExternalSyntheticLambda0(FilterGLThread filterGLThread, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = filterGLThread;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                FilterGLThread filterGLThread = this.f$0;
                int i2 = filterGLThread.videoWidth;
                int i3 = this.f$1;
                int i4 = this.f$2;
                if (i2 != i3 || filterGLThread.videoHeight != i4) {
                    filterGLThread.videoWidth = i3;
                    filterGLThread.videoHeight = i4;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMin = 1920;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            iMin = 720;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            iMin = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i = filterGLThread.videoWidth) > 1280 || filterGLThread.videoHeight > 1280)) {
                        filterGLThread.videoWidth = i / 2;
                        filterGLThread.videoHeight /= 2;
                    }
                    int i5 = filterGLThread.videoWidth;
                    if (i5 > iMin || filterGLThread.videoHeight > iMin) {
                        int i6 = filterGLThread.videoHeight;
                        if (i5 > i6) {
                            filterGLThread.videoHeight = (int) (i6 / (iMin / i5));
                            filterGLThread.videoWidth = iMin;
                        } else {
                            filterGLThread.videoWidth = (int) (i5 / (iMin / i6));
                            filterGLThread.videoHeight = iMin;
                        }
                    }
                    filterGLThread.renderDataSet = false;
                    filterGLThread.setRenderData();
                    filterGLThread.drawRunnable.run();
                }
                break;
            case 1:
                FilterGLThread filterGLThread2 = this.f$0;
                int i7 = this.f$1;
                int i8 = this.f$2;
                filterGLThread2.surfaceWidth = i7;
                filterGLThread2.surfaceHeight = i8;
                break;
            default:
                BlurringShader blurringShader = this.f$0.uiBlur;
                blurringShader.gradientTop = this.f$1;
                blurringShader.gradientBottom = this.f$2;
                break;
        }
    }
}
