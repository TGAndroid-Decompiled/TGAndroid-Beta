package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class fy implements DownloadController.FileDownloadProgressListener {
    public long f37428a;
    public long f37429b;
    public final String f37430c;
    public final gy d;

    public fy(gy gyVar, String str) {
        this.d = gyVar;
        this.f37430c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37429b = j10;
        this.f37428a = j11;
        this.d.b();
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
