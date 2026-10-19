package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class br0 implements Runnable {
    public final int f35729a;
    public final PhotoViewer f35730b;
    public final Bitmap f35731c;

    public br0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f35729a = i10;
        this.f35730b = photoViewer;
        this.f35731c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f35729a;
        Bitmap bitmap = this.f35731c;
        PhotoViewer photoViewer = this.f35730b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new br0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new br0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new br0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33409t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33409t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33409t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
