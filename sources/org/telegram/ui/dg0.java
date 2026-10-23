package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class dg0 implements ViewSwitcher.ViewFactory {
    public final int f36620a;
    public final Object f36621b;

    public dg0(Object obj, int i10) {
        this.f36620a = i10;
        this.f36621b = obj;
    }

    @Override
    public final View makeView() {
        int i10;
        int i11 = this.f36620a;
        Object obj = this.f36621b;
        switch (i11) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.ui.ActionBar.r6.F(textView, org.telegram.ui.ActionBar.k6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                return new zt0(photoViewer.E, photoViewer.T1, photoViewer.Q, new ar0(photoViewer, 0), new ag0(photoViewer, 1));
        }
    }
}
