package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class nq0 implements Utilities.Callback2 {
    public final int f40789a;
    public final PhotoViewer f40790b;

    public nq0(PhotoViewer photoViewer, int i9) {
        this.f40789a = i9;
        this.f40790b = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9 = this.f40789a;
        PhotoViewer photoViewer = this.f40790b;
        switch (i9) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.W1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.C0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
