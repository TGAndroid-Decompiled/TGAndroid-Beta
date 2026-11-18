package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
public final class pn0 implements org.telegram.messenger.q10 {
    public final int f50870a;
    public final PhotoViewer f50871b;

    public pn0(PhotoViewer photoViewer, int i7) {
        this.f50870a = i7;
        this.f50871b = photoViewer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f50870a;
        PhotoViewer photoViewer = this.f50871b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.V1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.w0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
