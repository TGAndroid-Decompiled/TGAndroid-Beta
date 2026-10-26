package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ir0 implements Runnable {
    public final int f40346a;
    public final PhotoViewer f40347b;
    public final Bitmap f40348c;

    public ir0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f40346a = i10;
        this.f40347b = photoViewer;
        this.f40348c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f40346a;
        Bitmap bitmap = this.f40348c;
        PhotoViewer photoViewer = this.f40347b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new ir0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new ir0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new ir0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f35783t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f35783t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f35783t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
        }
    }
}
