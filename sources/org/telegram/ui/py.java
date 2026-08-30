package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class py implements DownloadController.FileDownloadProgressListener {
    public long f37553a;
    public long f37554b;
    public final String f37555c;
    public final qy d;

    public py(qy qyVar, String str) {
        this.d = qyVar;
        this.f37555c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37554b = j10;
        this.f37553a = j11;
        this.d.c();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
