package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ag0 implements ViewSwitcher.ViewFactory {
    public final int f36479a;
    public final Object f36480b;

    public ag0(Object obj, int i9) {
        this.f36479a = i9;
        this.f36480b = obj;
    }

    @Override
    public final View makeView() {
        int i9;
        int i10 = this.f36479a;
        Object obj = this.f36480b;
        switch (i10) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                textView.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i9 = 5;
                } else {
                    i9 = 3;
                }
                textView.setGravity(i9 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                j3.r0.w(org.telegram.ui.ActionBar.f6.D6, null, false, textView2, 1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                return new ot0(photoViewer.A, photoViewer.P1, photoViewer.M, new nq0(photoViewer, 0), new xf0(photoViewer, 1));
        }
    }
}
