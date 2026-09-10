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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.xd1;
public final class k5 extends org.telegram.ui.Components.w9 implements DownloadController.FileDownloadProgressListener {
    public RectF G;
    public RadialProgress2 H;
    public TLRPC.TL_wallPaper I;
    public int J;
    public LinearGradient K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Paint Q;
    public lc0 R;
    public int S;
    public xd1 T;
    public int U;

    @Override
    public int getObserverTag() {
        return this.S;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f38680a.d.W0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f17347id == tL_wallPaper.f17347id)) {
            if (z10) {
                this.H.setIcon(4, false, true);
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
    public final void onProgressDownload(String str, long j3, long j10) {
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f38680a.d.W0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f17347id == tL_wallPaper.f17347id)) && radialProgress2.f21215i.f22080q != 10) {
            t(tL_wallPaper2, false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.H.o(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f38680a.d.W0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f17347id == tL_wallPaper.f17347id)) {
            t(tL_wallPaper2, false, true);
        }
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.I = tL_wallPaper;
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
        int i10 = this.J;
        RadialProgress2 radialProgress2 = this.H;
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
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.U, true);
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
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f38680a.d.W0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f17347id == tL_wallPaper.f17347id)) {
            t(tL_wallPaper, false, z10);
        } else {
            this.H.setIcon(4, false, z10);
        }
        super.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
