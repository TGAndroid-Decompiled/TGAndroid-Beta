package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class ey implements DownloadController.FileDownloadProgressListener {
    public long f38040a;
    public long f38041b;
    public final String f38042c;
    public final fy d;

    public ey(fy fyVar, String str) {
        this.d = fyVar;
        this.f38042c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38041b = j10;
        this.f38040a = j11;
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
