package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class nq0 implements Utilities.Callback2 {
    public final int f40881a;
    public final PhotoViewer f40882b;

    public nq0(PhotoViewer photoViewer, int i10) {
        this.f40881a = i10;
        this.f40882b = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40881a;
        PhotoViewer photoViewer = this.f40882b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.W1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.D0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
