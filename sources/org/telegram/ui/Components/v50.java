package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class v50 extends org.telegram.ui.Cells.sa {
    public final TextView f40563c0;
    public final TextView f40564d0;

    public v50(Context context) {
        super(context, 6, 0, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        this.f40563c0 = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
        g10.addView(textView, c8.na.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f40564d0 = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, null);
        textView2.setTextSize(1, 13.0f);
        g10.addView(textView2, c8.na.t(-2, -2, 5, 0, 1, 0, 0));
        addView(g10, c8.na.d(-2, -2.0f, (org.telegram.messenger.gd.f24314a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
