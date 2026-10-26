package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class er0 implements Utilities.Callback2 {
    public final int f39171a;
    public final PhotoViewer f39172b;

    public er0(PhotoViewer photoViewer, int i10) {
        this.f39171a = i10;
        this.f39172b = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39171a;
        PhotoViewer photoViewer = this.f39172b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.Z1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.E0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
