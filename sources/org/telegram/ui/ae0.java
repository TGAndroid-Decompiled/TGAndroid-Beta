package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public final class ae0 implements ViewSwitcher.ViewFactory {
    public final int f43678a;
    public final Object f43679b;

    public ae0(Object obj, int i7) {
        this.f43678a = i7;
        this.f43679b = obj;
    }

    @Override
    public final View makeView() {
        int i7;
        int i10 = this.f43678a;
        Object obj = this.f43679b;
        switch (i10) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
                org.telegram.ui.ActionBar.s6.D(textView, org.telegram.ui.ActionBar.l6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.id.f23157a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                textView.setGravity(i7 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return new mq0(photoViewer.E, photoViewer.T1, photoViewer.Q, new mn0(photoViewer, 0), new vd0(photoViewer, 1));
        }
    }
}
