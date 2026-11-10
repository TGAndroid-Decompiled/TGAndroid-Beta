package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public final class be0 implements ViewSwitcher.ViewFactory {
    public final int f44050a;
    public final Object f44051b;

    public be0(Object obj, int i7) {
        this.f44050a = i7;
        this.f44051b = obj;
    }

    @Override
    public final View makeView() {
        int i7;
        int i10 = this.f44050a;
        Object obj = this.f44051b;
        switch (i10) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                org.telegram.ui.ActionBar.t6.D(textView, org.telegram.ui.ActionBar.m6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.id.f23161a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                textView.setGravity(i7 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return new nq0(photoViewer.E, photoViewer.T1, photoViewer.Q, new nn0(photoViewer, 0), new wd0(photoViewer, 1));
        }
    }
}
