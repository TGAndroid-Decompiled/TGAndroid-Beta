package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class fy implements DownloadController.FileDownloadProgressListener {
    public long f37053a;
    public long f37054b;
    public final String f37055c;
    public final gy d;

    public fy(gy gyVar, String str) {
        this.d = gyVar;
        this.f37055c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37054b = j10;
        this.f37053a = j11;
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
