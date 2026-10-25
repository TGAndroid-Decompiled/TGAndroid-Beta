package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class dy implements DownloadController.FileDownloadProgressListener {
    public long f38946a;
    public long f38947b;
    public final String f38948c;
    public final ey d;

    public dy(ey eyVar, String str) {
        this.d = eyVar;
        this.f38948c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38947b = j10;
        this.f38946a = j11;
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
