package org.telegram.ui;

import org.telegram.messenger.DownloadController;

public final class hy implements DownloadController.FileDownloadProgressListener {

    public long f38906a;

    public long f38907b;

    public final String f38908c;
    public final iy d;

    public hy(iy iyVar, String str) {
        this.d = iyVar;
        this.f38908c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38907b = j10;
        this.f38906a = j11;
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
