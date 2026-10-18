package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class fy implements DownloadController.FileDownloadProgressListener {
    public long f37023a;
    public long f37024b;
    public final String f37025c;
    public final gy d;

    public fy(gy gyVar, String str) {
        this.d = gyVar;
        this.f37025c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37024b = j10;
        this.f37023a = j11;
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
