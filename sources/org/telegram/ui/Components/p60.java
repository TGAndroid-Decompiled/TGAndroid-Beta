package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class p60 extends org.telegram.ui.Cells.za {
    public final TextView f29307a0;
    public final TextView f29308b0;

    public p60(Context context) {
        super(context, 6, 0, true);
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        TextView textView = new TextView(context);
        this.f29307a0 = textView;
        org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f);
        f7.addView(textView, w7.x5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f29308b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21061z6, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.x5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f7, w7.x5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
