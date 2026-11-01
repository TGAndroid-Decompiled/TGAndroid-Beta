package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public final class cf0 implements ViewSwitcher.ViewFactory {
    public final int f36311a;
    public final Object f36312b;

    public cf0(Object obj, int i10) {
        this.f36311a = i10;
        this.f36312b = obj;
    }

    @Override
    public final View makeView() {
        int i10;
        int i11 = this.f36311a;
        Object obj = this.f36312b;
        switch (i11) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                org.telegram.ui.ActionBar.a7.E(textView, org.telegram.ui.ActionBar.t6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.dd.X) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                return new ur0(photoViewer.E, photoViewer.T1, photoViewer.Q, new vo0(photoViewer, 0), new ze0(photoViewer, 1));
        }
    }
}
