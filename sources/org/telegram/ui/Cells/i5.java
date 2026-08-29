package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.nc1;
public final class i5 extends org.telegram.ui.Components.t9 implements DownloadController.FileDownloadProgressListener {
    public RectF C;
    public RadialProgress2 D;
    public TLRPC.TL_wallPaper E;
    public int F;
    public LinearGradient G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public Paint M;
    public yb0 N;
    public int O;
    public nc1 P;
    public int Q;

    @Override
    public int getObserverTag() {
        return this.O;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f40778a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f22544id == tL_wallPaper.f22544id)) {
            if (z10) {
                this.D.setIcon(4, false, true);
            } else {
                t(tL_wallPaper2, true, z10);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        RadialProgress2 radialProgress2 = this.D;
        radialProgress2.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f40778a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f22544id == tL_wallPaper.f22544id)) && radialProgress2.f26485i.f31311q != 10) {
            t(tL_wallPaper2, false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.D.o(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f40778a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f22544id == tL_wallPaper.f22544id)) {
            t(tL_wallPaper2, false, true);
        }
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.E = tL_wallPaper;
        if (tL_wallPaper != null) {
            k(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", null, null, 0L, "png", tL_wallPaper, 1);
        } else {
            setImageDrawable(null);
        }
        u(false);
    }

    public final void t(Object obj, boolean z10, boolean z11) {
        File httpFilePath;
        String name;
        int i10 = this.F;
        RadialProgress2 radialProgress2 = this.D;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = FileLoader.getAttachFileName(tL_wallPaper.document);
            if (!TextUtils.isEmpty(name)) {
                httpFilePath = FileLoader.getInstance(i10).getPathToAttach(tL_wallPaper.document, true);
            } else {
                return;
            }
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.Q, true);
                File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true);
                name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                httpFilePath = pathToAttach;
            } else {
                httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                name = httpFilePath.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (httpFilePath.exists()) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i10).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.o(fileProgress.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void u(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f40778a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f22544id == tL_wallPaper.f22544id)) {
            t(tL_wallPaper, false, z10);
        } else {
            this.D.setIcon(4, false, z10);
        }
        super.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
