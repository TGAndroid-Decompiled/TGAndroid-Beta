package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class dy implements DownloadController.FileDownloadProgressListener {
    public long f36460a;
    public long f36461b;
    public final String f36462c;
    public final ey d;

    public dy(ey eyVar, String str) {
        this.d = eyVar;
        this.f36462c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f36461b = j10;
        this.f36460a = j11;
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
