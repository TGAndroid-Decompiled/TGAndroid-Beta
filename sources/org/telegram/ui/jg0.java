package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class jg0 implements ViewSwitcher.ViewFactory {
    public final int f38047a;
    public final Object f38048b;

    public jg0(Object obj, int i10) {
        this.f38047a = i10;
        this.f38048b = obj;
    }

    @Override
    public final View makeView() {
        int i10;
        int i11 = this.f38047a;
        Object obj = this.f38048b;
        switch (i11) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                textView.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
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
                yh.t(org.telegram.ui.ActionBar.k6.D6, null, false, textView2, 1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return new cu0(photoViewer.B, photoViewer.Q1, photoViewer.N, new ar0(photoViewer, 0), new gg0(photoViewer, 1));
        }
    }
}
