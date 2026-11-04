package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
public final class fn0 implements org.telegram.messenger.n10 {
    public final int f45312a;
    public final PhotoViewer f45313b;

    public fn0(PhotoViewer photoViewer, int i3) {
        this.f45312a = i3;
        this.f45313b = photoViewer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f45312a;
        PhotoViewer photoViewer = this.f45313b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.a2((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.E0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
