package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class fr0 implements Runnable {
    public final int f34211a;
    public final PhotoViewer f34212b;
    public final Bitmap f34213c;

    public fr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f34211a = i10;
        this.f34212b = photoViewer;
        this.f34213c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f34211a;
        Bitmap bitmap = this.f34213c;
        PhotoViewer photoViewer = this.f34212b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new fr0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new fr0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new fr0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.f31818q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.f31818q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.f31818q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
