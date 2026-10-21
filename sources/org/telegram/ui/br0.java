package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class br0 implements Runnable {
    public final int f35736a;
    public final PhotoViewer f35737b;
    public final Bitmap f35738c;

    public br0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f35736a = i10;
        this.f35737b = photoViewer;
        this.f35738c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f35736a;
        Bitmap bitmap = this.f35738c;
        PhotoViewer photoViewer = this.f35737b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new br0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new br0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new br0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33416t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33416t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33416t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
        }
    }
}
