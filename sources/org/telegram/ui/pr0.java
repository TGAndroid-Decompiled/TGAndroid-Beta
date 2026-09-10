package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class pr0 implements Utilities.Callback2 {
    public final int f35896a;
    public final PhotoViewer f35897b;

    public pr0(PhotoViewer photoViewer, int i10) {
        this.f35896a = i10;
        this.f35897b = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35896a;
        PhotoViewer photoViewer = this.f35897b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.W1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.D0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
