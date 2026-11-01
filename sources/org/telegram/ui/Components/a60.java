package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class a60 extends org.telegram.ui.Cells.pa {
    public final TextView f24293b0;
    public final TextView f24294c0;

    public a60(Context context) {
        super(context, 6, 0, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        this.f24293b0 = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.G6, null, 1, 16.0f);
        f7.addView(textView, w7.b6.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f24294c0 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.b6.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f7, w7.b6.d(-2, -2.0f, (org.telegram.messenger.dd.X ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
