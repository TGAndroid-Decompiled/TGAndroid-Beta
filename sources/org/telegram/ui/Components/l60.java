package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class l60 extends org.telegram.ui.Cells.sa {
    public final TextView T;
    public final TextView U;

    public l60(Context context) {
        super(context, 6, 0, true);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        this.T = textView;
        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f);
        g10.addView(textView, i7.f6.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false));
        textView2.setTextSize(1, 13.0f);
        g10.addView(textView2, i7.f6.t(-2, -2, 5, 0, 1, 0, 0));
        addView(g10, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
