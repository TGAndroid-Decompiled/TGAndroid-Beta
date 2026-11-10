package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
public final class nn0 implements org.telegram.messenger.v10 {
    public final int f48233a;
    public final PhotoViewer f48234b;

    public nn0(PhotoViewer photoViewer, int i7) {
        this.f48233a = i7;
        this.f48234b = photoViewer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f48233a;
        PhotoViewer photoViewer = this.f48234b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.V1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.w0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
