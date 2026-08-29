package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class gy implements DownloadController.FileDownloadProgressListener {
    public long f38690a;
    public long f38691b;
    public final String f38692c;
    public final hy d;

    public gy(hy hyVar, String str) {
        this.d = hyVar;
        this.f38692c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38691b = j10;
        this.f38690a = j11;
        this.d.c();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
