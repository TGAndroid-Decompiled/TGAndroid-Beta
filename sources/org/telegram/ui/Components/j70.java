package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class j70 extends org.telegram.ui.Cells.va {
    public final TextView f27420a0;
    public final TextView f27421b0;

    public j70(Context context) {
        super(context, 6, 0, true);
        LinearLayout e = org.telegram.messenger.ok.e(context, 1);
        TextView textView = new TextView(context);
        this.f27420a0 = textView;
        org.telegram.messenger.g0.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, textView);
        e.addView(textView, w7.z5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f27421b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21398z6, false));
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(e, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
