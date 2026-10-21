package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class dy implements DownloadController.FileDownloadProgressListener {
    public long f36461a;
    public long f36462b;
    public final String f36463c;
    public final ey d;

    public dy(ey eyVar, String str) {
        this.d = eyVar;
        this.f36463c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f36462b = j10;
        this.f36461a = j11;
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
