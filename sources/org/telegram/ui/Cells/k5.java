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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.zc1;
public final class k5 extends org.telegram.ui.Components.p9 implements DownloadController.FileDownloadProgressListener {
    public RectF D;
    public RadialProgress2 E;
    public TLRPC.TL_wallPaper F;
    public int G;
    public LinearGradient H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public Paint N;
    public dc0 O;
    public int P;
    public zc1 Q;
    public int R;

    @Override
    public int getObserverTag() {
        return this.P;
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
    public final void onFailedDownload(String str, boolean z4) {
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.f40767a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19336id == tL_wallPaper.f19336id)) {
            if (z4) {
                this.E.setIcon(4, false, true);
            } else {
                t(tL_wallPaper2, true, z4);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        RadialProgress2 radialProgress2 = this.E;
        radialProgress2.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.f40767a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19336id == tL_wallPaper.f19336id)) && radialProgress2.f23117i.f29162q != 10) {
            t(tL_wallPaper2, false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.E.o(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.f40767a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19336id == tL_wallPaper.f19336id)) {
            t(tL_wallPaper2, false, true);
        }
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.F = tL_wallPaper;
        if (tL_wallPaper != null) {
            k(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", null, null, 0L, "png", tL_wallPaper, 1);
        } else {
            setImageDrawable(null);
        }
        u(false);
    }

    public final void t(Object obj, boolean z4, boolean z10) {
        File httpFilePath;
        String name;
        int i10 = this.G;
        RadialProgress2 radialProgress2 = this.E;
        boolean z11 = obj instanceof TLRPC.TL_wallPaper;
        if (!z11 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z4, z10);
            return;
        }
        if (z11) {
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
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.R, true);
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
            radialProgress2.o(1.0f, z10);
            radialProgress2.setIcon(6, z4, z10);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i10).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.o(fileProgress.floatValue(), z10);
        } else {
            radialProgress2.o(0.0f, z10);
        }
        radialProgress2.setIcon(10, z4, z10);
    }

    public final void u(boolean z4) {
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.f40767a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19336id == tL_wallPaper.f19336id)) {
            t(tL_wallPaper, false, z4);
        } else {
            this.E.setIcon(4, false, z4);
        }
        super.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
